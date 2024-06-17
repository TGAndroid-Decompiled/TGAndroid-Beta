package org.telegram.messenger.video;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.opengl.GLES20;
import android.opengl.GLES30;
import android.opengl.GLUtils;
import android.os.Build;
import android.text.Editable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import java.io.File;
import java.io.RandomAccessFile;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.Bitmaps;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.AnimatedFileDrawable;
import org.telegram.ui.Components.BlurringShader;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.EditTextEffects;
import org.telegram.ui.Components.FilterShaders;
import org.telegram.ui.Components.Paint.PaintTypeface;
import org.telegram.ui.Components.Paint.Views.EditTextOutline;
import org.telegram.ui.Components.Paint.Views.LocationMarker;
import org.telegram.ui.Components.RLottieDrawable;

public class TextureRenderer {
    private static final String FRAGMENT_EXTERNAL_MASK_SHADER = "#extension GL_OES_EGL_image_external : require\nprecision highp float;\nvarying vec2 vTextureCoord;\nvarying vec2 MTextureCoord;\nuniform samplerExternalOES sTexture;\nuniform sampler2D sMask;\nvoid main() {\n  gl_FragColor = texture2D(sTexture, vTextureCoord) * texture2D(sMask, MTextureCoord).a;\n}\n";
    private static final String FRAGMENT_EXTERNAL_SHADER = "#extension GL_OES_EGL_image_external : require\nprecision highp float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n  gl_FragColor = texture2D(sTexture, vTextureCoord);}\n";
    private static final String FRAGMENT_MASK_SHADER = "precision highp float;\nvarying vec2 vTextureCoord;\nvarying vec2 MTextureCoord;\nuniform sampler2D sTexture;\nuniform sampler2D sMask;\nvoid main() {\n  gl_FragColor = texture2D(sTexture, vTextureCoord) * texture2D(sMask, MTextureCoord).a;\n}\n";
    private static final String FRAGMENT_SHADER = "precision highp float;\nvarying vec2 vTextureCoord;\nuniform sampler2D sTexture;\nvoid main() {\n  gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n";
    private static final String GRADIENT_FRAGMENT_SHADER = "precision highp float;\nvarying vec2 vTextureCoord;\nuniform vec4 gradientTopColor;\nuniform vec4 gradientBottomColor;\nfloat interleavedGradientNoise(vec2 n) {\n    return fract(52.9829189 * fract(.06711056 * n.x + .00583715 * n.y));\n}\nvoid main() {\n  gl_FragColor = mix(gradientTopColor, gradientBottomColor, vTextureCoord.y + (.2 * interleavedGradientNoise(gl_FragCoord.xy) - .1));\n}\n";
    private static final String VERTEX_SHADER = "uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n  gl_Position = uMVPMatrix * aPosition;\n  vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n";
    private static final String VERTEX_SHADER_300 = "#version 320 es\nuniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nin vec4 aPosition;\nin vec4 aTextureCoord;\nout vec2 vTextureCoord;\nvoid main() {\n  gl_Position = uMVPMatrix * aPosition;\n  vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n";
    private static final String VERTEX_SHADER_MASK = "uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nattribute vec4 mTextureCoord;\nvarying vec2 vTextureCoord;\nvarying vec2 MTextureCoord;\nvoid main() {\n  gl_Position = uMVPMatrix * aPosition;\n  vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n  MTextureCoord = (uSTMatrix * mTextureCoord).xy;\n}\n";
    private static final String VERTEX_SHADER_MASK_300 = "#version 320 es\nuniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nin vec4 aPosition;\nin vec4 aTextureCoord;\nin vec4 mTextureCoord;\nout vec2 vTextureCoord;\nout vec2 MTextureCoord;\nvoid main() {\n  gl_Position = uMVPMatrix * aPosition;\n  vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n  MTextureCoord = (uSTMatrix * mTextureCoord).xy;\n}\n";
    private int NUM_EXTERNAL_SHADER;
    private int NUM_FILTER_SHADER;
    private int NUM_GRADIENT_SHADER;
    private Drawable backgroundDrawable;
    private String backgroundPath;
    private FloatBuffer bitmapVerticesBuffer;
    private boolean blendEnabled;
    private BlurringShader blur;
    private int blurBlurImageHandle;
    private int blurInputTexCoordHandle;
    private int blurMaskImageHandle;
    private String blurPath;
    private int blurPositionHandle;
    private int blurShaderProgram;
    private int[] blurTexture;
    private FloatBuffer blurVerticesBuffer;
    private final MediaController.CropState cropState;
    private ArrayList<AnimatedEmojiDrawable> emojiDrawables;
    private FilterShaders filterShaders;
    private int gradientBottomColor;
    private int gradientBottomColorHandle;
    private FloatBuffer gradientTextureBuffer;
    private int gradientTopColor;
    private int gradientTopColorHandle;
    private FloatBuffer gradientVerticesBuffer;
    private int imageHeight;
    private int imageOrientation;
    private String imagePath;
    private int imageWidth;
    private boolean isPhoto;
    private int[] mProgram;
    private int mTextureID;
    private int[] maPositionHandle;
    private int[] maTextureHandle;
    private FloatBuffer maskTextureBuffer;
    private int[] maskTextureHandle;
    private ArrayList<VideoEditedInfo.MediaEntity> mediaEntities;
    private String messagePath;
    private String messageVideoMaskPath;
    private int[] mmTextureHandle;
    private int[] muMVPMatrixHandle;
    private int[] muSTMatrixHandle;
    private int originalHeight;
    private int originalWidth;
    private String paintPath;
    private int[] paintTexture;
    Path path;
    private FloatBuffer renderTextureBuffer;
    private Bitmap roundBitmap;
    private Canvas roundCanvas;
    private Path roundClipPath;
    private int simpleInputTexCoordHandle;
    private int simplePositionHandle;
    private int simpleShaderProgram;
    private int simpleSourceImageHandle;
    private Bitmap stickerBitmap;
    private Canvas stickerCanvas;
    private int[] stickerTexture;
    private int texSizeHandle;
    Paint textColorPaint;
    private FloatBuffer textureBuffer;
    private int transformedHeight;
    private int transformedWidth;
    private boolean useMatrixForImagePath;
    private FloatBuffer verticesBuffer;
    private float videoFps;
    private int videoMaskTexture;
    Paint xRefPaint;
    float[] bitmapData = {-1.0f, 1.0f, 1.0f, 1.0f, -1.0f, -1.0f, 1.0f, -1.0f};
    private float[] mMVPMatrix = new float[16];
    private float[] mSTMatrix = new float[16];
    private float[] mSTMatrixIdentity = new float[16];
    private int imagePathIndex = -1;
    private int paintPathIndex = -1;
    private int messagePathIndex = -1;
    private int backgroundPathIndex = -1;
    private final Rect roundSrc = new Rect();
    private final RectF roundDst = new RectF();
    private boolean firstFrame = true;

    public TextureRenderer(org.telegram.messenger.MediaController.SavedFilterState r29, java.lang.String r30, java.lang.String r31, java.lang.String r32, java.util.ArrayList<org.telegram.messenger.VideoEditedInfo.MediaEntity> r33, org.telegram.messenger.MediaController.CropState r34, int r35, int r36, int r37, int r38, int r39, float r40, boolean r41, java.lang.Integer r42, java.lang.Integer r43, org.telegram.ui.Stories.recorder.StoryEntry.HDRInfo r44, org.telegram.messenger.video.MediaCodecVideoConvertor.ConvertVideoParams r45) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.video.TextureRenderer.<init>(org.telegram.messenger.MediaController$SavedFilterState, java.lang.String, java.lang.String, java.lang.String, java.util.ArrayList, org.telegram.messenger.MediaController$CropState, int, int, int, int, int, float, boolean, java.lang.Integer, java.lang.Integer, org.telegram.ui.Stories.recorder.StoryEntry$HDRInfo, org.telegram.messenger.video.MediaCodecVideoConvertor$ConvertVideoParams):void");
    }

    public int getTextureId() {
        return this.mTextureID;
    }

    private void drawBackground() {
        int i = this.NUM_GRADIENT_SHADER;
        if (i >= 0) {
            GLES20.glUseProgram(this.mProgram[i]);
            GLES20.glVertexAttribPointer(this.maPositionHandle[this.NUM_GRADIENT_SHADER], 2, 5126, false, 8, (Buffer) this.gradientVerticesBuffer);
            GLES20.glEnableVertexAttribArray(this.maPositionHandle[this.NUM_GRADIENT_SHADER]);
            GLES20.glVertexAttribPointer(this.maTextureHandle[this.NUM_GRADIENT_SHADER], 2, 5126, false, 8, (Buffer) this.gradientTextureBuffer);
            GLES20.glEnableVertexAttribArray(this.maTextureHandle[this.NUM_GRADIENT_SHADER]);
            GLES20.glUniformMatrix4fv(this.muSTMatrixHandle[this.NUM_GRADIENT_SHADER], 1, false, this.mSTMatrix, 0);
            GLES20.glUniformMatrix4fv(this.muMVPMatrixHandle[this.NUM_GRADIENT_SHADER], 1, false, this.mMVPMatrix, 0);
            GLES20.glUniform4f(this.gradientTopColorHandle, Color.red(this.gradientTopColor) / 255.0f, Color.green(this.gradientTopColor) / 255.0f, Color.blue(this.gradientTopColor) / 255.0f, Color.alpha(this.gradientTopColor) / 255.0f);
            GLES20.glUniform4f(this.gradientBottomColorHandle, Color.red(this.gradientBottomColor) / 255.0f, Color.green(this.gradientBottomColor) / 255.0f, Color.blue(this.gradientBottomColor) / 255.0f, Color.alpha(this.gradientBottomColor) / 255.0f);
            GLES20.glDrawArrays(5, 0, 4);
            return;
        }
        if (this.backgroundPathIndex >= 0) {
            GLES20.glUseProgram(this.simpleShaderProgram);
            GLES20.glActiveTexture(33984);
            GLES20.glUniform1i(this.simpleSourceImageHandle, 0);
            GLES20.glEnableVertexAttribArray(this.simpleInputTexCoordHandle);
            GLES20.glVertexAttribPointer(this.simpleInputTexCoordHandle, 2, 5126, false, 8, (Buffer) this.textureBuffer);
            GLES20.glEnableVertexAttribArray(this.simplePositionHandle);
            drawTexture(true, this.paintTexture[this.backgroundPathIndex], -10000.0f, -10000.0f, -10000.0f, -10000.0f, 0.0f, false, false, -1);
        }
    }

    public void drawFrame(SurfaceTexture surfaceTexture, long j) {
        int i;
        float[] fArr;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int[] iArr;
        if (this.isPhoto) {
            drawBackground();
            i4 = 0;
        } else {
            surfaceTexture.getTransformMatrix(this.mSTMatrix);
            if (BuildVars.LOGS_ENABLED && this.firstFrame) {
                StringBuilder sb = new StringBuilder();
                int i8 = 0;
                while (true) {
                    float[] fArr2 = this.mSTMatrix;
                    if (i8 >= fArr2.length) {
                        break;
                    }
                    sb.append(fArr2[i8]);
                    sb.append(", ");
                    i8++;
                }
                FileLog.d("stMatrix = " + ((Object) sb));
                this.firstFrame = false;
            }
            if (this.blendEnabled) {
                GLES20.glDisable(3042);
                this.blendEnabled = false;
            }
            FilterShaders filterShaders = this.filterShaders;
            if (filterShaders != null) {
                filterShaders.onVideoFrameUpdate(this.mSTMatrix);
                GLES20.glViewport(0, 0, this.originalWidth, this.originalHeight);
                this.filterShaders.drawSkinSmoothPass();
                this.filterShaders.drawEnhancePass();
                this.filterShaders.drawSharpenPass();
                this.filterShaders.drawCustomParamsPass();
                boolean drawBlurPass = this.filterShaders.drawBlurPass();
                GLES20.glBindFramebuffer(36160, 0);
                int i9 = this.transformedWidth;
                if (i9 != this.originalWidth || this.transformedHeight != this.originalHeight) {
                    GLES20.glViewport(0, 0, i9, this.transformedHeight);
                }
                int renderTexture = this.filterShaders.getRenderTexture(!drawBlurPass ? 1 : 0);
                int i10 = this.NUM_FILTER_SHADER;
                fArr = this.mSTMatrixIdentity;
                i2 = i10;
                i3 = renderTexture;
                i4 = drawBlurPass ? 1 : 0;
                i = 3553;
            } else {
                int i11 = this.mTextureID;
                int i12 = this.NUM_EXTERNAL_SHADER;
                i = 36197;
                fArr = this.mSTMatrix;
                i2 = i12;
                i3 = i11;
                i4 = 0;
            }
            drawBackground();
            GLES20.glUseProgram(this.mProgram[i2]);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(i, i3);
            if (this.messageVideoMaskPath != null && this.videoMaskTexture != -1) {
                GLES20.glActiveTexture(33985);
                GLES20.glBindTexture(3553, this.videoMaskTexture);
                GLES20.glUniform1i(this.maskTextureHandle[i2], 1);
            }
            GLES20.glVertexAttribPointer(this.maPositionHandle[i2], 2, 5126, false, 8, (Buffer) this.verticesBuffer);
            GLES20.glEnableVertexAttribArray(this.maPositionHandle[i2]);
            GLES20.glVertexAttribPointer(this.maTextureHandle[i2], 2, 5126, false, 8, (Buffer) this.renderTextureBuffer);
            GLES20.glEnableVertexAttribArray(this.maTextureHandle[i2]);
            if (this.messageVideoMaskPath != null && this.videoMaskTexture != -1) {
                GLES20.glVertexAttribPointer(this.mmTextureHandle[i2], 2, 5126, false, 8, (Buffer) this.maskTextureBuffer);
                GLES20.glEnableVertexAttribArray(this.mmTextureHandle[i2]);
            }
            int i13 = this.texSizeHandle;
            if (i13 != 0) {
                GLES20.glUniform2f(i13, this.transformedWidth, this.transformedHeight);
            }
            GLES20.glUniformMatrix4fv(this.muSTMatrixHandle[i2], 1, false, fArr, 0);
            GLES20.glUniformMatrix4fv(this.muMVPMatrixHandle[i2], 1, false, this.mMVPMatrix, 0);
            GLES20.glDrawArrays(5, 0, 4);
        }
        if (this.blur != null) {
            if (!this.blendEnabled) {
                GLES20.glEnable(3042);
                GLES20.glBlendFunc(1, 771);
                this.blendEnabled = true;
            }
            if (this.imagePath != null && (iArr = this.paintTexture) != null) {
                i5 = iArr[0];
                i6 = this.imageWidth;
                i7 = this.imageHeight;
            } else {
                FilterShaders filterShaders2 = this.filterShaders;
                if (filterShaders2 != null) {
                    i5 = filterShaders2.getRenderTexture(i4 ^ 1);
                    i6 = this.filterShaders.getRenderBufferWidth();
                    i7 = this.filterShaders.getRenderBufferHeight();
                } else {
                    i5 = -1;
                    i6 = 1;
                    i7 = 1;
                }
            }
            if (i5 != -1) {
                this.blur.draw(null, i5, i6, i7);
                GLES20.glViewport(0, 0, this.transformedWidth, this.transformedHeight);
                GLES20.glBindFramebuffer(36160, 0);
                GLES20.glUseProgram(this.blurShaderProgram);
                GLES20.glEnableVertexAttribArray(this.blurInputTexCoordHandle);
                GLES20.glVertexAttribPointer(this.blurInputTexCoordHandle, 2, 5126, false, 8, (Buffer) this.gradientTextureBuffer);
                GLES20.glEnableVertexAttribArray(this.blurPositionHandle);
                GLES20.glVertexAttribPointer(this.blurPositionHandle, 2, 5126, false, 8, (Buffer) this.blurVerticesBuffer);
                GLES20.glUniform1i(this.blurBlurImageHandle, 0);
                GLES20.glActiveTexture(33984);
                GLES20.glBindTexture(3553, this.blur.getTexture());
                GLES20.glUniform1i(this.blurMaskImageHandle, 1);
                GLES20.glActiveTexture(33985);
                GLES20.glBindTexture(3553, this.blurTexture[0]);
                GLES20.glDrawArrays(5, 0, 4);
            }
        }
        if (this.isPhoto || this.paintTexture != null || this.stickerTexture != null) {
            GLES20.glUseProgram(this.simpleShaderProgram);
            GLES20.glActiveTexture(33984);
            GLES20.glUniform1i(this.simpleSourceImageHandle, 0);
            GLES20.glEnableVertexAttribArray(this.simpleInputTexCoordHandle);
            GLES20.glVertexAttribPointer(this.simpleInputTexCoordHandle, 2, 5126, false, 8, (Buffer) this.textureBuffer);
            GLES20.glEnableVertexAttribArray(this.simplePositionHandle);
        }
        int i14 = this.imagePathIndex;
        if (i14 >= 0) {
            drawTexture(true, this.paintTexture[i14], -10000.0f, -10000.0f, -10000.0f, -10000.0f, 0.0f, false, this.useMatrixForImagePath && this.isPhoto, -1);
        }
        int i15 = this.paintPathIndex;
        if (i15 >= 0) {
            drawTexture(true, this.paintTexture[i15], -10000.0f, -10000.0f, -10000.0f, -10000.0f, 0.0f, false, false, -1);
        }
        int i16 = this.messagePathIndex;
        if (i16 >= 0) {
            drawTexture(true, this.paintTexture[i16], -10000.0f, -10000.0f, -10000.0f, -10000.0f, 0.0f, false, false, -1);
        }
        if (this.stickerTexture != null) {
            int size = this.mediaEntities.size();
            for (int i17 = 0; i17 < size; i17++) {
                drawEntity(this.mediaEntities.get(i17), this.mediaEntities.get(i17).color, j);
            }
        }
        GLES20.glFinish();
    }

    private void drawEntity(VideoEditedInfo.MediaEntity mediaEntity, int i, long j) {
        VideoEditedInfo.MediaEntity mediaEntity2;
        Bitmap bitmap;
        long j2;
        long j3;
        long clamp;
        int i2;
        int i3;
        TextureRenderer textureRenderer = this;
        long j4 = mediaEntity.ptr;
        if (j4 != 0) {
            Bitmap bitmap2 = mediaEntity.bitmap;
            if (bitmap2 == null || (i2 = mediaEntity.W) <= 0 || (i3 = mediaEntity.H) <= 0) {
                return;
            }
            RLottieDrawable.getFrame(j4, (int) mediaEntity.currentFrame, bitmap2, i2, i3, bitmap2.getRowBytes(), true);
            textureRenderer.applyRoundRadius(mediaEntity, mediaEntity.bitmap, (mediaEntity.subType & 8) != 0 ? i : 0);
            GLES20.glBindTexture(3553, textureRenderer.stickerTexture[0]);
            GLUtils.texImage2D(3553, 0, mediaEntity.bitmap, 0);
            float f = mediaEntity.currentFrame + mediaEntity.framesPerDraw;
            mediaEntity.currentFrame = f;
            if (f >= mediaEntity.metadata[0]) {
                mediaEntity.currentFrame = 0.0f;
            }
            drawTexture(false, textureRenderer.stickerTexture[0], mediaEntity.x, mediaEntity.y, mediaEntity.width, mediaEntity.height, mediaEntity.rotation, (mediaEntity.subType & 2) != 0);
            return;
        }
        if (mediaEntity.animatedFileDrawable != null) {
            float f2 = mediaEntity.currentFrame;
            int i4 = (int) f2;
            float f3 = 1.0f;
            if (mediaEntity.type == 5) {
                if (textureRenderer.isPhoto) {
                    j3 = mediaEntity.roundDuration;
                    j2 = 0;
                } else {
                    j2 = mediaEntity.roundOffset;
                    j3 = (mediaEntity.roundRight - mediaEntity.roundLeft) + j2;
                }
                long j5 = j / 1000000;
                if (j5 < j2) {
                    f3 = CubicBezierInterpolator.EASE_OUT_QUINT.getInterpolation(Utilities.clamp(1.0f - (((float) (j2 - j5)) / 400.0f), 1.0f, 0.0f));
                } else if (j5 > j3) {
                    f3 = CubicBezierInterpolator.EASE_OUT_QUINT.getInterpolation(Utilities.clamp(1.0f - (((float) (j5 - j3)) / 400.0f), 1.0f, 0.0f));
                }
                textureRenderer = this;
                if (f3 > 0.0f) {
                    if (textureRenderer.isPhoto) {
                        clamp = Utilities.clamp(j5, mediaEntity.roundDuration, 0L);
                    } else {
                        clamp = Utilities.clamp((j5 - mediaEntity.roundOffset) + mediaEntity.roundLeft, mediaEntity.roundDuration, 0L);
                    }
                    while (!mediaEntity.looped && mediaEntity.animatedFileDrawable.getProgressMs() < Math.min(clamp, mediaEntity.animatedFileDrawable.getDurationMs())) {
                        int progressMs = mediaEntity.animatedFileDrawable.getProgressMs();
                        mediaEntity.animatedFileDrawable.getNextFrame(false);
                        if (mediaEntity.animatedFileDrawable.getProgressMs() <= progressMs && (mediaEntity.animatedFileDrawable.getProgressMs() != 0 || progressMs != 0)) {
                            mediaEntity.looped = true;
                            break;
                        }
                    }
                }
            } else {
                float f4 = f2 + mediaEntity.framesPerDraw;
                mediaEntity.currentFrame = f4;
                for (int i5 = (int) f4; i4 != i5; i5--) {
                    mediaEntity.animatedFileDrawable.getNextFrame(true);
                }
            }
            Bitmap backgroundBitmap = mediaEntity.animatedFileDrawable.getBackgroundBitmap();
            if (backgroundBitmap != null) {
                if (mediaEntity.type == 5) {
                    if (textureRenderer.roundBitmap == null) {
                        int min = Math.min(backgroundBitmap.getWidth(), backgroundBitmap.getHeight());
                        textureRenderer.roundBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
                        textureRenderer.roundCanvas = new Canvas(textureRenderer.roundBitmap);
                    }
                    Bitmap bitmap3 = textureRenderer.roundBitmap;
                    if (bitmap3 != null) {
                        bitmap3.eraseColor(0);
                        textureRenderer.roundCanvas.save();
                        if (textureRenderer.roundClipPath == null) {
                            textureRenderer.roundClipPath = new Path();
                        }
                        textureRenderer.roundClipPath.rewind();
                        textureRenderer.roundClipPath.addCircle(textureRenderer.roundBitmap.getWidth() / 2.0f, textureRenderer.roundBitmap.getHeight() / 2.0f, (textureRenderer.roundBitmap.getWidth() / 2.0f) * f3, Path.Direction.CW);
                        textureRenderer.roundCanvas.clipPath(textureRenderer.roundClipPath);
                        if (backgroundBitmap.getWidth() >= backgroundBitmap.getHeight()) {
                            textureRenderer.roundSrc.set((backgroundBitmap.getWidth() - backgroundBitmap.getHeight()) / 2, 0, backgroundBitmap.getWidth() - ((backgroundBitmap.getWidth() - backgroundBitmap.getHeight()) / 2), backgroundBitmap.getHeight());
                        } else {
                            textureRenderer.roundSrc.set(0, (backgroundBitmap.getHeight() - backgroundBitmap.getWidth()) / 2, backgroundBitmap.getWidth(), backgroundBitmap.getHeight() - ((backgroundBitmap.getHeight() - backgroundBitmap.getWidth()) / 2));
                        }
                        textureRenderer.roundDst.set(0.0f, 0.0f, textureRenderer.roundBitmap.getWidth(), textureRenderer.roundBitmap.getHeight());
                        textureRenderer.roundCanvas.drawBitmap(backgroundBitmap, textureRenderer.roundSrc, textureRenderer.roundDst, (Paint) null);
                        textureRenderer.roundCanvas.restore();
                    }
                    bitmap = textureRenderer.roundBitmap;
                } else {
                    if (textureRenderer.stickerCanvas == null && textureRenderer.stickerBitmap != null) {
                        textureRenderer.stickerCanvas = new Canvas(textureRenderer.stickerBitmap);
                        if (textureRenderer.stickerBitmap.getHeight() != backgroundBitmap.getHeight() || textureRenderer.stickerBitmap.getWidth() != backgroundBitmap.getWidth()) {
                            textureRenderer.stickerCanvas.scale(textureRenderer.stickerBitmap.getWidth() / backgroundBitmap.getWidth(), textureRenderer.stickerBitmap.getHeight() / backgroundBitmap.getHeight());
                        }
                    }
                    Bitmap bitmap4 = textureRenderer.stickerBitmap;
                    if (bitmap4 != null) {
                        bitmap4.eraseColor(0);
                        textureRenderer.stickerCanvas.drawBitmap(backgroundBitmap, 0.0f, 0.0f, (Paint) null);
                        textureRenderer.applyRoundRadius(mediaEntity, textureRenderer.stickerBitmap, (mediaEntity.subType & 8) != 0 ? i : 0);
                    }
                    bitmap = textureRenderer.stickerBitmap;
                }
                if (bitmap != null) {
                    GLES20.glBindTexture(3553, textureRenderer.stickerTexture[0]);
                    GLUtils.texImage2D(3553, 0, bitmap, 0);
                    drawTexture(false, textureRenderer.stickerTexture[0], mediaEntity.x, mediaEntity.y, mediaEntity.width, mediaEntity.height, mediaEntity.rotation, (mediaEntity.subType & 2) != 0);
                    return;
                }
                return;
            }
            return;
        }
        if (mediaEntity.bitmap != null) {
            GLES20.glBindTexture(3553, textureRenderer.stickerTexture[0]);
            GLUtils.texImage2D(3553, 0, mediaEntity.bitmap, 0);
            int i6 = textureRenderer.stickerTexture[0];
            float f5 = mediaEntity.x;
            float f6 = mediaEntity.additionalWidth;
            float f7 = f5 - (f6 / 2.0f);
            float f8 = mediaEntity.y;
            float f9 = mediaEntity.additionalHeight;
            drawTexture(false, i6, f7, f8 - (f9 / 2.0f), mediaEntity.width + f6, f9 + mediaEntity.height, mediaEntity.rotation, mediaEntity.type == 2 && (mediaEntity.subType & 2) != 0);
        }
        ArrayList<VideoEditedInfo.EmojiEntity> arrayList = mediaEntity.entities;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        for (int i7 = 0; i7 < mediaEntity.entities.size(); i7++) {
            VideoEditedInfo.EmojiEntity emojiEntity = mediaEntity.entities.get(i7);
            if (emojiEntity != null && (mediaEntity2 = emojiEntity.entity) != null) {
                textureRenderer.drawEntity(mediaEntity2, mediaEntity.color, j);
            }
        }
    }

    private void applyRoundRadius(VideoEditedInfo.MediaEntity mediaEntity, Bitmap bitmap, int i) {
        if (bitmap == null || mediaEntity == null) {
            return;
        }
        if (mediaEntity.roundRadius == 0.0f && i == 0) {
            return;
        }
        if (mediaEntity.roundRadiusCanvas == null) {
            mediaEntity.roundRadiusCanvas = new Canvas(bitmap);
        }
        if (mediaEntity.roundRadius != 0.0f) {
            if (this.path == null) {
                this.path = new Path();
            }
            if (this.xRefPaint == null) {
                Paint paint = new Paint(1);
                this.xRefPaint = paint;
                paint.setColor(-16777216);
                this.xRefPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            }
            float min = Math.min(bitmap.getWidth(), bitmap.getHeight()) * mediaEntity.roundRadius;
            this.path.rewind();
            this.path.addRoundRect(new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight()), min, min, Path.Direction.CCW);
            this.path.toggleInverseFillType();
            mediaEntity.roundRadiusCanvas.drawPath(this.path, this.xRefPaint);
        }
        if (i != 0) {
            if (this.textColorPaint == null) {
                Paint paint2 = new Paint(1);
                this.textColorPaint = paint2;
                paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
            }
            this.textColorPaint.setColor(i);
            mediaEntity.roundRadiusCanvas.drawRect(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight(), this.textColorPaint);
        }
    }

    private void drawTexture(boolean z, int i) {
        drawTexture(z, i, -10000.0f, -10000.0f, -10000.0f, -10000.0f, 0.0f, false);
    }

    private void drawTexture(boolean z, int i, float f, float f2, float f3, float f4, float f5, boolean z2) {
        drawTexture(z, i, f, f2, f3, f4, f5, z2, false, -1);
    }

    private void drawTexture(boolean z, int i, float f, float f2, float f3, float f4, float f5, boolean z2, boolean z3, int i2) {
        if (!this.blendEnabled) {
            GLES20.glEnable(3042);
            GLES20.glBlendFunc(1, 771);
            this.blendEnabled = true;
        }
        if (f <= -10000.0f) {
            float[] fArr = this.bitmapData;
            fArr[0] = -1.0f;
            fArr[1] = 1.0f;
            fArr[2] = 1.0f;
            fArr[3] = 1.0f;
            fArr[4] = -1.0f;
            fArr[5] = -1.0f;
            fArr[6] = 1.0f;
            fArr[7] = -1.0f;
        } else {
            float f6 = (f * 2.0f) - 1.0f;
            float f7 = ((1.0f - f2) * 2.0f) - 1.0f;
            float[] fArr2 = this.bitmapData;
            fArr2[0] = f6;
            fArr2[1] = f7;
            float f8 = (f3 * 2.0f) + f6;
            fArr2[2] = f8;
            fArr2[3] = f7;
            fArr2[4] = f6;
            float f9 = f7 - (f4 * 2.0f);
            fArr2[5] = f9;
            fArr2[6] = f8;
            fArr2[7] = f9;
        }
        float[] fArr3 = this.bitmapData;
        float f10 = (fArr3[0] + fArr3[2]) / 2.0f;
        if (z2) {
            float f11 = fArr3[2];
            fArr3[2] = fArr3[0];
            fArr3[0] = f11;
            float f12 = fArr3[6];
            fArr3[6] = fArr3[4];
            fArr3[4] = f12;
        }
        if (f5 != 0.0f) {
            float f13 = this.transformedWidth / this.transformedHeight;
            float f14 = (fArr3[5] + fArr3[1]) / 2.0f;
            int i3 = 0;
            for (int i4 = 4; i3 < i4; i4 = 4) {
                float[] fArr4 = this.bitmapData;
                int i5 = i3 * 2;
                float f15 = fArr4[i5] - f10;
                int i6 = i5 + 1;
                float f16 = (fArr4[i6] - f14) / f13;
                double d = f15;
                double d2 = f5;
                double cos = Math.cos(d2);
                Double.isNaN(d);
                double d3 = f16;
                double sin = Math.sin(d2);
                Double.isNaN(d3);
                fArr4[i5] = ((float) ((cos * d) - (sin * d3))) + f10;
                float[] fArr5 = this.bitmapData;
                double sin2 = Math.sin(d2);
                Double.isNaN(d);
                double cos2 = Math.cos(d2);
                Double.isNaN(d3);
                fArr5[i6] = (((float) ((d * sin2) + (d3 * cos2))) * f13) + f14;
                i3++;
            }
        }
        this.bitmapVerticesBuffer.put(this.bitmapData).position(0);
        GLES20.glVertexAttribPointer(this.simplePositionHandle, 2, 5126, false, 8, (Buffer) (z3 ? this.verticesBuffer : this.bitmapVerticesBuffer));
        GLES20.glEnableVertexAttribArray(this.simpleInputTexCoordHandle);
        GLES20.glVertexAttribPointer(this.simpleInputTexCoordHandle, 2, 5126, false, 8, (Buffer) (z3 ? this.renderTextureBuffer : this.textureBuffer));
        if (z) {
            GLES20.glBindTexture(3553, i);
        }
        GLES20.glDrawArrays(5, 0, 4);
    }

    public void setBreakStrategy(EditTextOutline editTextOutline) {
        editTextOutline.setBreakStrategy(0);
    }

    @android.annotation.SuppressLint({"WrongConstant"})
    public void surfaceCreated() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.video.TextureRenderer.surfaceCreated():void");
    }

    private void initTextEntity(final VideoEditedInfo.MediaEntity mediaEntity) {
        int i;
        Typeface typeface;
        final EditTextOutline editTextOutline = new EditTextOutline(ApplicationLoader.applicationContext);
        editTextOutline.getPaint().setAntiAlias(true);
        editTextOutline.drawAnimatedEmojiDrawables = false;
        editTextOutline.setBackgroundColor(0);
        editTextOutline.setPadding(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f));
        PaintTypeface paintTypeface = mediaEntity.textTypeface;
        if (paintTypeface != null && (typeface = paintTypeface.getTypeface()) != null) {
            editTextOutline.setTypeface(typeface);
        }
        editTextOutline.setTextSize(0, mediaEntity.fontSize);
        SpannableString spannableString = new SpannableString(mediaEntity.text);
        Iterator<VideoEditedInfo.EmojiEntity> it = mediaEntity.entities.iterator();
        while (it.hasNext()) {
            final VideoEditedInfo.EmojiEntity next = it.next();
            if (next.documentAbsolutePath != null) {
                VideoEditedInfo.MediaEntity mediaEntity2 = new VideoEditedInfo.MediaEntity();
                next.entity = mediaEntity2;
                mediaEntity2.text = next.documentAbsolutePath;
                mediaEntity2.subType = next.subType;
                AnimatedEmojiSpan animatedEmojiSpan = new AnimatedEmojiSpan(0L, 1.0f, editTextOutline.getPaint().getFontMetricsInt()) {
                    @Override
                    public void draw(Canvas canvas, CharSequence charSequence, int i2, int i3, float f, int i4, int i5, int i6, Paint paint) {
                        super.draw(canvas, charSequence, i2, i3, f, i4, i5, i6, paint);
                        VideoEditedInfo.MediaEntity mediaEntity3 = mediaEntity;
                        float paddingLeft = mediaEntity.x + ((((editTextOutline.getPaddingLeft() + f) + (this.measuredSize / 2.0f)) / mediaEntity3.viewWidth) * mediaEntity3.width);
                        float f2 = mediaEntity3.y;
                        VideoEditedInfo.MediaEntity mediaEntity4 = mediaEntity;
                        float paddingTop = ((editTextOutline.getPaddingTop() + i4) + ((i6 - i4) / 2.0f)) / mediaEntity4.viewHeight;
                        float f3 = mediaEntity4.height;
                        float f4 = f2 + (paddingTop * f3);
                        if (mediaEntity4.rotation != 0.0f) {
                            float f5 = mediaEntity4.x + (mediaEntity4.width / 2.0f);
                            float f6 = mediaEntity4.y + (f3 / 2.0f);
                            float f7 = TextureRenderer.this.transformedWidth / TextureRenderer.this.transformedHeight;
                            double d = paddingLeft - f5;
                            double cos = Math.cos(-mediaEntity.rotation);
                            Double.isNaN(d);
                            double d2 = (f4 - f6) / f7;
                            double sin = Math.sin(-mediaEntity.rotation);
                            Double.isNaN(d2);
                            float f8 = f5 + ((float) ((cos * d) - (sin * d2)));
                            double sin2 = Math.sin(-mediaEntity.rotation);
                            Double.isNaN(d);
                            double d3 = d * sin2;
                            double cos2 = Math.cos(-mediaEntity.rotation);
                            Double.isNaN(d2);
                            f4 = (((float) (d3 + (d2 * cos2))) * f7) + f6;
                            paddingLeft = f8;
                        }
                        VideoEditedInfo.MediaEntity mediaEntity5 = next.entity;
                        int i7 = this.measuredSize;
                        VideoEditedInfo.MediaEntity mediaEntity6 = mediaEntity;
                        float f9 = (i7 / mediaEntity6.viewWidth) * mediaEntity6.width;
                        mediaEntity5.width = f9;
                        float f10 = (i7 / mediaEntity6.viewHeight) * mediaEntity6.height;
                        mediaEntity5.height = f10;
                        mediaEntity5.x = paddingLeft - (f9 / 2.0f);
                        mediaEntity5.y = f4 - (f10 / 2.0f);
                        mediaEntity5.rotation = mediaEntity6.rotation;
                        if (mediaEntity5.bitmap == null) {
                            TextureRenderer.this.initStickerEntity(mediaEntity5);
                        }
                    }
                };
                int i2 = next.offset;
                spannableString.setSpan(animatedEmojiSpan, i2, next.length + i2, 33);
            }
        }
        editTextOutline.setText(Emoji.replaceEmoji((CharSequence) spannableString, editTextOutline.getPaint().getFontMetricsInt(), (int) (editTextOutline.getTextSize() * 0.8f), false));
        editTextOutline.setTextColor(mediaEntity.color);
        Editable text = editTextOutline.getText();
        if (text instanceof Spanned) {
            for (Emoji.EmojiSpan emojiSpan : (Emoji.EmojiSpan[]) text.getSpans(0, text.length(), Emoji.EmojiSpan.class)) {
                emojiSpan.scale = 0.85f;
            }
        }
        int i3 = mediaEntity.textAlign;
        editTextOutline.setGravity(i3 != 1 ? i3 != 2 ? 19 : 21 : 17);
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 17) {
            int i5 = mediaEntity.textAlign;
            if (i5 != 1) {
                i = (i5 == 2 ? !LocaleController.isRTL : LocaleController.isRTL) ? 3 : 2;
            } else {
                i = 4;
            }
            editTextOutline.setTextAlignment(i);
        }
        editTextOutline.setHorizontallyScrolling(false);
        editTextOutline.setImeOptions(268435456);
        editTextOutline.setFocusableInTouchMode(true);
        editTextOutline.setInputType(editTextOutline.getInputType() | LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD_NOT_PREMIUM);
        if (i4 >= 23) {
            setBreakStrategy(editTextOutline);
        }
        byte b = mediaEntity.subType;
        if (b == 0) {
            editTextOutline.setFrameColor(mediaEntity.color);
            editTextOutline.setTextColor(AndroidUtilities.computePerceivedBrightness(mediaEntity.color) < 0.721f ? -1 : -16777216);
        } else if (b == 1) {
            editTextOutline.setFrameColor(AndroidUtilities.computePerceivedBrightness(mediaEntity.color) >= 0.25f ? -1728053248 : -1711276033);
            editTextOutline.setTextColor(mediaEntity.color);
        } else if (b == 2) {
            editTextOutline.setFrameColor(AndroidUtilities.computePerceivedBrightness(mediaEntity.color) < 0.25f ? -1 : -16777216);
            editTextOutline.setTextColor(mediaEntity.color);
        } else if (b == 3) {
            editTextOutline.setFrameColor(0);
            editTextOutline.setTextColor(mediaEntity.color);
        }
        editTextOutline.measure(View.MeasureSpec.makeMeasureSpec(mediaEntity.viewWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(mediaEntity.viewHeight, 1073741824));
        editTextOutline.layout(0, 0, mediaEntity.viewWidth, mediaEntity.viewHeight);
        mediaEntity.bitmap = Bitmap.createBitmap(mediaEntity.viewWidth, mediaEntity.viewHeight, Bitmap.Config.ARGB_8888);
        editTextOutline.draw(new Canvas(mediaEntity.bitmap));
    }

    private void initLocationEntity(VideoEditedInfo.MediaEntity mediaEntity) {
        LocationMarker locationMarker = new LocationMarker(ApplicationLoader.applicationContext, mediaEntity.density);
        locationMarker.setText(mediaEntity.text);
        locationMarker.setType(mediaEntity.subType, mediaEntity.color);
        locationMarker.setMaxWidth(mediaEntity.viewWidth);
        if (mediaEntity.entities.size() == 1) {
            locationMarker.forceEmoji();
        }
        locationMarker.measure(View.MeasureSpec.makeMeasureSpec(mediaEntity.viewWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(mediaEntity.viewHeight, 1073741824));
        locationMarker.layout(0, 0, mediaEntity.viewWidth, mediaEntity.viewHeight);
        float f = mediaEntity.width * this.transformedWidth;
        int i = mediaEntity.viewWidth;
        float f2 = f / i;
        mediaEntity.bitmap = Bitmap.createBitmap(((int) (i * f2)) + 8 + 8, ((int) (mediaEntity.viewHeight * f2)) + 8 + 8, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(mediaEntity.bitmap);
        float f3 = 8;
        canvas.translate(f3, f3);
        canvas.scale(f2, f2);
        locationMarker.draw(canvas);
        float f4 = 16 * f2;
        mediaEntity.additionalWidth = f4 / this.transformedWidth;
        mediaEntity.additionalHeight = f4 / this.transformedHeight;
        if (mediaEntity.entities.size() == 1) {
            VideoEditedInfo.EmojiEntity emojiEntity = mediaEntity.entities.get(0);
            VideoEditedInfo.MediaEntity mediaEntity2 = new VideoEditedInfo.MediaEntity();
            emojiEntity.entity = mediaEntity2;
            mediaEntity2.text = emojiEntity.documentAbsolutePath;
            mediaEntity2.subType = emojiEntity.subType;
            RectF rectF = new RectF();
            locationMarker.getEmojiBounds(rectF);
            float centerX = mediaEntity.x + ((rectF.centerX() / mediaEntity.viewWidth) * mediaEntity.width);
            float f5 = mediaEntity.y;
            float centerY = rectF.centerY() / mediaEntity.viewHeight;
            float f6 = mediaEntity.height;
            float f7 = f5 + (centerY * f6);
            if (mediaEntity.rotation != 0.0f) {
                float f8 = mediaEntity.x + (mediaEntity.width / 2.0f);
                float f9 = mediaEntity.y + (f6 / 2.0f);
                float f10 = this.transformedWidth / this.transformedHeight;
                double d = centerX - f8;
                double cos = Math.cos(-r6);
                Double.isNaN(d);
                double d2 = (f7 - f9) / f10;
                double sin = Math.sin(-mediaEntity.rotation);
                Double.isNaN(d2);
                centerX = ((float) ((cos * d) - (sin * d2))) + f8;
                double sin2 = Math.sin(-mediaEntity.rotation);
                Double.isNaN(d);
                double d3 = d * sin2;
                double cos2 = Math.cos(-mediaEntity.rotation);
                Double.isNaN(d2);
                f7 = (((float) (d3 + (d2 * cos2))) * f10) + f9;
            }
            emojiEntity.entity.width = (rectF.width() / mediaEntity.viewWidth) * mediaEntity.width;
            emojiEntity.entity.height = (rectF.height() / mediaEntity.viewHeight) * mediaEntity.height;
            VideoEditedInfo.MediaEntity mediaEntity3 = emojiEntity.entity;
            float f11 = mediaEntity3.width * 1.2f;
            mediaEntity3.width = f11;
            float f12 = mediaEntity3.height * 1.2f;
            mediaEntity3.height = f12;
            mediaEntity3.x = centerX - (f11 / 2.0f);
            mediaEntity3.y = f7 - (f12 / 2.0f);
            mediaEntity3.rotation = mediaEntity.rotation;
            initStickerEntity(mediaEntity3);
        }
    }

    public void initStickerEntity(VideoEditedInfo.MediaEntity mediaEntity) {
        int i;
        int i2 = (int) (mediaEntity.width * this.transformedWidth);
        mediaEntity.W = i2;
        int i3 = (int) (mediaEntity.height * this.transformedHeight);
        mediaEntity.H = i3;
        if (i2 > 512) {
            mediaEntity.H = (int) ((i3 / i2) * 512.0f);
            mediaEntity.W = LiteMode.FLAG_CALLS_ANIMATIONS;
        }
        int i4 = mediaEntity.H;
        if (i4 > 512) {
            mediaEntity.W = (int) ((mediaEntity.W / i4) * 512.0f);
            mediaEntity.H = LiteMode.FLAG_CALLS_ANIMATIONS;
        }
        byte b = mediaEntity.subType;
        if ((b & 1) != 0) {
            int i5 = mediaEntity.W;
            if (i5 <= 0 || (i = mediaEntity.H) <= 0) {
                return;
            }
            mediaEntity.bitmap = Bitmap.createBitmap(i5, i, Bitmap.Config.ARGB_8888);
            int[] iArr = new int[3];
            mediaEntity.metadata = iArr;
            mediaEntity.ptr = RLottieDrawable.create(mediaEntity.text, null, mediaEntity.W, mediaEntity.H, iArr, false, null, false, 0);
            mediaEntity.framesPerDraw = mediaEntity.metadata[1] / this.videoFps;
            return;
        }
        if ((b & 4) != 0) {
            mediaEntity.looped = false;
            mediaEntity.animatedFileDrawable = new AnimatedFileDrawable(new File(mediaEntity.text), true, 0L, 0, null, null, null, 0L, UserConfig.selectedAccount, true, LiteMode.FLAG_CALLS_ANIMATIONS, LiteMode.FLAG_CALLS_ANIMATIONS, null);
            mediaEntity.framesPerDraw = r0.getFps() / this.videoFps;
            mediaEntity.currentFrame = 1.0f;
            mediaEntity.animatedFileDrawable.getNextFrame(true);
            if (mediaEntity.type == 5) {
                mediaEntity.firstSeek = true;
                return;
            }
            return;
        }
        String str = mediaEntity.text;
        if (!TextUtils.isEmpty(mediaEntity.segmentedPath) && (mediaEntity.subType & 16) != 0) {
            str = mediaEntity.segmentedPath;
        }
        if (Build.VERSION.SDK_INT >= 19) {
            BitmapFactory.Options options = new BitmapFactory.Options();
            if (mediaEntity.type == 2) {
                options.inMutable = true;
            }
            mediaEntity.bitmap = BitmapFactory.decodeFile(str, options);
        } else {
            try {
                File file = new File(str);
                RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
                MappedByteBuffer map = randomAccessFile.getChannel().map(FileChannel.MapMode.READ_ONLY, 0L, file.length());
                BitmapFactory.Options options2 = new BitmapFactory.Options();
                options2.inJustDecodeBounds = true;
                Utilities.loadWebpImage(null, map, map.limit(), options2, true);
                if (mediaEntity.type == 2) {
                    options2.inMutable = true;
                }
                Bitmap createBitmap = Bitmaps.createBitmap(options2.outWidth, options2.outHeight, Bitmap.Config.ARGB_8888);
                mediaEntity.bitmap = createBitmap;
                Utilities.loadWebpImage(createBitmap, map, map.limit(), null, true);
                randomAccessFile.close();
            } catch (Throwable th) {
                FileLog.e(th);
            }
        }
        if (mediaEntity.type == 2 && mediaEntity.bitmap != null) {
            mediaEntity.roundRadius = AndroidUtilities.dp(12.0f) / Math.min(mediaEntity.viewWidth, mediaEntity.viewHeight);
            Pair<Integer, Integer> imageOrientation = AndroidUtilities.getImageOrientation(mediaEntity.text);
            double d = mediaEntity.rotation;
            double radians = Math.toRadians(((Integer) imageOrientation.first).intValue());
            Double.isNaN(d);
            mediaEntity.rotation = (float) (d - radians);
            if ((((Integer) imageOrientation.first).intValue() / 90) % 2 == 1) {
                float f = mediaEntity.x;
                float f2 = mediaEntity.width;
                float f3 = f + (f2 / 2.0f);
                float f4 = mediaEntity.y;
                float f5 = mediaEntity.height;
                float f6 = f4 + (f5 / 2.0f);
                int i6 = this.transformedWidth;
                int i7 = this.transformedHeight;
                float f7 = (f2 * i6) / i7;
                float f8 = (f5 * i7) / i6;
                mediaEntity.width = f8;
                mediaEntity.height = f7;
                mediaEntity.x = f3 - (f8 / 2.0f);
                mediaEntity.y = f6 - (f7 / 2.0f);
            }
            applyRoundRadius(mediaEntity, mediaEntity.bitmap, 0);
            return;
        }
        if (mediaEntity.bitmap != null) {
            float width = r0.getWidth() / mediaEntity.bitmap.getHeight();
            if (width > 1.0f) {
                float f9 = mediaEntity.height;
                float f10 = f9 / width;
                mediaEntity.y += (f9 - f10) / 2.0f;
                mediaEntity.height = f10;
                return;
            }
            if (width < 1.0f) {
                float f11 = mediaEntity.width;
                float f12 = width * f11;
                mediaEntity.x += (f11 - f12) / 2.0f;
                mediaEntity.width = f12;
            }
        }
    }

    private int createProgram(String str, String str2, boolean z) {
        int loadShader;
        int glCreateProgram;
        int loadShader2;
        int glCreateProgram2;
        if (z) {
            int loadShader3 = FilterShaders.loadShader(35633, str);
            if (loadShader3 == 0 || (loadShader2 = FilterShaders.loadShader(35632, str2)) == 0 || (glCreateProgram2 = GLES30.glCreateProgram()) == 0) {
                return 0;
            }
            GLES30.glAttachShader(glCreateProgram2, loadShader3);
            GLES30.glAttachShader(glCreateProgram2, loadShader2);
            GLES30.glLinkProgram(glCreateProgram2);
            int[] iArr = new int[1];
            GLES30.glGetProgramiv(glCreateProgram2, 35714, iArr, 0);
            if (iArr[0] == 1) {
                return glCreateProgram2;
            }
            GLES30.glDeleteProgram(glCreateProgram2);
            return 0;
        }
        int loadShader4 = FilterShaders.loadShader(35633, str);
        if (loadShader4 == 0 || (loadShader = FilterShaders.loadShader(35632, str2)) == 0 || (glCreateProgram = GLES20.glCreateProgram()) == 0) {
            return 0;
        }
        GLES20.glAttachShader(glCreateProgram, loadShader4);
        GLES20.glAttachShader(glCreateProgram, loadShader);
        GLES20.glLinkProgram(glCreateProgram);
        int[] iArr2 = new int[1];
        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr2, 0);
        if (iArr2[0] == 1) {
            return glCreateProgram;
        }
        GLES20.glDeleteProgram(glCreateProgram);
        return 0;
    }

    public void release() {
        ArrayList<VideoEditedInfo.MediaEntity> arrayList = this.mediaEntities;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                VideoEditedInfo.MediaEntity mediaEntity = this.mediaEntities.get(i);
                long j = mediaEntity.ptr;
                if (j != 0) {
                    RLottieDrawable.destroy(j);
                }
                AnimatedFileDrawable animatedFileDrawable = mediaEntity.animatedFileDrawable;
                if (animatedFileDrawable != null) {
                    animatedFileDrawable.recycle();
                }
                View view = mediaEntity.view;
                if (view instanceof EditTextEffects) {
                    ((EditTextEffects) view).recycleEmojis();
                }
                Bitmap bitmap = mediaEntity.bitmap;
                if (bitmap != null) {
                    bitmap.recycle();
                    mediaEntity.bitmap = null;
                }
            }
        }
    }

    public void changeFragmentShader(String str, String str2, boolean z) {
        int createProgram;
        int createProgram2;
        String str3 = this.messageVideoMaskPath != null ? z ? VERTEX_SHADER_MASK_300 : VERTEX_SHADER_MASK : z ? VERTEX_SHADER_300 : VERTEX_SHADER;
        int i = this.NUM_EXTERNAL_SHADER;
        if (i >= 0 && i < this.mProgram.length && (createProgram2 = createProgram(str3, str, z)) != 0) {
            GLES20.glDeleteProgram(this.mProgram[this.NUM_EXTERNAL_SHADER]);
            this.mProgram[this.NUM_EXTERNAL_SHADER] = createProgram2;
            this.texSizeHandle = GLES20.glGetUniformLocation(createProgram2, "texSize");
        }
        int i2 = this.NUM_FILTER_SHADER;
        if (i2 < 0 || i2 >= this.mProgram.length || (createProgram = createProgram(str3, str2, z)) == 0) {
            return;
        }
        GLES20.glDeleteProgram(this.mProgram[this.NUM_FILTER_SHADER]);
        this.mProgram[this.NUM_FILTER_SHADER] = createProgram;
    }
}

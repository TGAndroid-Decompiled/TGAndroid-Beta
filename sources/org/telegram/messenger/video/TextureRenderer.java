package org.telegram.messenger.video;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.media.MediaCodec;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.os.Build;
import android.text.Editable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.Pair;
import android.view.Surface;
import android.view.View;
import java.io.File;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.Bitmaps;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
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
import org.telegram.ui.Components.Paint.Views.LinkPreview;
import org.telegram.ui.Components.Paint.Views.LocationMarker;
import org.telegram.ui.Components.RLottieDrawable;

public class TextureRenderer {
    private static final String FRAGMENT_EXTERNAL_MASK_SHADER = "#extension GL_OES_EGL_image_external : require\nprecision highp float;\nvarying vec2 vTextureCoord;\nvarying vec2 MTextureCoord;\nuniform samplerExternalOES sTexture;\nuniform sampler2D sMask;\nvoid main() {\n  gl_FragColor = texture2D(sTexture, vTextureCoord) * texture2D(sMask, MTextureCoord).a;\n}\n";
    private static final String FRAGMENT_EXTERNAL_SHADER = "#extension GL_OES_EGL_image_external : require\nprecision highp float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n  gl_FragColor = texture2D(sTexture, vTextureCoord);}\n";
    private static final String FRAGMENT_MASK_SHADER = "precision highp float;\nvarying vec2 vTextureCoord;\nvarying vec2 MTextureCoord;\nuniform sampler2D sTexture;\nuniform sampler2D sMask;\nvoid main() {\n  gl_FragColor = texture2D(sTexture, vTextureCoord) * texture2D(sMask, MTextureCoord).a;\n}\n";
    private static final String FRAGMENT_SHADER = "precision highp float;\nvarying vec2 vTextureCoord;\nuniform sampler2D sTexture;\nvoid main() {\n  gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n";
    private static final String GRADIENT_FRAGMENT_SHADER = "precision highp float;\nvarying vec2 vTextureCoord;\nuniform vec4 gradientTopColor;\nuniform vec4 gradientBottomColor;\nfloat interleavedGradientNoise(vec2 n) {\n    return fract(52.9829189 * fract(.06711056 * n.x + .00583715 * n.y));\n}\nvoid main() {\n  gl_FragColor = mix(gradientTopColor, gradientBottomColor, vTextureCoord.y + (.2 * interleavedGradientNoise(gl_FragCoord.xy) - .1));\n}\n";
    public static final boolean USE_MEDIACODEC = true;
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
    private ArrayList<VideoEditedInfo.Part> collageParts;
    private int[] collageTextures;
    private final MediaController.CropState cropState;
    private FloatBuffer croppedTextureBuffer;
    private ArrayList<AnimatedEmojiDrawable> emojiDrawables;
    private FilterShaders filterShaders;
    private int gradientBottomColor;
    private int gradientBottomColorHandle;
    private FloatBuffer gradientTextureBuffer;
    private int gradientTopColor;
    private int gradientTopColorHandle;
    private FloatBuffer gradientVerticesBuffer;
    private int imageHeight;
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
    private int simpleInputTexCoordHandleOES;
    private int simplePositionHandle;
    private int simplePositionHandleOES;
    private int simpleShaderProgram;
    private int simpleShaderProgramOES;
    private int simpleSourceImageHandle;
    private int simpleSourceImageHandleOES;
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

    private boolean isCollage() {
        return this.collageParts != null;
    }

    public TextureRenderer(org.telegram.messenger.MediaController.SavedFilterState r33, java.lang.String r34, java.lang.String r35, java.lang.String r36, java.util.ArrayList<org.telegram.messenger.VideoEditedInfo.MediaEntity> r37, org.telegram.messenger.MediaController.CropState r38, int r39, int r40, int r41, int r42, int r43, float r44, boolean r45, java.lang.Integer r46, java.lang.Integer r47, org.telegram.ui.Stories.recorder.StoryEntry.HDRInfo r48, org.telegram.messenger.video.MediaCodecVideoConvertor.ConvertVideoParams r49) {
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
        int renderTexture;
        int renderBufferWidth;
        int renderBufferHeight;
        int[] iArr;
        if (this.isPhoto) {
            drawBackground();
            i4 = 0;
        } else {
            surfaceTexture.getTransformMatrix(this.mSTMatrix);
            if (BuildVars.LOGS_ENABLED && this.firstFrame) {
                StringBuilder sb = new StringBuilder();
                int i5 = 0;
                while (true) {
                    float[] fArr2 = this.mSTMatrix;
                    if (i5 >= fArr2.length) {
                        break;
                    }
                    sb.append(fArr2[i5]);
                    sb.append(", ");
                    i5++;
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
                boolean zDrawBlurPass = this.filterShaders.drawBlurPass();
                GLES20.glBindFramebuffer(36160, 0);
                int i6 = this.transformedWidth;
                if (i6 != this.originalWidth || this.transformedHeight != this.originalHeight) {
                    GLES20.glViewport(0, 0, i6, this.transformedHeight);
                }
                int renderTexture2 = this.filterShaders.getRenderTexture(!zDrawBlurPass ? 1 : 0);
                int i7 = this.NUM_FILTER_SHADER;
                fArr = this.mSTMatrixIdentity;
                i2 = i7;
                i3 = renderTexture2;
                i4 = zDrawBlurPass ? 1 : 0;
                i = 3553;
            } else {
                int i8 = this.mTextureID;
                int i9 = this.NUM_EXTERNAL_SHADER;
                i = 36197;
                fArr = this.mSTMatrix;
                i2 = i9;
                i3 = i8;
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
            GLES20.glVertexAttribPointer(this.maTextureHandle[i2], 2, 5126, false, 8, (Buffer) (this.useMatrixForImagePath ? this.croppedTextureBuffer : this.renderTextureBuffer));
            GLES20.glEnableVertexAttribArray(this.maTextureHandle[i2]);
            if (this.messageVideoMaskPath != null && this.videoMaskTexture != -1) {
                GLES20.glVertexAttribPointer(this.mmTextureHandle[i2], 2, 5126, false, 8, (Buffer) this.maskTextureBuffer);
                GLES20.glEnableVertexAttribArray(this.mmTextureHandle[i2]);
            }
            int i10 = this.texSizeHandle;
            if (i10 != 0) {
                GLES20.glUniform2f(i10, this.transformedWidth, this.transformedHeight);
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
                renderTexture = iArr[0];
                renderBufferWidth = this.imageWidth;
                renderBufferHeight = this.imageHeight;
            } else {
                FilterShaders filterShaders2 = this.filterShaders;
                if (filterShaders2 != null) {
                    renderTexture = filterShaders2.getRenderTexture(i4 ^ 1);
                    renderBufferWidth = this.filterShaders.getRenderBufferWidth();
                    renderBufferHeight = this.filterShaders.getRenderBufferHeight();
                } else {
                    renderTexture = -1;
                    renderBufferWidth = 1;
                    renderBufferHeight = 1;
                }
            }
            if (renderTexture != -1) {
                this.blur.draw(null, renderTexture, renderBufferWidth, renderBufferHeight);
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
        if (isCollage()) {
            for (int i11 = 0; i11 < this.collageParts.size(); i11++) {
                stepCollagePart(i11, this.collageParts.get(i11), j);
                drawCollagePart(i11, this.collageParts.get(i11), j);
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
        if (this.imagePathIndex >= 0 && !isCollage()) {
            drawTexture(true, this.paintTexture[this.imagePathIndex], -10000.0f, -10000.0f, -10000.0f, -10000.0f, 0.0f, false, this.useMatrixForImagePath && this.isPhoto, -1);
        }
        int i12 = this.paintPathIndex;
        if (i12 >= 0) {
            drawTexture(true, this.paintTexture[i12], -10000.0f, -10000.0f, -10000.0f, -10000.0f, 0.0f, false, false, -1);
        }
        int i13 = this.messagePathIndex;
        if (i13 >= 0) {
            drawTexture(true, this.paintTexture[i13], -10000.0f, -10000.0f, -10000.0f, -10000.0f, 0.0f, false, false, -1);
        }
        if (this.stickerTexture != null) {
            int size = this.mediaEntities.size();
            for (int i14 = 0; i14 < size; i14++) {
                drawEntity(this.mediaEntities.get(i14), this.mediaEntities.get(i14).color, j);
            }
        }
        GLES20.glFinish();
    }

    private void drawEntity(VideoEditedInfo.MediaEntity mediaEntity, int i, long j) {
        VideoEditedInfo.MediaEntity mediaEntity2;
        Bitmap bitmap;
        long j2;
        long j3;
        long jClamp;
        int i2;
        int i3;
        long j4 = mediaEntity.ptr;
        if (j4 != 0) {
            Bitmap bitmap2 = mediaEntity.bitmap;
            if (bitmap2 == null || (i2 = mediaEntity.W) <= 0 || (i3 = mediaEntity.H) <= 0) {
                return;
            }
            RLottieDrawable.getFrame(j4, (int) mediaEntity.currentFrame, bitmap2, i2, i3, bitmap2.getRowBytes(), true);
            applyRoundRadius(mediaEntity, mediaEntity.bitmap, (mediaEntity.subType & 8) != 0 ? i : 0);
            GLES20.glBindTexture(3553, this.stickerTexture[0]);
            GLUtils.texImage2D(3553, 0, mediaEntity.bitmap, 0);
            float f = mediaEntity.currentFrame + mediaEntity.framesPerDraw;
            mediaEntity.currentFrame = f;
            if (f >= mediaEntity.metadata[0]) {
                mediaEntity.currentFrame = 0.0f;
            }
            drawTexture(false, this.stickerTexture[0], mediaEntity.x, mediaEntity.y, mediaEntity.width, mediaEntity.height, mediaEntity.rotation, (mediaEntity.subType & 2) != 0);
            return;
        }
        if (mediaEntity.animatedFileDrawable != null) {
            float f2 = mediaEntity.currentFrame;
            int i4 = (int) f2;
            float interpolation = 1.0f;
            if (mediaEntity.type == 5) {
                if (this.isPhoto) {
                    j3 = mediaEntity.roundDuration;
                    j2 = 0;
                } else {
                    j2 = mediaEntity.roundOffset;
                    j3 = j2 + (mediaEntity.roundRight - mediaEntity.roundLeft);
                }
                long j5 = j / 1000000;
                if (j5 < j2) {
                    interpolation = CubicBezierInterpolator.EASE_OUT_QUINT.getInterpolation(Utilities.clamp(1.0f - ((j2 - j5) / 400.0f), 1.0f, 0.0f));
                } else if (j5 > j3) {
                    interpolation = CubicBezierInterpolator.EASE_OUT_QUINT.getInterpolation(Utilities.clamp(1.0f - ((j5 - j3) / 400.0f), 1.0f, 0.0f));
                }
                if (interpolation > 0.0f) {
                    if (this.isPhoto) {
                        jClamp = Utilities.clamp(j5, mediaEntity.roundDuration, 0L);
                    } else {
                        jClamp = Utilities.clamp((j5 - mediaEntity.roundOffset) + mediaEntity.roundLeft, mediaEntity.roundDuration, 0L);
                    }
                    while (!mediaEntity.looped && mediaEntity.animatedFileDrawable.getProgressMs() < Math.min(jClamp, mediaEntity.animatedFileDrawable.getDurationMs())) {
                        int progressMs = mediaEntity.animatedFileDrawable.getProgressMs();
                        mediaEntity.animatedFileDrawable.getNextFrame(false);
                        if (mediaEntity.animatedFileDrawable.getProgressMs() <= progressMs && (mediaEntity.animatedFileDrawable.getProgressMs() != 0 || progressMs != 0)) {
                            mediaEntity.looped = true;
                            break;
                        }
                    }
                }
            } else {
                float f3 = f2 + mediaEntity.framesPerDraw;
                mediaEntity.currentFrame = f3;
                for (int i5 = (int) f3; i4 != i5; i5--) {
                    mediaEntity.animatedFileDrawable.getNextFrame(true);
                }
            }
            Bitmap backgroundBitmap = mediaEntity.animatedFileDrawable.getBackgroundBitmap();
            if (backgroundBitmap != null) {
                if (mediaEntity.type == 5) {
                    if (this.roundBitmap == null) {
                        int iMin = Math.min(backgroundBitmap.getWidth(), backgroundBitmap.getHeight());
                        this.roundBitmap = Bitmap.createBitmap(iMin, iMin, Bitmap.Config.ARGB_8888);
                        this.roundCanvas = new Canvas(this.roundBitmap);
                    }
                    Bitmap bitmap3 = this.roundBitmap;
                    if (bitmap3 != null) {
                        bitmap3.eraseColor(0);
                        this.roundCanvas.save();
                        if (this.roundClipPath == null) {
                            this.roundClipPath = new Path();
                        }
                        this.roundClipPath.rewind();
                        this.roundClipPath.addCircle(this.roundBitmap.getWidth() / 2.0f, this.roundBitmap.getHeight() / 2.0f, (this.roundBitmap.getWidth() / 2.0f) * interpolation, Path.Direction.CW);
                        this.roundCanvas.clipPath(this.roundClipPath);
                        if (backgroundBitmap.getWidth() >= backgroundBitmap.getHeight()) {
                            this.roundSrc.set((backgroundBitmap.getWidth() - backgroundBitmap.getHeight()) / 2, 0, backgroundBitmap.getWidth() - ((backgroundBitmap.getWidth() - backgroundBitmap.getHeight()) / 2), backgroundBitmap.getHeight());
                        } else {
                            this.roundSrc.set(0, (backgroundBitmap.getHeight() - backgroundBitmap.getWidth()) / 2, backgroundBitmap.getWidth(), backgroundBitmap.getHeight() - ((backgroundBitmap.getHeight() - backgroundBitmap.getWidth()) / 2));
                        }
                        this.roundDst.set(0.0f, 0.0f, this.roundBitmap.getWidth(), this.roundBitmap.getHeight());
                        this.roundCanvas.drawBitmap(backgroundBitmap, this.roundSrc, this.roundDst, (Paint) null);
                        this.roundCanvas.restore();
                    }
                    bitmap = this.roundBitmap;
                } else {
                    if (this.stickerCanvas == null && this.stickerBitmap != null) {
                        this.stickerCanvas = new Canvas(this.stickerBitmap);
                        if (this.stickerBitmap.getHeight() != backgroundBitmap.getHeight() || this.stickerBitmap.getWidth() != backgroundBitmap.getWidth()) {
                            this.stickerCanvas.scale(this.stickerBitmap.getWidth() / backgroundBitmap.getWidth(), this.stickerBitmap.getHeight() / backgroundBitmap.getHeight());
                        }
                    }
                    Bitmap bitmap4 = this.stickerBitmap;
                    if (bitmap4 != null) {
                        bitmap4.eraseColor(0);
                        this.stickerCanvas.drawBitmap(backgroundBitmap, 0.0f, 0.0f, (Paint) null);
                        applyRoundRadius(mediaEntity, this.stickerBitmap, (mediaEntity.subType & 8) != 0 ? i : 0);
                    }
                    bitmap = this.stickerBitmap;
                }
                if (bitmap != null) {
                    GLES20.glBindTexture(3553, this.stickerTexture[0]);
                    GLUtils.texImage2D(3553, 0, bitmap, 0);
                    drawTexture(false, this.stickerTexture[0], mediaEntity.x, mediaEntity.y, mediaEntity.width, mediaEntity.height, mediaEntity.rotation, (mediaEntity.subType & 2) != 0);
                    return;
                }
                return;
            }
            return;
        }
        if (mediaEntity.bitmap != null) {
            GLES20.glBindTexture(3553, this.stickerTexture[0]);
            GLUtils.texImage2D(3553, 0, mediaEntity.bitmap, 0);
            int i6 = this.stickerTexture[0];
            float f4 = mediaEntity.x;
            float f5 = mediaEntity.additionalWidth;
            float f6 = f4 - (f5 / 2.0f);
            float f7 = mediaEntity.y;
            float f8 = mediaEntity.additionalHeight;
            drawTexture(false, i6, f6, f7 - (f8 / 2.0f), mediaEntity.width + f5, mediaEntity.height + f8, mediaEntity.rotation, mediaEntity.type == 2 && (mediaEntity.subType & 2) != 0);
        }
        ArrayList<VideoEditedInfo.EmojiEntity> arrayList = mediaEntity.entities;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        for (int i7 = 0; i7 < mediaEntity.entities.size(); i7++) {
            VideoEditedInfo.EmojiEntity emojiEntity = mediaEntity.entities.get(i7);
            if (emojiEntity != null && (mediaEntity2 = emojiEntity.entity) != null) {
                drawEntity(mediaEntity2, mediaEntity.color, j);
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
            float fMin = Math.min(bitmap.getWidth(), bitmap.getHeight()) * mediaEntity.roundRadius;
            this.path.rewind();
            this.path.addRoundRect(new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight()), fMin, fMin, Path.Direction.CCW);
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
        float f6 = f5;
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
            float f7 = (f * 2.0f) - 1.0f;
            float f8 = ((1.0f - f2) * 2.0f) - 1.0f;
            float[] fArr2 = this.bitmapData;
            fArr2[0] = f7;
            fArr2[1] = f8;
            float f9 = (f3 * 2.0f) + f7;
            fArr2[2] = f9;
            fArr2[3] = f8;
            fArr2[4] = f7;
            float f10 = f8 - (f4 * 2.0f);
            fArr2[5] = f10;
            fArr2[6] = f9;
            fArr2[7] = f10;
        }
        float[] fArr3 = this.bitmapData;
        float f11 = fArr3[0];
        float f12 = fArr3[2];
        float f13 = (f11 + f12) / 2.0f;
        if (z2) {
            fArr3[2] = f11;
            fArr3[0] = f12;
            float f14 = fArr3[6];
            fArr3[6] = fArr3[4];
            fArr3[4] = f14;
        }
        if (f6 != 0.0f) {
            float f15 = this.transformedWidth / this.transformedHeight;
            float f16 = (fArr3[5] + fArr3[1]) / 2.0f;
            int i3 = 0;
            while (i3 < 4) {
                float[] fArr4 = this.bitmapData;
                int i4 = i3 * 2;
                int i5 = i4 + 1;
                double d = fArr4[i4] - f13;
                double d2 = f6;
                double d3 = (fArr4[i5] - f16) / f15;
                fArr4[i4] = ((float) ((Math.cos(d2) * d) - (Math.sin(d2) * d3))) + f13;
                this.bitmapData[i5] = (((float) ((d * Math.sin(d2)) + (d3 * Math.cos(d2)))) * f15) + f16;
                i3++;
                f6 = f5;
            }
        }
        this.bitmapVerticesBuffer.put(this.bitmapData).position(0);
        GLES20.glVertexAttribPointer(this.simplePositionHandle, 2, 5126, false, 8, (Buffer) (z3 ? this.verticesBuffer : this.bitmapVerticesBuffer));
        GLES20.glEnableVertexAttribArray(this.simpleInputTexCoordHandle);
        GLES20.glVertexAttribPointer(this.simpleInputTexCoordHandle, 2, 5126, false, 8, (Buffer) (z3 ? this.croppedTextureBuffer : this.textureBuffer));
        if (z) {
            GLES20.glBindTexture(3553, i);
        }
        GLES20.glDrawArrays(5, 0, 4);
    }

    public void setBreakStrategy(EditTextOutline editTextOutline) {
        editTextOutline.setBreakStrategy(0);
    }

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
                        float fSin = f2 + (paddingTop * f3);
                        if (mediaEntity4.rotation != 0.0f) {
                            float f4 = mediaEntity4.x + (mediaEntity4.width / 2.0f);
                            float f5 = mediaEntity4.y + (f3 / 2.0f);
                            float f6 = TextureRenderer.this.transformedWidth / TextureRenderer.this.transformedHeight;
                            double d = paddingLeft - f4;
                            double d2 = (fSin - f5) / f6;
                            float fCos = f4 + ((float) ((Math.cos(-mediaEntity.rotation) * d) - (Math.sin(-mediaEntity.rotation) * d2)));
                            fSin = (((float) ((d * Math.sin(-mediaEntity.rotation)) + (d2 * Math.cos(-mediaEntity.rotation)))) * f6) + f5;
                            paddingLeft = fCos;
                        }
                        VideoEditedInfo.MediaEntity mediaEntity5 = next.entity;
                        float f7 = this.measuredSize;
                        VideoEditedInfo.MediaEntity mediaEntity6 = mediaEntity;
                        float f8 = (f7 / mediaEntity6.viewWidth) * mediaEntity6.width;
                        mediaEntity5.width = f8;
                        float f9 = (f7 / mediaEntity6.viewHeight) * mediaEntity6.height;
                        mediaEntity5.height = f9;
                        mediaEntity5.x = paddingLeft - (f8 / 2.0f);
                        mediaEntity5.y = fSin - (f9 / 2.0f);
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
        editTextOutline.setText(Emoji.replaceEmoji(spannableString, editTextOutline.getPaint().getFontMetricsInt(), false));
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
        int i5 = mediaEntity.textAlign;
        if (i5 != 1) {
            i = (i5 == 2 ? !LocaleController.isRTL : LocaleController.isRTL) ? 3 : 2;
        } else {
            i = 4;
        }
        editTextOutline.setTextAlignment(i);
        editTextOutline.setHorizontallyScrolling(false);
        editTextOutline.setImeOptions(268435456);
        editTextOutline.setFocusableInTouchMode(true);
        editTextOutline.setInputType(editTextOutline.getInputType() | 16384);
        if (i4 >= 23) {
            setBreakStrategy(editTextOutline);
        }
        byte b = mediaEntity.subType;
        if (b == 0) {
            editTextOutline.setFrameColor(mediaEntity.color);
            editTextOutline.setTextColor(AndroidUtilities.computePerceivedBrightness(mediaEntity.color) >= 0.721f ? -16777216 : -1);
        } else if (b == 1) {
            editTextOutline.setFrameColor(AndroidUtilities.computePerceivedBrightness(mediaEntity.color) >= 0.25f ? -1728053248 : -1711276033);
            editTextOutline.setTextColor(mediaEntity.color);
        } else if (b == 2) {
            editTextOutline.setFrameColor(AndroidUtilities.computePerceivedBrightness(mediaEntity.color) >= 0.25f ? -16777216 : -1);
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
        LocationMarker locationMarker = new LocationMarker(ApplicationLoader.applicationContext, mediaEntity.type == 3 ? 0 : 1, mediaEntity.density, 0);
        locationMarker.setIsVideo(true);
        locationMarker.setText(mediaEntity.text);
        locationMarker.setType(mediaEntity.subType, mediaEntity.color);
        if (mediaEntity.weather != null && mediaEntity.entities.isEmpty()) {
            locationMarker.setCodeEmoji(UserConfig.selectedAccount, mediaEntity.weather.getEmoji());
        }
        locationMarker.setMaxWidth(mediaEntity.viewWidth);
        if (mediaEntity.entities.size() == 1) {
            locationMarker.forceEmoji();
        }
        locationMarker.measure(View.MeasureSpec.makeMeasureSpec(mediaEntity.viewWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(mediaEntity.viewHeight, 1073741824));
        locationMarker.layout(0, 0, mediaEntity.viewWidth, mediaEntity.viewHeight);
        float f = mediaEntity.width * this.transformedWidth;
        float f2 = mediaEntity.viewWidth;
        float f3 = f / f2;
        mediaEntity.bitmap = Bitmap.createBitmap(((int) (f2 * f3)) + 16, ((int) (mediaEntity.viewHeight * f3)) + 16, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(mediaEntity.bitmap);
        float f4 = 8;
        canvas.translate(f4, f4);
        canvas.scale(f3, f3);
        locationMarker.draw(canvas);
        float f5 = 16 * f3;
        mediaEntity.additionalWidth = f5 / this.transformedWidth;
        mediaEntity.additionalHeight = f5 / this.transformedHeight;
        if (mediaEntity.entities.size() == 1) {
            VideoEditedInfo.EmojiEntity emojiEntity = mediaEntity.entities.get(0);
            VideoEditedInfo.MediaEntity mediaEntity2 = new VideoEditedInfo.MediaEntity();
            emojiEntity.entity = mediaEntity2;
            mediaEntity2.text = emojiEntity.documentAbsolutePath;
            mediaEntity2.subType = emojiEntity.subType;
            RectF rectF = new RectF();
            locationMarker.getEmojiBounds(rectF);
            float fCenterX = mediaEntity.x + ((rectF.centerX() / mediaEntity.viewWidth) * mediaEntity.width);
            float f6 = mediaEntity.y;
            float fCenterY = rectF.centerY() / mediaEntity.viewHeight;
            float f7 = mediaEntity.height;
            float fSin = f6 + (fCenterY * f7);
            if (mediaEntity.rotation != 0.0f) {
                float f8 = mediaEntity.x + (mediaEntity.width / 2.0f);
                float f9 = mediaEntity.y + (f7 / 2.0f);
                float f10 = this.transformedWidth / this.transformedHeight;
                double d = fCenterX - f8;
                double d2 = (fSin - f9) / f10;
                fCenterX = ((float) ((Math.cos(-r6) * d) - (Math.sin(-mediaEntity.rotation) * d2))) + f8;
                fSin = (((float) ((d * Math.sin(-mediaEntity.rotation)) + (d2 * Math.cos(-mediaEntity.rotation)))) * f10) + f9;
            }
            emojiEntity.entity.width = (rectF.width() / mediaEntity.viewWidth) * mediaEntity.width;
            emojiEntity.entity.height = (rectF.height() / mediaEntity.viewHeight) * mediaEntity.height;
            VideoEditedInfo.MediaEntity mediaEntity3 = emojiEntity.entity;
            float f11 = mediaEntity3.width * 1.2f;
            mediaEntity3.width = f11;
            float f12 = mediaEntity3.height * 1.2f;
            mediaEntity3.height = f12;
            mediaEntity3.x = fCenterX - (f11 / 2.0f);
            mediaEntity3.y = fSin - (f12 / 2.0f);
            mediaEntity3.rotation = mediaEntity.rotation;
            initStickerEntity(mediaEntity3);
        }
    }

    private void initLinkEntity(VideoEditedInfo.MediaEntity mediaEntity) {
        LinkPreview linkPreview = new LinkPreview(ApplicationLoader.applicationContext, mediaEntity.density);
        linkPreview.setVideoTexture();
        linkPreview.set(UserConfig.selectedAccount, mediaEntity.linkSettings);
        if (linkPreview.withPreview()) {
            linkPreview.setPreviewType(mediaEntity.subType);
        } else {
            linkPreview.setType(mediaEntity.subType, mediaEntity.color);
        }
        int i = mediaEntity.viewWidth;
        int i2 = linkPreview.padx;
        linkPreview.setMaxWidth(i + i2 + i2);
        linkPreview.measure(View.MeasureSpec.makeMeasureSpec(mediaEntity.viewWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(mediaEntity.viewHeight, 1073741824));
        linkPreview.layout(0, 0, mediaEntity.viewWidth, mediaEntity.viewHeight);
        float f = mediaEntity.width * this.transformedWidth;
        float f2 = mediaEntity.viewWidth;
        float f3 = f / f2;
        mediaEntity.bitmap = Bitmap.createBitmap(((int) (f2 * f3)) + 16, ((int) (mediaEntity.viewHeight * f3)) + 16, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(mediaEntity.bitmap);
        float f4 = 8;
        canvas.translate(f4, f4);
        canvas.scale(f3, f3);
        linkPreview.draw(canvas);
        float f5 = 16 * f3;
        mediaEntity.additionalWidth = f5 / this.transformedWidth;
        mediaEntity.additionalHeight = f5 / this.transformedHeight;
    }

    public void initStickerEntity(VideoEditedInfo.MediaEntity mediaEntity) {
        MediaController.CropState cropState;
        int i;
        int i2 = (int) (mediaEntity.width * this.transformedWidth);
        mediaEntity.W = i2;
        int i3 = (int) (mediaEntity.height * this.transformedHeight);
        mediaEntity.H = i3;
        if (i2 > 512) {
            mediaEntity.H = (int) ((i3 / i2) * 512.0f);
            mediaEntity.W = 512;
        }
        int i4 = mediaEntity.H;
        if (i4 > 512) {
            mediaEntity.W = (int) ((mediaEntity.W / i4) * 512.0f);
            mediaEntity.H = 512;
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
            mediaEntity.animatedFileDrawable = new AnimatedFileDrawable(new File(mediaEntity.text), true, 0L, 0, null, null, null, 0L, UserConfig.selectedAccount, true, 512, 512, null);
            mediaEntity.framesPerDraw = r2.getFps() / this.videoFps;
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
        BitmapFactory.Options options = new BitmapFactory.Options();
        if (mediaEntity.type == 2) {
            options.inMutable = true;
        }
        Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(str, options);
        mediaEntity.bitmap = bitmapDecodeFile;
        if (bitmapDecodeFile != null && (cropState = mediaEntity.crop) != null) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap((int) Math.max(1.0f, cropState.cropPw * bitmapDecodeFile.getWidth()), (int) Math.max(1.0f, mediaEntity.crop.cropPh * mediaEntity.bitmap.getHeight()), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            canvas.translate(bitmapCreateBitmap.getWidth() / 2.0f, bitmapCreateBitmap.getHeight() / 2.0f);
            canvas.rotate(-mediaEntity.crop.orientation);
            int width = mediaEntity.bitmap.getWidth();
            int height = mediaEntity.bitmap.getHeight();
            MediaController.CropState cropState2 = mediaEntity.crop;
            if (((cropState2.orientation + cropState2.transformRotation) / 90) % 2 == 1) {
                width = mediaEntity.bitmap.getHeight();
                height = mediaEntity.bitmap.getWidth();
            }
            MediaController.CropState cropState3 = mediaEntity.crop;
            float f = cropState3.cropPw;
            float f2 = cropState3.cropPh;
            float f3 = width;
            float f4 = height;
            canvas.clipRect(((-width) * f) / 2.0f, ((-height) * f2) / 2.0f, (f * f3) / 2.0f, (f2 * f4) / 2.0f);
            float f5 = mediaEntity.crop.cropScale;
            canvas.scale(f5, f5);
            MediaController.CropState cropState4 = mediaEntity.crop;
            canvas.translate(cropState4.cropPx * f3, cropState4.cropPy * f4);
            canvas.rotate(mediaEntity.crop.cropRotate + r9.transformRotation);
            if (mediaEntity.crop.mirrored) {
                canvas.scale(-1.0f, 1.0f);
            }
            canvas.rotate(mediaEntity.crop.orientation);
            canvas.translate((-mediaEntity.bitmap.getWidth()) / 2.0f, (-mediaEntity.bitmap.getHeight()) / 2.0f);
            canvas.drawBitmap(mediaEntity.bitmap, 0.0f, 0.0f, (Paint) null);
            mediaEntity.bitmap.recycle();
            mediaEntity.bitmap = bitmapCreateBitmap;
        }
        if (mediaEntity.type == 2 && mediaEntity.bitmap != null) {
            mediaEntity.roundRadius = AndroidUtilities.dp(12.0f) / Math.min(mediaEntity.viewWidth, mediaEntity.viewHeight);
            Pair<Integer, Integer> imageOrientation = AndroidUtilities.getImageOrientation(mediaEntity.text);
            mediaEntity.rotation = (float) (mediaEntity.rotation - Math.toRadians(((Integer) imageOrientation.first).intValue()));
            if ((((Integer) imageOrientation.first).intValue() / 90) % 2 == 1) {
                float f6 = mediaEntity.x;
                float f7 = mediaEntity.width;
                float f8 = f6 + (f7 / 2.0f);
                float f9 = mediaEntity.y;
                float f10 = mediaEntity.height;
                float f11 = f9 + (f10 / 2.0f);
                float f12 = this.transformedWidth;
                float f13 = this.transformedHeight;
                float f14 = (f7 * f12) / f13;
                float f15 = (f10 * f13) / f12;
                mediaEntity.width = f15;
                mediaEntity.height = f14;
                mediaEntity.x = f8 - (f15 / 2.0f);
                mediaEntity.y = f11 - (f14 / 2.0f);
            }
            applyRoundRadius(mediaEntity, mediaEntity.bitmap, 0);
            return;
        }
        if (mediaEntity.bitmap != null) {
            float width2 = r2.getWidth() / mediaEntity.bitmap.getHeight();
            if (width2 > 1.0f) {
                float f16 = mediaEntity.height;
                float f17 = f16 / width2;
                mediaEntity.y += (f16 - f17) / 2.0f;
                mediaEntity.height = f17;
                return;
            }
            if (width2 < 1.0f) {
                float f18 = mediaEntity.width;
                float f19 = width2 * f18;
                mediaEntity.x += (f18 - f19) / 2.0f;
                mediaEntity.width = f19;
            }
        }
    }

    private void initCollagePart(int i, VideoEditedInfo.Part part) {
        int i2;
        AtomicInteger atomicInteger = new AtomicInteger(part.width);
        AtomicInteger atomicInteger2 = new AtomicInteger(part.height);
        AtomicInteger atomicInteger3 = new AtomicInteger(0);
        if (part.isVideo) {
            GLES20.glBindTexture(36197, this.collageTextures[i]);
            GLES20.glTexParameteri(36197, 10241, 9728);
            GLES20.glTexParameteri(36197, 10240, 9728);
            GLES20.glTexParameteri(36197, 10242, 33071);
            GLES20.glTexParameteri(36197, 10243, 33071);
            SurfaceTexture surfaceTexture = new SurfaceTexture(this.collageTextures[i]);
            part.surfaceTexture = surfaceTexture;
            surfaceTexture.setDefaultBufferSize(part.width, part.height);
            try {
                part.player = new MediaCodecPlayer(part.path, new Surface(part.surfaceTexture));
            } catch (Exception e) {
                FileLog.e(e);
                part.player = null;
            }
            MediaCodecPlayer mediaCodecPlayer = part.player;
            if (mediaCodecPlayer != null) {
                atomicInteger.set(mediaCodecPlayer.getOrientedWidth());
                atomicInteger2.set(part.player.getOrientedHeight());
                atomicInteger3.set(part.player.getOrientation());
            } else {
                part.surfaceTexture.release();
                part.surfaceTexture = null;
                GLES20.glDeleteTextures(1, this.collageTextures, i);
                GLES20.glGenTextures(1, this.collageTextures, i);
                GLES20.glBindTexture(3553, this.collageTextures[i]);
                GLES20.glTexParameteri(3553, 10241, 9729);
                GLES20.glTexParameteri(3553, 10240, 9729);
                GLES20.glTexParameteri(3553, 10242, 33071);
                GLES20.glTexParameteri(3553, 10243, 33071);
                AnimatedFileDrawable animatedFileDrawable = new AnimatedFileDrawable(new File(part.path), true, 0L, 0, null, null, null, 0L, UserConfig.selectedAccount, true, 512, 512, null);
                part.animatedFileDrawable = animatedFileDrawable;
                if (animatedFileDrawable.decoderFailed()) {
                    throw new RuntimeException("Failed to decode with ffmpeg software codecs");
                }
                part.framesPerDraw = part.animatedFileDrawable.getFps() / this.videoFps;
                part.msPerFrame = 1000.0f / part.animatedFileDrawable.getFps();
                part.currentFrame = 1.0f;
                Bitmap nextFrame = part.animatedFileDrawable.getNextFrame(false);
                if (nextFrame != null) {
                    GLUtils.texImage2D(3553, 0, nextFrame, 0);
                }
                atomicInteger.set(part.animatedFileDrawable.getIntrinsicWidth());
                atomicInteger2.set(part.animatedFileDrawable.getIntrinsicHeight());
                atomicInteger3.set(part.animatedFileDrawable.getOrientation());
            }
        } else {
            GLES20.glBindTexture(3553, this.collageTextures[i]);
            GLES20.glTexParameteri(3553, 10241, 9729);
            GLES20.glTexParameteri(3553, 10240, 9729);
            GLES20.glTexParameteri(3553, 10242, 33071);
            GLES20.glTexParameteri(3553, 10243, 33071);
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inMutable = true;
            Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(part.path, options);
            Pair<Integer, Integer> imageOrientation = AndroidUtilities.getImageOrientation(part.path);
            if (((Integer) imageOrientation.first).intValue() != 0 || ((Integer) imageOrientation.second).intValue() != 0) {
                Matrix matrix = new Matrix();
                if (((Integer) imageOrientation.second).intValue() != 0) {
                    matrix.postScale(((Integer) imageOrientation.second).intValue() == 1 ? -1.0f : 1.0f, ((Integer) imageOrientation.second).intValue() != 2 ? 1.0f : -1.0f);
                }
                if (((Integer) imageOrientation.first).intValue() != 0) {
                    matrix.postRotate(((Integer) imageOrientation.first).intValue());
                }
                bitmapDecodeFile = Bitmaps.createBitmap(bitmapDecodeFile, 0, 0, bitmapDecodeFile.getWidth(), bitmapDecodeFile.getHeight(), matrix, true);
            }
            Bitmap bitmap = bitmapDecodeFile;
            GLUtils.texImage2D(3553, 0, bitmap, 0);
            atomicInteger.set(bitmap.getWidth());
            atomicInteger2.set(bitmap.getHeight());
        }
        float[] fArr = {part.part.l(2.0f) - 1.0f, -(part.part.t(2.0f) - 1.0f), part.part.r(2.0f) - 1.0f, -(part.part.t(2.0f) - 1.0f), part.part.l(2.0f) - 1.0f, -(part.part.b(2.0f) - 1.0f), part.part.r(2.0f) - 1.0f, -(part.part.b(2.0f) - 1.0f)};
        float fW = part.part.w(this.transformedWidth);
        float fH = part.part.h(this.transformedHeight);
        int i3 = atomicInteger.get();
        int i4 = atomicInteger2.get();
        int i5 = atomicInteger3.get();
        float f = i3;
        float f2 = i4;
        float fMax = 1.0f / Math.max(fW / f, fH / f2);
        float f3 = ((fW * fMax) / f) / 2.0f;
        float f4 = ((fH * fMax) / f2) / 2.0f;
        if ((i5 / 90) % 2 == 1) {
            i2 = 8;
        } else {
            i2 = 8;
            f4 = f3;
            f3 = f4;
        }
        float[] fArr2 = new float[i2];
        float f5 = 0.5f - f4;
        fArr2[0] = f5;
        float f6 = 0.5f - f3;
        fArr2[1] = f6;
        float f7 = f4 + 0.5f;
        fArr2[2] = f7;
        fArr2[3] = f6;
        char c = 4;
        fArr2[4] = f5;
        float f8 = f3 + 0.5f;
        char c2 = 5;
        fArr2[5] = f8;
        char c3 = 6;
        fArr2[6] = f7;
        char c4 = 7;
        fArr2[7] = f8;
        while (i5 > 0) {
            float f9 = fArr2[0];
            float f10 = fArr2[1];
            fArr2[0] = fArr2[c];
            fArr2[1] = fArr2[c2];
            fArr2[c] = fArr2[c3];
            fArr2[c2] = fArr2[c4];
            fArr2[c3] = fArr2[2];
            fArr2[c4] = fArr2[3];
            fArr2[2] = f9;
            fArr2[3] = f10;
            i5 -= 90;
            c4 = 7;
            c = 4;
            c2 = 5;
            c3 = 6;
        }
        while (i5 < 0) {
            float f11 = fArr2[0];
            float f12 = fArr2[1];
            fArr2[0] = fArr2[2];
            fArr2[1] = fArr2[3];
            fArr2[2] = fArr2[6];
            fArr2[3] = fArr2[7];
            fArr2[6] = fArr2[4];
            fArr2[7] = fArr2[5];
            fArr2[4] = f11;
            fArr2[5] = f12;
            i5 += 90;
        }
        part.posBuffer = floats(fArr);
        part.uvBuffer = floats(fArr2);
    }

    private void destroyCollagePart(int i, VideoEditedInfo.Part part) {
        if (part == null) {
            return;
        }
        AnimatedFileDrawable animatedFileDrawable = part.animatedFileDrawable;
        if (animatedFileDrawable != null) {
            animatedFileDrawable.recycle();
            part.animatedFileDrawable = null;
        }
        MediaCodecPlayer mediaCodecPlayer = part.player;
        if (mediaCodecPlayer != null) {
            mediaCodecPlayer.release();
            part.player = null;
        }
        SurfaceTexture surfaceTexture = part.surfaceTexture;
        if (surfaceTexture != null) {
            surfaceTexture.release();
            part.surfaceTexture = null;
        }
    }

    private FloatBuffer floats(float[] fArr) {
        FloatBuffer floatBufferAsFloatBuffer = ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        floatBufferAsFloatBuffer.put(fArr).position(0);
        return floatBufferAsFloatBuffer;
    }

    private void stepCollagePart(int i, VideoEditedInfo.Part part, long j) throws MediaCodec.CryptoException {
        float f;
        Bitmap nextFrame;
        long progressMs;
        long j2 = (j / 1000000) - part.offset;
        float f2 = part.right;
        float f3 = part.duration;
        long jClamp = Utilities.clamp(j2, (long) (f2 * f3), (long) (part.left * f3));
        MediaCodecPlayer mediaCodecPlayer = part.player;
        if (mediaCodecPlayer != null) {
            mediaCodecPlayer.ensure(jClamp);
            part.surfaceTexture.updateTexImage();
            return;
        }
        AnimatedFileDrawable animatedFileDrawable = part.animatedFileDrawable;
        if (animatedFileDrawable != null) {
            boolean z = animatedFileDrawable.getProgressMs() <= 0;
            if (jClamp < part.animatedFileDrawable.getProgressMs() || (z && jClamp > 1000)) {
                part.animatedFileDrawable.seekToSync(jClamp);
            }
            do {
                f = jClamp;
                if (part.animatedFileDrawable.getProgressMs() + (part.msPerFrame * 2.0f) >= f) {
                    break;
                }
                progressMs = part.animatedFileDrawable.getProgressMs();
                part.animatedFileDrawable.skipNextFrame(false);
            } while (part.animatedFileDrawable.getProgressMs() != progressMs);
            if ((z || f > part.animatedFileDrawable.getProgressMs() - (part.msPerFrame / 2.0f)) && (nextFrame = part.animatedFileDrawable.getNextFrame(false)) != null) {
                GLES20.glBindTexture(3553, this.collageTextures[i]);
                GLUtils.texImage2D(3553, 0, nextFrame, 0);
            }
        }
    }

    private void drawCollagePart(int i, VideoEditedInfo.Part part, long j) {
        if (part.player != null && part.isVideo) {
            GLES20.glUseProgram(this.simpleShaderProgramOES);
            GLES20.glActiveTexture(33987);
            GLES20.glBindTexture(36197, this.collageTextures[i]);
            GLES20.glUniform1i(this.simpleSourceImageHandleOES, 3);
            GLES20.glEnableVertexAttribArray(this.simpleInputTexCoordHandleOES);
            GLES20.glVertexAttribPointer(this.simpleInputTexCoordHandleOES, 2, 5126, false, 8, (Buffer) part.uvBuffer);
            GLES20.glEnableVertexAttribArray(this.simplePositionHandleOES);
            GLES20.glVertexAttribPointer(this.simplePositionHandleOES, 2, 5126, false, 8, (Buffer) part.posBuffer);
        } else {
            GLES20.glUseProgram(this.simpleShaderProgram);
            GLES20.glActiveTexture(33986);
            GLES20.glBindTexture(3553, this.collageTextures[i]);
            GLES20.glUniform1i(this.simpleSourceImageHandle, 2);
            GLES20.glEnableVertexAttribArray(this.simpleInputTexCoordHandle);
            GLES20.glVertexAttribPointer(this.simpleInputTexCoordHandle, 2, 5126, false, 8, (Buffer) part.uvBuffer);
            GLES20.glEnableVertexAttribArray(this.simplePositionHandle);
            GLES20.glVertexAttribPointer(this.simplePositionHandle, 2, 5126, false, 8, (Buffer) part.posBuffer);
        }
        GLES20.glDrawArrays(5, 0, 4);
    }

    private int createProgram(String str, String str2, boolean z) {
        int iLoadShader;
        int iGlCreateProgram;
        int iLoadShader2;
        int iGlCreateProgram2;
        if (z) {
            int iLoadShader3 = FilterShaders.loadShader(35633, str);
            if (iLoadShader3 == 0 || (iLoadShader2 = FilterShaders.loadShader(35632, str2)) == 0 || (iGlCreateProgram2 = GLES20.glCreateProgram()) == 0) {
                return 0;
            }
            GLES20.glAttachShader(iGlCreateProgram2, iLoadShader3);
            GLES20.glAttachShader(iGlCreateProgram2, iLoadShader2);
            GLES20.glLinkProgram(iGlCreateProgram2);
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(iGlCreateProgram2, 35714, iArr, 0);
            if (iArr[0] == 1) {
                return iGlCreateProgram2;
            }
            GLES20.glDeleteProgram(iGlCreateProgram2);
            return 0;
        }
        int iLoadShader4 = FilterShaders.loadShader(35633, str);
        if (iLoadShader4 == 0 || (iLoadShader = FilterShaders.loadShader(35632, str2)) == 0 || (iGlCreateProgram = GLES20.glCreateProgram()) == 0) {
            return 0;
        }
        GLES20.glAttachShader(iGlCreateProgram, iLoadShader4);
        GLES20.glAttachShader(iGlCreateProgram, iLoadShader);
        GLES20.glLinkProgram(iGlCreateProgram);
        int[] iArr2 = new int[1];
        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr2, 0);
        if (iArr2[0] == 1) {
            return iGlCreateProgram;
        }
        GLES20.glDeleteProgram(iGlCreateProgram);
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
        ArrayList<VideoEditedInfo.Part> arrayList2 = this.collageParts;
        if (arrayList2 != null) {
            Iterator<VideoEditedInfo.Part> it = arrayList2.iterator();
            while (it.hasNext()) {
                it.next();
                for (int i2 = 0; i2 < this.collageParts.size(); i2++) {
                    destroyCollagePart(i2, this.collageParts.get(i2));
                }
            }
        }
    }

    public void changeFragmentShader(String str, String str2, boolean z) {
        String str3;
        int iCreateProgram;
        int iCreateProgram2;
        if (this.messageVideoMaskPath != null) {
            str3 = z ? "#version 320 es\nuniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nin vec4 aPosition;\nin vec4 aTextureCoord;\nin vec4 mTextureCoord;\nout vec2 vTextureCoord;\nout vec2 MTextureCoord;\nvoid main() {\n  gl_Position = uMVPMatrix * aPosition;\n  vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n  MTextureCoord = (uSTMatrix * mTextureCoord).xy;\n}\n" : "uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nattribute vec4 mTextureCoord;\nvarying vec2 vTextureCoord;\nvarying vec2 MTextureCoord;\nvoid main() {\n  gl_Position = uMVPMatrix * aPosition;\n  vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n  MTextureCoord = (uSTMatrix * mTextureCoord).xy;\n}\n";
        } else {
            str3 = z ? "#version 320 es\nuniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nin vec4 aPosition;\nin vec4 aTextureCoord;\nout vec2 vTextureCoord;\nvoid main() {\n  gl_Position = uMVPMatrix * aPosition;\n  vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n" : "uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n  gl_Position = uMVPMatrix * aPosition;\n  vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n";
        }
        int i = this.NUM_EXTERNAL_SHADER;
        if (i >= 0 && i < this.mProgram.length && (iCreateProgram2 = createProgram(str3, str, z)) != 0) {
            GLES20.glDeleteProgram(this.mProgram[this.NUM_EXTERNAL_SHADER]);
            this.mProgram[this.NUM_EXTERNAL_SHADER] = iCreateProgram2;
            this.texSizeHandle = GLES20.glGetUniformLocation(iCreateProgram2, "texSize");
        }
        int i2 = this.NUM_FILTER_SHADER;
        if (i2 < 0 || i2 >= this.mProgram.length || (iCreateProgram = createProgram(str3, str2, z)) == 0) {
            return;
        }
        GLES20.glDeleteProgram(this.mProgram[this.NUM_FILTER_SHADER]);
        this.mProgram[this.NUM_FILTER_SHADER] = iCreateProgram;
    }
}

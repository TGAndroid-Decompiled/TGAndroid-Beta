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
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.os.Build;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.Pair;
import android.view.Surface;
import android.view.View;
import dg.s0;
import eg.e1;
import eg.j1;
import java.io.File;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.util.ArrayList;
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
import org.telegram.messenger.y3;
import org.telegram.ui.Components.RLottieNative;
import org.telegram.ui.Components.b00;
import org.telegram.ui.Components.ha;
import org.telegram.ui.Components.l5;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.u5;
import org.telegram.ui.Components.v5;
import org.telegram.ui.Components.y5;
import org.telegram.ui.Components.zt;
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
    private ha blur;
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
    private ArrayList<l5> emojiDrawables;
    private b00 filterShaders;
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

    public TextureRenderer(org.telegram.messenger.MediaController.SavedFilterState r29, java.lang.String r30, java.lang.String r31, java.lang.String r32, java.util.ArrayList<org.telegram.messenger.VideoEditedInfo.MediaEntity> r33, org.telegram.messenger.MediaController.CropState r34, int r35, int r36, int r37, int r38, int r39, float r40, boolean r41, java.lang.Integer r42, java.lang.Integer r43, qh.r6 r44, org.telegram.messenger.video.MediaCodecVideoConvertor.ConvertVideoParams r45) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.video.TextureRenderer.<init>(org.telegram.messenger.MediaController$SavedFilterState, java.lang.String, java.lang.String, java.lang.String, java.util.ArrayList, org.telegram.messenger.MediaController$CropState, int, int, int, int, int, float, boolean, java.lang.Integer, java.lang.Integer, qh.r6, org.telegram.messenger.video.MediaCodecVideoConvertor$ConvertVideoParams):void");
    }

    private void applyRoundRadius(VideoEditedInfo.MediaEntity mediaEntity, Bitmap bitmap, int i10) {
        if (bitmap != null && mediaEntity != null) {
            if (mediaEntity.roundRadius != 0.0f || i10 != 0) {
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
                if (i10 != 0) {
                    if (this.textColorPaint == null) {
                        Paint paint2 = new Paint(1);
                        this.textColorPaint = paint2;
                        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
                    }
                    this.textColorPaint.setColor(i10);
                    mediaEntity.roundRadiusCanvas.drawRect(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight(), this.textColorPaint);
                }
            }
        }
    }

    private int createProgram(String str, String str2, boolean z4) {
        int h;
        int glCreateProgram;
        int h9;
        int glCreateProgram2;
        if (z4) {
            int h10 = b00.h(35633, str);
            if (h10 == 0 || (h9 = b00.h(35632, str2)) == 0 || (glCreateProgram2 = GLES20.glCreateProgram()) == 0) {
                return 0;
            }
            GLES20.glAttachShader(glCreateProgram2, h10);
            GLES20.glAttachShader(glCreateProgram2, h9);
            GLES20.glLinkProgram(glCreateProgram2);
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(glCreateProgram2, 35714, iArr, 0);
            if (iArr[0] != 1) {
                GLES20.glDeleteProgram(glCreateProgram2);
                return 0;
            }
            return glCreateProgram2;
        }
        int h11 = b00.h(35633, str);
        if (h11 == 0 || (h = b00.h(35632, str2)) == 0 || (glCreateProgram = GLES20.glCreateProgram()) == 0) {
            return 0;
        }
        GLES20.glAttachShader(glCreateProgram, h11);
        GLES20.glAttachShader(glCreateProgram, h);
        GLES20.glLinkProgram(glCreateProgram);
        int[] iArr2 = new int[1];
        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr2, 0);
        if (iArr2[0] != 1) {
            GLES20.glDeleteProgram(glCreateProgram);
            return 0;
        }
        return glCreateProgram;
    }

    private void destroyCollagePart(int i10, VideoEditedInfo.Part part) {
        if (part != null) {
            y5 y5Var = part.animatedFileDrawable;
            if (y5Var != null) {
                y5Var.u();
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
    }

    private void drawBackground() {
        int i10 = this.NUM_GRADIENT_SHADER;
        if (i10 >= 0) {
            GLES20.glUseProgram(this.mProgram[i10]);
            GLES20.glVertexAttribPointer(this.maPositionHandle[this.NUM_GRADIENT_SHADER], 2, 5126, false, 8, (Buffer) this.gradientVerticesBuffer);
            GLES20.glEnableVertexAttribArray(this.maPositionHandle[this.NUM_GRADIENT_SHADER]);
            GLES20.glVertexAttribPointer(this.maTextureHandle[this.NUM_GRADIENT_SHADER], 2, 5126, false, 8, (Buffer) this.gradientTextureBuffer);
            GLES20.glEnableVertexAttribArray(this.maTextureHandle[this.NUM_GRADIENT_SHADER]);
            GLES20.glUniformMatrix4fv(this.muSTMatrixHandle[this.NUM_GRADIENT_SHADER], 1, false, this.mSTMatrix, 0);
            GLES20.glUniformMatrix4fv(this.muMVPMatrixHandle[this.NUM_GRADIENT_SHADER], 1, false, this.mMVPMatrix, 0);
            GLES20.glUniform4f(this.gradientTopColorHandle, Color.red(this.gradientTopColor) / 255.0f, Color.green(this.gradientTopColor) / 255.0f, Color.blue(this.gradientTopColor) / 255.0f, Color.alpha(this.gradientTopColor) / 255.0f);
            GLES20.glUniform4f(this.gradientBottomColorHandle, Color.red(this.gradientBottomColor) / 255.0f, Color.green(this.gradientBottomColor) / 255.0f, Color.blue(this.gradientBottomColor) / 255.0f, Color.alpha(this.gradientBottomColor) / 255.0f);
            GLES20.glDrawArrays(5, 0, 4);
        } else if (this.backgroundPathIndex >= 0) {
            GLES20.glUseProgram(this.simpleShaderProgram);
            GLES20.glActiveTexture(33984);
            GLES20.glUniform1i(this.simpleSourceImageHandle, 0);
            GLES20.glEnableVertexAttribArray(this.simpleInputTexCoordHandle);
            GLES20.glVertexAttribPointer(this.simpleInputTexCoordHandle, 2, 5126, false, 8, (Buffer) this.textureBuffer);
            GLES20.glEnableVertexAttribArray(this.simplePositionHandle);
            drawTexture(true, this.paintTexture[this.backgroundPathIndex], -10000.0f, -10000.0f, -10000.0f, -10000.0f, 0.0f, false, false, -1);
        }
    }

    private void drawCollagePart(int i10, VideoEditedInfo.Part part, long j10) {
        if (part.player != null && part.isVideo) {
            GLES20.glUseProgram(this.simpleShaderProgramOES);
            GLES20.glActiveTexture(33987);
            GLES20.glBindTexture(36197, this.collageTextures[i10]);
            GLES20.glUniform1i(this.simpleSourceImageHandleOES, 3);
            GLES20.glEnableVertexAttribArray(this.simpleInputTexCoordHandleOES);
            GLES20.glVertexAttribPointer(this.simpleInputTexCoordHandleOES, 2, 5126, false, 8, (Buffer) part.uvBuffer);
            GLES20.glEnableVertexAttribArray(this.simplePositionHandleOES);
            GLES20.glVertexAttribPointer(this.simplePositionHandleOES, 2, 5126, false, 8, (Buffer) part.posBuffer);
        } else {
            GLES20.glUseProgram(this.simpleShaderProgram);
            GLES20.glActiveTexture(33986);
            GLES20.glBindTexture(3553, this.collageTextures[i10]);
            GLES20.glUniform1i(this.simpleSourceImageHandle, 2);
            GLES20.glEnableVertexAttribArray(this.simpleInputTexCoordHandle);
            GLES20.glVertexAttribPointer(this.simpleInputTexCoordHandle, 2, 5126, false, 8, (Buffer) part.uvBuffer);
            GLES20.glEnableVertexAttribArray(this.simplePositionHandle);
            GLES20.glVertexAttribPointer(this.simplePositionHandle, 2, 5126, false, 8, (Buffer) part.posBuffer);
        }
        GLES20.glDrawArrays(5, 0, 4);
    }

    private void drawEntity(VideoEditedInfo.MediaEntity mediaEntity, int i10, long j10) {
        VideoEditedInfo.MediaEntity mediaEntity2;
        boolean z4;
        Bitmap bitmap;
        Bitmap bitmap2;
        int i11;
        boolean z10;
        long j11;
        long j12;
        long clamp;
        int i12;
        boolean z11;
        RLottieNative rLottieNative = mediaEntity.lottieNative;
        if (rLottieNative != null) {
            Bitmap bitmap3 = mediaEntity.bitmap;
            if (bitmap3 != null && mediaEntity.W > 0 && mediaEntity.H > 0) {
                rLottieNative.c((int) mediaEntity.currentFrame, bitmap3, true);
                Bitmap bitmap4 = mediaEntity.bitmap;
                if ((mediaEntity.subType & 8) != 0) {
                    i12 = i10;
                } else {
                    i12 = 0;
                }
                applyRoundRadius(mediaEntity, bitmap4, i12);
                GLES20.glBindTexture(3553, this.stickerTexture[0]);
                GLUtils.texImage2D(3553, 0, mediaEntity.bitmap, 0);
                float f10 = mediaEntity.currentFrame + mediaEntity.framesPerDraw;
                mediaEntity.currentFrame = f10;
                if (f10 >= mediaEntity.lottieNative.f24963a[0]) {
                    mediaEntity.currentFrame = 0.0f;
                }
                int i13 = this.stickerTexture[0];
                float f11 = mediaEntity.f18079x;
                float f12 = mediaEntity.f18080y;
                float f13 = mediaEntity.width;
                float f14 = mediaEntity.height;
                float f15 = mediaEntity.rotation;
                if ((2 & mediaEntity.subType) != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                drawTexture(false, i13, f11, f12, f13, f14, f15, z11);
            }
        } else if (mediaEntity.animatedFileDrawable != null) {
            float f16 = mediaEntity.currentFrame;
            int i14 = (int) f16;
            float f17 = 1.0f;
            if (mediaEntity.type == 5) {
                if (this.isPhoto) {
                    j11 = mediaEntity.roundDuration;
                    j12 = 0;
                } else {
                    long j13 = mediaEntity.roundOffset;
                    j11 = (mediaEntity.roundRight - mediaEntity.roundLeft) + j13;
                    j12 = j13;
                }
                long j14 = j10 / 1000000;
                if (j14 < j12) {
                    f17 = pr.h.getInterpolation(Utilities.clamp(1.0f - (((float) (j12 - j14)) / 400.0f), 1.0f, 0.0f));
                } else if (j14 > j11) {
                    f17 = pr.h.getInterpolation(Utilities.clamp(1.0f - (((float) (j14 - j11)) / 400.0f), 1.0f, 0.0f));
                }
                if (f17 > 0.0f) {
                    if (this.isPhoto) {
                        clamp = Utilities.clamp(j14, mediaEntity.roundDuration, 0L);
                    } else {
                        clamp = Utilities.clamp((j14 - mediaEntity.roundOffset) + mediaEntity.roundLeft, mediaEntity.roundDuration, 0L);
                    }
                    while (!mediaEntity.looped) {
                        int[] iArr = mediaEntity.animatedFileDrawable.d;
                        if (iArr[3] >= Math.min(clamp, iArr[4])) {
                            break;
                        }
                        y5 y5Var = mediaEntity.animatedFileDrawable;
                        int i15 = y5Var.d[3];
                        y5Var.r(false);
                        int i16 = mediaEntity.animatedFileDrawable.d[3];
                        if (i16 <= i15 && (i16 != 0 || i15 != 0)) {
                            mediaEntity.looped = true;
                            break;
                        }
                    }
                }
            } else {
                float f18 = f16 + mediaEntity.framesPerDraw;
                mediaEntity.currentFrame = f18;
                for (int i17 = (int) f18; i14 != i17; i17--) {
                    mediaEntity.animatedFileDrawable.r(true);
                }
            }
            v5 v5Var = mediaEntity.animatedFileDrawable.v;
            if (v5Var != null) {
                bitmap = v5Var.f31806b;
            } else {
                bitmap = null;
            }
            if (bitmap != null) {
                if (mediaEntity.type == 5) {
                    if (this.roundBitmap == null) {
                        int min = Math.min(bitmap.getWidth(), bitmap.getHeight());
                        this.roundBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
                        this.roundCanvas = new Canvas(this.roundBitmap);
                    }
                    Bitmap bitmap5 = this.roundBitmap;
                    if (bitmap5 != null) {
                        bitmap5.eraseColor(0);
                        this.roundCanvas.save();
                        if (this.roundClipPath == null) {
                            this.roundClipPath = new Path();
                        }
                        this.roundClipPath.rewind();
                        this.roundClipPath.addCircle(this.roundBitmap.getWidth() / 2.0f, this.roundBitmap.getHeight() / 2.0f, (this.roundBitmap.getWidth() / 2.0f) * f17, Path.Direction.CW);
                        this.roundCanvas.clipPath(this.roundClipPath);
                        if (bitmap.getWidth() >= bitmap.getHeight()) {
                            this.roundSrc.set((bitmap.getWidth() - bitmap.getHeight()) / 2, 0, bitmap.getWidth() - ((bitmap.getWidth() - bitmap.getHeight()) / 2), bitmap.getHeight());
                        } else {
                            this.roundSrc.set(0, (bitmap.getHeight() - bitmap.getWidth()) / 2, bitmap.getWidth(), bitmap.getHeight() - ((bitmap.getHeight() - bitmap.getWidth()) / 2));
                        }
                        this.roundDst.set(0.0f, 0.0f, this.roundBitmap.getWidth(), this.roundBitmap.getHeight());
                        this.roundCanvas.drawBitmap(bitmap, this.roundSrc, this.roundDst, (Paint) null);
                        this.roundCanvas.restore();
                    }
                    bitmap2 = this.roundBitmap;
                } else {
                    if (this.stickerCanvas == null && this.stickerBitmap != null) {
                        this.stickerCanvas = new Canvas(this.stickerBitmap);
                        if (this.stickerBitmap.getHeight() != bitmap.getHeight() || this.stickerBitmap.getWidth() != bitmap.getWidth()) {
                            this.stickerCanvas.scale(this.stickerBitmap.getWidth() / bitmap.getWidth(), this.stickerBitmap.getHeight() / bitmap.getHeight());
                        }
                    }
                    Bitmap bitmap6 = this.stickerBitmap;
                    if (bitmap6 != null) {
                        bitmap6.eraseColor(0);
                        this.stickerCanvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                        Bitmap bitmap7 = this.stickerBitmap;
                        if ((mediaEntity.subType & 8) != 0) {
                            i11 = i10;
                        } else {
                            i11 = 0;
                        }
                        applyRoundRadius(mediaEntity, bitmap7, i11);
                    }
                    bitmap2 = this.stickerBitmap;
                }
                if (bitmap2 != null) {
                    GLES20.glBindTexture(3553, this.stickerTexture[0]);
                    GLUtils.texImage2D(3553, 0, bitmap2, 0);
                    int i18 = this.stickerTexture[0];
                    float f19 = mediaEntity.f18079x;
                    float f20 = mediaEntity.f18080y;
                    float f21 = mediaEntity.width;
                    float f22 = mediaEntity.height;
                    float f23 = mediaEntity.rotation;
                    if ((mediaEntity.subType & 2) != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    drawTexture(false, i18, f19, f20, f21, f22, f23, z10);
                }
            }
        } else {
            if (mediaEntity.bitmap != null) {
                GLES20.glBindTexture(3553, this.stickerTexture[0]);
                GLUtils.texImage2D(3553, 0, mediaEntity.bitmap, 0);
                int i19 = this.stickerTexture[0];
                float f24 = mediaEntity.f18079x;
                float f25 = mediaEntity.additionalWidth;
                float f26 = f24 - (f25 / 2.0f);
                float f27 = mediaEntity.f18080y;
                float f28 = mediaEntity.additionalHeight;
                float f29 = f27 - (f28 / 2.0f);
                float f30 = mediaEntity.width + f25;
                float f31 = f28 + mediaEntity.height;
                float f32 = mediaEntity.rotation;
                if (mediaEntity.type == 2 && (mediaEntity.subType & 2) != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                drawTexture(false, i19, f26, f29, f30, f31, f32, z4);
            }
            ArrayList<VideoEditedInfo.EmojiEntity> arrayList = mediaEntity.entities;
            if (arrayList != null && !arrayList.isEmpty()) {
                for (int i20 = 0; i20 < mediaEntity.entities.size(); i20++) {
                    VideoEditedInfo.EmojiEntity emojiEntity = mediaEntity.entities.get(i20);
                    if (emojiEntity != null && (mediaEntity2 = emojiEntity.entity) != null) {
                        drawEntity(mediaEntity2, mediaEntity.color, j10);
                    }
                }
            }
        }
    }

    private void drawTexture(boolean z4, int i10) {
        drawTexture(z4, i10, -10000.0f, -10000.0f, -10000.0f, -10000.0f, 0.0f, false);
    }

    private FloatBuffer floats(float[] fArr) {
        FloatBuffer k10 = y3.k(ByteBuffer.allocateDirect(fArr.length * 4));
        k10.put(fArr).position(0);
        return k10;
    }

    private void initCollagePart(int i10, VideoEditedInfo.Part part) {
        float f10;
        qh.r rVar;
        AtomicInteger atomicInteger = new AtomicInteger(part.width);
        AtomicInteger atomicInteger2 = new AtomicInteger(part.height);
        AtomicInteger atomicInteger3 = new AtomicInteger(0);
        if (part.isVideo) {
            GLES20.glBindTexture(36197, this.collageTextures[i10]);
            GLES20.glTexParameteri(36197, 10241, 9728);
            GLES20.glTexParameteri(36197, 10240, 9728);
            GLES20.glTexParameteri(36197, 10242, 33071);
            GLES20.glTexParameteri(36197, 10243, 33071);
            SurfaceTexture surfaceTexture = new SurfaceTexture(this.collageTextures[i10]);
            part.surfaceTexture = surfaceTexture;
            surfaceTexture.setDefaultBufferSize(part.width, part.height);
            try {
                part.player = new MediaCodecPlayer(part.path, new Surface(part.surfaceTexture));
            } catch (Exception e6) {
                FileLog.e(e6);
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
                GLES20.glDeleteTextures(1, this.collageTextures, i10);
                GLES20.glGenTextures(1, this.collageTextures, i10);
                GLES20.glBindTexture(3553, this.collageTextures[i10]);
                GLES20.glTexParameteri(3553, 10241, 9729);
                GLES20.glTexParameteri(3553, 10240, 9729);
                GLES20.glTexParameteri(3553, 10242, 33071);
                GLES20.glTexParameteri(3553, 10243, 33071);
                y5 y5Var = new y5(new File(part.path), true, 0L, 0, null, null, null, 0L, UserConfig.selectedAccount, true, 512, 512, null, 0, true);
                part.animatedFileDrawable = y5Var;
                if (y5Var.f33337x && y5Var.f33309b0) {
                    throw new RuntimeException("Failed to decode with ffmpeg software codecs");
                }
                float f11 = y5Var.d[5];
                part.framesPerDraw = f11 / this.videoFps;
                part.msPerFrame = 1000.0f / f11;
                part.currentFrame = 1.0f;
                Bitmap r10 = y5Var.r(false);
                if (r10 != null) {
                    GLUtils.texImage2D(3553, 0, r10, 0);
                }
                atomicInteger.set(part.animatedFileDrawable.getIntrinsicWidth());
                atomicInteger2.set(part.animatedFileDrawable.getIntrinsicHeight());
                atomicInteger3.set(part.animatedFileDrawable.d[2]);
            }
        } else {
            GLES20.glBindTexture(3553, this.collageTextures[i10]);
            GLES20.glTexParameteri(3553, 10241, 9729);
            GLES20.glTexParameteri(3553, 10240, 9729);
            GLES20.glTexParameteri(3553, 10242, 33071);
            GLES20.glTexParameteri(3553, 10243, 33071);
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inMutable = true;
            Bitmap decodeFile = BitmapFactory.decodeFile(part.path, options);
            Pair<Integer, Integer> imageOrientation = AndroidUtilities.getImageOrientation(part.path);
            if (((Integer) imageOrientation.first).intValue() != 0 || ((Integer) imageOrientation.second).intValue() != 0) {
                Matrix matrix = new Matrix();
                if (((Integer) imageOrientation.second).intValue() != 0) {
                    float f12 = -1.0f;
                    if (((Integer) imageOrientation.second).intValue() == 1) {
                        f10 = -1.0f;
                    } else {
                        f10 = 1.0f;
                    }
                    if (((Integer) imageOrientation.second).intValue() != 2) {
                        f12 = 1.0f;
                    }
                    matrix.postScale(f10, f12);
                }
                if (((Integer) imageOrientation.first).intValue() != 0) {
                    matrix.postRotate(((Integer) imageOrientation.first).intValue());
                }
                decodeFile = Bitmaps.createBitmap(decodeFile, 0, 0, decodeFile.getWidth(), decodeFile.getHeight(), matrix, true);
            }
            Bitmap bitmap = decodeFile;
            GLUtils.texImage2D(3553, 0, bitmap, 0);
            atomicInteger.set(bitmap.getWidth());
            atomicInteger2.set(bitmap.getHeight());
        }
        float a2 = part.part.a(2.0f) - 1.0f;
        qh.q qVar = part.part;
        qh.q qVar2 = part.part;
        qh.q qVar3 = part.part;
        qh.q qVar4 = part.part;
        int i11 = qVar4.f45892a.f45926c;
        int i12 = qVar4.f45894c;
        float[] fArr = {a2, -(((2.0f / qVar.f45892a.f45926c) * qVar.f45894c) - 1.0f), qVar.b(2.0f) - 1.0f, -(((2.0f / qVar2.f45892a.f45926c) * qVar2.f45894c) - 1.0f), qVar2.a(2.0f) - 1.0f, -(((2.0f / qVar3.f45892a.f45926c) * (qVar3.f45894c + 1)) - 1.0f), qVar3.b(2.0f) - 1.0f, -(((2.0f / i11) * (i12 + 1)) - 1.0f)};
        float f13 = this.transformedWidth / rVar.d[i12];
        float f14 = this.transformedHeight / i11;
        int i13 = atomicInteger.get();
        int i14 = atomicInteger2.get();
        int i15 = atomicInteger3.get();
        float f15 = i13;
        float f16 = i14;
        float max = 1.0f / Math.max(f13 / f15, f14 / f16);
        float f17 = ((f13 * max) / f15) / 2.0f;
        float f18 = ((f14 * max) / f16) / 2.0f;
        if ((i15 / 90) % 2 == 1) {
            f18 = f17;
            f17 = f18;
        }
        float f19 = 0.5f - f17;
        float f20 = 0.5f - f18;
        float f21 = f17 + 0.5f;
        float f22 = f18 + 0.5f;
        float[] fArr2 = {f19, f20, f21, f20, f19, f22, f21, f22};
        while (i15 > 0) {
            float f23 = fArr2[0];
            float f24 = fArr2[1];
            fArr2[0] = fArr2[4];
            fArr2[1] = fArr2[5];
            fArr2[4] = fArr2[6];
            fArr2[5] = fArr2[7];
            fArr2[6] = fArr2[2];
            fArr2[7] = fArr2[3];
            fArr2[2] = f23;
            fArr2[3] = f24;
            i15 -= 90;
        }
        while (i15 < 0) {
            float f25 = fArr2[0];
            float f26 = fArr2[1];
            fArr2[0] = fArr2[2];
            fArr2[1] = fArr2[3];
            fArr2[2] = fArr2[6];
            fArr2[3] = fArr2[7];
            fArr2[6] = fArr2[4];
            fArr2[7] = fArr2[5];
            fArr2[4] = f25;
            fArr2[5] = f26;
            i15 += 90;
        }
        part.posBuffer = floats(fArr);
        part.uvBuffer = floats(fArr2);
    }

    private void initLinkEntity(VideoEditedInfo.MediaEntity mediaEntity) {
        e1 e1Var = new e1(ApplicationLoader.applicationContext, mediaEntity.density);
        e1Var.R = true;
        e1Var.b(UserConfig.selectedAccount, mediaEntity.linkSettings, false);
        if (e1Var.e()) {
            e1Var.setPreviewType(mediaEntity.subType);
        } else {
            e1Var.c(mediaEntity.subType, mediaEntity.color);
        }
        int i10 = mediaEntity.viewWidth;
        int i11 = e1Var.f5178f;
        e1Var.setMaxWidth(i10 + i11 + i11);
        e1Var.measure(View.MeasureSpec.makeMeasureSpec(mediaEntity.viewWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(mediaEntity.viewHeight, 1073741824));
        e1Var.layout(0, 0, mediaEntity.viewWidth, mediaEntity.viewHeight);
        float f10 = mediaEntity.width * this.transformedWidth;
        int i12 = mediaEntity.viewWidth;
        float f11 = f10 / i12;
        mediaEntity.bitmap = Bitmap.createBitmap(((int) (i12 * f11)) + 16, ((int) (mediaEntity.viewHeight * f11)) + 16, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(mediaEntity.bitmap);
        float f12 = 8;
        canvas.translate(f12, f12);
        canvas.scale(f11, f11);
        e1Var.draw(canvas);
        float f13 = 16 * f11;
        mediaEntity.additionalWidth = f13 / this.transformedWidth;
        mediaEntity.additionalHeight = f13 / this.transformedHeight;
    }

    private void initLocationEntity(VideoEditedInfo.MediaEntity mediaEntity) {
        float f10;
        float f11;
        byte b10 = mediaEntity.type;
        j1 j1Var = new j1(ApplicationLoader.applicationContext, mediaEntity.density);
        j1Var.setIsVideo(true);
        j1Var.setText(mediaEntity.text);
        j1Var.e(mediaEntity.subType, mediaEntity.color);
        if (mediaEntity.weather != null && mediaEntity.entities.isEmpty()) {
            j1Var.d(UserConfig.selectedAccount, mediaEntity.weather.f46310c);
        }
        j1Var.setMaxWidth(mediaEntity.viewWidth);
        if (mediaEntity.entities.size() == 1) {
            j1Var.f5304x = true;
            j1Var.f5297c = true;
            j1Var.requestLayout();
        }
        j1Var.measure(View.MeasureSpec.makeMeasureSpec(mediaEntity.viewWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(mediaEntity.viewHeight, 1073741824));
        j1Var.layout(0, 0, mediaEntity.viewWidth, mediaEntity.viewHeight);
        float f12 = mediaEntity.width * this.transformedWidth;
        float f13 = mediaEntity.viewWidth;
        float f14 = f12 / f13;
        mediaEntity.bitmap = Bitmap.createBitmap(((int) (f13 * f14)) + 16, ((int) (mediaEntity.viewHeight * f14)) + 16, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(mediaEntity.bitmap);
        float f15 = 8;
        canvas.translate(f15, f15);
        canvas.scale(f14, f14);
        j1Var.draw(canvas);
        float f16 = 16 * f14;
        mediaEntity.additionalWidth = f16 / this.transformedWidth;
        mediaEntity.additionalHeight = f16 / this.transformedHeight;
        if (mediaEntity.entities.size() == 1) {
            VideoEditedInfo.EmojiEntity emojiEntity = mediaEntity.entities.get(0);
            VideoEditedInfo.MediaEntity mediaEntity2 = new VideoEditedInfo.MediaEntity();
            emojiEntity.entity = mediaEntity2;
            mediaEntity2.text = emojiEntity.documentAbsolutePath;
            mediaEntity2.subType = emojiEntity.subType;
            RectF rectF = new RectF();
            float f17 = j1Var.F;
            float f18 = j1Var.d.left + 2.25f;
            float f19 = j1Var.f5305y;
            float f20 = j1Var.G;
            float f21 = j1Var.K;
            float f22 = f19 * 21.33f;
            rectF.set((f18 * f19) + f17, e2.c.x(f21, f22, 2.0f, f20), ((f18 + 21.33f) * f19) + f17, l.d.b(f22, f21, 2.0f, f20));
            float centerX = ((rectF.centerX() / mediaEntity.viewWidth) * mediaEntity.width) + mediaEntity.f18079x;
            float f23 = mediaEntity.f18080y;
            float centerY = rectF.centerY() / mediaEntity.viewHeight;
            float f24 = mediaEntity.height;
            float f25 = (centerY * f24) + f23;
            if (mediaEntity.rotation != 0.0f) {
                float f26 = (mediaEntity.width / 2.0f) + mediaEntity.f18079x;
                float f27 = (f24 / 2.0f) + mediaEntity.f18080y;
                float f28 = this.transformedWidth / this.transformedHeight;
                double d = centerX - f26;
                double d10 = (f25 - f27) / f28;
                f11 = 2.0f;
                float cos = ((float) ((Math.cos(-f10) * d) - (Math.sin(-mediaEntity.rotation) * d10))) + f26;
                f25 = (((float) l.d.a(-mediaEntity.rotation, d10, Math.sin(-mediaEntity.rotation) * d)) * f28) + f27;
                centerX = cos;
            } else {
                f11 = 2.0f;
            }
            emojiEntity.entity.width = (rectF.width() / mediaEntity.viewWidth) * mediaEntity.width;
            emojiEntity.entity.height = (rectF.height() / mediaEntity.viewHeight) * mediaEntity.height;
            VideoEditedInfo.MediaEntity mediaEntity3 = emojiEntity.entity;
            float f29 = mediaEntity3.width * 1.2f;
            mediaEntity3.width = f29;
            float f30 = mediaEntity3.height * 1.2f;
            mediaEntity3.height = f30;
            mediaEntity3.f18079x = centerX - (f29 / f11);
            mediaEntity3.f18080y = f25 - (f30 / f11);
            mediaEntity3.rotation = mediaEntity.rotation;
            initStickerEntity(mediaEntity3);
        }
    }

    public void initStickerEntity(VideoEditedInfo.MediaEntity mediaEntity) {
        Bitmap bitmap;
        MediaController.CropState cropState;
        MediaController.CropState cropState2;
        int i10;
        int i11 = (int) (mediaEntity.width * this.transformedWidth);
        mediaEntity.W = i11;
        int i12 = (int) (mediaEntity.height * this.transformedHeight);
        mediaEntity.H = i12;
        if (i11 > 512) {
            mediaEntity.H = (int) ((i12 / i11) * 512.0f);
            mediaEntity.W = 512;
        }
        int i13 = mediaEntity.H;
        if (i13 > 512) {
            mediaEntity.W = (int) ((mediaEntity.W / i13) * 512.0f);
            mediaEntity.H = 512;
        }
        byte b10 = mediaEntity.subType;
        float f10 = 0.0f;
        if ((b10 & 1) != 0) {
            int i14 = mediaEntity.W;
            if (i14 > 0 && (i10 = mediaEntity.H) > 0) {
                mediaEntity.bitmap = Bitmap.createBitmap(i14, i10, Bitmap.Config.ARGB_8888);
                RLottieNative a2 = RLottieNative.a(mediaEntity.text, null, mediaEntity.W, mediaEntity.H, null, false, null, false, 0, null);
                mediaEntity.lottieNative = a2;
                if (a2 != null) {
                    f10 = a2.f24963a[1] / this.videoFps;
                }
                mediaEntity.framesPerDraw = f10;
            }
        } else if ((b10 & 4) != 0) {
            mediaEntity.looped = false;
            y5 y5Var = new y5(new File(mediaEntity.text), true, 0L, 0, null, null, null, 0L, UserConfig.selectedAccount, true, 512, 512, null, 0, true);
            mediaEntity.animatedFileDrawable = y5Var;
            mediaEntity.framesPerDraw = y5Var.d[5] / this.videoFps;
            mediaEntity.currentFrame = 1.0f;
            y5Var.r(true);
            if (mediaEntity.type == 5) {
                mediaEntity.firstSeek = true;
            }
        } else {
            String str = mediaEntity.text;
            if (!TextUtils.isEmpty(mediaEntity.segmentedPath) && (mediaEntity.subType & 16) != 0) {
                str = mediaEntity.segmentedPath;
            }
            BitmapFactory.Options options = new BitmapFactory.Options();
            if (mediaEntity.type == 2) {
                options.inMutable = true;
            }
            Bitmap decodeFile = BitmapFactory.decodeFile(str, options);
            mediaEntity.bitmap = decodeFile;
            if (decodeFile != null && (cropState = mediaEntity.crop) != null) {
                Bitmap createBitmap = Bitmap.createBitmap((int) Math.max(1.0f, cropState.cropPw * decodeFile.getWidth()), (int) Math.max(1.0f, mediaEntity.crop.cropPh * mediaEntity.bitmap.getHeight()), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
                canvas.rotate(-mediaEntity.crop.orientation);
                int width = mediaEntity.bitmap.getWidth();
                int height = mediaEntity.bitmap.getHeight();
                MediaController.CropState cropState3 = mediaEntity.crop;
                if (((cropState3.orientation + cropState3.transformRotation) / 90) % 2 == 1) {
                    width = mediaEntity.bitmap.getHeight();
                    height = mediaEntity.bitmap.getWidth();
                }
                MediaController.CropState cropState4 = mediaEntity.crop;
                float f11 = cropState4.cropPw;
                float f12 = cropState4.cropPh;
                float f13 = width;
                float f14 = height;
                canvas.clipRect(((-width) * f11) / 2.0f, ((-height) * f12) / 2.0f, (f11 * f13) / 2.0f, (f12 * f14) / 2.0f);
                float f15 = mediaEntity.crop.cropScale;
                canvas.scale(f15, f15);
                MediaController.CropState cropState5 = mediaEntity.crop;
                canvas.translate(cropState5.cropPx * f13, cropState5.cropPy * f14);
                canvas.rotate(mediaEntity.crop.cropRotate + cropState2.transformRotation);
                if (mediaEntity.crop.mirrored) {
                    canvas.scale(-1.0f, 1.0f);
                }
                canvas.rotate(mediaEntity.crop.orientation);
                canvas.translate((-mediaEntity.bitmap.getWidth()) / 2.0f, (-mediaEntity.bitmap.getHeight()) / 2.0f);
                canvas.drawBitmap(mediaEntity.bitmap, 0.0f, 0.0f, (Paint) null);
                mediaEntity.bitmap.recycle();
                mediaEntity.bitmap = createBitmap;
            }
            if (mediaEntity.type == 2 && mediaEntity.bitmap != null) {
                mediaEntity.roundRadius = AndroidUtilities.dp(12.0f) / Math.min(mediaEntity.viewWidth, mediaEntity.viewHeight);
                Pair<Integer, Integer> imageOrientation = AndroidUtilities.getImageOrientation(mediaEntity.text);
                mediaEntity.rotation = (float) (mediaEntity.rotation - Math.toRadians(((Integer) imageOrientation.first).intValue()));
                if ((((Integer) imageOrientation.first).intValue() / 90) % 2 == 1) {
                    float f16 = mediaEntity.f18079x;
                    float f17 = mediaEntity.width;
                    float f18 = (f17 / 2.0f) + f16;
                    float f19 = mediaEntity.f18080y;
                    float f20 = mediaEntity.height;
                    float f21 = (f20 / 2.0f) + f19;
                    float f22 = this.transformedWidth;
                    float f23 = this.transformedHeight;
                    float f24 = (f17 * f22) / f23;
                    float f25 = (f20 * f23) / f22;
                    mediaEntity.width = f25;
                    mediaEntity.height = f24;
                    mediaEntity.f18079x = f18 - (f25 / 2.0f);
                    mediaEntity.f18080y = f21 - (f24 / 2.0f);
                }
                applyRoundRadius(mediaEntity, mediaEntity.bitmap, 0);
                return;
            }
            if (mediaEntity.bitmap != null) {
                float width2 = bitmap.getWidth() / mediaEntity.bitmap.getHeight();
                if (width2 > 1.0f) {
                    float f26 = mediaEntity.height;
                    float f27 = f26 / width2;
                    mediaEntity.f18080y = e2.c.x(f26, f27, 2.0f, mediaEntity.f18080y);
                    mediaEntity.height = f27;
                } else if (width2 < 1.0f) {
                    float f28 = mediaEntity.width;
                    float f29 = width2 * f28;
                    mediaEntity.f18079x = e2.c.x(f28, f29, 2.0f, mediaEntity.f18079x);
                    mediaEntity.width = f29;
                }
            }
        }
    }

    private void initTextEntity(final VideoEditedInfo.MediaEntity mediaEntity) {
        int i10;
        int i11;
        int i12;
        Typeface d;
        final eg.b bVar = new eg.b(ApplicationLoader.applicationContext);
        bVar.getPaint().setAntiAlias(true);
        bVar.drawAnimatedEmojiDrawables = false;
        bVar.setBackgroundColor(0);
        bVar.setPadding(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f));
        s0 s0Var = mediaEntity.textTypeface;
        if (s0Var != null && (d = s0Var.d()) != null) {
            bVar.setTypeface(d);
        }
        bVar.setTextSize(0, mediaEntity.fontSize);
        SpannableString spannableString = new SpannableString(mediaEntity.text);
        ArrayList<VideoEditedInfo.EmojiEntity> arrayList = mediaEntity.entities;
        int size = arrayList.size();
        int i13 = 0;
        while (i13 < size) {
            int i14 = i13 + 1;
            final VideoEditedInfo.EmojiEntity emojiEntity = arrayList.get(i13);
            if (emojiEntity.documentAbsolutePath != null) {
                VideoEditedInfo.MediaEntity mediaEntity2 = new VideoEditedInfo.MediaEntity();
                emojiEntity.entity = mediaEntity2;
                mediaEntity2.text = emojiEntity.documentAbsolutePath;
                mediaEntity2.subType = emojiEntity.subType;
                u5 u5Var = new u5(0L, 1.0f, bVar.getPaint().getFontMetricsInt()) {
                    @Override
                    public void draw(Canvas canvas, CharSequence charSequence, int i15, int i16, float f10, int i17, int i18, int i19, Paint paint) {
                        super.draw(canvas, charSequence, i15, i16, f10, i17, i18, i19, paint);
                        VideoEditedInfo.MediaEntity mediaEntity3 = mediaEntity;
                        float paddingLeft = ((((this.measuredSize / 2.0f) + (bVar.getPaddingLeft() + f10)) / mediaEntity3.viewWidth) * mediaEntity3.width) + mediaEntity.f18079x;
                        float f11 = mediaEntity3.f18080y;
                        VideoEditedInfo.MediaEntity mediaEntity4 = mediaEntity;
                        float f12 = mediaEntity4.height;
                        float paddingTop = (((((i19 - i17) / 2.0f) + (bVar.getPaddingTop() + i17)) / mediaEntity4.viewHeight) * f12) + f11;
                        if (mediaEntity4.rotation != 0.0f) {
                            float f13 = (mediaEntity4.width / 2.0f) + mediaEntity4.f18079x;
                            float f14 = (f12 / 2.0f) + mediaEntity4.f18080y;
                            float f15 = TextureRenderer.this.transformedWidth / TextureRenderer.this.transformedHeight;
                            double d10 = paddingLeft - f13;
                            double d11 = (paddingTop - f14) / f15;
                            paddingLeft = ((float) ((Math.cos(-mediaEntity.rotation) * d10) - (Math.sin(-mediaEntity.rotation) * d11))) + f13;
                            paddingTop = (((float) l.d.a(-mediaEntity.rotation, d11, Math.sin(-mediaEntity.rotation) * d10)) * f15) + f14;
                        }
                        VideoEditedInfo.MediaEntity mediaEntity5 = emojiEntity.entity;
                        int i20 = this.measuredSize;
                        VideoEditedInfo.MediaEntity mediaEntity6 = mediaEntity;
                        float f16 = (i20 / mediaEntity6.viewWidth) * mediaEntity6.width;
                        mediaEntity5.width = f16;
                        float f17 = (i20 / mediaEntity6.viewHeight) * mediaEntity6.height;
                        mediaEntity5.height = f17;
                        mediaEntity5.f18079x = paddingLeft - (f16 / 2.0f);
                        mediaEntity5.f18080y = paddingTop - (f17 / 2.0f);
                        mediaEntity5.rotation = mediaEntity6.rotation;
                        if (mediaEntity5.bitmap == null) {
                            TextureRenderer.this.initStickerEntity(mediaEntity5);
                        }
                    }
                };
                int i15 = emojiEntity.offset;
                spannableString.setSpan(u5Var, i15, emojiEntity.length + i15, 33);
            }
            i13 = i14;
        }
        bVar.setText(Emoji.replaceEmoji(spannableString, bVar.getPaint().getFontMetricsInt(), false));
        bVar.setTextColor(mediaEntity.color);
        Editable text = bVar.getText();
        if (text != null) {
            for (Emoji.EmojiSpan emojiSpan : (Emoji.EmojiSpan[]) text.getSpans(0, text.length(), Emoji.EmojiSpan.class)) {
                emojiSpan.scale = 0.85f;
            }
        }
        int i16 = mediaEntity.textAlign;
        if (i16 != 1) {
            if (i16 != 2) {
                i10 = 19;
            } else {
                i10 = 21;
            }
        } else {
            i10 = 17;
        }
        bVar.setGravity(i10);
        int i17 = Build.VERSION.SDK_INT;
        int i18 = mediaEntity.textAlign;
        if (i18 != 1) {
            if (i18 == 2 ? !LocaleController.isRTL : LocaleController.isRTL) {
                i11 = 3;
            } else {
                i11 = 2;
            }
        } else {
            i11 = 4;
        }
        bVar.setTextAlignment(i11);
        bVar.setHorizontallyScrolling(false);
        bVar.setImeOptions(268435456);
        bVar.setFocusableInTouchMode(true);
        bVar.setInputType(bVar.getInputType() | 16384);
        if (i17 >= 23) {
            setBreakStrategy(bVar);
        }
        byte b10 = mediaEntity.subType;
        int i19 = -1;
        if (b10 == 0) {
            bVar.setFrameColor(mediaEntity.color);
            if (AndroidUtilities.computePerceivedBrightness(mediaEntity.color) >= 0.721f) {
                i19 = -16777216;
            }
            bVar.setTextColor(i19);
        } else if (b10 == 1) {
            if (AndroidUtilities.computePerceivedBrightness(mediaEntity.color) >= 0.25f) {
                i12 = -1728053248;
            } else {
                i12 = -1711276033;
            }
            bVar.setFrameColor(i12);
            bVar.setTextColor(mediaEntity.color);
        } else if (b10 == 2) {
            if (AndroidUtilities.computePerceivedBrightness(mediaEntity.color) >= 0.25f) {
                i19 = -16777216;
            }
            bVar.setFrameColor(i19);
            bVar.setTextColor(mediaEntity.color);
        } else if (b10 == 3) {
            bVar.setFrameColor(0);
            bVar.setTextColor(mediaEntity.color);
        }
        bVar.measure(View.MeasureSpec.makeMeasureSpec(mediaEntity.viewWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(mediaEntity.viewHeight, 1073741824));
        bVar.layout(0, 0, mediaEntity.viewWidth, mediaEntity.viewHeight);
        mediaEntity.bitmap = Bitmap.createBitmap(mediaEntity.viewWidth, mediaEntity.viewHeight, Bitmap.Config.ARGB_8888);
        bVar.draw(new Canvas(mediaEntity.bitmap));
    }

    private boolean isCollage() {
        if (this.collageParts != null) {
            return true;
        }
        return false;
    }

    private void stepCollagePart(int i10, VideoEditedInfo.Part part, long j10) {
        boolean z4;
        float f10;
        Bitmap r10;
        long j11;
        long j12 = (j10 / 1000000) - part.offset;
        float f11 = part.right;
        long j13 = part.duration;
        long clamp = Utilities.clamp(j12, f11 * ((float) j13), part.left * ((float) j13));
        MediaCodecPlayer mediaCodecPlayer = part.player;
        if (mediaCodecPlayer != null) {
            mediaCodecPlayer.ensure(clamp);
            part.surfaceTexture.updateTexImage();
            return;
        }
        y5 y5Var = part.animatedFileDrawable;
        if (y5Var != null) {
            int i11 = y5Var.d[3];
            if (i11 <= 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if ((clamp < i11 || (z4 && clamp > 1000)) && y5Var.f33307a0 != null) {
                y5Var.f33307a0.g(clamp, true);
            }
            do {
                y5 y5Var2 = part.animatedFileDrawable;
                int i12 = y5Var2.d[3];
                f10 = (float) clamp;
                if ((part.msPerFrame * 2.0f) + i12 >= f10) {
                    break;
                }
                j11 = i12;
                if (y5Var2.f33307a0 != null) {
                    y5Var2.f33307a0.c(null, false, y5Var2.f33312d0, y5Var2.f33314e0, false);
                }
            } while (part.animatedFileDrawable.d[3] != j11);
            if ((z4 || f10 > part.animatedFileDrawable.d[3] - (part.msPerFrame / 2.0f)) && (r10 = part.animatedFileDrawable.r(false)) != null) {
                GLES20.glBindTexture(3553, this.collageTextures[i10]);
                GLUtils.texImage2D(3553, 0, r10, 0);
            }
        }
    }

    public void changeFragmentShader(String str, String str2, boolean z4) {
        String str3;
        int createProgram;
        int createProgram2;
        if (this.messageVideoMaskPath != null) {
            if (z4) {
                str3 = "#version 320 es\nuniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nin vec4 aPosition;\nin vec4 aTextureCoord;\nin vec4 mTextureCoord;\nout vec2 vTextureCoord;\nout vec2 MTextureCoord;\nvoid main() {\n  gl_Position = uMVPMatrix * aPosition;\n  vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n  MTextureCoord = (uSTMatrix * mTextureCoord).xy;\n}\n";
            } else {
                str3 = "uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nattribute vec4 mTextureCoord;\nvarying vec2 vTextureCoord;\nvarying vec2 MTextureCoord;\nvoid main() {\n  gl_Position = uMVPMatrix * aPosition;\n  vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n  MTextureCoord = (uSTMatrix * mTextureCoord).xy;\n}\n";
            }
        } else if (z4) {
            str3 = "#version 320 es\nuniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nin vec4 aPosition;\nin vec4 aTextureCoord;\nout vec2 vTextureCoord;\nvoid main() {\n  gl_Position = uMVPMatrix * aPosition;\n  vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n";
        } else {
            str3 = "uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n  gl_Position = uMVPMatrix * aPosition;\n  vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n";
        }
        int i10 = this.NUM_EXTERNAL_SHADER;
        if (i10 >= 0 && i10 < this.mProgram.length && (createProgram2 = createProgram(str3, str, z4)) != 0) {
            GLES20.glDeleteProgram(this.mProgram[this.NUM_EXTERNAL_SHADER]);
            this.mProgram[this.NUM_EXTERNAL_SHADER] = createProgram2;
            this.texSizeHandle = GLES20.glGetUniformLocation(createProgram2, "texSize");
        }
        int i11 = this.NUM_FILTER_SHADER;
        if (i11 >= 0 && i11 < this.mProgram.length && (createProgram = createProgram(str3, str2, z4)) != 0) {
            GLES20.glDeleteProgram(this.mProgram[this.NUM_FILTER_SHADER]);
            this.mProgram[this.NUM_FILTER_SHADER] = createProgram;
        }
    }

    public void drawFrame(SurfaceTexture surfaceTexture, long j10) {
        int i10;
        int i11;
        float[] fArr;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        FloatBuffer floatBuffer;
        boolean z4;
        int i17;
        int i18;
        int i19;
        int[] iArr;
        if (this.isPhoto) {
            drawBackground();
            i14 = 0;
            i10 = 33985;
            i15 = 3042;
            i16 = 33984;
        } else {
            surfaceTexture.getTransformMatrix(this.mSTMatrix);
            if (BuildVars.LOGS_ENABLED && this.firstFrame) {
                StringBuilder sb = new StringBuilder();
                int i20 = 0;
                while (true) {
                    float[] fArr2 = this.mSTMatrix;
                    i10 = 33985;
                    if (i20 >= fArr2.length) {
                        break;
                    }
                    sb.append(fArr2[i20]);
                    sb.append(", ");
                    i20++;
                }
                FileLog.d("stMatrix = " + ((Object) sb));
                this.firstFrame = false;
            } else {
                i10 = 33985;
            }
            if (this.blendEnabled) {
                GLES20.glDisable(3042);
                this.blendEnabled = false;
            }
            b00 b00Var = this.filterShaders;
            if (b00Var != null) {
                b00Var.P0 = this.mSTMatrix;
                b00Var.W0 = false;
                GLES20.glViewport(0, 0, this.originalWidth, this.originalHeight);
                this.filterShaders.f();
                this.filterShaders.d();
                this.filterShaders.e();
                this.filterShaders.c();
                boolean b10 = this.filterShaders.b();
                GLES20.glBindFramebuffer(36160, 0);
                int i21 = this.transformedWidth;
                if (i21 != this.originalWidth || this.transformedHeight != this.originalHeight) {
                    GLES20.glViewport(0, 0, i21, this.transformedHeight);
                }
                int g10 = this.filterShaders.g(!b10);
                int i22 = this.NUM_FILTER_SHADER;
                fArr = this.mSTMatrixIdentity;
                i12 = i22;
                i13 = g10;
                i14 = b10;
                i11 = 3553;
            } else {
                int i23 = this.mTextureID;
                int i24 = this.NUM_EXTERNAL_SHADER;
                i11 = 36197;
                fArr = this.mSTMatrix;
                i12 = i24;
                i13 = i23;
                i14 = 0;
            }
            i15 = 3042;
            drawBackground();
            i16 = 33984;
            GLES20.glUseProgram(this.mProgram[i12]);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(i11, i13);
            if (this.messageVideoMaskPath != null && this.videoMaskTexture != -1) {
                GLES20.glActiveTexture(i10);
                GLES20.glBindTexture(3553, this.videoMaskTexture);
                GLES20.glUniform1i(this.maskTextureHandle[i12], 1);
            }
            GLES20.glVertexAttribPointer(this.maPositionHandle[i12], 2, 5126, false, 8, (Buffer) this.verticesBuffer);
            GLES20.glEnableVertexAttribArray(this.maPositionHandle[i12]);
            int i25 = this.maTextureHandle[i12];
            if (this.useMatrixForImagePath) {
                floatBuffer = this.croppedTextureBuffer;
            } else {
                floatBuffer = this.renderTextureBuffer;
            }
            GLES20.glVertexAttribPointer(i25, 2, 5126, false, 8, (Buffer) floatBuffer);
            GLES20.glEnableVertexAttribArray(this.maTextureHandle[i12]);
            if (this.messageVideoMaskPath != null && this.videoMaskTexture != -1) {
                GLES20.glVertexAttribPointer(this.mmTextureHandle[i12], 2, 5126, false, 8, (Buffer) this.maskTextureBuffer);
                GLES20.glEnableVertexAttribArray(this.mmTextureHandle[i12]);
            }
            int i26 = this.texSizeHandle;
            if (i26 != 0) {
                GLES20.glUniform2f(i26, this.transformedWidth, this.transformedHeight);
            }
            GLES20.glUniformMatrix4fv(this.muSTMatrixHandle[i12], 1, false, fArr, 0);
            GLES20.glUniformMatrix4fv(this.muMVPMatrixHandle[i12], 1, false, this.mMVPMatrix, 0);
            GLES20.glDrawArrays(5, 0, 4);
        }
        if (this.blur != null) {
            if (!this.blendEnabled) {
                GLES20.glEnable(i15);
                GLES20.glBlendFunc(1, 771);
                this.blendEnabled = true;
            }
            if (this.imagePath != null && (iArr = this.paintTexture) != null) {
                i17 = iArr[0];
                i18 = this.imageWidth;
                i19 = this.imageHeight;
            } else {
                b00 b00Var2 = this.filterShaders;
                if (b00Var2 != null) {
                    i17 = b00Var2.g(i14 ^ 1);
                    b00 b00Var3 = this.filterShaders;
                    int i27 = b00Var3.X0;
                    i19 = b00Var3.Y0;
                    i18 = i27;
                } else {
                    i17 = -1;
                    i18 = 1;
                    i19 = 1;
                }
            }
            if (i17 != -1) {
                this.blur.a(null, i17, i18, i19);
                GLES20.glViewport(0, 0, this.transformedWidth, this.transformedHeight);
                GLES20.glBindFramebuffer(36160, 0);
                GLES20.glUseProgram(this.blurShaderProgram);
                GLES20.glEnableVertexAttribArray(this.blurInputTexCoordHandle);
                GLES20.glVertexAttribPointer(this.blurInputTexCoordHandle, 2, 5126, false, 8, (Buffer) this.gradientTextureBuffer);
                GLES20.glEnableVertexAttribArray(this.blurPositionHandle);
                GLES20.glVertexAttribPointer(this.blurPositionHandle, 2, 5126, false, 8, (Buffer) this.blurVerticesBuffer);
                GLES20.glUniform1i(this.blurBlurImageHandle, 0);
                GLES20.glActiveTexture(i16);
                GLES20.glBindTexture(3553, this.blur.f27443s[2]);
                GLES20.glUniform1i(this.blurMaskImageHandle, 1);
                GLES20.glActiveTexture(i10);
                GLES20.glBindTexture(3553, this.blurTexture[0]);
                GLES20.glDrawArrays(5, 0, 4);
            }
        }
        if (isCollage()) {
            for (int i28 = 0; i28 < this.collageParts.size(); i28++) {
                stepCollagePart(i28, this.collageParts.get(i28), j10);
                drawCollagePart(i28, this.collageParts.get(i28), j10);
            }
        }
        if (this.isPhoto || this.paintTexture != null || this.stickerTexture != null) {
            GLES20.glUseProgram(this.simpleShaderProgram);
            GLES20.glActiveTexture(i16);
            GLES20.glUniform1i(this.simpleSourceImageHandle, 0);
            GLES20.glEnableVertexAttribArray(this.simpleInputTexCoordHandle);
            GLES20.glVertexAttribPointer(this.simpleInputTexCoordHandle, 2, 5126, false, 8, (Buffer) this.textureBuffer);
            GLES20.glEnableVertexAttribArray(this.simplePositionHandle);
        }
        if (this.imagePathIndex >= 0 && !isCollage()) {
            int i29 = this.paintTexture[this.imagePathIndex];
            if (this.useMatrixForImagePath && this.isPhoto) {
                z4 = true;
            } else {
                z4 = false;
            }
            drawTexture(true, i29, -10000.0f, -10000.0f, -10000.0f, -10000.0f, 0.0f, false, z4, -1);
        }
        int i30 = this.paintPathIndex;
        if (i30 >= 0) {
            drawTexture(true, this.paintTexture[i30], -10000.0f, -10000.0f, -10000.0f, -10000.0f, 0.0f, false, false, -1);
        }
        int i31 = this.messagePathIndex;
        if (i31 >= 0) {
            drawTexture(true, this.paintTexture[i31], -10000.0f, -10000.0f, -10000.0f, -10000.0f, 0.0f, false, false, -1);
        }
        if (this.stickerTexture != null) {
            int size = this.mediaEntities.size();
            for (int i32 = 0; i32 < size; i32++) {
                drawEntity(this.mediaEntities.get(i32), this.mediaEntities.get(i32).color, j10);
            }
        }
        GLES20.glFinish();
    }

    public int getTextureId() {
        return this.mTextureID;
    }

    public void release() {
        ArrayList<VideoEditedInfo.MediaEntity> arrayList = this.mediaEntities;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                VideoEditedInfo.MediaEntity mediaEntity = this.mediaEntities.get(i10);
                RLottieNative rLottieNative = mediaEntity.lottieNative;
                if (rLottieNative != null) {
                    rLottieNative.d();
                }
                y5 y5Var = mediaEntity.animatedFileDrawable;
                if (y5Var != null) {
                    y5Var.u();
                }
                View view = mediaEntity.view;
                if (view instanceof zt) {
                    ((zt) view).recycleEmojis();
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
            int size2 = arrayList2.size();
            int i11 = 0;
            while (i11 < size2) {
                arrayList2.get(i11);
                i11++;
                for (int i12 = 0; i12 < this.collageParts.size(); i12++) {
                    destroyCollagePart(i12, this.collageParts.get(i12));
                }
            }
        }
    }

    public void setBreakStrategy(eg.b bVar) {
        bVar.setBreakStrategy(0);
    }

    public void surfaceCreated() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.video.TextureRenderer.surfaceCreated():void");
    }

    private void drawTexture(boolean z4, int i10, float f10, float f11, float f12, float f13, float f14, boolean z10) {
        drawTexture(z4, i10, f10, f11, f12, f13, f14, z10, false, -1);
    }

    private void drawTexture(boolean z4, int i10, float f10, float f11, float f12, float f13, float f14, boolean z10, boolean z11, int i11) {
        if (!this.blendEnabled) {
            GLES20.glEnable(3042);
            GLES20.glBlendFunc(1, 771);
            this.blendEnabled = true;
        }
        if (f10 <= -10000.0f) {
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
            float f15 = (f10 * 2.0f) - 1.0f;
            float f16 = ((1.0f - f11) * 2.0f) - 1.0f;
            float[] fArr2 = this.bitmapData;
            fArr2[0] = f15;
            fArr2[1] = f16;
            float f17 = (f12 * 2.0f) + f15;
            fArr2[2] = f17;
            fArr2[3] = f16;
            fArr2[4] = f15;
            float f18 = f16 - (f13 * 2.0f);
            fArr2[5] = f18;
            fArr2[6] = f17;
            fArr2[7] = f18;
        }
        float[] fArr3 = this.bitmapData;
        float f19 = fArr3[0];
        float f20 = fArr3[2];
        float f21 = (f19 + f20) / 2.0f;
        if (z10) {
            fArr3[2] = f19;
            fArr3[0] = f20;
            float f22 = fArr3[6];
            fArr3[6] = fArr3[4];
            fArr3[4] = f22;
        }
        if (f14 != 0.0f) {
            float f23 = this.transformedWidth / this.transformedHeight;
            float f24 = (fArr3[5] + fArr3[1]) / 2.0f;
            int i12 = 0;
            for (int i13 = 4; i12 < i13; i13 = 4) {
                float[] fArr4 = this.bitmapData;
                int i14 = i12 * 2;
                int i15 = i14 + 1;
                double d = fArr4[i14] - f21;
                double d10 = f14;
                float f25 = f21;
                double d11 = (fArr4[i15] - f24) / f23;
                fArr4[i14] = ((float) ((Math.cos(d10) * d) - (Math.sin(d10) * d11))) + f25;
                this.bitmapData[i15] = (((float) l.d.a(d10, d11, Math.sin(d10) * d)) * f23) + f24;
                i12++;
                f21 = f25;
            }
        }
        this.bitmapVerticesBuffer.put(this.bitmapData).position(0);
        GLES20.glVertexAttribPointer(this.simplePositionHandle, 2, 5126, false, 8, (Buffer) (z11 ? this.verticesBuffer : this.bitmapVerticesBuffer));
        GLES20.glEnableVertexAttribArray(this.simpleInputTexCoordHandle);
        GLES20.glVertexAttribPointer(this.simpleInputTexCoordHandle, 2, 5126, false, 8, (Buffer) (z11 ? this.croppedTextureBuffer : this.textureBuffer));
        if (z4) {
            GLES20.glBindTexture(3553, i10);
        }
        GLES20.glDrawArrays(5, 0, 4);
    }
}

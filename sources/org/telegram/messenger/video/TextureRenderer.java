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
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.Pair;
import android.view.Surface;
import android.view.View;
import fi.s;
import fi.t;
import java.io.File;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.f6;
import org.telegram.messenger.g0;
import org.telegram.messenger.g20;
import org.telegram.messenger.h20;
import org.telegram.messenger.i20;
import org.telegram.messenger.i6;
import org.telegram.messenger.id;
import org.telegram.messenger.k5;
import org.telegram.messenger.p10;
import org.telegram.messenger.r2;
import org.telegram.messenger.t0;
import org.telegram.messenger.ye;
import org.telegram.ui.Components.RLottieNative;
import org.telegram.ui.Components.da;
import org.telegram.ui.Components.dt;
import org.telegram.ui.Components.i5;
import org.telegram.ui.Components.r5;
import org.telegram.ui.Components.s5;
import org.telegram.ui.Components.v5;
import org.telegram.ui.Components.wy;
import org.telegram.ui.Components.xq;
import sg.b0;
import tg.i0;
import tg.m0;
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
    private da blur;
    private int blurBlurImageHandle;
    private int blurInputTexCoordHandle;
    private int blurMaskImageHandle;
    private String blurPath;
    private int blurPositionHandle;
    private int blurShaderProgram;
    private int[] blurTexture;
    private FloatBuffer blurVerticesBuffer;
    private ArrayList<i20> collageParts;
    private int[] collageTextures;
    private final ye cropState;
    private FloatBuffer croppedTextureBuffer;
    private ArrayList<i5> emojiDrawables;
    private wy filterShaders;
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
    private ArrayList<h20> mediaEntities;
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

    public TextureRenderer(org.telegram.messenger.hf r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, java.util.ArrayList<org.telegram.messenger.h20> r34, org.telegram.messenger.ye r35, int r36, int r37, int r38, int r39, int r40, float r41, boolean r42, java.lang.Integer r43, java.lang.Integer r44, fi.d7 r45, org.telegram.messenger.video.MediaCodecVideoConvertor.ConvertVideoParams r46) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.video.TextureRenderer.<init>(org.telegram.messenger.hf, java.lang.String, java.lang.String, java.lang.String, java.util.ArrayList, org.telegram.messenger.ye, int, int, int, int, int, float, boolean, java.lang.Integer, java.lang.Integer, fi.d7, org.telegram.messenger.video.MediaCodecVideoConvertor$ConvertVideoParams):void");
    }

    private void applyRoundRadius(h20 h20Var, Bitmap bitmap, int i7) {
        if (bitmap != null && h20Var != null) {
            if (h20Var.f22829s != 0.0f || i7 != 0) {
                if (h20Var.L == null) {
                    h20Var.L = new Canvas(bitmap);
                }
                if (h20Var.f22829s != 0.0f) {
                    if (this.path == null) {
                        this.path = new Path();
                    }
                    if (this.xRefPaint == null) {
                        Paint paint = new Paint(1);
                        this.xRefPaint = paint;
                        paint.setColor(-16777216);
                        this.xRefPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                    }
                    float min = Math.min(bitmap.getWidth(), bitmap.getHeight()) * h20Var.f22829s;
                    this.path.rewind();
                    this.path.addRoundRect(new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight()), min, min, Path.Direction.CCW);
                    this.path.toggleInverseFillType();
                    h20Var.L.drawPath(this.path, this.xRefPaint);
                }
                if (i7 != 0) {
                    if (this.textColorPaint == null) {
                        Paint paint2 = new Paint(1);
                        this.textColorPaint = paint2;
                        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
                    }
                    this.textColorPaint.setColor(i7);
                    h20Var.L.drawRect(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight(), this.textColorPaint);
                }
            }
        }
    }

    private int createProgram(String str, String str2, boolean z9) {
        int h;
        int glCreateProgram;
        int h7;
        int glCreateProgram2;
        if (z9) {
            int h10 = wy.h(35633, str);
            if (h10 == 0 || (h7 = wy.h(35632, str2)) == 0 || (glCreateProgram2 = GLES20.glCreateProgram()) == 0) {
                return 0;
            }
            GLES20.glAttachShader(glCreateProgram2, h10);
            GLES20.glAttachShader(glCreateProgram2, h7);
            GLES20.glLinkProgram(glCreateProgram2);
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(glCreateProgram2, 35714, iArr, 0);
            if (iArr[0] != 1) {
                GLES20.glDeleteProgram(glCreateProgram2);
                return 0;
            }
            return glCreateProgram2;
        }
        int h11 = wy.h(35633, str);
        if (h11 == 0 || (h = wy.h(35632, str2)) == 0 || (glCreateProgram = GLES20.glCreateProgram()) == 0) {
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

    private void destroyCollagePart(int i7, i20 i20Var) {
        if (i20Var != null) {
            v5 v5Var = i20Var.f23034u;
            if (v5Var != null) {
                v5Var.u();
                i20Var.f23034u = null;
            }
            MediaCodecPlayer mediaCodecPlayer = i20Var.B;
            if (mediaCodecPlayer != null) {
                mediaCodecPlayer.release();
                i20Var.B = null;
            }
            SurfaceTexture surfaceTexture = i20Var.f23035z;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                i20Var.f23035z = null;
            }
        }
    }

    private void drawBackground() {
        int i7 = this.NUM_GRADIENT_SHADER;
        if (i7 >= 0) {
            GLES20.glUseProgram(this.mProgram[i7]);
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

    private void drawCollagePart(int i7, i20 i20Var, long j3) {
        if (i20Var.B != null && i20Var.f23021b) {
            GLES20.glUseProgram(this.simpleShaderProgramOES);
            GLES20.glActiveTexture(33987);
            GLES20.glBindTexture(36197, this.collageTextures[i7]);
            GLES20.glUniform1i(this.simpleSourceImageHandleOES, 3);
            GLES20.glEnableVertexAttribArray(this.simpleInputTexCoordHandleOES);
            GLES20.glVertexAttribPointer(this.simpleInputTexCoordHandleOES, 2, 5126, false, 8, (Buffer) i20Var.f23033t);
            GLES20.glEnableVertexAttribArray(this.simplePositionHandleOES);
            GLES20.glVertexAttribPointer(this.simplePositionHandleOES, 2, 5126, false, 8, (Buffer) i20Var.f23032s);
        } else {
            GLES20.glUseProgram(this.simpleShaderProgram);
            GLES20.glActiveTexture(33986);
            GLES20.glBindTexture(3553, this.collageTextures[i7]);
            GLES20.glUniform1i(this.simpleSourceImageHandle, 2);
            GLES20.glEnableVertexAttribArray(this.simpleInputTexCoordHandle);
            GLES20.glVertexAttribPointer(this.simpleInputTexCoordHandle, 2, 5126, false, 8, (Buffer) i20Var.f23033t);
            GLES20.glEnableVertexAttribArray(this.simplePositionHandle);
            GLES20.glVertexAttribPointer(this.simplePositionHandle, 2, 5126, false, 8, (Buffer) i20Var.f23032s);
        }
        GLES20.glDrawArrays(5, 0, 4);
    }

    private void drawEntity(h20 h20Var, int i7, long j3) {
        h20 h20Var2;
        boolean z9;
        Bitmap bitmap;
        Bitmap bitmap2;
        int i10;
        boolean z10;
        long j10;
        long j11;
        long k10;
        int i11;
        boolean z11;
        RLottieNative rLottieNative = h20Var.D;
        if (rLottieNative != null) {
            Bitmap bitmap3 = h20Var.G;
            if (bitmap3 != null && h20Var.U > 0 && h20Var.V > 0) {
                rLottieNative.c((int) h20Var.E, bitmap3, true);
                Bitmap bitmap4 = h20Var.G;
                if ((h20Var.f22814b & 8) != 0) {
                    i11 = i7;
                } else {
                    i11 = 0;
                }
                applyRoundRadius(h20Var, bitmap4, i11);
                GLES20.glBindTexture(3553, this.stickerTexture[0]);
                GLUtils.texImage2D(3553, 0, h20Var.G, 0);
                float f10 = h20Var.E + h20Var.F;
                h20Var.E = f10;
                if (f10 >= h20Var.D.f31473a[0]) {
                    h20Var.E = 0.0f;
                }
                int i12 = this.stickerTexture[0];
                float f11 = h20Var.f22815c;
                float f12 = h20Var.d;
                float f13 = h20Var.f22817f;
                float f14 = h20Var.f22818g;
                float f15 = h20Var.f22816e;
                if ((2 & h20Var.f22814b) != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                drawTexture(false, i12, f11, f12, f13, f14, f15, z11);
            }
        } else if (h20Var.J != null) {
            float f16 = h20Var.E;
            int i13 = (int) f16;
            float f17 = 1.0f;
            if (h20Var.f22813a == 5) {
                if (this.isPhoto) {
                    j10 = h20Var.T;
                    j11 = 0;
                } else {
                    long j12 = h20Var.Q;
                    j10 = (h20Var.S - h20Var.R) + j12;
                    j11 = j12;
                }
                long j13 = j3 / 1000000;
                if (j13 < j11) {
                    f17 = xq.h.getInterpolation(Utilities.i(1.0f - (((float) (j11 - j13)) / 400.0f), 1.0f, 0.0f));
                } else if (j13 > j10) {
                    f17 = xq.h.getInterpolation(Utilities.i(1.0f - (((float) (j13 - j10)) / 400.0f), 1.0f, 0.0f));
                }
                if (f17 > 0.0f) {
                    if (this.isPhoto) {
                        k10 = Utilities.k(j13, h20Var.T, 0L);
                    } else {
                        k10 = Utilities.k((j13 - h20Var.Q) + h20Var.R, h20Var.T, 0L);
                    }
                    while (!h20Var.K) {
                        int[] iArr = h20Var.J.d;
                        if (iArr[3] >= Math.min(k10, iArr[4])) {
                            break;
                        }
                        v5 v5Var = h20Var.J;
                        int i14 = v5Var.d[3];
                        v5Var.r(false);
                        int i15 = h20Var.J.d[3];
                        if (i15 <= i14 && (i15 != 0 || i14 != 0)) {
                            h20Var.K = true;
                            break;
                        }
                    }
                }
            } else {
                float f18 = f16 + h20Var.F;
                h20Var.E = f18;
                for (int i16 = (int) f18; i13 != i16; i16--) {
                    h20Var.J.r(true);
                }
            }
            s5 s5Var = h20Var.J.f38886w;
            if (s5Var != null) {
                bitmap = s5Var.f37922b;
            } else {
                bitmap = null;
            }
            if (bitmap != null) {
                if (h20Var.f22813a == 5) {
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
                        if ((h20Var.f22814b & 8) != 0) {
                            i10 = i7;
                        } else {
                            i10 = 0;
                        }
                        applyRoundRadius(h20Var, bitmap7, i10);
                    }
                    bitmap2 = this.stickerBitmap;
                }
                if (bitmap2 != null) {
                    GLES20.glBindTexture(3553, this.stickerTexture[0]);
                    GLUtils.texImage2D(3553, 0, bitmap2, 0);
                    int i17 = this.stickerTexture[0];
                    float f19 = h20Var.f22815c;
                    float f20 = h20Var.d;
                    float f21 = h20Var.f22817f;
                    float f22 = h20Var.f22818g;
                    float f23 = h20Var.f22816e;
                    if ((h20Var.f22814b & 2) != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    drawTexture(false, i17, f19, f20, f21, f22, f23, z10);
                }
            }
        } else {
            if (h20Var.G != null) {
                GLES20.glBindTexture(3553, this.stickerTexture[0]);
                GLUtils.texImage2D(3553, 0, h20Var.G, 0);
                int i18 = this.stickerTexture[0];
                float f24 = h20Var.f22815c;
                float f25 = h20Var.h;
                float f26 = f24 - (f25 / 2.0f);
                float f27 = h20Var.d;
                float f28 = h20Var.f22819i;
                float f29 = f27 - (f28 / 2.0f);
                float f30 = h20Var.f22817f + f25;
                float f31 = f28 + h20Var.f22818g;
                float f32 = h20Var.f22816e;
                if (h20Var.f22813a == 2 && (h20Var.f22814b & 2) != 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                drawTexture(false, i18, f26, f29, f30, f31, f32, z9);
            }
            ArrayList arrayList = h20Var.f22821k;
            if (arrayList != null && !arrayList.isEmpty()) {
                for (int i19 = 0; i19 < h20Var.f22821k.size(); i19++) {
                    g20 g20Var = (g20) h20Var.f22821k.get(i19);
                    if (g20Var != null && (h20Var2 = g20Var.f22586b) != null) {
                        drawEntity(h20Var2, h20Var.f22822l, j3);
                    }
                }
            }
        }
    }

    private void drawTexture(boolean z9, int i7) {
        drawTexture(z9, i7, -10000.0f, -10000.0f, -10000.0f, -10000.0f, 0.0f, false);
    }

    private FloatBuffer floats(float[] fArr) {
        FloatBuffer g10 = org.telegram.messenger.camera.q.g(ByteBuffer.allocateDirect(fArr.length * 4));
        g10.put(fArr).position(0);
        return g10;
    }

    private void initCollagePart(int i7, i20 i20Var) {
        float f10;
        t tVar;
        AtomicInteger atomicInteger = new AtomicInteger(i20Var.f23028l);
        AtomicInteger atomicInteger2 = new AtomicInteger(i20Var.f23029m);
        AtomicInteger atomicInteger3 = new AtomicInteger(0);
        if (i20Var.f23021b) {
            GLES20.glBindTexture(36197, this.collageTextures[i7]);
            GLES20.glTexParameteri(36197, 10241, 9728);
            GLES20.glTexParameteri(36197, 10240, 9728);
            GLES20.glTexParameteri(36197, 10242, 33071);
            GLES20.glTexParameteri(36197, 10243, 33071);
            SurfaceTexture surfaceTexture = new SurfaceTexture(this.collageTextures[i7]);
            i20Var.f23035z = surfaceTexture;
            surfaceTexture.setDefaultBufferSize(i20Var.f23028l, i20Var.f23029m);
            try {
                i20Var.B = new MediaCodecPlayer(i20Var.d, new Surface(i20Var.f23035z));
            } catch (Exception e10) {
                a8.g(e10, true);
                i20Var.B = null;
            }
            MediaCodecPlayer mediaCodecPlayer = i20Var.B;
            if (mediaCodecPlayer != null) {
                atomicInteger.set(mediaCodecPlayer.getOrientedWidth());
                atomicInteger2.set(i20Var.B.getOrientedHeight());
                atomicInteger3.set(i20Var.B.getOrientation());
            } else {
                i20Var.f23035z.release();
                i20Var.f23035z = null;
                GLES20.glDeleteTextures(1, this.collageTextures, i7);
                GLES20.glGenTextures(1, this.collageTextures, i7);
                GLES20.glBindTexture(3553, this.collageTextures[i7]);
                GLES20.glTexParameteri(3553, 10241, 9729);
                GLES20.glTexParameteri(3553, 10240, 9729);
                GLES20.glTexParameteri(3553, 10242, 33071);
                GLES20.glTexParameteri(3553, 10243, 33071);
                v5 v5Var = new v5(new File(i20Var.d), true, 0L, 0, null, null, null, 0L, p10.f24470s0, true, 512, 512, null, 0, true);
                i20Var.f23034u = v5Var;
                if (v5Var.f38890y && v5Var.f38865e0) {
                    throw new RuntimeException("Failed to decode with ffmpeg software codecs");
                }
                i20Var.v = 1000.0f / v5Var.d[5];
                Bitmap r10 = v5Var.r(false);
                if (r10 != null) {
                    GLUtils.texImage2D(3553, 0, r10, 0);
                }
                atomicInteger.set(i20Var.f23034u.getIntrinsicWidth());
                atomicInteger2.set(i20Var.f23034u.getIntrinsicHeight());
                atomicInteger3.set(i20Var.f23034u.d[2]);
            }
        } else {
            GLES20.glBindTexture(3553, this.collageTextures[i7]);
            GLES20.glTexParameteri(3553, 10241, 9729);
            GLES20.glTexParameteri(3553, 10240, 9729);
            GLES20.glTexParameteri(3553, 10242, 33071);
            GLES20.glTexParameteri(3553, 10243, 33071);
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inMutable = true;
            Bitmap decodeFile = BitmapFactory.decodeFile(i20Var.d, options);
            Pair N0 = g0.N0(i20Var.d);
            if (((Integer) N0.first).intValue() != 0 || ((Integer) N0.second).intValue() != 0) {
                Matrix matrix = new Matrix();
                if (((Integer) N0.second).intValue() != 0) {
                    float f11 = -1.0f;
                    if (((Integer) N0.second).intValue() == 1) {
                        f10 = -1.0f;
                    } else {
                        f10 = 1.0f;
                    }
                    if (((Integer) N0.second).intValue() != 2) {
                        f11 = 1.0f;
                    }
                    matrix.postScale(f10, f11);
                }
                if (((Integer) N0.first).intValue() != 0) {
                    matrix.postRotate(((Integer) N0.first).intValue());
                }
                decodeFile = Bitmap.createBitmap(decodeFile, 0, 0, decodeFile.getWidth(), decodeFile.getHeight(), matrix, true);
            }
            Bitmap bitmap = decodeFile;
            GLUtils.texImage2D(3553, 0, bitmap, 0);
            atomicInteger.set(bitmap.getWidth());
            atomicInteger2.set(bitmap.getHeight());
        }
        float a10 = i20Var.f23031r.a(2.0f) - 1.0f;
        s sVar = i20Var.f23031r;
        s sVar2 = i20Var.f23031r;
        s sVar3 = i20Var.f23031r;
        s sVar4 = i20Var.f23031r;
        int i10 = sVar4.f12763a.f12827c;
        int i11 = sVar4.f12765c;
        float[] fArr = {a10, -(((2.0f / sVar.f12763a.f12827c) * sVar.f12765c) - 1.0f), sVar.b(2.0f) - 1.0f, -(((2.0f / sVar2.f12763a.f12827c) * sVar2.f12765c) - 1.0f), sVar2.a(2.0f) - 1.0f, -(((2.0f / sVar3.f12763a.f12827c) * (sVar3.f12765c + 1)) - 1.0f), sVar3.b(2.0f) - 1.0f, -(((2.0f / i10) * (i11 + 1)) - 1.0f)};
        float f12 = this.transformedWidth / tVar.d[i11];
        float f13 = this.transformedHeight / i10;
        int i12 = atomicInteger.get();
        int i13 = atomicInteger2.get();
        int i14 = atomicInteger3.get();
        float f14 = i12;
        float f15 = i13;
        float max = 1.0f / Math.max(f12 / f14, f13 / f15);
        float f16 = ((f12 * max) / f14) / 2.0f;
        float f17 = ((f13 * max) / f15) / 2.0f;
        if ((i14 / 90) % 2 != 1) {
            f17 = f16;
            f16 = f17;
        }
        float f18 = 0.5f - f17;
        float f19 = 0.5f - f16;
        float f20 = f17 + 0.5f;
        float f21 = f16 + 0.5f;
        float[] fArr2 = {f18, f19, f20, f19, f18, f21, f20, f21};
        while (i14 > 0) {
            float f22 = fArr2[0];
            float f23 = fArr2[1];
            fArr2[0] = fArr2[4];
            fArr2[1] = fArr2[5];
            fArr2[4] = fArr2[6];
            fArr2[5] = fArr2[7];
            fArr2[6] = fArr2[2];
            fArr2[7] = fArr2[3];
            fArr2[2] = f22;
            fArr2[3] = f23;
            i14 -= 90;
        }
        while (i14 < 0) {
            float f24 = fArr2[0];
            float f25 = fArr2[1];
            fArr2[0] = fArr2[2];
            fArr2[1] = fArr2[3];
            fArr2[2] = fArr2[6];
            fArr2[3] = fArr2[7];
            fArr2[6] = fArr2[4];
            fArr2[7] = fArr2[5];
            fArr2[4] = f24;
            fArr2[5] = f25;
            i14 += 90;
        }
        i20Var.f23032s = floats(fArr);
        i20Var.f23033t = floats(fArr2);
    }

    private void initLinkEntity(h20 h20Var) {
        i0 i0Var = new i0(t0.f25566b, h20Var.P);
        i0Var.U = true;
        i0Var.b(p10.f24470s0, h20Var.W, false);
        if (i0Var.e()) {
            i0Var.setPreviewType(h20Var.f22814b);
        } else {
            i0Var.c(h20Var.f22814b, h20Var.f22822l);
        }
        int i7 = h20Var.f22827q;
        int i10 = i0Var.f55735f;
        i0Var.setMaxWidth(i7 + i10 + i10);
        i0Var.measure(View.MeasureSpec.makeMeasureSpec(h20Var.f22827q, 1073741824), View.MeasureSpec.makeMeasureSpec(h20Var.f22828r, 1073741824));
        i0Var.layout(0, 0, h20Var.f22827q, h20Var.f22828r);
        float f10 = h20Var.f22817f * this.transformedWidth;
        int i11 = h20Var.f22827q;
        float f11 = f10 / i11;
        h20Var.G = Bitmap.createBitmap(((int) (i11 * f11)) + 16, ((int) (h20Var.f22828r * f11)) + 16, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(h20Var.G);
        float f12 = 8;
        canvas.translate(f12, f12);
        canvas.scale(f11, f11);
        i0Var.draw(canvas);
        float f13 = 16 * f11;
        h20Var.h = f13 / this.transformedWidth;
        h20Var.f22819i = f13 / this.transformedHeight;
    }

    private void initLocationEntity(h20 h20Var) {
        float f10;
        float f11;
        byte b10 = h20Var.f22813a;
        m0 m0Var = new m0(t0.f25566b, h20Var.P);
        m0Var.setIsVideo(true);
        m0Var.setText(h20Var.f22820j);
        m0Var.e(h20Var.f22814b, h20Var.f22822l);
        if (h20Var.O != null && h20Var.f22821k.isEmpty()) {
            m0Var.d(p10.f24470s0, h20Var.O.f12823c);
        }
        m0Var.setMaxWidth(h20Var.f22827q);
        if (h20Var.f22821k.size() == 1) {
            m0Var.f55839y = true;
            m0Var.f55831c = true;
            m0Var.requestLayout();
        }
        m0Var.measure(View.MeasureSpec.makeMeasureSpec(h20Var.f22827q, 1073741824), View.MeasureSpec.makeMeasureSpec(h20Var.f22828r, 1073741824));
        m0Var.layout(0, 0, h20Var.f22827q, h20Var.f22828r);
        float f12 = h20Var.f22817f * this.transformedWidth;
        float f13 = h20Var.f22827q;
        float f14 = f12 / f13;
        h20Var.G = Bitmap.createBitmap(((int) (f13 * f14)) + 16, ((int) (h20Var.f22828r * f14)) + 16, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(h20Var.G);
        float f15 = 8;
        canvas.translate(f15, f15);
        canvas.scale(f14, f14);
        m0Var.draw(canvas);
        float f16 = 16 * f14;
        h20Var.h = f16 / this.transformedWidth;
        h20Var.f22819i = f16 / this.transformedHeight;
        if (h20Var.f22821k.size() == 1) {
            g20 g20Var = (g20) h20Var.f22821k.get(0);
            h20 h20Var2 = new h20();
            g20Var.f22586b = h20Var2;
            h20Var2.f22820j = g20Var.f22585a;
            h20Var2.f22814b = g20Var.f22587c;
            RectF rectF = new RectF();
            float f17 = m0Var.I;
            float f18 = m0Var.d.left + 2.25f;
            float f19 = m0Var.D;
            float f20 = m0Var.J;
            float f21 = m0Var.N;
            float f22 = f19 * 21.33f;
            rectF.set((f18 * f19) + f17, com.google.android.recaptcha.internal.a.A(f21, f22, 2.0f, f20), org.telegram.messenger.camera.q.b(f18, 21.33f, f19, f17), k5.a(f22, f21, 2.0f, f20));
            float centerX = ((rectF.centerX() / h20Var.f22827q) * h20Var.f22817f) + h20Var.f22815c;
            float f23 = h20Var.d;
            float centerY = rectF.centerY() / h20Var.f22828r;
            float f24 = h20Var.f22818g;
            float f25 = (centerY * f24) + f23;
            if (h20Var.f22816e != 0.0f) {
                float f26 = (h20Var.f22817f / 2.0f) + h20Var.f22815c;
                float f27 = (f24 / 2.0f) + h20Var.d;
                float f28 = this.transformedWidth / this.transformedHeight;
                double d = centerX - f26;
                double d2 = (f25 - f27) / f28;
                f11 = 2.0f;
                float cos = ((float) ((Math.cos(-f10) * d) - (Math.sin(-h20Var.f22816e) * d2))) + f26;
                f25 = (((float) jg.g.d(-h20Var.f22816e, d2, Math.sin(-h20Var.f22816e) * d)) * f28) + f27;
                centerX = cos;
            } else {
                f11 = 2.0f;
            }
            g20Var.f22586b.f22817f = (rectF.width() / h20Var.f22827q) * h20Var.f22817f;
            g20Var.f22586b.f22818g = (rectF.height() / h20Var.f22828r) * h20Var.f22818g;
            h20 h20Var3 = g20Var.f22586b;
            float f29 = h20Var3.f22817f * 1.2f;
            h20Var3.f22817f = f29;
            float f30 = h20Var3.f22818g * 1.2f;
            h20Var3.f22818g = f30;
            h20Var3.f22815c = centerX - (f29 / f11);
            h20Var3.d = f25 - (f30 / f11);
            h20Var3.f22816e = h20Var.f22816e;
            initStickerEntity(h20Var3);
        }
    }

    public void initStickerEntity(h20 h20Var) {
        Bitmap bitmap;
        ye yeVar;
        ye yeVar2;
        int i7;
        int i10 = (int) (h20Var.f22817f * this.transformedWidth);
        h20Var.U = i10;
        int i11 = (int) (h20Var.f22818g * this.transformedHeight);
        h20Var.V = i11;
        if (i10 > 512) {
            h20Var.V = (int) ((i11 / i10) * 512.0f);
            h20Var.U = 512;
        }
        int i12 = h20Var.V;
        if (i12 > 512) {
            h20Var.U = (int) ((h20Var.U / i12) * 512.0f);
            h20Var.V = 512;
        }
        byte b10 = h20Var.f22814b;
        float f10 = 0.0f;
        if ((b10 & 1) != 0) {
            int i13 = h20Var.U;
            if (i13 > 0 && (i7 = h20Var.V) > 0) {
                h20Var.G = Bitmap.createBitmap(i13, i7, Bitmap.Config.ARGB_8888);
                RLottieNative a10 = RLottieNative.a(h20Var.f22820j, null, null, null, 0, null);
                h20Var.D = a10;
                if (a10 != null) {
                    f10 = a10.f31473a[1] / this.videoFps;
                }
                h20Var.F = f10;
            }
        } else if ((b10 & 4) != 0) {
            h20Var.K = false;
            v5 v5Var = new v5(new File(h20Var.f22820j), true, 0L, 0, null, null, null, 0L, p10.f24470s0, true, 512, 512, null, 0, true);
            h20Var.J = v5Var;
            h20Var.F = v5Var.d[5] / this.videoFps;
            h20Var.E = 1.0f;
            v5Var.r(true);
        } else {
            String str = h20Var.f22820j;
            if (!TextUtils.isEmpty(h20Var.f22830t) && (h20Var.f22814b & 16) != 0) {
                str = h20Var.f22830t;
            }
            BitmapFactory.Options options = new BitmapFactory.Options();
            if (h20Var.f22813a == 2) {
                options.inMutable = true;
            }
            Bitmap decodeFile = BitmapFactory.decodeFile(str, options);
            h20Var.G = decodeFile;
            if (decodeFile != null && (yeVar = h20Var.f22831u) != null) {
                Bitmap createBitmap = Bitmap.createBitmap((int) Math.max(1.0f, yeVar.f26638e * decodeFile.getWidth()), (int) Math.max(1.0f, h20Var.f22831u.f26639f * h20Var.G.getHeight()), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
                canvas.rotate(-h20Var.f22831u.f26650z);
                int width = h20Var.G.getWidth();
                int height = h20Var.G.getHeight();
                ye yeVar3 = h20Var.f22831u;
                if (((yeVar3.f26650z + yeVar3.f26642k) / 90) % 2 == 1) {
                    width = h20Var.G.getHeight();
                    height = h20Var.G.getWidth();
                }
                ye yeVar4 = h20Var.f22831u;
                float f11 = yeVar4.f26638e;
                float f12 = yeVar4.f26639f;
                float f13 = width;
                float f14 = height;
                canvas.clipRect(((-width) * f11) / 2.0f, ((-height) * f12) / 2.0f, (f11 * f13) / 2.0f, (f12 * f14) / 2.0f);
                float f15 = h20Var.f22831u.f26637c;
                canvas.scale(f15, f15);
                ye yeVar5 = h20Var.f22831u;
                canvas.translate(yeVar5.f26635a * f13, yeVar5.f26636b * f14);
                canvas.rotate(h20Var.f22831u.d + yeVar2.f26642k);
                if (h20Var.f22831u.f26643l) {
                    canvas.scale(-1.0f, 1.0f);
                }
                canvas.rotate(h20Var.f22831u.f26650z);
                canvas.translate((-h20Var.G.getWidth()) / 2.0f, (-h20Var.G.getHeight()) / 2.0f);
                canvas.drawBitmap(h20Var.G, 0.0f, 0.0f, (Paint) null);
                h20Var.G.recycle();
                h20Var.G = createBitmap;
            }
            if (h20Var.f22813a == 2 && h20Var.G != null) {
                h20Var.f22829s = g0.L(12.0f) / Math.min(h20Var.f22827q, h20Var.f22828r);
                Pair N0 = g0.N0(h20Var.f22820j);
                h20Var.f22816e = (float) (h20Var.f22816e - Math.toRadians(((Integer) N0.first).intValue()));
                if ((((Integer) N0.first).intValue() / 90) % 2 == 1) {
                    float f16 = h20Var.f22815c;
                    float f17 = h20Var.f22817f;
                    float f18 = (f17 / 2.0f) + f16;
                    float f19 = h20Var.d;
                    float f20 = h20Var.f22818g;
                    float f21 = (f20 / 2.0f) + f19;
                    float f22 = this.transformedWidth;
                    float f23 = this.transformedHeight;
                    float f24 = (f17 * f22) / f23;
                    float f25 = (f20 * f23) / f22;
                    h20Var.f22817f = f25;
                    h20Var.f22818g = f24;
                    h20Var.f22815c = f18 - (f25 / 2.0f);
                    h20Var.d = f21 - (f24 / 2.0f);
                }
                applyRoundRadius(h20Var, h20Var.G, 0);
                return;
            }
            if (h20Var.G != null) {
                float width2 = bitmap.getWidth() / h20Var.G.getHeight();
                if (width2 > 1.0f) {
                    float f26 = h20Var.f22818g;
                    float f27 = f26 / width2;
                    h20Var.d = com.google.android.recaptcha.internal.a.A(f26, f27, 2.0f, h20Var.d);
                    h20Var.f22818g = f27;
                } else if (width2 < 1.0f) {
                    float f28 = h20Var.f22817f;
                    float f29 = width2 * f28;
                    h20Var.f22815c = com.google.android.recaptcha.internal.a.A(f28, f29, 2.0f, h20Var.f22815c);
                    h20Var.f22817f = f29;
                }
            }
        }
    }

    private void initTextEntity(final h20 h20Var) {
        int i7;
        int i10;
        int i11;
        Typeface d;
        final tg.b bVar = new tg.b(t0.f25566b);
        bVar.getPaint().setAntiAlias(true);
        bVar.G = false;
        bVar.setBackgroundColor(0);
        bVar.setPadding(g0.L(7.0f), g0.L(7.0f), g0.L(7.0f), g0.L(7.0f));
        b0 b0Var = h20Var.f22824n;
        if (b0Var != null && (d = b0Var.d()) != null) {
            bVar.setTypeface(d);
        }
        bVar.setTextSize(0, h20Var.f22823m);
        SpannableString spannableString = new SpannableString(h20Var.f22820j);
        ArrayList arrayList = h20Var.f22821k;
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            int i13 = i12 + 1;
            final g20 g20Var = (g20) arrayList.get(i12);
            if (g20Var.f22585a != null) {
                h20 h20Var2 = new h20();
                g20Var.f22586b = h20Var2;
                h20Var2.f22820j = g20Var.f22585a;
                h20Var2.f22814b = g20Var.f22587c;
                r5 r5Var = new r5(0L, 1.0f, bVar.getPaint().getFontMetricsInt()) {
                    @Override
                    public void draw(Canvas canvas, CharSequence charSequence, int i14, int i15, float f10, int i16, int i17, int i18, Paint paint) {
                        super.draw(canvas, charSequence, i14, i15, f10, i16, i17, i18, paint);
                        h20 h20Var3 = h20Var;
                        float paddingLeft = ((((this.measuredSize / 2.0f) + (bVar.getPaddingLeft() + f10)) / h20Var3.f22827q) * h20Var3.f22817f) + h20Var.f22815c;
                        float f11 = h20Var3.d;
                        h20 h20Var4 = h20Var;
                        float f12 = h20Var4.f22818g;
                        float paddingTop = (((((i18 - i16) / 2.0f) + (bVar.getPaddingTop() + i16)) / h20Var4.f22828r) * f12) + f11;
                        if (h20Var4.f22816e != 0.0f) {
                            float f13 = (h20Var4.f22817f / 2.0f) + h20Var4.f22815c;
                            float f14 = (f12 / 2.0f) + h20Var4.d;
                            float f15 = TextureRenderer.this.transformedWidth / TextureRenderer.this.transformedHeight;
                            double d2 = paddingLeft - f13;
                            double d10 = (paddingTop - f14) / f15;
                            paddingLeft = ((float) ((Math.cos(-h20Var.f22816e) * d2) - (Math.sin(-h20Var.f22816e) * d10))) + f13;
                            paddingTop = (((float) jg.g.d(-h20Var.f22816e, d10, Math.sin(-h20Var.f22816e) * d2)) * f15) + f14;
                        }
                        h20 h20Var5 = g20Var.f22586b;
                        int i19 = this.measuredSize;
                        h20 h20Var6 = h20Var;
                        float f16 = (i19 / h20Var6.f22827q) * h20Var6.f22817f;
                        h20Var5.f22817f = f16;
                        float f17 = (i19 / h20Var6.f22828r) * h20Var6.f22818g;
                        h20Var5.f22818g = f17;
                        h20Var5.f22815c = paddingLeft - (f16 / 2.0f);
                        h20Var5.d = paddingTop - (f17 / 2.0f);
                        h20Var5.f22816e = h20Var6.f22816e;
                        if (h20Var5.G == null) {
                            TextureRenderer.this.initStickerEntity(h20Var5);
                        }
                    }
                };
                int i14 = g20Var.offset;
                spannableString.setSpan(r5Var, i14, g20Var.length + i14, 33);
            }
            i12 = i13;
        }
        bVar.setText(i6.m(spannableString, bVar.getPaint().getFontMetricsInt(), false, null, 0));
        bVar.setTextColor(h20Var.f22822l);
        Editable text = bVar.getText();
        if (text != null) {
            for (f6 f6Var : (f6[]) text.getSpans(0, text.length(), f6.class)) {
                f6Var.f22370b = 0.85f;
            }
        }
        int i15 = h20Var.f22826p;
        if (i15 != 1) {
            if (i15 != 2) {
                i7 = 19;
            } else {
                i7 = 21;
            }
        } else {
            i7 = 17;
        }
        bVar.setGravity(i7);
        int i16 = h20Var.f22826p;
        if (i16 != 1) {
            if (i16 == 2 ? !id.f23157a0 : id.f23157a0) {
                i10 = 3;
            } else {
                i10 = 2;
            }
        } else {
            i10 = 4;
        }
        bVar.setTextAlignment(i10);
        bVar.setHorizontallyScrolling(false);
        bVar.setImeOptions(268435456);
        bVar.setFocusableInTouchMode(true);
        bVar.setInputType(bVar.getInputType() | 16384);
        setBreakStrategy(bVar);
        byte b10 = h20Var.f22814b;
        int i17 = -1;
        if (b10 == 0) {
            bVar.setFrameColor(h20Var.f22822l);
            if (g0.B(h20Var.f22822l) >= 0.721f) {
                i17 = -16777216;
            }
            bVar.setTextColor(i17);
        } else if (b10 == 1) {
            if (g0.B(h20Var.f22822l) >= 0.25f) {
                i11 = -1728053248;
            } else {
                i11 = -1711276033;
            }
            bVar.setFrameColor(i11);
            bVar.setTextColor(h20Var.f22822l);
        } else if (b10 == 2) {
            if (g0.B(h20Var.f22822l) >= 0.25f) {
                i17 = -16777216;
            }
            bVar.setFrameColor(i17);
            bVar.setTextColor(h20Var.f22822l);
        } else if (b10 == 3) {
            bVar.setFrameColor(0);
            bVar.setTextColor(h20Var.f22822l);
        }
        bVar.measure(View.MeasureSpec.makeMeasureSpec(h20Var.f22827q, 1073741824), View.MeasureSpec.makeMeasureSpec(h20Var.f22828r, 1073741824));
        bVar.layout(0, 0, h20Var.f22827q, h20Var.f22828r);
        h20Var.G = Bitmap.createBitmap(h20Var.f22827q, h20Var.f22828r, Bitmap.Config.ARGB_8888);
        bVar.draw(new Canvas(h20Var.G));
    }

    private boolean isCollage() {
        if (this.collageParts != null) {
            return true;
        }
        return false;
    }

    private void stepCollagePart(int i7, i20 i20Var, long j3) {
        boolean z9;
        float f10;
        Bitmap r10;
        long j10;
        long j11 = (j3 / 1000000) - i20Var.f23024f;
        float f11 = i20Var.f23027k;
        long j12 = i20Var.f23030o;
        long k10 = Utilities.k(j11, f11 * ((float) j12), i20Var.f23026j * ((float) j12));
        MediaCodecPlayer mediaCodecPlayer = i20Var.B;
        if (mediaCodecPlayer != null) {
            mediaCodecPlayer.ensure(k10);
            i20Var.f23035z.updateTexImage();
            return;
        }
        v5 v5Var = i20Var.f23034u;
        if (v5Var != null) {
            int i10 = v5Var.d[3];
            if (i10 <= 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            if ((k10 < i10 || (z9 && k10 > 1000)) && v5Var.f38863d0 != null) {
                v5Var.f38863d0.g(k10, true);
            }
            do {
                v5 v5Var2 = i20Var.f23034u;
                int i11 = v5Var2.d[3];
                f10 = (float) k10;
                if ((i20Var.v * 2.0f) + i11 >= f10) {
                    break;
                }
                j10 = i11;
                if (v5Var2.f38863d0 != null) {
                    v5Var2.f38863d0.c(null, false, v5Var2.f38868g0, v5Var2.f38869h0, false);
                }
            } while (i20Var.f23034u.d[3] != j10);
            if ((z9 || f10 > i20Var.f23034u.d[3] - (i20Var.v / 2.0f)) && (r10 = i20Var.f23034u.r(false)) != null) {
                GLES20.glBindTexture(3553, this.collageTextures[i7]);
                GLUtils.texImage2D(3553, 0, r10, 0);
            }
        }
    }

    public void changeFragmentShader(String str, String str2, boolean z9) {
        String str3;
        int createProgram;
        int createProgram2;
        if (this.messageVideoMaskPath != null) {
            if (z9) {
                str3 = "#version 320 es\nuniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nin vec4 aPosition;\nin vec4 aTextureCoord;\nin vec4 mTextureCoord;\nout vec2 vTextureCoord;\nout vec2 MTextureCoord;\nvoid main() {\n  gl_Position = uMVPMatrix * aPosition;\n  vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n  MTextureCoord = (uSTMatrix * mTextureCoord).xy;\n}\n";
            } else {
                str3 = "uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nattribute vec4 mTextureCoord;\nvarying vec2 vTextureCoord;\nvarying vec2 MTextureCoord;\nvoid main() {\n  gl_Position = uMVPMatrix * aPosition;\n  vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n  MTextureCoord = (uSTMatrix * mTextureCoord).xy;\n}\n";
            }
        } else if (z9) {
            str3 = "#version 320 es\nuniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nin vec4 aPosition;\nin vec4 aTextureCoord;\nout vec2 vTextureCoord;\nvoid main() {\n  gl_Position = uMVPMatrix * aPosition;\n  vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n";
        } else {
            str3 = "uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n  gl_Position = uMVPMatrix * aPosition;\n  vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n";
        }
        int i7 = this.NUM_EXTERNAL_SHADER;
        if (i7 >= 0 && i7 < this.mProgram.length && (createProgram2 = createProgram(str3, str, z9)) != 0) {
            GLES20.glDeleteProgram(this.mProgram[this.NUM_EXTERNAL_SHADER]);
            this.mProgram[this.NUM_EXTERNAL_SHADER] = createProgram2;
            this.texSizeHandle = GLES20.glGetUniformLocation(createProgram2, "texSize");
        }
        int i10 = this.NUM_FILTER_SHADER;
        if (i10 >= 0 && i10 < this.mProgram.length && (createProgram = createProgram(str3, str2, z9)) != 0) {
            GLES20.glDeleteProgram(this.mProgram[this.NUM_FILTER_SHADER]);
            this.mProgram[this.NUM_FILTER_SHADER] = createProgram;
        }
    }

    public void drawFrame(SurfaceTexture surfaceTexture, long j3) {
        int i7;
        int i10;
        int i11;
        float[] fArr;
        int i12;
        int i13;
        int i14;
        int i15;
        FloatBuffer floatBuffer;
        boolean z9;
        int i16;
        int i17;
        int i18;
        int[] iArr;
        if (this.isPhoto) {
            drawBackground();
            i11 = 3042;
            i14 = 0;
            i7 = 33985;
            i15 = 33984;
        } else {
            surfaceTexture.getTransformMatrix(this.mSTMatrix);
            if (r2.f25212a && this.firstFrame) {
                StringBuilder sb2 = new StringBuilder();
                int i19 = 0;
                while (true) {
                    float[] fArr2 = this.mSTMatrix;
                    i7 = 33985;
                    if (i19 >= fArr2.length) {
                        break;
                    }
                    sb2.append(fArr2[i19]);
                    sb2.append(", ");
                    i19++;
                }
                a8.b("stMatrix = " + ((Object) sb2));
                this.firstFrame = false;
            } else {
                i7 = 33985;
            }
            if (this.blendEnabled) {
                GLES20.glDisable(3042);
                this.blendEnabled = false;
            }
            wy wyVar = this.filterShaders;
            if (wyVar != null) {
                wyVar.P0 = this.mSTMatrix;
                wyVar.W0 = false;
                GLES20.glViewport(0, 0, this.originalWidth, this.originalHeight);
                this.filterShaders.f();
                this.filterShaders.d();
                this.filterShaders.e();
                this.filterShaders.c();
                boolean b10 = this.filterShaders.b();
                GLES20.glBindFramebuffer(36160, 0);
                int i20 = this.transformedWidth;
                if (i20 != this.originalWidth || this.transformedHeight != this.originalHeight) {
                    GLES20.glViewport(0, 0, i20, this.transformedHeight);
                }
                int g10 = this.filterShaders.g(!b10);
                int i21 = this.NUM_FILTER_SHADER;
                i11 = 3042;
                fArr = this.mSTMatrixIdentity;
                i12 = i21;
                i13 = g10;
                i14 = b10;
                i10 = 3553;
            } else {
                int i22 = this.mTextureID;
                int i23 = this.NUM_EXTERNAL_SHADER;
                i10 = 36197;
                i11 = 3042;
                fArr = this.mSTMatrix;
                i12 = i23;
                i13 = i22;
                i14 = 0;
            }
            drawBackground();
            i15 = 33984;
            GLES20.glUseProgram(this.mProgram[i12]);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(i10, i13);
            if (this.messageVideoMaskPath != null && this.videoMaskTexture != -1) {
                GLES20.glActiveTexture(i7);
                GLES20.glBindTexture(3553, this.videoMaskTexture);
                GLES20.glUniform1i(this.maskTextureHandle[i12], 1);
            }
            GLES20.glVertexAttribPointer(this.maPositionHandle[i12], 2, 5126, false, 8, (Buffer) this.verticesBuffer);
            GLES20.glEnableVertexAttribArray(this.maPositionHandle[i12]);
            int i24 = this.maTextureHandle[i12];
            if (this.useMatrixForImagePath) {
                floatBuffer = this.croppedTextureBuffer;
            } else {
                floatBuffer = this.renderTextureBuffer;
            }
            GLES20.glVertexAttribPointer(i24, 2, 5126, false, 8, (Buffer) floatBuffer);
            GLES20.glEnableVertexAttribArray(this.maTextureHandle[i12]);
            if (this.messageVideoMaskPath != null && this.videoMaskTexture != -1) {
                GLES20.glVertexAttribPointer(this.mmTextureHandle[i12], 2, 5126, false, 8, (Buffer) this.maskTextureBuffer);
                GLES20.glEnableVertexAttribArray(this.mmTextureHandle[i12]);
            }
            int i25 = this.texSizeHandle;
            if (i25 != 0) {
                GLES20.glUniform2f(i25, this.transformedWidth, this.transformedHeight);
            }
            GLES20.glUniformMatrix4fv(this.muSTMatrixHandle[i12], 1, false, fArr, 0);
            GLES20.glUniformMatrix4fv(this.muMVPMatrixHandle[i12], 1, false, this.mMVPMatrix, 0);
            GLES20.glDrawArrays(5, 0, 4);
        }
        if (this.blur != null) {
            if (!this.blendEnabled) {
                GLES20.glEnable(i11);
                GLES20.glBlendFunc(1, 771);
                this.blendEnabled = true;
            }
            if (this.imagePath != null && (iArr = this.paintTexture) != null) {
                i16 = iArr[0];
                i17 = this.imageWidth;
                i18 = this.imageHeight;
            } else {
                wy wyVar2 = this.filterShaders;
                if (wyVar2 != null) {
                    i16 = wyVar2.g(i14 ^ 1);
                    wy wyVar3 = this.filterShaders;
                    int i26 = wyVar3.X0;
                    i18 = wyVar3.Y0;
                    i17 = i26;
                } else {
                    i16 = -1;
                    i17 = 1;
                    i18 = 1;
                }
            }
            if (i16 != -1) {
                this.blur.a(i16, i17, i18, null);
                GLES20.glViewport(0, 0, this.transformedWidth, this.transformedHeight);
                GLES20.glBindFramebuffer(36160, 0);
                GLES20.glUseProgram(this.blurShaderProgram);
                GLES20.glEnableVertexAttribArray(this.blurInputTexCoordHandle);
                GLES20.glVertexAttribPointer(this.blurInputTexCoordHandle, 2, 5126, false, 8, (Buffer) this.gradientTextureBuffer);
                GLES20.glEnableVertexAttribArray(this.blurPositionHandle);
                GLES20.glVertexAttribPointer(this.blurPositionHandle, 2, 5126, false, 8, (Buffer) this.blurVerticesBuffer);
                GLES20.glUniform1i(this.blurBlurImageHandle, 0);
                GLES20.glActiveTexture(i15);
                GLES20.glBindTexture(3553, this.blur.f32853s[2]);
                GLES20.glUniform1i(this.blurMaskImageHandle, 1);
                GLES20.glActiveTexture(i7);
                GLES20.glBindTexture(3553, this.blurTexture[0]);
                GLES20.glDrawArrays(5, 0, 4);
            }
        }
        if (isCollage()) {
            for (int i27 = 0; i27 < this.collageParts.size(); i27++) {
                stepCollagePart(i27, this.collageParts.get(i27), j3);
                drawCollagePart(i27, this.collageParts.get(i27), j3);
            }
        }
        if (this.isPhoto || this.paintTexture != null || this.stickerTexture != null) {
            GLES20.glUseProgram(this.simpleShaderProgram);
            GLES20.glActiveTexture(i15);
            GLES20.glUniform1i(this.simpleSourceImageHandle, 0);
            GLES20.glEnableVertexAttribArray(this.simpleInputTexCoordHandle);
            GLES20.glVertexAttribPointer(this.simpleInputTexCoordHandle, 2, 5126, false, 8, (Buffer) this.textureBuffer);
            GLES20.glEnableVertexAttribArray(this.simplePositionHandle);
        }
        if (this.imagePathIndex >= 0 && !isCollage()) {
            int i28 = this.paintTexture[this.imagePathIndex];
            if (this.useMatrixForImagePath && this.isPhoto) {
                z9 = true;
            } else {
                z9 = false;
            }
            drawTexture(true, i28, -10000.0f, -10000.0f, -10000.0f, -10000.0f, 0.0f, false, z9, -1);
        }
        int i29 = this.paintPathIndex;
        if (i29 >= 0) {
            drawTexture(true, this.paintTexture[i29], -10000.0f, -10000.0f, -10000.0f, -10000.0f, 0.0f, false, false, -1);
        }
        int i30 = this.messagePathIndex;
        if (i30 >= 0) {
            drawTexture(true, this.paintTexture[i30], -10000.0f, -10000.0f, -10000.0f, -10000.0f, 0.0f, false, false, -1);
        }
        if (this.stickerTexture != null) {
            int size = this.mediaEntities.size();
            for (int i31 = 0; i31 < size; i31++) {
                drawEntity(this.mediaEntities.get(i31), this.mediaEntities.get(i31).f22822l, j3);
            }
        }
        GLES20.glFinish();
    }

    public int getTextureId() {
        return this.mTextureID;
    }

    public void release() {
        ArrayList<h20> arrayList = this.mediaEntities;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                h20 h20Var = this.mediaEntities.get(i7);
                RLottieNative rLottieNative = h20Var.D;
                if (rLottieNative != null) {
                    rLottieNative.d();
                }
                v5 v5Var = h20Var.J;
                if (v5Var != null) {
                    v5Var.u();
                }
                View view = h20Var.I;
                if (view instanceof dt) {
                    dt dtVar = (dt) view;
                    r5.release(dtVar, dtVar.E);
                }
                Bitmap bitmap = h20Var.G;
                if (bitmap != null) {
                    bitmap.recycle();
                    h20Var.G = null;
                }
            }
        }
        ArrayList<i20> arrayList2 = this.collageParts;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            int i10 = 0;
            while (i10 < size2) {
                arrayList2.get(i10);
                i10++;
                for (int i11 = 0; i11 < this.collageParts.size(); i11++) {
                    destroyCollagePart(i11, this.collageParts.get(i11));
                }
            }
        }
    }

    public void setBreakStrategy(tg.b bVar) {
        bVar.setBreakStrategy(0);
    }

    public void surfaceCreated() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.video.TextureRenderer.surfaceCreated():void");
    }

    private void drawTexture(boolean z9, int i7, float f10, float f11, float f12, float f13, float f14, boolean z10) {
        drawTexture(z9, i7, f10, f11, f12, f13, f14, z10, false, -1);
    }

    private void drawTexture(boolean z9, int i7, float f10, float f11, float f12, float f13, float f14, boolean z10, boolean z11, int i10) {
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
            int i11 = 0;
            for (int i12 = 4; i11 < i12; i12 = 4) {
                float[] fArr4 = this.bitmapData;
                int i13 = i11 * 2;
                int i14 = i13 + 1;
                double d = fArr4[i13] - f21;
                double d2 = f14;
                float f25 = f21;
                double d10 = (fArr4[i14] - f24) / f23;
                fArr4[i13] = ((float) ((Math.cos(d2) * d) - (Math.sin(d2) * d10))) + f25;
                this.bitmapData[i14] = (((float) jg.g.d(d2, d10, Math.sin(d2) * d)) * f23) + f24;
                i11++;
                f21 = f25;
            }
        }
        this.bitmapVerticesBuffer.put(this.bitmapData).position(0);
        GLES20.glVertexAttribPointer(this.simplePositionHandle, 2, 5126, false, 8, (Buffer) (z11 ? this.verticesBuffer : this.bitmapVerticesBuffer));
        GLES20.glEnableVertexAttribArray(this.simpleInputTexCoordHandle);
        GLES20.glVertexAttribPointer(this.simpleInputTexCoordHandle, 2, 5126, false, 8, (Buffer) (z11 ? this.croppedTextureBuffer : this.textureBuffer));
        if (z9) {
            GLES20.glBindTexture(3553, i7);
        }
        GLES20.glDrawArrays(5, 0, 4);
    }
}

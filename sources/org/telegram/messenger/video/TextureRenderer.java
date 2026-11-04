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
import gi.s;
import gi.t;
import java.io.File;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import k2.p1;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a20;
import org.telegram.messenger.a8;
import org.telegram.messenger.bd;
import org.telegram.messenger.f6;
import org.telegram.messenger.g0;
import org.telegram.messenger.h10;
import org.telegram.messenger.i6;
import org.telegram.messenger.k5;
import org.telegram.messenger.r2;
import org.telegram.messenger.re;
import org.telegram.messenger.t0;
import org.telegram.messenger.y10;
import org.telegram.messenger.z10;
import org.telegram.ui.Components.RLottieNative;
import org.telegram.ui.Components.bt;
import org.telegram.ui.Components.ca;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.q5;
import org.telegram.ui.Components.sy;
import org.telegram.ui.Components.t5;
import org.telegram.ui.Components.xq;
import tg.b0;
import ug.h0;
import ug.l0;
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
    private ca blur;
    private int blurBlurImageHandle;
    private int blurInputTexCoordHandle;
    private int blurMaskImageHandle;
    private String blurPath;
    private int blurPositionHandle;
    private int blurShaderProgram;
    private int[] blurTexture;
    private FloatBuffer blurVerticesBuffer;
    private ArrayList<a20> collageParts;
    private int[] collageTextures;
    private final re cropState;
    private FloatBuffer croppedTextureBuffer;
    private ArrayList<g5> emojiDrawables;
    private sy filterShaders;
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
    private ArrayList<z10> mediaEntities;
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

    public TextureRenderer(org.telegram.messenger.ze r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, java.util.ArrayList<org.telegram.messenger.z10> r34, org.telegram.messenger.re r35, int r36, int r37, int r38, int r39, int r40, float r41, boolean r42, java.lang.Integer r43, java.lang.Integer r44, gi.e7 r45, org.telegram.messenger.video.MediaCodecVideoConvertor.ConvertVideoParams r46) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.video.TextureRenderer.<init>(org.telegram.messenger.ze, java.lang.String, java.lang.String, java.lang.String, java.util.ArrayList, org.telegram.messenger.re, int, int, int, int, int, float, boolean, java.lang.Integer, java.lang.Integer, gi.e7, org.telegram.messenger.video.MediaCodecVideoConvertor$ConvertVideoParams):void");
    }

    private void applyRoundRadius(z10 z10Var, Bitmap bitmap, int i3) {
        if (bitmap != null && z10Var != null) {
            if (z10Var.f26719s != 0.0f || i3 != 0) {
                if (z10Var.L == null) {
                    z10Var.L = new Canvas(bitmap);
                }
                if (z10Var.f26719s != 0.0f) {
                    if (this.path == null) {
                        this.path = new Path();
                    }
                    if (this.xRefPaint == null) {
                        Paint paint = new Paint(1);
                        this.xRefPaint = paint;
                        paint.setColor(-16777216);
                        this.xRefPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                    }
                    float min = Math.min(bitmap.getWidth(), bitmap.getHeight()) * z10Var.f26719s;
                    this.path.rewind();
                    this.path.addRoundRect(new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight()), min, min, Path.Direction.CCW);
                    this.path.toggleInverseFillType();
                    z10Var.L.drawPath(this.path, this.xRefPaint);
                }
                if (i3 != 0) {
                    if (this.textColorPaint == null) {
                        Paint paint2 = new Paint(1);
                        this.textColorPaint = paint2;
                        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
                    }
                    this.textColorPaint.setColor(i3);
                    z10Var.L.drawRect(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight(), this.textColorPaint);
                }
            }
        }
    }

    private int createProgram(String str, String str2, boolean z10) {
        int h;
        int glCreateProgram;
        int h7;
        int glCreateProgram2;
        if (z10) {
            int h10 = sy.h(35633, str);
            if (h10 == 0 || (h7 = sy.h(35632, str2)) == 0 || (glCreateProgram2 = GLES20.glCreateProgram()) == 0) {
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
        int h11 = sy.h(35633, str);
        if (h11 == 0 || (h = sy.h(35632, str2)) == 0 || (glCreateProgram = GLES20.glCreateProgram()) == 0) {
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

    private void destroyCollagePart(int i3, a20 a20Var) {
        if (a20Var != null) {
            t5 t5Var = a20Var.f21447u;
            if (t5Var != null) {
                t5Var.u();
                a20Var.f21447u = null;
            }
            MediaCodecPlayer mediaCodecPlayer = a20Var.B;
            if (mediaCodecPlayer != null) {
                mediaCodecPlayer.release();
                a20Var.B = null;
            }
            SurfaceTexture surfaceTexture = a20Var.f21448z;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                a20Var.f21448z = null;
            }
        }
    }

    private void drawBackground() {
        int i3 = this.NUM_GRADIENT_SHADER;
        if (i3 >= 0) {
            GLES20.glUseProgram(this.mProgram[i3]);
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

    private void drawCollagePart(int i3, a20 a20Var, long j10) {
        if (a20Var.B != null && a20Var.f21434b) {
            GLES20.glUseProgram(this.simpleShaderProgramOES);
            GLES20.glActiveTexture(33987);
            GLES20.glBindTexture(36197, this.collageTextures[i3]);
            GLES20.glUniform1i(this.simpleSourceImageHandleOES, 3);
            GLES20.glEnableVertexAttribArray(this.simpleInputTexCoordHandleOES);
            GLES20.glVertexAttribPointer(this.simpleInputTexCoordHandleOES, 2, 5126, false, 8, (Buffer) a20Var.f21446t);
            GLES20.glEnableVertexAttribArray(this.simplePositionHandleOES);
            GLES20.glVertexAttribPointer(this.simplePositionHandleOES, 2, 5126, false, 8, (Buffer) a20Var.f21445s);
        } else {
            GLES20.glUseProgram(this.simpleShaderProgram);
            GLES20.glActiveTexture(33986);
            GLES20.glBindTexture(3553, this.collageTextures[i3]);
            GLES20.glUniform1i(this.simpleSourceImageHandle, 2);
            GLES20.glEnableVertexAttribArray(this.simpleInputTexCoordHandle);
            GLES20.glVertexAttribPointer(this.simpleInputTexCoordHandle, 2, 5126, false, 8, (Buffer) a20Var.f21446t);
            GLES20.glEnableVertexAttribArray(this.simplePositionHandle);
            GLES20.glVertexAttribPointer(this.simplePositionHandle, 2, 5126, false, 8, (Buffer) a20Var.f21445s);
        }
        GLES20.glDrawArrays(5, 0, 4);
    }

    private void drawEntity(z10 z10Var, int i3, long j10) {
        z10 z10Var2;
        boolean z10;
        Bitmap bitmap;
        Bitmap bitmap2;
        int i10;
        boolean z11;
        long j11;
        long j12;
        long k10;
        int i11;
        boolean z12;
        RLottieNative rLottieNative = z10Var.D;
        if (rLottieNative != null) {
            Bitmap bitmap3 = z10Var.G;
            if (bitmap3 != null && z10Var.U > 0 && z10Var.V > 0) {
                rLottieNative.c((int) z10Var.E, bitmap3, true);
                Bitmap bitmap4 = z10Var.G;
                if ((z10Var.f26704b & 8) != 0) {
                    i11 = i3;
                } else {
                    i11 = 0;
                }
                applyRoundRadius(z10Var, bitmap4, i11);
                GLES20.glBindTexture(3553, this.stickerTexture[0]);
                GLUtils.texImage2D(3553, 0, z10Var.G, 0);
                float f10 = z10Var.E + z10Var.F;
                z10Var.E = f10;
                if (f10 >= z10Var.D.f31545a[0]) {
                    z10Var.E = 0.0f;
                }
                int i12 = this.stickerTexture[0];
                float f11 = z10Var.f26705c;
                float f12 = z10Var.d;
                float f13 = z10Var.f26707f;
                float f14 = z10Var.f26708g;
                float f15 = z10Var.f26706e;
                if ((2 & z10Var.f26704b) != 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                drawTexture(false, i12, f11, f12, f13, f14, f15, z12);
            }
        } else if (z10Var.J != null) {
            float f16 = z10Var.E;
            int i13 = (int) f16;
            float f17 = 1.0f;
            if (z10Var.f26703a == 5) {
                if (this.isPhoto) {
                    j11 = z10Var.T;
                    j12 = 0;
                } else {
                    long j13 = z10Var.Q;
                    j11 = (z10Var.S - z10Var.R) + j13;
                    j12 = j13;
                }
                long j14 = j10 / 1000000;
                if (j14 < j12) {
                    f17 = xq.h.getInterpolation(Utilities.i(1.0f - (((float) (j12 - j14)) / 400.0f), 1.0f, 0.0f));
                } else if (j14 > j11) {
                    f17 = xq.h.getInterpolation(Utilities.i(1.0f - (((float) (j14 - j11)) / 400.0f), 1.0f, 0.0f));
                }
                if (f17 > 0.0f) {
                    if (this.isPhoto) {
                        k10 = Utilities.k(j14, z10Var.T, 0L);
                    } else {
                        k10 = Utilities.k((j14 - z10Var.Q) + z10Var.R, z10Var.T, 0L);
                    }
                    while (!z10Var.K) {
                        int[] iArr = z10Var.J.d;
                        if (iArr[3] >= Math.min(k10, iArr[4])) {
                            break;
                        }
                        t5 t5Var = z10Var.J;
                        int i14 = t5Var.d[3];
                        t5Var.r(false);
                        int i15 = z10Var.J.d[3];
                        if (i15 <= i14 && (i15 != 0 || i14 != 0)) {
                            z10Var.K = true;
                            break;
                        }
                    }
                }
            } else {
                float f18 = f16 + z10Var.F;
                z10Var.E = f18;
                for (int i16 = (int) f18; i13 != i16; i16--) {
                    z10Var.J.r(true);
                }
            }
            q5 q5Var = z10Var.J.f38281w;
            if (q5Var != null) {
                bitmap = q5Var.f37346b;
            } else {
                bitmap = null;
            }
            if (bitmap != null) {
                if (z10Var.f26703a == 5) {
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
                        if ((z10Var.f26704b & 8) != 0) {
                            i10 = i3;
                        } else {
                            i10 = 0;
                        }
                        applyRoundRadius(z10Var, bitmap7, i10);
                    }
                    bitmap2 = this.stickerBitmap;
                }
                if (bitmap2 != null) {
                    GLES20.glBindTexture(3553, this.stickerTexture[0]);
                    GLUtils.texImage2D(3553, 0, bitmap2, 0);
                    int i17 = this.stickerTexture[0];
                    float f19 = z10Var.f26705c;
                    float f20 = z10Var.d;
                    float f21 = z10Var.f26707f;
                    float f22 = z10Var.f26708g;
                    float f23 = z10Var.f26706e;
                    if ((z10Var.f26704b & 2) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    drawTexture(false, i17, f19, f20, f21, f22, f23, z11);
                }
            }
        } else {
            if (z10Var.G != null) {
                GLES20.glBindTexture(3553, this.stickerTexture[0]);
                GLUtils.texImage2D(3553, 0, z10Var.G, 0);
                int i18 = this.stickerTexture[0];
                float f24 = z10Var.f26705c;
                float f25 = z10Var.h;
                float f26 = f24 - (f25 / 2.0f);
                float f27 = z10Var.d;
                float f28 = z10Var.f26709i;
                float f29 = f27 - (f28 / 2.0f);
                float f30 = z10Var.f26707f + f25;
                float f31 = f28 + z10Var.f26708g;
                float f32 = z10Var.f26706e;
                if (z10Var.f26703a == 2 && (z10Var.f26704b & 2) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                drawTexture(false, i18, f26, f29, f30, f31, f32, z10);
            }
            ArrayList arrayList = z10Var.f26711k;
            if (arrayList != null && !arrayList.isEmpty()) {
                for (int i19 = 0; i19 < z10Var.f26711k.size(); i19++) {
                    y10 y10Var = (y10) z10Var.f26711k.get(i19);
                    if (y10Var != null && (z10Var2 = y10Var.f26510b) != null) {
                        drawEntity(z10Var2, z10Var.f26712l, j10);
                    }
                }
            }
        }
    }

    private void drawTexture(boolean z10, int i3) {
        drawTexture(z10, i3, -10000.0f, -10000.0f, -10000.0f, -10000.0f, 0.0f, false);
    }

    private FloatBuffer floats(float[] fArr) {
        FloatBuffer g7 = org.telegram.messenger.camera.q.g(ByteBuffer.allocateDirect(fArr.length * 4));
        g7.put(fArr).position(0);
        return g7;
    }

    private void initCollagePart(int i3, a20 a20Var) {
        float f10;
        t tVar;
        AtomicInteger atomicInteger = new AtomicInteger(a20Var.f21441l);
        AtomicInteger atomicInteger2 = new AtomicInteger(a20Var.f21442m);
        AtomicInteger atomicInteger3 = new AtomicInteger(0);
        if (a20Var.f21434b) {
            GLES20.glBindTexture(36197, this.collageTextures[i3]);
            GLES20.glTexParameteri(36197, 10241, 9728);
            GLES20.glTexParameteri(36197, 10240, 9728);
            GLES20.glTexParameteri(36197, 10242, 33071);
            GLES20.glTexParameteri(36197, 10243, 33071);
            SurfaceTexture surfaceTexture = new SurfaceTexture(this.collageTextures[i3]);
            a20Var.f21448z = surfaceTexture;
            surfaceTexture.setDefaultBufferSize(a20Var.f21441l, a20Var.f21442m);
            try {
                a20Var.B = new MediaCodecPlayer(a20Var.d, new Surface(a20Var.f21448z));
            } catch (Exception e10) {
                a8.g(e10, true);
                a20Var.B = null;
            }
            MediaCodecPlayer mediaCodecPlayer = a20Var.B;
            if (mediaCodecPlayer != null) {
                atomicInteger.set(mediaCodecPlayer.getOrientedWidth());
                atomicInteger2.set(a20Var.B.getOrientedHeight());
                atomicInteger3.set(a20Var.B.getOrientation());
            } else {
                a20Var.f21448z.release();
                a20Var.f21448z = null;
                GLES20.glDeleteTextures(1, this.collageTextures, i3);
                GLES20.glGenTextures(1, this.collageTextures, i3);
                GLES20.glBindTexture(3553, this.collageTextures[i3]);
                GLES20.glTexParameteri(3553, 10241, 9729);
                GLES20.glTexParameteri(3553, 10240, 9729);
                GLES20.glTexParameteri(3553, 10242, 33071);
                GLES20.glTexParameteri(3553, 10243, 33071);
                t5 t5Var = new t5(new File(a20Var.d), true, 0L, 0, null, null, null, 0L, h10.f22829t0, true, 512, 512, null, 0, true);
                a20Var.f21447u = t5Var;
                if (t5Var.f38285y && t5Var.f38262f0) {
                    throw new RuntimeException("Failed to decode with ffmpeg software codecs");
                }
                a20Var.v = 1000.0f / t5Var.d[5];
                Bitmap r5 = t5Var.r(false);
                if (r5 != null) {
                    GLUtils.texImage2D(3553, 0, r5, 0);
                }
                atomicInteger.set(a20Var.f21447u.getIntrinsicWidth());
                atomicInteger2.set(a20Var.f21447u.getIntrinsicHeight());
                atomicInteger3.set(a20Var.f21447u.d[2]);
            }
        } else {
            GLES20.glBindTexture(3553, this.collageTextures[i3]);
            GLES20.glTexParameteri(3553, 10241, 9729);
            GLES20.glTexParameteri(3553, 10240, 9729);
            GLES20.glTexParameteri(3553, 10242, 33071);
            GLES20.glTexParameteri(3553, 10243, 33071);
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inMutable = true;
            Bitmap decodeFile = BitmapFactory.decodeFile(a20Var.d, options);
            Pair N0 = g0.N0(a20Var.d);
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
        float a10 = a20Var.f21444r.a(2.0f) - 1.0f;
        s sVar = a20Var.f21444r;
        s sVar2 = a20Var.f21444r;
        s sVar3 = a20Var.f21444r;
        s sVar4 = a20Var.f21444r;
        int i10 = sVar4.f13537a.f13588c;
        int i11 = sVar4.f13539c;
        float[] fArr = {a10, -(((2.0f / sVar.f13537a.f13588c) * sVar.f13539c) - 1.0f), sVar.b(2.0f) - 1.0f, -(((2.0f / sVar2.f13537a.f13588c) * sVar2.f13539c) - 1.0f), sVar2.a(2.0f) - 1.0f, -(((2.0f / sVar3.f13537a.f13588c) * (sVar3.f13539c + 1)) - 1.0f), sVar3.b(2.0f) - 1.0f, -(((2.0f / i10) * (i11 + 1)) - 1.0f)};
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
        a20Var.f21445s = floats(fArr);
        a20Var.f21446t = floats(fArr2);
    }

    private void initLinkEntity(z10 z10Var) {
        h0 h0Var = new h0(t0.f25457b, z10Var.P);
        h0Var.V = true;
        h0Var.b(h10.f22829t0, z10Var.W, false);
        if (h0Var.e()) {
            h0Var.setPreviewType(z10Var.f26704b);
        } else {
            h0Var.c(z10Var.f26704b, z10Var.f26712l);
        }
        int i3 = z10Var.f26717q;
        int i10 = h0Var.f56033f;
        h0Var.setMaxWidth(i3 + i10 + i10);
        h0Var.measure(View.MeasureSpec.makeMeasureSpec(z10Var.f26717q, 1073741824), View.MeasureSpec.makeMeasureSpec(z10Var.f26718r, 1073741824));
        h0Var.layout(0, 0, z10Var.f26717q, z10Var.f26718r);
        float f10 = z10Var.f26707f * this.transformedWidth;
        int i11 = z10Var.f26717q;
        float f11 = f10 / i11;
        z10Var.G = Bitmap.createBitmap(((int) (i11 * f11)) + 16, ((int) (z10Var.f26718r * f11)) + 16, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(z10Var.G);
        float f12 = 8;
        canvas.translate(f12, f12);
        canvas.scale(f11, f11);
        h0Var.draw(canvas);
        float f13 = 16 * f11;
        z10Var.h = f13 / this.transformedWidth;
        z10Var.f26709i = f13 / this.transformedHeight;
    }

    private void initLocationEntity(z10 z10Var) {
        float f10;
        float f11;
        byte b10 = z10Var.f26703a;
        l0 l0Var = new l0(t0.f25457b, z10Var.P);
        l0Var.setIsVideo(true);
        l0Var.setText(z10Var.f26710j);
        l0Var.e(z10Var.f26704b, z10Var.f26712l);
        if (z10Var.O != null && z10Var.f26711k.isEmpty()) {
            l0Var.d(h10.f22829t0, z10Var.O.f13584c);
        }
        l0Var.setMaxWidth(z10Var.f26717q);
        if (z10Var.f26711k.size() == 1) {
            l0Var.f56129y = true;
            l0Var.f56121c = true;
            l0Var.requestLayout();
        }
        l0Var.measure(View.MeasureSpec.makeMeasureSpec(z10Var.f26717q, 1073741824), View.MeasureSpec.makeMeasureSpec(z10Var.f26718r, 1073741824));
        l0Var.layout(0, 0, z10Var.f26717q, z10Var.f26718r);
        float f12 = z10Var.f26707f * this.transformedWidth;
        float f13 = z10Var.f26717q;
        float f14 = f12 / f13;
        z10Var.G = Bitmap.createBitmap(((int) (f13 * f14)) + 16, ((int) (z10Var.f26718r * f14)) + 16, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(z10Var.G);
        float f15 = 8;
        canvas.translate(f15, f15);
        canvas.scale(f14, f14);
        l0Var.draw(canvas);
        float f16 = 16 * f14;
        z10Var.h = f16 / this.transformedWidth;
        z10Var.f26709i = f16 / this.transformedHeight;
        if (z10Var.f26711k.size() == 1) {
            y10 y10Var = (y10) z10Var.f26711k.get(0);
            z10 z10Var2 = new z10();
            y10Var.f26510b = z10Var2;
            z10Var2.f26710j = y10Var.f26509a;
            z10Var2.f26704b = y10Var.f26511c;
            RectF rectF = new RectF();
            float f17 = l0Var.J;
            float f18 = l0Var.d.left + 2.25f;
            float f19 = l0Var.E;
            float f20 = l0Var.K;
            float f21 = l0Var.O;
            float f22 = f19 * 21.33f;
            rectF.set((f18 * f19) + f17, com.google.android.recaptcha.internal.a.z(f21, f22, 2.0f, f20), org.telegram.messenger.camera.q.b(f18, 21.33f, f19, f17), k5.a(f22, f21, 2.0f, f20));
            float centerX = ((rectF.centerX() / z10Var.f26717q) * z10Var.f26707f) + z10Var.f26705c;
            float f23 = z10Var.d;
            float centerY = rectF.centerY() / z10Var.f26718r;
            float f24 = z10Var.f26708g;
            float f25 = (centerY * f24) + f23;
            if (z10Var.f26706e != 0.0f) {
                float f26 = (z10Var.f26707f / 2.0f) + z10Var.f26705c;
                float f27 = (f24 / 2.0f) + z10Var.d;
                float f28 = this.transformedWidth / this.transformedHeight;
                double d = centerX - f26;
                double d10 = (f25 - f27) / f28;
                f11 = 2.0f;
                float cos = ((float) ((Math.cos(-f10) * d) - (Math.sin(-z10Var.f26706e) * d10))) + f26;
                f25 = (((float) p1.c(-z10Var.f26706e, d10, Math.sin(-z10Var.f26706e) * d)) * f28) + f27;
                centerX = cos;
            } else {
                f11 = 2.0f;
            }
            y10Var.f26510b.f26707f = (rectF.width() / z10Var.f26717q) * z10Var.f26707f;
            y10Var.f26510b.f26708g = (rectF.height() / z10Var.f26718r) * z10Var.f26708g;
            z10 z10Var3 = y10Var.f26510b;
            float f29 = z10Var3.f26707f * 1.2f;
            z10Var3.f26707f = f29;
            float f30 = z10Var3.f26708g * 1.2f;
            z10Var3.f26708g = f30;
            z10Var3.f26705c = centerX - (f29 / f11);
            z10Var3.d = f25 - (f30 / f11);
            z10Var3.f26706e = z10Var.f26706e;
            initStickerEntity(z10Var3);
        }
    }

    public void initStickerEntity(z10 z10Var) {
        Bitmap bitmap;
        re reVar;
        re reVar2;
        int i3;
        int i10 = (int) (z10Var.f26707f * this.transformedWidth);
        z10Var.U = i10;
        int i11 = (int) (z10Var.f26708g * this.transformedHeight);
        z10Var.V = i11;
        if (i10 > 512) {
            z10Var.V = (int) ((i11 / i10) * 512.0f);
            z10Var.U = 512;
        }
        int i12 = z10Var.V;
        if (i12 > 512) {
            z10Var.U = (int) ((z10Var.U / i12) * 512.0f);
            z10Var.V = 512;
        }
        byte b10 = z10Var.f26704b;
        float f10 = 0.0f;
        if ((b10 & 1) != 0) {
            int i13 = z10Var.U;
            if (i13 > 0 && (i3 = z10Var.V) > 0) {
                z10Var.G = Bitmap.createBitmap(i13, i3, Bitmap.Config.ARGB_8888);
                RLottieNative a10 = RLottieNative.a(z10Var.f26710j, null, null, null, 0, null);
                z10Var.D = a10;
                if (a10 != null) {
                    f10 = a10.f31545a[1] / this.videoFps;
                }
                z10Var.F = f10;
            }
        } else if ((b10 & 4) != 0) {
            z10Var.K = false;
            t5 t5Var = new t5(new File(z10Var.f26710j), true, 0L, 0, null, null, null, 0L, h10.f22829t0, true, 512, 512, null, 0, true);
            z10Var.J = t5Var;
            z10Var.F = t5Var.d[5] / this.videoFps;
            z10Var.E = 1.0f;
            t5Var.r(true);
        } else {
            String str = z10Var.f26710j;
            if (!TextUtils.isEmpty(z10Var.f26720t) && (z10Var.f26704b & 16) != 0) {
                str = z10Var.f26720t;
            }
            BitmapFactory.Options options = new BitmapFactory.Options();
            if (z10Var.f26703a == 2) {
                options.inMutable = true;
            }
            Bitmap decodeFile = BitmapFactory.decodeFile(str, options);
            z10Var.G = decodeFile;
            if (decodeFile != null && (reVar = z10Var.f26721u) != null) {
                Bitmap createBitmap = Bitmap.createBitmap((int) Math.max(1.0f, reVar.f25113e * decodeFile.getWidth()), (int) Math.max(1.0f, z10Var.f26721u.f25114f * z10Var.G.getHeight()), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
                canvas.rotate(-z10Var.f26721u.f25125z);
                int width = z10Var.G.getWidth();
                int height = z10Var.G.getHeight();
                re reVar3 = z10Var.f26721u;
                if (((reVar3.f25125z + reVar3.f25117k) / 90) % 2 == 1) {
                    width = z10Var.G.getHeight();
                    height = z10Var.G.getWidth();
                }
                re reVar4 = z10Var.f26721u;
                float f11 = reVar4.f25113e;
                float f12 = reVar4.f25114f;
                float f13 = width;
                float f14 = height;
                canvas.clipRect(((-width) * f11) / 2.0f, ((-height) * f12) / 2.0f, (f11 * f13) / 2.0f, (f12 * f14) / 2.0f);
                float f15 = z10Var.f26721u.f25112c;
                canvas.scale(f15, f15);
                re reVar5 = z10Var.f26721u;
                canvas.translate(reVar5.f25110a * f13, reVar5.f25111b * f14);
                canvas.rotate(z10Var.f26721u.d + reVar2.f25117k);
                if (z10Var.f26721u.f25118l) {
                    canvas.scale(-1.0f, 1.0f);
                }
                canvas.rotate(z10Var.f26721u.f25125z);
                canvas.translate((-z10Var.G.getWidth()) / 2.0f, (-z10Var.G.getHeight()) / 2.0f);
                canvas.drawBitmap(z10Var.G, 0.0f, 0.0f, (Paint) null);
                z10Var.G.recycle();
                z10Var.G = createBitmap;
            }
            if (z10Var.f26703a == 2 && z10Var.G != null) {
                z10Var.f26719s = g0.L(12.0f) / Math.min(z10Var.f26717q, z10Var.f26718r);
                Pair N0 = g0.N0(z10Var.f26710j);
                z10Var.f26706e = (float) (z10Var.f26706e - Math.toRadians(((Integer) N0.first).intValue()));
                if ((((Integer) N0.first).intValue() / 90) % 2 == 1) {
                    float f16 = z10Var.f26705c;
                    float f17 = z10Var.f26707f;
                    float f18 = (f17 / 2.0f) + f16;
                    float f19 = z10Var.d;
                    float f20 = z10Var.f26708g;
                    float f21 = (f20 / 2.0f) + f19;
                    float f22 = this.transformedWidth;
                    float f23 = this.transformedHeight;
                    float f24 = (f17 * f22) / f23;
                    float f25 = (f20 * f23) / f22;
                    z10Var.f26707f = f25;
                    z10Var.f26708g = f24;
                    z10Var.f26705c = f18 - (f25 / 2.0f);
                    z10Var.d = f21 - (f24 / 2.0f);
                }
                applyRoundRadius(z10Var, z10Var.G, 0);
                return;
            }
            if (z10Var.G != null) {
                float width2 = bitmap.getWidth() / z10Var.G.getHeight();
                if (width2 > 1.0f) {
                    float f26 = z10Var.f26708g;
                    float f27 = f26 / width2;
                    z10Var.d = com.google.android.recaptcha.internal.a.z(f26, f27, 2.0f, z10Var.d);
                    z10Var.f26708g = f27;
                } else if (width2 < 1.0f) {
                    float f28 = z10Var.f26707f;
                    float f29 = width2 * f28;
                    z10Var.f26705c = com.google.android.recaptcha.internal.a.z(f28, f29, 2.0f, z10Var.f26705c);
                    z10Var.f26707f = f29;
                }
            }
        }
    }

    private void initTextEntity(final z10 z10Var) {
        int i3;
        int i10;
        int i11;
        Typeface d;
        final ug.b bVar = new ug.b(t0.f25457b);
        bVar.getPaint().setAntiAlias(true);
        bVar.H = false;
        bVar.setBackgroundColor(0);
        bVar.setPadding(g0.L(7.0f), g0.L(7.0f), g0.L(7.0f), g0.L(7.0f));
        b0 b0Var = z10Var.f26714n;
        if (b0Var != null && (d = b0Var.d()) != null) {
            bVar.setTypeface(d);
        }
        bVar.setTextSize(0, z10Var.f26713m);
        SpannableString spannableString = new SpannableString(z10Var.f26710j);
        ArrayList arrayList = z10Var.f26711k;
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            int i13 = i12 + 1;
            final y10 y10Var = (y10) arrayList.get(i12);
            if (y10Var.f26509a != null) {
                z10 z10Var2 = new z10();
                y10Var.f26510b = z10Var2;
                z10Var2.f26710j = y10Var.f26509a;
                z10Var2.f26704b = y10Var.f26511c;
                p5 p5Var = new p5(0L, 1.0f, bVar.getPaint().getFontMetricsInt()) {
                    @Override
                    public void draw(Canvas canvas, CharSequence charSequence, int i14, int i15, float f10, int i16, int i17, int i18, Paint paint) {
                        super.draw(canvas, charSequence, i14, i15, f10, i16, i17, i18, paint);
                        z10 z10Var3 = z10Var;
                        float paddingLeft = ((((this.measuredSize / 2.0f) + (bVar.getPaddingLeft() + f10)) / z10Var3.f26717q) * z10Var3.f26707f) + z10Var.f26705c;
                        float f11 = z10Var3.d;
                        z10 z10Var4 = z10Var;
                        float f12 = z10Var4.f26708g;
                        float paddingTop = (((((i18 - i16) / 2.0f) + (bVar.getPaddingTop() + i16)) / z10Var4.f26718r) * f12) + f11;
                        if (z10Var4.f26706e != 0.0f) {
                            float f13 = (z10Var4.f26707f / 2.0f) + z10Var4.f26705c;
                            float f14 = (f12 / 2.0f) + z10Var4.d;
                            float f15 = TextureRenderer.this.transformedWidth / TextureRenderer.this.transformedHeight;
                            double d10 = paddingLeft - f13;
                            double d11 = (paddingTop - f14) / f15;
                            paddingLeft = ((float) ((Math.cos(-z10Var.f26706e) * d10) - (Math.sin(-z10Var.f26706e) * d11))) + f13;
                            paddingTop = (((float) p1.c(-z10Var.f26706e, d11, Math.sin(-z10Var.f26706e) * d10)) * f15) + f14;
                        }
                        z10 z10Var5 = y10Var.f26510b;
                        int i19 = this.measuredSize;
                        z10 z10Var6 = z10Var;
                        float f16 = (i19 / z10Var6.f26717q) * z10Var6.f26707f;
                        z10Var5.f26707f = f16;
                        float f17 = (i19 / z10Var6.f26718r) * z10Var6.f26708g;
                        z10Var5.f26708g = f17;
                        z10Var5.f26705c = paddingLeft - (f16 / 2.0f);
                        z10Var5.d = paddingTop - (f17 / 2.0f);
                        z10Var5.f26706e = z10Var6.f26706e;
                        if (z10Var5.G == null) {
                            TextureRenderer.this.initStickerEntity(z10Var5);
                        }
                    }
                };
                int i14 = y10Var.offset;
                spannableString.setSpan(p5Var, i14, y10Var.length + i14, 33);
            }
            i12 = i13;
        }
        bVar.setText(i6.m(spannableString, bVar.getPaint().getFontMetricsInt(), false, null, 0));
        bVar.setTextColor(z10Var.f26712l);
        Editable text = bVar.getText();
        if (text != null) {
            for (f6 f6Var : (f6[]) text.getSpans(0, text.length(), f6.class)) {
                f6Var.f22453b = 0.85f;
            }
        }
        int i15 = z10Var.f26716p;
        if (i15 != 1) {
            if (i15 != 2) {
                i3 = 19;
            } else {
                i3 = 21;
            }
        } else {
            i3 = 17;
        }
        bVar.setGravity(i3);
        int i16 = z10Var.f26716p;
        if (i16 != 1) {
            if (i16 == 2 ? !bd.f21784a0 : bd.f21784a0) {
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
        byte b10 = z10Var.f26704b;
        int i17 = -1;
        if (b10 == 0) {
            bVar.setFrameColor(z10Var.f26712l);
            if (g0.B(z10Var.f26712l) >= 0.721f) {
                i17 = -16777216;
            }
            bVar.setTextColor(i17);
        } else if (b10 == 1) {
            if (g0.B(z10Var.f26712l) >= 0.25f) {
                i11 = -1728053248;
            } else {
                i11 = -1711276033;
            }
            bVar.setFrameColor(i11);
            bVar.setTextColor(z10Var.f26712l);
        } else if (b10 == 2) {
            if (g0.B(z10Var.f26712l) >= 0.25f) {
                i17 = -16777216;
            }
            bVar.setFrameColor(i17);
            bVar.setTextColor(z10Var.f26712l);
        } else if (b10 == 3) {
            bVar.setFrameColor(0);
            bVar.setTextColor(z10Var.f26712l);
        }
        bVar.measure(View.MeasureSpec.makeMeasureSpec(z10Var.f26717q, 1073741824), View.MeasureSpec.makeMeasureSpec(z10Var.f26718r, 1073741824));
        bVar.layout(0, 0, z10Var.f26717q, z10Var.f26718r);
        z10Var.G = Bitmap.createBitmap(z10Var.f26717q, z10Var.f26718r, Bitmap.Config.ARGB_8888);
        bVar.draw(new Canvas(z10Var.G));
    }

    private boolean isCollage() {
        if (this.collageParts != null) {
            return true;
        }
        return false;
    }

    private void stepCollagePart(int i3, a20 a20Var, long j10) {
        boolean z10;
        float f10;
        Bitmap r5;
        long j11;
        long j12 = (j10 / 1000000) - a20Var.f21437f;
        float f11 = a20Var.f21440k;
        long j13 = a20Var.f21443o;
        long k10 = Utilities.k(j12, f11 * ((float) j13), a20Var.f21439j * ((float) j13));
        MediaCodecPlayer mediaCodecPlayer = a20Var.B;
        if (mediaCodecPlayer != null) {
            mediaCodecPlayer.ensure(k10);
            a20Var.f21448z.updateTexImage();
            return;
        }
        t5 t5Var = a20Var.f21447u;
        if (t5Var != null) {
            int i10 = t5Var.d[3];
            if (i10 <= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if ((k10 < i10 || (z10 && k10 > 1000)) && t5Var.f38260e0 != null) {
                t5Var.f38260e0.g(k10, true);
            }
            do {
                t5 t5Var2 = a20Var.f21447u;
                int i11 = t5Var2.d[3];
                f10 = (float) k10;
                if ((a20Var.v * 2.0f) + i11 >= f10) {
                    break;
                }
                j11 = i11;
                if (t5Var2.f38260e0 != null) {
                    t5Var2.f38260e0.c(null, false, t5Var2.f38264h0, t5Var2.f38265i0, false);
                }
            } while (a20Var.f21447u.d[3] != j11);
            if ((z10 || f10 > a20Var.f21447u.d[3] - (a20Var.v / 2.0f)) && (r5 = a20Var.f21447u.r(false)) != null) {
                GLES20.glBindTexture(3553, this.collageTextures[i3]);
                GLUtils.texImage2D(3553, 0, r5, 0);
            }
        }
    }

    public void changeFragmentShader(String str, String str2, boolean z10) {
        String str3;
        int createProgram;
        int createProgram2;
        if (this.messageVideoMaskPath != null) {
            if (z10) {
                str3 = "#version 320 es\nuniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nin vec4 aPosition;\nin vec4 aTextureCoord;\nin vec4 mTextureCoord;\nout vec2 vTextureCoord;\nout vec2 MTextureCoord;\nvoid main() {\n  gl_Position = uMVPMatrix * aPosition;\n  vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n  MTextureCoord = (uSTMatrix * mTextureCoord).xy;\n}\n";
            } else {
                str3 = "uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nattribute vec4 mTextureCoord;\nvarying vec2 vTextureCoord;\nvarying vec2 MTextureCoord;\nvoid main() {\n  gl_Position = uMVPMatrix * aPosition;\n  vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n  MTextureCoord = (uSTMatrix * mTextureCoord).xy;\n}\n";
            }
        } else if (z10) {
            str3 = "#version 320 es\nuniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nin vec4 aPosition;\nin vec4 aTextureCoord;\nout vec2 vTextureCoord;\nvoid main() {\n  gl_Position = uMVPMatrix * aPosition;\n  vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n";
        } else {
            str3 = "uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n  gl_Position = uMVPMatrix * aPosition;\n  vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n";
        }
        int i3 = this.NUM_EXTERNAL_SHADER;
        if (i3 >= 0 && i3 < this.mProgram.length && (createProgram2 = createProgram(str3, str, z10)) != 0) {
            GLES20.glDeleteProgram(this.mProgram[this.NUM_EXTERNAL_SHADER]);
            this.mProgram[this.NUM_EXTERNAL_SHADER] = createProgram2;
            this.texSizeHandle = GLES20.glGetUniformLocation(createProgram2, "texSize");
        }
        int i10 = this.NUM_FILTER_SHADER;
        if (i10 >= 0 && i10 < this.mProgram.length && (createProgram = createProgram(str3, str2, z10)) != 0) {
            GLES20.glDeleteProgram(this.mProgram[this.NUM_FILTER_SHADER]);
            this.mProgram[this.NUM_FILTER_SHADER] = createProgram;
        }
    }

    public void drawFrame(SurfaceTexture surfaceTexture, long j10) {
        int i3;
        int i10;
        int i11;
        float[] fArr;
        int i12;
        int i13;
        int i14;
        int i15;
        FloatBuffer floatBuffer;
        boolean z10;
        int i16;
        int i17;
        int i18;
        int[] iArr;
        if (this.isPhoto) {
            drawBackground();
            i11 = 3042;
            i14 = 0;
            i3 = 33985;
            i15 = 33984;
        } else {
            surfaceTexture.getTransformMatrix(this.mSTMatrix);
            if (r2.f25040a && this.firstFrame) {
                StringBuilder sb2 = new StringBuilder();
                int i19 = 0;
                while (true) {
                    float[] fArr2 = this.mSTMatrix;
                    i3 = 33985;
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
                i3 = 33985;
            }
            if (this.blendEnabled) {
                GLES20.glDisable(3042);
                this.blendEnabled = false;
            }
            sy syVar = this.filterShaders;
            if (syVar != null) {
                syVar.P0 = this.mSTMatrix;
                syVar.W0 = false;
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
                int g7 = this.filterShaders.g(!b10);
                int i21 = this.NUM_FILTER_SHADER;
                i11 = 3042;
                fArr = this.mSTMatrixIdentity;
                i12 = i21;
                i13 = g7;
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
                GLES20.glActiveTexture(i3);
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
                sy syVar2 = this.filterShaders;
                if (syVar2 != null) {
                    i16 = syVar2.g(i14 ^ 1);
                    sy syVar3 = this.filterShaders;
                    int i26 = syVar3.X0;
                    i18 = syVar3.Y0;
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
                GLES20.glBindTexture(3553, this.blur.f32637s[2]);
                GLES20.glUniform1i(this.blurMaskImageHandle, 1);
                GLES20.glActiveTexture(i3);
                GLES20.glBindTexture(3553, this.blurTexture[0]);
                GLES20.glDrawArrays(5, 0, 4);
            }
        }
        if (isCollage()) {
            for (int i27 = 0; i27 < this.collageParts.size(); i27++) {
                stepCollagePart(i27, this.collageParts.get(i27), j10);
                drawCollagePart(i27, this.collageParts.get(i27), j10);
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
                z10 = true;
            } else {
                z10 = false;
            }
            drawTexture(true, i28, -10000.0f, -10000.0f, -10000.0f, -10000.0f, 0.0f, false, z10, -1);
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
                drawEntity(this.mediaEntities.get(i31), this.mediaEntities.get(i31).f26712l, j10);
            }
        }
        GLES20.glFinish();
    }

    public int getTextureId() {
        return this.mTextureID;
    }

    public void release() {
        ArrayList<z10> arrayList = this.mediaEntities;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                z10 z10Var = this.mediaEntities.get(i3);
                RLottieNative rLottieNative = z10Var.D;
                if (rLottieNative != null) {
                    rLottieNative.d();
                }
                t5 t5Var = z10Var.J;
                if (t5Var != null) {
                    t5Var.u();
                }
                View view = z10Var.I;
                if (view instanceof bt) {
                    bt btVar = (bt) view;
                    p5.release(btVar, btVar.F);
                }
                Bitmap bitmap = z10Var.G;
                if (bitmap != null) {
                    bitmap.recycle();
                    z10Var.G = null;
                }
            }
        }
        ArrayList<a20> arrayList2 = this.collageParts;
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

    public void setBreakStrategy(ug.b bVar) {
        bVar.setBreakStrategy(0);
    }

    public void surfaceCreated() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.video.TextureRenderer.surfaceCreated():void");
    }

    private void drawTexture(boolean z10, int i3, float f10, float f11, float f12, float f13, float f14, boolean z11) {
        drawTexture(z10, i3, f10, f11, f12, f13, f14, z11, false, -1);
    }

    private void drawTexture(boolean z10, int i3, float f10, float f11, float f12, float f13, float f14, boolean z11, boolean z12, int i10) {
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
        if (z11) {
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
                double d10 = f14;
                float f25 = f21;
                double d11 = (fArr4[i14] - f24) / f23;
                fArr4[i13] = ((float) ((Math.cos(d10) * d) - (Math.sin(d10) * d11))) + f25;
                this.bitmapData[i14] = (((float) p1.c(d10, d11, Math.sin(d10) * d)) * f23) + f24;
                i11++;
                f21 = f25;
            }
        }
        this.bitmapVerticesBuffer.put(this.bitmapData).position(0);
        GLES20.glVertexAttribPointer(this.simplePositionHandle, 2, 5126, false, 8, (Buffer) (z12 ? this.verticesBuffer : this.bitmapVerticesBuffer));
        GLES20.glEnableVertexAttribArray(this.simpleInputTexCoordHandle);
        GLES20.glVertexAttribPointer(this.simpleInputTexCoordHandle, 2, 5126, false, 8, (Buffer) (z12 ? this.croppedTextureBuffer : this.textureBuffer));
        if (z10) {
            GLES20.glBindTexture(3553, i3);
        }
        GLES20.glDrawArrays(5, 0, 4);
    }
}

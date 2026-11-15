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
import com.google.android.gms.internal.vision.e2;
import hi.s;
import hi.t;
import java.io.File;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.d20;
import org.telegram.messenger.e20;
import org.telegram.messenger.f20;
import org.telegram.messenger.g0;
import org.telegram.messenger.g6;
import org.telegram.messenger.hd;
import org.telegram.messenger.i20;
import org.telegram.messenger.j6;
import org.telegram.messenger.k5;
import org.telegram.messenger.m10;
import org.telegram.messenger.r2;
import org.telegram.messenger.t0;
import org.telegram.messenger.xe;
import org.telegram.ui.Components.RLottieNative;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.kt;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.q5;
import org.telegram.ui.Components.t5;
import org.telegram.ui.Components.z9;
import org.telegram.ui.Components.zy;
import sg.a0;
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
    private z9 blur;
    private int blurBlurImageHandle;
    private int blurInputTexCoordHandle;
    private int blurMaskImageHandle;
    private String blurPath;
    private int blurPositionHandle;
    private int blurShaderProgram;
    private int[] blurTexture;
    private FloatBuffer blurVerticesBuffer;
    private ArrayList<f20> collageParts;
    private int[] collageTextures;
    private final xe cropState;
    private FloatBuffer croppedTextureBuffer;
    private ArrayList<g5> emojiDrawables;
    private zy filterShaders;
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
    private ArrayList<e20> mediaEntities;
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

    public TextureRenderer(org.telegram.messenger.gf r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, java.util.ArrayList<org.telegram.messenger.e20> r34, org.telegram.messenger.xe r35, int r36, int r37, int r38, int r39, int r40, float r41, boolean r42, java.lang.Integer r43, java.lang.Integer r44, hi.c7 r45, org.telegram.messenger.video.MediaCodecVideoConvertor.ConvertVideoParams r46) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.video.TextureRenderer.<init>(org.telegram.messenger.gf, java.lang.String, java.lang.String, java.lang.String, java.util.ArrayList, org.telegram.messenger.xe, int, int, int, int, int, float, boolean, java.lang.Integer, java.lang.Integer, hi.c7, org.telegram.messenger.video.MediaCodecVideoConvertor$ConvertVideoParams):void");
    }

    private void applyRoundRadius(e20 e20Var, Bitmap bitmap, int i7) {
        if (bitmap != null && e20Var != null) {
            if (e20Var.f23247s != 0.0f || i7 != 0) {
                if (e20Var.L == null) {
                    e20Var.L = new Canvas(bitmap);
                }
                if (e20Var.f23247s != 0.0f) {
                    if (this.path == null) {
                        this.path = new Path();
                    }
                    if (this.xRefPaint == null) {
                        Paint paint = new Paint(1);
                        this.xRefPaint = paint;
                        paint.setColor(-16777216);
                        this.xRefPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                    }
                    float min = Math.min(bitmap.getWidth(), bitmap.getHeight()) * e20Var.f23247s;
                    this.path.rewind();
                    this.path.addRoundRect(new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight()), min, min, Path.Direction.CCW);
                    this.path.toggleInverseFillType();
                    e20Var.L.drawPath(this.path, this.xRefPaint);
                }
                if (i7 != 0) {
                    if (this.textColorPaint == null) {
                        Paint paint2 = new Paint(1);
                        this.textColorPaint = paint2;
                        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
                    }
                    this.textColorPaint.setColor(i7);
                    e20Var.L.drawRect(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight(), this.textColorPaint);
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
            int h10 = zy.h(35633, str);
            if (h10 == 0 || (h7 = zy.h(35632, str2)) == 0 || (glCreateProgram2 = GLES20.glCreateProgram()) == 0) {
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
        int h11 = zy.h(35633, str);
        if (h11 == 0 || (h = zy.h(35632, str2)) == 0 || (glCreateProgram = GLES20.glCreateProgram()) == 0) {
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

    private void destroyCollagePart(int i7, f20 f20Var) {
        if (f20Var != null) {
            t5 t5Var = f20Var.f23436u;
            if (t5Var != null) {
                t5Var.u();
                f20Var.f23436u = null;
            }
            MediaCodecPlayer mediaCodecPlayer = f20Var.B;
            if (mediaCodecPlayer != null) {
                mediaCodecPlayer.release();
                f20Var.B = null;
            }
            SurfaceTexture surfaceTexture = f20Var.f23437z;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                f20Var.f23437z = null;
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

    private void drawCollagePart(int i7, f20 f20Var, long j3) {
        if (f20Var.B != null && f20Var.f23423b) {
            GLES20.glUseProgram(this.simpleShaderProgramOES);
            GLES20.glActiveTexture(33987);
            GLES20.glBindTexture(36197, this.collageTextures[i7]);
            GLES20.glUniform1i(this.simpleSourceImageHandleOES, 3);
            GLES20.glEnableVertexAttribArray(this.simpleInputTexCoordHandleOES);
            GLES20.glVertexAttribPointer(this.simpleInputTexCoordHandleOES, 2, 5126, false, 8, (Buffer) f20Var.f23435t);
            GLES20.glEnableVertexAttribArray(this.simplePositionHandleOES);
            GLES20.glVertexAttribPointer(this.simplePositionHandleOES, 2, 5126, false, 8, (Buffer) f20Var.f23434s);
        } else {
            GLES20.glUseProgram(this.simpleShaderProgram);
            GLES20.glActiveTexture(33986);
            GLES20.glBindTexture(3553, this.collageTextures[i7]);
            GLES20.glUniform1i(this.simpleSourceImageHandle, 2);
            GLES20.glEnableVertexAttribArray(this.simpleInputTexCoordHandle);
            GLES20.glVertexAttribPointer(this.simpleInputTexCoordHandle, 2, 5126, false, 8, (Buffer) f20Var.f23435t);
            GLES20.glEnableVertexAttribArray(this.simplePositionHandle);
            GLES20.glVertexAttribPointer(this.simplePositionHandle, 2, 5126, false, 8, (Buffer) f20Var.f23434s);
        }
        GLES20.glDrawArrays(5, 0, 4);
    }

    private void drawEntity(e20 e20Var, int i7, long j3) {
        e20 e20Var2;
        boolean z10;
        Bitmap bitmap;
        Bitmap bitmap2;
        int i10;
        boolean z11;
        long j10;
        long j11;
        long k10;
        int i11;
        boolean z12;
        RLottieNative rLottieNative = e20Var.D;
        if (rLottieNative != null) {
            Bitmap bitmap3 = e20Var.G;
            if (bitmap3 != null && e20Var.U > 0 && e20Var.V > 0) {
                rLottieNative.c((int) e20Var.E, bitmap3, true);
                Bitmap bitmap4 = e20Var.G;
                if ((e20Var.f23232b & 8) != 0) {
                    i11 = i7;
                } else {
                    i11 = 0;
                }
                applyRoundRadius(e20Var, bitmap4, i11);
                GLES20.glBindTexture(3553, this.stickerTexture[0]);
                GLUtils.texImage2D(3553, 0, e20Var.G, 0);
                float f10 = e20Var.E + e20Var.F;
                e20Var.E = f10;
                if (f10 >= e20Var.D.f32652a[0]) {
                    e20Var.E = 0.0f;
                }
                int i12 = this.stickerTexture[0];
                float f11 = e20Var.f23233c;
                float f12 = e20Var.d;
                float f13 = e20Var.f23235f;
                float f14 = e20Var.f23236g;
                float f15 = e20Var.f23234e;
                if ((2 & e20Var.f23232b) != 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                drawTexture(false, i12, f11, f12, f13, f14, f15, z12);
            }
        } else if (e20Var.J != null) {
            float f16 = e20Var.E;
            int i13 = (int) f16;
            float f17 = 1.0f;
            if (e20Var.f23231a == 5) {
                if (this.isPhoto) {
                    j10 = e20Var.T;
                    j11 = 0;
                } else {
                    long j12 = e20Var.Q;
                    j10 = (e20Var.S - e20Var.R) + j12;
                    j11 = j12;
                }
                long j13 = j3 / 1000000;
                if (j13 < j11) {
                    f17 = er.h.getInterpolation(Utilities.i(1.0f - (((float) (j11 - j13)) / 400.0f), 1.0f, 0.0f));
                } else if (j13 > j10) {
                    f17 = er.h.getInterpolation(Utilities.i(1.0f - (((float) (j13 - j10)) / 400.0f), 1.0f, 0.0f));
                }
                if (f17 > 0.0f) {
                    if (this.isPhoto) {
                        k10 = Utilities.k(j13, e20Var.T, 0L);
                    } else {
                        k10 = Utilities.k((j13 - e20Var.Q) + e20Var.R, e20Var.T, 0L);
                    }
                    while (!e20Var.K) {
                        int[] iArr = e20Var.J.d;
                        if (iArr[3] >= Math.min(k10, iArr[4])) {
                            break;
                        }
                        t5 t5Var = e20Var.J;
                        int i14 = t5Var.d[3];
                        t5Var.r(false);
                        int i15 = e20Var.J.d[3];
                        if (i15 <= i14 && (i15 != 0 || i14 != 0)) {
                            e20Var.K = true;
                            break;
                        }
                    }
                }
            } else {
                float f18 = f16 + e20Var.F;
                e20Var.E = f18;
                for (int i16 = (int) f18; i13 != i16; i16--) {
                    e20Var.J.r(true);
                }
            }
            q5 q5Var = e20Var.J.f39535w;
            if (q5Var != null) {
                bitmap = q5Var.f38521b;
            } else {
                bitmap = null;
            }
            if (bitmap != null) {
                if (e20Var.f23231a == 5) {
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
                        if ((e20Var.f23232b & 8) != 0) {
                            i10 = i7;
                        } else {
                            i10 = 0;
                        }
                        applyRoundRadius(e20Var, bitmap7, i10);
                    }
                    bitmap2 = this.stickerBitmap;
                }
                if (bitmap2 != null) {
                    GLES20.glBindTexture(3553, this.stickerTexture[0]);
                    GLUtils.texImage2D(3553, 0, bitmap2, 0);
                    int i17 = this.stickerTexture[0];
                    float f19 = e20Var.f23233c;
                    float f20 = e20Var.d;
                    float f21 = e20Var.f23235f;
                    float f22 = e20Var.f23236g;
                    float f23 = e20Var.f23234e;
                    if ((e20Var.f23232b & 2) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    drawTexture(false, i17, f19, f20, f21, f22, f23, z11);
                }
            }
        } else {
            if (e20Var.G != null) {
                GLES20.glBindTexture(3553, this.stickerTexture[0]);
                GLUtils.texImage2D(3553, 0, e20Var.G, 0);
                int i18 = this.stickerTexture[0];
                float f24 = e20Var.f23233c;
                float f25 = e20Var.h;
                float f26 = f24 - (f25 / 2.0f);
                float f27 = e20Var.d;
                float f28 = e20Var.f23237i;
                float f29 = f27 - (f28 / 2.0f);
                float f30 = e20Var.f23235f + f25;
                float f31 = f28 + e20Var.f23236g;
                float f32 = e20Var.f23234e;
                if (e20Var.f23231a == 2 && (e20Var.f23232b & 2) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                drawTexture(false, i18, f26, f29, f30, f31, f32, z10);
            }
            ArrayList arrayList = e20Var.f23239k;
            if (arrayList != null && !arrayList.isEmpty()) {
                for (int i19 = 0; i19 < e20Var.f23239k.size(); i19++) {
                    d20 d20Var = (d20) e20Var.f23239k.get(i19);
                    if (d20Var != null && (e20Var2 = d20Var.f23025b) != null) {
                        drawEntity(e20Var2, e20Var.f23240l, j3);
                    }
                }
            }
        }
    }

    private void drawTexture(boolean z10, int i7) {
        drawTexture(z10, i7, -10000.0f, -10000.0f, -10000.0f, -10000.0f, 0.0f, false);
    }

    private FloatBuffer floats(float[] fArr) {
        FloatBuffer h = i20.h(ByteBuffer.allocateDirect(fArr.length * 4));
        h.put(fArr).position(0);
        return h;
    }

    private void initCollagePart(int i7, f20 f20Var) {
        float f10;
        t tVar;
        AtomicInteger atomicInteger = new AtomicInteger(f20Var.f23430l);
        AtomicInteger atomicInteger2 = new AtomicInteger(f20Var.f23431m);
        AtomicInteger atomicInteger3 = new AtomicInteger(0);
        if (f20Var.f23423b) {
            GLES20.glBindTexture(36197, this.collageTextures[i7]);
            GLES20.glTexParameteri(36197, 10241, 9728);
            GLES20.glTexParameteri(36197, 10240, 9728);
            GLES20.glTexParameteri(36197, 10242, 33071);
            GLES20.glTexParameteri(36197, 10243, 33071);
            SurfaceTexture surfaceTexture = new SurfaceTexture(this.collageTextures[i7]);
            f20Var.f23437z = surfaceTexture;
            surfaceTexture.setDefaultBufferSize(f20Var.f23430l, f20Var.f23431m);
            try {
                f20Var.B = new MediaCodecPlayer(f20Var.d, new Surface(f20Var.f23437z));
            } catch (Exception e10) {
                a8.g(e10, true);
                f20Var.B = null;
            }
            MediaCodecPlayer mediaCodecPlayer = f20Var.B;
            if (mediaCodecPlayer != null) {
                atomicInteger.set(mediaCodecPlayer.getOrientedWidth());
                atomicInteger2.set(f20Var.B.getOrientedHeight());
                atomicInteger3.set(f20Var.B.getOrientation());
            } else {
                f20Var.f23437z.release();
                f20Var.f23437z = null;
                GLES20.glDeleteTextures(1, this.collageTextures, i7);
                GLES20.glGenTextures(1, this.collageTextures, i7);
                GLES20.glBindTexture(3553, this.collageTextures[i7]);
                GLES20.glTexParameteri(3553, 10241, 9729);
                GLES20.glTexParameteri(3553, 10240, 9729);
                GLES20.glTexParameteri(3553, 10242, 33071);
                GLES20.glTexParameteri(3553, 10243, 33071);
                t5 t5Var = new t5(new File(f20Var.d), true, 0L, 0, null, null, null, 0L, m10.f24940t0, true, 512, 512, null, 0, true);
                f20Var.f23436u = t5Var;
                if (t5Var.f39539y && t5Var.f39516f0) {
                    throw new RuntimeException("Failed to decode with ffmpeg software codecs");
                }
                f20Var.v = 1000.0f / t5Var.d[5];
                Bitmap r10 = t5Var.r(false);
                if (r10 != null) {
                    GLUtils.texImage2D(3553, 0, r10, 0);
                }
                atomicInteger.set(f20Var.f23436u.getIntrinsicWidth());
                atomicInteger2.set(f20Var.f23436u.getIntrinsicHeight());
                atomicInteger3.set(f20Var.f23436u.d[2]);
            }
        } else {
            GLES20.glBindTexture(3553, this.collageTextures[i7]);
            GLES20.glTexParameteri(3553, 10241, 9729);
            GLES20.glTexParameteri(3553, 10240, 9729);
            GLES20.glTexParameteri(3553, 10242, 33071);
            GLES20.glTexParameteri(3553, 10243, 33071);
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inMutable = true;
            Bitmap decodeFile = BitmapFactory.decodeFile(f20Var.d, options);
            Pair N0 = g0.N0(f20Var.d);
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
        float a10 = f20Var.f23433r.a(2.0f) - 1.0f;
        s sVar = f20Var.f23433r;
        s sVar2 = f20Var.f23433r;
        s sVar3 = f20Var.f23433r;
        s sVar4 = f20Var.f23433r;
        int i10 = sVar4.f15011a.f15123c;
        int i11 = sVar4.f15013c;
        float[] fArr = {a10, -(((2.0f / sVar.f15011a.f15123c) * sVar.f15013c) - 1.0f), sVar.b(2.0f) - 1.0f, -(((2.0f / sVar2.f15011a.f15123c) * sVar2.f15013c) - 1.0f), sVar2.a(2.0f) - 1.0f, -(((2.0f / sVar3.f15011a.f15123c) * (sVar3.f15013c + 1)) - 1.0f), sVar3.b(2.0f) - 1.0f, -(((2.0f / i10) * (i11 + 1)) - 1.0f)};
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
        f20Var.f23434s = floats(fArr);
        f20Var.f23435t = floats(fArr2);
    }

    private void initLinkEntity(e20 e20Var) {
        i0 i0Var = new i0(t0.f26609b, e20Var.P);
        i0Var.V = true;
        i0Var.b(m10.f24940t0, e20Var.W, false);
        if (i0Var.e()) {
            i0Var.setPreviewType(e20Var.f23232b);
        } else {
            i0Var.c(e20Var.f23232b, e20Var.f23240l);
        }
        int i7 = e20Var.f23245q;
        int i10 = i0Var.f57349f;
        i0Var.setMaxWidth(i7 + i10 + i10);
        i0Var.measure(View.MeasureSpec.makeMeasureSpec(e20Var.f23245q, 1073741824), View.MeasureSpec.makeMeasureSpec(e20Var.f23246r, 1073741824));
        i0Var.layout(0, 0, e20Var.f23245q, e20Var.f23246r);
        float f10 = e20Var.f23235f * this.transformedWidth;
        int i11 = e20Var.f23245q;
        float f11 = f10 / i11;
        e20Var.G = Bitmap.createBitmap(((int) (i11 * f11)) + 16, ((int) (e20Var.f23246r * f11)) + 16, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(e20Var.G);
        float f12 = 8;
        canvas.translate(f12, f12);
        canvas.scale(f11, f11);
        i0Var.draw(canvas);
        float f13 = 16 * f11;
        e20Var.h = f13 / this.transformedWidth;
        e20Var.f23237i = f13 / this.transformedHeight;
    }

    private void initLocationEntity(e20 e20Var) {
        float f10;
        float f11;
        byte b10 = e20Var.f23231a;
        m0 m0Var = new m0(t0.f26609b, e20Var.P);
        m0Var.setIsVideo(true);
        m0Var.setText(e20Var.f23238j);
        m0Var.e(e20Var.f23232b, e20Var.f23240l);
        if (e20Var.O != null && e20Var.f23239k.isEmpty()) {
            m0Var.d(m10.f24940t0, e20Var.O.f14885c);
        }
        m0Var.setMaxWidth(e20Var.f23245q);
        if (e20Var.f23239k.size() == 1) {
            m0Var.f57445y = true;
            m0Var.f57437c = true;
            m0Var.requestLayout();
        }
        m0Var.measure(View.MeasureSpec.makeMeasureSpec(e20Var.f23245q, 1073741824), View.MeasureSpec.makeMeasureSpec(e20Var.f23246r, 1073741824));
        m0Var.layout(0, 0, e20Var.f23245q, e20Var.f23246r);
        float f12 = e20Var.f23235f * this.transformedWidth;
        float f13 = e20Var.f23245q;
        float f14 = f12 / f13;
        e20Var.G = Bitmap.createBitmap(((int) (f13 * f14)) + 16, ((int) (e20Var.f23246r * f14)) + 16, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(e20Var.G);
        float f15 = 8;
        canvas.translate(f15, f15);
        canvas.scale(f14, f14);
        m0Var.draw(canvas);
        float f16 = 16 * f14;
        e20Var.h = f16 / this.transformedWidth;
        e20Var.f23237i = f16 / this.transformedHeight;
        if (e20Var.f23239k.size() == 1) {
            d20 d20Var = (d20) e20Var.f23239k.get(0);
            e20 e20Var2 = new e20();
            d20Var.f23025b = e20Var2;
            e20Var2.f23238j = d20Var.f23024a;
            e20Var2.f23232b = d20Var.f23026c;
            RectF rectF = new RectF();
            float f17 = m0Var.J;
            float f18 = m0Var.d.left + 2.25f;
            float f19 = m0Var.E;
            float f20 = m0Var.K;
            float f21 = m0Var.O;
            float f22 = f19 * 21.33f;
            rectF.set((f18 * f19) + f17, e2.A(f21, f22, 2.0f, f20), i20.b(f18, 21.33f, f19, f17), k5.a(f22, f21, 2.0f, f20));
            float centerX = ((rectF.centerX() / e20Var.f23245q) * e20Var.f23235f) + e20Var.f23233c;
            float f23 = e20Var.d;
            float centerY = rectF.centerY() / e20Var.f23246r;
            float f24 = e20Var.f23236g;
            float f25 = (centerY * f24) + f23;
            if (e20Var.f23234e != 0.0f) {
                float f26 = (e20Var.f23235f / 2.0f) + e20Var.f23233c;
                float f27 = (f24 / 2.0f) + e20Var.d;
                float f28 = this.transformedWidth / this.transformedHeight;
                double d = centerX - f26;
                double d2 = (f25 - f27) / f28;
                f11 = 2.0f;
                float cos = ((float) ((Math.cos(-f10) * d) - (Math.sin(-e20Var.f23234e) * d2))) + f26;
                f25 = (((float) i5.c.c(-e20Var.f23234e, d2, Math.sin(-e20Var.f23234e) * d)) * f28) + f27;
                centerX = cos;
            } else {
                f11 = 2.0f;
            }
            d20Var.f23025b.f23235f = (rectF.width() / e20Var.f23245q) * e20Var.f23235f;
            d20Var.f23025b.f23236g = (rectF.height() / e20Var.f23246r) * e20Var.f23236g;
            e20 e20Var3 = d20Var.f23025b;
            float f29 = e20Var3.f23235f * 1.2f;
            e20Var3.f23235f = f29;
            float f30 = e20Var3.f23236g * 1.2f;
            e20Var3.f23236g = f30;
            e20Var3.f23233c = centerX - (f29 / f11);
            e20Var3.d = f25 - (f30 / f11);
            e20Var3.f23234e = e20Var.f23234e;
            initStickerEntity(e20Var3);
        }
    }

    public void initStickerEntity(e20 e20Var) {
        Bitmap bitmap;
        xe xeVar;
        xe xeVar2;
        int i7;
        int i10 = (int) (e20Var.f23235f * this.transformedWidth);
        e20Var.U = i10;
        int i11 = (int) (e20Var.f23236g * this.transformedHeight);
        e20Var.V = i11;
        if (i10 > 512) {
            e20Var.V = (int) ((i11 / i10) * 512.0f);
            e20Var.U = 512;
        }
        int i12 = e20Var.V;
        if (i12 > 512) {
            e20Var.U = (int) ((e20Var.U / i12) * 512.0f);
            e20Var.V = 512;
        }
        byte b10 = e20Var.f23232b;
        float f10 = 0.0f;
        if ((b10 & 1) != 0) {
            int i13 = e20Var.U;
            if (i13 > 0 && (i7 = e20Var.V) > 0) {
                e20Var.G = Bitmap.createBitmap(i13, i7, Bitmap.Config.ARGB_8888);
                RLottieNative a10 = RLottieNative.a(e20Var.f23238j, null, null, null, 0, null);
                e20Var.D = a10;
                if (a10 != null) {
                    f10 = a10.f32652a[1] / this.videoFps;
                }
                e20Var.F = f10;
            }
        } else if ((b10 & 4) != 0) {
            e20Var.K = false;
            t5 t5Var = new t5(new File(e20Var.f23238j), true, 0L, 0, null, null, null, 0L, m10.f24940t0, true, 512, 512, null, 0, true);
            e20Var.J = t5Var;
            e20Var.F = t5Var.d[5] / this.videoFps;
            e20Var.E = 1.0f;
            t5Var.r(true);
        } else {
            String str = e20Var.f23238j;
            if (!TextUtils.isEmpty(e20Var.f23248t) && (e20Var.f23232b & 16) != 0) {
                str = e20Var.f23248t;
            }
            BitmapFactory.Options options = new BitmapFactory.Options();
            if (e20Var.f23231a == 2) {
                options.inMutable = true;
            }
            Bitmap decodeFile = BitmapFactory.decodeFile(str, options);
            e20Var.G = decodeFile;
            if (decodeFile != null && (xeVar = e20Var.f23249u) != null) {
                Bitmap createBitmap = Bitmap.createBitmap((int) Math.max(1.0f, xeVar.f27492e * decodeFile.getWidth()), (int) Math.max(1.0f, e20Var.f23249u.f27493f * e20Var.G.getHeight()), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
                canvas.rotate(-e20Var.f23249u.f27504z);
                int width = e20Var.G.getWidth();
                int height = e20Var.G.getHeight();
                xe xeVar3 = e20Var.f23249u;
                if (((xeVar3.f27504z + xeVar3.f27496k) / 90) % 2 == 1) {
                    width = e20Var.G.getHeight();
                    height = e20Var.G.getWidth();
                }
                xe xeVar4 = e20Var.f23249u;
                float f11 = xeVar4.f27492e;
                float f12 = xeVar4.f27493f;
                float f13 = width;
                float f14 = height;
                canvas.clipRect(((-width) * f11) / 2.0f, ((-height) * f12) / 2.0f, (f11 * f13) / 2.0f, (f12 * f14) / 2.0f);
                float f15 = e20Var.f23249u.f27491c;
                canvas.scale(f15, f15);
                xe xeVar5 = e20Var.f23249u;
                canvas.translate(xeVar5.f27489a * f13, xeVar5.f27490b * f14);
                canvas.rotate(e20Var.f23249u.d + xeVar2.f27496k);
                if (e20Var.f23249u.f27497l) {
                    canvas.scale(-1.0f, 1.0f);
                }
                canvas.rotate(e20Var.f23249u.f27504z);
                canvas.translate((-e20Var.G.getWidth()) / 2.0f, (-e20Var.G.getHeight()) / 2.0f);
                canvas.drawBitmap(e20Var.G, 0.0f, 0.0f, (Paint) null);
                e20Var.G.recycle();
                e20Var.G = createBitmap;
            }
            if (e20Var.f23231a == 2 && e20Var.G != null) {
                e20Var.f23247s = g0.L(12.0f) / Math.min(e20Var.f23245q, e20Var.f23246r);
                Pair N0 = g0.N0(e20Var.f23238j);
                e20Var.f23234e = (float) (e20Var.f23234e - Math.toRadians(((Integer) N0.first).intValue()));
                if ((((Integer) N0.first).intValue() / 90) % 2 == 1) {
                    float f16 = e20Var.f23233c;
                    float f17 = e20Var.f23235f;
                    float f18 = (f17 / 2.0f) + f16;
                    float f19 = e20Var.d;
                    float f20 = e20Var.f23236g;
                    float f21 = (f20 / 2.0f) + f19;
                    float f22 = this.transformedWidth;
                    float f23 = this.transformedHeight;
                    float f24 = (f17 * f22) / f23;
                    float f25 = (f20 * f23) / f22;
                    e20Var.f23235f = f25;
                    e20Var.f23236g = f24;
                    e20Var.f23233c = f18 - (f25 / 2.0f);
                    e20Var.d = f21 - (f24 / 2.0f);
                }
                applyRoundRadius(e20Var, e20Var.G, 0);
                return;
            }
            if (e20Var.G != null) {
                float width2 = bitmap.getWidth() / e20Var.G.getHeight();
                if (width2 > 1.0f) {
                    float f26 = e20Var.f23236g;
                    float f27 = f26 / width2;
                    e20Var.d = e2.A(f26, f27, 2.0f, e20Var.d);
                    e20Var.f23236g = f27;
                } else if (width2 < 1.0f) {
                    float f28 = e20Var.f23235f;
                    float f29 = width2 * f28;
                    e20Var.f23233c = e2.A(f28, f29, 2.0f, e20Var.f23233c);
                    e20Var.f23235f = f29;
                }
            }
        }
    }

    private void initTextEntity(final e20 e20Var) {
        int i7;
        int i10;
        int i11;
        Typeface d;
        final tg.b bVar = new tg.b(t0.f26609b);
        bVar.getPaint().setAntiAlias(true);
        bVar.H = false;
        bVar.setBackgroundColor(0);
        bVar.setPadding(g0.L(7.0f), g0.L(7.0f), g0.L(7.0f), g0.L(7.0f));
        a0 a0Var = e20Var.f23242n;
        if (a0Var != null && (d = a0Var.d()) != null) {
            bVar.setTypeface(d);
        }
        bVar.setTextSize(0, e20Var.f23241m);
        SpannableString spannableString = new SpannableString(e20Var.f23238j);
        ArrayList arrayList = e20Var.f23239k;
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            int i13 = i12 + 1;
            final d20 d20Var = (d20) arrayList.get(i12);
            if (d20Var.f23024a != null) {
                e20 e20Var2 = new e20();
                d20Var.f23025b = e20Var2;
                e20Var2.f23238j = d20Var.f23024a;
                e20Var2.f23232b = d20Var.f23026c;
                p5 p5Var = new p5(0L, 1.0f, bVar.getPaint().getFontMetricsInt()) {
                    @Override
                    public void draw(Canvas canvas, CharSequence charSequence, int i14, int i15, float f10, int i16, int i17, int i18, Paint paint) {
                        super.draw(canvas, charSequence, i14, i15, f10, i16, i17, i18, paint);
                        e20 e20Var3 = e20Var;
                        float paddingLeft = ((((this.measuredSize / 2.0f) + (bVar.getPaddingLeft() + f10)) / e20Var3.f23245q) * e20Var3.f23235f) + e20Var.f23233c;
                        float f11 = e20Var3.d;
                        e20 e20Var4 = e20Var;
                        float f12 = e20Var4.f23236g;
                        float paddingTop = (((((i18 - i16) / 2.0f) + (bVar.getPaddingTop() + i16)) / e20Var4.f23246r) * f12) + f11;
                        if (e20Var4.f23234e != 0.0f) {
                            float f13 = (e20Var4.f23235f / 2.0f) + e20Var4.f23233c;
                            float f14 = (f12 / 2.0f) + e20Var4.d;
                            float f15 = TextureRenderer.this.transformedWidth / TextureRenderer.this.transformedHeight;
                            double d2 = paddingLeft - f13;
                            double d10 = (paddingTop - f14) / f15;
                            paddingLeft = ((float) ((Math.cos(-e20Var.f23234e) * d2) - (Math.sin(-e20Var.f23234e) * d10))) + f13;
                            paddingTop = (((float) i5.c.c(-e20Var.f23234e, d10, Math.sin(-e20Var.f23234e) * d2)) * f15) + f14;
                        }
                        e20 e20Var5 = d20Var.f23025b;
                        int i19 = this.measuredSize;
                        e20 e20Var6 = e20Var;
                        float f16 = (i19 / e20Var6.f23245q) * e20Var6.f23235f;
                        e20Var5.f23235f = f16;
                        float f17 = (i19 / e20Var6.f23246r) * e20Var6.f23236g;
                        e20Var5.f23236g = f17;
                        e20Var5.f23233c = paddingLeft - (f16 / 2.0f);
                        e20Var5.d = paddingTop - (f17 / 2.0f);
                        e20Var5.f23234e = e20Var6.f23234e;
                        if (e20Var5.G == null) {
                            TextureRenderer.this.initStickerEntity(e20Var5);
                        }
                    }
                };
                int i14 = d20Var.offset;
                spannableString.setSpan(p5Var, i14, d20Var.length + i14, 33);
            }
            i12 = i13;
        }
        bVar.setText(j6.m(spannableString, bVar.getPaint().getFontMetricsInt(), false, null, 0));
        bVar.setTextColor(e20Var.f23240l);
        Editable text = bVar.getText();
        if (text != null) {
            for (g6 g6Var : (g6[]) text.getSpans(0, text.length(), g6.class)) {
                g6Var.f23696b = 0.85f;
            }
        }
        int i15 = e20Var.f23244p;
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
        int i16 = e20Var.f23244p;
        if (i16 != 1) {
            if (i16 == 2 ? !hd.f24104a0 : hd.f24104a0) {
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
        byte b10 = e20Var.f23232b;
        int i17 = -1;
        if (b10 == 0) {
            bVar.setFrameColor(e20Var.f23240l);
            if (g0.B(e20Var.f23240l) >= 0.721f) {
                i17 = -16777216;
            }
            bVar.setTextColor(i17);
        } else if (b10 == 1) {
            if (g0.B(e20Var.f23240l) >= 0.25f) {
                i11 = -1728053248;
            } else {
                i11 = -1711276033;
            }
            bVar.setFrameColor(i11);
            bVar.setTextColor(e20Var.f23240l);
        } else if (b10 == 2) {
            if (g0.B(e20Var.f23240l) >= 0.25f) {
                i17 = -16777216;
            }
            bVar.setFrameColor(i17);
            bVar.setTextColor(e20Var.f23240l);
        } else if (b10 == 3) {
            bVar.setFrameColor(0);
            bVar.setTextColor(e20Var.f23240l);
        }
        bVar.measure(View.MeasureSpec.makeMeasureSpec(e20Var.f23245q, 1073741824), View.MeasureSpec.makeMeasureSpec(e20Var.f23246r, 1073741824));
        bVar.layout(0, 0, e20Var.f23245q, e20Var.f23246r);
        e20Var.G = Bitmap.createBitmap(e20Var.f23245q, e20Var.f23246r, Bitmap.Config.ARGB_8888);
        bVar.draw(new Canvas(e20Var.G));
    }

    private boolean isCollage() {
        if (this.collageParts != null) {
            return true;
        }
        return false;
    }

    private void stepCollagePart(int i7, f20 f20Var, long j3) {
        boolean z10;
        float f10;
        Bitmap r10;
        long j10;
        long j11 = (j3 / 1000000) - f20Var.f23426f;
        float f11 = f20Var.f23429k;
        long j12 = f20Var.f23432o;
        long k10 = Utilities.k(j11, f11 * ((float) j12), f20Var.f23428j * ((float) j12));
        MediaCodecPlayer mediaCodecPlayer = f20Var.B;
        if (mediaCodecPlayer != null) {
            mediaCodecPlayer.ensure(k10);
            f20Var.f23437z.updateTexImage();
            return;
        }
        t5 t5Var = f20Var.f23436u;
        if (t5Var != null) {
            int i10 = t5Var.d[3];
            if (i10 <= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if ((k10 < i10 || (z10 && k10 > 1000)) && t5Var.f39514e0 != null) {
                t5Var.f39514e0.g(k10, true);
            }
            do {
                t5 t5Var2 = f20Var.f23436u;
                int i11 = t5Var2.d[3];
                f10 = (float) k10;
                if ((f20Var.v * 2.0f) + i11 >= f10) {
                    break;
                }
                j10 = i11;
                if (t5Var2.f39514e0 != null) {
                    t5Var2.f39514e0.c(null, false, t5Var2.f39518h0, t5Var2.f39519i0, false);
                }
            } while (f20Var.f23436u.d[3] != j10);
            if ((z10 || f10 > f20Var.f23436u.d[3] - (f20Var.v / 2.0f)) && (r10 = f20Var.f23436u.r(false)) != null) {
                GLES20.glBindTexture(3553, this.collageTextures[i7]);
                GLUtils.texImage2D(3553, 0, r10, 0);
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
        int i7 = this.NUM_EXTERNAL_SHADER;
        if (i7 >= 0 && i7 < this.mProgram.length && (createProgram2 = createProgram(str3, str, z10)) != 0) {
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
        boolean z10;
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
            if (r2.f26206a && this.firstFrame) {
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
            zy zyVar = this.filterShaders;
            if (zyVar != null) {
                zyVar.P0 = this.mSTMatrix;
                zyVar.W0 = false;
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
                zy zyVar2 = this.filterShaders;
                if (zyVar2 != null) {
                    i16 = zyVar2.g(i14 ^ 1);
                    zy zyVar3 = this.filterShaders;
                    int i26 = zyVar3.X0;
                    i18 = zyVar3.Y0;
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
                GLES20.glBindTexture(3553, this.blur.f42322s[2]);
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
                drawEntity(this.mediaEntities.get(i31), this.mediaEntities.get(i31).f23240l, j3);
            }
        }
        GLES20.glFinish();
    }

    public int getTextureId() {
        return this.mTextureID;
    }

    public void release() {
        ArrayList<e20> arrayList = this.mediaEntities;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                e20 e20Var = this.mediaEntities.get(i7);
                RLottieNative rLottieNative = e20Var.D;
                if (rLottieNative != null) {
                    rLottieNative.d();
                }
                t5 t5Var = e20Var.J;
                if (t5Var != null) {
                    t5Var.u();
                }
                View view = e20Var.I;
                if (view instanceof kt) {
                    kt ktVar = (kt) view;
                    p5.release(ktVar, ktVar.F);
                }
                Bitmap bitmap = e20Var.G;
                if (bitmap != null) {
                    bitmap.recycle();
                    e20Var.G = null;
                }
            }
        }
        ArrayList<f20> arrayList2 = this.collageParts;
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

    private void drawTexture(boolean z10, int i7, float f10, float f11, float f12, float f13, float f14, boolean z11) {
        drawTexture(z10, i7, f10, f11, f12, f13, f14, z11, false, -1);
    }

    private void drawTexture(boolean z10, int i7, float f10, float f11, float f12, float f13, float f14, boolean z11, boolean z12, int i10) {
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
                double d2 = f14;
                float f25 = f21;
                double d10 = (fArr4[i14] - f24) / f23;
                fArr4[i13] = ((float) ((Math.cos(d2) * d) - (Math.sin(d2) * d10))) + f25;
                this.bitmapData[i14] = (((float) i5.c.c(d2, d10, Math.sin(d2) * d)) * f23) + f24;
                i11++;
                f21 = f25;
            }
        }
        this.bitmapVerticesBuffer.put(this.bitmapData).position(0);
        GLES20.glVertexAttribPointer(this.simplePositionHandle, 2, 5126, false, 8, (Buffer) (z12 ? this.verticesBuffer : this.bitmapVerticesBuffer));
        GLES20.glEnableVertexAttribArray(this.simpleInputTexCoordHandle);
        GLES20.glVertexAttribPointer(this.simpleInputTexCoordHandle, 2, 5126, false, 8, (Buffer) (z12 ? this.croppedTextureBuffer : this.textureBuffer));
        if (z10) {
            GLES20.glBindTexture(3553, i7);
        }
        GLES20.glDrawArrays(5, 0, 4);
    }
}

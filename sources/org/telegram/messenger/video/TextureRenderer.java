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
import hi.u;
import hi.v;
import java.io.File;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.c20;
import org.telegram.messenger.d20;
import org.telegram.messenger.e20;
import org.telegram.messenger.f3;
import org.telegram.messenger.g0;
import org.telegram.messenger.g6;
import org.telegram.messenger.hd;
import org.telegram.messenger.j6;
import org.telegram.messenger.k10;
import org.telegram.messenger.o10;
import org.telegram.messenger.s2;
import org.telegram.messenger.t0;
import org.telegram.messenger.xe;
import org.telegram.ui.Components.RLottieNative;
import org.telegram.ui.Components.c6;
import org.telegram.ui.Components.ha;
import org.telegram.ui.Components.hz;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.rt;
import org.telegram.ui.Components.y5;
import org.telegram.ui.Components.z5;
import sg.a0;
import tg.j0;
import tg.n0;
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
    private ArrayList<e20> collageParts;
    private int[] collageTextures;
    private final xe cropState;
    private FloatBuffer croppedTextureBuffer;
    private ArrayList<p5> emojiDrawables;
    private hz filterShaders;
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
    private ArrayList<d20> mediaEntities;
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

    public TextureRenderer(org.telegram.messenger.gf r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, java.util.ArrayList<org.telegram.messenger.d20> r34, org.telegram.messenger.xe r35, int r36, int r37, int r38, int r39, int r40, float r41, boolean r42, java.lang.Integer r43, java.lang.Integer r44, hi.b7 r45, org.telegram.messenger.video.MediaCodecVideoConvertor.ConvertVideoParams r46) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.video.TextureRenderer.<init>(org.telegram.messenger.gf, java.lang.String, java.lang.String, java.lang.String, java.util.ArrayList, org.telegram.messenger.xe, int, int, int, int, int, float, boolean, java.lang.Integer, java.lang.Integer, hi.b7, org.telegram.messenger.video.MediaCodecVideoConvertor$ConvertVideoParams):void");
    }

    private void applyRoundRadius(d20 d20Var, Bitmap bitmap, int i7) {
        if (bitmap != null && d20Var != null) {
            if (d20Var.f23494s != 0.0f || i7 != 0) {
                if (d20Var.L == null) {
                    d20Var.L = new Canvas(bitmap);
                }
                if (d20Var.f23494s != 0.0f) {
                    if (this.path == null) {
                        this.path = new Path();
                    }
                    if (this.xRefPaint == null) {
                        Paint paint = new Paint(1);
                        this.xRefPaint = paint;
                        paint.setColor(-16777216);
                        this.xRefPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                    }
                    float min = Math.min(bitmap.getWidth(), bitmap.getHeight()) * d20Var.f23494s;
                    this.path.rewind();
                    this.path.addRoundRect(new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight()), min, min, Path.Direction.CCW);
                    this.path.toggleInverseFillType();
                    d20Var.L.drawPath(this.path, this.xRefPaint);
                }
                if (i7 != 0) {
                    if (this.textColorPaint == null) {
                        Paint paint2 = new Paint(1);
                        this.textColorPaint = paint2;
                        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
                    }
                    this.textColorPaint.setColor(i7);
                    d20Var.L.drawRect(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight(), this.textColorPaint);
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
            int h10 = hz.h(35633, str);
            if (h10 == 0 || (h7 = hz.h(35632, str2)) == 0 || (glCreateProgram2 = GLES20.glCreateProgram()) == 0) {
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
        int h11 = hz.h(35633, str);
        if (h11 == 0 || (h = hz.h(35632, str2)) == 0 || (glCreateProgram = GLES20.glCreateProgram()) == 0) {
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

    private void destroyCollagePart(int i7, e20 e20Var) {
        if (e20Var != null) {
            c6 c6Var = e20Var.f23675u;
            if (c6Var != null) {
                c6Var.u();
                e20Var.f23675u = null;
            }
            MediaCodecPlayer mediaCodecPlayer = e20Var.B;
            if (mediaCodecPlayer != null) {
                mediaCodecPlayer.release();
                e20Var.B = null;
            }
            SurfaceTexture surfaceTexture = e20Var.f23676z;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                e20Var.f23676z = null;
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

    private void drawCollagePart(int i7, e20 e20Var, long j3) {
        if (e20Var.B != null && e20Var.f23662b) {
            GLES20.glUseProgram(this.simpleShaderProgramOES);
            GLES20.glActiveTexture(33987);
            GLES20.glBindTexture(36197, this.collageTextures[i7]);
            GLES20.glUniform1i(this.simpleSourceImageHandleOES, 3);
            GLES20.glEnableVertexAttribArray(this.simpleInputTexCoordHandleOES);
            GLES20.glVertexAttribPointer(this.simpleInputTexCoordHandleOES, 2, 5126, false, 8, (Buffer) e20Var.f23674t);
            GLES20.glEnableVertexAttribArray(this.simplePositionHandleOES);
            GLES20.glVertexAttribPointer(this.simplePositionHandleOES, 2, 5126, false, 8, (Buffer) e20Var.f23673s);
        } else {
            GLES20.glUseProgram(this.simpleShaderProgram);
            GLES20.glActiveTexture(33986);
            GLES20.glBindTexture(3553, this.collageTextures[i7]);
            GLES20.glUniform1i(this.simpleSourceImageHandle, 2);
            GLES20.glEnableVertexAttribArray(this.simpleInputTexCoordHandle);
            GLES20.glVertexAttribPointer(this.simpleInputTexCoordHandle, 2, 5126, false, 8, (Buffer) e20Var.f23674t);
            GLES20.glEnableVertexAttribArray(this.simplePositionHandle);
            GLES20.glVertexAttribPointer(this.simplePositionHandle, 2, 5126, false, 8, (Buffer) e20Var.f23673s);
        }
        GLES20.glDrawArrays(5, 0, 4);
    }

    private void drawEntity(d20 d20Var, int i7, long j3) {
        d20 d20Var2;
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
        RLottieNative rLottieNative = d20Var.D;
        if (rLottieNative != null) {
            Bitmap bitmap3 = d20Var.G;
            if (bitmap3 != null && d20Var.U > 0 && d20Var.V > 0) {
                rLottieNative.c((int) d20Var.E, bitmap3, true);
                Bitmap bitmap4 = d20Var.G;
                if ((d20Var.f23479b & 8) != 0) {
                    i11 = i7;
                } else {
                    i11 = 0;
                }
                applyRoundRadius(d20Var, bitmap4, i11);
                GLES20.glBindTexture(3553, this.stickerTexture[0]);
                GLUtils.texImage2D(3553, 0, d20Var.G, 0);
                float f10 = d20Var.E + d20Var.F;
                d20Var.E = f10;
                if (f10 >= d20Var.D.f33085a[0]) {
                    d20Var.E = 0.0f;
                }
                int i12 = this.stickerTexture[0];
                float f11 = d20Var.f23480c;
                float f12 = d20Var.d;
                float f13 = d20Var.f23482f;
                float f14 = d20Var.f23483g;
                float f15 = d20Var.f23481e;
                if ((2 & d20Var.f23479b) != 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                drawTexture(false, i12, f11, f12, f13, f14, f15, z12);
            }
        } else if (d20Var.J != null) {
            float f16 = d20Var.E;
            int i13 = (int) f16;
            float f17 = 1.0f;
            if (d20Var.f23478a == 5) {
                if (this.isPhoto) {
                    j10 = d20Var.T;
                    j11 = 0;
                } else {
                    long j12 = d20Var.Q;
                    j10 = (d20Var.S - d20Var.R) + j12;
                    j11 = j12;
                }
                long j13 = j3 / 1000000;
                if (j13 < j11) {
                    f17 = nr.h.getInterpolation(Utilities.i(1.0f - (((float) (j11 - j13)) / 400.0f), 1.0f, 0.0f));
                } else if (j13 > j10) {
                    f17 = nr.h.getInterpolation(Utilities.i(1.0f - (((float) (j13 - j10)) / 400.0f), 1.0f, 0.0f));
                }
                if (f17 > 0.0f) {
                    if (this.isPhoto) {
                        k10 = Utilities.k(j13, d20Var.T, 0L);
                    } else {
                        k10 = Utilities.k((j13 - d20Var.Q) + d20Var.R, d20Var.T, 0L);
                    }
                    while (!d20Var.K) {
                        int[] iArr = d20Var.J.d;
                        if (iArr[3] >= Math.min(k10, iArr[4])) {
                            break;
                        }
                        c6 c6Var = d20Var.J;
                        int i14 = c6Var.d[3];
                        c6Var.r(false);
                        int i15 = d20Var.J.d[3];
                        if (i15 <= i14 && (i15 != 0 || i14 != 0)) {
                            d20Var.K = true;
                            break;
                        }
                    }
                }
            } else {
                float f18 = f16 + d20Var.F;
                d20Var.E = f18;
                for (int i16 = (int) f18; i13 != i16; i16--) {
                    d20Var.J.r(true);
                }
            }
            z5 z5Var = d20Var.J.f34096w;
            if (z5Var != null) {
                bitmap = z5Var.f42683b;
            } else {
                bitmap = null;
            }
            if (bitmap != null) {
                if (d20Var.f23478a == 5) {
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
                        if ((d20Var.f23479b & 8) != 0) {
                            i10 = i7;
                        } else {
                            i10 = 0;
                        }
                        applyRoundRadius(d20Var, bitmap7, i10);
                    }
                    bitmap2 = this.stickerBitmap;
                }
                if (bitmap2 != null) {
                    GLES20.glBindTexture(3553, this.stickerTexture[0]);
                    GLUtils.texImage2D(3553, 0, bitmap2, 0);
                    int i17 = this.stickerTexture[0];
                    float f19 = d20Var.f23480c;
                    float f20 = d20Var.d;
                    float f21 = d20Var.f23482f;
                    float f22 = d20Var.f23483g;
                    float f23 = d20Var.f23481e;
                    if ((d20Var.f23479b & 2) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    drawTexture(false, i17, f19, f20, f21, f22, f23, z11);
                }
            }
        } else {
            if (d20Var.G != null) {
                GLES20.glBindTexture(3553, this.stickerTexture[0]);
                GLUtils.texImage2D(3553, 0, d20Var.G, 0);
                int i18 = this.stickerTexture[0];
                float f24 = d20Var.f23480c;
                float f25 = d20Var.h;
                float f26 = f24 - (f25 / 2.0f);
                float f27 = d20Var.d;
                float f28 = d20Var.f23484i;
                float f29 = f27 - (f28 / 2.0f);
                float f30 = d20Var.f23482f + f25;
                float f31 = f28 + d20Var.f23483g;
                float f32 = d20Var.f23481e;
                if (d20Var.f23478a == 2 && (d20Var.f23479b & 2) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                drawTexture(false, i18, f26, f29, f30, f31, f32, z10);
            }
            ArrayList arrayList = d20Var.f23486k;
            if (arrayList != null && !arrayList.isEmpty()) {
                for (int i19 = 0; i19 < d20Var.f23486k.size(); i19++) {
                    c20 c20Var = (c20) d20Var.f23486k.get(i19);
                    if (c20Var != null && (d20Var2 = c20Var.f23220b) != null) {
                        drawEntity(d20Var2, d20Var.f23487l, j3);
                    }
                }
            }
        }
    }

    private void drawTexture(boolean z10, int i7) {
        drawTexture(z10, i7, -10000.0f, -10000.0f, -10000.0f, -10000.0f, 0.0f, false);
    }

    private FloatBuffer floats(float[] fArr) {
        FloatBuffer i7 = o10.i(ByteBuffer.allocateDirect(fArr.length * 4));
        i7.put(fArr).position(0);
        return i7;
    }

    private void initCollagePart(int i7, e20 e20Var) {
        float f10;
        v vVar;
        AtomicInteger atomicInteger = new AtomicInteger(e20Var.f23669l);
        AtomicInteger atomicInteger2 = new AtomicInteger(e20Var.f23670m);
        AtomicInteger atomicInteger3 = new AtomicInteger(0);
        if (e20Var.f23662b) {
            GLES20.glBindTexture(36197, this.collageTextures[i7]);
            GLES20.glTexParameteri(36197, 10241, 9728);
            GLES20.glTexParameteri(36197, 10240, 9728);
            GLES20.glTexParameteri(36197, 10242, 33071);
            GLES20.glTexParameteri(36197, 10243, 33071);
            SurfaceTexture surfaceTexture = new SurfaceTexture(this.collageTextures[i7]);
            e20Var.f23676z = surfaceTexture;
            surfaceTexture.setDefaultBufferSize(e20Var.f23669l, e20Var.f23670m);
            try {
                e20Var.B = new MediaCodecPlayer(e20Var.d, new Surface(e20Var.f23676z));
            } catch (Exception e10) {
                a8.g(e10, true);
                e20Var.B = null;
            }
            MediaCodecPlayer mediaCodecPlayer = e20Var.B;
            if (mediaCodecPlayer != null) {
                atomicInteger.set(mediaCodecPlayer.getOrientedWidth());
                atomicInteger2.set(e20Var.B.getOrientedHeight());
                atomicInteger3.set(e20Var.B.getOrientation());
            } else {
                e20Var.f23676z.release();
                e20Var.f23676z = null;
                GLES20.glDeleteTextures(1, this.collageTextures, i7);
                GLES20.glGenTextures(1, this.collageTextures, i7);
                GLES20.glBindTexture(3553, this.collageTextures[i7]);
                GLES20.glTexParameteri(3553, 10241, 9729);
                GLES20.glTexParameteri(3553, 10240, 9729);
                GLES20.glTexParameteri(3553, 10242, 33071);
                GLES20.glTexParameteri(3553, 10243, 33071);
                c6 c6Var = new c6(new File(e20Var.d), true, 0L, 0, null, null, null, 0L, k10.f24968t0, true, 512, 512, null, 0, true);
                e20Var.f23675u = c6Var;
                if (c6Var.f34100y && c6Var.f34077f0) {
                    throw new RuntimeException("Failed to decode with ffmpeg software codecs");
                }
                e20Var.v = 1000.0f / c6Var.d[5];
                Bitmap r10 = c6Var.r(false);
                if (r10 != null) {
                    GLUtils.texImage2D(3553, 0, r10, 0);
                }
                atomicInteger.set(e20Var.f23675u.getIntrinsicWidth());
                atomicInteger2.set(e20Var.f23675u.getIntrinsicHeight());
                atomicInteger3.set(e20Var.f23675u.d[2]);
            }
        } else {
            GLES20.glBindTexture(3553, this.collageTextures[i7]);
            GLES20.glTexParameteri(3553, 10241, 9729);
            GLES20.glTexParameteri(3553, 10240, 9729);
            GLES20.glTexParameteri(3553, 10242, 33071);
            GLES20.glTexParameteri(3553, 10243, 33071);
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inMutable = true;
            Bitmap decodeFile = BitmapFactory.decodeFile(e20Var.d, options);
            Pair N0 = g0.N0(e20Var.d);
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
        float a10 = e20Var.f23672r.a(2.0f) - 1.0f;
        u uVar = e20Var.f23672r;
        u uVar2 = e20Var.f23672r;
        u uVar3 = e20Var.f23672r;
        u uVar4 = e20Var.f23672r;
        int i10 = uVar4.f15522a.f15590c;
        int i11 = uVar4.f15524c;
        float[] fArr = {a10, -(((2.0f / uVar.f15522a.f15590c) * uVar.f15524c) - 1.0f), uVar.b(2.0f) - 1.0f, -(((2.0f / uVar2.f15522a.f15590c) * uVar2.f15524c) - 1.0f), uVar2.a(2.0f) - 1.0f, -(((2.0f / uVar3.f15522a.f15590c) * (uVar3.f15524c + 1)) - 1.0f), uVar3.b(2.0f) - 1.0f, -(((2.0f / i10) * (i11 + 1)) - 1.0f)};
        float f12 = this.transformedWidth / vVar.d[i11];
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
        e20Var.f23673s = floats(fArr);
        e20Var.f23674t = floats(fArr2);
    }

    private void initLinkEntity(d20 d20Var) {
        j0 j0Var = new j0(t0.f26931b, d20Var.P);
        j0Var.V = true;
        j0Var.b(k10.f24968t0, d20Var.W, false);
        if (j0Var.e()) {
            j0Var.setPreviewType(d20Var.f23479b);
        } else {
            j0Var.c(d20Var.f23479b, d20Var.f23487l);
        }
        int i7 = d20Var.f23492q;
        int i10 = j0Var.f58007f;
        j0Var.setMaxWidth(i7 + i10 + i10);
        j0Var.measure(View.MeasureSpec.makeMeasureSpec(d20Var.f23492q, 1073741824), View.MeasureSpec.makeMeasureSpec(d20Var.f23493r, 1073741824));
        j0Var.layout(0, 0, d20Var.f23492q, d20Var.f23493r);
        float f10 = d20Var.f23482f * this.transformedWidth;
        int i11 = d20Var.f23492q;
        float f11 = f10 / i11;
        d20Var.G = Bitmap.createBitmap(((int) (i11 * f11)) + 16, ((int) (d20Var.f23493r * f11)) + 16, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(d20Var.G);
        float f12 = 8;
        canvas.translate(f12, f12);
        canvas.scale(f11, f11);
        j0Var.draw(canvas);
        float f13 = 16 * f11;
        d20Var.h = f13 / this.transformedWidth;
        d20Var.f23484i = f13 / this.transformedHeight;
    }

    private void initLocationEntity(d20 d20Var) {
        float f10;
        float f11;
        byte b10 = d20Var.f23478a;
        n0 n0Var = new n0(t0.f26931b, d20Var.P);
        n0Var.setIsVideo(true);
        n0Var.setText(d20Var.f23485j);
        n0Var.e(d20Var.f23479b, d20Var.f23487l);
        if (d20Var.O != null && d20Var.f23486k.isEmpty()) {
            n0Var.d(k10.f24968t0, d20Var.O.f15286c);
        }
        n0Var.setMaxWidth(d20Var.f23492q);
        if (d20Var.f23486k.size() == 1) {
            n0Var.f58075y = true;
            n0Var.f58067c = true;
            n0Var.requestLayout();
        }
        n0Var.measure(View.MeasureSpec.makeMeasureSpec(d20Var.f23492q, 1073741824), View.MeasureSpec.makeMeasureSpec(d20Var.f23493r, 1073741824));
        n0Var.layout(0, 0, d20Var.f23492q, d20Var.f23493r);
        float f12 = d20Var.f23482f * this.transformedWidth;
        float f13 = d20Var.f23492q;
        float f14 = f12 / f13;
        d20Var.G = Bitmap.createBitmap(((int) (f13 * f14)) + 16, ((int) (d20Var.f23493r * f14)) + 16, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(d20Var.G);
        float f15 = 8;
        canvas.translate(f15, f15);
        canvas.scale(f14, f14);
        n0Var.draw(canvas);
        float f16 = 16 * f14;
        d20Var.h = f16 / this.transformedWidth;
        d20Var.f23484i = f16 / this.transformedHeight;
        if (d20Var.f23486k.size() == 1) {
            c20 c20Var = (c20) d20Var.f23486k.get(0);
            d20 d20Var2 = new d20();
            c20Var.f23220b = d20Var2;
            d20Var2.f23485j = c20Var.f23219a;
            d20Var2.f23479b = c20Var.f23221c;
            RectF rectF = new RectF();
            float f17 = n0Var.J;
            float f18 = n0Var.d.left + 2.25f;
            float f19 = n0Var.E;
            float f20 = n0Var.K;
            float f21 = n0Var.O;
            float f22 = f19 * 21.33f;
            rectF.set((f18 * f19) + f17, e2.A(f21, f22, 2.0f, f20), o10.b(f18, 21.33f, f19, f17), f3.a(f22, f21, 2.0f, f20));
            float centerX = ((rectF.centerX() / d20Var.f23492q) * d20Var.f23482f) + d20Var.f23480c;
            float f23 = d20Var.d;
            float centerY = rectF.centerY() / d20Var.f23493r;
            float f24 = d20Var.f23483g;
            float f25 = (centerY * f24) + f23;
            if (d20Var.f23481e != 0.0f) {
                float f26 = (d20Var.f23482f / 2.0f) + d20Var.f23480c;
                float f27 = (f24 / 2.0f) + d20Var.d;
                float f28 = this.transformedWidth / this.transformedHeight;
                double d = centerX - f26;
                double d2 = (f25 - f27) / f28;
                f11 = 2.0f;
                float cos = ((float) ((Math.cos(-f10) * d) - (Math.sin(-d20Var.f23481e) * d2))) + f26;
                f25 = (((float) i5.c.c(-d20Var.f23481e, d2, Math.sin(-d20Var.f23481e) * d)) * f28) + f27;
                centerX = cos;
            } else {
                f11 = 2.0f;
            }
            c20Var.f23220b.f23482f = (rectF.width() / d20Var.f23492q) * d20Var.f23482f;
            c20Var.f23220b.f23483g = (rectF.height() / d20Var.f23493r) * d20Var.f23483g;
            d20 d20Var3 = c20Var.f23220b;
            float f29 = d20Var3.f23482f * 1.2f;
            d20Var3.f23482f = f29;
            float f30 = d20Var3.f23483g * 1.2f;
            d20Var3.f23483g = f30;
            d20Var3.f23480c = centerX - (f29 / f11);
            d20Var3.d = f25 - (f30 / f11);
            d20Var3.f23481e = d20Var.f23481e;
            initStickerEntity(d20Var3);
        }
    }

    public void initStickerEntity(d20 d20Var) {
        Bitmap bitmap;
        xe xeVar;
        xe xeVar2;
        int i7;
        int i10 = (int) (d20Var.f23482f * this.transformedWidth);
        d20Var.U = i10;
        int i11 = (int) (d20Var.f23483g * this.transformedHeight);
        d20Var.V = i11;
        if (i10 > 512) {
            d20Var.V = (int) ((i11 / i10) * 512.0f);
            d20Var.U = 512;
        }
        int i12 = d20Var.V;
        if (i12 > 512) {
            d20Var.U = (int) ((d20Var.U / i12) * 512.0f);
            d20Var.V = 512;
        }
        byte b10 = d20Var.f23479b;
        float f10 = 0.0f;
        if ((b10 & 1) != 0) {
            int i13 = d20Var.U;
            if (i13 > 0 && (i7 = d20Var.V) > 0) {
                d20Var.G = Bitmap.createBitmap(i13, i7, Bitmap.Config.ARGB_8888);
                RLottieNative a10 = RLottieNative.a(d20Var.f23485j, null, null, null, 0, null);
                d20Var.D = a10;
                if (a10 != null) {
                    f10 = a10.f33085a[1] / this.videoFps;
                }
                d20Var.F = f10;
            }
        } else if ((b10 & 4) != 0) {
            d20Var.K = false;
            c6 c6Var = new c6(new File(d20Var.f23485j), true, 0L, 0, null, null, null, 0L, k10.f24968t0, true, 512, 512, null, 0, true);
            d20Var.J = c6Var;
            d20Var.F = c6Var.d[5] / this.videoFps;
            d20Var.E = 1.0f;
            c6Var.r(true);
        } else {
            String str = d20Var.f23485j;
            if (!TextUtils.isEmpty(d20Var.f23495t) && (d20Var.f23479b & 16) != 0) {
                str = d20Var.f23495t;
            }
            BitmapFactory.Options options = new BitmapFactory.Options();
            if (d20Var.f23478a == 2) {
                options.inMutable = true;
            }
            Bitmap decodeFile = BitmapFactory.decodeFile(str, options);
            d20Var.G = decodeFile;
            if (decodeFile != null && (xeVar = d20Var.f23496u) != null) {
                Bitmap createBitmap = Bitmap.createBitmap((int) Math.max(1.0f, xeVar.f27877e * decodeFile.getWidth()), (int) Math.max(1.0f, d20Var.f23496u.f27878f * d20Var.G.getHeight()), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
                canvas.rotate(-d20Var.f23496u.f27889z);
                int width = d20Var.G.getWidth();
                int height = d20Var.G.getHeight();
                xe xeVar3 = d20Var.f23496u;
                if (((xeVar3.f27889z + xeVar3.f27881k) / 90) % 2 == 1) {
                    width = d20Var.G.getHeight();
                    height = d20Var.G.getWidth();
                }
                xe xeVar4 = d20Var.f23496u;
                float f11 = xeVar4.f27877e;
                float f12 = xeVar4.f27878f;
                float f13 = width;
                float f14 = height;
                canvas.clipRect(((-width) * f11) / 2.0f, ((-height) * f12) / 2.0f, (f11 * f13) / 2.0f, (f12 * f14) / 2.0f);
                float f15 = d20Var.f23496u.f27876c;
                canvas.scale(f15, f15);
                xe xeVar5 = d20Var.f23496u;
                canvas.translate(xeVar5.f27874a * f13, xeVar5.f27875b * f14);
                canvas.rotate(d20Var.f23496u.d + xeVar2.f27881k);
                if (d20Var.f23496u.f27882l) {
                    canvas.scale(-1.0f, 1.0f);
                }
                canvas.rotate(d20Var.f23496u.f27889z);
                canvas.translate((-d20Var.G.getWidth()) / 2.0f, (-d20Var.G.getHeight()) / 2.0f);
                canvas.drawBitmap(d20Var.G, 0.0f, 0.0f, (Paint) null);
                d20Var.G.recycle();
                d20Var.G = createBitmap;
            }
            if (d20Var.f23478a == 2 && d20Var.G != null) {
                d20Var.f23494s = g0.L(12.0f) / Math.min(d20Var.f23492q, d20Var.f23493r);
                Pair N0 = g0.N0(d20Var.f23485j);
                d20Var.f23481e = (float) (d20Var.f23481e - Math.toRadians(((Integer) N0.first).intValue()));
                if ((((Integer) N0.first).intValue() / 90) % 2 == 1) {
                    float f16 = d20Var.f23480c;
                    float f17 = d20Var.f23482f;
                    float f18 = (f17 / 2.0f) + f16;
                    float f19 = d20Var.d;
                    float f20 = d20Var.f23483g;
                    float f21 = (f20 / 2.0f) + f19;
                    float f22 = this.transformedWidth;
                    float f23 = this.transformedHeight;
                    float f24 = (f17 * f22) / f23;
                    float f25 = (f20 * f23) / f22;
                    d20Var.f23482f = f25;
                    d20Var.f23483g = f24;
                    d20Var.f23480c = f18 - (f25 / 2.0f);
                    d20Var.d = f21 - (f24 / 2.0f);
                }
                applyRoundRadius(d20Var, d20Var.G, 0);
                return;
            }
            if (d20Var.G != null) {
                float width2 = bitmap.getWidth() / d20Var.G.getHeight();
                if (width2 > 1.0f) {
                    float f26 = d20Var.f23483g;
                    float f27 = f26 / width2;
                    d20Var.d = e2.A(f26, f27, 2.0f, d20Var.d);
                    d20Var.f23483g = f27;
                } else if (width2 < 1.0f) {
                    float f28 = d20Var.f23482f;
                    float f29 = width2 * f28;
                    d20Var.f23480c = e2.A(f28, f29, 2.0f, d20Var.f23480c);
                    d20Var.f23482f = f29;
                }
            }
        }
    }

    private void initTextEntity(final d20 d20Var) {
        int i7;
        int i10;
        int i11;
        Typeface d;
        final tg.b bVar = new tg.b(t0.f26931b);
        bVar.getPaint().setAntiAlias(true);
        bVar.H = false;
        bVar.setBackgroundColor(0);
        bVar.setPadding(g0.L(7.0f), g0.L(7.0f), g0.L(7.0f), g0.L(7.0f));
        a0 a0Var = d20Var.f23489n;
        if (a0Var != null && (d = a0Var.d()) != null) {
            bVar.setTypeface(d);
        }
        bVar.setTextSize(0, d20Var.f23488m);
        SpannableString spannableString = new SpannableString(d20Var.f23485j);
        ArrayList arrayList = d20Var.f23486k;
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            int i13 = i12 + 1;
            final c20 c20Var = (c20) arrayList.get(i12);
            if (c20Var.f23219a != null) {
                d20 d20Var2 = new d20();
                c20Var.f23220b = d20Var2;
                d20Var2.f23485j = c20Var.f23219a;
                d20Var2.f23479b = c20Var.f23221c;
                y5 y5Var = new y5(0L, 1.0f, bVar.getPaint().getFontMetricsInt()) {
                    @Override
                    public void draw(Canvas canvas, CharSequence charSequence, int i14, int i15, float f10, int i16, int i17, int i18, Paint paint) {
                        super.draw(canvas, charSequence, i14, i15, f10, i16, i17, i18, paint);
                        d20 d20Var3 = d20Var;
                        float paddingLeft = ((((this.measuredSize / 2.0f) + (bVar.getPaddingLeft() + f10)) / d20Var3.f23492q) * d20Var3.f23482f) + d20Var.f23480c;
                        float f11 = d20Var3.d;
                        d20 d20Var4 = d20Var;
                        float f12 = d20Var4.f23483g;
                        float paddingTop = (((((i18 - i16) / 2.0f) + (bVar.getPaddingTop() + i16)) / d20Var4.f23493r) * f12) + f11;
                        if (d20Var4.f23481e != 0.0f) {
                            float f13 = (d20Var4.f23482f / 2.0f) + d20Var4.f23480c;
                            float f14 = (f12 / 2.0f) + d20Var4.d;
                            float f15 = TextureRenderer.this.transformedWidth / TextureRenderer.this.transformedHeight;
                            double d2 = paddingLeft - f13;
                            double d10 = (paddingTop - f14) / f15;
                            paddingLeft = ((float) ((Math.cos(-d20Var.f23481e) * d2) - (Math.sin(-d20Var.f23481e) * d10))) + f13;
                            paddingTop = (((float) i5.c.c(-d20Var.f23481e, d10, Math.sin(-d20Var.f23481e) * d2)) * f15) + f14;
                        }
                        d20 d20Var5 = c20Var.f23220b;
                        int i19 = this.measuredSize;
                        d20 d20Var6 = d20Var;
                        float f16 = (i19 / d20Var6.f23492q) * d20Var6.f23482f;
                        d20Var5.f23482f = f16;
                        float f17 = (i19 / d20Var6.f23493r) * d20Var6.f23483g;
                        d20Var5.f23483g = f17;
                        d20Var5.f23480c = paddingLeft - (f16 / 2.0f);
                        d20Var5.d = paddingTop - (f17 / 2.0f);
                        d20Var5.f23481e = d20Var6.f23481e;
                        if (d20Var5.G == null) {
                            TextureRenderer.this.initStickerEntity(d20Var5);
                        }
                    }
                };
                int i14 = c20Var.offset;
                spannableString.setSpan(y5Var, i14, c20Var.length + i14, 33);
            }
            i12 = i13;
        }
        bVar.setText(j6.m(spannableString, bVar.getPaint().getFontMetricsInt(), false, null, 0));
        bVar.setTextColor(d20Var.f23487l);
        Editable text = bVar.getText();
        if (text != null) {
            for (g6 g6Var : (g6[]) text.getSpans(0, text.length(), g6.class)) {
                g6Var.f24095b = 0.85f;
            }
        }
        int i15 = d20Var.f23491p;
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
        int i16 = d20Var.f23491p;
        if (i16 != 1) {
            if (i16 == 2 ? !hd.f24444a0 : hd.f24444a0) {
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
        byte b10 = d20Var.f23479b;
        int i17 = -1;
        if (b10 == 0) {
            bVar.setFrameColor(d20Var.f23487l);
            if (g0.B(d20Var.f23487l) >= 0.721f) {
                i17 = -16777216;
            }
            bVar.setTextColor(i17);
        } else if (b10 == 1) {
            if (g0.B(d20Var.f23487l) >= 0.25f) {
                i11 = -1728053248;
            } else {
                i11 = -1711276033;
            }
            bVar.setFrameColor(i11);
            bVar.setTextColor(d20Var.f23487l);
        } else if (b10 == 2) {
            if (g0.B(d20Var.f23487l) >= 0.25f) {
                i17 = -16777216;
            }
            bVar.setFrameColor(i17);
            bVar.setTextColor(d20Var.f23487l);
        } else if (b10 == 3) {
            bVar.setFrameColor(0);
            bVar.setTextColor(d20Var.f23487l);
        }
        bVar.measure(View.MeasureSpec.makeMeasureSpec(d20Var.f23492q, 1073741824), View.MeasureSpec.makeMeasureSpec(d20Var.f23493r, 1073741824));
        bVar.layout(0, 0, d20Var.f23492q, d20Var.f23493r);
        d20Var.G = Bitmap.createBitmap(d20Var.f23492q, d20Var.f23493r, Bitmap.Config.ARGB_8888);
        bVar.draw(new Canvas(d20Var.G));
    }

    private boolean isCollage() {
        if (this.collageParts != null) {
            return true;
        }
        return false;
    }

    private void stepCollagePart(int i7, e20 e20Var, long j3) {
        boolean z10;
        float f10;
        Bitmap r10;
        long j10;
        long j11 = (j3 / 1000000) - e20Var.f23665f;
        float f11 = e20Var.f23668k;
        long j12 = e20Var.f23671o;
        long k10 = Utilities.k(j11, f11 * ((float) j12), e20Var.f23667j * ((float) j12));
        MediaCodecPlayer mediaCodecPlayer = e20Var.B;
        if (mediaCodecPlayer != null) {
            mediaCodecPlayer.ensure(k10);
            e20Var.f23676z.updateTexImage();
            return;
        }
        c6 c6Var = e20Var.f23675u;
        if (c6Var != null) {
            int i10 = c6Var.d[3];
            if (i10 <= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if ((k10 < i10 || (z10 && k10 > 1000)) && c6Var.f34075e0 != null) {
                c6Var.f34075e0.g(k10, true);
            }
            do {
                c6 c6Var2 = e20Var.f23675u;
                int i11 = c6Var2.d[3];
                f10 = (float) k10;
                if ((e20Var.v * 2.0f) + i11 >= f10) {
                    break;
                }
                j10 = i11;
                if (c6Var2.f34075e0 != null) {
                    c6Var2.f34075e0.c(null, false, c6Var2.f34079h0, c6Var2.f34080i0, false);
                }
            } while (e20Var.f23675u.d[3] != j10);
            if ((z10 || f10 > e20Var.f23675u.d[3] - (e20Var.v / 2.0f)) && (r10 = e20Var.f23675u.r(false)) != null) {
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
            if (s2.f26730a && this.firstFrame) {
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
            hz hzVar = this.filterShaders;
            if (hzVar != null) {
                hzVar.P0 = this.mSTMatrix;
                hzVar.W0 = false;
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
                hz hzVar2 = this.filterShaders;
                if (hzVar2 != null) {
                    i16 = hzVar2.g(i14 ^ 1);
                    hz hzVar3 = this.filterShaders;
                    int i26 = hzVar3.X0;
                    i18 = hzVar3.Y0;
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
                GLES20.glBindTexture(3553, this.blur.f35856s[2]);
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
                drawEntity(this.mediaEntities.get(i31), this.mediaEntities.get(i31).f23487l, j3);
            }
        }
        GLES20.glFinish();
    }

    public int getTextureId() {
        return this.mTextureID;
    }

    public void release() {
        ArrayList<d20> arrayList = this.mediaEntities;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                d20 d20Var = this.mediaEntities.get(i7);
                RLottieNative rLottieNative = d20Var.D;
                if (rLottieNative != null) {
                    rLottieNative.d();
                }
                c6 c6Var = d20Var.J;
                if (c6Var != null) {
                    c6Var.u();
                }
                View view = d20Var.I;
                if (view instanceof rt) {
                    rt rtVar = (rt) view;
                    y5.release(rtVar, rtVar.F);
                }
                Bitmap bitmap = d20Var.G;
                if (bitmap != null) {
                    bitmap.recycle();
                    d20Var.G = null;
                }
            }
        }
        ArrayList<e20> arrayList2 = this.collageParts;
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

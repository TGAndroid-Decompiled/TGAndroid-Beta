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
import hi.b0;
import hi.c0;
import java.io.File;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a20;
import org.telegram.messenger.a8;
import org.telegram.messenger.b20;
import org.telegram.messenger.c20;
import org.telegram.messenger.f3;
import org.telegram.messenger.g0;
import org.telegram.messenger.g6;
import org.telegram.messenger.gd;
import org.telegram.messenger.i10;
import org.telegram.messenger.j6;
import org.telegram.messenger.m10;
import org.telegram.messenger.s2;
import org.telegram.messenger.t0;
import org.telegram.messenger.we;
import org.telegram.ui.Components.RLottieNative;
import org.telegram.ui.Components.b6;
import org.telegram.ui.Components.ez;
import org.telegram.ui.Components.ga;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.o5;
import org.telegram.ui.Components.pt;
import org.telegram.ui.Components.x5;
import org.telegram.ui.Components.y5;
import sg.a0;
import tg.n0;
import tg.r0;
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
    private ga blur;
    private int blurBlurImageHandle;
    private int blurInputTexCoordHandle;
    private int blurMaskImageHandle;
    private String blurPath;
    private int blurPositionHandle;
    private int blurShaderProgram;
    private int[] blurTexture;
    private FloatBuffer blurVerticesBuffer;
    private ArrayList<c20> collageParts;
    private int[] collageTextures;
    private final we cropState;
    private FloatBuffer croppedTextureBuffer;
    private ArrayList<o5> emojiDrawables;
    private ez filterShaders;
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
    private ArrayList<b20> mediaEntities;
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

    public TextureRenderer(org.telegram.messenger.ff r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, java.util.ArrayList<org.telegram.messenger.b20> r34, org.telegram.messenger.we r35, int r36, int r37, int r38, int r39, int r40, float r41, boolean r42, java.lang.Integer r43, java.lang.Integer r44, hi.w7 r45, org.telegram.messenger.video.MediaCodecVideoConvertor.ConvertVideoParams r46) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.video.TextureRenderer.<init>(org.telegram.messenger.ff, java.lang.String, java.lang.String, java.lang.String, java.util.ArrayList, org.telegram.messenger.we, int, int, int, int, int, float, boolean, java.lang.Integer, java.lang.Integer, hi.w7, org.telegram.messenger.video.MediaCodecVideoConvertor$ConvertVideoParams):void");
    }

    private void applyRoundRadius(b20 b20Var, Bitmap bitmap, int i7) {
        if (bitmap != null && b20Var != null) {
            if (b20Var.f23141s != 0.0f || i7 != 0) {
                if (b20Var.M == null) {
                    b20Var.M = new Canvas(bitmap);
                }
                if (b20Var.f23141s != 0.0f) {
                    if (this.path == null) {
                        this.path = new Path();
                    }
                    if (this.xRefPaint == null) {
                        Paint paint = new Paint(1);
                        this.xRefPaint = paint;
                        paint.setColor(-16777216);
                        this.xRefPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                    }
                    float min = Math.min(bitmap.getWidth(), bitmap.getHeight()) * b20Var.f23141s;
                    this.path.rewind();
                    this.path.addRoundRect(new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight()), min, min, Path.Direction.CCW);
                    this.path.toggleInverseFillType();
                    b20Var.M.drawPath(this.path, this.xRefPaint);
                }
                if (i7 != 0) {
                    if (this.textColorPaint == null) {
                        Paint paint2 = new Paint(1);
                        this.textColorPaint = paint2;
                        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
                    }
                    this.textColorPaint.setColor(i7);
                    b20Var.M.drawRect(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight(), this.textColorPaint);
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
            int h10 = ez.h(35633, str);
            if (h10 == 0 || (h7 = ez.h(35632, str2)) == 0 || (glCreateProgram2 = GLES20.glCreateProgram()) == 0) {
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
        int h11 = ez.h(35633, str);
        if (h11 == 0 || (h = ez.h(35632, str2)) == 0 || (glCreateProgram = GLES20.glCreateProgram()) == 0) {
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

    private void destroyCollagePart(int i7, c20 c20Var) {
        if (c20Var != null) {
            b6 b6Var = c20Var.f23368u;
            if (b6Var != null) {
                b6Var.u();
                c20Var.f23368u = null;
            }
            MediaCodecPlayer mediaCodecPlayer = c20Var.B;
            if (mediaCodecPlayer != null) {
                mediaCodecPlayer.release();
                c20Var.B = null;
            }
            SurfaceTexture surfaceTexture = c20Var.f23369z;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                c20Var.f23369z = null;
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

    private void drawCollagePart(int i7, c20 c20Var, long j3) {
        if (c20Var.B != null && c20Var.f23355b) {
            GLES20.glUseProgram(this.simpleShaderProgramOES);
            GLES20.glActiveTexture(33987);
            GLES20.glBindTexture(36197, this.collageTextures[i7]);
            GLES20.glUniform1i(this.simpleSourceImageHandleOES, 3);
            GLES20.glEnableVertexAttribArray(this.simpleInputTexCoordHandleOES);
            GLES20.glVertexAttribPointer(this.simpleInputTexCoordHandleOES, 2, 5126, false, 8, (Buffer) c20Var.f23367t);
            GLES20.glEnableVertexAttribArray(this.simplePositionHandleOES);
            GLES20.glVertexAttribPointer(this.simplePositionHandleOES, 2, 5126, false, 8, (Buffer) c20Var.f23366s);
        } else {
            GLES20.glUseProgram(this.simpleShaderProgram);
            GLES20.glActiveTexture(33986);
            GLES20.glBindTexture(3553, this.collageTextures[i7]);
            GLES20.glUniform1i(this.simpleSourceImageHandle, 2);
            GLES20.glEnableVertexAttribArray(this.simpleInputTexCoordHandle);
            GLES20.glVertexAttribPointer(this.simpleInputTexCoordHandle, 2, 5126, false, 8, (Buffer) c20Var.f23367t);
            GLES20.glEnableVertexAttribArray(this.simplePositionHandle);
            GLES20.glVertexAttribPointer(this.simplePositionHandle, 2, 5126, false, 8, (Buffer) c20Var.f23366s);
        }
        GLES20.glDrawArrays(5, 0, 4);
    }

    private void drawEntity(b20 b20Var, int i7, long j3) {
        b20 b20Var2;
        boolean z10;
        float f10;
        Bitmap bitmap;
        Bitmap bitmap2;
        int i10;
        boolean z11;
        long j10;
        long j11;
        long k10;
        int i11;
        boolean z12;
        if (b20Var.f23124a == 11) {
            long j12 = j3 / 1000000;
            if (j12 >= b20Var.V && j12 < b20Var.W) {
                if (b20Var.G == null) {
                    try {
                        initTextEntity(b20Var);
                    } catch (Throwable th2) {
                        a8.g(th2, true);
                        return;
                    }
                }
                if (b20Var.X != null) {
                    View view = b20Var.I;
                    if ((view instanceof tg.f) && b20Var.J != null && b20Var.G != null) {
                        tg.f fVar = (tg.f) view;
                        if (fVar.A(j12)) {
                            b20Var.G.eraseColor(0);
                            fVar.draw(b20Var.J);
                        }
                    }
                }
            } else {
                Bitmap bitmap3 = b20Var.G;
                if (bitmap3 != null && j12 >= b20Var.W) {
                    bitmap3.recycle();
                    b20Var.G = null;
                    return;
                }
                return;
            }
        }
        RLottieNative rLottieNative = b20Var.D;
        if (rLottieNative != null) {
            Bitmap bitmap4 = b20Var.G;
            if (bitmap4 != null && b20Var.Y > 0 && b20Var.Z > 0) {
                rLottieNative.c((int) b20Var.E, bitmap4, true);
                Bitmap bitmap5 = b20Var.G;
                if ((b20Var.f23126b & 8) != 0) {
                    i11 = i7;
                } else {
                    i11 = 0;
                }
                applyRoundRadius(b20Var, bitmap5, i11);
                GLES20.glBindTexture(3553, this.stickerTexture[0]);
                GLUtils.texImage2D(3553, 0, b20Var.G, 0);
                float f11 = b20Var.E + b20Var.F;
                b20Var.E = f11;
                if (f11 >= b20Var.D.f33149a[0]) {
                    b20Var.E = 0.0f;
                }
                int i12 = this.stickerTexture[0];
                float f12 = b20Var.f23127c;
                float f13 = b20Var.d;
                float f14 = b20Var.f23129f;
                float f15 = b20Var.f23130g;
                float f16 = b20Var.f23128e;
                if ((b20Var.f23126b & 2) != 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                drawTexture(false, i12, f12, f13, f14, f15, f16, z12);
            }
        } else if (b20Var.K != null) {
            float f17 = b20Var.E;
            int i13 = (int) f17;
            float f18 = 1.0f;
            if (b20Var.f23124a == 5) {
                if (this.isPhoto) {
                    j11 = b20Var.U;
                    j10 = 0;
                } else {
                    j10 = b20Var.R;
                    j11 = (b20Var.T - b20Var.S) + j10;
                }
                long j13 = j3 / 1000000;
                if (j13 < j10) {
                    f18 = kr.h.getInterpolation(Utilities.i(1.0f - (((float) (j10 - j13)) / 400.0f), 1.0f, 0.0f));
                } else if (j13 > j11) {
                    f18 = kr.h.getInterpolation(Utilities.i(1.0f - (((float) (j13 - j11)) / 400.0f), 1.0f, 0.0f));
                }
                if (f18 > 0.0f) {
                    if (this.isPhoto) {
                        k10 = Utilities.k(j13, b20Var.U, 0L);
                    } else {
                        k10 = Utilities.k((j13 - b20Var.R) + b20Var.S, b20Var.U, 0L);
                    }
                    while (!b20Var.L) {
                        int[] iArr = b20Var.K.d;
                        f10 = 2.0f;
                        if (iArr[3] >= Math.min(k10, iArr[4])) {
                            break;
                        }
                        b6 b6Var = b20Var.K;
                        int i14 = b6Var.d[3];
                        b6Var.r(false);
                        int i15 = b20Var.K.d[3];
                        if (i15 <= i14 && (i15 != 0 || i14 != 0)) {
                            b20Var.L = true;
                            break;
                        }
                    }
                }
                f10 = 2.0f;
            } else {
                f10 = 2.0f;
                float f19 = f17 + b20Var.F;
                b20Var.E = f19;
                for (int i16 = (int) f19; i13 != i16; i16--) {
                    b20Var.K.r(true);
                }
            }
            y5 y5Var = b20Var.K.f33665w;
            if (y5Var != null) {
                bitmap = y5Var.f42358b;
            } else {
                bitmap = null;
            }
            if (bitmap != null) {
                if (b20Var.f23124a == 5) {
                    if (this.roundBitmap == null) {
                        int min = Math.min(bitmap.getWidth(), bitmap.getHeight());
                        this.roundBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
                        this.roundCanvas = new Canvas(this.roundBitmap);
                    }
                    Bitmap bitmap6 = this.roundBitmap;
                    if (bitmap6 != null) {
                        bitmap6.eraseColor(0);
                        this.roundCanvas.save();
                        if (this.roundClipPath == null) {
                            this.roundClipPath = new Path();
                        }
                        this.roundClipPath.rewind();
                        this.roundClipPath.addCircle(this.roundBitmap.getWidth() / f10, this.roundBitmap.getHeight() / f10, (this.roundBitmap.getWidth() / f10) * f18, Path.Direction.CW);
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
                    Bitmap bitmap7 = this.stickerBitmap;
                    if (bitmap7 != null) {
                        bitmap7.eraseColor(0);
                        this.stickerCanvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                        Bitmap bitmap8 = this.stickerBitmap;
                        if ((b20Var.f23126b & 8) != 0) {
                            i10 = i7;
                        } else {
                            i10 = 0;
                        }
                        applyRoundRadius(b20Var, bitmap8, i10);
                    }
                    bitmap2 = this.stickerBitmap;
                }
                if (bitmap2 != null) {
                    GLES20.glBindTexture(3553, this.stickerTexture[0]);
                    GLUtils.texImage2D(3553, 0, bitmap2, 0);
                    int i17 = this.stickerTexture[0];
                    float f20 = b20Var.f23127c;
                    float f21 = b20Var.d;
                    float f22 = b20Var.f23129f;
                    float f23 = b20Var.f23130g;
                    float f24 = b20Var.f23128e;
                    if ((b20Var.f23126b & 2) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    drawTexture(false, i17, f20, f21, f22, f23, f24, z11);
                }
            }
        } else {
            if (b20Var.G != null) {
                GLES20.glBindTexture(3553, this.stickerTexture[0]);
                GLUtils.texImage2D(3553, 0, b20Var.G, 0);
                int i18 = this.stickerTexture[0];
                float f25 = b20Var.f23127c;
                float f26 = b20Var.h;
                float f27 = f25 - (f26 / 2.0f);
                float f28 = b20Var.d;
                float f29 = b20Var.f23131i;
                float f30 = f28 - (f29 / 2.0f);
                float f31 = b20Var.f23129f + f26;
                float f32 = f29 + b20Var.f23130g;
                float f33 = b20Var.f23128e;
                if (b20Var.f23124a == 2 && (b20Var.f23126b & 2) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                drawTexture(false, i18, f27, f30, f31, f32, f33, z10);
            }
            ArrayList arrayList = b20Var.f23133k;
            if (arrayList != null && !arrayList.isEmpty()) {
                for (int i19 = 0; i19 < b20Var.f23133k.size(); i19++) {
                    a20 a20Var = (a20) b20Var.f23133k.get(i19);
                    if (a20Var != null && (b20Var2 = a20Var.f22924b) != null) {
                        drawEntity(b20Var2, b20Var.f23134l, j3);
                    }
                }
            }
        }
    }

    private void drawTexture(boolean z10, int i7) {
        drawTexture(z10, i7, -10000.0f, -10000.0f, -10000.0f, -10000.0f, 0.0f, false);
    }

    private FloatBuffer floats(float[] fArr) {
        FloatBuffer i7 = m10.i(ByteBuffer.allocateDirect(fArr.length * 4));
        i7.put(fArr).position(0);
        return i7;
    }

    private void initCollagePart(int i7, c20 c20Var) {
        float f10;
        c0 c0Var;
        AtomicInteger atomicInteger = new AtomicInteger(c20Var.f23362l);
        AtomicInteger atomicInteger2 = new AtomicInteger(c20Var.f23363m);
        AtomicInteger atomicInteger3 = new AtomicInteger(0);
        if (c20Var.f23355b) {
            GLES20.glBindTexture(36197, this.collageTextures[i7]);
            GLES20.glTexParameteri(36197, 10241, 9728);
            GLES20.glTexParameteri(36197, 10240, 9728);
            GLES20.glTexParameteri(36197, 10242, 33071);
            GLES20.glTexParameteri(36197, 10243, 33071);
            SurfaceTexture surfaceTexture = new SurfaceTexture(this.collageTextures[i7]);
            c20Var.f23369z = surfaceTexture;
            surfaceTexture.setDefaultBufferSize(c20Var.f23362l, c20Var.f23363m);
            try {
                c20Var.B = new MediaCodecPlayer(c20Var.d, new Surface(c20Var.f23369z));
            } catch (Exception e10) {
                a8.g(e10, true);
                c20Var.B = null;
            }
            MediaCodecPlayer mediaCodecPlayer = c20Var.B;
            if (mediaCodecPlayer != null) {
                atomicInteger.set(mediaCodecPlayer.getOrientedWidth());
                atomicInteger2.set(c20Var.B.getOrientedHeight());
                atomicInteger3.set(c20Var.B.getOrientation());
            } else {
                c20Var.f23369z.release();
                c20Var.f23369z = null;
                GLES20.glDeleteTextures(1, this.collageTextures, i7);
                GLES20.glGenTextures(1, this.collageTextures, i7);
                GLES20.glBindTexture(3553, this.collageTextures[i7]);
                GLES20.glTexParameteri(3553, 10241, 9729);
                GLES20.glTexParameteri(3553, 10240, 9729);
                GLES20.glTexParameteri(3553, 10242, 33071);
                GLES20.glTexParameteri(3553, 10243, 33071);
                b6 b6Var = new b6(new File(c20Var.d), true, 0L, 0, null, null, null, 0L, i10.f24637t0, true, 512, 512, null, 0, true);
                c20Var.f23368u = b6Var;
                if (b6Var.f33669y && b6Var.f33646f0) {
                    throw new RuntimeException("Failed to decode with ffmpeg software codecs");
                }
                c20Var.v = 1000.0f / b6Var.d[5];
                Bitmap r10 = b6Var.r(false);
                if (r10 != null) {
                    GLUtils.texImage2D(3553, 0, r10, 0);
                }
                atomicInteger.set(c20Var.f23368u.getIntrinsicWidth());
                atomicInteger2.set(c20Var.f23368u.getIntrinsicHeight());
                atomicInteger3.set(c20Var.f23368u.d[2]);
            }
        } else {
            GLES20.glBindTexture(3553, this.collageTextures[i7]);
            GLES20.glTexParameteri(3553, 10241, 9729);
            GLES20.glTexParameteri(3553, 10240, 9729);
            GLES20.glTexParameteri(3553, 10242, 33071);
            GLES20.glTexParameteri(3553, 10243, 33071);
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inMutable = true;
            Bitmap decodeFile = BitmapFactory.decodeFile(c20Var.d, options);
            Pair N0 = g0.N0(c20Var.d);
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
        float a10 = c20Var.f23365r.a(2.0f) - 1.0f;
        b0 b0Var = c20Var.f23365r;
        b0 b0Var2 = c20Var.f23365r;
        b0 b0Var3 = c20Var.f23365r;
        b0 b0Var4 = c20Var.f23365r;
        int i10 = b0Var4.f14210a.f14249c;
        int i11 = b0Var4.f14212c;
        float[] fArr = {a10, -(((2.0f / b0Var.f14210a.f14249c) * b0Var.f14212c) - 1.0f), b0Var.b(2.0f) - 1.0f, -(((2.0f / b0Var2.f14210a.f14249c) * b0Var2.f14212c) - 1.0f), b0Var2.a(2.0f) - 1.0f, -(((2.0f / b0Var3.f14210a.f14249c) * (b0Var3.f14212c + 1)) - 1.0f), b0Var3.b(2.0f) - 1.0f, -(((2.0f / i10) * (i11 + 1)) - 1.0f)};
        float f12 = this.transformedWidth / c0Var.d[i11];
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
        c20Var.f23366s = floats(fArr);
        c20Var.f23367t = floats(fArr2);
    }

    private void initLinkEntity(b20 b20Var) {
        n0 n0Var = new n0(t0.f27013b, b20Var.Q);
        n0Var.V = true;
        n0Var.b(i10.f24637t0, b20Var.f23125a0, false);
        if (n0Var.e()) {
            n0Var.setPreviewType(b20Var.f23126b);
        } else {
            n0Var.c(b20Var.f23126b, b20Var.f23134l);
        }
        int i7 = b20Var.f23139q;
        int i10 = n0Var.f58123f;
        n0Var.setMaxWidth(i7 + i10 + i10);
        n0Var.measure(View.MeasureSpec.makeMeasureSpec(b20Var.f23139q, 1073741824), View.MeasureSpec.makeMeasureSpec(b20Var.f23140r, 1073741824));
        n0Var.layout(0, 0, b20Var.f23139q, b20Var.f23140r);
        float f10 = b20Var.f23129f * this.transformedWidth;
        int i11 = b20Var.f23139q;
        float f11 = f10 / i11;
        b20Var.G = Bitmap.createBitmap(((int) (i11 * f11)) + 16, ((int) (b20Var.f23140r * f11)) + 16, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(b20Var.G);
        float f12 = 8;
        canvas.translate(f12, f12);
        canvas.scale(f11, f11);
        n0Var.draw(canvas);
        float f13 = 16 * f11;
        b20Var.h = f13 / this.transformedWidth;
        b20Var.f23131i = f13 / this.transformedHeight;
    }

    private void initLocationEntity(b20 b20Var) {
        float f10;
        float f11;
        byte b10 = b20Var.f23124a;
        r0 r0Var = new r0(t0.f27013b, b20Var.Q);
        r0Var.setIsVideo(true);
        r0Var.setText(b20Var.f23132j);
        r0Var.e(b20Var.f23126b, b20Var.f23134l);
        if (b20Var.P != null && b20Var.f23133k.isEmpty()) {
            r0Var.d(i10.f24637t0, b20Var.P.f14804c);
        }
        r0Var.setMaxWidth(b20Var.f23139q);
        if (b20Var.f23133k.size() == 1) {
            r0Var.f58198y = true;
            r0Var.f58190c = true;
            r0Var.requestLayout();
        }
        r0Var.measure(View.MeasureSpec.makeMeasureSpec(b20Var.f23139q, 1073741824), View.MeasureSpec.makeMeasureSpec(b20Var.f23140r, 1073741824));
        r0Var.layout(0, 0, b20Var.f23139q, b20Var.f23140r);
        float f12 = b20Var.f23129f * this.transformedWidth;
        float f13 = b20Var.f23139q;
        float f14 = f12 / f13;
        b20Var.G = Bitmap.createBitmap(((int) (f13 * f14)) + 16, ((int) (b20Var.f23140r * f14)) + 16, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(b20Var.G);
        float f15 = 8;
        canvas.translate(f15, f15);
        canvas.scale(f14, f14);
        r0Var.draw(canvas);
        float f16 = 16 * f14;
        b20Var.h = f16 / this.transformedWidth;
        b20Var.f23131i = f16 / this.transformedHeight;
        if (b20Var.f23133k.size() == 1) {
            a20 a20Var = (a20) b20Var.f23133k.get(0);
            b20 b20Var2 = new b20();
            a20Var.f22924b = b20Var2;
            b20Var2.f23132j = a20Var.f22923a;
            b20Var2.f23126b = a20Var.f22925c;
            RectF rectF = new RectF();
            float f17 = r0Var.J;
            float f18 = r0Var.d.left + 2.25f;
            float f19 = r0Var.E;
            float f20 = r0Var.K;
            float f21 = r0Var.O;
            float f22 = f19 * 21.33f;
            rectF.set((f18 * f19) + f17, e2.A(f21, f22, 2.0f, f20), m10.b(f18, 21.33f, f19, f17), f3.a(f22, f21, 2.0f, f20));
            float centerX = ((rectF.centerX() / b20Var.f23139q) * b20Var.f23129f) + b20Var.f23127c;
            float f23 = b20Var.d;
            float centerY = rectF.centerY() / b20Var.f23140r;
            float f24 = b20Var.f23130g;
            float f25 = (centerY * f24) + f23;
            if (b20Var.f23128e != 0.0f) {
                float f26 = (b20Var.f23129f / 2.0f) + b20Var.f23127c;
                float f27 = (f24 / 2.0f) + b20Var.d;
                float f28 = this.transformedWidth / this.transformedHeight;
                double d = centerX - f26;
                double d2 = (f25 - f27) / f28;
                f11 = 2.0f;
                float cos = ((float) ((Math.cos(-f10) * d) - (Math.sin(-b20Var.f23128e) * d2))) + f26;
                f25 = (((float) i5.c.c(-b20Var.f23128e, d2, Math.sin(-b20Var.f23128e) * d)) * f28) + f27;
                centerX = cos;
            } else {
                f11 = 2.0f;
            }
            a20Var.f22924b.f23129f = (rectF.width() / b20Var.f23139q) * b20Var.f23129f;
            a20Var.f22924b.f23130g = (rectF.height() / b20Var.f23140r) * b20Var.f23130g;
            b20 b20Var3 = a20Var.f22924b;
            float f29 = b20Var3.f23129f * 1.2f;
            b20Var3.f23129f = f29;
            float f30 = b20Var3.f23130g * 1.2f;
            b20Var3.f23130g = f30;
            b20Var3.f23127c = centerX - (f29 / f11);
            b20Var3.d = f25 - (f30 / f11);
            b20Var3.f23128e = b20Var.f23128e;
            initStickerEntity(b20Var3);
        }
    }

    public void initStickerEntity(b20 b20Var) {
        Bitmap bitmap;
        we weVar;
        we weVar2;
        int i7;
        int i10 = (int) (b20Var.f23129f * this.transformedWidth);
        b20Var.Y = i10;
        int i11 = (int) (b20Var.f23130g * this.transformedHeight);
        b20Var.Z = i11;
        if (i10 > 512) {
            b20Var.Z = (int) ((i11 / i10) * 512.0f);
            b20Var.Y = 512;
        }
        int i12 = b20Var.Z;
        if (i12 > 512) {
            b20Var.Y = (int) ((b20Var.Y / i12) * 512.0f);
            b20Var.Z = 512;
        }
        byte b10 = b20Var.f23126b;
        float f10 = 0.0f;
        if ((b10 & 1) != 0) {
            int i13 = b20Var.Y;
            if (i13 > 0 && (i7 = b20Var.Z) > 0) {
                b20Var.G = Bitmap.createBitmap(i13, i7, Bitmap.Config.ARGB_8888);
                RLottieNative a10 = RLottieNative.a(b20Var.f23132j, null, null, null, 0, null);
                b20Var.D = a10;
                if (a10 != null) {
                    f10 = a10.f33149a[1] / this.videoFps;
                }
                b20Var.F = f10;
            }
        } else if ((b10 & 4) != 0) {
            b20Var.L = false;
            b6 b6Var = new b6(new File(b20Var.f23132j), true, 0L, 0, null, null, null, 0L, i10.f24637t0, true, 512, 512, null, 0, true);
            b20Var.K = b6Var;
            b20Var.F = b6Var.d[5] / this.videoFps;
            b20Var.E = 1.0f;
            b6Var.r(true);
        } else {
            String str = b20Var.f23132j;
            if (!TextUtils.isEmpty(b20Var.f23142t) && (b20Var.f23126b & 16) != 0) {
                str = b20Var.f23142t;
            }
            BitmapFactory.Options options = new BitmapFactory.Options();
            if (b20Var.f23124a == 2) {
                options.inMutable = true;
            }
            Bitmap decodeFile = BitmapFactory.decodeFile(str, options);
            b20Var.G = decodeFile;
            if (decodeFile != null && (weVar = b20Var.f23143u) != null) {
                Bitmap createBitmap = Bitmap.createBitmap((int) Math.max(1.0f, weVar.f27771e * decodeFile.getWidth()), (int) Math.max(1.0f, b20Var.f23143u.f27772f * b20Var.G.getHeight()), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
                canvas.rotate(-b20Var.f23143u.f27783z);
                int width = b20Var.G.getWidth();
                int height = b20Var.G.getHeight();
                we weVar3 = b20Var.f23143u;
                if (((weVar3.f27783z + weVar3.f27775k) / 90) % 2 == 1) {
                    width = b20Var.G.getHeight();
                    height = b20Var.G.getWidth();
                }
                we weVar4 = b20Var.f23143u;
                float f11 = weVar4.f27771e;
                float f12 = weVar4.f27772f;
                float f13 = width;
                float f14 = height;
                canvas.clipRect(((-width) * f11) / 2.0f, ((-height) * f12) / 2.0f, (f11 * f13) / 2.0f, (f12 * f14) / 2.0f);
                float f15 = b20Var.f23143u.f27770c;
                canvas.scale(f15, f15);
                we weVar5 = b20Var.f23143u;
                canvas.translate(weVar5.f27768a * f13, weVar5.f27769b * f14);
                canvas.rotate(b20Var.f23143u.d + weVar2.f27775k);
                if (b20Var.f23143u.f27776l) {
                    canvas.scale(-1.0f, 1.0f);
                }
                canvas.rotate(b20Var.f23143u.f27783z);
                canvas.translate((-b20Var.G.getWidth()) / 2.0f, (-b20Var.G.getHeight()) / 2.0f);
                canvas.drawBitmap(b20Var.G, 0.0f, 0.0f, (Paint) null);
                b20Var.G.recycle();
                b20Var.G = createBitmap;
            }
            if (b20Var.f23124a == 2 && b20Var.G != null) {
                b20Var.f23141s = g0.L(12.0f) / Math.min(b20Var.f23139q, b20Var.f23140r);
                Pair N0 = g0.N0(b20Var.f23132j);
                b20Var.f23128e = (float) (b20Var.f23128e - Math.toRadians(((Integer) N0.first).intValue()));
                if ((((Integer) N0.first).intValue() / 90) % 2 == 1) {
                    float f16 = b20Var.f23127c;
                    float f17 = b20Var.f23129f;
                    float f18 = (f17 / 2.0f) + f16;
                    float f19 = b20Var.d;
                    float f20 = b20Var.f23130g;
                    float f21 = (f20 / 2.0f) + f19;
                    float f22 = this.transformedWidth;
                    float f23 = this.transformedHeight;
                    float f24 = (f17 * f22) / f23;
                    float f25 = (f20 * f23) / f22;
                    b20Var.f23129f = f25;
                    b20Var.f23130g = f24;
                    b20Var.f23127c = f18 - (f25 / 2.0f);
                    b20Var.d = f21 - (f24 / 2.0f);
                }
                applyRoundRadius(b20Var, b20Var.G, 0);
                return;
            }
            if (b20Var.G != null) {
                float width2 = bitmap.getWidth() / b20Var.G.getHeight();
                if (width2 > 1.0f) {
                    float f26 = b20Var.f23130g;
                    float f27 = f26 / width2;
                    b20Var.d = e2.A(f26, f27, 2.0f, b20Var.d);
                    b20Var.f23130g = f27;
                } else if (width2 < 1.0f) {
                    float f28 = b20Var.f23129f;
                    float f29 = width2 * f28;
                    b20Var.f23127c = e2.A(f28, f29, 2.0f, b20Var.f23127c);
                    b20Var.f23129f = f29;
                }
            }
        }
    }

    private void initTextEntity(final b20 b20Var) {
        int i7;
        int i10;
        int i11;
        Typeface d;
        final tg.f fVar = new tg.f(t0.f27013b);
        fVar.getPaint().setAntiAlias(true);
        fVar.H = false;
        fVar.setBackgroundColor(0);
        fVar.setPadding(g0.L(7.0f), g0.L(7.0f), g0.L(7.0f), g0.L(7.0f));
        a0 a0Var = b20Var.f23136n;
        if (a0Var != null && (d = a0Var.d()) != null) {
            fVar.setTypeface(d);
        }
        fVar.setTextSize(0, b20Var.f23135m);
        SpannableString spannableString = new SpannableString(b20Var.f23132j);
        ArrayList arrayList = b20Var.f23133k;
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            int i13 = i12 + 1;
            final a20 a20Var = (a20) arrayList.get(i12);
            if (a20Var.f22923a != null) {
                b20 b20Var2 = new b20();
                a20Var.f22924b = b20Var2;
                b20Var2.f23132j = a20Var.f22923a;
                b20Var2.f23126b = a20Var.f22925c;
                x5 x5Var = new x5(0L, 1.0f, fVar.getPaint().getFontMetricsInt()) {
                    @Override
                    public void draw(Canvas canvas, CharSequence charSequence, int i14, int i15, float f10, int i16, int i17, int i18, Paint paint) {
                        super.draw(canvas, charSequence, i14, i15, f10, i16, i17, i18, paint);
                        b20 b20Var3 = b20Var;
                        float paddingLeft = ((((this.measuredSize / 2.0f) + (fVar.getPaddingLeft() + f10)) / b20Var3.f23139q) * b20Var3.f23129f) + b20Var.f23127c;
                        float f11 = b20Var3.d;
                        b20 b20Var4 = b20Var;
                        float f12 = b20Var4.f23130g;
                        float paddingTop = (((((i18 - i16) / 2.0f) + (fVar.getPaddingTop() + i16)) / b20Var4.f23140r) * f12) + f11;
                        if (b20Var4.f23128e != 0.0f) {
                            float f13 = (b20Var4.f23129f / 2.0f) + b20Var4.f23127c;
                            float f14 = (f12 / 2.0f) + b20Var4.d;
                            float f15 = TextureRenderer.this.transformedWidth / TextureRenderer.this.transformedHeight;
                            double d2 = paddingLeft - f13;
                            double d10 = (paddingTop - f14) / f15;
                            paddingLeft = ((float) ((Math.cos(-b20Var.f23128e) * d2) - (Math.sin(-b20Var.f23128e) * d10))) + f13;
                            paddingTop = (((float) i5.c.c(-b20Var.f23128e, d10, Math.sin(-b20Var.f23128e) * d2)) * f15) + f14;
                        }
                        b20 b20Var5 = a20Var.f22924b;
                        int i19 = this.measuredSize;
                        b20 b20Var6 = b20Var;
                        float f16 = (i19 / b20Var6.f23139q) * b20Var6.f23129f;
                        b20Var5.f23129f = f16;
                        float f17 = (i19 / b20Var6.f23140r) * b20Var6.f23130g;
                        b20Var5.f23130g = f17;
                        b20Var5.f23127c = paddingLeft - (f16 / 2.0f);
                        b20Var5.d = paddingTop - (f17 / 2.0f);
                        b20Var5.f23128e = b20Var6.f23128e;
                        if (b20Var5.G == null) {
                            TextureRenderer.this.initStickerEntity(b20Var5);
                        }
                    }
                };
                int i14 = a20Var.offset;
                spannableString.setSpan(x5Var, i14, a20Var.length + i14, 33);
            }
            i12 = i13;
        }
        fVar.setText(j6.m(spannableString, fVar.getPaint().getFontMetricsInt(), false, null, 0));
        fVar.setTextColor(b20Var.f23134l);
        Editable text = fVar.getText();
        if (text != null) {
            for (g6 g6Var : (g6[]) text.getSpans(0, text.length(), g6.class)) {
                g6Var.f24275b = 0.85f;
            }
        }
        int i15 = b20Var.f23138p;
        if (i15 != 1) {
            if (i15 != 2) {
                i7 = 19;
            } else {
                i7 = 21;
            }
        } else {
            i7 = 17;
        }
        fVar.setGravity(i7);
        int i16 = b20Var.f23138p;
        if (i16 != 1) {
            if (i16 == 2 ? !gd.f24314a0 : gd.f24314a0) {
                i10 = 3;
            } else {
                i10 = 2;
            }
        } else {
            i10 = 4;
        }
        fVar.setTextAlignment(i10);
        fVar.setHorizontallyScrolling(false);
        fVar.setImeOptions(268435456);
        fVar.setFocusableInTouchMode(true);
        fVar.setInputType(fVar.getInputType() | 16384);
        setBreakStrategy(fVar);
        byte b10 = b20Var.f23126b;
        int i17 = -1;
        if (b10 == 0) {
            fVar.setFrameColor(b20Var.f23134l);
            if (g0.B(b20Var.f23134l) >= 0.721f) {
                i17 = -16777216;
            }
            fVar.setTextColor(i17);
        } else if (b10 == 1) {
            if (g0.B(b20Var.f23134l) >= 0.25f) {
                i11 = -1728053248;
            } else {
                i11 = -1711276033;
            }
            fVar.setFrameColor(i11);
            fVar.setTextColor(b20Var.f23134l);
        } else if (b10 == 2) {
            if (g0.B(b20Var.f23134l) >= 0.25f) {
                i17 = -16777216;
            }
            fVar.setFrameColor(i17);
            fVar.setTextColor(b20Var.f23134l);
        } else if (b10 == 3) {
            fVar.setFrameColor(0);
            fVar.setTextColor(b20Var.f23134l);
        }
        if (b20Var.f23124a == 11) {
            fVar.setMaxLines(3);
            tg.d.v(fVar, b20Var.f23126b);
        }
        fVar.measure(View.MeasureSpec.makeMeasureSpec(b20Var.f23139q, 1073741824), View.MeasureSpec.makeMeasureSpec(b20Var.f23140r, 1073741824));
        fVar.layout(0, 0, b20Var.f23139q, b20Var.f23140r);
        b20Var.G = Bitmap.createBitmap(b20Var.f23139q, b20Var.f23140r, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(b20Var.G);
        if (b20Var.f23124a == 11 && b20Var.X != null) {
            fVar.setTallFrame(true);
            fVar.setSpokenWords(b20Var.X);
            fVar.A(b20Var.V);
            b20Var.I = fVar;
            b20Var.J = canvas;
        }
        fVar.draw(canvas);
    }

    private boolean isCollage() {
        if (this.collageParts != null) {
            return true;
        }
        return false;
    }

    private void stepCollagePart(int i7, c20 c20Var, long j3) {
        boolean z10;
        float f10;
        Bitmap r10;
        long j10;
        long j11 = (j3 / 1000000) - c20Var.f23358f;
        float f11 = c20Var.f23361k;
        long j12 = c20Var.f23364o;
        long k10 = Utilities.k(j11, f11 * ((float) j12), c20Var.f23360j * ((float) j12));
        MediaCodecPlayer mediaCodecPlayer = c20Var.B;
        if (mediaCodecPlayer != null) {
            mediaCodecPlayer.ensure(k10);
            c20Var.f23369z.updateTexImage();
            return;
        }
        b6 b6Var = c20Var.f23368u;
        if (b6Var != null) {
            int i10 = b6Var.d[3];
            if (i10 <= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if ((k10 < i10 || (z10 && k10 > 1000)) && b6Var.f33644e0 != null) {
                b6Var.f33644e0.g(k10, true);
            }
            do {
                b6 b6Var2 = c20Var.f23368u;
                int i11 = b6Var2.d[3];
                f10 = (float) k10;
                if ((c20Var.v * 2.0f) + i11 >= f10) {
                    break;
                }
                j10 = i11;
                if (b6Var2.f33644e0 != null) {
                    b6Var2.f33644e0.c(null, false, b6Var2.f33648h0, b6Var2.f33649i0, false);
                }
            } while (c20Var.f23368u.d[3] != j10);
            if ((z10 || f10 > c20Var.f23368u.d[3] - (c20Var.v / 2.0f)) && (r10 = c20Var.f23368u.r(false)) != null) {
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
            if (s2.f26829a && this.firstFrame) {
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
            ez ezVar = this.filterShaders;
            if (ezVar != null) {
                ezVar.P0 = this.mSTMatrix;
                ezVar.W0 = false;
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
                ez ezVar2 = this.filterShaders;
                if (ezVar2 != null) {
                    i16 = ezVar2.g(i14 ^ 1);
                    ez ezVar3 = this.filterShaders;
                    int i26 = ezVar3.X0;
                    i18 = ezVar3.Y0;
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
                GLES20.glBindTexture(3553, this.blur.f35391s[2]);
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
                drawEntity(this.mediaEntities.get(i31), this.mediaEntities.get(i31).f23134l, j3);
            }
        }
        GLES20.glFinish();
    }

    public int getTextureId() {
        return this.mTextureID;
    }

    public void release() {
        ArrayList<b20> arrayList = this.mediaEntities;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                b20 b20Var = this.mediaEntities.get(i7);
                RLottieNative rLottieNative = b20Var.D;
                if (rLottieNative != null) {
                    rLottieNative.d();
                }
                b6 b6Var = b20Var.K;
                if (b6Var != null) {
                    b6Var.u();
                }
                View view = b20Var.I;
                if (view instanceof pt) {
                    pt ptVar = (pt) view;
                    x5.release(ptVar, ptVar.F);
                }
                Bitmap bitmap = b20Var.G;
                if (bitmap != null) {
                    bitmap.recycle();
                    b20Var.G = null;
                }
            }
        }
        ArrayList<c20> arrayList2 = this.collageParts;
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

    public void setBreakStrategy(tg.f fVar) {
        fVar.setBreakStrategy(0);
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

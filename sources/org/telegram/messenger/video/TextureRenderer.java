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
import java.io.File;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.RLottieNative;
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
    private xm0 blur;
    private int blurBlurImageHandle;
    private int blurInputTexCoordHandle;
    private int blurMaskImageHandle;
    private String blurPath;
    private int blurPositionHandle;
    private int blurShaderProgram;
    private int[] blurTexture;
    private FloatBuffer blurVerticesBuffer;
    private ArrayList<qcc> collageParts;
    private int[] collageTextures;
    private final ao6 cropState;
    private FloatBuffer croppedTextureBuffer;
    private ArrayList<vm> emojiDrawables;
    private xf4 filterShaders;
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
    private ArrayList<pcc> mediaEntities;
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

    public TextureRenderer(defpackage.lo6 r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, java.util.ArrayList<defpackage.pcc> r35, defpackage.ao6 r36, int r37, int r38, int r39, int r40, int r41, float r42, boolean r43, java.lang.Integer r44, java.lang.Integer r45, defpackage.f6b r46, org.telegram.messenger.video.MediaCodecVideoConvertor.ConvertVideoParams r47) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.video.TextureRenderer.<init>(lo6, java.lang.String, java.lang.String, java.lang.String, java.util.ArrayList, ao6, int, int, int, int, int, float, boolean, java.lang.Integer, java.lang.Integer, f6b, org.telegram.messenger.video.MediaCodecVideoConvertor$ConvertVideoParams):void");
    }

    private void applyRoundRadius(pcc pccVar, Bitmap bitmap, int i) {
        if (bitmap != null && pccVar != null) {
            if (pccVar.s != 0.0f || i != 0) {
                if (pccVar.M == null) {
                    pccVar.M = new Canvas(bitmap);
                }
                if (pccVar.s != 0.0f) {
                    if (this.path == null) {
                        this.path = new Path();
                    }
                    if (this.xRefPaint == null) {
                        Paint paint = new Paint(1);
                        this.xRefPaint = paint;
                        paint.setColor(-16777216);
                        this.xRefPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                    }
                    float min = Math.min(bitmap.getWidth(), bitmap.getHeight()) * pccVar.s;
                    this.path.rewind();
                    this.path.addRoundRect(new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight()), min, min, Path.Direction.CCW);
                    this.path.toggleInverseFillType();
                    pccVar.M.drawPath(this.path, this.xRefPaint);
                }
                if (i != 0) {
                    if (this.textColorPaint == null) {
                        Paint paint2 = new Paint(1);
                        this.textColorPaint = paint2;
                        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
                    }
                    this.textColorPaint.setColor(i);
                    pccVar.M.drawRect(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight(), this.textColorPaint);
                }
            }
        }
    }

    private int createProgram(String str, String str2, boolean z) {
        int h;
        int glCreateProgram;
        int h2;
        int glCreateProgram2;
        if (z) {
            int h3 = xf4.h(35633, str);
            if (h3 == 0 || (h2 = xf4.h(35632, str2)) == 0 || (glCreateProgram2 = GLES20.glCreateProgram()) == 0) {
                return 0;
            }
            GLES20.glAttachShader(glCreateProgram2, h3);
            GLES20.glAttachShader(glCreateProgram2, h2);
            GLES20.glLinkProgram(glCreateProgram2);
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(glCreateProgram2, 35714, iArr, 0);
            if (iArr[0] != 1) {
                GLES20.glDeleteProgram(glCreateProgram2);
                return 0;
            }
            return glCreateProgram2;
        }
        int h4 = xf4.h(35633, str);
        if (h4 == 0 || (h = xf4.h(35632, str2)) == 0 || (glCreateProgram = GLES20.glCreateProgram()) == 0) {
            return 0;
        }
        GLES20.glAttachShader(glCreateProgram, h4);
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

    private void destroyCollagePart(int i, qcc qccVar) {
        if (qccVar != null) {
            kn knVar = qccVar.u;
            if (knVar != null) {
                knVar.u();
                qccVar.u = null;
            }
            MediaCodecPlayer mediaCodecPlayer = qccVar.B;
            if (mediaCodecPlayer != null) {
                mediaCodecPlayer.release();
                qccVar.B = null;
            }
            SurfaceTexture surfaceTexture = qccVar.z;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                qccVar.z = null;
            }
        }
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

    private void drawCollagePart(int i, qcc qccVar, long j) {
        if (qccVar.B != null && qccVar.b) {
            GLES20.glUseProgram(this.simpleShaderProgramOES);
            GLES20.glActiveTexture(33987);
            GLES20.glBindTexture(36197, this.collageTextures[i]);
            GLES20.glUniform1i(this.simpleSourceImageHandleOES, 3);
            GLES20.glEnableVertexAttribArray(this.simpleInputTexCoordHandleOES);
            GLES20.glVertexAttribPointer(this.simpleInputTexCoordHandleOES, 2, 5126, false, 8, (Buffer) qccVar.t);
            GLES20.glEnableVertexAttribArray(this.simplePositionHandleOES);
            GLES20.glVertexAttribPointer(this.simplePositionHandleOES, 2, 5126, false, 8, (Buffer) qccVar.s);
        } else {
            GLES20.glUseProgram(this.simpleShaderProgram);
            GLES20.glActiveTexture(33986);
            GLES20.glBindTexture(3553, this.collageTextures[i]);
            GLES20.glUniform1i(this.simpleSourceImageHandle, 2);
            GLES20.glEnableVertexAttribArray(this.simpleInputTexCoordHandle);
            GLES20.glVertexAttribPointer(this.simpleInputTexCoordHandle, 2, 5126, false, 8, (Buffer) qccVar.t);
            GLES20.glEnableVertexAttribArray(this.simplePositionHandle);
            GLES20.glVertexAttribPointer(this.simplePositionHandle, 2, 5126, false, 8, (Buffer) qccVar.s);
        }
        GLES20.glDrawArrays(5, 0, 4);
    }

    private void drawEntity(pcc pccVar, int i, long j) {
        pcc pccVar2;
        boolean z;
        float f;
        Bitmap bitmap;
        Bitmap bitmap2;
        int i2;
        boolean z2;
        long j2;
        long j3;
        long k;
        int i3;
        boolean z3;
        if (pccVar.a == 11) {
            long j4 = j / 1000000;
            if (j4 >= pccVar.V && j4 < pccVar.W) {
                if (pccVar.G == null) {
                    try {
                        initTextEntity(pccVar);
                    } catch (Throwable th) {
                        fc4.g(th, true);
                        return;
                    }
                }
                if (pccVar.X != null) {
                    View view = pccVar.I;
                    if ((view instanceof dv3) && pccVar.J != null && pccVar.G != null) {
                        dv3 dv3Var = (dv3) view;
                        if (dv3Var.A(j4)) {
                            pccVar.G.eraseColor(0);
                            dv3Var.draw(pccVar.J);
                        }
                    }
                }
            } else {
                Bitmap bitmap3 = pccVar.G;
                if (bitmap3 != null && j4 >= pccVar.W) {
                    bitmap3.recycle();
                    pccVar.G = null;
                    return;
                }
                return;
            }
        }
        RLottieNative rLottieNative = pccVar.D;
        if (rLottieNative != null) {
            Bitmap bitmap4 = pccVar.G;
            if (bitmap4 != null && pccVar.Y > 0 && pccVar.Z > 0) {
                rLottieNative.c((int) pccVar.E, bitmap4, true);
                Bitmap bitmap5 = pccVar.G;
                if ((pccVar.b & 8) != 0) {
                    i3 = i;
                } else {
                    i3 = 0;
                }
                applyRoundRadius(pccVar, bitmap5, i3);
                GLES20.glBindTexture(3553, this.stickerTexture[0]);
                GLUtils.texImage2D(3553, 0, pccVar.G, 0);
                float f2 = pccVar.E + pccVar.F;
                pccVar.E = f2;
                if (f2 >= pccVar.D.a[0]) {
                    pccVar.E = 0.0f;
                }
                int i4 = this.stickerTexture[0];
                float f3 = pccVar.c;
                float f4 = pccVar.d;
                float f5 = pccVar.f;
                float f6 = pccVar.g;
                float f7 = pccVar.e;
                if ((pccVar.b & 2) != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                drawTexture(false, i4, f3, f4, f5, f6, f7, z3);
            }
        } else if (pccVar.K != null) {
            float f8 = pccVar.E;
            int i5 = (int) f8;
            float f9 = 1.0f;
            if (pccVar.a == 5) {
                if (this.isPhoto) {
                    j3 = pccVar.U;
                    j2 = 0;
                } else {
                    j2 = pccVar.R;
                    j3 = (pccVar.T - pccVar.S) + j2;
                }
                long j5 = j / 1000000;
                if (j5 < j2) {
                    f9 = d53.h.getInterpolation(Utilities.i(1.0f - (((float) (j2 - j5)) / 400.0f), 1.0f, 0.0f));
                } else if (j5 > j3) {
                    f9 = d53.h.getInterpolation(Utilities.i(1.0f - (((float) (j5 - j3)) / 400.0f), 1.0f, 0.0f));
                }
                if (f9 > 0.0f) {
                    if (this.isPhoto) {
                        k = Utilities.k(j5, pccVar.U, 0L);
                    } else {
                        k = Utilities.k((j5 - pccVar.R) + pccVar.S, pccVar.U, 0L);
                    }
                    while (!pccVar.L) {
                        int[] iArr = pccVar.K.d;
                        f = 2.0f;
                        if (iArr[3] >= Math.min(k, iArr[4])) {
                            break;
                        }
                        kn knVar = pccVar.K;
                        int i6 = knVar.d[3];
                        knVar.r(false);
                        int i7 = pccVar.K.d[3];
                        if (i7 <= i6 && (i7 != 0 || i6 != 0)) {
                            pccVar.L = true;
                            break;
                        }
                    }
                }
                f = 2.0f;
            } else {
                f = 2.0f;
                float f10 = f8 + pccVar.F;
                pccVar.E = f10;
                for (int i8 = (int) f10; i5 != i8; i8--) {
                    pccVar.K.r(true);
                }
            }
            hn hnVar = pccVar.K.w;
            if (hnVar != null) {
                bitmap = hnVar.b;
            } else {
                bitmap = null;
            }
            if (bitmap != null) {
                if (pccVar.a == 5) {
                    if (this.roundBitmap == null) {
                        int min = Math.min(bitmap.getWidth(), bitmap.getHeight());
                        this.roundBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
                        this.roundCanvas = new Canvas(this.roundBitmap);
                    }
                    Bitmap bitmap6 = this.roundBitmap;
                    if (bitmap6 != null) {
                        bitmap6.eraseColor(0);
                        this.roundCanvas.save();
                        Path path = this.roundClipPath;
                        if (path == null) {
                            path = new Path();
                            this.roundClipPath = path;
                        }
                        path.rewind();
                        this.roundClipPath.addCircle(this.roundBitmap.getWidth() / f, this.roundBitmap.getHeight() / f, (this.roundBitmap.getWidth() / f) * f9, Path.Direction.CW);
                        this.roundCanvas.clipPath(this.roundClipPath);
                        int width = bitmap.getWidth();
                        int height = bitmap.getHeight();
                        Rect rect = this.roundSrc;
                        if (width >= height) {
                            rect.set((bitmap.getWidth() - bitmap.getHeight()) / 2, 0, bitmap.getWidth() - ((bitmap.getWidth() - bitmap.getHeight()) / 2), bitmap.getHeight());
                        } else {
                            rect.set(0, (bitmap.getHeight() - bitmap.getWidth()) / 2, bitmap.getWidth(), bitmap.getHeight() - ((bitmap.getHeight() - bitmap.getWidth()) / 2));
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
                        if ((pccVar.b & 8) != 0) {
                            i2 = i;
                        } else {
                            i2 = 0;
                        }
                        applyRoundRadius(pccVar, bitmap8, i2);
                    }
                    bitmap2 = this.stickerBitmap;
                }
                if (bitmap2 != null) {
                    GLES20.glBindTexture(3553, this.stickerTexture[0]);
                    GLUtils.texImage2D(3553, 0, bitmap2, 0);
                    int i9 = this.stickerTexture[0];
                    float f11 = pccVar.c;
                    float f12 = pccVar.d;
                    float f13 = pccVar.f;
                    float f14 = pccVar.g;
                    float f15 = pccVar.e;
                    if ((pccVar.b & 2) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    drawTexture(false, i9, f11, f12, f13, f14, f15, z2);
                }
            }
        } else {
            if (pccVar.G != null) {
                GLES20.glBindTexture(3553, this.stickerTexture[0]);
                GLUtils.texImage2D(3553, 0, pccVar.G, 0);
                int i10 = this.stickerTexture[0];
                float f16 = pccVar.c;
                float f17 = pccVar.h;
                float f18 = f16 - (f17 / 2.0f);
                float f19 = pccVar.d;
                float f20 = pccVar.i;
                float f21 = f19 - (f20 / 2.0f);
                float f22 = pccVar.f + f17;
                float f23 = f20 + pccVar.g;
                float f24 = pccVar.e;
                if (pccVar.a == 2 && (pccVar.b & 2) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                drawTexture(false, i10, f18, f21, f22, f23, f24, z);
            }
            ArrayList arrayList = pccVar.k;
            if (arrayList != null && !arrayList.isEmpty()) {
                for (int i11 = 0; i11 < pccVar.k.size(); i11++) {
                    occ occVar = (occ) pccVar.k.get(i11);
                    if (occVar != null && (pccVar2 = occVar.b) != null) {
                        drawEntity(pccVar2, pccVar.l, j);
                    }
                }
            }
        }
    }

    private void drawTexture(boolean z, int i, float f, float f2, float f3, float f4, float f5, boolean z2, boolean z3, int i2) {
        FloatBuffer floatBuffer;
        FloatBuffer floatBuffer2;
        if (!this.blendEnabled) {
            GLES20.glEnable(3042);
            GLES20.glBlendFunc(1, 771);
            this.blendEnabled = true;
        }
        int i3 = (f > (-10000.0f) ? 1 : (f == (-10000.0f) ? 0 : -1));
        float[] fArr = this.bitmapData;
        if (i3 <= 0) {
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
            fArr[0] = f6;
            fArr[1] = f7;
            float f8 = (f3 * 2.0f) + f6;
            fArr[2] = f8;
            fArr[3] = f7;
            fArr[4] = f6;
            float f9 = f7 - (f4 * 2.0f);
            fArr[5] = f9;
            fArr[6] = f8;
            fArr[7] = f9;
        }
        float f10 = fArr[0];
        float f11 = fArr[2];
        float f12 = (f10 + f11) / 2.0f;
        if (z2) {
            fArr[2] = f10;
            fArr[0] = f11;
            float f13 = fArr[6];
            fArr[6] = fArr[4];
            fArr[4] = f13;
        }
        if (f5 != 0.0f) {
            float f14 = this.transformedWidth / this.transformedHeight;
            float f15 = (fArr[5] + fArr[1]) / 2.0f;
            int i4 = 0;
            for (int i5 = 4; i4 < i5; i5 = 4) {
                float[] fArr2 = this.bitmapData;
                int i6 = i4 << 1;
                int i7 = i6 + 1;
                double d = fArr2[i6] - f12;
                double d2 = f5;
                double d3 = (fArr2[i7] - f15) / f14;
                fArr2[i6] = ((float) ((Math.cos(d2) * d) - (Math.sin(d2) * d3))) + f12;
                this.bitmapData[i7] = (((float) wi8.d(d2, d3, d * Math.sin(d2))) * f14) + f15;
                i4++;
            }
        }
        this.bitmapVerticesBuffer.put(this.bitmapData).position(0);
        int i8 = this.simplePositionHandle;
        if (z3) {
            floatBuffer = this.verticesBuffer;
        } else {
            floatBuffer = this.bitmapVerticesBuffer;
        }
        GLES20.glVertexAttribPointer(i8, 2, 5126, false, 8, (Buffer) floatBuffer);
        GLES20.glEnableVertexAttribArray(this.simpleInputTexCoordHandle);
        int i9 = this.simpleInputTexCoordHandle;
        if (z3) {
            floatBuffer2 = this.croppedTextureBuffer;
        } else {
            floatBuffer2 = this.textureBuffer;
        }
        GLES20.glVertexAttribPointer(i9, 2, 5126, false, 8, (Buffer) floatBuffer2);
        if (z) {
            GLES20.glBindTexture(3553, i);
        }
        GLES20.glDrawArrays(5, 0, 4);
    }

    private FloatBuffer floats(float[] fArr) {
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(fArr.length << 2).order(ByteOrder.nativeOrder()).asFloatBuffer();
        asFloatBuffer.put(fArr).position(0);
        return asFloatBuffer;
    }

    private void initCollagePart(int i, qcc qccVar) {
        float f;
        sl2 sl2Var;
        MediaCodecPlayer mediaCodecPlayer;
        AtomicInteger atomicInteger = new AtomicInteger(qccVar.l);
        AtomicInteger atomicInteger2 = new AtomicInteger(qccVar.m);
        AtomicInteger atomicInteger3 = new AtomicInteger(0);
        boolean z = qccVar.b;
        int[] iArr = this.collageTextures;
        if (z) {
            GLES20.glBindTexture(36197, iArr[i]);
            GLES20.glTexParameteri(36197, 10241, 9728);
            GLES20.glTexParameteri(36197, 10240, 9728);
            GLES20.glTexParameteri(36197, 10242, 33071);
            GLES20.glTexParameteri(36197, 10243, 33071);
            SurfaceTexture surfaceTexture = new SurfaceTexture(this.collageTextures[i]);
            qccVar.z = surfaceTexture;
            surfaceTexture.setDefaultBufferSize(qccVar.l, qccVar.m);
            try {
                mediaCodecPlayer = new MediaCodecPlayer(qccVar.d, new Surface(qccVar.z));
                qccVar.B = mediaCodecPlayer;
            } catch (Exception e) {
                fc4.g(e, true);
                qccVar.B = null;
                mediaCodecPlayer = null;
            }
            if (mediaCodecPlayer != null) {
                atomicInteger.set(mediaCodecPlayer.getOrientedWidth());
                atomicInteger2.set(qccVar.B.getOrientedHeight());
                atomicInteger3.set(qccVar.B.getOrientation());
            } else {
                qccVar.z.release();
                qccVar.z = null;
                GLES20.glDeleteTextures(1, this.collageTextures, i);
                GLES20.glGenTextures(1, this.collageTextures, i);
                GLES20.glBindTexture(3553, this.collageTextures[i]);
                GLES20.glTexParameteri(3553, 10241, 9729);
                GLES20.glTexParameteri(3553, 10240, 9729);
                GLES20.glTexParameteri(3553, 10242, 33071);
                GLES20.glTexParameteri(3553, 10243, 33071);
                kn knVar = new kn(new File(qccVar.d), true, 0L, 0, null, null, null, 0L, z8c.t0, true, 512, 512, null, 0, true);
                qccVar.u = knVar;
                if (knVar.y && knVar.f0) {
                    zo4.k("Failed to decode with ffmpeg software codecs");
                    return;
                }
                qccVar.v = 1000.0f / knVar.d[5];
                Bitmap r = knVar.r(false);
                if (r != null) {
                    GLUtils.texImage2D(3553, 0, r, 0);
                }
                atomicInteger.set(qccVar.u.getIntrinsicWidth());
                atomicInteger2.set(qccVar.u.getIntrinsicHeight());
                atomicInteger3.set(qccVar.u.d[2]);
            }
        } else {
            GLES20.glBindTexture(3553, iArr[i]);
            GLES20.glTexParameteri(3553, 10241, 9729);
            GLES20.glTexParameteri(3553, 10240, 9729);
            GLES20.glTexParameteri(3553, 10242, 33071);
            GLES20.glTexParameteri(3553, 10243, 33071);
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inMutable = true;
            Bitmap decodeFile = BitmapFactory.decodeFile(qccVar.d, options);
            Pair N0 = gm.N0(qccVar.d);
            if (((Integer) N0.first).intValue() != 0 || ((Integer) N0.second).intValue() != 0) {
                Matrix matrix = new Matrix();
                if (((Integer) N0.second).intValue() != 0) {
                    float f2 = -1.0f;
                    if (((Integer) N0.second).intValue() == 1) {
                        f = -1.0f;
                    } else {
                        f = 1.0f;
                    }
                    if (((Integer) N0.second).intValue() != 2) {
                        f2 = 1.0f;
                    }
                    matrix.postScale(f, f2);
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
        float a = qccVar.r.a(2.0f) - 1.0f;
        rl2 rl2Var = qccVar.r;
        rl2 rl2Var2 = qccVar.r;
        rl2 rl2Var3 = qccVar.r;
        rl2 rl2Var4 = qccVar.r;
        int i2 = rl2Var4.a.c;
        int i3 = rl2Var4.c;
        float[] fArr = {a, -(((2.0f / rl2Var.a.c) * rl2Var.c) - 1.0f), rl2Var.b(2.0f) - 1.0f, -(((2.0f / rl2Var2.a.c) * rl2Var2.c) - 1.0f), rl2Var2.a(2.0f) - 1.0f, -(((2.0f / rl2Var3.a.c) * (rl2Var3.c + 1)) - 1.0f), rl2Var3.b(2.0f) - 1.0f, -(((2.0f / i2) * (i3 + 1)) - 1.0f)};
        float f3 = this.transformedWidth / sl2Var.d[i3];
        float f4 = this.transformedHeight / i2;
        int i4 = atomicInteger.get();
        int i5 = atomicInteger2.get();
        int i6 = atomicInteger3.get();
        float f5 = i4;
        float f6 = i5;
        float max = 1.0f / Math.max(f3 / f5, f4 / f6);
        float f7 = ((f3 * max) / f5) / 2.0f;
        float f8 = ((f4 * max) / f6) / 2.0f;
        if ((i6 / 90) % 2 == 1) {
            f8 = f7;
            f7 = f8;
        }
        float f9 = 0.5f - f7;
        float f10 = 0.5f - f8;
        float f11 = f7 + 0.5f;
        float f12 = f8 + 0.5f;
        float[] fArr2 = {f9, f10, f11, f10, f9, f12, f11, f12};
        while (i6 > 0) {
            float f13 = fArr2[0];
            float f14 = fArr2[1];
            fArr2[0] = fArr2[4];
            fArr2[1] = fArr2[5];
            fArr2[4] = fArr2[6];
            fArr2[5] = fArr2[7];
            fArr2[6] = fArr2[2];
            fArr2[7] = fArr2[3];
            fArr2[2] = f13;
            fArr2[3] = f14;
            i6 -= 90;
        }
        while (i6 < 0) {
            float f15 = fArr2[0];
            float f16 = fArr2[1];
            fArr2[0] = fArr2[2];
            fArr2[1] = fArr2[3];
            fArr2[2] = fArr2[6];
            fArr2[3] = fArr2[7];
            fArr2[6] = fArr2[4];
            fArr2[7] = fArr2[5];
            fArr2[4] = f15;
            fArr2[5] = f16;
            i6 += 90;
        }
        qccVar.s = floats(fArr);
        qccVar.t = floats(fArr2);
    }

    private void initLinkEntity(pcc pccVar) {
        d66 d66Var = new d66(org.telegram.messenger.a.b, pccVar.Q);
        d66Var.V = true;
        d66Var.b(z8c.t0, pccVar.a0, false);
        boolean e = d66Var.e();
        byte b = pccVar.b;
        if (e) {
            d66Var.setPreviewType(b);
        } else {
            d66Var.c(b, pccVar.l);
        }
        int i = pccVar.q;
        int i2 = d66Var.f;
        d66Var.setMaxWidth(i + i2 + i2);
        d66Var.measure(View.MeasureSpec.makeMeasureSpec(pccVar.q, 1073741824), View.MeasureSpec.makeMeasureSpec(pccVar.r, 1073741824));
        d66Var.layout(0, 0, pccVar.q, pccVar.r);
        float f = pccVar.f * this.transformedWidth;
        int i3 = pccVar.q;
        float f2 = f / i3;
        pccVar.G = Bitmap.createBitmap(((int) (i3 * f2)) + 16, ((int) (pccVar.r * f2)) + 16, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(pccVar.G);
        canvas.translate(8.0f, 8.0f);
        canvas.scale(f2, f2);
        d66Var.draw(canvas);
        float f3 = 16.0f * f2;
        pccVar.h = f3 / this.transformedWidth;
        pccVar.i = f3 / this.transformedHeight;
    }

    private void initLocationEntity(pcc pccVar) {
        float f;
        float f2;
        byte b = pccVar.a;
        gd6 gd6Var = new gd6(org.telegram.messenger.a.b, pccVar.Q);
        gd6Var.setIsVideo(true);
        gd6Var.setText(pccVar.j);
        gd6Var.e(pccVar.b, pccVar.l);
        if (pccVar.P != null && pccVar.k.isEmpty()) {
            gd6Var.d(z8c.t0, pccVar.P.c);
        }
        gd6Var.setMaxWidth(pccVar.q);
        if (pccVar.k.size() == 1) {
            gd6Var.y = true;
            gd6Var.c = true;
            gd6Var.requestLayout();
        }
        gd6Var.measure(View.MeasureSpec.makeMeasureSpec(pccVar.q, 1073741824), View.MeasureSpec.makeMeasureSpec(pccVar.r, 1073741824));
        gd6Var.layout(0, 0, pccVar.q, pccVar.r);
        float f3 = pccVar.f * this.transformedWidth;
        float f4 = pccVar.q;
        float f5 = f3 / f4;
        pccVar.G = Bitmap.createBitmap(((int) (f4 * f5)) + 16, ((int) (pccVar.r * f5)) + 16, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(pccVar.G);
        canvas.translate(8.0f, 8.0f);
        canvas.scale(f5, f5);
        gd6Var.draw(canvas);
        float f6 = 16.0f * f5;
        pccVar.h = f6 / this.transformedWidth;
        pccVar.i = f6 / this.transformedHeight;
        if (pccVar.k.size() == 1) {
            occ occVar = (occ) pccVar.k.get(0);
            pcc pccVar2 = new pcc();
            occVar.b = pccVar2;
            pccVar2.j = occVar.a;
            pccVar2.b = occVar.c;
            RectF rectF = new RectF();
            float f7 = gd6Var.J;
            float f8 = gd6Var.d.left + 2.25f;
            float f9 = gd6Var.E;
            float f10 = gd6Var.K;
            float f11 = gd6Var.O;
            float f12 = f9 * 21.33f;
            rectF.set((f8 * f9) + f7, aq1.z(f11, f12, 2.0f, f10), hg9.u(f8, 21.33f, f9, f7), td4.e(f12, f11, 2.0f, f10));
            float centerX = ((rectF.centerX() / pccVar.q) * pccVar.f) + pccVar.c;
            float f13 = pccVar.d;
            float centerY = rectF.centerY() / pccVar.r;
            float f14 = pccVar.g;
            float f15 = (centerY * f14) + f13;
            if (pccVar.e != 0.0f) {
                float f16 = (pccVar.f / 2.0f) + pccVar.c;
                float f17 = (f14 / 2.0f) + pccVar.d;
                float f18 = this.transformedWidth / this.transformedHeight;
                double d = centerX - f16;
                double d2 = (f15 - f17) / f18;
                f2 = 2.0f;
                float cos = ((float) ((Math.cos(-f) * d) - (Math.sin(-pccVar.e) * d2))) + f16;
                f15 = (((float) wi8.d(-pccVar.e, d2, Math.sin(-pccVar.e) * d)) * f18) + f17;
                centerX = cos;
            } else {
                f2 = 2.0f;
            }
            occVar.b.f = (rectF.width() / pccVar.q) * pccVar.f;
            occVar.b.g = (rectF.height() / pccVar.r) * pccVar.g;
            pcc pccVar3 = occVar.b;
            float f19 = pccVar3.f * 1.2f;
            pccVar3.f = f19;
            float f20 = pccVar3.g * 1.2f;
            pccVar3.g = f20;
            pccVar3.c = centerX - (f19 / f2);
            pccVar3.d = f15 - (f20 / f2);
            pccVar3.e = pccVar.e;
            initStickerEntity(pccVar3);
        }
    }

    public void initStickerEntity(pcc pccVar) {
        ao6 ao6Var;
        ao6 ao6Var2;
        int i = (int) (pccVar.f * this.transformedWidth);
        pccVar.Y = i;
        int i2 = (int) (pccVar.g * this.transformedHeight);
        pccVar.Z = i2;
        int i3 = 512;
        if (i > 512) {
            i2 = (int) ((i2 / i) * 512.0f);
            pccVar.Z = i2;
            pccVar.Y = 512;
            i = 512;
        }
        if (i2 > 512) {
            i = (int) ((i / i2) * 512.0f);
            pccVar.Y = i;
            pccVar.Z = 512;
        } else {
            i3 = i2;
        }
        byte b = pccVar.b;
        float f = 0.0f;
        if ((b & 1) != 0) {
            if (i > 0 && i3 > 0) {
                pccVar.G = Bitmap.createBitmap(i, i3, Bitmap.Config.ARGB_8888);
                RLottieNative a = RLottieNative.a(pccVar.j, null, null, null, 0, null);
                pccVar.D = a;
                if (a != null) {
                    f = a.a[1] / this.videoFps;
                }
                pccVar.F = f;
            }
        } else if ((b & 4) != 0) {
            pccVar.L = false;
            kn knVar = new kn(new File(pccVar.j), true, 0L, 0, null, null, null, 0L, z8c.t0, true, 512, 512, null, 0, true);
            pccVar.K = knVar;
            pccVar.F = knVar.d[5] / this.videoFps;
            pccVar.E = 1.0f;
            knVar.r(true);
        } else {
            String str = pccVar.j;
            if (!TextUtils.isEmpty(pccVar.t) && (pccVar.b & 16) != 0) {
                str = pccVar.t;
            }
            BitmapFactory.Options options = new BitmapFactory.Options();
            if (pccVar.a == 2) {
                options.inMutable = true;
            }
            Bitmap decodeFile = BitmapFactory.decodeFile(str, options);
            pccVar.G = decodeFile;
            if (decodeFile != null && (ao6Var = pccVar.u) != null) {
                decodeFile = Bitmap.createBitmap((int) Math.max(1.0f, ao6Var.e * decodeFile.getWidth()), (int) Math.max(1.0f, pccVar.u.f * pccVar.G.getHeight()), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(decodeFile);
                canvas.translate(decodeFile.getWidth() / 2.0f, decodeFile.getHeight() / 2.0f);
                canvas.rotate(-pccVar.u.z);
                int width = pccVar.G.getWidth();
                int height = pccVar.G.getHeight();
                ao6 ao6Var3 = pccVar.u;
                if (((ao6Var3.z + ao6Var3.k) / 90) % 2 == 1) {
                    width = pccVar.G.getHeight();
                    height = pccVar.G.getWidth();
                }
                ao6 ao6Var4 = pccVar.u;
                float f2 = ao6Var4.e;
                float f3 = ao6Var4.f;
                float f4 = width;
                float f5 = height;
                canvas.clipRect(((-width) * f2) / 2.0f, ((-height) * f3) / 2.0f, (f2 * f4) / 2.0f, (f3 * f5) / 2.0f);
                float f6 = pccVar.u.c;
                canvas.scale(f6, f6);
                ao6 ao6Var5 = pccVar.u;
                canvas.translate(ao6Var5.a * f4, ao6Var5.b * f5);
                canvas.rotate(pccVar.u.d + ao6Var2.k);
                if (pccVar.u.l) {
                    canvas.scale(-1.0f, 1.0f);
                }
                canvas.rotate(pccVar.u.z);
                canvas.translate((-pccVar.G.getWidth()) / 2.0f, (-pccVar.G.getHeight()) / 2.0f);
                canvas.drawBitmap(pccVar.G, 0.0f, 0.0f, (Paint) null);
                pccVar.G.recycle();
                pccVar.G = decodeFile;
            }
            if (pccVar.a == 2 && decodeFile != null) {
                pccVar.s = gm.L(12.0f) / Math.min(pccVar.q, pccVar.r);
                Pair N0 = gm.N0(pccVar.j);
                pccVar.e = (float) (pccVar.e - Math.toRadians(((Integer) N0.first).intValue()));
                if ((((Integer) N0.first).intValue() / 90) % 2 == 1) {
                    float f7 = pccVar.c;
                    float f8 = pccVar.f;
                    float f9 = (f8 / 2.0f) + f7;
                    float f10 = pccVar.d;
                    float f11 = pccVar.g;
                    float f12 = (f11 / 2.0f) + f10;
                    float f13 = this.transformedWidth;
                    float f14 = this.transformedHeight;
                    float f15 = (f8 * f13) / f14;
                    float f16 = (f11 * f14) / f13;
                    pccVar.f = f16;
                    pccVar.g = f15;
                    pccVar.c = f9 - (f16 / 2.0f);
                    pccVar.d = f12 - (f15 / 2.0f);
                }
                applyRoundRadius(pccVar, pccVar.G, 0);
            } else if (decodeFile != null) {
                float width2 = decodeFile.getWidth() / pccVar.G.getHeight();
                if (width2 > 1.0f) {
                    float f17 = pccVar.g;
                    float f18 = f17 / width2;
                    pccVar.d = aq1.z(f17, f18, 2.0f, pccVar.d);
                    pccVar.g = f18;
                } else if (width2 < 1.0f) {
                    float f19 = pccVar.f;
                    float f20 = width2 * f19;
                    pccVar.c = aq1.z(f19, f20, 2.0f, pccVar.c);
                    pccVar.f = f20;
                }
            }
        }
    }

    private void initTextEntity(final pcc pccVar) {
        int i;
        int i2;
        int i3;
        Typeface b;
        final dv3 dv3Var = new dv3(org.telegram.messenger.a.b);
        dv3Var.getPaint().setAntiAlias(true);
        dv3Var.H = false;
        dv3Var.setBackgroundColor(0);
        dv3Var.setPadding(gm.L(7.0f), gm.L(7.0f), gm.L(7.0f), gm.L(7.0f));
        ru7 ru7Var = pccVar.n;
        if (ru7Var != null && (b = ru7Var.b()) != null) {
            dv3Var.setTypeface(b);
        }
        dv3Var.setTextSize(0, pccVar.m);
        SpannableString spannableString = new SpannableString(pccVar.j);
        ArrayList arrayList = pccVar.k;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            int i5 = i4 + 1;
            final occ occVar = (occ) arrayList.get(i4);
            if (occVar.a != null) {
                pcc pccVar2 = new pcc();
                occVar.b = pccVar2;
                pccVar2.j = occVar.a;
                pccVar2.b = occVar.c;
                gn gnVar = new gn(0L, 1.0f, dv3Var.getPaint().getFontMetricsInt()) {
                    @Override
                    public void draw(Canvas canvas, CharSequence charSequence, int i6, int i7, float f, int i8, int i9, int i10, Paint paint) {
                        super.draw(canvas, charSequence, i6, i7, f, i8, i9, i10, paint);
                        pcc pccVar3 = pccVar;
                        float paddingLeft = ((((this.measuredSize / 2.0f) + (dv3Var.getPaddingLeft() + f)) / pccVar3.q) * pccVar3.f) + pccVar.c;
                        float f2 = pccVar3.d;
                        pcc pccVar4 = pccVar;
                        float f3 = pccVar4.g;
                        float paddingTop = (((((i10 - i8) / 2.0f) + (dv3Var.getPaddingTop() + i8)) / pccVar4.r) * f3) + f2;
                        if (pccVar4.e != 0.0f) {
                            float f4 = (pccVar4.f / 2.0f) + pccVar4.c;
                            float f5 = (f3 / 2.0f) + pccVar4.d;
                            float f6 = TextureRenderer.this.transformedWidth / TextureRenderer.this.transformedHeight;
                            double d = paddingLeft - f4;
                            double d2 = (paddingTop - f5) / f6;
                            paddingLeft = ((float) ((Math.cos(-pccVar.e) * d) - (Math.sin(-pccVar.e) * d2))) + f4;
                            paddingTop = (((float) wi8.d(-pccVar.e, d2, Math.sin(-pccVar.e) * d)) * f6) + f5;
                        }
                        pcc pccVar5 = occVar.b;
                        int i11 = this.measuredSize;
                        pcc pccVar6 = pccVar;
                        float f7 = (i11 / pccVar6.q) * pccVar6.f;
                        pccVar5.f = f7;
                        float f8 = (i11 / pccVar6.r) * pccVar6.g;
                        pccVar5.g = f8;
                        pccVar5.c = paddingLeft - (f7 / 2.0f);
                        pccVar5.d = paddingTop - (f8 / 2.0f);
                        pccVar5.e = pccVar6.e;
                        if (pccVar5.G == null) {
                            TextureRenderer.this.initStickerEntity(pccVar5);
                        }
                    }
                };
                int i6 = occVar.offset;
                spannableString.setSpan(gnVar, i6, occVar.length + i6, 33);
            }
            i4 = i5;
        }
        dv3Var.setText(gw3.m(spannableString, dv3Var.getPaint().getFontMetricsInt(), false, null, 0));
        dv3Var.setTextColor(pccVar.l);
        Editable text = dv3Var.getText();
        if (text != null) {
            for (dw3 dw3Var : (dw3[]) text.getSpans(0, text.length(), dw3.class)) {
                dw3Var.b = 0.85f;
            }
        }
        int i7 = pccVar.p;
        if (i7 != 1) {
            if (i7 != 2) {
                i = 19;
            } else {
                i = 21;
            }
        } else {
            i = 17;
        }
        dv3Var.setGravity(i);
        int i8 = pccVar.p;
        if (i8 != 1) {
            boolean z = jb6.a0;
            if (i8 == 2 ? z : !z) {
                i2 = 2;
            } else {
                i2 = 3;
            }
        } else {
            i2 = 4;
        }
        dv3Var.setTextAlignment(i2);
        dv3Var.setHorizontallyScrolling(false);
        dv3Var.setImeOptions(268435456);
        dv3Var.setFocusableInTouchMode(true);
        dv3Var.setInputType(dv3Var.getInputType() | 16384);
        setBreakStrategy(dv3Var);
        byte b2 = pccVar.b;
        int i9 = -1;
        if (b2 == 0) {
            dv3Var.setFrameColor(pccVar.l);
            if (gm.B(pccVar.l) >= 0.721f) {
                i9 = -16777216;
            }
            dv3Var.setTextColor(i9);
        } else if (b2 == 1) {
            if (gm.B(pccVar.l) >= 0.25f) {
                i3 = -1728053248;
            } else {
                i3 = -1711276033;
            }
            dv3Var.setFrameColor(i3);
            dv3Var.setTextColor(pccVar.l);
        } else if (b2 == 2) {
            if (gm.B(pccVar.l) >= 0.25f) {
                i9 = -16777216;
            }
            dv3Var.setFrameColor(i9);
            dv3Var.setTextColor(pccVar.l);
        } else if (b2 == 3) {
            dv3Var.setFrameColor(0);
            dv3Var.setTextColor(pccVar.l);
        }
        if (pccVar.a == 11) {
            dv3Var.setMaxLines(3);
            kd1.v(dv3Var, pccVar.b);
        }
        dv3Var.measure(View.MeasureSpec.makeMeasureSpec(pccVar.q, 1073741824), View.MeasureSpec.makeMeasureSpec(pccVar.r, 1073741824));
        dv3Var.layout(0, 0, pccVar.q, pccVar.r);
        pccVar.G = Bitmap.createBitmap(pccVar.q, pccVar.r, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(pccVar.G);
        if (pccVar.a == 11 && pccVar.X != null) {
            dv3Var.setTallFrame(true);
            dv3Var.setSpokenWords(pccVar.X);
            dv3Var.A(pccVar.V);
            pccVar.I = dv3Var;
            pccVar.J = canvas;
        }
        dv3Var.draw(canvas);
    }

    private boolean isCollage() {
        if (this.collageParts != null) {
            return true;
        }
        return false;
    }

    private void stepCollagePart(int i, qcc qccVar, long j) {
        boolean z;
        kn knVar;
        float f;
        Bitmap r;
        long j2;
        long j3 = (j / 1000000) - qccVar.f;
        float f2 = qccVar.k;
        long j4 = qccVar.o;
        long k = Utilities.k(j3, f2 * ((float) j4), qccVar.j * ((float) j4));
        MediaCodecPlayer mediaCodecPlayer = qccVar.B;
        if (mediaCodecPlayer != null) {
            mediaCodecPlayer.ensure(k);
            qccVar.z.updateTexImage();
            return;
        }
        kn knVar2 = qccVar.u;
        if (knVar2 != null) {
            int i2 = knVar2.d[3];
            if (i2 <= 0) {
                z = true;
            } else {
                z = false;
            }
            if ((k < i2 || (z && k > 1000)) && knVar2.e0 != null) {
                knVar2.e0.g(k, true);
            }
            do {
                knVar = qccVar.u;
                int i3 = knVar.d[3];
                f = (float) k;
                if ((qccVar.v * 2.0f) + i3 >= f) {
                    break;
                }
                j2 = i3;
                if (knVar.e0 != null) {
                    knVar.e0.c(null, false, knVar.h0, knVar.i0, false);
                }
                knVar = qccVar.u;
            } while (knVar.d[3] != j2);
            if ((z || f > knVar.d[3] - (qccVar.v / 2.0f)) && (r = knVar.r(false)) != null) {
                GLES20.glBindTexture(3553, this.collageTextures[i]);
                GLUtils.texImage2D(3553, 0, r, 0);
            }
        }
    }

    public void changeFragmentShader(String str, String str2, boolean z) {
        String str3;
        int createProgram;
        int createProgram2;
        if (this.messageVideoMaskPath != null) {
            if (z) {
                str3 = "#version 320 es\nuniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nin vec4 aPosition;\nin vec4 aTextureCoord;\nin vec4 mTextureCoord;\nout vec2 vTextureCoord;\nout vec2 MTextureCoord;\nvoid main() {\n  gl_Position = uMVPMatrix * aPosition;\n  vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n  MTextureCoord = (uSTMatrix * mTextureCoord).xy;\n}\n";
            } else {
                str3 = "uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nattribute vec4 mTextureCoord;\nvarying vec2 vTextureCoord;\nvarying vec2 MTextureCoord;\nvoid main() {\n  gl_Position = uMVPMatrix * aPosition;\n  vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n  MTextureCoord = (uSTMatrix * mTextureCoord).xy;\n}\n";
            }
        } else if (z) {
            str3 = "#version 320 es\nuniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nin vec4 aPosition;\nin vec4 aTextureCoord;\nout vec2 vTextureCoord;\nvoid main() {\n  gl_Position = uMVPMatrix * aPosition;\n  vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n";
        } else {
            str3 = "uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n  gl_Position = uMVPMatrix * aPosition;\n  vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n";
        }
        int i = this.NUM_EXTERNAL_SHADER;
        if (i >= 0 && i < this.mProgram.length && (createProgram2 = createProgram(str3, str, z)) != 0) {
            GLES20.glDeleteProgram(this.mProgram[this.NUM_EXTERNAL_SHADER]);
            this.mProgram[this.NUM_EXTERNAL_SHADER] = createProgram2;
            this.texSizeHandle = GLES20.glGetUniformLocation(createProgram2, "texSize");
        }
        int i2 = this.NUM_FILTER_SHADER;
        if (i2 >= 0 && i2 < this.mProgram.length && (createProgram = createProgram(str3, str2, z)) != 0) {
            GLES20.glDeleteProgram(this.mProgram[this.NUM_FILTER_SHADER]);
            this.mProgram[this.NUM_FILTER_SHADER] = createProgram;
        }
    }

    public void drawFrame(SurfaceTexture surfaceTexture, long j) {
        int i;
        int i2;
        int i3;
        float[] fArr;
        int i4;
        int i5;
        int i6;
        int i7;
        FloatBuffer floatBuffer;
        boolean z;
        int i8;
        int i9;
        int i10;
        int[] iArr;
        if (this.isPhoto) {
            drawBackground();
            i3 = 3042;
            i6 = 0;
            i = 33985;
            i7 = 33984;
        } else {
            surfaceTexture.getTransformMatrix(this.mSTMatrix);
            if (e21.a && this.firstFrame) {
                StringBuilder sb = new StringBuilder();
                int i11 = 0;
                while (true) {
                    float[] fArr2 = this.mSTMatrix;
                    i = 33985;
                    if (i11 >= fArr2.length) {
                        break;
                    }
                    sb.append(fArr2[i11]);
                    sb.append(", ");
                    i11++;
                }
                fc4.b("stMatrix = " + ((Object) sb));
                this.firstFrame = false;
            } else {
                i = 33985;
            }
            if (this.blendEnabled) {
                GLES20.glDisable(3042);
                this.blendEnabled = false;
            }
            xf4 xf4Var = this.filterShaders;
            if (xf4Var != null) {
                xf4Var.P0 = this.mSTMatrix;
                xf4Var.W0 = false;
                GLES20.glViewport(0, 0, this.originalWidth, this.originalHeight);
                this.filterShaders.f();
                this.filterShaders.d();
                this.filterShaders.e();
                this.filterShaders.c();
                boolean b = this.filterShaders.b();
                GLES20.glBindFramebuffer(36160, 0);
                int i12 = this.transformedWidth;
                if (i12 != this.originalWidth || this.transformedHeight != this.originalHeight) {
                    GLES20.glViewport(0, 0, i12, this.transformedHeight);
                }
                int g = this.filterShaders.g(!b);
                int i13 = this.NUM_FILTER_SHADER;
                i3 = 3042;
                fArr = this.mSTMatrixIdentity;
                i4 = i13;
                i5 = g;
                i6 = b;
                i2 = 3553;
            } else {
                int i14 = this.mTextureID;
                int i15 = this.NUM_EXTERNAL_SHADER;
                i2 = 36197;
                i3 = 3042;
                fArr = this.mSTMatrix;
                i4 = i15;
                i5 = i14;
                i6 = 0;
            }
            drawBackground();
            i7 = 33984;
            GLES20.glUseProgram(this.mProgram[i4]);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(i2, i5);
            if (this.messageVideoMaskPath != null && this.videoMaskTexture != -1) {
                GLES20.glActiveTexture(i);
                GLES20.glBindTexture(3553, this.videoMaskTexture);
                GLES20.glUniform1i(this.maskTextureHandle[i4], 1);
            }
            GLES20.glVertexAttribPointer(this.maPositionHandle[i4], 2, 5126, false, 8, (Buffer) this.verticesBuffer);
            GLES20.glEnableVertexAttribArray(this.maPositionHandle[i4]);
            int i16 = this.maTextureHandle[i4];
            if (this.useMatrixForImagePath) {
                floatBuffer = this.croppedTextureBuffer;
            } else {
                floatBuffer = this.renderTextureBuffer;
            }
            GLES20.glVertexAttribPointer(i16, 2, 5126, false, 8, (Buffer) floatBuffer);
            GLES20.glEnableVertexAttribArray(this.maTextureHandle[i4]);
            if (this.messageVideoMaskPath != null && this.videoMaskTexture != -1) {
                GLES20.glVertexAttribPointer(this.mmTextureHandle[i4], 2, 5126, false, 8, (Buffer) this.maskTextureBuffer);
                GLES20.glEnableVertexAttribArray(this.mmTextureHandle[i4]);
            }
            int i17 = this.texSizeHandle;
            if (i17 != 0) {
                GLES20.glUniform2f(i17, this.transformedWidth, this.transformedHeight);
            }
            GLES20.glUniformMatrix4fv(this.muSTMatrixHandle[i4], 1, false, fArr, 0);
            GLES20.glUniformMatrix4fv(this.muMVPMatrixHandle[i4], 1, false, this.mMVPMatrix, 0);
            GLES20.glDrawArrays(5, 0, 4);
        }
        if (this.blur != null) {
            if (!this.blendEnabled) {
                GLES20.glEnable(i3);
                GLES20.glBlendFunc(1, 771);
                this.blendEnabled = true;
            }
            if (this.imagePath != null && (iArr = this.paintTexture) != null) {
                i8 = iArr[0];
                i9 = this.imageWidth;
                i10 = this.imageHeight;
            } else {
                xf4 xf4Var2 = this.filterShaders;
                if (xf4Var2 != null) {
                    i8 = xf4Var2.g(i6 ^ 1);
                    xf4 xf4Var3 = this.filterShaders;
                    int i18 = xf4Var3.X0;
                    i10 = xf4Var3.Y0;
                    i9 = i18;
                } else {
                    i8 = -1;
                    i9 = 1;
                    i10 = 1;
                }
            }
            if (i8 != -1) {
                this.blur.a(i8, i9, i10, null);
                GLES20.glViewport(0, 0, this.transformedWidth, this.transformedHeight);
                GLES20.glBindFramebuffer(36160, 0);
                GLES20.glUseProgram(this.blurShaderProgram);
                GLES20.glEnableVertexAttribArray(this.blurInputTexCoordHandle);
                GLES20.glVertexAttribPointer(this.blurInputTexCoordHandle, 2, 5126, false, 8, (Buffer) this.gradientTextureBuffer);
                GLES20.glEnableVertexAttribArray(this.blurPositionHandle);
                GLES20.glVertexAttribPointer(this.blurPositionHandle, 2, 5126, false, 8, (Buffer) this.blurVerticesBuffer);
                GLES20.glUniform1i(this.blurBlurImageHandle, 0);
                GLES20.glActiveTexture(i7);
                GLES20.glBindTexture(3553, this.blur.s[2]);
                GLES20.glUniform1i(this.blurMaskImageHandle, 1);
                GLES20.glActiveTexture(i);
                GLES20.glBindTexture(3553, this.blurTexture[0]);
                GLES20.glDrawArrays(5, 0, 4);
            }
        }
        if (isCollage()) {
            for (int i19 = 0; i19 < this.collageParts.size(); i19++) {
                stepCollagePart(i19, this.collageParts.get(i19), j);
                drawCollagePart(i19, this.collageParts.get(i19), j);
            }
        }
        if (this.isPhoto || this.paintTexture != null || this.stickerTexture != null) {
            GLES20.glUseProgram(this.simpleShaderProgram);
            GLES20.glActiveTexture(i7);
            GLES20.glUniform1i(this.simpleSourceImageHandle, 0);
            GLES20.glEnableVertexAttribArray(this.simpleInputTexCoordHandle);
            GLES20.glVertexAttribPointer(this.simpleInputTexCoordHandle, 2, 5126, false, 8, (Buffer) this.textureBuffer);
            GLES20.glEnableVertexAttribArray(this.simplePositionHandle);
        }
        if (this.imagePathIndex >= 0 && !isCollage()) {
            int i20 = this.paintTexture[this.imagePathIndex];
            if (this.useMatrixForImagePath && this.isPhoto) {
                z = true;
            } else {
                z = false;
            }
            drawTexture(true, i20, -10000.0f, -10000.0f, -10000.0f, -10000.0f, 0.0f, false, z, -1);
        }
        int i21 = this.paintPathIndex;
        if (i21 >= 0) {
            drawTexture(true, this.paintTexture[i21], -10000.0f, -10000.0f, -10000.0f, -10000.0f, 0.0f, false, false, -1);
        }
        int i22 = this.messagePathIndex;
        if (i22 >= 0) {
            drawTexture(true, this.paintTexture[i22], -10000.0f, -10000.0f, -10000.0f, -10000.0f, 0.0f, false, false, -1);
        }
        if (this.stickerTexture != null) {
            int size = this.mediaEntities.size();
            for (int i23 = 0; i23 < size; i23++) {
                drawEntity(this.mediaEntities.get(i23), this.mediaEntities.get(i23).l, j);
            }
        }
        GLES20.glFinish();
    }

    public int getTextureId() {
        return this.mTextureID;
    }

    public void release() {
        ArrayList<pcc> arrayList = this.mediaEntities;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                pcc pccVar = this.mediaEntities.get(i);
                RLottieNative rLottieNative = pccVar.D;
                if (rLottieNative != null) {
                    rLottieNative.d();
                }
                kn knVar = pccVar.K;
                if (knVar != null) {
                    knVar.u();
                }
                View view = pccVar.I;
                if (view instanceof vu3) {
                    vu3 vu3Var = (vu3) view;
                    gn.release(vu3Var, vu3Var.F);
                }
                Bitmap bitmap = pccVar.G;
                if (bitmap != null) {
                    bitmap.recycle();
                    pccVar.G = null;
                }
            }
        }
        ArrayList<qcc> arrayList2 = this.collageParts;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            int i2 = 0;
            while (i2 < size2) {
                arrayList2.get(i2);
                i2++;
                for (int i3 = 0; i3 < this.collageParts.size(); i3++) {
                    destroyCollagePart(i3, this.collageParts.get(i3));
                }
            }
        }
    }

    public void setBreakStrategy(dv3 dv3Var) {
        dv3Var.setBreakStrategy(0);
    }

    public void surfaceCreated() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.video.TextureRenderer.surfaceCreated():void");
    }

    private void drawTexture(boolean z, int i, float f, float f2, float f3, float f4, float f5, boolean z2) {
        drawTexture(z, i, f, f2, f3, f4, f5, z2, false, -1);
    }

    private void drawTexture(boolean z, int i) {
        drawTexture(z, i, -10000.0f, -10000.0f, -10000.0f, -10000.0f, 0.0f, false);
    }
}

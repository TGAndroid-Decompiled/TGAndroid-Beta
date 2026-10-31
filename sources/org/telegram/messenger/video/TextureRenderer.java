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
import ig.h0;
import java.io.File;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import jg.t0;
import jg.y0;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.f8;
import org.telegram.messenger.h6;
import org.telegram.messenger.i0;
import org.telegram.messenger.k6;
import org.telegram.messenger.m5;
import org.telegram.messenger.u20;
import org.telegram.messenger.v2;
import org.telegram.messenger.v20;
import org.telegram.messenger.w0;
import org.telegram.messenger.w20;
import org.telegram.messenger.ye;
import org.telegram.messenger.z20;
import org.telegram.ui.Components.RLottieNative;
import org.telegram.ui.Components.f5;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.jz;
import org.telegram.ui.Components.o5;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.qt;
import org.telegram.ui.Components.s5;
import org.telegram.ui.Components.x9;
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
    private x9 blur;
    private int blurBlurImageHandle;
    private int blurInputTexCoordHandle;
    private int blurMaskImageHandle;
    private String blurPath;
    private int blurPositionHandle;
    private int blurShaderProgram;
    private int[] blurTexture;
    private FloatBuffer blurVerticesBuffer;
    private ArrayList<w20> collageParts;
    private int[] collageTextures;
    private final ye cropState;
    private FloatBuffer croppedTextureBuffer;
    private ArrayList<f5> emojiDrawables;
    private jz filterShaders;
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
    private ArrayList<v20> mediaEntities;
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

    public TextureRenderer(org.telegram.messenger.ff r32, java.lang.String r33, java.lang.String r34, java.lang.String r35, java.util.ArrayList<org.telegram.messenger.v20> r36, org.telegram.messenger.ye r37, int r38, int r39, int r40, int r41, int r42, float r43, boolean r44, java.lang.Integer r45, java.lang.Integer r46, vh.m5 r47, org.telegram.messenger.video.MediaCodecVideoConvertor.ConvertVideoParams r48) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.video.TextureRenderer.<init>(org.telegram.messenger.ff, java.lang.String, java.lang.String, java.lang.String, java.util.ArrayList, org.telegram.messenger.ye, int, int, int, int, int, float, boolean, java.lang.Integer, java.lang.Integer, vh.m5, org.telegram.messenger.video.MediaCodecVideoConvertor$ConvertVideoParams):void");
    }

    private void applyRoundRadius(v20 v20Var, Bitmap bitmap, int i10) {
        if (bitmap != null && v20Var != null) {
            if (v20Var.f18470s != 0.0f || i10 != 0) {
                if (v20Var.L == null) {
                    v20Var.L = new Canvas(bitmap);
                }
                if (v20Var.f18470s != 0.0f) {
                    if (this.path == null) {
                        this.path = new Path();
                    }
                    if (this.xRefPaint == null) {
                        Paint paint = new Paint(1);
                        this.xRefPaint = paint;
                        paint.setColor(-16777216);
                        this.xRefPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                    }
                    float min = Math.min(bitmap.getWidth(), bitmap.getHeight()) * v20Var.f18470s;
                    this.path.rewind();
                    this.path.addRoundRect(new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight()), min, min, Path.Direction.CCW);
                    this.path.toggleInverseFillType();
                    v20Var.L.drawPath(this.path, this.xRefPaint);
                }
                if (i10 != 0) {
                    if (this.textColorPaint == null) {
                        Paint paint2 = new Paint(1);
                        this.textColorPaint = paint2;
                        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
                    }
                    this.textColorPaint.setColor(i10);
                    v20Var.L.drawRect(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight(), this.textColorPaint);
                }
            }
        }
    }

    private int createProgram(String str, String str2, boolean z10) {
        int h;
        int glCreateProgram;
        int h10;
        int glCreateProgram2;
        if (z10) {
            int h11 = jz.h(35633, str);
            if (h11 == 0 || (h10 = jz.h(35632, str2)) == 0 || (glCreateProgram2 = GLES20.glCreateProgram()) == 0) {
                return 0;
            }
            GLES20.glAttachShader(glCreateProgram2, h11);
            GLES20.glAttachShader(glCreateProgram2, h10);
            GLES20.glLinkProgram(glCreateProgram2);
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(glCreateProgram2, 35714, iArr, 0);
            if (iArr[0] != 1) {
                GLES20.glDeleteProgram(glCreateProgram2);
                return 0;
            }
            return glCreateProgram2;
        }
        int h12 = jz.h(35633, str);
        if (h12 == 0 || (h = jz.h(35632, str2)) == 0 || (glCreateProgram = GLES20.glCreateProgram()) == 0) {
            return 0;
        }
        GLES20.glAttachShader(glCreateProgram, h12);
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

    private void destroyCollagePart(int i10, w20 w20Var) {
        if (w20Var != null) {
            s5 s5Var = w20Var.f19058u;
            if (s5Var != null) {
                s5Var.u();
                w20Var.f19058u = null;
            }
            MediaCodecPlayer mediaCodecPlayer = w20Var.B;
            if (mediaCodecPlayer != null) {
                mediaCodecPlayer.release();
                w20Var.B = null;
            }
            SurfaceTexture surfaceTexture = w20Var.f19059z;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                w20Var.f19059z = null;
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

    private void drawCollagePart(int i10, w20 w20Var, long j10) {
        if (w20Var.B != null && w20Var.f19046b) {
            GLES20.glUseProgram(this.simpleShaderProgramOES);
            GLES20.glActiveTexture(33987);
            GLES20.glBindTexture(36197, this.collageTextures[i10]);
            GLES20.glUniform1i(this.simpleSourceImageHandleOES, 3);
            GLES20.glEnableVertexAttribArray(this.simpleInputTexCoordHandleOES);
            GLES20.glVertexAttribPointer(this.simpleInputTexCoordHandleOES, 2, 5126, false, 8, (Buffer) w20Var.f19057t);
            GLES20.glEnableVertexAttribArray(this.simplePositionHandleOES);
            GLES20.glVertexAttribPointer(this.simplePositionHandleOES, 2, 5126, false, 8, (Buffer) w20Var.f19056s);
        } else {
            GLES20.glUseProgram(this.simpleShaderProgram);
            GLES20.glActiveTexture(33986);
            GLES20.glBindTexture(3553, this.collageTextures[i10]);
            GLES20.glUniform1i(this.simpleSourceImageHandle, 2);
            GLES20.glEnableVertexAttribArray(this.simpleInputTexCoordHandle);
            GLES20.glVertexAttribPointer(this.simpleInputTexCoordHandle, 2, 5126, false, 8, (Buffer) w20Var.f19057t);
            GLES20.glEnableVertexAttribArray(this.simplePositionHandle);
            GLES20.glVertexAttribPointer(this.simplePositionHandle, 2, 5126, false, 8, (Buffer) w20Var.f19056s);
        }
        GLES20.glDrawArrays(5, 0, 4);
    }

    private void drawEntity(v20 v20Var, int i10, long j10) {
        v20 v20Var2;
        boolean z10;
        Bitmap bitmap;
        Bitmap bitmap2;
        int i11;
        boolean z11;
        long j11;
        long j12;
        long k10;
        int i12;
        boolean z12;
        RLottieNative rLottieNative = v20Var.D;
        if (rLottieNative != null) {
            Bitmap bitmap3 = v20Var.G;
            if (bitmap3 != null && v20Var.U > 0 && v20Var.V > 0) {
                rLottieNative.c((int) v20Var.E, bitmap3, true);
                Bitmap bitmap4 = v20Var.G;
                if ((v20Var.f18456b & 8) != 0) {
                    i12 = i10;
                } else {
                    i12 = 0;
                }
                applyRoundRadius(v20Var, bitmap4, i12);
                GLES20.glBindTexture(3553, this.stickerTexture[0]);
                GLUtils.texImage2D(3553, 0, v20Var.G, 0);
                float f7 = v20Var.E + v20Var.F;
                v20Var.E = f7;
                if (f7 >= v20Var.D.f24120a[0]) {
                    v20Var.E = 0.0f;
                }
                int i13 = this.stickerTexture[0];
                float f10 = v20Var.f18457c;
                float f11 = v20Var.d;
                float f12 = v20Var.f18458f;
                float f13 = v20Var.f18459g;
                float f14 = v20Var.e;
                if ((2 & v20Var.f18456b) != 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                drawTexture(false, i13, f10, f11, f12, f13, f14, z12);
            }
        } else if (v20Var.J != null) {
            float f15 = v20Var.E;
            int i14 = (int) f15;
            float f16 = 1.0f;
            if (v20Var.f18455a == 5) {
                if (this.isPhoto) {
                    j11 = v20Var.T;
                    j12 = 0;
                } else {
                    long j13 = v20Var.Q;
                    j11 = (v20Var.S - v20Var.R) + j13;
                    j12 = j13;
                }
                long j14 = j10 / 1000000;
                if (j14 < j12) {
                    f16 = gr.h.getInterpolation(Utilities.i(1.0f - (((float) (j12 - j14)) / 400.0f), 1.0f, 0.0f));
                } else if (j14 > j11) {
                    f16 = gr.h.getInterpolation(Utilities.i(1.0f - (((float) (j14 - j11)) / 400.0f), 1.0f, 0.0f));
                }
                if (f16 > 0.0f) {
                    if (this.isPhoto) {
                        k10 = Utilities.k(j14, v20Var.T, 0L);
                    } else {
                        k10 = Utilities.k((j14 - v20Var.Q) + v20Var.R, v20Var.T, 0L);
                    }
                    while (!v20Var.K) {
                        int[] iArr = v20Var.J.d;
                        if (iArr[3] >= Math.min(k10, iArr[4])) {
                            break;
                        }
                        s5 s5Var = v20Var.J;
                        int i15 = s5Var.d[3];
                        s5Var.r(false);
                        int i16 = v20Var.J.d[3];
                        if (i16 <= i15 && (i16 != 0 || i15 != 0)) {
                            v20Var.K = true;
                            break;
                        }
                    }
                }
            } else {
                float f17 = f15 + v20Var.F;
                v20Var.E = f17;
                for (int i17 = (int) f17; i14 != i17; i17--) {
                    v20Var.J.r(true);
                }
            }
            p5 p5Var = v20Var.J.f30153w;
            if (p5Var != null) {
                bitmap = p5Var.f29288b;
            } else {
                bitmap = null;
            }
            if (bitmap != null) {
                if (v20Var.f18455a == 5) {
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
                        this.roundClipPath.addCircle(this.roundBitmap.getWidth() / 2.0f, this.roundBitmap.getHeight() / 2.0f, (this.roundBitmap.getWidth() / 2.0f) * f16, Path.Direction.CW);
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
                        if ((v20Var.f18456b & 8) != 0) {
                            i11 = i10;
                        } else {
                            i11 = 0;
                        }
                        applyRoundRadius(v20Var, bitmap7, i11);
                    }
                    bitmap2 = this.stickerBitmap;
                }
                if (bitmap2 != null) {
                    GLES20.glBindTexture(3553, this.stickerTexture[0]);
                    GLUtils.texImage2D(3553, 0, bitmap2, 0);
                    int i18 = this.stickerTexture[0];
                    float f18 = v20Var.f18457c;
                    float f19 = v20Var.d;
                    float f20 = v20Var.f18458f;
                    float f21 = v20Var.f18459g;
                    float f22 = v20Var.e;
                    if ((v20Var.f18456b & 2) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    drawTexture(false, i18, f18, f19, f20, f21, f22, z11);
                }
            }
        } else {
            if (v20Var.G != null) {
                GLES20.glBindTexture(3553, this.stickerTexture[0]);
                GLUtils.texImage2D(3553, 0, v20Var.G, 0);
                int i19 = this.stickerTexture[0];
                float f23 = v20Var.f18457c;
                float f24 = v20Var.h;
                float f25 = f23 - (f24 / 2.0f);
                float f26 = v20Var.d;
                float f27 = v20Var.f18460i;
                float f28 = f26 - (f27 / 2.0f);
                float f29 = v20Var.f18458f + f24;
                float f30 = f27 + v20Var.f18459g;
                float f31 = v20Var.e;
                if (v20Var.f18455a == 2 && (v20Var.f18456b & 2) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                drawTexture(false, i19, f25, f28, f29, f30, f31, z10);
            }
            ArrayList arrayList = v20Var.f18462k;
            if (arrayList != null && !arrayList.isEmpty()) {
                for (int i20 = 0; i20 < v20Var.f18462k.size(); i20++) {
                    u20 u20Var = (u20) v20Var.f18462k.get(i20);
                    if (u20Var != null && (v20Var2 = u20Var.f18225b) != null) {
                        drawEntity(v20Var2, v20Var.f18463l, j10);
                    }
                }
            }
        }
    }

    private void drawTexture(boolean z10, int i10) {
        drawTexture(z10, i10, -10000.0f, -10000.0f, -10000.0f, -10000.0f, 0.0f, false);
    }

    private FloatBuffer floats(float[] fArr) {
        FloatBuffer g10 = z20.g(ByteBuffer.allocateDirect(fArr.length * 4));
        g10.put(fArr).position(0);
        return g10;
    }

    private void initCollagePart(int i10, w20 w20Var) {
        float f7;
        vh.r rVar;
        AtomicInteger atomicInteger = new AtomicInteger(w20Var.f19052l);
        AtomicInteger atomicInteger2 = new AtomicInteger(w20Var.f19053m);
        AtomicInteger atomicInteger3 = new AtomicInteger(0);
        if (w20Var.f19046b) {
            GLES20.glBindTexture(36197, this.collageTextures[i10]);
            GLES20.glTexParameteri(36197, 10241, 9728);
            GLES20.glTexParameteri(36197, 10240, 9728);
            GLES20.glTexParameteri(36197, 10242, 33071);
            GLES20.glTexParameteri(36197, 10243, 33071);
            SurfaceTexture surfaceTexture = new SurfaceTexture(this.collageTextures[i10]);
            w20Var.f19059z = surfaceTexture;
            surfaceTexture.setDefaultBufferSize(w20Var.f19052l, w20Var.f19053m);
            try {
                w20Var.B = new MediaCodecPlayer(w20Var.d, new Surface(w20Var.f19059z));
            } catch (Exception e) {
                f8.g(e, true);
                w20Var.B = null;
            }
            MediaCodecPlayer mediaCodecPlayer = w20Var.B;
            if (mediaCodecPlayer != null) {
                atomicInteger.set(mediaCodecPlayer.getOrientedWidth());
                atomicInteger2.set(w20Var.B.getOrientedHeight());
                atomicInteger3.set(w20Var.B.getOrientation());
            } else {
                w20Var.f19059z.release();
                w20Var.f19059z = null;
                GLES20.glDeleteTextures(1, this.collageTextures, i10);
                GLES20.glGenTextures(1, this.collageTextures, i10);
                GLES20.glBindTexture(3553, this.collageTextures[i10]);
                GLES20.glTexParameteri(3553, 10241, 9729);
                GLES20.glTexParameteri(3553, 10240, 9729);
                GLES20.glTexParameteri(3553, 10242, 33071);
                GLES20.glTexParameteri(3553, 10243, 33071);
                s5 s5Var = new s5(new File(w20Var.d), true, 0L, 0, null, null, null, 0L, d20.f15147s0, true, 512, 512, null, 0, true);
                w20Var.f19058u = s5Var;
                if (s5Var.f30157y && s5Var.f30132e0) {
                    throw new RuntimeException("Failed to decode with ffmpeg software codecs");
                }
                w20Var.v = 1000.0f / s5Var.d[5];
                Bitmap r10 = s5Var.r(false);
                if (r10 != null) {
                    GLUtils.texImage2D(3553, 0, r10, 0);
                }
                atomicInteger.set(w20Var.f19058u.getIntrinsicWidth());
                atomicInteger2.set(w20Var.f19058u.getIntrinsicHeight());
                atomicInteger3.set(w20Var.f19058u.d[2]);
            }
        } else {
            GLES20.glBindTexture(3553, this.collageTextures[i10]);
            GLES20.glTexParameteri(3553, 10241, 9729);
            GLES20.glTexParameteri(3553, 10240, 9729);
            GLES20.glTexParameteri(3553, 10242, 33071);
            GLES20.glTexParameteri(3553, 10243, 33071);
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inMutable = true;
            Bitmap decodeFile = BitmapFactory.decodeFile(w20Var.d, options);
            Pair N0 = i0.N0(w20Var.d);
            if (((Integer) N0.first).intValue() != 0 || ((Integer) N0.second).intValue() != 0) {
                Matrix matrix = new Matrix();
                if (((Integer) N0.second).intValue() != 0) {
                    float f10 = -1.0f;
                    if (((Integer) N0.second).intValue() == 1) {
                        f7 = -1.0f;
                    } else {
                        f7 = 1.0f;
                    }
                    if (((Integer) N0.second).intValue() != 2) {
                        f10 = 1.0f;
                    }
                    matrix.postScale(f7, f10);
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
        float a2 = w20Var.f19055r.a(2.0f) - 1.0f;
        vh.q qVar = w20Var.f19055r;
        vh.q qVar2 = w20Var.f19055r;
        vh.q qVar3 = w20Var.f19055r;
        vh.q qVar4 = w20Var.f19055r;
        int i11 = qVar4.f51775a.f51798c;
        int i12 = qVar4.f51777c;
        float[] fArr = {a2, -(((2.0f / qVar.f51775a.f51798c) * qVar.f51777c) - 1.0f), qVar.b(2.0f) - 1.0f, -(((2.0f / qVar2.f51775a.f51798c) * qVar2.f51777c) - 1.0f), qVar2.a(2.0f) - 1.0f, -(((2.0f / qVar3.f51775a.f51798c) * (qVar3.f51777c + 1)) - 1.0f), qVar3.b(2.0f) - 1.0f, -(((2.0f / i11) * (i12 + 1)) - 1.0f)};
        float f11 = this.transformedWidth / rVar.d[i12];
        float f12 = this.transformedHeight / i11;
        int i13 = atomicInteger.get();
        int i14 = atomicInteger2.get();
        int i15 = atomicInteger3.get();
        float f13 = i13;
        float f14 = i14;
        float max = 1.0f / Math.max(f11 / f13, f12 / f14);
        float f15 = ((f11 * max) / f13) / 2.0f;
        float f16 = ((f12 * max) / f14) / 2.0f;
        if ((i15 / 90) % 2 != 1) {
            f16 = f15;
            f15 = f16;
        }
        float f17 = 0.5f - f16;
        float f18 = 0.5f - f15;
        float f19 = f16 + 0.5f;
        float f20 = f15 + 0.5f;
        float[] fArr2 = {f17, f18, f19, f18, f17, f20, f19, f20};
        while (i15 > 0) {
            float f21 = fArr2[0];
            float f22 = fArr2[1];
            fArr2[0] = fArr2[4];
            fArr2[1] = fArr2[5];
            fArr2[4] = fArr2[6];
            fArr2[5] = fArr2[7];
            fArr2[6] = fArr2[2];
            fArr2[7] = fArr2[3];
            fArr2[2] = f21;
            fArr2[3] = f22;
            i15 -= 90;
        }
        while (i15 < 0) {
            float f23 = fArr2[0];
            float f24 = fArr2[1];
            fArr2[0] = fArr2[2];
            fArr2[1] = fArr2[3];
            fArr2[2] = fArr2[6];
            fArr2[3] = fArr2[7];
            fArr2[6] = fArr2[4];
            fArr2[7] = fArr2[5];
            fArr2[4] = f23;
            fArr2[5] = f24;
            i15 += 90;
        }
        w20Var.f19056s = floats(fArr);
        w20Var.f19057t = floats(fArr2);
    }

    private void initLinkEntity(v20 v20Var) {
        t0 t0Var = new t0(w0.f19025b, v20Var.P);
        t0Var.U = true;
        t0Var.b(d20.f15147s0, v20Var.W, false);
        if (t0Var.e()) {
            t0Var.setPreviewType(v20Var.f18456b);
        } else {
            t0Var.c(v20Var.f18456b, v20Var.f18463l);
        }
        int i10 = v20Var.f18468q;
        int i11 = t0Var.f10240f;
        t0Var.setMaxWidth(i10 + i11 + i11);
        t0Var.measure(View.MeasureSpec.makeMeasureSpec(v20Var.f18468q, 1073741824), View.MeasureSpec.makeMeasureSpec(v20Var.f18469r, 1073741824));
        t0Var.layout(0, 0, v20Var.f18468q, v20Var.f18469r);
        float f7 = v20Var.f18458f * this.transformedWidth;
        int i12 = v20Var.f18468q;
        float f10 = f7 / i12;
        v20Var.G = Bitmap.createBitmap(((int) (i12 * f10)) + 16, ((int) (v20Var.f18469r * f10)) + 16, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(v20Var.G);
        float f11 = 8;
        canvas.translate(f11, f11);
        canvas.scale(f10, f10);
        t0Var.draw(canvas);
        float f12 = 16 * f10;
        v20Var.h = f12 / this.transformedWidth;
        v20Var.f18460i = f12 / this.transformedHeight;
    }

    private void initLocationEntity(v20 v20Var) {
        float f7;
        float f10;
        byte b10 = v20Var.f18455a;
        y0 y0Var = new y0(w0.f19025b, v20Var.P);
        y0Var.setIsVideo(true);
        y0Var.setText(v20Var.f18461j);
        y0Var.e(v20Var.f18456b, v20Var.f18463l);
        if (v20Var.O != null && v20Var.f18462k.isEmpty()) {
            y0Var.d(d20.f15147s0, v20Var.O.f51440c);
        }
        y0Var.setMaxWidth(v20Var.f18468q);
        if (v20Var.f18462k.size() == 1) {
            y0Var.f10370y = true;
            y0Var.f10363c = true;
            y0Var.requestLayout();
        }
        y0Var.measure(View.MeasureSpec.makeMeasureSpec(v20Var.f18468q, 1073741824), View.MeasureSpec.makeMeasureSpec(v20Var.f18469r, 1073741824));
        y0Var.layout(0, 0, v20Var.f18468q, v20Var.f18469r);
        float f11 = v20Var.f18458f * this.transformedWidth;
        float f12 = v20Var.f18468q;
        float f13 = f11 / f12;
        v20Var.G = Bitmap.createBitmap(((int) (f12 * f13)) + 16, ((int) (v20Var.f18469r * f13)) + 16, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(v20Var.G);
        float f14 = 8;
        canvas.translate(f14, f14);
        canvas.scale(f13, f13);
        y0Var.draw(canvas);
        float f15 = 16 * f13;
        v20Var.h = f15 / this.transformedWidth;
        v20Var.f18460i = f15 / this.transformedHeight;
        if (v20Var.f18462k.size() == 1) {
            u20 u20Var = (u20) v20Var.f18462k.get(0);
            v20 v20Var2 = new v20();
            u20Var.f18225b = v20Var2;
            v20Var2.f18461j = u20Var.f18224a;
            v20Var2.f18456b = u20Var.f18226c;
            RectF rectF = new RectF();
            float f16 = y0Var.I;
            float f17 = y0Var.d.left + 2.25f;
            float f18 = y0Var.D;
            float f19 = y0Var.J;
            float f20 = y0Var.N;
            float f21 = f18 * 21.33f;
            rectF.set((f17 * f18) + f16, c3.i0.B(f20, f21, 2.0f, f19), z20.b(f17, 21.33f, f18, f16), m5.a(f21, f20, 2.0f, f19));
            float centerX = ((rectF.centerX() / v20Var.f18468q) * v20Var.f18458f) + v20Var.f18457c;
            float f22 = v20Var.d;
            float centerY = rectF.centerY() / v20Var.f18469r;
            float f23 = v20Var.f18459g;
            float f24 = (centerY * f23) + f22;
            if (v20Var.e != 0.0f) {
                float f25 = (v20Var.f18458f / 2.0f) + v20Var.f18457c;
                float f26 = (f23 / 2.0f) + v20Var.d;
                float f27 = this.transformedWidth / this.transformedHeight;
                double d = centerX - f25;
                double d10 = (f24 - f26) / f27;
                f10 = 2.0f;
                float cos = ((float) ((Math.cos(-f7) * d) - (Math.sin(-v20Var.e) * d10))) + f25;
                f24 = (((float) i0.a.c(-v20Var.e, d10, Math.sin(-v20Var.e) * d)) * f27) + f26;
                centerX = cos;
            } else {
                f10 = 2.0f;
            }
            u20Var.f18225b.f18458f = (rectF.width() / v20Var.f18468q) * v20Var.f18458f;
            u20Var.f18225b.f18459g = (rectF.height() / v20Var.f18469r) * v20Var.f18459g;
            v20 v20Var3 = u20Var.f18225b;
            float f28 = v20Var3.f18458f * 1.2f;
            v20Var3.f18458f = f28;
            float f29 = v20Var3.f18459g * 1.2f;
            v20Var3.f18459g = f29;
            v20Var3.f18457c = centerX - (f28 / f10);
            v20Var3.d = f24 - (f29 / f10);
            v20Var3.e = v20Var.e;
            initStickerEntity(v20Var3);
        }
    }

    public void initStickerEntity(v20 v20Var) {
        Bitmap bitmap;
        ye yeVar;
        ye yeVar2;
        int i10;
        int i11 = (int) (v20Var.f18458f * this.transformedWidth);
        v20Var.U = i11;
        int i12 = (int) (v20Var.f18459g * this.transformedHeight);
        v20Var.V = i12;
        if (i11 > 512) {
            v20Var.V = (int) ((i12 / i11) * 512.0f);
            v20Var.U = 512;
        }
        int i13 = v20Var.V;
        if (i13 > 512) {
            v20Var.U = (int) ((v20Var.U / i13) * 512.0f);
            v20Var.V = 512;
        }
        byte b10 = v20Var.f18456b;
        float f7 = 0.0f;
        if ((b10 & 1) != 0) {
            int i14 = v20Var.U;
            if (i14 > 0 && (i10 = v20Var.V) > 0) {
                v20Var.G = Bitmap.createBitmap(i14, i10, Bitmap.Config.ARGB_8888);
                RLottieNative a2 = RLottieNative.a(v20Var.f18461j, null, null, null, 0, null);
                v20Var.D = a2;
                if (a2 != null) {
                    f7 = a2.f24120a[1] / this.videoFps;
                }
                v20Var.F = f7;
            }
        } else if ((b10 & 4) != 0) {
            v20Var.K = false;
            s5 s5Var = new s5(new File(v20Var.f18461j), true, 0L, 0, null, null, null, 0L, d20.f15147s0, true, 512, 512, null, 0, true);
            v20Var.J = s5Var;
            v20Var.F = s5Var.d[5] / this.videoFps;
            v20Var.E = 1.0f;
            s5Var.r(true);
        } else {
            String str = v20Var.f18461j;
            if (!TextUtils.isEmpty(v20Var.f18471t) && (v20Var.f18456b & 16) != 0) {
                str = v20Var.f18471t;
            }
            BitmapFactory.Options options = new BitmapFactory.Options();
            if (v20Var.f18455a == 2) {
                options.inMutable = true;
            }
            Bitmap decodeFile = BitmapFactory.decodeFile(str, options);
            v20Var.G = decodeFile;
            if (decodeFile != null && (yeVar = v20Var.f18472u) != null) {
                Bitmap createBitmap = Bitmap.createBitmap((int) Math.max(1.0f, yeVar.e * decodeFile.getWidth()), (int) Math.max(1.0f, v20Var.f18472u.f19367f * v20Var.G.getHeight()), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
                canvas.rotate(-v20Var.f18472u.f19378z);
                int width = v20Var.G.getWidth();
                int height = v20Var.G.getHeight();
                ye yeVar3 = v20Var.f18472u;
                if (((yeVar3.f19378z + yeVar3.f19370k) / 90) % 2 == 1) {
                    width = v20Var.G.getHeight();
                    height = v20Var.G.getWidth();
                }
                ye yeVar4 = v20Var.f18472u;
                float f10 = yeVar4.e;
                float f11 = yeVar4.f19367f;
                float f12 = width;
                float f13 = height;
                canvas.clipRect(((-width) * f10) / 2.0f, ((-height) * f11) / 2.0f, (f10 * f12) / 2.0f, (f11 * f13) / 2.0f);
                float f14 = v20Var.f18472u.f19366c;
                canvas.scale(f14, f14);
                ye yeVar5 = v20Var.f18472u;
                canvas.translate(yeVar5.f19364a * f12, yeVar5.f19365b * f13);
                canvas.rotate(v20Var.f18472u.d + yeVar2.f19370k);
                if (v20Var.f18472u.f19371l) {
                    canvas.scale(-1.0f, 1.0f);
                }
                canvas.rotate(v20Var.f18472u.f19378z);
                canvas.translate((-v20Var.G.getWidth()) / 2.0f, (-v20Var.G.getHeight()) / 2.0f);
                canvas.drawBitmap(v20Var.G, 0.0f, 0.0f, (Paint) null);
                v20Var.G.recycle();
                v20Var.G = createBitmap;
            }
            if (v20Var.f18455a == 2 && v20Var.G != null) {
                v20Var.f18470s = i0.L(12.0f) / Math.min(v20Var.f18468q, v20Var.f18469r);
                Pair N0 = i0.N0(v20Var.f18461j);
                v20Var.e = (float) (v20Var.e - Math.toRadians(((Integer) N0.first).intValue()));
                if ((((Integer) N0.first).intValue() / 90) % 2 == 1) {
                    float f15 = v20Var.f18457c;
                    float f16 = v20Var.f18458f;
                    float f17 = (f16 / 2.0f) + f15;
                    float f18 = v20Var.d;
                    float f19 = v20Var.f18459g;
                    float f20 = (f19 / 2.0f) + f18;
                    float f21 = this.transformedWidth;
                    float f22 = this.transformedHeight;
                    float f23 = (f16 * f21) / f22;
                    float f24 = (f19 * f22) / f21;
                    v20Var.f18458f = f24;
                    v20Var.f18459g = f23;
                    v20Var.f18457c = f17 - (f24 / 2.0f);
                    v20Var.d = f20 - (f23 / 2.0f);
                }
                applyRoundRadius(v20Var, v20Var.G, 0);
                return;
            }
            if (v20Var.G != null) {
                float width2 = bitmap.getWidth() / v20Var.G.getHeight();
                if (width2 > 1.0f) {
                    float f25 = v20Var.f18459g;
                    float f26 = f25 / width2;
                    v20Var.d = c3.i0.B(f25, f26, 2.0f, v20Var.d);
                    v20Var.f18459g = f26;
                } else if (width2 < 1.0f) {
                    float f27 = v20Var.f18458f;
                    float f28 = width2 * f27;
                    v20Var.f18457c = c3.i0.B(f27, f28, 2.0f, v20Var.f18457c);
                    v20Var.f18458f = f28;
                }
            }
        }
    }

    private void initTextEntity(final v20 v20Var) {
        int i10;
        int i11;
        int i12;
        Typeface d;
        final jg.b bVar = new jg.b(w0.f19025b);
        bVar.getPaint().setAntiAlias(true);
        bVar.G = false;
        bVar.setBackgroundColor(0);
        bVar.setPadding(i0.L(7.0f), i0.L(7.0f), i0.L(7.0f), i0.L(7.0f));
        h0 h0Var = v20Var.f18465n;
        if (h0Var != null && (d = h0Var.d()) != null) {
            bVar.setTypeface(d);
        }
        bVar.setTextSize(0, v20Var.f18464m);
        SpannableString spannableString = new SpannableString(v20Var.f18461j);
        ArrayList arrayList = v20Var.f18462k;
        int size = arrayList.size();
        int i13 = 0;
        while (i13 < size) {
            int i14 = i13 + 1;
            final u20 u20Var = (u20) arrayList.get(i13);
            if (u20Var.f18224a != null) {
                v20 v20Var2 = new v20();
                u20Var.f18225b = v20Var2;
                v20Var2.f18461j = u20Var.f18224a;
                v20Var2.f18456b = u20Var.f18226c;
                o5 o5Var = new o5(0L, 1.0f, bVar.getPaint().getFontMetricsInt()) {
                    @Override
                    public void draw(Canvas canvas, CharSequence charSequence, int i15, int i16, float f7, int i17, int i18, int i19, Paint paint) {
                        super.draw(canvas, charSequence, i15, i16, f7, i17, i18, i19, paint);
                        v20 v20Var3 = v20Var;
                        float paddingLeft = ((((this.measuredSize / 2.0f) + (bVar.getPaddingLeft() + f7)) / v20Var3.f18468q) * v20Var3.f18458f) + v20Var.f18457c;
                        float f10 = v20Var3.d;
                        v20 v20Var4 = v20Var;
                        float f11 = v20Var4.f18459g;
                        float paddingTop = (((((i19 - i17) / 2.0f) + (bVar.getPaddingTop() + i17)) / v20Var4.f18469r) * f11) + f10;
                        if (v20Var4.e != 0.0f) {
                            float f12 = (v20Var4.f18458f / 2.0f) + v20Var4.f18457c;
                            float f13 = (f11 / 2.0f) + v20Var4.d;
                            float f14 = TextureRenderer.this.transformedWidth / TextureRenderer.this.transformedHeight;
                            double d10 = paddingLeft - f12;
                            double d11 = (paddingTop - f13) / f14;
                            paddingLeft = ((float) ((Math.cos(-v20Var.e) * d10) - (Math.sin(-v20Var.e) * d11))) + f12;
                            paddingTop = (((float) i0.a.c(-v20Var.e, d11, Math.sin(-v20Var.e) * d10)) * f14) + f13;
                        }
                        v20 v20Var5 = u20Var.f18225b;
                        int i20 = this.measuredSize;
                        v20 v20Var6 = v20Var;
                        float f15 = (i20 / v20Var6.f18468q) * v20Var6.f18458f;
                        v20Var5.f18458f = f15;
                        float f16 = (i20 / v20Var6.f18469r) * v20Var6.f18459g;
                        v20Var5.f18459g = f16;
                        v20Var5.f18457c = paddingLeft - (f15 / 2.0f);
                        v20Var5.d = paddingTop - (f16 / 2.0f);
                        v20Var5.e = v20Var6.e;
                        if (v20Var5.G == null) {
                            TextureRenderer.this.initStickerEntity(v20Var5);
                        }
                    }
                };
                int i15 = u20Var.offset;
                spannableString.setSpan(o5Var, i15, u20Var.length + i15, 33);
            }
            i13 = i14;
        }
        bVar.setText(k6.m(spannableString, bVar.getPaint().getFontMetricsInt(), false, null, 0));
        bVar.setTextColor(v20Var.f18463l);
        Editable text = bVar.getText();
        if (text != null) {
            for (h6 h6Var : (h6[]) text.getSpans(0, text.length(), h6.class)) {
                h6Var.f15839b = 0.85f;
            }
        }
        int i16 = v20Var.f18467p;
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
        int i17 = v20Var.f18467p;
        if (i17 != 1) {
            if (i17 == 2 ? !cd.X : cd.X) {
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
        setBreakStrategy(bVar);
        byte b10 = v20Var.f18456b;
        int i18 = -1;
        if (b10 == 0) {
            bVar.setFrameColor(v20Var.f18463l);
            if (i0.B(v20Var.f18463l) >= 0.721f) {
                i18 = -16777216;
            }
            bVar.setTextColor(i18);
        } else if (b10 == 1) {
            if (i0.B(v20Var.f18463l) >= 0.25f) {
                i12 = -1728053248;
            } else {
                i12 = -1711276033;
            }
            bVar.setFrameColor(i12);
            bVar.setTextColor(v20Var.f18463l);
        } else if (b10 == 2) {
            if (i0.B(v20Var.f18463l) >= 0.25f) {
                i18 = -16777216;
            }
            bVar.setFrameColor(i18);
            bVar.setTextColor(v20Var.f18463l);
        } else if (b10 == 3) {
            bVar.setFrameColor(0);
            bVar.setTextColor(v20Var.f18463l);
        }
        bVar.measure(View.MeasureSpec.makeMeasureSpec(v20Var.f18468q, 1073741824), View.MeasureSpec.makeMeasureSpec(v20Var.f18469r, 1073741824));
        bVar.layout(0, 0, v20Var.f18468q, v20Var.f18469r);
        v20Var.G = Bitmap.createBitmap(v20Var.f18468q, v20Var.f18469r, Bitmap.Config.ARGB_8888);
        bVar.draw(new Canvas(v20Var.G));
    }

    private boolean isCollage() {
        if (this.collageParts != null) {
            return true;
        }
        return false;
    }

    private void stepCollagePart(int i10, w20 w20Var, long j10) {
        boolean z10;
        float f7;
        Bitmap r10;
        long j11;
        long j12 = (j10 / 1000000) - w20Var.f19048f;
        float f10 = w20Var.f19051k;
        long j13 = w20Var.f19054o;
        long k10 = Utilities.k(j12, f10 * ((float) j13), w20Var.f19050j * ((float) j13));
        MediaCodecPlayer mediaCodecPlayer = w20Var.B;
        if (mediaCodecPlayer != null) {
            mediaCodecPlayer.ensure(k10);
            w20Var.f19059z.updateTexImage();
            return;
        }
        s5 s5Var = w20Var.f19058u;
        if (s5Var != null) {
            int i11 = s5Var.d[3];
            if (i11 <= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if ((k10 < i11 || (z10 && k10 > 1000)) && s5Var.f30131d0 != null) {
                s5Var.f30131d0.g(k10, true);
            }
            do {
                s5 s5Var2 = w20Var.f19058u;
                int i12 = s5Var2.d[3];
                f7 = (float) k10;
                if ((w20Var.v * 2.0f) + i12 >= f7) {
                    break;
                }
                j11 = i12;
                if (s5Var2.f30131d0 != null) {
                    s5Var2.f30131d0.c(null, false, s5Var2.f30135g0, s5Var2.f30136h0, false);
                }
            } while (w20Var.f19058u.d[3] != j11);
            if ((z10 || f7 > w20Var.f19058u.d[3] - (w20Var.v / 2.0f)) && (r10 = w20Var.f19058u.r(false)) != null) {
                GLES20.glBindTexture(3553, this.collageTextures[i10]);
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
        int i10 = this.NUM_EXTERNAL_SHADER;
        if (i10 >= 0 && i10 < this.mProgram.length && (createProgram2 = createProgram(str3, str, z10)) != 0) {
            GLES20.glDeleteProgram(this.mProgram[this.NUM_EXTERNAL_SHADER]);
            this.mProgram[this.NUM_EXTERNAL_SHADER] = createProgram2;
            this.texSizeHandle = GLES20.glGetUniformLocation(createProgram2, "texSize");
        }
        int i11 = this.NUM_FILTER_SHADER;
        if (i11 >= 0 && i11 < this.mProgram.length && (createProgram = createProgram(str3, str2, z10)) != 0) {
            GLES20.glDeleteProgram(this.mProgram[this.NUM_FILTER_SHADER]);
            this.mProgram[this.NUM_FILTER_SHADER] = createProgram;
        }
    }

    public void drawFrame(SurfaceTexture surfaceTexture, long j10) {
        int i10;
        int i11;
        int i12;
        float[] fArr;
        int i13;
        int i14;
        int i15;
        int i16;
        FloatBuffer floatBuffer;
        boolean z10;
        int i17;
        int i18;
        int i19;
        int[] iArr;
        if (this.isPhoto) {
            drawBackground();
            i12 = 3042;
            i15 = 0;
            i10 = 33985;
            i16 = 33984;
        } else {
            surfaceTexture.getTransformMatrix(this.mSTMatrix);
            if (v2.f18448a && this.firstFrame) {
                StringBuilder sb2 = new StringBuilder();
                int i20 = 0;
                while (true) {
                    float[] fArr2 = this.mSTMatrix;
                    i10 = 33985;
                    if (i20 >= fArr2.length) {
                        break;
                    }
                    sb2.append(fArr2[i20]);
                    sb2.append(", ");
                    i20++;
                }
                f8.b("stMatrix = " + ((Object) sb2));
                this.firstFrame = false;
            } else {
                i10 = 33985;
            }
            if (this.blendEnabled) {
                GLES20.glDisable(3042);
                this.blendEnabled = false;
            }
            jz jzVar = this.filterShaders;
            if (jzVar != null) {
                jzVar.P0 = this.mSTMatrix;
                jzVar.W0 = false;
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
                i12 = 3042;
                fArr = this.mSTMatrixIdentity;
                i13 = i22;
                i14 = g10;
                i15 = b10;
                i11 = 3553;
            } else {
                int i23 = this.mTextureID;
                int i24 = this.NUM_EXTERNAL_SHADER;
                i11 = 36197;
                i12 = 3042;
                fArr = this.mSTMatrix;
                i13 = i24;
                i14 = i23;
                i15 = 0;
            }
            drawBackground();
            i16 = 33984;
            GLES20.glUseProgram(this.mProgram[i13]);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(i11, i14);
            if (this.messageVideoMaskPath != null && this.videoMaskTexture != -1) {
                GLES20.glActiveTexture(i10);
                GLES20.glBindTexture(3553, this.videoMaskTexture);
                GLES20.glUniform1i(this.maskTextureHandle[i13], 1);
            }
            GLES20.glVertexAttribPointer(this.maPositionHandle[i13], 2, 5126, false, 8, (Buffer) this.verticesBuffer);
            GLES20.glEnableVertexAttribArray(this.maPositionHandle[i13]);
            int i25 = this.maTextureHandle[i13];
            if (this.useMatrixForImagePath) {
                floatBuffer = this.croppedTextureBuffer;
            } else {
                floatBuffer = this.renderTextureBuffer;
            }
            GLES20.glVertexAttribPointer(i25, 2, 5126, false, 8, (Buffer) floatBuffer);
            GLES20.glEnableVertexAttribArray(this.maTextureHandle[i13]);
            if (this.messageVideoMaskPath != null && this.videoMaskTexture != -1) {
                GLES20.glVertexAttribPointer(this.mmTextureHandle[i13], 2, 5126, false, 8, (Buffer) this.maskTextureBuffer);
                GLES20.glEnableVertexAttribArray(this.mmTextureHandle[i13]);
            }
            int i26 = this.texSizeHandle;
            if (i26 != 0) {
                GLES20.glUniform2f(i26, this.transformedWidth, this.transformedHeight);
            }
            GLES20.glUniformMatrix4fv(this.muSTMatrixHandle[i13], 1, false, fArr, 0);
            GLES20.glUniformMatrix4fv(this.muMVPMatrixHandle[i13], 1, false, this.mMVPMatrix, 0);
            GLES20.glDrawArrays(5, 0, 4);
        }
        if (this.blur != null) {
            if (!this.blendEnabled) {
                GLES20.glEnable(i12);
                GLES20.glBlendFunc(1, 771);
                this.blendEnabled = true;
            }
            if (this.imagePath != null && (iArr = this.paintTexture) != null) {
                i17 = iArr[0];
                i18 = this.imageWidth;
                i19 = this.imageHeight;
            } else {
                jz jzVar2 = this.filterShaders;
                if (jzVar2 != null) {
                    i17 = jzVar2.g(i15 ^ 1);
                    jz jzVar3 = this.filterShaders;
                    int i27 = jzVar3.X0;
                    i19 = jzVar3.Y0;
                    i18 = i27;
                } else {
                    i17 = -1;
                    i18 = 1;
                    i19 = 1;
                }
            }
            if (i17 != -1) {
                this.blur.a(i17, i18, i19, null);
                GLES20.glViewport(0, 0, this.transformedWidth, this.transformedHeight);
                GLES20.glBindFramebuffer(36160, 0);
                GLES20.glUseProgram(this.blurShaderProgram);
                GLES20.glEnableVertexAttribArray(this.blurInputTexCoordHandle);
                GLES20.glVertexAttribPointer(this.blurInputTexCoordHandle, 2, 5126, false, 8, (Buffer) this.gradientTextureBuffer);
                GLES20.glEnableVertexAttribArray(this.blurPositionHandle);
                GLES20.glVertexAttribPointer(this.blurPositionHandle, 2, 5126, false, 8, (Buffer) this.blurVerticesBuffer);
                GLES20.glUniform1i(this.blurBlurImageHandle, 0);
                GLES20.glActiveTexture(i16);
                GLES20.glBindTexture(3553, this.blur.f32444s[2]);
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
                z10 = true;
            } else {
                z10 = false;
            }
            drawTexture(true, i29, -10000.0f, -10000.0f, -10000.0f, -10000.0f, 0.0f, false, z10, -1);
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
                drawEntity(this.mediaEntities.get(i32), this.mediaEntities.get(i32).f18463l, j10);
            }
        }
        GLES20.glFinish();
    }

    public int getTextureId() {
        return this.mTextureID;
    }

    public void release() {
        ArrayList<v20> arrayList = this.mediaEntities;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                v20 v20Var = this.mediaEntities.get(i10);
                RLottieNative rLottieNative = v20Var.D;
                if (rLottieNative != null) {
                    rLottieNative.d();
                }
                s5 s5Var = v20Var.J;
                if (s5Var != null) {
                    s5Var.u();
                }
                View view = v20Var.I;
                if (view instanceof qt) {
                    qt qtVar = (qt) view;
                    o5.release(qtVar, qtVar.E);
                }
                Bitmap bitmap = v20Var.G;
                if (bitmap != null) {
                    bitmap.recycle();
                    v20Var.G = null;
                }
            }
        }
        ArrayList<w20> arrayList2 = this.collageParts;
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

    public void setBreakStrategy(jg.b bVar) {
        bVar.setBreakStrategy(0);
    }

    public void surfaceCreated() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.video.TextureRenderer.surfaceCreated():void");
    }

    private void drawTexture(boolean z10, int i10, float f7, float f10, float f11, float f12, float f13, boolean z11) {
        drawTexture(z10, i10, f7, f10, f11, f12, f13, z11, false, -1);
    }

    private void drawTexture(boolean z10, int i10, float f7, float f10, float f11, float f12, float f13, boolean z11, boolean z12, int i11) {
        if (!this.blendEnabled) {
            GLES20.glEnable(3042);
            GLES20.glBlendFunc(1, 771);
            this.blendEnabled = true;
        }
        if (f7 <= -10000.0f) {
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
            float f14 = (f7 * 2.0f) - 1.0f;
            float f15 = ((1.0f - f10) * 2.0f) - 1.0f;
            float[] fArr2 = this.bitmapData;
            fArr2[0] = f14;
            fArr2[1] = f15;
            float f16 = (f11 * 2.0f) + f14;
            fArr2[2] = f16;
            fArr2[3] = f15;
            fArr2[4] = f14;
            float f17 = f15 - (f12 * 2.0f);
            fArr2[5] = f17;
            fArr2[6] = f16;
            fArr2[7] = f17;
        }
        float[] fArr3 = this.bitmapData;
        float f18 = fArr3[0];
        float f19 = fArr3[2];
        float f20 = (f18 + f19) / 2.0f;
        if (z11) {
            fArr3[2] = f18;
            fArr3[0] = f19;
            float f21 = fArr3[6];
            fArr3[6] = fArr3[4];
            fArr3[4] = f21;
        }
        if (f13 != 0.0f) {
            float f22 = this.transformedWidth / this.transformedHeight;
            float f23 = (fArr3[5] + fArr3[1]) / 2.0f;
            int i12 = 0;
            for (int i13 = 4; i12 < i13; i13 = 4) {
                float[] fArr4 = this.bitmapData;
                int i14 = i12 * 2;
                int i15 = i14 + 1;
                double d = fArr4[i14] - f20;
                double d10 = f13;
                float f24 = f20;
                double d11 = (fArr4[i15] - f23) / f22;
                fArr4[i14] = ((float) ((Math.cos(d10) * d) - (Math.sin(d10) * d11))) + f24;
                this.bitmapData[i15] = (((float) i0.a.c(d10, d11, Math.sin(d10) * d)) * f22) + f23;
                i12++;
                f20 = f24;
            }
        }
        this.bitmapVerticesBuffer.put(this.bitmapData).position(0);
        GLES20.glVertexAttribPointer(this.simplePositionHandle, 2, 5126, false, 8, (Buffer) (z12 ? this.verticesBuffer : this.bitmapVerticesBuffer));
        GLES20.glEnableVertexAttribArray(this.simpleInputTexCoordHandle);
        GLES20.glVertexAttribPointer(this.simpleInputTexCoordHandle, 2, 5126, false, 8, (Buffer) (z12 ? this.croppedTextureBuffer : this.textureBuffer));
        if (z10) {
            GLES20.glBindTexture(3553, i10);
        }
        GLES20.glDrawArrays(5, 0, 4);
    }
}

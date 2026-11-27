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
    private yl0 blur;
    private int blurBlurImageHandle;
    private int blurInputTexCoordHandle;
    private int blurMaskImageHandle;
    private String blurPath;
    private int blurPositionHandle;
    private int blurShaderProgram;
    private int[] blurTexture;
    private FloatBuffer blurVerticesBuffer;
    private ArrayList<nec> collageParts;
    private int[] collageTextures;
    private final fo6 cropState;
    private FloatBuffer croppedTextureBuffer;
    private ArrayList<wl> emojiDrawables;
    private uf4 filterShaders;
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
    private ArrayList<mec> mediaEntities;
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

    public TextureRenderer(defpackage.po6 r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, java.util.ArrayList<defpackage.mec> r35, defpackage.fo6 r36, int r37, int r38, int r39, int r40, int r41, float r42, boolean r43, java.lang.Integer r44, java.lang.Integer r45, defpackage.b8b r46, org.telegram.messenger.video.MediaCodecVideoConvertor.ConvertVideoParams r47) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.video.TextureRenderer.<init>(po6, java.lang.String, java.lang.String, java.lang.String, java.util.ArrayList, fo6, int, int, int, int, int, float, boolean, java.lang.Integer, java.lang.Integer, b8b, org.telegram.messenger.video.MediaCodecVideoConvertor$ConvertVideoParams):void");
    }

    private void applyRoundRadius(mec mecVar, Bitmap bitmap, int i) {
        if (bitmap != null && mecVar != null) {
            if (mecVar.s != 0.0f || i != 0) {
                if (mecVar.M == null) {
                    mecVar.M = new Canvas(bitmap);
                }
                if (mecVar.s != 0.0f) {
                    if (this.path == null) {
                        this.path = new Path();
                    }
                    if (this.xRefPaint == null) {
                        Paint paint = new Paint(1);
                        this.xRefPaint = paint;
                        paint.setColor(-16777216);
                        this.xRefPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                    }
                    float min = Math.min(bitmap.getWidth(), bitmap.getHeight()) * mecVar.s;
                    this.path.rewind();
                    this.path.addRoundRect(new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight()), min, min, Path.Direction.CCW);
                    this.path.toggleInverseFillType();
                    mecVar.M.drawPath(this.path, this.xRefPaint);
                }
                if (i != 0) {
                    if (this.textColorPaint == null) {
                        Paint paint2 = new Paint(1);
                        this.textColorPaint = paint2;
                        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
                    }
                    this.textColorPaint.setColor(i);
                    mecVar.M.drawRect(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight(), this.textColorPaint);
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
            int h3 = uf4.h(35633, str);
            if (h3 == 0 || (h2 = uf4.h(35632, str2)) == 0 || (glCreateProgram2 = GLES20.glCreateProgram()) == 0) {
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
        int h4 = uf4.h(35633, str);
        if (h4 == 0 || (h = uf4.h(35632, str2)) == 0 || (glCreateProgram = GLES20.glCreateProgram()) == 0) {
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

    private void destroyCollagePart(int i, nec necVar) {
        if (necVar != null) {
            lm lmVar = necVar.u;
            if (lmVar != null) {
                lmVar.u();
                necVar.u = null;
            }
            MediaCodecPlayer mediaCodecPlayer = necVar.B;
            if (mediaCodecPlayer != null) {
                mediaCodecPlayer.release();
                necVar.B = null;
            }
            SurfaceTexture surfaceTexture = necVar.z;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                necVar.z = null;
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

    private void drawCollagePart(int i, nec necVar, long j) {
        if (necVar.B != null && necVar.b) {
            GLES20.glUseProgram(this.simpleShaderProgramOES);
            GLES20.glActiveTexture(33987);
            GLES20.glBindTexture(36197, this.collageTextures[i]);
            GLES20.glUniform1i(this.simpleSourceImageHandleOES, 3);
            GLES20.glEnableVertexAttribArray(this.simpleInputTexCoordHandleOES);
            GLES20.glVertexAttribPointer(this.simpleInputTexCoordHandleOES, 2, 5126, false, 8, (Buffer) necVar.t);
            GLES20.glEnableVertexAttribArray(this.simplePositionHandleOES);
            GLES20.glVertexAttribPointer(this.simplePositionHandleOES, 2, 5126, false, 8, (Buffer) necVar.s);
        } else {
            GLES20.glUseProgram(this.simpleShaderProgram);
            GLES20.glActiveTexture(33986);
            GLES20.glBindTexture(3553, this.collageTextures[i]);
            GLES20.glUniform1i(this.simpleSourceImageHandle, 2);
            GLES20.glEnableVertexAttribArray(this.simpleInputTexCoordHandle);
            GLES20.glVertexAttribPointer(this.simpleInputTexCoordHandle, 2, 5126, false, 8, (Buffer) necVar.t);
            GLES20.glEnableVertexAttribArray(this.simplePositionHandle);
            GLES20.glVertexAttribPointer(this.simplePositionHandle, 2, 5126, false, 8, (Buffer) necVar.s);
        }
        GLES20.glDrawArrays(5, 0, 4);
    }

    private void drawEntity(mec mecVar, int i, long j) {
        mec mecVar2;
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
        if (mecVar.a == 11) {
            long j4 = j / 1000000;
            if (j4 >= mecVar.V && j4 < mecVar.W) {
                if (mecVar.G == null) {
                    try {
                        initTextEntity(mecVar);
                    } catch (Throwable th) {
                        cc4.g(th, true);
                        return;
                    }
                }
                if (mecVar.X != null) {
                    View view = mecVar.I;
                    if ((view instanceof ju3) && mecVar.J != null && mecVar.G != null) {
                        ju3 ju3Var = (ju3) view;
                        if (ju3Var.A(j4)) {
                            mecVar.G.eraseColor(0);
                            ju3Var.draw(mecVar.J);
                        }
                    }
                }
            } else {
                Bitmap bitmap3 = mecVar.G;
                if (bitmap3 != null && j4 >= mecVar.W) {
                    bitmap3.recycle();
                    mecVar.G = null;
                    return;
                }
                return;
            }
        }
        RLottieNative rLottieNative = mecVar.D;
        if (rLottieNative != null) {
            Bitmap bitmap4 = mecVar.G;
            if (bitmap4 != null && mecVar.Y > 0 && mecVar.Z > 0) {
                rLottieNative.c((int) mecVar.E, bitmap4, true);
                Bitmap bitmap5 = mecVar.G;
                if ((mecVar.b & 8) != 0) {
                    i3 = i;
                } else {
                    i3 = 0;
                }
                applyRoundRadius(mecVar, bitmap5, i3);
                GLES20.glBindTexture(3553, this.stickerTexture[0]);
                GLUtils.texImage2D(3553, 0, mecVar.G, 0);
                float f2 = mecVar.E + mecVar.F;
                mecVar.E = f2;
                if (f2 >= mecVar.D.a[0]) {
                    mecVar.E = 0.0f;
                }
                int i4 = this.stickerTexture[0];
                float f3 = mecVar.c;
                float f4 = mecVar.d;
                float f5 = mecVar.f;
                float f6 = mecVar.g;
                float f7 = mecVar.e;
                if ((mecVar.b & 2) != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                drawTexture(false, i4, f3, f4, f5, f6, f7, z3);
            }
        } else if (mecVar.K != null) {
            float f8 = mecVar.E;
            int i5 = (int) f8;
            float f9 = 1.0f;
            if (mecVar.a == 5) {
                if (this.isPhoto) {
                    j3 = mecVar.U;
                    j2 = 0;
                } else {
                    j2 = mecVar.R;
                    j3 = (mecVar.T - mecVar.S) + j2;
                }
                long j5 = j / 1000000;
                if (j5 < j2) {
                    f9 = k43.h.getInterpolation(Utilities.i(1.0f - (((float) (j2 - j5)) / 400.0f), 1.0f, 0.0f));
                } else if (j5 > j3) {
                    f9 = k43.h.getInterpolation(Utilities.i(1.0f - (((float) (j5 - j3)) / 400.0f), 1.0f, 0.0f));
                }
                if (f9 > 0.0f) {
                    if (this.isPhoto) {
                        k = Utilities.k(j5, mecVar.U, 0L);
                    } else {
                        k = Utilities.k((j5 - mecVar.R) + mecVar.S, mecVar.U, 0L);
                    }
                    while (!mecVar.L) {
                        int[] iArr = mecVar.K.d;
                        f = 2.0f;
                        if (iArr[3] >= Math.min(k, iArr[4])) {
                            break;
                        }
                        lm lmVar = mecVar.K;
                        int i6 = lmVar.d[3];
                        lmVar.r(false);
                        int i7 = mecVar.K.d[3];
                        if (i7 <= i6 && (i7 != 0 || i6 != 0)) {
                            mecVar.L = true;
                            break;
                        }
                    }
                }
                f = 2.0f;
            } else {
                f = 2.0f;
                float f10 = f8 + mecVar.F;
                mecVar.E = f10;
                for (int i8 = (int) f10; i5 != i8; i8--) {
                    mecVar.K.r(true);
                }
            }
            im imVar = mecVar.K.w;
            if (imVar != null) {
                bitmap = imVar.b;
            } else {
                bitmap = null;
            }
            if (bitmap != null) {
                if (mecVar.a == 5) {
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
                        if ((mecVar.b & 8) != 0) {
                            i2 = i;
                        } else {
                            i2 = 0;
                        }
                        applyRoundRadius(mecVar, bitmap8, i2);
                    }
                    bitmap2 = this.stickerBitmap;
                }
                if (bitmap2 != null) {
                    GLES20.glBindTexture(3553, this.stickerTexture[0]);
                    GLUtils.texImage2D(3553, 0, bitmap2, 0);
                    int i9 = this.stickerTexture[0];
                    float f11 = mecVar.c;
                    float f12 = mecVar.d;
                    float f13 = mecVar.f;
                    float f14 = mecVar.g;
                    float f15 = mecVar.e;
                    if ((mecVar.b & 2) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    drawTexture(false, i9, f11, f12, f13, f14, f15, z2);
                }
            }
        } else {
            if (mecVar.G != null) {
                GLES20.glBindTexture(3553, this.stickerTexture[0]);
                GLUtils.texImage2D(3553, 0, mecVar.G, 0);
                int i10 = this.stickerTexture[0];
                float f16 = mecVar.c;
                float f17 = mecVar.h;
                float f18 = f16 - (f17 / 2.0f);
                float f19 = mecVar.d;
                float f20 = mecVar.i;
                float f21 = f19 - (f20 / 2.0f);
                float f22 = mecVar.f + f17;
                float f23 = f20 + mecVar.g;
                float f24 = mecVar.e;
                if (mecVar.a == 2 && (mecVar.b & 2) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                drawTexture(false, i10, f18, f21, f22, f23, f24, z);
            }
            ArrayList arrayList = mecVar.k;
            if (arrayList != null && !arrayList.isEmpty()) {
                for (int i11 = 0; i11 < mecVar.k.size(); i11++) {
                    lec lecVar = (lec) mecVar.k.get(i11);
                    if (lecVar != null && (mecVar2 = lecVar.b) != null) {
                        drawEntity(mecVar2, mecVar.l, j);
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
                this.bitmapData[i7] = (((float) ik8.d(d2, d3, d * Math.sin(d2))) * f14) + f15;
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

    private void initCollagePart(int i, nec necVar) {
        float f;
        al2 al2Var;
        MediaCodecPlayer mediaCodecPlayer;
        AtomicInteger atomicInteger = new AtomicInteger(necVar.l);
        AtomicInteger atomicInteger2 = new AtomicInteger(necVar.m);
        AtomicInteger atomicInteger3 = new AtomicInteger(0);
        boolean z = necVar.b;
        int[] iArr = this.collageTextures;
        if (z) {
            GLES20.glBindTexture(36197, iArr[i]);
            GLES20.glTexParameteri(36197, 10241, 9728);
            GLES20.glTexParameteri(36197, 10240, 9728);
            GLES20.glTexParameteri(36197, 10242, 33071);
            GLES20.glTexParameteri(36197, 10243, 33071);
            SurfaceTexture surfaceTexture = new SurfaceTexture(this.collageTextures[i]);
            necVar.z = surfaceTexture;
            surfaceTexture.setDefaultBufferSize(necVar.l, necVar.m);
            try {
                mediaCodecPlayer = new MediaCodecPlayer(necVar.d, new Surface(necVar.z));
                necVar.B = mediaCodecPlayer;
            } catch (Exception e) {
                cc4.g(e, true);
                necVar.B = null;
                mediaCodecPlayer = null;
            }
            if (mediaCodecPlayer != null) {
                atomicInteger.set(mediaCodecPlayer.getOrientedWidth());
                atomicInteger2.set(necVar.B.getOrientedHeight());
                atomicInteger3.set(necVar.B.getOrientation());
            } else {
                necVar.z.release();
                necVar.z = null;
                GLES20.glDeleteTextures(1, this.collageTextures, i);
                GLES20.glGenTextures(1, this.collageTextures, i);
                GLES20.glBindTexture(3553, this.collageTextures[i]);
                GLES20.glTexParameteri(3553, 10241, 9729);
                GLES20.glTexParameteri(3553, 10240, 9729);
                GLES20.glTexParameteri(3553, 10242, 33071);
                GLES20.glTexParameteri(3553, 10243, 33071);
                lm lmVar = new lm(new File(necVar.d), true, 0L, 0, null, null, null, 0L, yac.t0, true, 512, 512, null, 0, true);
                necVar.u = lmVar;
                if (lmVar.y && lmVar.f0) {
                    xi4.l("Failed to decode with ffmpeg software codecs");
                    return;
                }
                necVar.v = 1000.0f / lmVar.d[5];
                Bitmap r = lmVar.r(false);
                if (r != null) {
                    GLUtils.texImage2D(3553, 0, r, 0);
                }
                atomicInteger.set(necVar.u.getIntrinsicWidth());
                atomicInteger2.set(necVar.u.getIntrinsicHeight());
                atomicInteger3.set(necVar.u.d[2]);
            }
        } else {
            GLES20.glBindTexture(3553, iArr[i]);
            GLES20.glTexParameteri(3553, 10241, 9729);
            GLES20.glTexParameteri(3553, 10240, 9729);
            GLES20.glTexParameteri(3553, 10242, 33071);
            GLES20.glTexParameteri(3553, 10243, 33071);
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inMutable = true;
            Bitmap decodeFile = BitmapFactory.decodeFile(necVar.d, options);
            Pair N0 = hl.N0(necVar.d);
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
        float a = necVar.r.a(2.0f) - 1.0f;
        zk2 zk2Var = necVar.r;
        zk2 zk2Var2 = necVar.r;
        zk2 zk2Var3 = necVar.r;
        zk2 zk2Var4 = necVar.r;
        int i2 = zk2Var4.a.c;
        int i3 = zk2Var4.c;
        float[] fArr = {a, -(((2.0f / zk2Var.a.c) * zk2Var.c) - 1.0f), zk2Var.b(2.0f) - 1.0f, -(((2.0f / zk2Var2.a.c) * zk2Var2.c) - 1.0f), zk2Var2.a(2.0f) - 1.0f, -(((2.0f / zk2Var3.a.c) * (zk2Var3.c + 1)) - 1.0f), zk2Var3.b(2.0f) - 1.0f, -(((2.0f / i2) * (i3 + 1)) - 1.0f)};
        float f3 = this.transformedWidth / al2Var.d[i3];
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
        necVar.s = floats(fArr);
        necVar.t = floats(fArr2);
    }

    private void initLinkEntity(mec mecVar) {
        h66 h66Var = new h66(org.telegram.messenger.a.b, mecVar.Q);
        h66Var.V = true;
        h66Var.b(yac.t0, mecVar.a0, false);
        boolean e = h66Var.e();
        byte b = mecVar.b;
        if (e) {
            h66Var.setPreviewType(b);
        } else {
            h66Var.c(b, mecVar.l);
        }
        int i = mecVar.q;
        int i2 = h66Var.f;
        h66Var.setMaxWidth(i + i2 + i2);
        h66Var.measure(View.MeasureSpec.makeMeasureSpec(mecVar.q, 1073741824), View.MeasureSpec.makeMeasureSpec(mecVar.r, 1073741824));
        h66Var.layout(0, 0, mecVar.q, mecVar.r);
        float f = mecVar.f * this.transformedWidth;
        int i3 = mecVar.q;
        float f2 = f / i3;
        mecVar.G = Bitmap.createBitmap(((int) (i3 * f2)) + 16, ((int) (mecVar.r * f2)) + 16, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(mecVar.G);
        canvas.translate(8.0f, 8.0f);
        canvas.scale(f2, f2);
        h66Var.draw(canvas);
        float f3 = 16.0f * f2;
        mecVar.h = f3 / this.transformedWidth;
        mecVar.i = f3 / this.transformedHeight;
    }

    private void initLocationEntity(mec mecVar) {
        float f;
        float f2;
        byte b = mecVar.a;
        ld6 ld6Var = new ld6(org.telegram.messenger.a.b, mecVar.Q);
        ld6Var.setIsVideo(true);
        ld6Var.setText(mecVar.j);
        ld6Var.e(mecVar.b, mecVar.l);
        if (mecVar.P != null && mecVar.k.isEmpty()) {
            ld6Var.d(yac.t0, mecVar.P.c);
        }
        ld6Var.setMaxWidth(mecVar.q);
        if (mecVar.k.size() == 1) {
            ld6Var.y = true;
            ld6Var.c = true;
            ld6Var.requestLayout();
        }
        ld6Var.measure(View.MeasureSpec.makeMeasureSpec(mecVar.q, 1073741824), View.MeasureSpec.makeMeasureSpec(mecVar.r, 1073741824));
        ld6Var.layout(0, 0, mecVar.q, mecVar.r);
        float f3 = mecVar.f * this.transformedWidth;
        float f4 = mecVar.q;
        float f5 = f3 / f4;
        mecVar.G = Bitmap.createBitmap(((int) (f4 * f5)) + 16, ((int) (mecVar.r * f5)) + 16, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(mecVar.G);
        canvas.translate(8.0f, 8.0f);
        canvas.scale(f5, f5);
        ld6Var.draw(canvas);
        float f6 = 16.0f * f5;
        mecVar.h = f6 / this.transformedWidth;
        mecVar.i = f6 / this.transformedHeight;
        if (mecVar.k.size() == 1) {
            lec lecVar = (lec) mecVar.k.get(0);
            mec mecVar2 = new mec();
            lecVar.b = mecVar2;
            mecVar2.j = lecVar.a;
            mecVar2.b = lecVar.c;
            RectF rectF = new RectF();
            float f7 = ld6Var.J;
            float f8 = ld6Var.d.left + 2.25f;
            float f9 = ld6Var.E;
            float f10 = ld6Var.K;
            float f11 = ld6Var.O;
            float f12 = f9 * 21.33f;
            rectF.set((f8 * f9) + f7, bp1.z(f11, f12, 2.0f, f10), uh9.v(f8, 21.33f, f9, f7), qd4.e(f12, f11, 2.0f, f10));
            float centerX = ((rectF.centerX() / mecVar.q) * mecVar.f) + mecVar.c;
            float f13 = mecVar.d;
            float centerY = rectF.centerY() / mecVar.r;
            float f14 = mecVar.g;
            float f15 = (centerY * f14) + f13;
            if (mecVar.e != 0.0f) {
                float f16 = (mecVar.f / 2.0f) + mecVar.c;
                float f17 = (f14 / 2.0f) + mecVar.d;
                float f18 = this.transformedWidth / this.transformedHeight;
                double d = centerX - f16;
                double d2 = (f15 - f17) / f18;
                f2 = 2.0f;
                float cos = ((float) ((Math.cos(-f) * d) - (Math.sin(-mecVar.e) * d2))) + f16;
                f15 = (((float) ik8.d(-mecVar.e, d2, Math.sin(-mecVar.e) * d)) * f18) + f17;
                centerX = cos;
            } else {
                f2 = 2.0f;
            }
            lecVar.b.f = (rectF.width() / mecVar.q) * mecVar.f;
            lecVar.b.g = (rectF.height() / mecVar.r) * mecVar.g;
            mec mecVar3 = lecVar.b;
            float f19 = mecVar3.f * 1.2f;
            mecVar3.f = f19;
            float f20 = mecVar3.g * 1.2f;
            mecVar3.g = f20;
            mecVar3.c = centerX - (f19 / f2);
            mecVar3.d = f15 - (f20 / f2);
            mecVar3.e = mecVar.e;
            initStickerEntity(mecVar3);
        }
    }

    public void initStickerEntity(mec mecVar) {
        fo6 fo6Var;
        fo6 fo6Var2;
        int i = (int) (mecVar.f * this.transformedWidth);
        mecVar.Y = i;
        int i2 = (int) (mecVar.g * this.transformedHeight);
        mecVar.Z = i2;
        int i3 = 512;
        if (i > 512) {
            i2 = (int) ((i2 / i) * 512.0f);
            mecVar.Z = i2;
            mecVar.Y = 512;
            i = 512;
        }
        if (i2 > 512) {
            i = (int) ((i / i2) * 512.0f);
            mecVar.Y = i;
            mecVar.Z = 512;
        } else {
            i3 = i2;
        }
        byte b = mecVar.b;
        float f = 0.0f;
        if ((b & 1) != 0) {
            if (i > 0 && i3 > 0) {
                mecVar.G = Bitmap.createBitmap(i, i3, Bitmap.Config.ARGB_8888);
                RLottieNative a = RLottieNative.a(mecVar.j, null, null, null, 0, null);
                mecVar.D = a;
                if (a != null) {
                    f = a.a[1] / this.videoFps;
                }
                mecVar.F = f;
            }
        } else if ((b & 4) != 0) {
            mecVar.L = false;
            lm lmVar = new lm(new File(mecVar.j), true, 0L, 0, null, null, null, 0L, yac.t0, true, 512, 512, null, 0, true);
            mecVar.K = lmVar;
            mecVar.F = lmVar.d[5] / this.videoFps;
            mecVar.E = 1.0f;
            lmVar.r(true);
        } else {
            String str = mecVar.j;
            if (!TextUtils.isEmpty(mecVar.t) && (mecVar.b & 16) != 0) {
                str = mecVar.t;
            }
            BitmapFactory.Options options = new BitmapFactory.Options();
            if (mecVar.a == 2) {
                options.inMutable = true;
            }
            Bitmap decodeFile = BitmapFactory.decodeFile(str, options);
            mecVar.G = decodeFile;
            if (decodeFile != null && (fo6Var = mecVar.u) != null) {
                decodeFile = Bitmap.createBitmap((int) Math.max(1.0f, fo6Var.e * decodeFile.getWidth()), (int) Math.max(1.0f, mecVar.u.f * mecVar.G.getHeight()), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(decodeFile);
                canvas.translate(decodeFile.getWidth() / 2.0f, decodeFile.getHeight() / 2.0f);
                canvas.rotate(-mecVar.u.z);
                int width = mecVar.G.getWidth();
                int height = mecVar.G.getHeight();
                fo6 fo6Var3 = mecVar.u;
                if (((fo6Var3.z + fo6Var3.k) / 90) % 2 == 1) {
                    width = mecVar.G.getHeight();
                    height = mecVar.G.getWidth();
                }
                fo6 fo6Var4 = mecVar.u;
                float f2 = fo6Var4.e;
                float f3 = fo6Var4.f;
                float f4 = width;
                float f5 = height;
                canvas.clipRect(((-width) * f2) / 2.0f, ((-height) * f3) / 2.0f, (f2 * f4) / 2.0f, (f3 * f5) / 2.0f);
                float f6 = mecVar.u.c;
                canvas.scale(f6, f6);
                fo6 fo6Var5 = mecVar.u;
                canvas.translate(fo6Var5.a * f4, fo6Var5.b * f5);
                canvas.rotate(mecVar.u.d + fo6Var2.k);
                if (mecVar.u.l) {
                    canvas.scale(-1.0f, 1.0f);
                }
                canvas.rotate(mecVar.u.z);
                canvas.translate((-mecVar.G.getWidth()) / 2.0f, (-mecVar.G.getHeight()) / 2.0f);
                canvas.drawBitmap(mecVar.G, 0.0f, 0.0f, (Paint) null);
                mecVar.G.recycle();
                mecVar.G = decodeFile;
            }
            if (mecVar.a == 2 && decodeFile != null) {
                mecVar.s = hl.L(12.0f) / Math.min(mecVar.q, mecVar.r);
                Pair N0 = hl.N0(mecVar.j);
                mecVar.e = (float) (mecVar.e - Math.toRadians(((Integer) N0.first).intValue()));
                if ((((Integer) N0.first).intValue() / 90) % 2 == 1) {
                    float f7 = mecVar.c;
                    float f8 = mecVar.f;
                    float f9 = (f8 / 2.0f) + f7;
                    float f10 = mecVar.d;
                    float f11 = mecVar.g;
                    float f12 = (f11 / 2.0f) + f10;
                    float f13 = this.transformedWidth;
                    float f14 = this.transformedHeight;
                    float f15 = (f8 * f13) / f14;
                    float f16 = (f11 * f14) / f13;
                    mecVar.f = f16;
                    mecVar.g = f15;
                    mecVar.c = f9 - (f16 / 2.0f);
                    mecVar.d = f12 - (f15 / 2.0f);
                }
                applyRoundRadius(mecVar, mecVar.G, 0);
            } else if (decodeFile != null) {
                float width2 = decodeFile.getWidth() / mecVar.G.getHeight();
                if (width2 > 1.0f) {
                    float f17 = mecVar.g;
                    float f18 = f17 / width2;
                    mecVar.d = bp1.z(f17, f18, 2.0f, mecVar.d);
                    mecVar.g = f18;
                } else if (width2 < 1.0f) {
                    float f19 = mecVar.f;
                    float f20 = width2 * f19;
                    mecVar.c = bp1.z(f19, f20, 2.0f, mecVar.c);
                    mecVar.f = f20;
                }
            }
        }
    }

    private void initTextEntity(final mec mecVar) {
        int i;
        int i2;
        int i3;
        Typeface b;
        final ju3 ju3Var = new ju3(org.telegram.messenger.a.b);
        ju3Var.getPaint().setAntiAlias(true);
        ju3Var.H = false;
        ju3Var.setBackgroundColor(0);
        ju3Var.setPadding(hl.L(7.0f), hl.L(7.0f), hl.L(7.0f), hl.L(7.0f));
        xv7 xv7Var = mecVar.n;
        if (xv7Var != null && (b = xv7Var.b()) != null) {
            ju3Var.setTypeface(b);
        }
        ju3Var.setTextSize(0, mecVar.m);
        SpannableString spannableString = new SpannableString(mecVar.j);
        ArrayList arrayList = mecVar.k;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            int i5 = i4 + 1;
            final lec lecVar = (lec) arrayList.get(i4);
            if (lecVar.a != null) {
                mec mecVar2 = new mec();
                lecVar.b = mecVar2;
                mecVar2.j = lecVar.a;
                mecVar2.b = lecVar.c;
                hm hmVar = new hm(0L, 1.0f, ju3Var.getPaint().getFontMetricsInt()) {
                    @Override
                    public void draw(Canvas canvas, CharSequence charSequence, int i6, int i7, float f, int i8, int i9, int i10, Paint paint) {
                        super.draw(canvas, charSequence, i6, i7, f, i8, i9, i10, paint);
                        mec mecVar3 = mecVar;
                        float paddingLeft = ((((this.measuredSize / 2.0f) + (ju3Var.getPaddingLeft() + f)) / mecVar3.q) * mecVar3.f) + mecVar.c;
                        float f2 = mecVar3.d;
                        mec mecVar4 = mecVar;
                        float f3 = mecVar4.g;
                        float paddingTop = (((((i10 - i8) / 2.0f) + (ju3Var.getPaddingTop() + i8)) / mecVar4.r) * f3) + f2;
                        if (mecVar4.e != 0.0f) {
                            float f4 = (mecVar4.f / 2.0f) + mecVar4.c;
                            float f5 = (f3 / 2.0f) + mecVar4.d;
                            float f6 = TextureRenderer.this.transformedWidth / TextureRenderer.this.transformedHeight;
                            double d = paddingLeft - f4;
                            double d2 = (paddingTop - f5) / f6;
                            paddingLeft = ((float) ((Math.cos(-mecVar.e) * d) - (Math.sin(-mecVar.e) * d2))) + f4;
                            paddingTop = (((float) ik8.d(-mecVar.e, d2, Math.sin(-mecVar.e) * d)) * f6) + f5;
                        }
                        mec mecVar5 = lecVar.b;
                        float f7 = this.measuredSize;
                        mec mecVar6 = mecVar;
                        float f8 = (f7 / mecVar6.q) * mecVar6.f;
                        mecVar5.f = f8;
                        float f9 = (f7 / mecVar6.r) * mecVar6.g;
                        mecVar5.g = f9;
                        mecVar5.c = paddingLeft - (f8 / 2.0f);
                        mecVar5.d = paddingTop - (f9 / 2.0f);
                        mecVar5.e = mecVar6.e;
                        if (mecVar5.G == null) {
                            TextureRenderer.this.initStickerEntity(mecVar5);
                        }
                    }
                };
                int i6 = lecVar.offset;
                spannableString.setSpan(hmVar, i6, lecVar.length + i6, 33);
            }
            i4 = i5;
        }
        ju3Var.setText(pv3.m(spannableString, ju3Var.getPaint().getFontMetricsInt(), false, null, 0));
        ju3Var.setTextColor(mecVar.l);
        Editable text = ju3Var.getText();
        if (text != null) {
            for (mv3 mv3Var : (mv3[]) text.getSpans(0, text.length(), mv3.class)) {
                mv3Var.b = 0.85f;
            }
        }
        int i7 = mecVar.p;
        if (i7 != 1) {
            if (i7 != 2) {
                i = 19;
            } else {
                i = 21;
            }
        } else {
            i = 17;
        }
        ju3Var.setGravity(i);
        int i8 = mecVar.p;
        if (i8 != 1) {
            boolean z = ob6.a0;
            if (i8 == 2 ? z : !z) {
                i2 = 2;
            } else {
                i2 = 3;
            }
        } else {
            i2 = 4;
        }
        ju3Var.setTextAlignment(i2);
        ju3Var.setHorizontallyScrolling(false);
        ju3Var.setImeOptions(268435456);
        ju3Var.setFocusableInTouchMode(true);
        ju3Var.setInputType(ju3Var.getInputType() | 16384);
        setBreakStrategy(ju3Var);
        byte b2 = mecVar.b;
        int i9 = -1;
        if (b2 == 0) {
            ju3Var.setFrameColor(mecVar.l);
            if (hl.B(mecVar.l) >= 0.721f) {
                i9 = -16777216;
            }
            ju3Var.setTextColor(i9);
        } else if (b2 == 1) {
            if (hl.B(mecVar.l) >= 0.25f) {
                i3 = -1728053248;
            } else {
                i3 = -1711276033;
            }
            ju3Var.setFrameColor(i3);
            ju3Var.setTextColor(mecVar.l);
        } else if (b2 == 2) {
            if (hl.B(mecVar.l) >= 0.25f) {
                i9 = -16777216;
            }
            ju3Var.setFrameColor(i9);
            ju3Var.setTextColor(mecVar.l);
        } else if (b2 == 3) {
            ju3Var.setFrameColor(0);
            ju3Var.setTextColor(mecVar.l);
        }
        if (mecVar.a == 11) {
            ju3Var.setMaxLines(3);
            kc1.v(ju3Var, mecVar.b);
        }
        ju3Var.measure(View.MeasureSpec.makeMeasureSpec(mecVar.q, 1073741824), View.MeasureSpec.makeMeasureSpec(mecVar.r, 1073741824));
        ju3Var.layout(0, 0, mecVar.q, mecVar.r);
        mecVar.G = Bitmap.createBitmap(mecVar.q, mecVar.r, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(mecVar.G);
        if (mecVar.a == 11 && mecVar.X != null) {
            ju3Var.setTallFrame(true);
            ju3Var.setSpokenWords(mecVar.X);
            ju3Var.A(mecVar.V);
            mecVar.I = ju3Var;
            mecVar.J = canvas;
        }
        ju3Var.draw(canvas);
    }

    private boolean isCollage() {
        if (this.collageParts != null) {
            return true;
        }
        return false;
    }

    private void stepCollagePart(int i, nec necVar, long j) {
        boolean z;
        lm lmVar;
        float f;
        Bitmap r;
        long j2;
        long j3 = (j / 1000000) - necVar.f;
        float f2 = necVar.k;
        long j4 = necVar.o;
        long k = Utilities.k(j3, f2 * ((float) j4), necVar.j * ((float) j4));
        MediaCodecPlayer mediaCodecPlayer = necVar.B;
        if (mediaCodecPlayer != null) {
            mediaCodecPlayer.ensure(k);
            necVar.z.updateTexImage();
            return;
        }
        lm lmVar2 = necVar.u;
        if (lmVar2 != null) {
            int i2 = lmVar2.d[3];
            if (i2 <= 0) {
                z = true;
            } else {
                z = false;
            }
            if ((k < i2 || (z && k > 1000)) && lmVar2.e0 != null) {
                lmVar2.e0.g(k, true);
            }
            do {
                lmVar = necVar.u;
                int i3 = lmVar.d[3];
                f = (float) k;
                if ((necVar.v * 2.0f) + i3 >= f) {
                    break;
                }
                j2 = i3;
                if (lmVar.e0 != null) {
                    lmVar.e0.c(null, false, lmVar.h0, lmVar.i0, false);
                }
                lmVar = necVar.u;
            } while (lmVar.d[3] != j2);
            if ((z || f > lmVar.d[3] - (necVar.v / 2.0f)) && (r = lmVar.r(false)) != null) {
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
            if (f11.a && this.firstFrame) {
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
                cc4.b("stMatrix = " + ((Object) sb));
                this.firstFrame = false;
            } else {
                i = 33985;
            }
            if (this.blendEnabled) {
                GLES20.glDisable(3042);
                this.blendEnabled = false;
            }
            uf4 uf4Var = this.filterShaders;
            if (uf4Var != null) {
                uf4Var.P0 = this.mSTMatrix;
                uf4Var.W0 = false;
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
                uf4 uf4Var2 = this.filterShaders;
                if (uf4Var2 != null) {
                    i8 = uf4Var2.g(i6 ^ 1);
                    uf4 uf4Var3 = this.filterShaders;
                    int i18 = uf4Var3.X0;
                    i10 = uf4Var3.Y0;
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
        ArrayList<mec> arrayList = this.mediaEntities;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                mec mecVar = this.mediaEntities.get(i);
                RLottieNative rLottieNative = mecVar.D;
                if (rLottieNative != null) {
                    rLottieNative.d();
                }
                lm lmVar = mecVar.K;
                if (lmVar != null) {
                    lmVar.u();
                }
                View view = mecVar.I;
                if (view instanceof cu3) {
                    cu3 cu3Var = (cu3) view;
                    hm.release(cu3Var, cu3Var.F);
                }
                Bitmap bitmap = mecVar.G;
                if (bitmap != null) {
                    bitmap.recycle();
                    mecVar.G = null;
                }
            }
        }
        ArrayList<nec> arrayList2 = this.collageParts;
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

    public void setBreakStrategy(ju3 ju3Var) {
        ju3Var.setBreakStrategy(0);
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

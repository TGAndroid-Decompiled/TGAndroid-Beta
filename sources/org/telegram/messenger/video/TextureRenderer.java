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
    private xl0 blur;
    private int blurBlurImageHandle;
    private int blurInputTexCoordHandle;
    private int blurMaskImageHandle;
    private String blurPath;
    private int blurPositionHandle;
    private int blurShaderProgram;
    private int[] blurTexture;
    private FloatBuffer blurVerticesBuffer;
    private ArrayList<nac> collageParts;
    private int[] collageTextures;
    private final zl6 cropState;
    private FloatBuffer croppedTextureBuffer;
    private ArrayList<vl> emojiDrawables;
    private wd4 filterShaders;
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
    private ArrayList<mac> mediaEntities;
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

    public TextureRenderer(defpackage.lm6 r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, java.util.ArrayList<defpackage.mac> r34, defpackage.zl6 r35, int r36, int r37, int r38, int r39, int r40, float r41, boolean r42, java.lang.Integer r43, java.lang.Integer r44, defpackage.e4b r45, org.telegram.messenger.video.MediaCodecVideoConvertor.ConvertVideoParams r46) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.video.TextureRenderer.<init>(lm6, java.lang.String, java.lang.String, java.lang.String, java.util.ArrayList, zl6, int, int, int, int, int, float, boolean, java.lang.Integer, java.lang.Integer, e4b, org.telegram.messenger.video.MediaCodecVideoConvertor$ConvertVideoParams):void");
    }

    private void applyRoundRadius(mac macVar, Bitmap bitmap, int i) {
        if (bitmap != null && macVar != null) {
            if (macVar.s != 0.0f || i != 0) {
                if (macVar.M == null) {
                    macVar.M = new Canvas(bitmap);
                }
                if (macVar.s != 0.0f) {
                    if (this.path == null) {
                        this.path = new Path();
                    }
                    if (this.xRefPaint == null) {
                        Paint paint = new Paint(1);
                        this.xRefPaint = paint;
                        paint.setColor(-16777216);
                        this.xRefPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                    }
                    float min = Math.min(bitmap.getWidth(), bitmap.getHeight()) * macVar.s;
                    this.path.rewind();
                    this.path.addRoundRect(new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight()), min, min, Path.Direction.CCW);
                    this.path.toggleInverseFillType();
                    macVar.M.drawPath(this.path, this.xRefPaint);
                }
                if (i != 0) {
                    if (this.textColorPaint == null) {
                        Paint paint2 = new Paint(1);
                        this.textColorPaint = paint2;
                        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
                    }
                    this.textColorPaint.setColor(i);
                    macVar.M.drawRect(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight(), this.textColorPaint);
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
            int h3 = wd4.h(35633, str);
            if (h3 == 0 || (h2 = wd4.h(35632, str2)) == 0 || (glCreateProgram2 = GLES20.glCreateProgram()) == 0) {
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
        int h4 = wd4.h(35633, str);
        if (h4 == 0 || (h = wd4.h(35632, str2)) == 0 || (glCreateProgram = GLES20.glCreateProgram()) == 0) {
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

    private void destroyCollagePart(int i, nac nacVar) {
        if (nacVar != null) {
            km kmVar = nacVar.u;
            if (kmVar != null) {
                kmVar.u();
                nacVar.u = null;
            }
            MediaCodecPlayer mediaCodecPlayer = nacVar.B;
            if (mediaCodecPlayer != null) {
                mediaCodecPlayer.release();
                nacVar.B = null;
            }
            SurfaceTexture surfaceTexture = nacVar.z;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                nacVar.z = null;
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

    private void drawCollagePart(int i, nac nacVar, long j) {
        if (nacVar.B != null && nacVar.b) {
            GLES20.glUseProgram(this.simpleShaderProgramOES);
            GLES20.glActiveTexture(33987);
            GLES20.glBindTexture(36197, this.collageTextures[i]);
            GLES20.glUniform1i(this.simpleSourceImageHandleOES, 3);
            GLES20.glEnableVertexAttribArray(this.simpleInputTexCoordHandleOES);
            GLES20.glVertexAttribPointer(this.simpleInputTexCoordHandleOES, 2, 5126, false, 8, (Buffer) nacVar.t);
            GLES20.glEnableVertexAttribArray(this.simplePositionHandleOES);
            GLES20.glVertexAttribPointer(this.simplePositionHandleOES, 2, 5126, false, 8, (Buffer) nacVar.s);
        } else {
            GLES20.glUseProgram(this.simpleShaderProgram);
            GLES20.glActiveTexture(33986);
            GLES20.glBindTexture(3553, this.collageTextures[i]);
            GLES20.glUniform1i(this.simpleSourceImageHandle, 2);
            GLES20.glEnableVertexAttribArray(this.simpleInputTexCoordHandle);
            GLES20.glVertexAttribPointer(this.simpleInputTexCoordHandle, 2, 5126, false, 8, (Buffer) nacVar.t);
            GLES20.glEnableVertexAttribArray(this.simplePositionHandle);
            GLES20.glVertexAttribPointer(this.simplePositionHandle, 2, 5126, false, 8, (Buffer) nacVar.s);
        }
        GLES20.glDrawArrays(5, 0, 4);
    }

    private void drawEntity(mac macVar, int i, long j) {
        mac macVar2;
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
        if (macVar.a == 11) {
            long j4 = j / 1000000;
            if (j4 >= macVar.V && j4 < macVar.W) {
                if (macVar.G == null) {
                    try {
                        initTextEntity(macVar);
                    } catch (Throwable th) {
                        fa4.g(th, true);
                        return;
                    }
                }
                if (macVar.X != null) {
                    View view = macVar.I;
                    if ((view instanceof st3) && macVar.J != null && macVar.G != null) {
                        st3 st3Var = (st3) view;
                        if (st3Var.A(j4)) {
                            macVar.G.eraseColor(0);
                            st3Var.draw(macVar.J);
                        }
                    }
                }
            } else {
                Bitmap bitmap3 = macVar.G;
                if (bitmap3 != null && j4 >= macVar.W) {
                    bitmap3.recycle();
                    macVar.G = null;
                    return;
                }
                return;
            }
        }
        RLottieNative rLottieNative = macVar.D;
        if (rLottieNative != null) {
            Bitmap bitmap4 = macVar.G;
            if (bitmap4 != null && macVar.Y > 0 && macVar.Z > 0) {
                rLottieNative.c((int) macVar.E, bitmap4, true);
                Bitmap bitmap5 = macVar.G;
                if ((macVar.b & 8) != 0) {
                    i3 = i;
                } else {
                    i3 = 0;
                }
                applyRoundRadius(macVar, bitmap5, i3);
                GLES20.glBindTexture(3553, this.stickerTexture[0]);
                GLUtils.texImage2D(3553, 0, macVar.G, 0);
                float f2 = macVar.E + macVar.F;
                macVar.E = f2;
                if (f2 >= macVar.D.a[0]) {
                    macVar.E = 0.0f;
                }
                int i4 = this.stickerTexture[0];
                float f3 = macVar.c;
                float f4 = macVar.d;
                float f5 = macVar.f;
                float f6 = macVar.g;
                float f7 = macVar.e;
                if ((macVar.b & 2) != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                drawTexture(false, i4, f3, f4, f5, f6, f7, z3);
            }
        } else if (macVar.K != null) {
            float f8 = macVar.E;
            int i5 = (int) f8;
            float f9 = 1.0f;
            if (macVar.a == 5) {
                if (this.isPhoto) {
                    j3 = macVar.U;
                    j2 = 0;
                } else {
                    j2 = macVar.R;
                    j3 = (macVar.T - macVar.S) + j2;
                }
                long j5 = j / 1000000;
                if (j5 < j2) {
                    f9 = s33.h.getInterpolation(Utilities.i(1.0f - (((float) (j2 - j5)) / 400.0f), 1.0f, 0.0f));
                } else if (j5 > j3) {
                    f9 = s33.h.getInterpolation(Utilities.i(1.0f - (((float) (j5 - j3)) / 400.0f), 1.0f, 0.0f));
                }
                if (f9 > 0.0f) {
                    if (this.isPhoto) {
                        k = Utilities.k(j5, macVar.U, 0L);
                    } else {
                        k = Utilities.k((j5 - macVar.R) + macVar.S, macVar.U, 0L);
                    }
                    while (!macVar.L) {
                        int[] iArr = macVar.K.d;
                        f = 2.0f;
                        if (iArr[3] >= Math.min(k, iArr[4])) {
                            break;
                        }
                        km kmVar = macVar.K;
                        int i6 = kmVar.d[3];
                        kmVar.r(false);
                        int i7 = macVar.K.d[3];
                        if (i7 <= i6 && (i7 != 0 || i6 != 0)) {
                            macVar.L = true;
                            break;
                        }
                    }
                }
                f = 2.0f;
            } else {
                f = 2.0f;
                float f10 = f8 + macVar.F;
                macVar.E = f10;
                for (int i8 = (int) f10; i5 != i8; i8--) {
                    macVar.K.r(true);
                }
            }
            hm hmVar = macVar.K.w;
            if (hmVar != null) {
                bitmap = hmVar.b;
            } else {
                bitmap = null;
            }
            if (bitmap != null) {
                if (macVar.a == 5) {
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
                        if ((macVar.b & 8) != 0) {
                            i2 = i;
                        } else {
                            i2 = 0;
                        }
                        applyRoundRadius(macVar, bitmap8, i2);
                    }
                    bitmap2 = this.stickerBitmap;
                }
                if (bitmap2 != null) {
                    GLES20.glBindTexture(3553, this.stickerTexture[0]);
                    GLUtils.texImage2D(3553, 0, bitmap2, 0);
                    int i9 = this.stickerTexture[0];
                    float f11 = macVar.c;
                    float f12 = macVar.d;
                    float f13 = macVar.f;
                    float f14 = macVar.g;
                    float f15 = macVar.e;
                    if ((macVar.b & 2) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    drawTexture(false, i9, f11, f12, f13, f14, f15, z2);
                }
            }
        } else {
            if (macVar.G != null) {
                GLES20.glBindTexture(3553, this.stickerTexture[0]);
                GLUtils.texImage2D(3553, 0, macVar.G, 0);
                int i10 = this.stickerTexture[0];
                float f16 = macVar.c;
                float f17 = macVar.h;
                float f18 = f16 - (f17 / 2.0f);
                float f19 = macVar.d;
                float f20 = macVar.i;
                float f21 = f19 - (f20 / 2.0f);
                float f22 = macVar.f + f17;
                float f23 = f20 + macVar.g;
                float f24 = macVar.e;
                if (macVar.a == 2 && (macVar.b & 2) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                drawTexture(false, i10, f18, f21, f22, f23, f24, z);
            }
            ArrayList arrayList = macVar.k;
            if (arrayList != null && !arrayList.isEmpty()) {
                for (int i11 = 0; i11 < macVar.k.size(); i11++) {
                    lac lacVar = (lac) macVar.k.get(i11);
                    if (lacVar != null && (macVar2 = lacVar.b) != null) {
                        drawEntity(macVar2, macVar.l, j);
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
                this.bitmapData[i7] = (((float) ug8.d(d2, d3, d * Math.sin(d2))) * f14) + f15;
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

    private void initCollagePart(int i, nac nacVar) {
        float f;
        fk2 fk2Var;
        MediaCodecPlayer mediaCodecPlayer;
        AtomicInteger atomicInteger = new AtomicInteger(nacVar.l);
        AtomicInteger atomicInteger2 = new AtomicInteger(nacVar.m);
        AtomicInteger atomicInteger3 = new AtomicInteger(0);
        boolean z = nacVar.b;
        int[] iArr = this.collageTextures;
        if (z) {
            GLES20.glBindTexture(36197, iArr[i]);
            GLES20.glTexParameteri(36197, 10241, 9728);
            GLES20.glTexParameteri(36197, 10240, 9728);
            GLES20.glTexParameteri(36197, 10242, 33071);
            GLES20.glTexParameteri(36197, 10243, 33071);
            SurfaceTexture surfaceTexture = new SurfaceTexture(this.collageTextures[i]);
            nacVar.z = surfaceTexture;
            surfaceTexture.setDefaultBufferSize(nacVar.l, nacVar.m);
            try {
                mediaCodecPlayer = new MediaCodecPlayer(nacVar.d, new Surface(nacVar.z));
                nacVar.B = mediaCodecPlayer;
            } catch (Exception e) {
                fa4.g(e, true);
                nacVar.B = null;
                mediaCodecPlayer = null;
            }
            if (mediaCodecPlayer != null) {
                atomicInteger.set(mediaCodecPlayer.getOrientedWidth());
                atomicInteger2.set(nacVar.B.getOrientedHeight());
                atomicInteger3.set(nacVar.B.getOrientation());
            } else {
                nacVar.z.release();
                nacVar.z = null;
                GLES20.glDeleteTextures(1, this.collageTextures, i);
                GLES20.glGenTextures(1, this.collageTextures, i);
                GLES20.glBindTexture(3553, this.collageTextures[i]);
                GLES20.glTexParameteri(3553, 10241, 9729);
                GLES20.glTexParameteri(3553, 10240, 9729);
                GLES20.glTexParameteri(3553, 10242, 33071);
                GLES20.glTexParameteri(3553, 10243, 33071);
                km kmVar = new km(new File(nacVar.d), true, 0L, 0, null, null, null, 0L, y6c.t0, true, 512, 512, null, 0, true);
                nacVar.u = kmVar;
                if (kmVar.y && kmVar.f0) {
                    wn4.j("Failed to decode with ffmpeg software codecs");
                    return;
                }
                nacVar.v = 1000.0f / kmVar.d[5];
                Bitmap r = kmVar.r(false);
                if (r != null) {
                    GLUtils.texImage2D(3553, 0, r, 0);
                }
                atomicInteger.set(nacVar.u.getIntrinsicWidth());
                atomicInteger2.set(nacVar.u.getIntrinsicHeight());
                atomicInteger3.set(nacVar.u.d[2]);
            }
        } else {
            GLES20.glBindTexture(3553, iArr[i]);
            GLES20.glTexParameteri(3553, 10241, 9729);
            GLES20.glTexParameteri(3553, 10240, 9729);
            GLES20.glTexParameteri(3553, 10242, 33071);
            GLES20.glTexParameteri(3553, 10243, 33071);
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inMutable = true;
            Bitmap decodeFile = BitmapFactory.decodeFile(nacVar.d, options);
            Pair N0 = gl.N0(nacVar.d);
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
        float a = nacVar.r.a(2.0f) - 1.0f;
        ek2 ek2Var = nacVar.r;
        ek2 ek2Var2 = nacVar.r;
        ek2 ek2Var3 = nacVar.r;
        ek2 ek2Var4 = nacVar.r;
        int i2 = ek2Var4.a.c;
        int i3 = ek2Var4.c;
        float[] fArr = {a, -(((2.0f / ek2Var.a.c) * ek2Var.c) - 1.0f), ek2Var.b(2.0f) - 1.0f, -(((2.0f / ek2Var2.a.c) * ek2Var2.c) - 1.0f), ek2Var2.a(2.0f) - 1.0f, -(((2.0f / ek2Var3.a.c) * (ek2Var3.c + 1)) - 1.0f), ek2Var3.b(2.0f) - 1.0f, -(((2.0f / i2) * (i3 + 1)) - 1.0f)};
        float f3 = this.transformedWidth / fk2Var.d[i3];
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
        nacVar.s = floats(fArr);
        nacVar.t = floats(fArr2);
    }

    private void initLinkEntity(mac macVar) {
        d46 d46Var = new d46(org.telegram.messenger.a.b, macVar.Q);
        d46Var.V = true;
        d46Var.b(y6c.t0, macVar.a0, false);
        boolean e = d46Var.e();
        byte b = macVar.b;
        if (e) {
            d46Var.setPreviewType(b);
        } else {
            d46Var.c(b, macVar.l);
        }
        int i = macVar.q;
        int i2 = d46Var.f;
        d46Var.setMaxWidth(i + i2 + i2);
        d46Var.measure(View.MeasureSpec.makeMeasureSpec(macVar.q, 1073741824), View.MeasureSpec.makeMeasureSpec(macVar.r, 1073741824));
        d46Var.layout(0, 0, macVar.q, macVar.r);
        float f = macVar.f * this.transformedWidth;
        int i3 = macVar.q;
        float f2 = f / i3;
        macVar.G = Bitmap.createBitmap(((int) (i3 * f2)) + 16, ((int) (macVar.r * f2)) + 16, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(macVar.G);
        canvas.translate(8.0f, 8.0f);
        canvas.scale(f2, f2);
        d46Var.draw(canvas);
        float f3 = 16.0f * f2;
        macVar.h = f3 / this.transformedWidth;
        macVar.i = f3 / this.transformedHeight;
    }

    private void initLocationEntity(mac macVar) {
        float f;
        float f2;
        byte b = macVar.a;
        hb6 hb6Var = new hb6(org.telegram.messenger.a.b, macVar.Q);
        hb6Var.setIsVideo(true);
        hb6Var.setText(macVar.j);
        hb6Var.e(macVar.b, macVar.l);
        if (macVar.P != null && macVar.k.isEmpty()) {
            hb6Var.d(y6c.t0, macVar.P.c);
        }
        hb6Var.setMaxWidth(macVar.q);
        if (macVar.k.size() == 1) {
            hb6Var.y = true;
            hb6Var.c = true;
            hb6Var.requestLayout();
        }
        hb6Var.measure(View.MeasureSpec.makeMeasureSpec(macVar.q, 1073741824), View.MeasureSpec.makeMeasureSpec(macVar.r, 1073741824));
        hb6Var.layout(0, 0, macVar.q, macVar.r);
        float f3 = macVar.f * this.transformedWidth;
        float f4 = macVar.q;
        float f5 = f3 / f4;
        macVar.G = Bitmap.createBitmap(((int) (f4 * f5)) + 16, ((int) (macVar.r * f5)) + 16, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(macVar.G);
        canvas.translate(8.0f, 8.0f);
        canvas.scale(f5, f5);
        hb6Var.draw(canvas);
        float f6 = 16.0f * f5;
        macVar.h = f6 / this.transformedWidth;
        macVar.i = f6 / this.transformedHeight;
        if (macVar.k.size() == 1) {
            lac lacVar = (lac) macVar.k.get(0);
            mac macVar2 = new mac();
            lacVar.b = macVar2;
            macVar2.j = lacVar.a;
            macVar2.b = lacVar.c;
            RectF rectF = new RectF();
            float f7 = hb6Var.J;
            float f8 = hb6Var.d.left + 2.25f;
            float f9 = hb6Var.E;
            float f10 = hb6Var.K;
            float f11 = hb6Var.O;
            float f12 = f9 * 21.33f;
            rectF.set((f8 * f9) + f7, oo1.z(f11, f12, 2.0f, f10), de9.v(f8, 21.33f, f9, f7), tb4.e(f12, f11, 2.0f, f10));
            float centerX = ((rectF.centerX() / macVar.q) * macVar.f) + macVar.c;
            float f13 = macVar.d;
            float centerY = rectF.centerY() / macVar.r;
            float f14 = macVar.g;
            float f15 = (centerY * f14) + f13;
            if (macVar.e != 0.0f) {
                float f16 = (macVar.f / 2.0f) + macVar.c;
                float f17 = (f14 / 2.0f) + macVar.d;
                float f18 = this.transformedWidth / this.transformedHeight;
                double d = centerX - f16;
                double d2 = (f15 - f17) / f18;
                f2 = 2.0f;
                float cos = ((float) ((Math.cos(-f) * d) - (Math.sin(-macVar.e) * d2))) + f16;
                f15 = (((float) ug8.d(-macVar.e, d2, Math.sin(-macVar.e) * d)) * f18) + f17;
                centerX = cos;
            } else {
                f2 = 2.0f;
            }
            lacVar.b.f = (rectF.width() / macVar.q) * macVar.f;
            lacVar.b.g = (rectF.height() / macVar.r) * macVar.g;
            mac macVar3 = lacVar.b;
            float f19 = macVar3.f * 1.2f;
            macVar3.f = f19;
            float f20 = macVar3.g * 1.2f;
            macVar3.g = f20;
            macVar3.c = centerX - (f19 / f2);
            macVar3.d = f15 - (f20 / f2);
            macVar3.e = macVar.e;
            initStickerEntity(macVar3);
        }
    }

    public void initStickerEntity(mac macVar) {
        zl6 zl6Var;
        zl6 zl6Var2;
        int i = (int) (macVar.f * this.transformedWidth);
        macVar.Y = i;
        int i2 = (int) (macVar.g * this.transformedHeight);
        macVar.Z = i2;
        int i3 = 512;
        if (i > 512) {
            i2 = (int) ((i2 / i) * 512.0f);
            macVar.Z = i2;
            macVar.Y = 512;
            i = 512;
        }
        if (i2 > 512) {
            i = (int) ((i / i2) * 512.0f);
            macVar.Y = i;
            macVar.Z = 512;
        } else {
            i3 = i2;
        }
        byte b = macVar.b;
        float f = 0.0f;
        if ((b & 1) != 0) {
            if (i > 0 && i3 > 0) {
                macVar.G = Bitmap.createBitmap(i, i3, Bitmap.Config.ARGB_8888);
                RLottieNative a = RLottieNative.a(macVar.j, null, null, null, 0, null);
                macVar.D = a;
                if (a != null) {
                    f = a.a[1] / this.videoFps;
                }
                macVar.F = f;
            }
        } else if ((b & 4) != 0) {
            macVar.L = false;
            km kmVar = new km(new File(macVar.j), true, 0L, 0, null, null, null, 0L, y6c.t0, true, 512, 512, null, 0, true);
            macVar.K = kmVar;
            macVar.F = kmVar.d[5] / this.videoFps;
            macVar.E = 1.0f;
            kmVar.r(true);
        } else {
            String str = macVar.j;
            if (!TextUtils.isEmpty(macVar.t) && (macVar.b & 16) != 0) {
                str = macVar.t;
            }
            BitmapFactory.Options options = new BitmapFactory.Options();
            if (macVar.a == 2) {
                options.inMutable = true;
            }
            Bitmap decodeFile = BitmapFactory.decodeFile(str, options);
            macVar.G = decodeFile;
            if (decodeFile != null && (zl6Var = macVar.u) != null) {
                decodeFile = Bitmap.createBitmap((int) Math.max(1.0f, zl6Var.e * decodeFile.getWidth()), (int) Math.max(1.0f, macVar.u.f * macVar.G.getHeight()), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(decodeFile);
                canvas.translate(decodeFile.getWidth() / 2.0f, decodeFile.getHeight() / 2.0f);
                canvas.rotate(-macVar.u.z);
                int width = macVar.G.getWidth();
                int height = macVar.G.getHeight();
                zl6 zl6Var3 = macVar.u;
                if (((zl6Var3.z + zl6Var3.k) / 90) % 2 == 1) {
                    width = macVar.G.getHeight();
                    height = macVar.G.getWidth();
                }
                zl6 zl6Var4 = macVar.u;
                float f2 = zl6Var4.e;
                float f3 = zl6Var4.f;
                float f4 = width;
                float f5 = height;
                canvas.clipRect(((-width) * f2) / 2.0f, ((-height) * f3) / 2.0f, (f2 * f4) / 2.0f, (f3 * f5) / 2.0f);
                float f6 = macVar.u.c;
                canvas.scale(f6, f6);
                zl6 zl6Var5 = macVar.u;
                canvas.translate(zl6Var5.a * f4, zl6Var5.b * f5);
                canvas.rotate(macVar.u.d + zl6Var2.k);
                if (macVar.u.l) {
                    canvas.scale(-1.0f, 1.0f);
                }
                canvas.rotate(macVar.u.z);
                canvas.translate((-macVar.G.getWidth()) / 2.0f, (-macVar.G.getHeight()) / 2.0f);
                canvas.drawBitmap(macVar.G, 0.0f, 0.0f, (Paint) null);
                macVar.G.recycle();
                macVar.G = decodeFile;
            }
            if (macVar.a == 2 && decodeFile != null) {
                macVar.s = gl.L(12.0f) / Math.min(macVar.q, macVar.r);
                Pair N0 = gl.N0(macVar.j);
                macVar.e = (float) (macVar.e - Math.toRadians(((Integer) N0.first).intValue()));
                if ((((Integer) N0.first).intValue() / 90) % 2 == 1) {
                    float f7 = macVar.c;
                    float f8 = macVar.f;
                    float f9 = (f8 / 2.0f) + f7;
                    float f10 = macVar.d;
                    float f11 = macVar.g;
                    float f12 = (f11 / 2.0f) + f10;
                    float f13 = this.transformedWidth;
                    float f14 = this.transformedHeight;
                    float f15 = (f8 * f13) / f14;
                    float f16 = (f11 * f14) / f13;
                    macVar.f = f16;
                    macVar.g = f15;
                    macVar.c = f9 - (f16 / 2.0f);
                    macVar.d = f12 - (f15 / 2.0f);
                }
                applyRoundRadius(macVar, macVar.G, 0);
            } else if (decodeFile != null) {
                float width2 = decodeFile.getWidth() / macVar.G.getHeight();
                if (width2 > 1.0f) {
                    float f17 = macVar.g;
                    float f18 = f17 / width2;
                    macVar.d = oo1.z(f17, f18, 2.0f, macVar.d);
                    macVar.g = f18;
                } else if (width2 < 1.0f) {
                    float f19 = macVar.f;
                    float f20 = width2 * f19;
                    macVar.c = oo1.z(f19, f20, 2.0f, macVar.c);
                    macVar.f = f20;
                }
            }
        }
    }

    private void initTextEntity(final mac macVar) {
        int i;
        int i2;
        int i3;
        Typeface b;
        final st3 st3Var = new st3(org.telegram.messenger.a.b);
        st3Var.getPaint().setAntiAlias(true);
        st3Var.H = false;
        st3Var.setBackgroundColor(0);
        st3Var.setPadding(gl.L(7.0f), gl.L(7.0f), gl.L(7.0f), gl.L(7.0f));
        qs7 qs7Var = macVar.n;
        if (qs7Var != null && (b = qs7Var.b()) != null) {
            st3Var.setTypeface(b);
        }
        st3Var.setTextSize(0, macVar.m);
        SpannableString spannableString = new SpannableString(macVar.j);
        ArrayList arrayList = macVar.k;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            int i5 = i4 + 1;
            final lac lacVar = (lac) arrayList.get(i4);
            if (lacVar.a != null) {
                mac macVar2 = new mac();
                lacVar.b = macVar2;
                macVar2.j = lacVar.a;
                macVar2.b = lacVar.c;
                gm gmVar = new gm(0L, 1.0f, st3Var.getPaint().getFontMetricsInt()) {
                    @Override
                    public void draw(Canvas canvas, CharSequence charSequence, int i6, int i7, float f, int i8, int i9, int i10, Paint paint) {
                        super.draw(canvas, charSequence, i6, i7, f, i8, i9, i10, paint);
                        mac macVar3 = macVar;
                        float paddingLeft = ((((this.measuredSize / 2.0f) + (st3Var.getPaddingLeft() + f)) / macVar3.q) * macVar3.f) + macVar.c;
                        float f2 = macVar3.d;
                        mac macVar4 = macVar;
                        float f3 = macVar4.g;
                        float paddingTop = (((((i10 - i8) / 2.0f) + (st3Var.getPaddingTop() + i8)) / macVar4.r) * f3) + f2;
                        if (macVar4.e != 0.0f) {
                            float f4 = (macVar4.f / 2.0f) + macVar4.c;
                            float f5 = (f3 / 2.0f) + macVar4.d;
                            float f6 = TextureRenderer.this.transformedWidth / TextureRenderer.this.transformedHeight;
                            double d = paddingLeft - f4;
                            double d2 = (paddingTop - f5) / f6;
                            paddingLeft = ((float) ((Math.cos(-macVar.e) * d) - (Math.sin(-macVar.e) * d2))) + f4;
                            paddingTop = (((float) ug8.d(-macVar.e, d2, Math.sin(-macVar.e) * d)) * f6) + f5;
                        }
                        mac macVar5 = lacVar.b;
                        int i11 = this.measuredSize;
                        mac macVar6 = macVar;
                        float f7 = (i11 / macVar6.q) * macVar6.f;
                        macVar5.f = f7;
                        float f8 = (i11 / macVar6.r) * macVar6.g;
                        macVar5.g = f8;
                        macVar5.c = paddingLeft - (f7 / 2.0f);
                        macVar5.d = paddingTop - (f8 / 2.0f);
                        macVar5.e = macVar6.e;
                        if (macVar5.G == null) {
                            TextureRenderer.this.initStickerEntity(macVar5);
                        }
                    }
                };
                int i6 = lacVar.offset;
                spannableString.setSpan(gmVar, i6, lacVar.length + i6, 33);
            }
            i4 = i5;
        }
        st3Var.setText(vu3.m(spannableString, st3Var.getPaint().getFontMetricsInt(), false, null, 0));
        st3Var.setTextColor(macVar.l);
        Editable text = st3Var.getText();
        if (text != null) {
            for (su3 su3Var : (su3[]) text.getSpans(0, text.length(), su3.class)) {
                su3Var.b = 0.85f;
            }
        }
        int i7 = macVar.p;
        if (i7 != 1) {
            if (i7 != 2) {
                i = 19;
            } else {
                i = 21;
            }
        } else {
            i = 17;
        }
        st3Var.setGravity(i);
        int i8 = macVar.p;
        if (i8 != 1) {
            boolean z = k96.a0;
            if (i8 == 2 ? z : !z) {
                i2 = 2;
            } else {
                i2 = 3;
            }
        } else {
            i2 = 4;
        }
        st3Var.setTextAlignment(i2);
        st3Var.setHorizontallyScrolling(false);
        st3Var.setImeOptions(268435456);
        st3Var.setFocusableInTouchMode(true);
        st3Var.setInputType(st3Var.getInputType() | 16384);
        setBreakStrategy(st3Var);
        byte b2 = macVar.b;
        int i9 = -1;
        if (b2 == 0) {
            st3Var.setFrameColor(macVar.l);
            if (gl.B(macVar.l) >= 0.721f) {
                i9 = -16777216;
            }
            st3Var.setTextColor(i9);
        } else if (b2 == 1) {
            if (gl.B(macVar.l) >= 0.25f) {
                i3 = -1728053248;
            } else {
                i3 = -1711276033;
            }
            st3Var.setFrameColor(i3);
            st3Var.setTextColor(macVar.l);
        } else if (b2 == 2) {
            if (gl.B(macVar.l) >= 0.25f) {
                i9 = -16777216;
            }
            st3Var.setFrameColor(i9);
            st3Var.setTextColor(macVar.l);
        } else if (b2 == 3) {
            st3Var.setFrameColor(0);
            st3Var.setTextColor(macVar.l);
        }
        if (macVar.a == 11) {
            st3Var.setMaxLines(3);
            cc1.v(st3Var, macVar.b);
        }
        st3Var.measure(View.MeasureSpec.makeMeasureSpec(macVar.q, 1073741824), View.MeasureSpec.makeMeasureSpec(macVar.r, 1073741824));
        st3Var.layout(0, 0, macVar.q, macVar.r);
        macVar.G = Bitmap.createBitmap(macVar.q, macVar.r, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(macVar.G);
        if (macVar.a == 11 && macVar.X != null) {
            st3Var.setTallFrame(true);
            st3Var.setSpokenWords(macVar.X);
            st3Var.A(macVar.V);
            macVar.I = st3Var;
            macVar.J = canvas;
        }
        st3Var.draw(canvas);
    }

    private boolean isCollage() {
        if (this.collageParts != null) {
            return true;
        }
        return false;
    }

    private void stepCollagePart(int i, nac nacVar, long j) {
        boolean z;
        km kmVar;
        float f;
        Bitmap r;
        long j2;
        long j3 = (j / 1000000) - nacVar.f;
        float f2 = nacVar.k;
        long j4 = nacVar.o;
        long k = Utilities.k(j3, f2 * ((float) j4), nacVar.j * ((float) j4));
        MediaCodecPlayer mediaCodecPlayer = nacVar.B;
        if (mediaCodecPlayer != null) {
            mediaCodecPlayer.ensure(k);
            nacVar.z.updateTexImage();
            return;
        }
        km kmVar2 = nacVar.u;
        if (kmVar2 != null) {
            int i2 = kmVar2.d[3];
            if (i2 <= 0) {
                z = true;
            } else {
                z = false;
            }
            if ((k < i2 || (z && k > 1000)) && kmVar2.e0 != null) {
                kmVar2.e0.g(k, true);
            }
            do {
                kmVar = nacVar.u;
                int i3 = kmVar.d[3];
                f = (float) k;
                if ((nacVar.v * 2.0f) + i3 >= f) {
                    break;
                }
                j2 = i3;
                if (kmVar.e0 != null) {
                    kmVar.e0.c(null, false, kmVar.h0, kmVar.i0, false);
                }
                kmVar = nacVar.u;
            } while (kmVar.d[3] != j2);
            if ((z || f > kmVar.d[3] - (nacVar.v / 2.0f)) && (r = kmVar.r(false)) != null) {
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
            if (w01.a && this.firstFrame) {
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
                fa4.b("stMatrix = " + ((Object) sb));
                this.firstFrame = false;
            } else {
                i = 33985;
            }
            if (this.blendEnabled) {
                GLES20.glDisable(3042);
                this.blendEnabled = false;
            }
            wd4 wd4Var = this.filterShaders;
            if (wd4Var != null) {
                wd4Var.P0 = this.mSTMatrix;
                wd4Var.W0 = false;
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
                wd4 wd4Var2 = this.filterShaders;
                if (wd4Var2 != null) {
                    i8 = wd4Var2.g(i6 ^ 1);
                    wd4 wd4Var3 = this.filterShaders;
                    int i18 = wd4Var3.X0;
                    i10 = wd4Var3.Y0;
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
        ArrayList<mac> arrayList = this.mediaEntities;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                mac macVar = this.mediaEntities.get(i);
                RLottieNative rLottieNative = macVar.D;
                if (rLottieNative != null) {
                    rLottieNative.d();
                }
                km kmVar = macVar.K;
                if (kmVar != null) {
                    kmVar.u();
                }
                View view = macVar.I;
                if (view instanceof lt3) {
                    lt3 lt3Var = (lt3) view;
                    gm.release(lt3Var, lt3Var.F);
                }
                Bitmap bitmap = macVar.G;
                if (bitmap != null) {
                    bitmap.recycle();
                    macVar.G = null;
                }
            }
        }
        ArrayList<nac> arrayList2 = this.collageParts;
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

    public void setBreakStrategy(st3 st3Var) {
        st3Var.setBreakStrategy(0);
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

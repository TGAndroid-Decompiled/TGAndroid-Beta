package ki;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.opengl.GLES20;
import android.util.Size;
import com.google.android.gms.internal.vision.e2;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.ok;
import org.telegram.ui.Components.RLottieNative;
public final class a0 {
    public static z D;
    public static z E;
    public static final String F = l(1.75f, 4);
    public static final String G = l(4.0f, 9);
    public boolean A;
    public boolean B;
    public final int f13639a;
    public final int f13640b;
    public Size f13641c;
    public int d;
    public final boolean e;
    public final boolean f13642f;
    public final u f13643g;
    public final w h;
    public final x f13644i;
    public final v f13645j;
    public final y f13646k;
    public final u f13647l;
    public final u f13648m;
    public final w f13649n;
    public final FloatBuffer f13650o;
    public final FloatBuffer f13651p;
    public FloatBuffer f13652q;
    public FloatBuffer f13653r;
    public final int[] f13655t;
    public int f13656u;
    public long f13660z;
    public final int[] f13654s = new int[8];
    public int v = 0;
    public int f13657w = 1;
    public int f13658x = 0;
    public int f13659y = 1;
    public float C = -1.0f;

    public a0(int i10, Size size, int i11, boolean z10) {
        boolean z11;
        x xVar;
        char c10;
        v vVar;
        w wVar;
        float[] fArr;
        int i12;
        z zVar;
        int round;
        float f7;
        float[] fArr2;
        Bitmap bitmap;
        int[] iArr = new int[10];
        this.f13655t = iArr;
        this.f13639a = i10;
        this.f13640b = Math.max(1, i10 / 2);
        this.f13641c = size;
        this.d = i11;
        this.e = z10;
        String glGetString = GLES20.glGetString(7939);
        if (glGetString != null && glGetString.contains("GL_EXT_shader_texture_lod")) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f13642f = z11;
        this.f13643g = new u("#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n    gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n", 0);
        this.h = new w("attribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n    gl_Position = aPosition;\n    vTextureCoord = aTextureCoord.xy;\n}\n", "precision mediump float;\nvarying vec2 vTextureCoord;\nuniform sampler2D sTexture;\nvoid main() {\n    gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n");
        if (z10) {
            xVar = new x();
        } else {
            xVar = null;
        }
        this.f13644i = xVar;
        if (z10) {
            ?? uVar = new u("#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nvarying vec2 vScreenTextureCoord;\nuniform samplerExternalOES sTexture;\nuniform sampler2D bTexture;\nuniform sampler2D mTexture;\nvoid main() {\n    vec3 sharp = texture2D(sTexture, vTextureCoord).rgb;\n    vec3 blurred = texture2D(bTexture, vScreenTextureCoord).rgb * 0.25;\n    float mask = texture2D(mTexture, vScreenTextureCoord).a;\n    gl_FragColor = vec4(mix(blurred, sharp, mask), 1.0);\n}\n", 0);
            int glGetUniformLocation = GLES20.glGetUniformLocation(uVar.f13885a, "bTexture");
            c10 = '\b';
            int glGetUniformLocation2 = GLES20.glGetUniformLocation(uVar.f13885a, "mTexture");
            GLES20.glUseProgram(uVar.f13885a);
            GLES20.glUniform1i(glGetUniformLocation, 1);
            GLES20.glUniform1i(glGetUniformLocation2, 2);
            vVar = uVar;
        } else {
            c10 = '\b';
            vVar = null;
        }
        this.f13645j = vVar;
        this.f13646k = new y(z10, z11);
        this.f13647l = new u();
        this.f13648m = new u(G, 1);
        if (z10) {
            wVar = new w("attribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n    gl_Position = aPosition;\n    vTextureCoord = aTextureCoord.xy;\n}\n", "precision mediump float;\nvarying vec2 vTextureCoord;\nuniform sampler2D sTexture;\nvoid main() {\n    gl_FragColor = vec4(1.0, 1.0, 1.0, texture2D(sTexture, vTextureCoord).a);\n}\n");
        } else {
            wVar = null;
        }
        this.f13649n = wVar;
        float[] fArr3 = new float[656];
        fArr3[0] = 0.0f;
        fArr3[1] = 0.0f;
        fArr3[2] = 1.0f;
        fArr3[3] = 0.0f;
        fArr3[4] = 0.0f;
        fArr3[5] = 1.0f;
        fArr3[6] = 1.0f;
        fArr3[7] = 1.0f;
        float[] fArr4 = new float[48];
        fArr4[0] = -1.0f;
        fArr4[1] = -1.0f;
        fArr4[2] = 0.0f;
        fArr4[3] = 1.0f;
        fArr4[4] = -1.0f;
        fArr4[5] = 0.0f;
        fArr4[6] = -1.0f;
        fArr4[7] = 1.0f;
        fArr4[c10] = 0.0f;
        fArr4[9] = 1.0f;
        fArr4[10] = 1.0f;
        fArr4[11] = 0.0f;
        this.f13652q = j(size, i11, false);
        this.f13653r = j(size, i11, true);
        GLES20.glGenTextures(10, iArr, 0);
        if (z10) {
            k(0, 48, 48);
            k(1, 48, 48);
            h(2);
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i10 * i10);
            float f10 = i10 * 0.5f;
            float f11 = f10 + 2.0f;
            for (int i13 = 0; i13 < i10; i13++) {
                float f12 = (i13 + 0.5f) - f10;
                int i14 = 0;
                while (i14 < i10) {
                    float f13 = (i14 + 0.5f) - f10;
                    allocateDirect.put((byte) Math.round(Math.max(0.0f, Math.min(1.0f, (f11 + 0.5f) - ((float) Math.sqrt((f12 * f12) + (f13 * f13))))) * 255.0f));
                    i14++;
                    f11 = f11;
                }
            }
            allocateDirect.position(0);
            GLES20.glPixelStorei(3317, 1);
            int i15 = this.f13639a;
            GLES20.glTexImage2D(3553, 0, 6406, i15, i15, 0, 6406, 5121, allocateDirect);
            GLES20.glPixelStorei(3317, 4);
            h(3);
            int i16 = this.f13639a;
            synchronized (a0.class) {
                try {
                    if (i16 == 360) {
                        zVar = D;
                    } else if (i16 == 480) {
                        zVar = E;
                    } else {
                        zVar = null;
                    }
                    if (zVar != null) {
                        fArr2 = fArr3;
                        f7 = 1.0f;
                    } else {
                        float f14 = i16;
                        int round2 = Math.round((372.0f * f14) / 1536.0f);
                        int round3 = Math.round(0.2f * f14);
                        int round4 = round3 - (Math.round((f14 * 28.0f) / 1536.0f) * 2);
                        f7 = 1.0f;
                        int i17 = round4 * 4;
                        int max = Math.max(round4 * 8, round2);
                        int i18 = i17 + round2;
                        RLottieNative b10 = RLottieNative.b(AndroidUtilities.readRes(R.raw.plane_logo_plain), null, null, null);
                        if (b10 != null) {
                            Bitmap createBitmap = Bitmap.createBitmap(round3, round3, Bitmap.Config.ARGB_8888);
                            Bitmap createBitmap2 = Bitmap.createBitmap(max, i18, Bitmap.Config.ALPHA_8);
                            Canvas canvas = new Canvas(createBitmap2);
                            fArr2 = fArr3;
                            int i19 = 0;
                            while (i19 < 27) {
                                int i20 = i19;
                                b10.c(i20 * 2, createBitmap, true);
                                canvas.drawBitmap(createBitmap, (round4 * (i19 % 8)) - round, ((i19 / 8) * round4) - round, (Paint) null);
                                i19 = i20 + 1;
                                b10 = b10;
                            }
                            RLottieNative rLottieNative = b10;
                            Bitmap bitmapFromRaw = AndroidUtilities.getBitmapFromRaw(R.raw.round_blur_overlay_text);
                            if (bitmapFromRaw != null) {
                                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmapFromRaw, round2, round2, true);
                                Bitmap extractAlpha = createScaledBitmap.extractAlpha();
                                bitmap = createBitmap;
                                canvas.drawBitmap(extractAlpha, 0.0f, i17, (Paint) null);
                                extractAlpha.recycle();
                                createScaledBitmap.recycle();
                                bitmapFromRaw.recycle();
                            } else {
                                bitmap = createBitmap;
                            }
                            if (createBitmap2.getRowBytes() == max) {
                                ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(max * i18);
                                createBitmap2.copyPixelsToBuffer(allocateDirect2);
                                allocateDirect2.position(0);
                                z zVar2 = new z(max, i18, round2, round4, i17, allocateDirect2);
                                createBitmap2.recycle();
                                bitmap.recycle();
                                rLottieNative.d();
                                if (i16 == 360) {
                                    D = zVar2;
                                } else if (i16 == 480) {
                                    E = zVar2;
                                }
                                zVar = zVar2;
                            } else {
                                createBitmap2.recycle();
                                bitmap.recycle();
                                rLottieNative.d();
                                throw new IllegalStateException("Unexpected watermark atlas stride");
                            }
                        } else {
                            throw new IllegalStateException("Unable to load watermark animation");
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            int i21 = 0;
            while (i21 < 27) {
                int i22 = i21 % 8;
                int i23 = i21 / 8;
                int i24 = i21 * 24;
                float[] fArr5 = fArr2;
                s(fArr5, i24 + 8, 0.0f, zVar.e / zVar.f13894b, zVar.f13895c / zVar.f13893a, 1.0f);
                int i25 = i24 + 20;
                int i26 = zVar.d;
                float f15 = zVar.f13893a;
                float f16 = zVar.f13894b;
                s(fArr5, i25, (i26 * i22) / f15, (i26 * i23) / f16, ((i22 + 1) * i26) / f15, ((i23 + 1) * i26) / f16);
                i21++;
                fArr2 = fArr5;
            }
            fArr = fArr2;
            float f17 = (zVar.f13895c / this.f13639a) * 2.0f;
            t(fArr4, 12, f7 - f17, 1.0f, f17 - 1.0f);
            float e = a4.a.e(zVar.d, this.f13639a, 2.0f, -1.0f);
            t(fArr4, 30, -1.0f, e, e);
            ByteBuffer duplicate = zVar.f13896f.duplicate();
            duplicate.position(0);
            GLES20.glPixelStorei(3317, 1);
            GLES20.glTexImage2D(3553, 0, 6406, zVar.f13893a, zVar.f13894b, 0, 6406, 5121, duplicate);
            GLES20.glPixelStorei(3317, 4);
            k(8, 48, 48);
        } else {
            fArr = fArr3;
        }
        k(4, i10, i10);
        k(5, 512, 512);
        k(6, i10, i10);
        int i27 = this.f13640b;
        k(7, i27, i27);
        int i28 = this.f13640b;
        k(9, i28, i28);
        GLES20.glBindTexture(3553, 0);
        int[] iArr2 = this.f13654s;
        GLES20.glGenFramebuffers(iArr2.length, iArr2, 0);
        if (z10) {
            b(0, 0);
            b(1, 1);
            i12 = 6;
            b(6, 8);
        } else {
            i12 = 6;
        }
        b(2, 4);
        b(3, 5);
        b(4, i12);
        b(5, 7);
        b(7, 9);
        GLES20.glBindFramebuffer(36160, 0);
        this.f13650o = i(fArr4);
        this.f13651p = i(fArr);
        GLES20.glEnableVertexAttribArray(0);
        GLES20.glEnableVertexAttribArray(1);
    }

    public static int a(int i10, String str) {
        int glCreateShader = GLES20.glCreateShader(i10);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        String glGetShaderInfoLog = GLES20.glGetShaderInfoLog(glCreateShader);
        GLES20.glDeleteShader(glCreateShader);
        throw new IllegalStateException(v7.j.g("Unable to compile shader: ", glGetShaderInfoLog));
    }

    public static void d(int i10) {
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i10);
    }

    public static FloatBuffer i(float[] fArr) {
        FloatBuffer i10 = ok.i(ByteBuffer.allocateDirect(fArr.length * 4));
        i10.put(fArr).position(0);
        return i10;
    }

    public static FloatBuffer j(Size size, int i10, boolean z10) {
        int width;
        int height;
        int min = Math.min(i10, Math.min(size.getWidth(), size.getHeight()));
        if (z10) {
            width = size.getHeight();
        } else {
            width = size.getWidth();
        }
        if (z10) {
            height = size.getWidth();
        } else {
            height = size.getHeight();
        }
        float f7 = min;
        float f10 = f7 / (width * 2.0f);
        float f11 = f7 / (height * 2.0f);
        float f12 = 0.5f - f10;
        float f13 = 0.5f - f11;
        float f14 = f10 + 0.5f;
        float f15 = f11 + 0.5f;
        return i(new float[]{f12, f13, f14, f13, f12, f15, f14, f15});
    }

    public static String l(float f7, int i10) {
        double d;
        float f10;
        float y3;
        int i11 = -i10;
        double d10 = 0.0d;
        while (true) {
            d = 2.0d;
            if (i11 > i10) {
                break;
            }
            double d11 = f7;
            d10 += Math.exp((-(i11 * i11)) / ((2.0d * d11) * d11));
            i11++;
        }
        StringBuilder sb2 = new StringBuilder(4096);
        sb2.append("precision mediump float;\nvarying vec2 vTextureCoord;\nuniform sampler2D sTexture;\nuniform vec2 texOffset;\nvoid main() {\n    vec3 color = texture2D(sTexture, vTextureCoord).rgb * ");
        sb2.append(Float.toString((float) (1.0d / d10)));
        sb2.append(";\n");
        int i12 = 1;
        while (i12 <= i10) {
            double d12 = f7;
            double d13 = d12 * d * d12;
            float exp = (float) (Math.exp((-(i12 * i12)) / d13) / d10);
            int i13 = i12 + 1;
            if (i13 <= i10) {
                f10 = (float) (Math.exp((-(i13 * i13)) / d13) / d10);
            } else {
                f10 = 0.0f;
            }
            float f11 = exp + f10;
            if (f10 == 0.0f) {
                y3 = i12;
            } else {
                y3 = e2.y(i13, f10, i12 * exp, f11);
            }
            sb2.append("    color += (texture2D(sTexture, vTextureCoord + texOffset * ");
            sb2.append(Float.toString(y3));
            sb2.append(").rgb + texture2D(sTexture, vTextureCoord - texOffset * ");
            sb2.append(Float.toString(y3));
            sb2.append(").rgb) * ");
            sb2.append(Float.toString(f11));
            sb2.append(";\n");
            i12 += 2;
            d = 2.0d;
        }
        sb2.append("    gl_FragColor = vec4(color, 1.0);\n}\n");
        return sb2.toString();
    }

    public static void s(float[] fArr, int i10, float f7, float f10, float f11, float f12) {
        fArr[i10] = f7;
        fArr[i10 + 1] = f12;
        fArr[i10 + 2] = f11;
        fArr[i10 + 3] = f12;
        fArr[i10 + 4] = f7;
        fArr[i10 + 5] = f10;
        fArr[i10 + 6] = f7;
        fArr[i10 + 7] = f10;
        fArr[i10 + 8] = f11;
        fArr[i10 + 9] = f12;
        fArr[i10 + 10] = f11;
        fArr[i10 + 11] = f10;
    }

    public static void t(float[] fArr, int i10, float f7, float f10, float f11) {
        u(fArr, i10, f7, -1.0f);
        u(fArr, i10 + 3, f10, -1.0f);
        u(fArr, i10 + 6, f7, f11);
        u(fArr, i10 + 9, f7, f11);
        u(fArr, i10 + 12, f10, -1.0f);
        u(fArr, i10 + 15, f10, f11);
    }

    public static void u(float[] fArr, int i10, float f7, float f10) {
        fArr[i10] = f7;
        fArr[i10 + 1] = f10;
        fArr[i10 + 2] = 0.0f;
    }

    public final void b(int i10, int i11) {
        GLES20.glBindFramebuffer(36160, this.f13654s[i10]);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.f13655t[i11], 0);
        int glCheckFramebufferStatus = GLES20.glCheckFramebufferStatus(36160);
        if (glCheckFramebufferStatus == 36053) {
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
            GLES20.glClear(16384);
            return;
        }
        throw new IllegalStateException("Incomplete framebuffer: 0x" + Integer.toHexString(glCheckFramebufferStatus));
    }

    public final void c(u uVar, float[] fArr) {
        FloatBuffer floatBuffer;
        GLES20.glUseProgram(uVar.f13885a);
        this.f13650o.position(0);
        GLES20.glVertexAttribPointer(0, 3, 5126, false, 12, (Buffer) this.f13650o);
        if (Math.abs(fArr[1]) > Math.abs(fArr[0])) {
            floatBuffer = this.f13653r;
        } else {
            floatBuffer = this.f13652q;
        }
        FloatBuffer floatBuffer2 = floatBuffer;
        floatBuffer2.position(0);
        GLES20.glVertexAttribPointer(uVar.d, 2, 5126, false, 8, (Buffer) floatBuffer2);
        GLES20.glUniformMatrix4fv(uVar.e, 1, false, fArr, 0);
    }

    public final void e(w wVar, int i10, int i11) {
        GLES20.glUseProgram(wVar.f13885a);
        this.f13650o.position(i11);
        GLES20.glVertexAttribPointer(0, 3, 5126, false, 12, (Buffer) this.f13650o);
        this.f13651p.position(i10);
        GLES20.glVertexAttribPointer(wVar.d, 2, 5126, false, 8, (Buffer) this.f13651p);
    }

    public final void f(int i10, int i11) {
        GLES20.glActiveTexture(i10 + 33984);
        GLES20.glBindTexture(3553, this.f13655t[i11]);
    }

    public final void g(float[] fArr, int i10, boolean z10) {
        char c10;
        GLES20.glDisable(3042);
        int[] iArr = this.f13655t;
        if (!z10) {
            GLES20.glBindTexture(3553, iArr[5]);
            GLES20.glTexParameteri(3553, 10241, 9729);
        }
        if (z10) {
            c10 = 4;
        } else {
            c10 = 2;
        }
        int[] iArr2 = this.f13654s;
        GLES20.glBindFramebuffer(36160, iArr2[c10]);
        int i11 = this.f13639a;
        GLES20.glViewport(0, 0, i11, i11);
        c(this.f13643g, fArr);
        d(i10);
        GLES20.glDrawArrays(5, 0, 4);
        if (z10) {
            int i12 = this.f13657w;
            this.f13659y = i12;
            if (this.e) {
                q(i10, fArr, i12, 0.0f);
                int i13 = this.f13659y;
                n(0.020833334f, 0.0f, i13, 6);
                n(0.0f, 0.020833334f, 8, i13);
            }
            this.C = -1.0f;
            this.B = true;
            return;
        }
        GLES20.glBindFramebuffer(36160, iArr2[3]);
        GLES20.glViewport(0, 0, 512, 512);
        e(this.h, 0, 0);
        f(0, 4);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glBindFramebuffer(36160, 0);
        GLES20.glBindTexture(3553, iArr[5]);
        GLES20.glGenerateMipmap(3553);
        GLES20.glTexParameteri(3553, 10241, 9987);
        this.f13658x = this.v;
        this.f13659y = this.f13657w;
        this.B = false;
        this.C = -1.0f;
    }

    public final void h(int i10) {
        GLES20.glBindTexture(3553, this.f13655t[i10]);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
    }

    public final void k(int i10, int i11, int i12) {
        h(i10);
        GLES20.glTexImage2D(3553, 0, 6408, i11, i12, 0, 6408, 5121, null);
    }

    public final void m(int i10, float[] fArr, long j3, int i11, int i12) {
        int i13;
        float f7;
        GLES20.glDisable(3042);
        if (this.e) {
            int i14 = this.f13657w;
            if (this.A) {
                long j10 = this.f13660z;
                if (j10 != 0) {
                    long j11 = j3 - j10;
                    if (j11 > 0 && j11 <= 100000000) {
                        f7 = (float) Math.exp((-j11) / 2.8E8d);
                        i13 = i10;
                        q(i13, fArr, i14, f7);
                        int i15 = this.f13657w;
                        n(0.020833334f, 0.0f, i15, 6);
                        n(0.0f, 0.020833334f, 8, i15);
                        int i16 = this.v;
                        int i17 = this.f13657w;
                        this.v = i17;
                        this.f13657w = i16;
                        this.A = true;
                        this.f13660z = j3;
                        GLES20.glBindFramebuffer(36160, 0);
                        GLES20.glViewport(0, 0, i11, i12);
                        c(this.f13645j, fArr);
                        d(i13);
                        f(1, i17);
                        f(2, 2);
                        GLES20.glDrawArrays(5, 0, 4);
                    }
                }
            }
            i13 = i10;
            f7 = 0.0f;
            q(i13, fArr, i14, f7);
            int i152 = this.f13657w;
            n(0.020833334f, 0.0f, i152, 6);
            n(0.0f, 0.020833334f, 8, i152);
            int i162 = this.v;
            int i172 = this.f13657w;
            this.v = i172;
            this.f13657w = i162;
            this.A = true;
            this.f13660z = j3;
            GLES20.glBindFramebuffer(36160, 0);
            GLES20.glViewport(0, 0, i11, i12);
            c(this.f13645j, fArr);
            d(i13);
            f(1, i172);
            f(2, 2);
            GLES20.glDrawArrays(5, 0, 4);
        } else {
            GLES20.glBindFramebuffer(36160, 0);
            GLES20.glViewport(0, 0, i11, i12);
            c(this.f13643g, fArr);
            d(i10);
            GLES20.glDrawArrays(5, 0, 4);
        }
        r();
    }

    public final void n(float f7, float f10, int i10, int i11) {
        GLES20.glBindFramebuffer(36160, this.f13654s[i11]);
        GLES20.glViewport(0, 0, 48, 48);
        u uVar = this.f13647l;
        e(uVar, 0, 0);
        f(0, i10);
        GLES20.glUniform2f(uVar.e, f7, f10);
        GLES20.glDrawArrays(5, 0, 4);
    }

    public final void o(float f7, float f10, float f11, int i10, int i11) {
        float f12;
        float max;
        boolean z10 = this.B;
        int i12 = this.f13639a;
        if (z10) {
            float min = Math.min(f7, 9.0f);
            if (Math.abs(this.C - min) >= 0.2f) {
                float f13 = min / (i12 * 9);
                int i13 = this.f13640b;
                p(6, f13, 7, i13, 0.0f, i13);
                int i14 = this.f13640b;
                p(9, 0.0f, 5, i14, f13, i14);
                this.C = min;
            }
        }
        GLES20.glBindFramebuffer(36160, 0);
        GLES20.glViewport(0, 0, i10, i11);
        GLES20.glDisable(3042);
        y yVar = this.f13646k;
        e(yVar, 0, 0);
        f(0, 4);
        f(1, 5);
        f(2, 6);
        f(3, 7);
        if (this.e) {
            f(4, this.f13658x);
            f(5, this.f13659y);
            f(6, 2);
        }
        float max2 = (Math.max(0.0f, f7) * 0.625f) / i12;
        GLES20.glUniform2f(yVar.e, max2, max2);
        int i15 = yVar.f13890f;
        float min2 = Math.min(8.0f, (float) (Math.log(((Math.max(1.0f, f7) * 0.625f) * 512.0f) / f12) / Math.log(2.0d))) + 1.25f;
        if (this.f13642f) {
            max = Math.max(0.0f, min2);
        } else {
            max = Math.max(0.0f, min2 - ((float) (Math.log(512.0d / i12) / Math.log(2.0d))));
        }
        GLES20.glUniform1f(i15, max);
        GLES20.glUniform1f(yVar.f13891g, Math.max(0.0f, Math.min(1.0f, f7 / 2.0f)));
        GLES20.glUniform1f(yVar.h, f10);
        GLES20.glUniform1f(yVar.f13892i, f11);
        GLES20.glDrawArrays(5, 0, 4);
        r();
    }

    public final void p(int i10, float f7, int i11, int i12, float f10, int i13) {
        GLES20.glBindFramebuffer(36160, this.f13654s[i11]);
        GLES20.glViewport(0, 0, i12, i13);
        u uVar = this.f13648m;
        e(uVar, 0, 0);
        f(0, i10);
        GLES20.glUniform2f(uVar.e, f7, f10);
        GLES20.glDrawArrays(5, 0, 4);
    }

    public final void q(int i10, float[] fArr, int i11, float f7) {
        boolean z10;
        int width;
        int height;
        GLES20.glBindFramebuffer(36160, this.f13654s[i11]);
        GLES20.glViewport(0, 0, 48, 48);
        x xVar = this.f13644i;
        c(xVar, fArr);
        d(i10);
        f(1, this.v);
        if (Math.abs(fArr[1]) > Math.abs(fArr[0])) {
            z10 = true;
        } else {
            z10 = false;
        }
        int min = Math.min(this.d, Math.min(this.f13641c.getWidth(), this.f13641c.getHeight()));
        Size size = this.f13641c;
        if (z10) {
            width = size.getHeight();
        } else {
            width = size.getWidth();
        }
        float f10 = width;
        if (z10) {
            height = this.f13641c.getWidth();
        } else {
            height = this.f13641c.getHeight();
        }
        float f11 = min;
        float f12 = ((f11 / f10) / 48.0f) * 0.45f;
        float f13 = ((f11 / height) / 48.0f) * 0.45f;
        GLES20.glUniform2f(xVar.f13888f, fArr[0] * f12, fArr[1] * f12);
        GLES20.glUniform2f(xVar.f13889g, fArr[4] * f13, fArr[5] * f13);
        GLES20.glUniform1f(xVar.h, f7);
        GLES20.glDrawArrays(5, 0, 4);
    }

    public final void r() {
        w wVar;
        if (this.e && (wVar = this.f13649n) != null) {
            GLES20.glEnable(3042);
            GLES20.glBlendFunc(770, 771);
            int i10 = this.f13656u;
            this.f13656u = i10 + 1;
            e(wVar, ((i10 % 27) * 24) + 8, 12);
            f(0, 3);
            GLES20.glDrawArrays(4, 0, 12);
            GLES20.glDisable(3042);
        }
    }

    public final void v(Size size, int i10) {
        this.f13641c = size;
        this.d = i10;
        this.f13652q = j(size, i10, false);
        this.f13653r = j(size, i10, true);
        this.A = false;
        this.f13660z = 0L;
    }
}

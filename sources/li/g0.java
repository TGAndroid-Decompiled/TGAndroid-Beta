package li;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.opengl.GLES20;
import android.util.Size;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import org.telegram.messenger.z20;
import org.telegram.ui.Components.RLottieNative;
public final class g0 {
    public static f0 D;
    public static f0 E;
    public static final String F = l(1.75f, 4);
    public static final String G = l(4.0f, 9);
    public boolean A;
    public boolean B;
    public final int f12053a;
    public final int f12054b;
    public Size f12055c;
    public int d;
    public final boolean e;
    public final boolean f12056f;
    public final a0 f12057g;
    public final c0 h;
    public final d0 f12058i;
    public final b0 f12059j;
    public final e0 f12060k;
    public final a0 f12061l;
    public final a0 f12062m;
    public final c0 f12063n;
    public final FloatBuffer f12064o;
    public final FloatBuffer f12065p;
    public FloatBuffer f12066q;
    public FloatBuffer f12067r;
    public final int[] f12069t;
    public int f12070u;
    public long f12074z;
    public final int[] f12068s = new int[8];
    public int v = 0;
    public int f12071w = 1;
    public int f12072x = 0;
    public int f12073y = 1;
    public float C = -1.0f;

    public g0(int i10, Size size, int i11, boolean z10) {
        boolean z11;
        d0 d0Var;
        int i12;
        float f7;
        b0 b0Var;
        c0 c0Var;
        float[] fArr;
        int i13;
        f0 f0Var;
        int round;
        float f10;
        float[] fArr2;
        int[] iArr = new int[10];
        this.f12069t = iArr;
        int i14 = 0;
        this.f12053a = i10;
        this.f12054b = Math.max(1, i10 / 2);
        this.f12055c = size;
        this.d = i11;
        this.e = z10;
        String glGetString = GLES20.glGetString(7939);
        if (glGetString != null && glGetString.contains("GL_EXT_shader_texture_lod")) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f12056f = z11;
        this.f12057g = new a0("#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n    gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n", 0);
        this.h = new c0("attribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n    gl_Position = aPosition;\n    vTextureCoord = aTextureCoord.xy;\n}\n", "precision mediump float;\nvarying vec2 vTextureCoord;\nuniform sampler2D sTexture;\nvoid main() {\n    gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n");
        if (z10) {
            d0Var = new d0();
        } else {
            d0Var = null;
        }
        this.f12058i = d0Var;
        if (z10) {
            ?? a0Var = new a0("#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nvarying vec2 vScreenTextureCoord;\nuniform samplerExternalOES sTexture;\nuniform sampler2D bTexture;\nuniform sampler2D mTexture;\nvoid main() {\n    vec3 sharp = texture2D(sTexture, vTextureCoord).rgb;\n    vec3 blurred = texture2D(bTexture, vScreenTextureCoord).rgb * 0.25;\n    float mask = texture2D(mTexture, vScreenTextureCoord).a;\n    gl_FragColor = vec4(mix(blurred, sharp, mask), 1.0);\n}\n", 0);
            i12 = 8;
            int glGetUniformLocation = GLES20.glGetUniformLocation(a0Var.f12032a, "bTexture");
            f7 = -1.0f;
            int glGetUniformLocation2 = GLES20.glGetUniformLocation(a0Var.f12032a, "mTexture");
            GLES20.glUseProgram(a0Var.f12032a);
            GLES20.glUniform1i(glGetUniformLocation, 1);
            GLES20.glUniform1i(glGetUniformLocation2, 2);
            b0Var = a0Var;
        } else {
            i12 = 8;
            f7 = -1.0f;
            b0Var = null;
        }
        this.f12059j = b0Var;
        this.f12060k = new e0(z10, z11);
        this.f12061l = new a0();
        this.f12062m = new a0(G, 1);
        if (z10) {
            c0Var = new c0("attribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n    gl_Position = aPosition;\n    vTextureCoord = aTextureCoord.xy;\n}\n", "precision mediump float;\nvarying vec2 vTextureCoord;\nuniform sampler2D sTexture;\nvoid main() {\n    gl_FragColor = vec4(1.0, 1.0, 1.0, texture2D(sTexture, vTextureCoord).a);\n}\n");
        } else {
            c0Var = null;
        }
        this.f12063n = c0Var;
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
        fArr4[0] = f7;
        fArr4[1] = f7;
        fArr4[2] = 0.0f;
        fArr4[3] = 1.0f;
        fArr4[4] = f7;
        fArr4[5] = 0.0f;
        fArr4[6] = f7;
        fArr4[7] = 1.0f;
        fArr4[i12] = 0.0f;
        fArr4[9] = 1.0f;
        fArr4[10] = 1.0f;
        fArr4[11] = 0.0f;
        this.f12066q = j(size, i11, false);
        this.f12067r = j(size, i11, true);
        GLES20.glGenTextures(10, iArr, 0);
        if (z10) {
            k(0, 48, 48);
            k(1, 48, 48);
            h(2);
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i10 * i10);
            float f11 = i10 * 0.5f;
            float f12 = 2.0f;
            float f13 = f11 + 2.0f;
            int i15 = 0;
            while (i15 < i10) {
                float f14 = (i15 + 0.5f) - f11;
                int i16 = i14;
                while (i16 < i10) {
                    float f15 = f12;
                    float f16 = (i16 + 0.5f) - f11;
                    allocateDirect.put((byte) Math.round(Math.max(0.0f, Math.min(1.0f, (f13 + 0.5f) - ((float) Math.sqrt((f14 * f14) + (f16 * f16))))) * 255.0f));
                    i16++;
                    f12 = f15;
                }
                i15++;
                i14 = 0;
            }
            float f17 = f12;
            allocateDirect.position(i14);
            GLES20.glPixelStorei(3317, 1);
            int i17 = this.f12053a;
            GLES20.glTexImage2D(3553, 0, 6406, i17, i17, 0, 6406, 5121, allocateDirect);
            GLES20.glPixelStorei(3317, 4);
            h(3);
            int i18 = this.f12053a;
            synchronized (g0.class) {
                try {
                    if (i18 == 360) {
                        f0Var = D;
                    } else if (i18 == 480) {
                        f0Var = E;
                    } else {
                        f0Var = null;
                    }
                    if (f0Var != null) {
                        fArr2 = fArr3;
                        f10 = 1.0f;
                    } else {
                        float f18 = i18;
                        int round2 = Math.round((372.0f * f18) / 1536.0f);
                        int round3 = Math.round(0.2f * f18);
                        int round4 = round3 - (Math.round((f18 * 28.0f) / 1536.0f) * 2);
                        f10 = 1.0f;
                        int i19 = round4 * 4;
                        int max = Math.max(round4 * 8, round2);
                        int i20 = i19 + round2;
                        RLottieNative b10 = RLottieNative.b(org.telegram.messenger.i0.y2(null, 2131624134), null, null, null);
                        if (b10 != null) {
                            Bitmap createBitmap = Bitmap.createBitmap(round3, round3, Bitmap.Config.ARGB_8888);
                            Bitmap createBitmap2 = Bitmap.createBitmap(max, i20, Bitmap.Config.ALPHA_8);
                            Canvas canvas = new Canvas(createBitmap2);
                            fArr2 = fArr3;
                            int i21 = 0;
                            while (i21 < 27) {
                                int i22 = i21;
                                b10.c(i22 * 2, createBitmap, true);
                                canvas.drawBitmap(createBitmap, (round4 * (i21 % 8)) - round, ((i21 / 8) * round4) - round, (Paint) null);
                                i21 = i22 + 1;
                                i20 = i20;
                            }
                            int i23 = i20;
                            Bitmap x02 = org.telegram.messenger.i0.x0();
                            if (x02 != null) {
                                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(x02, round2, round2, true);
                                Bitmap extractAlpha = createScaledBitmap.extractAlpha();
                                canvas.drawBitmap(extractAlpha, 0.0f, i19, (Paint) null);
                                extractAlpha.recycle();
                                createScaledBitmap.recycle();
                                x02.recycle();
                            }
                            if (createBitmap2.getRowBytes() == max) {
                                ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(max * i23);
                                createBitmap2.copyPixelsToBuffer(allocateDirect2);
                                allocateDirect2.position(0);
                                f0 f0Var2 = new f0(max, i23, round2, round4, i19, allocateDirect2);
                                createBitmap2.recycle();
                                createBitmap.recycle();
                                b10.d();
                                if (i18 == 360) {
                                    D = f0Var2;
                                } else if (i18 == 480) {
                                    E = f0Var2;
                                }
                                f0Var = f0Var2;
                            } else {
                                createBitmap2.recycle();
                                createBitmap.recycle();
                                b10.d();
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
            int i24 = 0;
            while (i24 < 27) {
                int i25 = i24 % 8;
                int i26 = i24 / 8;
                int i27 = i24 * 24;
                float[] fArr5 = fArr2;
                s(fArr5, i27 + 8, 0.0f, f0Var.e / f0Var.f12048b, f0Var.f12049c / f0Var.f12047a, 1.0f);
                int i28 = i27 + 20;
                int i29 = f0Var.d;
                float f19 = f0Var.f12047a;
                float f20 = f0Var.f12048b;
                s(fArr5, i28, (i29 * i25) / f19, (i29 * i26) / f20, ((i25 + 1) * i29) / f19, ((i26 + 1) * i29) / f20);
                i24++;
                fArr2 = fArr5;
            }
            fArr = fArr2;
            float f21 = (f0Var.f12049c / this.f12053a) * f17;
            t(fArr4, 12, f10 - f21, f10, f21 + f7);
            float f22 = f7;
            float c10 = a1.g.c(f0Var.d, this.f12053a, f17, f22);
            t(fArr4, 30, f22, c10, c10);
            ByteBuffer duplicate = f0Var.f12050f.duplicate();
            duplicate.position(0);
            GLES20.glPixelStorei(3317, 1);
            GLES20.glTexImage2D(3553, 0, 6406, f0Var.f12047a, f0Var.f12048b, 0, 6406, 5121, duplicate);
            GLES20.glPixelStorei(3317, 4);
            k(i12, 48, 48);
        } else {
            fArr = fArr3;
        }
        k(4, i10, i10);
        k(5, 512, 512);
        k(6, i10, i10);
        int i30 = this.f12054b;
        k(7, i30, i30);
        int i31 = this.f12054b;
        k(9, i31, i31);
        GLES20.glBindTexture(3553, 0);
        int[] iArr2 = this.f12068s;
        GLES20.glGenFramebuffers(iArr2.length, iArr2, 0);
        if (z10) {
            b(0, 0);
            b(1, 1);
            i13 = 6;
            b(6, 8);
        } else {
            i13 = 6;
        }
        b(2, 4);
        b(3, 5);
        b(4, i13);
        b(5, 7);
        b(7, 9);
        GLES20.glBindFramebuffer(36160, 0);
        this.f12064o = i(fArr4);
        this.f12065p = i(fArr);
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
        throw new IllegalStateException(sc.e.h("Unable to compile shader: ", glGetShaderInfoLog));
    }

    public static void d(int i10) {
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i10);
    }

    public static FloatBuffer i(float[] fArr) {
        FloatBuffer g10 = z20.g(ByteBuffer.allocateDirect(fArr.length * 4));
        g10.put(fArr).position(0);
        return g10;
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
        float x10;
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
                x10 = i12;
            } else {
                x10 = c3.i0.x(i13, f10, i12 * exp, f11);
            }
            sb2.append("    color += (texture2D(sTexture, vTextureCoord + texOffset * ");
            sb2.append(Float.toString(x10));
            sb2.append(").rgb + texture2D(sTexture, vTextureCoord - texOffset * ");
            sb2.append(Float.toString(x10));
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
        GLES20.glBindFramebuffer(36160, this.f12068s[i10]);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.f12069t[i11], 0);
        int glCheckFramebufferStatus = GLES20.glCheckFramebufferStatus(36160);
        if (glCheckFramebufferStatus == 36053) {
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
            GLES20.glClear(16384);
            return;
        }
        throw new IllegalStateException("Incomplete framebuffer: 0x" + Integer.toHexString(glCheckFramebufferStatus));
    }

    public final void c(a0 a0Var, float[] fArr) {
        FloatBuffer floatBuffer;
        GLES20.glUseProgram(a0Var.f12032a);
        this.f12064o.position(0);
        GLES20.glVertexAttribPointer(0, 3, 5126, false, 12, (Buffer) this.f12064o);
        if (Math.abs(fArr[1]) > Math.abs(fArr[0])) {
            floatBuffer = this.f12067r;
        } else {
            floatBuffer = this.f12066q;
        }
        FloatBuffer floatBuffer2 = floatBuffer;
        floatBuffer2.position(0);
        GLES20.glVertexAttribPointer(a0Var.d, 2, 5126, false, 8, (Buffer) floatBuffer2);
        GLES20.glUniformMatrix4fv(a0Var.e, 1, false, fArr, 0);
    }

    public final void e(c0 c0Var, int i10, int i11) {
        GLES20.glUseProgram(c0Var.f12032a);
        this.f12064o.position(i11);
        GLES20.glVertexAttribPointer(0, 3, 5126, false, 12, (Buffer) this.f12064o);
        this.f12065p.position(i10);
        GLES20.glVertexAttribPointer(c0Var.d, 2, 5126, false, 8, (Buffer) this.f12065p);
    }

    public final void f(int i10, int i11) {
        GLES20.glActiveTexture(i10 + 33984);
        GLES20.glBindTexture(3553, this.f12069t[i11]);
    }

    public final void g(float[] fArr, int i10, boolean z10) {
        char c10;
        GLES20.glDisable(3042);
        int[] iArr = this.f12069t;
        if (!z10) {
            GLES20.glBindTexture(3553, iArr[5]);
            GLES20.glTexParameteri(3553, 10241, 9729);
        }
        if (z10) {
            c10 = 4;
        } else {
            c10 = 2;
        }
        int[] iArr2 = this.f12068s;
        GLES20.glBindFramebuffer(36160, iArr2[c10]);
        int i11 = this.f12053a;
        GLES20.glViewport(0, 0, i11, i11);
        c(this.f12057g, fArr);
        d(i10);
        GLES20.glDrawArrays(5, 0, 4);
        if (z10) {
            int i12 = this.f12071w;
            this.f12073y = i12;
            if (this.e) {
                q(i10, fArr, i12, 0.0f);
                int i13 = this.f12073y;
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
        this.f12072x = this.v;
        this.f12073y = this.f12071w;
        this.B = false;
        this.C = -1.0f;
    }

    public final void h(int i10) {
        GLES20.glBindTexture(3553, this.f12069t[i10]);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
    }

    public final void k(int i10, int i11, int i12) {
        h(i10);
        GLES20.glTexImage2D(3553, 0, 6408, i11, i12, 0, 6408, 5121, null);
    }

    public final void m(int i10, float[] fArr, long j10, int i11, int i12) {
        int i13;
        float f7;
        GLES20.glDisable(3042);
        if (this.e) {
            int i14 = this.f12071w;
            if (this.A) {
                long j11 = this.f12074z;
                if (j11 != 0) {
                    long j12 = j10 - j11;
                    if (j12 > 0 && j12 <= 100000000) {
                        f7 = (float) Math.exp((-j12) / 2.8E8d);
                        i13 = i10;
                        q(i13, fArr, i14, f7);
                        int i15 = this.f12071w;
                        n(0.020833334f, 0.0f, i15, 6);
                        n(0.0f, 0.020833334f, 8, i15);
                        int i16 = this.v;
                        int i17 = this.f12071w;
                        this.v = i17;
                        this.f12071w = i16;
                        this.A = true;
                        this.f12074z = j10;
                        GLES20.glBindFramebuffer(36160, 0);
                        GLES20.glViewport(0, 0, i11, i12);
                        c(this.f12059j, fArr);
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
            int i152 = this.f12071w;
            n(0.020833334f, 0.0f, i152, 6);
            n(0.0f, 0.020833334f, 8, i152);
            int i162 = this.v;
            int i172 = this.f12071w;
            this.v = i172;
            this.f12071w = i162;
            this.A = true;
            this.f12074z = j10;
            GLES20.glBindFramebuffer(36160, 0);
            GLES20.glViewport(0, 0, i11, i12);
            c(this.f12059j, fArr);
            d(i13);
            f(1, i172);
            f(2, 2);
            GLES20.glDrawArrays(5, 0, 4);
        } else {
            GLES20.glBindFramebuffer(36160, 0);
            GLES20.glViewport(0, 0, i11, i12);
            c(this.f12057g, fArr);
            d(i10);
            GLES20.glDrawArrays(5, 0, 4);
        }
        r();
    }

    public final void n(float f7, float f10, int i10, int i11) {
        GLES20.glBindFramebuffer(36160, this.f12068s[i11]);
        GLES20.glViewport(0, 0, 48, 48);
        a0 a0Var = this.f12061l;
        e(a0Var, 0, 0);
        f(0, i10);
        GLES20.glUniform2f(a0Var.e, f7, f10);
        GLES20.glDrawArrays(5, 0, 4);
    }

    public final void o(float f7, float f10, float f11, int i10, int i11) {
        float f12;
        float max;
        boolean z10 = this.B;
        int i12 = this.f12053a;
        if (z10) {
            float min = Math.min(f7, 9.0f);
            if (Math.abs(this.C - min) >= 0.2f) {
                float f13 = min / (i12 * 9);
                int i13 = this.f12054b;
                p(6, f13, 7, i13, 0.0f, i13);
                int i14 = this.f12054b;
                p(9, 0.0f, 5, i14, f13, i14);
                this.C = min;
            }
        }
        GLES20.glBindFramebuffer(36160, 0);
        GLES20.glViewport(0, 0, i10, i11);
        GLES20.glDisable(3042);
        e0 e0Var = this.f12060k;
        e(e0Var, 0, 0);
        f(0, 4);
        f(1, 5);
        f(2, 6);
        f(3, 7);
        if (this.e) {
            f(4, this.f12072x);
            f(5, this.f12073y);
            f(6, 2);
        }
        float max2 = (Math.max(0.0f, f7) * 0.625f) / i12;
        GLES20.glUniform2f(e0Var.e, max2, max2);
        int i15 = e0Var.f12042f;
        float min2 = Math.min(8.0f, (float) (Math.log(((Math.max(1.0f, f7) * 0.625f) * 512.0f) / f12) / Math.log(2.0d))) + 1.25f;
        if (this.f12056f) {
            max = Math.max(0.0f, min2);
        } else {
            max = Math.max(0.0f, min2 - ((float) (Math.log(512.0d / i12) / Math.log(2.0d))));
        }
        GLES20.glUniform1f(i15, max);
        GLES20.glUniform1f(e0Var.f12043g, Math.max(0.0f, Math.min(1.0f, f7 / 2.0f)));
        GLES20.glUniform1f(e0Var.h, f10);
        GLES20.glUniform1f(e0Var.f12044i, f11);
        GLES20.glDrawArrays(5, 0, 4);
        r();
    }

    public final void p(int i10, float f7, int i11, int i12, float f10, int i13) {
        GLES20.glBindFramebuffer(36160, this.f12068s[i11]);
        GLES20.glViewport(0, 0, i12, i13);
        a0 a0Var = this.f12062m;
        e(a0Var, 0, 0);
        f(0, i10);
        GLES20.glUniform2f(a0Var.e, f7, f10);
        GLES20.glDrawArrays(5, 0, 4);
    }

    public final void q(int i10, float[] fArr, int i11, float f7) {
        boolean z10;
        int width;
        int height;
        GLES20.glBindFramebuffer(36160, this.f12068s[i11]);
        GLES20.glViewport(0, 0, 48, 48);
        d0 d0Var = this.f12058i;
        c(d0Var, fArr);
        d(i10);
        f(1, this.v);
        if (Math.abs(fArr[1]) > Math.abs(fArr[0])) {
            z10 = true;
        } else {
            z10 = false;
        }
        int min = Math.min(this.d, Math.min(this.f12055c.getWidth(), this.f12055c.getHeight()));
        Size size = this.f12055c;
        if (z10) {
            width = size.getHeight();
        } else {
            width = size.getWidth();
        }
        float f10 = width;
        if (z10) {
            height = this.f12055c.getWidth();
        } else {
            height = this.f12055c.getHeight();
        }
        float f11 = min;
        float f12 = ((f11 / f10) / 48.0f) * 0.45f;
        float f13 = ((f11 / height) / 48.0f) * 0.45f;
        GLES20.glUniform2f(d0Var.f12038f, fArr[0] * f12, fArr[1] * f12);
        GLES20.glUniform2f(d0Var.f12039g, fArr[4] * f13, fArr[5] * f13);
        GLES20.glUniform1f(d0Var.h, f7);
        GLES20.glDrawArrays(5, 0, 4);
    }

    public final void r() {
        c0 c0Var;
        if (this.e && (c0Var = this.f12063n) != null) {
            GLES20.glEnable(3042);
            GLES20.glBlendFunc(770, 771);
            int i10 = this.f12070u;
            this.f12070u = i10 + 1;
            e(c0Var, ((i10 % 27) * 24) + 8, 12);
            f(0, 3);
            GLES20.glDrawArrays(4, 0, 12);
            GLES20.glDisable(3042);
        }
    }
}

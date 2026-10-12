package li;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.opengl.GLES20;
import android.util.Size;
import com.google.android.gms.internal.play_billing.k3;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.yh;
import org.telegram.ui.Components.RLottieNative;
public final class e0 {
    public static d0 D;
    public static d0 E;
    public static final String F = l(1.75f, 4);
    public static final String G = l(4.0f, 9);
    public boolean A;
    public boolean B;
    public final int f14764a;
    public final int f14765b;
    public Size f14766c;
    public int d;
    public final boolean e;
    public final boolean f14767f;
    public final y f14768g;
    public final a0 h;
    public final b0 f14769i;
    public final z f14770j;
    public final c0 f14771k;
    public final y f14772l;
    public final y f14773m;
    public final a0 f14774n;
    public final FloatBuffer f14775o;
    public final FloatBuffer f14776p;
    public FloatBuffer f14777q;
    public FloatBuffer f14778r;
    public final int[] f14780t;
    public int f14781u;
    public long f14785z;
    public final int[] f14779s = new int[8];
    public int v = 0;
    public int f14782w = 1;
    public int f14783x = 0;
    public int f14784y = 1;
    public float C = -1.0f;

    public e0(int i10, Size size, int i11, boolean z10) {
        boolean z11;
        b0 b0Var;
        int i12;
        z zVar;
        a0 a0Var;
        float[] fArr;
        int i13;
        d0 d0Var;
        int round;
        float f7;
        float[] fArr2;
        Bitmap bitmap;
        int[] iArr = new int[10];
        this.f14780t = iArr;
        this.f14764a = i10;
        this.f14765b = Math.max(1, i10 / 2);
        this.f14766c = size;
        this.d = i11;
        this.e = z10;
        String glGetString = GLES20.glGetString(7939);
        if (glGetString != null && glGetString.contains("GL_EXT_shader_texture_lod")) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f14767f = z11;
        this.f14768g = new y("#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n    gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n", 0);
        this.h = new a0("attribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n    gl_Position = aPosition;\n    vTextureCoord = aTextureCoord.xy;\n}\n", "precision mediump float;\nvarying vec2 vTextureCoord;\nuniform sampler2D sTexture;\nvoid main() {\n    gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n");
        if (z10) {
            b0Var = new b0();
        } else {
            b0Var = null;
        }
        this.f14769i = b0Var;
        if (z10) {
            ?? yVar = new y("#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nvarying vec2 vScreenTextureCoord;\nuniform samplerExternalOES sTexture;\nuniform sampler2D bTexture;\nuniform sampler2D mTexture;\nvoid main() {\n    vec3 sharp = texture2D(sTexture, vTextureCoord).rgb;\n    vec3 blurred = texture2D(bTexture, vScreenTextureCoord).rgb * 0.25;\n    float mask = texture2D(mTexture, vScreenTextureCoord).a;\n    gl_FragColor = vec4(mix(blurred, sharp, mask), 1.0);\n}\n", 0);
            int glGetUniformLocation = GLES20.glGetUniformLocation(yVar.f14743a, "bTexture");
            i12 = 8;
            int glGetUniformLocation2 = GLES20.glGetUniformLocation(yVar.f14743a, "mTexture");
            GLES20.glUseProgram(yVar.f14743a);
            GLES20.glUniform1i(glGetUniformLocation, 1);
            GLES20.glUniform1i(glGetUniformLocation2, 2);
            zVar = yVar;
        } else {
            i12 = 8;
            zVar = null;
        }
        this.f14770j = zVar;
        this.f14771k = new c0(z10, z11);
        this.f14772l = new y();
        this.f14773m = new y(G, 1);
        if (z10) {
            a0Var = new a0("attribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n    gl_Position = aPosition;\n    vTextureCoord = aTextureCoord.xy;\n}\n", "precision mediump float;\nvarying vec2 vTextureCoord;\nuniform sampler2D sTexture;\nvoid main() {\n    gl_FragColor = vec4(1.0, 1.0, 1.0, texture2D(sTexture, vTextureCoord).a);\n}\n");
        } else {
            a0Var = null;
        }
        this.f14774n = a0Var;
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
        fArr4[i12] = 0.0f;
        fArr4[9] = 1.0f;
        fArr4[10] = 1.0f;
        fArr4[11] = 0.0f;
        this.f14777q = j(size, i11, false);
        this.f14778r = j(size, i11, true);
        GLES20.glGenTextures(10, iArr, 0);
        if (z10) {
            k(0, 48, 48);
            k(1, 48, 48);
            h(2);
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i10 * i10);
            float f10 = i10 * 0.5f;
            float f11 = 2.0f;
            float f12 = f10 + 2.0f;
            for (int i14 = 0; i14 < i10; i14++) {
                float f13 = (i14 + 0.5f) - f10;
                int i15 = 0;
                while (i15 < i10) {
                    float f14 = f11;
                    float f15 = (i15 + 0.5f) - f10;
                    allocateDirect.put((byte) Math.round(Math.max(0.0f, Math.min(1.0f, (f12 + 0.5f) - ((float) Math.sqrt((f13 * f13) + (f15 * f15))))) * 255.0f));
                    i15++;
                    f11 = f14;
                    f12 = f12;
                }
            }
            float f16 = f11;
            allocateDirect.position(0);
            GLES20.glPixelStorei(3317, 1);
            int i16 = this.f14764a;
            GLES20.glTexImage2D(3553, 0, 6406, i16, i16, 0, 6406, 5121, allocateDirect);
            GLES20.glPixelStorei(3317, 4);
            h(3);
            int i17 = this.f14764a;
            synchronized (e0.class) {
                try {
                    if (i17 == 360) {
                        d0Var = D;
                    } else if (i17 == 480) {
                        d0Var = E;
                    } else {
                        d0Var = null;
                    }
                    if (d0Var != null) {
                        fArr2 = fArr3;
                        f7 = 1.0f;
                    } else {
                        float f17 = i17;
                        int round2 = Math.round((372.0f * f17) / 1536.0f);
                        int round3 = Math.round(0.2f * f17);
                        int round4 = round3 - (Math.round((f17 * 28.0f) / 1536.0f) * 2);
                        f7 = 1.0f;
                        int i18 = round4 * 4;
                        int max = Math.max(round4 * 8, round2);
                        int i19 = i18 + round2;
                        RLottieNative b10 = RLottieNative.b(AndroidUtilities.readRes(R.raw.plane_logo_plain), null, null, null);
                        if (b10 != null) {
                            Bitmap createBitmap = Bitmap.createBitmap(round3, round3, Bitmap.Config.ARGB_8888);
                            Bitmap createBitmap2 = Bitmap.createBitmap(max, i19, Bitmap.Config.ALPHA_8);
                            Canvas canvas = new Canvas(createBitmap2);
                            fArr2 = fArr3;
                            int i20 = 0;
                            while (i20 < 27) {
                                int i21 = i20;
                                b10.c(i21 * 2, createBitmap, true);
                                canvas.drawBitmap(createBitmap, (round4 * (i20 % 8)) - round, ((i20 / 8) * round4) - round, (Paint) null);
                                i20 = i21 + 1;
                                b10 = b10;
                            }
                            RLottieNative rLottieNative = b10;
                            Bitmap bitmapFromRaw = AndroidUtilities.getBitmapFromRaw(R.raw.round_blur_overlay_text);
                            if (bitmapFromRaw != null) {
                                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmapFromRaw, round2, round2, true);
                                Bitmap extractAlpha = createScaledBitmap.extractAlpha();
                                bitmap = createBitmap;
                                canvas.drawBitmap(extractAlpha, 0.0f, i18, (Paint) null);
                                extractAlpha.recycle();
                                createScaledBitmap.recycle();
                                bitmapFromRaw.recycle();
                            } else {
                                bitmap = createBitmap;
                            }
                            if (createBitmap2.getRowBytes() == max) {
                                ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(max * i19);
                                createBitmap2.copyPixelsToBuffer(allocateDirect2);
                                allocateDirect2.position(0);
                                d0 d0Var2 = new d0(max, i19, round2, round4, i18, allocateDirect2);
                                createBitmap2.recycle();
                                bitmap.recycle();
                                rLottieNative.d();
                                if (i17 == 360) {
                                    D = d0Var2;
                                } else if (i17 == 480) {
                                    E = d0Var2;
                                }
                                d0Var = d0Var2;
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
            int i22 = 0;
            while (i22 < 27) {
                int i23 = i22 % 8;
                int i24 = i22 / 8;
                int i25 = i22 * 24;
                float[] fArr5 = fArr2;
                s(fArr5, i25 + 8, 0.0f, d0Var.e / d0Var.f14759b, d0Var.f14760c / d0Var.f14758a, 1.0f);
                int i26 = i25 + 20;
                int i27 = d0Var.d;
                float f18 = d0Var.f14758a;
                float f19 = d0Var.f14759b;
                s(fArr5, i26, (i27 * i23) / f18, (i27 * i24) / f19, ((i23 + 1) * i27) / f18, ((i24 + 1) * i27) / f19);
                i22++;
                fArr2 = fArr5;
            }
            fArr = fArr2;
            float f20 = (d0Var.f14760c / this.f14764a) * f16;
            t(fArr4, 12, f7 - f20, f7, f20 - 1.0f);
            float d = a1.g.d(d0Var.d, this.f14764a, f16, -1.0f);
            t(fArr4, 30, -1.0f, d, d);
            ByteBuffer duplicate = d0Var.f14761f.duplicate();
            duplicate.position(0);
            GLES20.glPixelStorei(3317, 1);
            GLES20.glTexImage2D(3553, 0, 6406, d0Var.f14758a, d0Var.f14759b, 0, 6406, 5121, duplicate);
            GLES20.glPixelStorei(3317, 4);
            k(i12, 48, 48);
        } else {
            fArr = fArr3;
        }
        k(4, i10, i10);
        k(5, 512, 512);
        k(6, i10, i10);
        int i28 = this.f14765b;
        k(7, i28, i28);
        int i29 = this.f14765b;
        k(9, i29, i29);
        GLES20.glBindTexture(3553, 0);
        int[] iArr2 = this.f14779s;
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
        this.f14775o = i(fArr4);
        this.f14776p = i(fArr);
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
        throw new IllegalStateException(t8.b.h("Unable to compile shader: ", glGetShaderInfoLog));
    }

    public static void d(int i10) {
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i10);
    }

    public static FloatBuffer i(float[] fArr) {
        FloatBuffer h = yh.h(ByteBuffer.allocateDirect(fArr.length * 4));
        h.put(fArr).position(0);
        return h;
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
        float w9;
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
                w9 = i12;
            } else {
                w9 = k3.w(i13, f10, i12 * exp, f11);
            }
            sb2.append("    color += (texture2D(sTexture, vTextureCoord + texOffset * ");
            sb2.append(Float.toString(w9));
            sb2.append(").rgb + texture2D(sTexture, vTextureCoord - texOffset * ");
            sb2.append(Float.toString(w9));
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
        GLES20.glBindFramebuffer(36160, this.f14779s[i10]);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.f14780t[i11], 0);
        int glCheckFramebufferStatus = GLES20.glCheckFramebufferStatus(36160);
        if (glCheckFramebufferStatus == 36053) {
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
            GLES20.glClear(16384);
            return;
        }
        throw new IllegalStateException("Incomplete framebuffer: 0x" + Integer.toHexString(glCheckFramebufferStatus));
    }

    public final void c(y yVar, float[] fArr) {
        FloatBuffer floatBuffer;
        GLES20.glUseProgram(yVar.f14743a);
        this.f14775o.position(0);
        GLES20.glVertexAttribPointer(0, 3, 5126, false, 12, (Buffer) this.f14775o);
        if (Math.abs(fArr[1]) > Math.abs(fArr[0])) {
            floatBuffer = this.f14778r;
        } else {
            floatBuffer = this.f14777q;
        }
        FloatBuffer floatBuffer2 = floatBuffer;
        floatBuffer2.position(0);
        GLES20.glVertexAttribPointer(yVar.d, 2, 5126, false, 8, (Buffer) floatBuffer2);
        GLES20.glUniformMatrix4fv(yVar.e, 1, false, fArr, 0);
    }

    public final void e(a0 a0Var, int i10, int i11) {
        GLES20.glUseProgram(a0Var.f14743a);
        this.f14775o.position(i11);
        GLES20.glVertexAttribPointer(0, 3, 5126, false, 12, (Buffer) this.f14775o);
        this.f14776p.position(i10);
        GLES20.glVertexAttribPointer(a0Var.d, 2, 5126, false, 8, (Buffer) this.f14776p);
    }

    public final void f(int i10, int i11) {
        GLES20.glActiveTexture(i10 + 33984);
        GLES20.glBindTexture(3553, this.f14780t[i11]);
    }

    public final void g(float[] fArr, int i10, boolean z10) {
        char c10;
        GLES20.glDisable(3042);
        int[] iArr = this.f14780t;
        if (!z10) {
            GLES20.glBindTexture(3553, iArr[5]);
            GLES20.glTexParameteri(3553, 10241, 9729);
        }
        if (z10) {
            c10 = 4;
        } else {
            c10 = 2;
        }
        int[] iArr2 = this.f14779s;
        GLES20.glBindFramebuffer(36160, iArr2[c10]);
        int i11 = this.f14764a;
        GLES20.glViewport(0, 0, i11, i11);
        c(this.f14768g, fArr);
        d(i10);
        GLES20.glDrawArrays(5, 0, 4);
        if (z10) {
            int i12 = this.f14782w;
            this.f14784y = i12;
            if (this.e) {
                q(i10, fArr, i12, 0.0f);
                int i13 = this.f14784y;
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
        this.f14783x = this.v;
        this.f14784y = this.f14782w;
        this.B = false;
        this.C = -1.0f;
    }

    public final void h(int i10) {
        GLES20.glBindTexture(3553, this.f14780t[i10]);
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
            int i14 = this.f14782w;
            if (this.A) {
                long j11 = this.f14785z;
                if (j11 != 0) {
                    long j12 = j10 - j11;
                    if (j12 > 0 && j12 <= 100000000) {
                        f7 = (float) Math.exp((-j12) / 2.8E8d);
                        i13 = i10;
                        q(i13, fArr, i14, f7);
                        int i15 = this.f14782w;
                        n(0.020833334f, 0.0f, i15, 6);
                        n(0.0f, 0.020833334f, 8, i15);
                        int i16 = this.v;
                        int i17 = this.f14782w;
                        this.v = i17;
                        this.f14782w = i16;
                        this.A = true;
                        this.f14785z = j10;
                        GLES20.glBindFramebuffer(36160, 0);
                        GLES20.glViewport(0, 0, i11, i12);
                        c(this.f14770j, fArr);
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
            int i152 = this.f14782w;
            n(0.020833334f, 0.0f, i152, 6);
            n(0.0f, 0.020833334f, 8, i152);
            int i162 = this.v;
            int i172 = this.f14782w;
            this.v = i172;
            this.f14782w = i162;
            this.A = true;
            this.f14785z = j10;
            GLES20.glBindFramebuffer(36160, 0);
            GLES20.glViewport(0, 0, i11, i12);
            c(this.f14770j, fArr);
            d(i13);
            f(1, i172);
            f(2, 2);
            GLES20.glDrawArrays(5, 0, 4);
        } else {
            GLES20.glBindFramebuffer(36160, 0);
            GLES20.glViewport(0, 0, i11, i12);
            c(this.f14768g, fArr);
            d(i10);
            GLES20.glDrawArrays(5, 0, 4);
        }
        r();
    }

    public final void n(float f7, float f10, int i10, int i11) {
        GLES20.glBindFramebuffer(36160, this.f14779s[i11]);
        GLES20.glViewport(0, 0, 48, 48);
        y yVar = this.f14772l;
        e(yVar, 0, 0);
        f(0, i10);
        GLES20.glUniform2f(yVar.e, f7, f10);
        GLES20.glDrawArrays(5, 0, 4);
    }

    public final void o(float f7, float f10, float f11, int i10, int i11) {
        float f12;
        float max;
        boolean z10 = this.B;
        int i12 = this.f14764a;
        if (z10) {
            float min = Math.min(f7, 9.0f);
            if (Math.abs(this.C - min) >= 0.2f) {
                float f13 = min / (i12 * 9);
                int i13 = this.f14765b;
                p(6, f13, 7, i13, 0.0f, i13);
                int i14 = this.f14765b;
                p(9, 0.0f, 5, i14, f13, i14);
                this.C = min;
            }
        }
        GLES20.glBindFramebuffer(36160, 0);
        GLES20.glViewport(0, 0, i10, i11);
        GLES20.glDisable(3042);
        c0 c0Var = this.f14771k;
        e(c0Var, 0, 0);
        f(0, 4);
        f(1, 5);
        f(2, 6);
        f(3, 7);
        if (this.e) {
            f(4, this.f14783x);
            f(5, this.f14784y);
            f(6, 2);
        }
        float max2 = (Math.max(0.0f, f7) * 0.625f) / i12;
        GLES20.glUniform2f(c0Var.e, max2, max2);
        int i15 = c0Var.f14752f;
        float min2 = Math.min(8.0f, (float) (Math.log(((Math.max(1.0f, f7) * 0.625f) * 512.0f) / f12) / Math.log(2.0d))) + 1.25f;
        if (this.f14767f) {
            max = Math.max(0.0f, min2);
        } else {
            max = Math.max(0.0f, min2 - ((float) (Math.log(512.0d / i12) / Math.log(2.0d))));
        }
        GLES20.glUniform1f(i15, max);
        GLES20.glUniform1f(c0Var.f14753g, Math.max(0.0f, Math.min(1.0f, f7 / 2.0f)));
        GLES20.glUniform1f(c0Var.h, f10);
        GLES20.glUniform1f(c0Var.f14754i, f11);
        GLES20.glDrawArrays(5, 0, 4);
        r();
    }

    public final void p(int i10, float f7, int i11, int i12, float f10, int i13) {
        GLES20.glBindFramebuffer(36160, this.f14779s[i11]);
        GLES20.glViewport(0, 0, i12, i13);
        y yVar = this.f14773m;
        e(yVar, 0, 0);
        f(0, i10);
        GLES20.glUniform2f(yVar.e, f7, f10);
        GLES20.glDrawArrays(5, 0, 4);
    }

    public final void q(int i10, float[] fArr, int i11, float f7) {
        boolean z10;
        int width;
        int height;
        GLES20.glBindFramebuffer(36160, this.f14779s[i11]);
        GLES20.glViewport(0, 0, 48, 48);
        b0 b0Var = this.f14769i;
        c(b0Var, fArr);
        d(i10);
        f(1, this.v);
        if (Math.abs(fArr[1]) > Math.abs(fArr[0])) {
            z10 = true;
        } else {
            z10 = false;
        }
        int min = Math.min(this.d, Math.min(this.f14766c.getWidth(), this.f14766c.getHeight()));
        Size size = this.f14766c;
        if (z10) {
            width = size.getHeight();
        } else {
            width = size.getWidth();
        }
        float f10 = width;
        if (z10) {
            height = this.f14766c.getWidth();
        } else {
            height = this.f14766c.getHeight();
        }
        float f11 = min;
        float f12 = ((f11 / f10) / 48.0f) * 0.45f;
        float f13 = ((f11 / height) / 48.0f) * 0.45f;
        GLES20.glUniform2f(b0Var.f14749f, fArr[0] * f12, fArr[1] * f12);
        GLES20.glUniform2f(b0Var.f14750g, fArr[4] * f13, fArr[5] * f13);
        GLES20.glUniform1f(b0Var.h, f7);
        GLES20.glDrawArrays(5, 0, 4);
    }

    public final void r() {
        a0 a0Var;
        if (this.e && (a0Var = this.f14774n) != null) {
            GLES20.glEnable(3042);
            GLES20.glBlendFunc(770, 771);
            int i10 = this.f14781u;
            this.f14781u = i10 + 1;
            e(a0Var, ((i10 % 27) * 24) + 8, 12);
            f(0, 3);
            GLES20.glDrawArrays(4, 0, 12);
            GLES20.glDisable(3042);
        }
    }
}

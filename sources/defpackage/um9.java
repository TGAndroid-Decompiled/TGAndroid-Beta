package defpackage;

import android.opengl.GLES20;
import android.util.Size;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
public final class um9 {
    public static tm9 E;
    public static tm9 F;
    public static final String G = k(1.75f, 4);
    public static final String H = k(4.0f, 9);
    public long A;
    public boolean B;
    public boolean C;
    public final short a;
    public final int b;
    public Size c;
    public int d;
    public final boolean e;
    public final boolean f;
    public final pm9 g;
    public final pd0 h;
    public final rm9 i;
    public final qm9 j;
    public final sm9 k;
    public final pm9 l;
    public final pm9 m;
    public final pd0 n;
    public final FloatBuffer o;
    public final FloatBuffer p;
    public FloatBuffer q;
    public FloatBuffer r;
    public int s;
    public final int[] u;
    public int v;
    public final int[] t = new int[8];
    public boolean w = false;
    public boolean x = true;
    public boolean y = false;
    public boolean z = true;
    public float D = -1.0f;

    public um9(int r43, int r44, android.util.Size r45, boolean r46) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.um9.<init>(int, int, android.util.Size, boolean):void");
    }

    public static void c(int i) {
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i);
    }

    public static FloatBuffer h(float[] fArr) {
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(fArr.length << 2).order(ByteOrder.nativeOrder()).asFloatBuffer();
        asFloatBuffer.put(fArr).position(0);
        return asFloatBuffer;
    }

    public static FloatBuffer i(int i, int i2, Size size, boolean z) {
        int width;
        int height;
        int min = Math.min(i, Math.min(size.getWidth(), size.getHeight()));
        if (z) {
            width = size.getHeight();
            height = size.getWidth();
        } else {
            width = size.getWidth();
            height = size.getHeight();
        }
        float f = min;
        float f2 = f / (width * 2.0f);
        float f3 = f / (height * 2.0f);
        float[] fArr = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};
        float[] fArr2 = new float[8];
        for (int i3 = 0; i3 < 4; i3++) {
            int i4 = i3 << 1;
            float f4 = fArr[i4];
            int i5 = i4 + 1;
            float f5 = fArr[i5];
            if (i2 != 90) {
                if (i2 != 180) {
                    if (i2 == 270) {
                        f5 = -f5;
                    }
                } else {
                    f4 = -f4;
                    f5 = -f5;
                }
                fArr2[i4] = (f4 * f2) + 0.5f;
                fArr2[i5] = (f5 * f3) + 0.5f;
            } else {
                f4 = -f4;
            }
            float f6 = f5;
            f5 = f4;
            f4 = f6;
            fArr2[i4] = (f4 * f2) + 0.5f;
            fArr2[i5] = (f5 * f3) + 0.5f;
        }
        return h(fArr2);
    }

    public static String k(float f, int i) {
        double d;
        float f2;
        float y;
        int i2 = -i;
        double d2 = 0.0d;
        while (true) {
            d = 2.0d;
            if (i2 > i) {
                break;
            }
            double d3 = f;
            d2 += Math.exp((-(i2 * i2)) / ((2.0d * d3) * d3));
            i2++;
        }
        StringBuilder sb = new StringBuilder(4096);
        sb.append("precision mediump float;\nvarying vec2 vTextureCoord;\nuniform sampler2D sTexture;\nuniform vec2 texOffset;\nvoid main() {\n    vec3 color = texture2D(sTexture, vTextureCoord).rgb * ");
        sb.append(Float.toString((float) (1.0d / d2)));
        sb.append(";\n");
        int i3 = 1;
        while (i3 <= i) {
            double d4 = f;
            double d5 = d4 * d * d4;
            float exp = (float) (Math.exp((-(i3 * i3)) / d5) / d2);
            int i4 = i3 + 1;
            if (i4 <= i) {
                f2 = (float) (Math.exp((-(i4 * i4)) / d5) / d2);
            } else {
                f2 = 0.0f;
            }
            float f3 = exp + f2;
            if (f2 == 0.0f) {
                y = i3;
            } else {
                y = b10.y(i4, f2, i3 * exp, f3);
            }
            sb.append("    color += (texture2D(sTexture, vTextureCoord + texOffset * ");
            sb.append(Float.toString(y));
            sb.append(").rgb + texture2D(sTexture, vTextureCoord - texOffset * ");
            sb.append(Float.toString(y));
            sb.append(").rgb) * ");
            sb.append(Float.toString(f3));
            sb.append(";\n");
            i3 += 2;
            d = 2.0d;
        }
        sb.append("    gl_FragColor = vec4(color, 1.0);\n}\n");
        return sb.toString();
    }

    public static int l(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        String glGetShaderInfoLog = GLES20.glGetShaderInfoLog(glCreateShader);
        GLES20.glDeleteShader(glCreateShader);
        dq9.m(b10.h("Unable to compile shader: ", glGetShaderInfoLog));
        return 0;
    }

    public static void s(float[] fArr, int i, float f, float f2, float f3, float f4) {
        fArr[i] = f;
        fArr[i + 1] = f4;
        fArr[i + 2] = f3;
        fArr[i + 3] = f4;
        fArr[i + 4] = f;
        fArr[i + 5] = f2;
        fArr[i + 6] = f;
        fArr[i + 7] = f2;
        fArr[i + 8] = f3;
        fArr[i + 9] = f4;
        fArr[i + 10] = f3;
        fArr[i + 11] = f2;
    }

    public static void t(float[] fArr, int i, float f, float f2, float f3) {
        u(fArr, i, f, -1.0f);
        u(fArr, i + 3, f2, -1.0f);
        u(fArr, i + 6, f, f3);
        u(fArr, i + 9, f, f3);
        u(fArr, i + 12, f2, -1.0f);
        u(fArr, i + 15, f2, f3);
    }

    public static void u(float[] fArr, int i, float f, float f2) {
        fArr[i] = f;
        fArr[i + 1] = f2;
        fArr[i + 2] = 0.0f;
    }

    public final void a(int i, int i2) {
        GLES20.glBindFramebuffer(36160, this.t[i]);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.u[i2], 0);
        int glCheckFramebufferStatus = GLES20.glCheckFramebufferStatus(36160);
        if (glCheckFramebufferStatus == 36053) {
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
            GLES20.glClear(16384);
            return;
        }
        zo4.r(Integer.toHexString(glCheckFramebufferStatus), "Incomplete framebuffer: 0x");
    }

    public final void b(pm9 pm9Var, float[] fArr) {
        FloatBuffer floatBuffer;
        GLES20.glUseProgram(pm9Var.a);
        this.o.position(0);
        GLES20.glVertexAttribPointer(0, 3, 5126, false, 12, (Buffer) this.o);
        if (Math.abs(fArr[1]) > Math.abs(fArr[0])) {
            floatBuffer = this.r;
        } else {
            floatBuffer = this.q;
        }
        FloatBuffer floatBuffer2 = floatBuffer;
        floatBuffer2.position(0);
        GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) floatBuffer2);
        GLES20.glUniformMatrix4fv(pm9Var.d, 1, false, fArr, 0);
    }

    public final void d(pd0 pd0Var, int i, int i2) {
        GLES20.glUseProgram(pd0Var.a);
        this.o.position(i2);
        GLES20.glVertexAttribPointer(0, 3, 5126, false, 12, (Buffer) this.o);
        this.p.position(i);
        GLES20.glVertexAttribPointer(1, 2, 5126, false, 8, (Buffer) this.p);
    }

    public final void e(int i, int i2) {
        GLES20.glActiveTexture(i + 33984);
        GLES20.glBindTexture(3553, this.u[i2]);
    }

    public final void f(float[] fArr, int i, boolean z) {
        char c;
        GLES20.glDisable(3042);
        int[] iArr = this.u;
        if (!z) {
            GLES20.glBindTexture(3553, iArr[5]);
            GLES20.glTexParameteri(3553, 10241, 9729);
            c = 2;
        } else {
            c = 4;
        }
        int[] iArr2 = this.t;
        GLES20.glBindFramebuffer(36160, iArr2[c]);
        short s = this.a;
        GLES20.glViewport(0, 0, s, s);
        b(this.g, fArr);
        c(i);
        GLES20.glDrawArrays(5, 0, 4);
        if (z) {
            boolean z2 = this.x;
            this.z = z2;
            if (this.e) {
                q(i, fArr, z2 ? 1 : 0, 0.0f);
                boolean z3 = this.z;
                n(0.020833334f, 0.0f, z3 ? 1 : 0, 6);
                n(0.0f, 0.020833334f, 8, z3 ? 1 : 0);
            }
            this.D = -1.0f;
            this.C = true;
            return;
        }
        GLES20.glBindFramebuffer(36160, iArr2[3]);
        GLES20.glViewport(0, 0, 512, 512);
        d(this.h, 0, 0);
        e(0, 4);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glBindFramebuffer(36160, 0);
        GLES20.glBindTexture(3553, iArr[5]);
        GLES20.glGenerateMipmap(3553);
        GLES20.glTexParameteri(3553, 10241, 9987);
        this.y = this.w;
        this.z = this.x;
        this.C = false;
        this.D = -1.0f;
    }

    public final void g(int i) {
        GLES20.glBindTexture(3553, this.u[i]);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
    }

    public final void j(int i, int i2, int i3) {
        g(i);
        GLES20.glTexImage2D(3553, 0, 6408, i2, i3, 0, 6408, 5121, null);
    }

    public final void m(int i, float[] fArr, long j, int i2, int i3) {
        int i4;
        float f;
        GLES20.glDisable(3042);
        if (this.e) {
            boolean z = this.x;
            if (this.B) {
                long j2 = this.A;
                if (j2 != 0) {
                    long j3 = j - j2;
                    if (j3 > 0 && j3 <= 100000000) {
                        f = (float) Math.exp((-j3) / 2.8E8d);
                        i4 = i;
                        q(i4, fArr, z ? 1 : 0, f);
                        boolean z2 = this.x;
                        n(0.020833334f, 0.0f, z2 ? 1 : 0, 6);
                        n(0.0f, 0.020833334f, 8, z2 ? 1 : 0);
                        boolean z3 = this.w;
                        boolean z4 = this.x;
                        this.w = z4;
                        this.x = z3;
                        this.B = true;
                        this.A = j;
                        GLES20.glBindFramebuffer(36160, 0);
                        GLES20.glViewport(0, 0, i2, i3);
                        b(this.j, fArr);
                        c(i4);
                        e(1, z4 ? 1 : 0);
                        e(2, 2);
                        GLES20.glDrawArrays(5, 0, 4);
                    }
                }
            }
            i4 = i;
            f = 0.0f;
            q(i4, fArr, z ? 1 : 0, f);
            boolean z22 = this.x;
            n(0.020833334f, 0.0f, z22 ? 1 : 0, 6);
            n(0.0f, 0.020833334f, 8, z22 ? 1 : 0);
            boolean z32 = this.w;
            boolean z42 = this.x;
            this.w = z42;
            this.x = z32;
            this.B = true;
            this.A = j;
            GLES20.glBindFramebuffer(36160, 0);
            GLES20.glViewport(0, 0, i2, i3);
            b(this.j, fArr);
            c(i4);
            e(1, z42 ? 1 : 0);
            e(2, 2);
            GLES20.glDrawArrays(5, 0, 4);
        } else {
            GLES20.glBindFramebuffer(36160, 0);
            GLES20.glViewport(0, 0, i2, i3);
            b(this.g, fArr);
            c(i);
            GLES20.glDrawArrays(5, 0, 4);
        }
        r();
    }

    public final void n(float f, float f2, int i, int i2) {
        GLES20.glBindFramebuffer(36160, this.t[i2]);
        GLES20.glViewport(0, 0, 48, 48);
        pm9 pm9Var = this.l;
        d(pm9Var, 0, 0);
        e(0, i);
        GLES20.glUniform2f(pm9Var.d, f, f2);
        GLES20.glDrawArrays(5, 0, 4);
    }

    public final void o(float f, float f2, float f3, int i, int i2) {
        float f4;
        float max;
        boolean z = this.C;
        short s = this.a;
        if (z) {
            float min = Math.min(f, 9.0f);
            if (Math.abs(this.D - min) >= 0.2f) {
                float f5 = min / (s * 9);
                int i3 = this.b;
                p(6, f5, 7, i3, 0.0f, i3);
                int i4 = this.b;
                p(9, 0.0f, 5, i4, f5, i4);
                this.D = min;
            }
        }
        GLES20.glBindFramebuffer(36160, 0);
        GLES20.glViewport(0, 0, i, i2);
        GLES20.glDisable(3042);
        sm9 sm9Var = this.k;
        d(sm9Var, 0, 0);
        e(0, 4);
        e(1, 5);
        e(2, 6);
        e(3, 7);
        if (this.e) {
            e(4, this.y ? 1 : 0);
            e(5, this.z ? 1 : 0);
            e(6, 2);
        }
        float max2 = (Math.max(0.0f, f) * 0.625f) / s;
        GLES20.glUniform2f(sm9Var.d, max2, max2);
        int i5 = sm9Var.e;
        float min2 = Math.min(8.0f, (float) (Math.log(((Math.max(1.0f, f) * 0.625f) * 512.0f) / f4) / 0.6931471805599453d)) + 1.25f;
        if (this.f) {
            max = Math.max(0.0f, min2);
        } else {
            max = Math.max(0.0f, min2 - ((float) (Math.log(512.0d / s) / 0.6931471805599453d)));
        }
        GLES20.glUniform1f(i5, max);
        GLES20.glUniform1f(sm9Var.f, Math.max(0.0f, Math.min(1.0f, f / 2.0f)));
        GLES20.glUniform1f(sm9Var.g, f2);
        GLES20.glUniform1f(sm9Var.h, f3);
        GLES20.glDrawArrays(5, 0, 4);
        r();
    }

    public final void p(int i, float f, int i2, int i3, float f2, int i4) {
        GLES20.glBindFramebuffer(36160, this.t[i2]);
        GLES20.glViewport(0, 0, i3, i4);
        pm9 pm9Var = this.m;
        d(pm9Var, 0, 0);
        e(0, i);
        GLES20.glUniform2f(pm9Var.d, f, f2);
        GLES20.glDrawArrays(5, 0, 4);
    }

    public final void q(int i, float[] fArr, int i2, float f) {
        Object[] objArr;
        float width;
        int height;
        GLES20.glBindFramebuffer(36160, this.t[i2]);
        GLES20.glViewport(0, 0, 48, 48);
        rm9 rm9Var = this.i;
        b(rm9Var, fArr);
        c(i);
        e(1, this.w ? 1 : 0);
        if (Math.abs(fArr[1]) > Math.abs(fArr[0])) {
            objArr = 1;
        } else {
            objArr = null;
        }
        int min = Math.min(this.d, Math.min(this.c.getWidth(), this.c.getHeight()));
        Size size = this.c;
        if (objArr != null) {
            width = size.getHeight();
            height = this.c.getWidth();
        } else {
            width = size.getWidth();
            height = this.c.getHeight();
        }
        float f2 = min;
        float f3 = ((f2 / width) / 48.0f) * 0.45f;
        float f4 = ((f2 / height) / 48.0f) * 0.45f;
        GLES20.glUniform2f(rm9Var.e, fArr[0] * f3, fArr[1] * f3);
        GLES20.glUniform2f(rm9Var.f, fArr[4] * f4, fArr[5] * f4);
        GLES20.glUniform1f(rm9Var.g, f);
        GLES20.glDrawArrays(5, 0, 4);
    }

    public final void r() {
        pd0 pd0Var;
        if (this.e && (pd0Var = this.n) != null) {
            GLES20.glEnable(3042);
            GLES20.glBlendFunc(770, 771);
            int i = this.v;
            this.v = i + 1;
            d(pd0Var, ((i % 27) * 24) + 8, 12);
            e(0, 3);
            GLES20.glDrawArrays(4, 0, 12);
            GLES20.glDisable(3042);
        }
    }

    public final void v() {
        this.q = i(this.d, this.s, this.c, false);
        this.r = i(this.d, this.s, this.c, true);
    }
}

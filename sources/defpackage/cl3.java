package defpackage;

import android.content.Context;
import android.opengl.GLES20;
import android.opengl.GLES30;
import android.opengl.Matrix;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
public final class cl3 {
    public static final String[] D = {"crownGradient", "pavilionGradient", "lightSweep", "crownSweep", "rightCrownSweep", "leftCrownSweep", "pavilionSweep", "rightPavilionSweep", "leftPavilionSweep"};
    public boolean A;
    public byte C;
    public final float[] m;
    public final float[] n;
    public final float[] o;
    public final float[] p;
    public final float[] q;
    public final float[] r;
    public int t;
    public int u;
    public int v;
    public final int w;
    public double x;
    public float y;
    public float z;
    public final int[] a = new int[3];
    public final int[] b = new int[4];
    public final int[] c = new int[3];
    public final int[] d = new int[3];
    public final int[] e = new int[2];
    public final int[] f = new int[2];
    public final int[] g = new int[1];
    public final HashMap h = new HashMap();
    public final float[] i = new float[16];
    public final float[] j = new float[16];
    public final float[] k = new float[16];
    public final float[] l = new float[42];
    public float s = 1.0f;
    public float B = 1.0f;

    public cl3(Context context, int i) {
        int i2;
        String str;
        try {
            String[] strArr = {"diamond", "sparkle", "copy"};
            for (int i3 = 0; i3 < 3; i3++) {
                if (i3 == 2) {
                    str = "fullscreenVertex";
                } else {
                    str = strArr[i3] + "Vertex";
                }
                this.a[i3] = sde.a(context, j(context, str), j(context, strArr[i3] + "Fragment"));
            }
            float[] a = a(context, "frames");
            this.m = a;
            float[] a2 = a(context, "planes");
            this.n = a2;
            float[] a3 = a(context, "anchors");
            this.o = a3;
            float[] a4 = a(context, "widths");
            this.p = a4;
            float[] a5 = a(context, "facetProjection");
            this.q = a5;
            float[] a6 = a(context, "camera");
            this.r = a6;
            if (a3.length == 64 && a4.length == 91 && a5.length == 4 && a6.length == 3) {
                if (a.length == 60522 && a2.length == 68) {
                    int[] iArr = this.b;
                    GLES30.glGenVertexArrays(iArr.length, iArr, 0);
                    int[] iArr2 = this.c;
                    GLES20.glGenBuffers(iArr2.length, iArr2, 0);
                    String[] strArr2 = {"vertices", "main", "small"};
                    for (int i4 = 0; i4 < 3; i4++) {
                        float[] a7 = a(context, strArr2[i4]);
                        if (i4 == 0) {
                            i2 = 3;
                        } else {
                            i2 = 2;
                        }
                        this.d[i4] = a7.length / (i2 << 2);
                        GLES30.glBindVertexArray(this.b[i4]);
                        GLES20.glBindBuffer(34962, this.c[i4]);
                        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(a7.length << 2).order(ByteOrder.nativeOrder()).asFloatBuffer();
                        asFloatBuffer.put(a7).position(0);
                        GLES20.glBufferData(34962, a7.length << 2, asFloatBuffer, 35044);
                        for (int i5 = 0; i5 < i2; i5++) {
                            GLES20.glEnableVertexAttribArray(i5);
                            GLES20.glVertexAttribPointer(i5, 4, 5126, false, i2 << 4, i5 << 4);
                        }
                    }
                    GLES20.glGenFramebuffers(2, this.e, 0);
                    GLES20.glGenRenderbuffers(2, this.f, 0);
                    GLES20.glGenTextures(1, this.g, 0);
                    GLES20.glBindTexture(3553, this.g[0]);
                    GLES20.glTexParameteri(3553, 10241, 9729);
                    GLES20.glTexParameteri(3553, 10240, 9729);
                    GLES20.glTexParameteri(3553, 10242, 33071);
                    GLES20.glTexParameteri(3553, 10243, 33071);
                    int[] iArr3 = new int[1];
                    GLES20.glGetIntegerv(36183, iArr3, 0);
                    this.w = Math.min(i, iArr3[0]);
                    return;
                }
                throw new IllegalStateException("Invalid Swift diamond animation data");
            }
            throw new IllegalStateException("Invalid Swift diamond camera data");
        } catch (Exception e) {
            b();
            k93.h("Cannot load Swift diamond", e);
            throw null;
        }
    }

    public static float[] a(Context context, String str) {
        byte[] g = g(context, "models/diamond_ios/" + str + ".bin");
        float[] fArr = new float[g.length / 4];
        ByteBuffer.wrap(g).order(ByteOrder.LITTLE_ENDIAN).asFloatBuffer().get(fArr);
        return fArr;
    }

    public static byte[] g(Context context, String str) {
        InputStream open = context.getAssets().open(str);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[16384];
            while (true) {
                int read = open.read(bArr);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    open.close();
                    return byteArray;
                }
            }
        } catch (Throwable th) {
            if (open != null) {
                try {
                    open.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static float i(float f) {
        float max = Math.max(0.0f, Math.min(1.0f, f));
        return yjb.B(max, 2.0f, 3.0f, max * max);
    }

    public static String j(Context context, String str) {
        return new String(g(context, "shaders/diamond/" + str + ".glsl"), StandardCharsets.UTF_8);
    }

    public final void b() {
        int[] iArr;
        for (int i : this.a) {
            if (i != 0) {
                GLES20.glDeleteProgram(i);
            }
        }
        int[] iArr2 = this.c;
        GLES20.glDeleteBuffers(iArr2.length, iArr2, 0);
        int[] iArr3 = this.b;
        GLES30.glDeleteVertexArrays(iArr3.length, iArr3, 0);
        int[] iArr4 = this.g;
        GLES20.glDeleteTextures(iArr4.length, iArr4, 0);
        int[] iArr5 = this.e;
        GLES20.glDeleteFramebuffers(iArr5.length, iArr5, 0);
        int[] iArr6 = this.f;
        GLES20.glDeleteRenderbuffers(iArr6.length, iArr6, 0);
    }

    public final void c(int i, int i2, float f, float f2, float f3, float f4, float f5, float f6, boolean z) {
        boolean z2;
        int i3;
        int i4;
        int i5;
        int i6;
        float abs;
        float f7;
        float f8;
        float f9;
        int i7;
        if (i > 0 && i2 > 0) {
            float max = Math.max(0.0f, Math.min(f4, 0.1f));
            double d = this.x + max;
            this.x = d;
            float f10 = (float) d;
            double d2 = (d * 240.0d) % 1440.0d;
            int i8 = (int) d2;
            float f11 = (float) (d2 - i8);
            int i9 = 0;
            int i10 = 0;
            while (true) {
                float[] fArr = this.l;
                if (i10 >= fArr.length) {
                    break;
                }
                float[] fArr2 = this.m;
                float f12 = fArr2[(i8 * 42) + i10];
                fArr[i10] = tb4.A(fArr2[((1 + i8) * 42) + i10], f12, f11, f12);
                i10++;
            }
            float f13 = i;
            int max2 = Math.max(1, Math.round(this.B * f13));
            float f14 = i2;
            int max3 = Math.max(1, Math.round(this.B * f14));
            int i11 = this.u;
            int i12 = 36160;
            int[] iArr = this.e;
            if (max2 == i11 && max3 == this.v) {
                z2 = true;
                i3 = 2;
                i4 = 0;
            } else {
                this.u = max2;
                this.v = max3;
                GLES20.glBindFramebuffer(36160, iArr[0]);
                int i13 = 0;
                z2 = true;
                for (int i14 = 2; i13 < i14; i14 = 2) {
                    int[] iArr2 = this.f;
                    int i15 = i9;
                    GLES20.glBindRenderbuffer(36161, iArr2[i13]);
                    if (i13 == 0) {
                        i5 = 32856;
                    } else {
                        i5 = 33189;
                    }
                    GLES30.glRenderbufferStorageMultisample(36161, this.w, i5, max2, max3);
                    if (i13 == 0) {
                        i6 = 36064;
                    } else {
                        i6 = 36096;
                    }
                    GLES20.glFramebufferRenderbuffer(36160, i6, 36161, iArr2[i13]);
                    i13++;
                    i12 = 36160;
                    i9 = i15;
                }
                int i16 = i9;
                int i17 = i12;
                if (GLES20.glCheckFramebufferStatus(i17) == 36053) {
                    GLES20.glBindFramebuffer(i17, iArr[1]);
                    int[] iArr3 = this.g;
                    GLES20.glBindTexture(3553, iArr3[i16]);
                    i3 = 2;
                    GLES20.glTexImage2D(3553, 0, 32856, max2, max3, 0, 6408, 5121, null);
                    i4 = i16;
                    GLES20.glFramebufferTexture2D(i17, 36064, 3553, iArr3[i16], i4);
                    if (GLES20.glCheckFramebufferStatus(i17) != 36053) {
                        sc8.j("Incomplete diamond framebuffer");
                        return;
                    }
                } else {
                    sc8.j("Incomplete diamond framebuffer");
                    return;
                }
            }
            float[] fArr3 = this.r;
            float f15 = f2 + fArr3[i4];
            double d3 = f;
            int i18 = i3;
            float min = Math.min(90.0f, (360.0f * Math.abs((float) Math.IEEEremainder(d3, 1.5707963267948966d))) / 3.1415927f);
            int min2 = Math.min(89, (int) min);
            float f16 = min - min2;
            float[] fArr4 = this.p;
            float f17 = fArr4[min2];
            float f18 = fArr4[min2 + 1];
            if (min2 == 0) {
                f7 = 0.0f;
            } else {
                f7 = (f18 - fArr4[min2 - 1]) / 2.0f;
            }
            if (min2 == 89) {
                f8 = 0.0f;
            } else {
                f8 = (fArr4[min2 + 2] - f17) / 2.0f;
            }
            float f19 = ((((((((f17 - f18) * 2.0f) + f7 + f8) * f16) + ((((f18 - f17) * 3.0f) - (f7 * 2.0f)) - f8)) * f16) + f7) * f16) + f17;
            float sin = (float) Math.sin(abs * 2.0f);
            float f20 = 1.0f - ((0.035f * sin) * sin);
            double d4 = f15;
            this.s = ((1.0f - i((float) ((Math.abs(Math.sin(d4)) - 0.24740395925452294d) / 0.5717876090464753d))) * (((f20 * fArr4[0]) / f19) - 1.0f)) + 1.0f;
            float[] fArr5 = this.i;
            Matrix.setIdentityM(fArr5, 0);
            Matrix.rotateM(this.i, 0, -((float) Math.toDegrees(f3)), 0.0f, 0.0f, 1.0f);
            Matrix.rotateM(this.i, 0, (float) Math.toDegrees(d4), 1.0f, 0.0f, 0.0f);
            Matrix.rotateM(this.i, 0, (float) Math.toDegrees(d3), 0.0f, 1.0f, 0.0f);
            char c = 0;
            Matrix.transposeM(this.j, 0, fArr5, 0);
            float f21 = 0.0f;
            int i19 = 0;
            float f22 = -1.0f;
            while (i19 < 4) {
                float f23 = (i19 * 3.1415927f) / 2.0f;
                int i20 = i19;
                float cos = (float) (Math.cos(f15 - fArr3[c]) * Math.cos(f + f23));
                if (cos > f22) {
                    f22 = cos;
                    f21 = f23;
                }
                i19 = i20 + 1;
                c = 0;
            }
            float atan2 = (float) Math.atan2(Math.sin(f - this.y), Math.cos(f - this.y));
            if (this.A && max > 0.0f) {
                f9 = ((float) Math.hypot(atan2, f15 - this.z)) / max;
            } else {
                f9 = 0.596f;
            }
            this.y = f;
            this.z = f15;
            this.A = z2;
            float i21 = i(((0.41887903f / Math.max(f9, 0.001f)) - 0.06f) / 0.34f) * i(1.0f - (((float) Math.acos(Math.max(-1.0f, Math.min(1.0f, f22)))) / 0.20943952f));
            GLES20.glBindFramebuffer(36160, iArr[0]);
            GLES20.glViewport(0, 0, this.u, this.v);
            GLES20.glDepthMask(true);
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
            GLES20.glClear(16640);
            GLES20.glDisable(2929);
            GLES20.glDisable(2884);
            GLES20.glEnable(3042);
            GLES20.glBlendFunc(1, 771);
            float f24 = f13 / f14;
            float max4 = Math.max(1.0f, 1.0f / f24) * (1.52f / (0.9975f / fArr4[0]));
            float[] fArr6 = this.k;
            Matrix.setIdentityM(fArr6, 0);
            float f25 = 1.0f / (f24 * max4);
            fArr6[0] = f25;
            fArr6[5] = 1.0f / max4;
            float f26 = 1.0f / fArr3[i18];
            float f27 = -f26;
            float f28 = f27 / fArr3[1];
            fArr6[0] = f25 * this.s;
            float f29 = 0.12f / max4;
            fArr6[9] = f29 * f28;
            fArr6[10] = f27 / 6.0f;
            fArr6[11] = f28;
            fArr6[13] = f29 * f26;
            fArr6[14] = 0.5f * f26;
            fArr6[15] = f26;
            int[] iArr4 = this.a;
            h(f10, f21, i21, iArr4[0]);
            GLES20.glDisable(3042);
            GLES20.glEnable(2929);
            GLES20.glEnable(2884);
            GLES20.glDepthFunc(515);
            int[] iArr5 = this.b;
            GLES30.glBindVertexArray(iArr5[0]);
            int[] iArr6 = this.d;
            GLES20.glDrawArrays(4, 0, iArr6[0]);
            h(f10, f21, i21, iArr4[1]);
            GLES20.glEnable(3042);
            GLES20.glDisable(2884);
            GLES20.glDisable(2929);
            for (int i22 = 1; i22 <= i18; i22++) {
                GLES30.glBindVertexArray(iArr5[i22]);
                GLES30.glUniform1ui(e("baseInstance"), i22 - 1);
                int i23 = iArr6[i22];
                if (i22 == 1) {
                    i7 = 1;
                } else {
                    i7 = 7;
                }
                GLES30.glDrawArraysInstanced(4, 0, i23, i7);
            }
            GLES20.glBindFramebuffer(36008, iArr[0]);
            GLES20.glBindFramebuffer(36009, iArr[1]);
            int i24 = this.u;
            int i25 = this.v;
            GLES30.glBlitFramebuffer(0, 0, i24, i25, 0, 0, i24, i25, 16384, 9728);
            if (z) {
                GLES20.glBindFramebuffer(36160, iArr[1]);
                GLES30.glBindVertexArray(0);
                return;
            }
            d(f5, f6, i, i2);
        }
    }

    public final void d(float f, float f2, int i, int i2) {
        GLES20.glBindFramebuffer(36160, 0);
        GLES20.glViewport(0, 0, i, i2);
        GLES20.glDisable(3042);
        GLES20.glDisable(2929);
        int i3 = this.a[2];
        this.t = i3;
        GLES20.glUseProgram(i3);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.g[0]);
        GLES20.glUniform1i(e("image"), 0);
        GLES20.glUniform1f(e("opacity"), f);
        GLES20.glUniform1f(e("white"), f2);
        GLES30.glBindVertexArray(this.b[3]);
        GLES20.glDrawArrays(4, 0, 3);
        GLES30.glBindVertexArray(0);
        GLES20.glBindBuffer(34962, 0);
        GLES20.glEnable(2929);
    }

    public final int e(String str) {
        String str2 = this.t + ":" + str;
        HashMap hashMap = this.h;
        Integer num = (Integer) hashMap.get(str2);
        if (num == null) {
            num = Integer.valueOf(GLES20.glGetUniformLocation(this.t, str));
            hashMap.put(str2, num);
        }
        return num.intValue();
    }

    public final void f(String str, float[] fArr) {
        GLES20.glUniformMatrix4fv(e("u.".concat(str)), 1, false, fArr, 0);
    }

    public final void h(float f, float f2, float f3, int i) {
        this.t = i;
        GLES20.glUseProgram(i);
        f("model", this.i);
        f("inverseModel", this.j);
        f("projection", this.k);
        k("parameters", f, 0.72f, 1.0f, 1.0f);
        GLES20.glUniform4fv(e("u.facetProjection"), 1, this.q, 0);
        k("appearance", this.C, 0.0f, 0.0f, 0.0f);
        k("referenceCrownFlash", 0.0f, 0.0f, 0.0f, 0.0f);
        k("referencePavilionFlash", 0.0f, 0.0f, 0.0f, 0.0f);
        for (int i2 = 0; i2 < 8; i2++) {
            int e = e("anchors[" + i2 + "].position");
            int i3 = i2 << 3;
            float[] fArr = this.o;
            GLES20.glUniform4fv(e, 1, fArr, i3);
            GLES20.glUniform4fv(e("anchors[" + i2 + "].normal"), 1, fArr, i3 + 4);
        }
        k("viewport", this.u, this.v, 17.0f, 0.0f);
        int e2 = e("u.sparkleShape");
        float[] fArr2 = this.l;
        GLES20.glUniform4fv(e2, 1, fArr2, 36);
        k("sparkleHalo", fArr2[40], f2, this.s, f3);
        for (int i4 = 0; i4 < 9; i4++) {
            GLES20.glUniform4fv(e("u." + D[i4]), 1, fArr2, i4 << 2);
        }
        GLES20.glUniform4fv(e("planes[0]"), 17, this.n, 0);
    }

    public final void k(String str, float f, float f2, float f3, float f4) {
        GLES20.glUniform4f(e("u.".concat(str)), f, f2, f3, f4);
    }
}

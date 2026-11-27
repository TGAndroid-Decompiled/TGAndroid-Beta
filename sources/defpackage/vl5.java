package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
public final class vl5 extends yye {
    public static final xi4 b = new xi4((byte) 22);
    public static final xi4 c = new xi4((byte) 23);
    public final tl5 a;

    public vl5(tl5 tl5Var) {
        this.a = tl5Var;
    }

    public static jo d(ey7 ey7Var, int i, int i2) {
        int v;
        String str;
        byte[] copyOfRange;
        int A = ey7Var.A();
        Charset s = s(A);
        int i3 = i - 1;
        byte[] bArr = new byte[i3];
        ey7Var.k(0, i3, bArr);
        if (i2 == 2) {
            str = "image/" + jrd.c(new String(bArr, 0, 3, StandardCharsets.ISO_8859_1));
            if ("image/jpg".equals(str)) {
                str = "image/jpeg";
            }
            v = 2;
        } else {
            v = v(0, bArr);
            String c2 = jrd.c(new String(bArr, 0, v, StandardCharsets.ISO_8859_1));
            if (c2.indexOf(47) == -1) {
                str = "image/".concat(c2);
            } else {
                str = c2;
            }
        }
        int i4 = bArr[v + 1] & 255;
        int i5 = v + 2;
        int u = u(i5, A, bArr);
        String str2 = new String(bArr, i5, u - i5, s);
        int r = r(A) + u;
        if (i3 <= r) {
            copyOfRange = gcc.b;
        } else {
            copyOfRange = Arrays.copyOfRange(bArr, r, i3);
        }
        return new jo(i4, str, str2, copyOfRange);
    }

    public static sj1 e(ey7 ey7Var, int i, int i2, boolean z, int i3, tl5 tl5Var) {
        long j;
        int i4 = ey7Var.b;
        int v = v(i4, ey7Var.a);
        String str = new String(ey7Var.a, i4, v - i4, StandardCharsets.ISO_8859_1);
        ey7Var.N(v + 1);
        int m = ey7Var.m();
        int m2 = ey7Var.m();
        if (m > m2) {
            return null;
        }
        long C = ey7Var.C();
        if (C == 4294967295L) {
            C = -1;
        }
        long C2 = ey7Var.C();
        if (C2 == 4294967295L) {
            j = -1;
        } else {
            j = C2;
        }
        ArrayList arrayList = new ArrayList();
        int i5 = i4 + i;
        while (ey7Var.b < i5) {
            wl5 h = h(i2, ey7Var, z, i3, tl5Var);
            if (h != null) {
                arrayList.add(h);
            }
        }
        return new sj1(str, m, m2, C, j, (wl5[]) arrayList.toArray(new wl5[0]));
    }

    public static uj1 f(ey7 ey7Var, int i, int i2, boolean z, int i3, tl5 tl5Var) {
        boolean z2;
        boolean z3;
        int i4 = ey7Var.b;
        int v = v(i4, ey7Var.a);
        String str = new String(ey7Var.a, i4, v - i4, StandardCharsets.ISO_8859_1);
        ey7Var.N(v + 1);
        int A = ey7Var.A();
        if ((A & 2) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((A & 1) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        int A2 = ey7Var.A();
        String[] strArr = new String[A2];
        for (int i5 = 0; i5 < A2; i5++) {
            int i6 = ey7Var.b;
            int v2 = v(i6, ey7Var.a);
            strArr[i5] = new String(ey7Var.a, i6, v2 - i6, StandardCharsets.ISO_8859_1);
            ey7Var.N(v2 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i7 = i4 + i;
        while (ey7Var.b < i7) {
            wl5 h = h(i2, ey7Var, z, i3, tl5Var);
            if (h != null) {
                arrayList.add(h);
            }
        }
        return new uj1(str, z2, z3, strArr, (wl5[]) arrayList.toArray(new wl5[0]));
    }

    public static en2 g(int i, ey7 ey7Var) {
        if (i < 4) {
            return null;
        }
        int A = ey7Var.A();
        Charset s = s(A);
        byte[] bArr = new byte[3];
        ey7Var.k(0, 3, bArr);
        String str = new String(bArr, 0, 3);
        int i2 = i - 4;
        byte[] bArr2 = new byte[i2];
        ey7Var.k(0, i2, bArr2);
        int u = u(0, A, bArr2);
        String str2 = new String(bArr2, 0, u, s);
        int r = r(A) + u;
        return new en2(str, str2, l(bArr2, r, u(r, A, bArr2), s));
    }

    public static defpackage.wl5 h(int r19, defpackage.ey7 r20, boolean r21, int r22, defpackage.tl5 r23) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vl5.h(int, ey7, boolean, int, tl5):wl5");
    }

    public static ou4 i(int i, ey7 ey7Var) {
        byte[] copyOfRange;
        int A = ey7Var.A();
        Charset s = s(A);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        ey7Var.k(0, i2, bArr);
        int v = v(0, bArr);
        String n = eg7.n(new String(bArr, 0, v, StandardCharsets.ISO_8859_1));
        int i3 = v + 1;
        int u = u(i3, A, bArr);
        String l = l(bArr, i3, u, s);
        int r = r(A) + u;
        int u2 = u(r, A, bArr);
        String l2 = l(bArr, r, u2, s);
        int r2 = r(A) + u2;
        if (i2 <= r2) {
            copyOfRange = gcc.b;
        } else {
            copyOfRange = Arrays.copyOfRange(bArr, r2, i2);
        }
        return new ou4(n, copyOfRange, l, l2);
    }

    public static ng7 j(int i, ey7 ey7Var) {
        int H = ey7Var.H();
        int D = ey7Var.D();
        int D2 = ey7Var.D();
        int A = ey7Var.A();
        int A2 = ey7Var.A();
        zd1 zd1Var = new zd1();
        zd1Var.k(ey7Var);
        int i2 = ((i - 10) << 3) / (A + A2);
        int[] iArr = new int[i2];
        int[] iArr2 = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int f = zd1Var.f(A);
            int f2 = zd1Var.f(A2);
            iArr[i3] = f;
            iArr2[i3] = f2;
        }
        return new ng7(H, D, D2, iArr, iArr2);
    }

    public static ym8 k(int i, ey7 ey7Var) {
        byte[] copyOfRange;
        byte[] bArr = new byte[i];
        ey7Var.k(0, i, bArr);
        int v = v(0, bArr);
        String str = new String(bArr, 0, v, StandardCharsets.ISO_8859_1);
        int i2 = v + 1;
        if (i <= i2) {
            copyOfRange = gcc.b;
        } else {
            copyOfRange = Arrays.copyOfRange(bArr, i2, i);
        }
        return new ym8(str, copyOfRange);
    }

    public static String l(byte[] bArr, int i, int i2, Charset charset) {
        if (i2 > i && i2 <= bArr.length) {
            return new String(bArr, i, i2 - i, charset);
        }
        return "";
    }

    public static jlb m(int i, ey7 ey7Var, String str) {
        if (i < 1) {
            return null;
        }
        int A = ey7Var.A();
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        ey7Var.k(0, i2, bArr);
        return new jlb(str, null, n(A, 0, bArr));
    }

    public static j99 n(int i, int i2, byte[] bArr) {
        if (i2 >= bArr.length) {
            return po5.u("");
        }
        mo5 p = po5.p();
        int u = u(i2, i, bArr);
        while (i2 < u) {
            p.c(new String(bArr, i2, u - i2, s(i)));
            i2 = r(i) + u;
            u = u(i2, i, bArr);
        }
        j99 f = p.f();
        if (f.isEmpty()) {
            return po5.u("");
        }
        return f;
    }

    public static jlb o(int i, ey7 ey7Var) {
        if (i < 1) {
            return null;
        }
        int A = ey7Var.A();
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        ey7Var.k(0, i2, bArr);
        int u = u(0, A, bArr);
        return new jlb("TXXX", new String(bArr, 0, u, s(A)), n(A, r(A) + u, bArr));
    }

    public static sac p(int i, ey7 ey7Var, String str) {
        byte[] bArr = new byte[i];
        ey7Var.k(0, i, bArr);
        return new sac(str, null, new String(bArr, 0, v(0, bArr), StandardCharsets.ISO_8859_1));
    }

    public static sac q(int i, ey7 ey7Var) {
        if (i < 1) {
            return null;
        }
        int A = ey7Var.A();
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        ey7Var.k(0, i2, bArr);
        int u = u(0, A, bArr);
        String str = new String(bArr, 0, u, s(A));
        int r = r(A) + u;
        return new sac("WXXX", str, l(bArr, r, v(r, bArr), StandardCharsets.ISO_8859_1));
    }

    public static int r(int i) {
        if (i != 0 && i != 3) {
            return 2;
        }
        return 1;
    }

    public static Charset s(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return StandardCharsets.ISO_8859_1;
                }
                return StandardCharsets.UTF_8;
            }
            return StandardCharsets.UTF_16BE;
        }
        return StandardCharsets.UTF_16;
    }

    public static String t(int i, int i2, int i3, int i4, int i5) {
        if (i == 2) {
            return String.format(Locale.US, "%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
        }
        return String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
    }

    public static int u(int i, int i2, byte[] bArr) {
        int v = v(i, bArr);
        if (i2 != 0 && i2 != 3) {
            while (v < bArr.length - 1) {
                if ((v - i) % 2 == 0 && bArr[v + 1] == 0) {
                    return v;
                }
                v = v(v + 1, bArr);
            }
            return bArr.length;
        }
        return v;
    }

    public static int v(int i, byte[] bArr) {
        while (i < bArr.length) {
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
        return bArr.length;
    }

    public static int w(int i, ey7 ey7Var) {
        byte[] bArr = ey7Var.a;
        int i2 = ey7Var.b;
        int i3 = i2;
        while (true) {
            int i4 = i3 + 1;
            if (i4 < i2 + i) {
                if ((bArr[i3] & 255) == 255 && bArr[i4] == 0) {
                    System.arraycopy(bArr, i3 + 2, bArr, i4, (i - (i3 - i2)) - 2);
                    i--;
                }
                i3 = i4;
            } else {
                return i;
            }
        }
    }

    public static boolean x(defpackage.ey7 r18, int r19, int r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vl5.x(ey7, int, int, boolean):boolean");
    }

    @Override
    public final vf7 b(xf7 xf7Var, ByteBuffer byteBuffer) {
        return c(byteBuffer.limit(), byteBuffer.array());
    }

    public final defpackage.vf7 c(int r13, byte[] r14) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vl5.c(int, byte[]):vf7");
    }
}

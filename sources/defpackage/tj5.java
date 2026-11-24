package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
public final class tj5 extends fue {
    public static final wn4 b = new wn4((byte) 10);
    public static final wn4 c = new wn4((byte) 11);
    public final rj5 a;

    public tj5(rj5 rj5Var) {
        this.a = rj5Var;
    }

    public static io d(xu7 xu7Var, int i, int i2) {
        int v;
        String str;
        byte[] copyOfRange;
        int A = xu7Var.A();
        Charset s = s(A);
        int i3 = i - 1;
        byte[] bArr = new byte[i3];
        xu7Var.k(0, i3, bArr);
        if (i2 == 2) {
            str = "image/" + smd.c(new String(bArr, 0, 3, StandardCharsets.ISO_8859_1));
            if ("image/jpg".equals(str)) {
                str = "image/jpeg";
            }
            v = 2;
        } else {
            v = v(0, bArr);
            String c2 = smd.c(new String(bArr, 0, v, StandardCharsets.ISO_8859_1));
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
            copyOfRange = g8c.b;
        } else {
            copyOfRange = Arrays.copyOfRange(bArr, r, i3);
        }
        return new io(i4, str, str2, copyOfRange);
    }

    public static jj1 e(xu7 xu7Var, int i, int i2, boolean z, int i3, rj5 rj5Var) {
        long j;
        int i4 = xu7Var.b;
        int v = v(i4, xu7Var.a);
        String str = new String(xu7Var.a, i4, v - i4, StandardCharsets.ISO_8859_1);
        xu7Var.N(v + 1);
        int m = xu7Var.m();
        int m2 = xu7Var.m();
        if (m > m2) {
            return null;
        }
        long C = xu7Var.C();
        if (C == 4294967295L) {
            C = -1;
        }
        long C2 = xu7Var.C();
        if (C2 == 4294967295L) {
            j = -1;
        } else {
            j = C2;
        }
        ArrayList arrayList = new ArrayList();
        int i5 = i4 + i;
        while (xu7Var.b < i5) {
            uj5 h = h(i2, xu7Var, z, i3, rj5Var);
            if (h != null) {
                arrayList.add(h);
            }
        }
        return new jj1(str, m, m2, C, j, (uj5[]) arrayList.toArray(new uj5[0]));
    }

    public static lj1 f(xu7 xu7Var, int i, int i2, boolean z, int i3, rj5 rj5Var) {
        boolean z2;
        boolean z3;
        int i4 = xu7Var.b;
        int v = v(i4, xu7Var.a);
        String str = new String(xu7Var.a, i4, v - i4, StandardCharsets.ISO_8859_1);
        xu7Var.N(v + 1);
        int A = xu7Var.A();
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
        int A2 = xu7Var.A();
        String[] strArr = new String[A2];
        for (int i5 = 0; i5 < A2; i5++) {
            int i6 = xu7Var.b;
            int v2 = v(i6, xu7Var.a);
            strArr[i5] = new String(xu7Var.a, i6, v2 - i6, StandardCharsets.ISO_8859_1);
            xu7Var.N(v2 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i7 = i4 + i;
        while (xu7Var.b < i7) {
            uj5 h = h(i2, xu7Var, z, i3, rj5Var);
            if (h != null) {
                arrayList.add(h);
            }
        }
        return new lj1(str, z2, z3, strArr, (uj5[]) arrayList.toArray(new uj5[0]));
    }

    public static km2 g(int i, xu7 xu7Var) {
        if (i < 4) {
            return null;
        }
        int A = xu7Var.A();
        Charset s = s(A);
        byte[] bArr = new byte[3];
        xu7Var.k(0, 3, bArr);
        String str = new String(bArr, 0, 3);
        int i2 = i - 4;
        byte[] bArr2 = new byte[i2];
        xu7Var.k(0, i2, bArr2);
        int u = u(0, A, bArr2);
        String str2 = new String(bArr2, 0, u, s);
        int r = r(A) + u;
        return new km2(str, str2, l(bArr2, r, u(r, A, bArr2), s));
    }

    public static defpackage.uj5 h(int r19, defpackage.xu7 r20, boolean r21, int r22, defpackage.rj5 r23) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tj5.h(int, xu7, boolean, int, rj5):uj5");
    }

    public static ks4 i(int i, xu7 xu7Var) {
        byte[] copyOfRange;
        int A = xu7Var.A();
        Charset s = s(A);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        xu7Var.k(0, i2, bArr);
        int v = v(0, bArr);
        String n = ud7.n(new String(bArr, 0, v, StandardCharsets.ISO_8859_1));
        int i3 = v + 1;
        int u = u(i3, A, bArr);
        String l = l(bArr, i3, u, s);
        int r = r(A) + u;
        int u2 = u(r, A, bArr);
        String l2 = l(bArr, r, u2, s);
        int r2 = r(A) + u2;
        if (i2 <= r2) {
            copyOfRange = g8c.b;
        } else {
            copyOfRange = Arrays.copyOfRange(bArr, r2, i2);
        }
        return new ks4(n, copyOfRange, l, l2);
    }

    public static de7 j(int i, xu7 xu7Var) {
        int H = xu7Var.H();
        int D = xu7Var.D();
        int D2 = xu7Var.D();
        int A = xu7Var.A();
        int A2 = xu7Var.A();
        qd1 qd1Var = new qd1();
        qd1Var.k(xu7Var);
        int i2 = ((i - 10) << 3) / (A + A2);
        int[] iArr = new int[i2];
        int[] iArr2 = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int f = qd1Var.f(A);
            int f2 = qd1Var.f(A2);
            iArr[i3] = f;
            iArr2[i3] = f2;
        }
        return new de7(H, D, D2, iArr, iArr2);
    }

    public static lj8 k(int i, xu7 xu7Var) {
        byte[] copyOfRange;
        byte[] bArr = new byte[i];
        xu7Var.k(0, i, bArr);
        int v = v(0, bArr);
        String str = new String(bArr, 0, v, StandardCharsets.ISO_8859_1);
        int i2 = v + 1;
        if (i <= i2) {
            copyOfRange = g8c.b;
        } else {
            copyOfRange = Arrays.copyOfRange(bArr, i2, i);
        }
        return new lj8(str, copyOfRange);
    }

    public static String l(byte[] bArr, int i, int i2, Charset charset) {
        if (i2 > i && i2 <= bArr.length) {
            return new String(bArr, i, i2 - i, charset);
        }
        return "";
    }

    public static nhb m(int i, xu7 xu7Var, String str) {
        if (i < 1) {
            return null;
        }
        int A = xu7Var.A();
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        xu7Var.k(0, i2, bArr);
        return new nhb(str, null, n(A, 0, bArr));
    }

    public static w59 n(int i, int i2, byte[] bArr) {
        if (i2 >= bArr.length) {
            return mm5.u("");
        }
        jm5 p = mm5.p();
        int u = u(i2, i, bArr);
        while (i2 < u) {
            p.c(new String(bArr, i2, u - i2, s(i)));
            i2 = r(i) + u;
            u = u(i2, i, bArr);
        }
        w59 f = p.f();
        if (f.isEmpty()) {
            return mm5.u("");
        }
        return f;
    }

    public static nhb o(int i, xu7 xu7Var) {
        if (i < 1) {
            return null;
        }
        int A = xu7Var.A();
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        xu7Var.k(0, i2, bArr);
        int u = u(0, A, bArr);
        return new nhb("TXXX", new String(bArr, 0, u, s(A)), n(A, r(A) + u, bArr));
    }

    public static s6c p(int i, xu7 xu7Var, String str) {
        byte[] bArr = new byte[i];
        xu7Var.k(0, i, bArr);
        return new s6c(str, null, new String(bArr, 0, v(0, bArr), StandardCharsets.ISO_8859_1));
    }

    public static s6c q(int i, xu7 xu7Var) {
        if (i < 1) {
            return null;
        }
        int A = xu7Var.A();
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        xu7Var.k(0, i2, bArr);
        int u = u(0, A, bArr);
        String str = new String(bArr, 0, u, s(A));
        int r = r(A) + u;
        return new s6c("WXXX", str, l(bArr, r, v(r, bArr), StandardCharsets.ISO_8859_1));
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

    public static int w(int i, xu7 xu7Var) {
        byte[] bArr = xu7Var.a;
        int i2 = xu7Var.b;
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

    public static boolean x(defpackage.xu7 r18, int r19, int r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tj5.x(xu7, int, int, boolean):boolean");
    }

    @Override
    public final ld7 b(nd7 nd7Var, ByteBuffer byteBuffer) {
        return c(byteBuffer.limit(), byteBuffer.array());
    }

    public final defpackage.ld7 c(int r13, byte[] r14) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tj5.c(int, byte[]):ld7");
    }
}

package defpackage;

import android.util.Pair;
import java.nio.charset.StandardCharsets;
public abstract class ry0 {
    public static final byte[] a;

    static {
        String str = g8c.a;
        a = "OpusHead".getBytes(StandardCharsets.UTF_8);
    }

    public static void a(xu7 xu7Var) {
        int i = xu7Var.b;
        xu7Var.O(4);
        if (xu7Var.m() != 1751411826) {
            i += 4;
        }
        xu7Var.N(i);
    }

    public static void b(defpackage.xu7 r48, int r49, int r50, int r51, int r52, java.lang.String r53, boolean r54, defpackage.qq3 r55, defpackage.ny0 r56, int r57) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ry0.b(xu7, int, int, int, int, java.lang.String, boolean, qq3, ny0, int):void");
    }

    public static ly0 c(int i, xu7 xu7Var) {
        long j;
        xu7Var.N(i + 12);
        xu7Var.O(1);
        d(xu7Var);
        xu7Var.O(2);
        int A = xu7Var.A();
        if ((A & 128) != 0) {
            xu7Var.O(2);
        }
        if ((A & 64) != 0) {
            xu7Var.O(xu7Var.A());
        }
        if ((A & 32) != 0) {
            xu7Var.O(2);
        }
        xu7Var.O(1);
        d(xu7Var);
        String e = ud7.e(xu7Var.A());
        if (!"audio/mpeg".equals(e) && !"audio/vnd.dts".equals(e) && !"audio/vnd.dts.hd".equals(e)) {
            xu7Var.O(4);
            long C = xu7Var.C();
            long C2 = xu7Var.C();
            xu7Var.O(1);
            int d = d(xu7Var);
            long j2 = C2;
            byte[] bArr = new byte[d];
            xu7Var.k(0, d, bArr);
            if (j2 <= 0) {
                j2 = -1;
            }
            if (C > 0) {
                j = C;
            } else {
                j = -1;
            }
            return new ly0(e, bArr, j2, j);
        }
        return new ly0(e, null, -1L, -1L);
    }

    public static int d(xu7 xu7Var) {
        int A = xu7Var.A();
        int i = A & 127;
        while ((A & 128) == 128) {
            A = xu7Var.A();
            i = (i << 7) | (A & 127);
        }
        return i;
    }

    public static int e(int i) {
        return (i >> 24) & 255;
    }

    public static defpackage.ld7 f(defpackage.lf7 r14) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ry0.f(lf7):ld7");
    }

    public static rf7 g(xu7 xu7Var) {
        long u;
        long u2;
        xu7Var.N(8);
        if (e(xu7Var.m()) == 0) {
            u = xu7Var.C();
            u2 = xu7Var.C();
        } else {
            u = xu7Var.u();
            u2 = xu7Var.u();
        }
        return new rf7(u, u2, xu7Var.C());
    }

    public static Pair h(xu7 xu7Var, int i, int i2) {
        boolean z;
        boolean z2;
        boolean z3;
        Integer num;
        qxb qxbVar;
        Pair create;
        int i3;
        int i4;
        Integer num2;
        boolean z4;
        int i5 = xu7Var.b;
        while (i5 - i < i2) {
            xu7Var.N(i5);
            int m = xu7Var.m();
            boolean z5 = false;
            if (m > 0) {
                z = true;
            } else {
                z = false;
            }
            yfe.a("childAtomSize must be positive", z);
            if (xu7Var.m() == 1936289382) {
                int i6 = i5 + 8;
                int i7 = 0;
                int i8 = -1;
                Integer num3 = null;
                String str = null;
                while (i6 - i5 < m) {
                    xu7Var.N(i6);
                    int m2 = xu7Var.m();
                    int m3 = xu7Var.m();
                    if (m3 == 1718775137) {
                        num3 = Integer.valueOf(xu7Var.m());
                    } else if (m3 == 1935894637) {
                        xu7Var.O(4);
                        str = xu7Var.y(4, StandardCharsets.UTF_8);
                    } else if (m3 == 1935894633) {
                        i8 = i6;
                        i7 = m2;
                    }
                    i6 += m2;
                }
                byte[] bArr = null;
                if (!"cenc".equals(str) && !"cbc1".equals(str) && !"cens".equals(str) && !"cbcs".equals(str)) {
                    create = null;
                } else {
                    if (num3 != null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    yfe.a("frma atom is mandatory", z2);
                    if (i8 != -1) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    yfe.a("schi atom is mandatory", z3);
                    int i9 = i8 + 8;
                    while (true) {
                        if (i9 - i8 < i7) {
                            xu7Var.N(i9);
                            int m4 = xu7Var.m();
                            if (xu7Var.m() == 1952804451) {
                                int e = e(xu7Var.m());
                                xu7Var.O(1);
                                if (e == 0) {
                                    xu7Var.O(1);
                                    i4 = 0;
                                    i3 = 0;
                                } else {
                                    int A = xu7Var.A();
                                    i3 = A & 15;
                                    i4 = (A & 240) >> 4;
                                }
                                if (xu7Var.A() == 1) {
                                    num2 = num3;
                                    z4 = true;
                                } else {
                                    num2 = num3;
                                    z4 = false;
                                }
                                int A2 = xu7Var.A();
                                byte[] bArr2 = new byte[16];
                                xu7Var.k(0, 16, bArr2);
                                if (z4 && A2 == 0) {
                                    int A3 = xu7Var.A();
                                    byte[] bArr3 = new byte[A3];
                                    xu7Var.k(0, A3, bArr3);
                                    bArr = bArr3;
                                }
                                num = num2;
                                qxbVar = new qxb(z4, str, A2, bArr2, i4, i3, bArr);
                            } else {
                                i9 += m4;
                            }
                        } else {
                            num = num3;
                            qxbVar = null;
                            break;
                        }
                    }
                    if (qxbVar != null) {
                        z5 = true;
                    }
                    yfe.a("tenc atom is mandatory", z5);
                    String str2 = g8c.a;
                    create = Pair.create(num, qxbVar);
                }
                if (create != null) {
                    return create;
                }
            }
            i5 += m;
        }
        return null;
    }

    public static defpackage.ny0 i(defpackage.xu7 r62, defpackage.py0 r63, java.lang.String r64, defpackage.qq3 r65, boolean r66) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ry0.i(xu7, py0, java.lang.String, qq3, boolean):ny0");
    }

    public static java.util.ArrayList j(defpackage.lf7 r58, defpackage.zr4 r59, long r60, defpackage.qq3 r62, boolean r63, boolean r64, defpackage.aq4 r65, boolean r66) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ry0.j(lf7, zr4, long, qq3, boolean, boolean, aq4, boolean):java.util.ArrayList");
    }

    public static defpackage.ld7 k(defpackage.mf7 r24, boolean r25) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ry0.k(mf7, boolean):ld7");
    }
}

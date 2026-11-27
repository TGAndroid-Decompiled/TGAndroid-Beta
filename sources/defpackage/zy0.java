package defpackage;

import android.util.Pair;
import java.nio.charset.StandardCharsets;
public abstract class zy0 {
    public static final byte[] a;

    static {
        String str = gcc.a;
        a = "OpusHead".getBytes(StandardCharsets.UTF_8);
    }

    public static void a(ey7 ey7Var) {
        int i = ey7Var.b;
        ey7Var.O(4);
        if (ey7Var.m() != 1751411826) {
            i += 4;
        }
        ey7Var.N(i);
    }

    public static void b(defpackage.ey7 r48, int r49, int r50, int r51, int r52, java.lang.String r53, boolean r54, defpackage.hr3 r55, defpackage.vy0 r56, int r57) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zy0.b(ey7, int, int, int, int, java.lang.String, boolean, hr3, vy0, int):void");
    }

    public static ty0 c(int i, ey7 ey7Var) {
        long j;
        ey7Var.N(i + 12);
        ey7Var.O(1);
        d(ey7Var);
        ey7Var.O(2);
        int A = ey7Var.A();
        if ((A & 128) != 0) {
            ey7Var.O(2);
        }
        if ((A & 64) != 0) {
            ey7Var.O(ey7Var.A());
        }
        if ((A & 32) != 0) {
            ey7Var.O(2);
        }
        ey7Var.O(1);
        d(ey7Var);
        String e = eg7.e(ey7Var.A());
        if (!"audio/mpeg".equals(e) && !"audio/vnd.dts".equals(e) && !"audio/vnd.dts.hd".equals(e)) {
            ey7Var.O(4);
            long C = ey7Var.C();
            long C2 = ey7Var.C();
            ey7Var.O(1);
            int d = d(ey7Var);
            long j2 = C2;
            byte[] bArr = new byte[d];
            ey7Var.k(0, d, bArr);
            if (j2 <= 0) {
                j2 = -1;
            }
            if (C > 0) {
                j = C;
            } else {
                j = -1;
            }
            return new ty0(e, bArr, j2, j);
        }
        return new ty0(e, null, -1L, -1L);
    }

    public static int d(ey7 ey7Var) {
        int A = ey7Var.A();
        int i = A & 127;
        while ((A & 128) == 128) {
            A = ey7Var.A();
            i = (i << 7) | (A & 127);
        }
        return i;
    }

    public static int e(int i) {
        return (i >> 24) & 255;
    }

    public static defpackage.vf7 f(defpackage.vh7 r14) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zy0.f(vh7):vf7");
    }

    public static bi7 g(ey7 ey7Var) {
        long u;
        long u2;
        ey7Var.N(8);
        if (e(ey7Var.m()) == 0) {
            u = ey7Var.C();
            u2 = ey7Var.C();
        } else {
            u = ey7Var.u();
            u2 = ey7Var.u();
        }
        return new bi7(u, u2, ey7Var.C());
    }

    public static Pair h(ey7 ey7Var, int i, int i2) {
        boolean z;
        boolean z2;
        boolean z3;
        Integer num;
        r1c r1cVar;
        Pair create;
        int i3;
        int i4;
        Integer num2;
        boolean z4;
        int i5 = ey7Var.b;
        while (i5 - i < i2) {
            ey7Var.N(i5);
            int m = ey7Var.m();
            boolean z5 = false;
            if (m > 0) {
                z = true;
            } else {
                z = false;
            }
            pke.a("childAtomSize must be positive", z);
            if (ey7Var.m() == 1936289382) {
                int i6 = i5 + 8;
                int i7 = 0;
                int i8 = -1;
                Integer num3 = null;
                String str = null;
                while (i6 - i5 < m) {
                    ey7Var.N(i6);
                    int m2 = ey7Var.m();
                    int m3 = ey7Var.m();
                    if (m3 == 1718775137) {
                        num3 = Integer.valueOf(ey7Var.m());
                    } else if (m3 == 1935894637) {
                        ey7Var.O(4);
                        str = ey7Var.y(4, StandardCharsets.UTF_8);
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
                    pke.a("frma atom is mandatory", z2);
                    if (i8 != -1) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    pke.a("schi atom is mandatory", z3);
                    int i9 = i8 + 8;
                    while (true) {
                        if (i9 - i8 < i7) {
                            ey7Var.N(i9);
                            int m4 = ey7Var.m();
                            if (ey7Var.m() == 1952804451) {
                                int e = e(ey7Var.m());
                                ey7Var.O(1);
                                if (e == 0) {
                                    ey7Var.O(1);
                                    i4 = 0;
                                    i3 = 0;
                                } else {
                                    int A = ey7Var.A();
                                    i3 = A & 15;
                                    i4 = (A & 240) >> 4;
                                }
                                if (ey7Var.A() == 1) {
                                    num2 = num3;
                                    z4 = true;
                                } else {
                                    num2 = num3;
                                    z4 = false;
                                }
                                int A2 = ey7Var.A();
                                byte[] bArr2 = new byte[16];
                                ey7Var.k(0, 16, bArr2);
                                if (z4 && A2 == 0) {
                                    int A3 = ey7Var.A();
                                    byte[] bArr3 = new byte[A3];
                                    ey7Var.k(0, A3, bArr3);
                                    bArr = bArr3;
                                }
                                num = num2;
                                r1cVar = new r1c(z4, str, A2, bArr2, i4, i3, bArr);
                            } else {
                                i9 += m4;
                            }
                        } else {
                            num = num3;
                            r1cVar = null;
                            break;
                        }
                    }
                    if (r1cVar != null) {
                        z5 = true;
                    }
                    pke.a("tenc atom is mandatory", z5);
                    String str2 = gcc.a;
                    create = Pair.create(num, r1cVar);
                }
                if (create != null) {
                    return create;
                }
            }
            i5 += m;
        }
        return null;
    }

    public static defpackage.vy0 i(defpackage.ey7 r62, defpackage.xy0 r63, java.lang.String r64, defpackage.hr3 r65, boolean r66) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zy0.i(ey7, xy0, java.lang.String, hr3, boolean):vy0");
    }

    public static java.util.ArrayList j(defpackage.vh7 r58, defpackage.du4 r59, long r60, defpackage.hr3 r62, boolean r63, boolean r64, defpackage.es4 r65, boolean r66) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zy0.j(vh7, du4, long, hr3, boolean, boolean, es4, boolean):java.util.ArrayList");
    }

    public static defpackage.vf7 k(defpackage.wh7 r24, boolean r25) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zy0.k(wh7, boolean):vf7");
    }
}

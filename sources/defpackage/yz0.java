package defpackage;

import android.util.Pair;
import java.nio.charset.StandardCharsets;
public abstract class yz0 {
    public static final byte[] a;

    static {
        String str = hac.a;
        a = "OpusHead".getBytes(StandardCharsets.UTF_8);
    }

    public static void a(yw7 yw7Var) {
        int i = yw7Var.b;
        yw7Var.O(4);
        if (yw7Var.m() != 1751411826) {
            i += 4;
        }
        yw7Var.N(i);
    }

    public static void b(defpackage.yw7 r48, int r49, int r50, int r51, int r52, java.lang.String r53, boolean r54, defpackage.as3 r55, defpackage.uz0 r56, int r57) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yz0.b(yw7, int, int, int, int, java.lang.String, boolean, as3, uz0, int):void");
    }

    public static sz0 c(int i, yw7 yw7Var) {
        long j;
        yw7Var.N(i + 12);
        yw7Var.O(1);
        d(yw7Var);
        yw7Var.O(2);
        int A = yw7Var.A();
        if ((A & 128) != 0) {
            yw7Var.O(2);
        }
        if ((A & 64) != 0) {
            yw7Var.O(yw7Var.A());
        }
        if ((A & 32) != 0) {
            yw7Var.O(2);
        }
        yw7Var.O(1);
        d(yw7Var);
        String e = wf7.e(yw7Var.A());
        if (!"audio/mpeg".equals(e) && !"audio/vnd.dts".equals(e) && !"audio/vnd.dts.hd".equals(e)) {
            yw7Var.O(4);
            long C = yw7Var.C();
            long C2 = yw7Var.C();
            yw7Var.O(1);
            int d = d(yw7Var);
            long j2 = C2;
            byte[] bArr = new byte[d];
            yw7Var.k(0, d, bArr);
            if (j2 <= 0) {
                j2 = -1;
            }
            if (C > 0) {
                j = C;
            } else {
                j = -1;
            }
            return new sz0(e, bArr, j2, j);
        }
        return new sz0(e, null, -1L, -1L);
    }

    public static int d(yw7 yw7Var) {
        int A = yw7Var.A();
        int i = A & 127;
        while ((A & 128) == 128) {
            A = yw7Var.A();
            i = (i << 7) | (A & 127);
        }
        return i;
    }

    public static int e(int i) {
        return (i >> 24) & 255;
    }

    public static defpackage.nf7 f(defpackage.oh7 r14) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yz0.f(oh7):nf7");
    }

    public static uh7 g(yw7 yw7Var) {
        long u;
        long u2;
        yw7Var.N(8);
        if (e(yw7Var.m()) == 0) {
            u = yw7Var.C();
            u2 = yw7Var.C();
        } else {
            u = yw7Var.u();
            u2 = yw7Var.u();
        }
        return new uh7(u, u2, yw7Var.C());
    }

    public static Pair h(yw7 yw7Var, int i, int i2) {
        boolean z;
        boolean z2;
        boolean z3;
        Integer num;
        szb szbVar;
        Pair create;
        int i3;
        int i4;
        Integer num2;
        boolean z4;
        int i5 = yw7Var.b;
        while (i5 - i < i2) {
            yw7Var.N(i5);
            int m = yw7Var.m();
            boolean z5 = false;
            if (m > 0) {
                z = true;
            } else {
                z = false;
            }
            zhe.a("childAtomSize must be positive", z);
            if (yw7Var.m() == 1936289382) {
                int i6 = i5 + 8;
                int i7 = 0;
                int i8 = -1;
                Integer num3 = null;
                String str = null;
                while (i6 - i5 < m) {
                    yw7Var.N(i6);
                    int m2 = yw7Var.m();
                    int m3 = yw7Var.m();
                    if (m3 == 1718775137) {
                        num3 = Integer.valueOf(yw7Var.m());
                    } else if (m3 == 1935894637) {
                        yw7Var.O(4);
                        str = yw7Var.y(4, StandardCharsets.UTF_8);
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
                    zhe.a("frma atom is mandatory", z2);
                    if (i8 != -1) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    zhe.a("schi atom is mandatory", z3);
                    int i9 = i8 + 8;
                    while (true) {
                        if (i9 - i8 < i7) {
                            yw7Var.N(i9);
                            int m4 = yw7Var.m();
                            if (yw7Var.m() == 1952804451) {
                                int e = e(yw7Var.m());
                                yw7Var.O(1);
                                if (e == 0) {
                                    yw7Var.O(1);
                                    i4 = 0;
                                    i3 = 0;
                                } else {
                                    int A = yw7Var.A();
                                    i3 = A & 15;
                                    i4 = (A & 240) >> 4;
                                }
                                if (yw7Var.A() == 1) {
                                    num2 = num3;
                                    z4 = true;
                                } else {
                                    num2 = num3;
                                    z4 = false;
                                }
                                int A2 = yw7Var.A();
                                byte[] bArr2 = new byte[16];
                                yw7Var.k(0, 16, bArr2);
                                if (z4 && A2 == 0) {
                                    int A3 = yw7Var.A();
                                    byte[] bArr3 = new byte[A3];
                                    yw7Var.k(0, A3, bArr3);
                                    bArr = bArr3;
                                }
                                num = num2;
                                szbVar = new szb(z4, str, A2, bArr2, i4, i3, bArr);
                            } else {
                                i9 += m4;
                            }
                        } else {
                            num = num3;
                            szbVar = null;
                            break;
                        }
                    }
                    if (szbVar != null) {
                        z5 = true;
                    }
                    zhe.a("tenc atom is mandatory", z5);
                    String str2 = hac.a;
                    create = Pair.create(num, szbVar);
                }
                if (create != null) {
                    return create;
                }
            }
            i5 += m;
        }
        return null;
    }

    public static defpackage.uz0 i(defpackage.yw7 r62, defpackage.wz0 r63, java.lang.String r64, defpackage.as3 r65, boolean r66) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yz0.i(yw7, wz0, java.lang.String, as3, boolean):uz0");
    }

    public static java.util.ArrayList j(defpackage.oh7 r58, defpackage.au4 r59, long r60, defpackage.as3 r62, boolean r63, boolean r64, defpackage.bs4 r65, boolean r66) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yz0.j(oh7, au4, long, as3, boolean, boolean, bs4, boolean):java.util.ArrayList");
    }

    public static defpackage.nf7 k(defpackage.ph7 r24, boolean r25) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yz0.k(ph7, boolean):nf7");
    }
}

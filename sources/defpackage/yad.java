package defpackage;

import j$.util.Objects;
import java.util.Arrays;
public abstract class yad {
    public static final byte[] a = {0, 0, 0, 1};
    public static final float[] b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
    public static final Object c = new Object();
    public static int[] d = new int[10];

    public static void a(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static int b(byte[] bArr, int i, int i2, boolean[] zArr) {
        boolean z;
        boolean z2;
        boolean z3;
        int i3 = i2 - i;
        boolean z4 = false;
        if (i3 >= 0) {
            z = true;
        } else {
            z = false;
        }
        gre.p(z);
        if (i3 == 0) {
            return i2;
        }
        if (zArr[0]) {
            a(zArr);
            return i - 3;
        } else if (i3 > 1 && zArr[1] && bArr[i] == 1) {
            a(zArr);
            return i - 2;
        } else if (i3 > 2 && zArr[2] && bArr[i] == 0 && bArr[i + 1] == 1) {
            a(zArr);
            return i - 1;
        } else {
            int i4 = i2 - 1;
            int i5 = i + 2;
            while (i5 < i4) {
                byte b2 = bArr[i5];
                if ((b2 & 254) == 0) {
                    int i6 = i5 - 2;
                    if (bArr[i6] == 0 && bArr[i5 - 1] == 0 && b2 == 1) {
                        a(zArr);
                        return i6;
                    }
                    i5 -= 2;
                }
                i5 += 3;
            }
            if (i3 <= 2 ? !(i3 != 2 ? !zArr[1] || bArr[i4] != 1 : !zArr[2] || bArr[i2 - 2] != 0 || bArr[i4] != 1) : !(bArr[i2 - 3] != 0 || bArr[i2 - 2] != 0 || bArr[i4] != 1)) {
                z2 = true;
            } else {
                z2 = false;
            }
            zArr[0] = z2;
            if (i3 <= 1 ? !(!zArr[2] || bArr[i4] != 0) : !(bArr[i2 - 2] != 0 || bArr[i4] != 0)) {
                z3 = true;
            } else {
                z3 = false;
            }
            zArr[1] = z3;
            if (bArr[i4] == 0) {
                z4 = true;
            }
            zArr[2] = z4;
            return i2;
        }
    }

    public static String c(fm4 fm4Var) {
        String str = fm4Var.t;
        String str2 = fm4Var.l;
        if (Objects.equals(str, "video/dolby-vision") && str2 != null) {
            if (!str2.startsWith("dva1") && !str2.startsWith("dvav")) {
                if (str2.startsWith("dvh1") || str2.startsWith("dvhe")) {
                    return "video/hevc";
                }
            } else {
                return "video/avc";
            }
        }
        return fm4Var.t;
    }

    public static boolean d(byte[] bArr, int i, fm4 fm4Var) {
        int i2;
        if (Objects.equals(fm4Var.t, "video/avc")) {
            byte b2 = bArr[4];
            if (((b2 & 96) >> 5) == 0 && ((i2 = b2 & 31) == 1 || i2 == 9 || i2 == 14)) {
                return false;
            }
        } else if (Objects.equals(fm4Var.t, "video/hevc")) {
            pc0 f = f(new rf6(bArr, 4, i + 4));
            int i3 = f.a;
            if (i3 != 35) {
                if (i3 <= 14 && i3 % 2 == 0 && f.c == fm4Var.M - 1) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public static int e(fm4 fm4Var) {
        String c2 = c(fm4Var);
        if (Objects.equals(c2, "video/avc")) {
            return 1;
        }
        if (!Objects.equals(c2, "video/hevc") && !Objects.equals(c2, "video/vvc")) {
            return 0;
        }
        return 2;
    }

    public static pc0 f(rf6 rf6Var) {
        rf6Var.j();
        return new pc0(rf6Var.e(6), rf6Var.e(6), rf6Var.e(3) - 1);
    }

    public static defpackage.qh7 g(defpackage.rf6 r19, boolean r20, int r21, defpackage.qh7 r22) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yad.g(rf6, boolean, int, qh7):qh7");
    }

    public static g30 h(int i, int i2, byte[] bArr) {
        int i3;
        int max;
        int max2;
        int i4 = i + 2;
        while (true) {
            i2--;
            if (bArr[i2] == 0) {
                if (i2 <= i4) {
                    return null;
                }
            } else if (i2 > i4) {
                rf6 rf6Var = new rf6(bArr, i4, i2 + 1);
                while (rf6Var.b(16)) {
                    int e = rf6Var.e(8);
                    int i5 = 0;
                    while (e == 255) {
                        i5 += 255;
                        e = rf6Var.e(8);
                    }
                    int i6 = i5 + e;
                    int e2 = rf6Var.e(8);
                    int i7 = 0;
                    while (e2 == 255) {
                        i7 += 255;
                        e2 = rf6Var.e(8);
                    }
                    int i8 = i7 + e2;
                    if (i8 != 0 && rf6Var.b(i8)) {
                        if (i6 == 176) {
                            int f = rf6Var.f();
                            boolean d2 = rf6Var.d();
                            if (d2) {
                                i3 = rf6Var.f();
                            } else {
                                i3 = 0;
                            }
                            int f2 = rf6Var.f();
                            int i9 = -1;
                            for (int i10 = 0; i10 <= f2; i10++) {
                                i9 = rf6Var.f();
                                rf6Var.f();
                                int e3 = rf6Var.e(6);
                                if (e3 != 63) {
                                    if (e3 == 0) {
                                        max = Math.max(0, f - 30);
                                    } else {
                                        max = Math.max(0, (e3 + f) - 31);
                                    }
                                    rf6Var.e(max);
                                    if (d2) {
                                        int e4 = rf6Var.e(6);
                                        if (e4 != 63) {
                                            if (e4 == 0) {
                                                max2 = Math.max(0, i3 - 30);
                                            } else {
                                                max2 = Math.max(0, (e4 + i3) - 31);
                                            }
                                            rf6Var.e(max2);
                                        } else {
                                            return null;
                                        }
                                    }
                                    if (rf6Var.d()) {
                                        rf6Var.k(10);
                                    }
                                } else {
                                    return null;
                                }
                            }
                            return new g30(i9);
                        }
                        rf6Var.k(i8 << 3);
                    } else {
                        return null;
                    }
                }
                return null;
            } else {
                return null;
            }
        }
    }

    public static defpackage.th7 i(byte[] r32, int r33, int r34, defpackage.c5a r35) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yad.i(byte[], int, int, c5a):th7");
    }

    public static defpackage.c5a j(int r40, int r41, byte[] r42) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yad.j(int, int, byte[]):c5a");
    }

    public static defpackage.wh7 k(int r30, int r31, byte[] r32) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yad.k(int, int, byte[]):wh7");
    }

    public static void l(rf6 rf6Var) {
        int f = rf6Var.f() + 1;
        rf6Var.k(8);
        for (int i = 0; i < f; i++) {
            rf6Var.f();
            rf6Var.f();
            rf6Var.j();
        }
        rf6Var.k(20);
    }

    public static int m(int i, byte[] bArr) {
        int i2;
        synchronized (c) {
            int i3 = 0;
            int i4 = 0;
            while (i3 < i) {
                while (true) {
                    if (i3 < i - 2) {
                        if (bArr[i3] == 0 && bArr[i3 + 1] == 0 && bArr[i3 + 2] == 3) {
                            break;
                        }
                        i3++;
                    } else {
                        i3 = i;
                        break;
                    }
                }
                if (i3 < i) {
                    int[] iArr = d;
                    if (iArr.length <= i4) {
                        iArr = Arrays.copyOf(iArr, iArr.length << 1);
                        d = iArr;
                    }
                    iArr[i4] = i3;
                    i3 += 3;
                    i4++;
                }
            }
            i2 = i - i4;
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < i4; i7++) {
                int i8 = d[i7] - i6;
                System.arraycopy(bArr, i6, bArr, i5, i8);
                int i9 = i5 + i8;
                int i10 = i9 + 1;
                bArr[i9] = 0;
                i5 = i9 + 2;
                bArr[i10] = 0;
                i6 += i8 + 3;
            }
            System.arraycopy(bArr, i6, bArr, i5, i2 - i5);
        }
        return i2;
    }
}

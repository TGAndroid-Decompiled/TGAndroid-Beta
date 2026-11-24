package defpackage;

import j$.util.Objects;
import java.util.Arrays;
public abstract class bzc {
    public static final int[] a = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
    public static final int[] b = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};
    public static final int[] c = {64, 112, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};
    public static final int[] d = {8000, 16000, 32000, 64000, 128000, 22050, 44100, 88200, 176400, 352800, 12000, 24000, 48000, 96000, 192000, 384000};
    public static final int[] e = {5, 8, 10, 12};
    public static final int[] f = {6, 9, 12, 15};
    public static final int[] g = {2, 4, 6, 8};
    public static final int[] h = {9, 11, 13, 16};
    public static final int[] i = {5, 8, 10, 12};

    public static int a(byte[] r7) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzc.a(byte[]):int");
    }

    public static int b(int i2) {
        if (i2 != 2147385345 && i2 != -25230976 && i2 != 536864768 && i2 != -14745368) {
            if (i2 != 1683496997 && i2 != 622876772) {
                if (i2 != 1078008818 && i2 != -233094848) {
                    if (i2 != 1908687592 && i2 != -398277519) {
                        return 0;
                    }
                    return 4;
                }
                return 3;
            }
            return 2;
        }
        return 1;
    }

    public static qd1 c(byte[] bArr) {
        byte[] bArr2;
        byte b2 = bArr[0];
        if (b2 != Byte.MAX_VALUE && b2 != 100 && b2 != 64 && b2 != 113) {
            byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
            byte b3 = copyOf[0];
            if (b3 == -2 || b3 == -1 || b3 == 37 || b3 == -14 || b3 == -24) {
                for (int i2 = 0; i2 < copyOf.length - 1; i2 += 2) {
                    byte b4 = copyOf[i2];
                    int i3 = i2 + 1;
                    copyOf[i2] = copyOf[i3];
                    copyOf[i3] = b4;
                }
            }
            qd1 qd1Var = new qd1(copyOf.length, copyOf);
            if (copyOf[0] == 31) {
                qd1 qd1Var2 = new qd1(copyOf.length, copyOf);
                while (qd1Var2.b() >= 16) {
                    qd1Var2.n(2);
                    int f2 = qd1Var2.f(14) & 16383;
                    int min = Math.min(8 - qd1Var.d, 14);
                    int i4 = qd1Var.d;
                    int i5 = (8 - i4) - min;
                    int i6 = (65280 >> i4) | ((1 << i5) - 1);
                    byte[] bArr3 = qd1Var.b;
                    int i7 = qd1Var.c;
                    byte b5 = (byte) (bArr3[i7] & i6);
                    bArr3[i7] = b5;
                    int i8 = 14 - min;
                    bArr3[i7] = (byte) (b5 | ((f2 >>> i8) << i5));
                    int i9 = i7 + 1;
                    while (true) {
                        bArr2 = qd1Var.b;
                        if (i8 > 8) {
                            bArr2[i9] = (byte) (f2 >>> (i8 - 8));
                            i8 -= 8;
                            i9++;
                        }
                    }
                    int i10 = 8 - i8;
                    byte b6 = (byte) (bArr2[i9] & ((1 << i10) - 1));
                    bArr2[i9] = b6;
                    bArr2[i9] = (byte) (b6 | ((f2 & ((1 << i8) - 1)) << i10));
                    qd1Var.n(14);
                    qd1Var.a();
                }
            }
            qd1Var.j(copyOf.length, copyOf);
            return qd1Var;
        }
        return new qd1(bArr.length, bArr);
    }

    public static int d(int i2) {
        int i3;
        if ((i2 & 1) != 0) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        if ((i2 & 2) != 0) {
            i3 += 2;
        }
        if ((i2 & 4) != 0) {
            i3 += 2;
        }
        if ((i2 & 8) != 0) {
            i3++;
        }
        if ((i2 & 16) != 0) {
            i3++;
        }
        if ((i2 & 32) != 0) {
            i3 += 2;
        }
        if ((i2 & 64) != 0) {
            i3 += 2;
        }
        if ((i2 & 128) != 0) {
            i3++;
        }
        if ((i2 & 256) != 0) {
            i3++;
        }
        if ((i2 & 512) != 0) {
            i3 += 2;
        }
        if ((i2 & 1024) != 0) {
            i3 += 2;
        }
        if ((i2 & 2048) != 0) {
            i3 += 2;
        }
        if ((i2 & 4096) != 0) {
            i3++;
        }
        if ((i2 & 8192) != 0) {
            i3 += 2;
        }
        if ((i2 & 16384) != 0) {
            i3++;
        }
        if ((i2 & 32768) != 0) {
            return i3 + 2;
        }
        return i3;
    }

    public static boolean e(String str) {
        if (!Objects.equals(str, "audio/vnd.dts") && !Objects.equals(str, "audio/vnd.dts.hd")) {
            return false;
        }
        return true;
    }

    public static defpackage.gr3 f(byte[] r27) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzc.f(byte[]):gr3");
    }

    public static int g(qd1 qd1Var, int[] iArr) {
        int i2 = 0;
        for (int i3 = 0; i3 < 3 && qd1Var.e(); i3++) {
            i2++;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            i4 += 1 << iArr[i5];
        }
        return qd1Var.f(iArr[i2]) + i4;
    }

    public static fm4 h(k74 k74Var, int i2, fm4 fm4Var) {
        int i3;
        xu7 xu7Var = new xu7(i2);
        if (k74Var.d(xu7Var.a, 0, i2, true)) {
            k74Var.h();
            int i4 = xu7Var.i();
            if (b(i4) == 1) {
                if (xu7Var.a() >= 10) {
                    byte[] bArr = new byte[10];
                    xu7Var.k(0, 10, bArr);
                    int a2 = a(bArr);
                    if (a2 > 0 && xu7Var.c >= a2 + 4) {
                        xu7Var.N(a2);
                        i4 = xu7Var.i();
                    }
                }
            }
            if (b(i4) == 2 && xu7Var.a() >= 7) {
                int i5 = xu7Var.b;
                byte[] bArr2 = new byte[7];
                xu7Var.k(0, 7, bArr2);
                xu7Var.N(i5);
                qd1 c2 = c(bArr2);
                c2.n(42);
                if (c2.e()) {
                    i3 = 12;
                } else {
                    i3 = 8;
                }
                int f2 = c2.f(i3) + 1;
                if (f2 > 0 && xu7Var.a() >= f2) {
                    byte[] bArr3 = new byte[f2];
                    xu7Var.k(0, f2, bArr3);
                    String str = f(bArr3).a;
                    if (str == null) {
                        str = "audio/vnd.dts.hd";
                    }
                    if (Objects.equals(fm4Var.t, str)) {
                        return fm4Var;
                    }
                    em4 a3 = fm4Var.a();
                    a3.s = ud7.n(str);
                    return new fm4(a3);
                }
            }
        }
        return fm4Var;
    }
}

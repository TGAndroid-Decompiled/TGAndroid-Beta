package defpackage;

import j$.util.Objects;
import java.util.Arrays;
public abstract class c1d {
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c1d.a(byte[]):int");
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

    public static ye1 c(byte[] bArr) {
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
            ye1 ye1Var = new ye1(copyOf.length, copyOf);
            if (copyOf[0] == 31) {
                ye1 ye1Var2 = new ye1(copyOf.length, copyOf);
                while (ye1Var2.b() >= 16) {
                    ye1Var2.n(2);
                    int f2 = ye1Var2.f(14) & 16383;
                    int min = Math.min(8 - ye1Var.d, 14);
                    int i4 = ye1Var.d;
                    int i5 = (8 - i4) - min;
                    int i6 = (65280 >> i4) | ((1 << i5) - 1);
                    byte[] bArr3 = ye1Var.b;
                    int i7 = ye1Var.c;
                    byte b5 = (byte) (bArr3[i7] & i6);
                    bArr3[i7] = b5;
                    int i8 = 14 - min;
                    bArr3[i7] = (byte) (b5 | ((f2 >>> i8) << i5));
                    int i9 = i7 + 1;
                    while (true) {
                        bArr2 = ye1Var.b;
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
                    ye1Var.n(14);
                    ye1Var.a();
                }
            }
            ye1Var.j(copyOf.length, copyOf);
            return ye1Var;
        }
        return new ye1(bArr.length, bArr);
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

    public static defpackage.qs3 f(byte[] r27) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c1d.f(byte[]):qs3");
    }

    public static int g(ye1 ye1Var, int[] iArr) {
        int i2 = 0;
        for (int i3 = 0; i3 < 3 && ye1Var.e(); i3++) {
            i2++;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            i4 += 1 << iArr[i5];
        }
        return ye1Var.f(iArr[i2]) + i4;
    }

    public static go4 h(t84 t84Var, int i2, go4 go4Var) {
        int i3;
        yw7 yw7Var = new yw7(i2);
        if (t84Var.d(yw7Var.a, 0, i2, true)) {
            t84Var.i();
            int i4 = yw7Var.i();
            if (b(i4) == 1) {
                if (yw7Var.a() >= 10) {
                    byte[] bArr = new byte[10];
                    yw7Var.k(0, 10, bArr);
                    int a2 = a(bArr);
                    if (a2 > 0 && yw7Var.c >= a2 + 4) {
                        yw7Var.N(a2);
                        i4 = yw7Var.i();
                    }
                }
            }
            if (b(i4) == 2 && yw7Var.a() >= 7) {
                int i5 = yw7Var.b;
                byte[] bArr2 = new byte[7];
                yw7Var.k(0, 7, bArr2);
                yw7Var.N(i5);
                ye1 c2 = c(bArr2);
                c2.n(42);
                if (c2.e()) {
                    i3 = 12;
                } else {
                    i3 = 8;
                }
                int f2 = c2.f(i3) + 1;
                if (f2 > 0 && yw7Var.a() >= f2) {
                    byte[] bArr3 = new byte[f2];
                    yw7Var.k(0, f2, bArr3);
                    String str = f(bArr3).a;
                    if (str == null) {
                        str = "audio/vnd.dts.hd";
                    }
                    if (Objects.equals(go4Var.t, str)) {
                        return go4Var;
                    }
                    fo4 a3 = go4Var.a();
                    a3.s = wf7.n(str);
                    return new go4(a3);
                }
            }
        }
        return go4Var;
    }
}

package defpackage;

import java.util.Arrays;
public abstract class scd {
    public static final int[][] a = {new int[]{1, 1, 1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1, 1, 1}};
    public static final int[][] b = {new int[]{1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 0, 1, 0, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1}};
    public static final int[][] c = {new int[]{-1, -1, -1, -1, -1, -1, -1}, new int[]{6, 18, -1, -1, -1, -1, -1}, new int[]{6, 22, -1, -1, -1, -1, -1}, new int[]{6, 26, -1, -1, -1, -1, -1}, new int[]{6, 30, -1, -1, -1, -1, -1}, new int[]{6, 34, -1, -1, -1, -1, -1}, new int[]{6, 22, 38, -1, -1, -1, -1}, new int[]{6, 24, 42, -1, -1, -1, -1}, new int[]{6, 26, 46, -1, -1, -1, -1}, new int[]{6, 28, 50, -1, -1, -1, -1}, new int[]{6, 30, 54, -1, -1, -1, -1}, new int[]{6, 32, 58, -1, -1, -1, -1}, new int[]{6, 34, 62, -1, -1, -1, -1}, new int[]{6, 26, 46, 66, -1, -1, -1}, new int[]{6, 26, 48, 70, -1, -1, -1}, new int[]{6, 26, 50, 74, -1, -1, -1}, new int[]{6, 30, 54, 78, -1, -1, -1}, new int[]{6, 30, 56, 82, -1, -1, -1}, new int[]{6, 30, 58, 86, -1, -1, -1}, new int[]{6, 34, 62, 90, -1, -1, -1}, new int[]{6, 28, 50, 72, 94, -1, -1}, new int[]{6, 26, 50, 74, 98, -1, -1}, new int[]{6, 30, 54, 78, 102, -1, -1}, new int[]{6, 28, 54, 80, 106, -1, -1}, new int[]{6, 32, 58, 84, 110, -1, -1}, new int[]{6, 30, 58, 86, 114, -1, -1}, new int[]{6, 34, 62, 90, 118, -1, -1}, new int[]{6, 26, 50, 74, 98, 122, -1}, new int[]{6, 30, 54, 78, 102, 126, -1}, new int[]{6, 26, 52, 78, 104, 130, -1}, new int[]{6, 30, 56, 82, 108, 134, -1}, new int[]{6, 34, 60, 86, 112, 138, -1}, new int[]{6, 30, 58, 86, 114, 142, -1}, new int[]{6, 34, 62, 90, 118, 146, -1}, new int[]{6, 30, 54, 78, 102, 126, 150}, new int[]{6, 24, 50, 76, 102, 128, 154}, new int[]{6, 28, 54, 80, 106, 132, 158}, new int[]{6, 32, 58, 84, 110, 136, 162}, new int[]{6, 26, 54, 82, 110, 138, 166}, new int[]{6, 30, 58, 86, 114, 142, 170}};
    public static final int[][] d = {new int[]{8, 0}, new int[]{8, 1}, new int[]{8, 2}, new int[]{8, 3}, new int[]{8, 4}, new int[]{8, 5}, new int[]{8, 7}, new int[]{8, 8}, new int[]{7, 8}, new int[]{5, 8}, new int[]{4, 8}, new int[]{3, 8}, new int[]{2, 8}, new int[]{1, 8}, new int[]{0, 8}};

    public static void a(pk0 pk0Var, g54 g54Var, ybc ybcVar, int i, rk0 rk0Var) {
        int i2;
        char c2;
        byte[][] bArr;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        byte[][] bArr2 = (byte[][]) rk0Var.d;
        int i11 = rk0Var.b;
        int i12 = rk0Var.c;
        for (byte[] bArr3 : bArr2) {
            Arrays.fill(bArr3, (byte) -1);
        }
        int length = a[0].length;
        d(0, 0, rk0Var);
        int i13 = i11 - length;
        d(i13, 0, rk0Var);
        d(0, i13, rk0Var);
        c(0, 7, rk0Var);
        int i14 = i11 - 8;
        c(i14, 7, rk0Var);
        c(0, i14, rk0Var);
        e(7, 0, rk0Var);
        int i15 = i12 - 8;
        e(i15, 0, rk0Var);
        int i16 = i12 - 7;
        e(7, i16, rk0Var);
        if (rk0Var.e(8, i15) != 0) {
            rk0Var.g(8, i15, 1);
            byte b2 = ybcVar.a;
            if (b2 < 2) {
                i2 = 0;
                c2 = 1;
            } else {
                i2 = 0;
                int[] iArr = c[b2 - 1];
                c2 = 1;
                int length2 = iArr.length;
                int i17 = 0;
                while (i17 < length2) {
                    int i18 = iArr[i17];
                    if (i18 >= 0) {
                        int length3 = iArr.length;
                        int i19 = 0;
                        while (i19 < length3) {
                            int i20 = iArr[i19];
                            if (i20 >= 0 && f(rk0Var.e(i20, i18))) {
                                int i21 = i20 - 2;
                                int i22 = i18 - 2;
                                bArr = bArr2;
                                i3 = i11;
                                int i23 = 0;
                                while (true) {
                                    if (i23 >= 5) {
                                        break;
                                    }
                                    int[] iArr2 = b[i23];
                                    int i24 = i23;
                                    int i25 = 0;
                                    for (int i26 = 5; i25 < i26; i26 = 5) {
                                        int i27 = i25;
                                        rk0Var.g(i21 + i25, i22 + i24, iArr2[i27]);
                                        i25 = i27 + 1;
                                        length3 = length3;
                                    }
                                    i23 = i24 + 1;
                                }
                            } else {
                                bArr = bArr2;
                                i3 = i11;
                            }
                            i19++;
                            bArr2 = bArr;
                            i11 = i3;
                            length3 = length3;
                        }
                    }
                    i17++;
                    bArr2 = bArr2;
                    i11 = i11;
                }
            }
            byte[][] bArr4 = bArr2;
            int i28 = i11;
            int i29 = 8;
            while (i29 < i14) {
                int i30 = i29 + 1;
                int i31 = i30 % 2;
                if (f(rk0Var.e(i29, 6))) {
                    rk0Var.g(i29, 6, i31);
                }
                if (f(rk0Var.e(6, i29))) {
                    rk0Var.g(6, i29, i31);
                }
                i29 = i30;
            }
            pk0 pk0Var2 = new pk0();
            if (i >= 0 && i < 8) {
                int i32 = (g54Var.a << 3) | i;
                pk0Var2.b(i32, 5);
                pk0Var2.b(b(i32, 1335), 10);
                pk0 pk0Var3 = new pk0();
                pk0Var3.b(21522, 15);
                if (pk0Var2.b == pk0Var3.b) {
                    int i33 = i2;
                    while (true) {
                        int[] iArr3 = pk0Var2.a;
                        if (i33 >= iArr3.length) {
                            break;
                        }
                        iArr3[i33] = iArr3[i33] ^ pk0Var3.a[i33];
                        i33++;
                    }
                    if (pk0Var2.b == 15) {
                        int i34 = i2;
                        while (true) {
                            int i35 = pk0Var2.b;
                            if (i34 >= i35) {
                                break;
                            }
                            boolean d2 = pk0Var2.d((i35 - 1) - i34);
                            int[] iArr4 = d[i34];
                            int i36 = iArr4[i2];
                            byte[] bArr5 = bArr4[iArr4[c2]];
                            byte b3 = d2 ? (byte) 1 : (byte) 0;
                            bArr5[i36] = b3;
                            if (i34 < 8) {
                                i10 = (i28 - i34) - 1;
                                i9 = 8;
                            } else {
                                i9 = (i34 - 8) + i16;
                                i10 = 8;
                            }
                            bArr4[i9][i10] = b3;
                            i34++;
                        }
                        if (b2 >= 7) {
                            pk0 pk0Var4 = new pk0();
                            pk0Var4.b(b2, 6);
                            pk0Var4.b(b(b2, 7973), 12);
                            if (pk0Var4.b == 18) {
                                int i37 = 17;
                                for (int i38 = i2; i38 < 6; i38++) {
                                    for (int i39 = i2; i39 < 3; i39++) {
                                        boolean d3 = pk0Var4.d(i37);
                                        i37--;
                                        int i40 = (i12 - 11) + i39;
                                        byte[] bArr6 = bArr4[i40];
                                        byte b4 = d3 ? (byte) 1 : (byte) 0;
                                        bArr6[i38] = b4;
                                        bArr4[i38][i40] = b4;
                                    }
                                }
                            } else {
                                throw new Exception("should not happen but we got: " + pk0Var4.b);
                            }
                        }
                        int i41 = i28 - 1;
                        int i42 = i12 - 1;
                        int i43 = i2;
                        int i44 = -1;
                        while (i41 > 0) {
                            if (i41 == 6) {
                                i41--;
                            }
                            while (i42 >= 0 && i42 < i12) {
                                for (int i45 = i2; i45 < 2; i45++) {
                                    int i46 = i41 - i45;
                                    if (f(rk0Var.e(i46, i42))) {
                                        if (i43 < pk0Var.b) {
                                            boolean d4 = pk0Var.d(i43);
                                            i43++;
                                            i4 = d4;
                                        } else {
                                            i4 = i2;
                                        }
                                        if (i != -1) {
                                            switch (i) {
                                                case 0:
                                                    i5 = i42 + i46;
                                                    i6 = i5 & 1;
                                                    break;
                                                case 1:
                                                    i6 = i42 & 1;
                                                    break;
                                                case 2:
                                                    i6 = i46 % 3;
                                                    break;
                                                case 3:
                                                    i6 = (i42 + i46) % 3;
                                                    break;
                                                case 4:
                                                    i6 = ((i46 / 3) + (i42 / 2)) & 1;
                                                    break;
                                                case 5:
                                                    int i47 = i42 * i46;
                                                    i6 = (i47 % 3) + (i47 & 1);
                                                    break;
                                                case 6:
                                                    int i48 = i42 * i46;
                                                    i7 = i48 & 1;
                                                    i8 = i48 % 3;
                                                    i5 = i8 + i7;
                                                    i6 = i5 & 1;
                                                    break;
                                                case 7:
                                                    i8 = (i42 * i46) % 3;
                                                    i7 = (i42 + i46) & 1;
                                                    i5 = i8 + i7;
                                                    i6 = i5 & 1;
                                                    break;
                                                default:
                                                    u36.j(hg9.j(i, "Invalid mask pattern: "));
                                                    return;
                                            }
                                            if (i6 == 0) {
                                                i4 = ~i4 ? 1 : 0;
                                            }
                                        }
                                        bArr4[i42][i46] = (byte) i4;
                                    }
                                }
                                i42 += i44;
                            }
                            i44 = -i44;
                            i42 += i44;
                            i41 -= 2;
                        }
                        if (i43 == pk0Var.b) {
                            return;
                        }
                        throw new Exception("Not all bits consumed: " + i43 + '/' + pk0Var.b);
                    }
                    throw new Exception("should not happen but we got: " + pk0Var2.b);
                }
                u36.j("Sizes don't match");
                return;
            }
            throw new Exception("Invalid mask pattern");
        }
        throw new Exception();
    }

    public static int b(int i, int i2) {
        if (i2 != 0) {
            int numberOfLeadingZeros = Integer.numberOfLeadingZeros(i2);
            int i3 = 32 - numberOfLeadingZeros;
            int i4 = i << (31 - numberOfLeadingZeros);
            while (32 - Integer.numberOfLeadingZeros(i4) >= i3) {
                i4 ^= i2 << ((32 - Integer.numberOfLeadingZeros(i4)) - i3);
            }
            return i4;
        }
        u36.j("0 polynomial");
        return 0;
    }

    public static void c(int i, int i2, rk0 rk0Var) {
        for (int i3 = 0; i3 < 8; i3++) {
            int i4 = i + i3;
            if (f(rk0Var.e(i4, i2))) {
                rk0Var.g(i4, i2, 0);
            } else {
                throw new Exception();
            }
        }
    }

    public static void d(int i, int i2, rk0 rk0Var) {
        for (int i3 = 0; i3 < 7; i3++) {
            int[] iArr = a[i3];
            for (int i4 = 0; i4 < 7; i4++) {
                rk0Var.g(i + i4, i2 + i3, iArr[i4]);
            }
        }
    }

    public static void e(int i, int i2, rk0 rk0Var) {
        for (int i3 = 0; i3 < 7; i3++) {
            int i4 = i2 + i3;
            if (f(rk0Var.e(i, i4))) {
                rk0Var.g(i, i4, 0);
            } else {
                throw new Exception();
            }
        }
    }

    public static boolean f(int i) {
        if (i == -1) {
            return true;
        }
        return false;
    }
}

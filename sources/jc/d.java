package jc;

import java.util.Arrays;
public abstract class d {
    public static final int[][] f14112a = {new int[]{1, 1, 1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1, 1, 1}};
    public static final int[][] f14113b = {new int[]{1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 0, 1, 0, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1}};
    public static final int[][] f14114c = {new int[]{-1, -1, -1, -1, -1, -1, -1}, new int[]{6, 18, -1, -1, -1, -1, -1}, new int[]{6, 22, -1, -1, -1, -1, -1}, new int[]{6, 26, -1, -1, -1, -1, -1}, new int[]{6, 30, -1, -1, -1, -1, -1}, new int[]{6, 34, -1, -1, -1, -1, -1}, new int[]{6, 22, 38, -1, -1, -1, -1}, new int[]{6, 24, 42, -1, -1, -1, -1}, new int[]{6, 26, 46, -1, -1, -1, -1}, new int[]{6, 28, 50, -1, -1, -1, -1}, new int[]{6, 30, 54, -1, -1, -1, -1}, new int[]{6, 32, 58, -1, -1, -1, -1}, new int[]{6, 34, 62, -1, -1, -1, -1}, new int[]{6, 26, 46, 66, -1, -1, -1}, new int[]{6, 26, 48, 70, -1, -1, -1}, new int[]{6, 26, 50, 74, -1, -1, -1}, new int[]{6, 30, 54, 78, -1, -1, -1}, new int[]{6, 30, 56, 82, -1, -1, -1}, new int[]{6, 30, 58, 86, -1, -1, -1}, new int[]{6, 34, 62, 90, -1, -1, -1}, new int[]{6, 28, 50, 72, 94, -1, -1}, new int[]{6, 26, 50, 74, 98, -1, -1}, new int[]{6, 30, 54, 78, 102, -1, -1}, new int[]{6, 28, 54, 80, 106, -1, -1}, new int[]{6, 32, 58, 84, 110, -1, -1}, new int[]{6, 30, 58, 86, 114, -1, -1}, new int[]{6, 34, 62, 90, 118, -1, -1}, new int[]{6, 26, 50, 74, 98, 122, -1}, new int[]{6, 30, 54, 78, 102, 126, -1}, new int[]{6, 26, 52, 78, 104, 130, -1}, new int[]{6, 30, 56, 82, 108, 134, -1}, new int[]{6, 34, 60, 86, 112, 138, -1}, new int[]{6, 30, 58, 86, 114, 142, -1}, new int[]{6, 34, 62, 90, 118, 146, -1}, new int[]{6, 30, 54, 78, 102, 126, 150}, new int[]{6, 24, 50, 76, 102, 128, 154}, new int[]{6, 28, 54, 80, 106, 132, 158}, new int[]{6, 32, 58, 84, 110, 136, 162}, new int[]{6, 26, 54, 82, 110, 138, 166}, new int[]{6, 30, 58, 86, 114, 142, 170}};
    public static final int[][] d = {new int[]{8, 0}, new int[]{8, 1}, new int[]{8, 2}, new int[]{8, 3}, new int[]{8, 4}, new int[]{8, 5}, new int[]{8, 7}, new int[]{8, 8}, new int[]{7, 8}, new int[]{5, 8}, new int[]{4, 8}, new int[]{3, 8}, new int[]{2, 8}, new int[]{1, 8}, new int[]{0, 8}};

    public static int a(b bVar, boolean z10) {
        int i10;
        byte b10;
        int i11 = bVar.f14108b;
        int i12 = bVar.f14109c;
        if (z10) {
            i10 = i12;
        } else {
            i10 = i11;
        }
        if (!z10) {
            i11 = i12;
        }
        byte[][] bArr = bVar.f14107a;
        int i13 = 0;
        for (int i14 = 0; i14 < i10; i14++) {
            byte b11 = -1;
            int i15 = 0;
            for (int i16 = 0; i16 < i11; i16++) {
                if (z10) {
                    b10 = bArr[i14][i16];
                } else {
                    b10 = bArr[i16][i14];
                }
                if (b10 == b11) {
                    i15++;
                } else {
                    if (i15 >= 5) {
                        i13 += i15 - 2;
                    }
                    i15 = 1;
                    b11 = b10;
                }
            }
            if (i15 >= 5) {
                i13 = (i15 - 2) + i13;
            }
        }
        return i13;
    }

    public static void b(dc.a aVar, hc.c cVar, hc.f fVar, int i10, b bVar) {
        int i11;
        int i12;
        byte[][] bArr;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        byte[][] bArr2 = bVar.f14107a;
        int i22 = bVar.f14108b;
        int i23 = bVar.f14109c;
        for (byte[] bArr3 : bArr2) {
            Arrays.fill(bArr3, (byte) -1);
        }
        int length = f14112a[0].length;
        e(0, 0, bVar);
        int i24 = i22 - length;
        e(i24, 0, bVar);
        e(0, i24, bVar);
        d(0, 7, bVar);
        int i25 = i22 - 8;
        d(i25, 7, bVar);
        d(0, i25, bVar);
        f(7, 0, bVar);
        int i26 = i23 - 8;
        f(i26, 0, bVar);
        int i27 = i23 - 7;
        f(7, i27, bVar);
        if (bVar.a(8, i26) != 0) {
            bVar.b(8, i26, 1);
            int i28 = fVar.f11078a;
            if (i28 < 2) {
                i11 = 0;
                i12 = 1;
            } else {
                i11 = 0;
                int[] iArr = f14114c[i28 - 1];
                i12 = 1;
                int length2 = iArr.length;
                int i29 = 0;
                while (i29 < length2) {
                    int i30 = iArr[i29];
                    if (i30 >= 0) {
                        int length3 = iArr.length;
                        int i31 = 0;
                        while (i31 < length3) {
                            int i32 = iArr[i31];
                            if (i32 >= 0 && g(bVar.a(i32, i30))) {
                                int i33 = i32 - 2;
                                int i34 = i30 - 2;
                                bArr = bArr2;
                                i13 = i22;
                                int i35 = 0;
                                while (true) {
                                    if (i35 >= 5) {
                                        break;
                                    }
                                    int[] iArr2 = f14113b[i35];
                                    int i36 = i35;
                                    int i37 = 0;
                                    for (int i38 = 5; i37 < i38; i38 = 5) {
                                        int i39 = i37;
                                        bVar.b(i33 + i37, i34 + i36, iArr2[i39]);
                                        i37 = i39 + 1;
                                        length3 = length3;
                                    }
                                    i35 = i36 + 1;
                                }
                            } else {
                                bArr = bArr2;
                                i13 = i22;
                            }
                            i31++;
                            bArr2 = bArr;
                            i22 = i13;
                            length3 = length3;
                        }
                    }
                    i29++;
                    bArr2 = bArr2;
                    i22 = i22;
                }
            }
            byte[][] bArr4 = bArr2;
            int i40 = i22;
            int i41 = 8;
            while (i41 < i25) {
                int i42 = i41 + 1;
                int i43 = i42 % 2;
                if (g(bVar.a(i41, 6))) {
                    bVar.b(i41, 6, i43);
                }
                if (g(bVar.a(6, i41))) {
                    bVar.b(6, i41, i43);
                }
                i41 = i42;
            }
            dc.a aVar2 = new dc.a();
            if (i10 >= 0 && i10 < 8) {
                int i44 = (cVar.f11062a << 3) | i10;
                aVar2.b(i44, 5);
                aVar2.b(c(i44, 1335), 10);
                dc.a aVar3 = new dc.a();
                aVar3.b(21522, 15);
                if (aVar2.f8270b == aVar3.f8270b) {
                    int i45 = i11;
                    while (true) {
                        int[] iArr3 = aVar2.f8269a;
                        if (i45 >= iArr3.length) {
                            break;
                        }
                        iArr3[i45] = iArr3[i45] ^ aVar3.f8269a[i45];
                        i45++;
                    }
                    if (aVar2.f8270b == 15) {
                        int i46 = i11;
                        while (true) {
                            int i47 = aVar2.f8270b;
                            if (i46 >= i47) {
                                break;
                            }
                            boolean d10 = aVar2.d((i47 - 1) - i46);
                            int[] iArr4 = d[i46];
                            int i48 = iArr4[i11];
                            byte[] bArr5 = bArr4[iArr4[i12]];
                            byte b10 = d10 ? (byte) 1 : (byte) 0;
                            bArr5[i48] = b10;
                            if (i46 < 8) {
                                i21 = (i40 - i46) - 1;
                                i20 = 8;
                            } else {
                                i20 = (i46 - 8) + i27;
                                i21 = 8;
                            }
                            bArr4[i20][i21] = b10;
                            i46++;
                        }
                        if (i28 >= 7) {
                            dc.a aVar4 = new dc.a();
                            aVar4.b(i28, 6);
                            aVar4.b(c(i28, 7973), 12);
                            if (aVar4.f8270b == 18) {
                                int i49 = 17;
                                for (int i50 = i11; i50 < 6; i50++) {
                                    for (int i51 = i11; i51 < 3; i51++) {
                                        boolean d11 = aVar4.d(i49);
                                        i49--;
                                        int i52 = (i23 - 11) + i51;
                                        byte[] bArr6 = bArr4[i52];
                                        byte b11 = d11 ? (byte) 1 : (byte) 0;
                                        bArr6[i50] = b11;
                                        bArr4[i50][i52] = b11;
                                    }
                                }
                            } else {
                                throw new Exception("should not happen but we got: " + aVar4.f8270b);
                            }
                        }
                        int i53 = i40 - 1;
                        int i54 = i23 - 1;
                        int i55 = i11;
                        int i56 = -1;
                        while (i53 > 0) {
                            if (i53 == 6) {
                                i53--;
                            }
                            while (i54 >= 0 && i54 < i23) {
                                for (int i57 = i11; i57 < 2; i57++) {
                                    int i58 = i53 - i57;
                                    if (g(bVar.a(i58, i54))) {
                                        if (i55 < aVar.f8270b) {
                                            boolean d12 = aVar.d(i55);
                                            i55++;
                                            i14 = d12;
                                        } else {
                                            i14 = i11;
                                        }
                                        if (i10 != -1) {
                                            switch (i10) {
                                                case 0:
                                                    i15 = i54 + i58;
                                                    i16 = i15 & 1;
                                                    break;
                                                case 1:
                                                    i16 = i54 & 1;
                                                    break;
                                                case 2:
                                                    i16 = i58 % 3;
                                                    break;
                                                case 3:
                                                    i16 = (i54 + i58) % 3;
                                                    break;
                                                case 4:
                                                    i16 = ((i58 / 3) + (i54 / 2)) & 1;
                                                    break;
                                                case 5:
                                                    int i59 = i54 * i58;
                                                    i16 = (i59 % 3) + (i59 & 1);
                                                    break;
                                                case 6:
                                                    int i60 = i54 * i58;
                                                    i17 = i60 & 1;
                                                    i18 = i60 % 3;
                                                    i15 = i18 + i17;
                                                    i16 = i15 & 1;
                                                    break;
                                                case 7:
                                                    i18 = (i54 * i58) % 3;
                                                    i17 = (i54 + i58) & 1;
                                                    i15 = i18 + i17;
                                                    i16 = i15 & 1;
                                                    break;
                                                default:
                                                    throw new IllegalArgumentException(hg.c.h(i10, "Invalid mask pattern: "));
                                            }
                                            if (i16 == 0) {
                                                i19 = i12;
                                            } else {
                                                i19 = i11;
                                            }
                                            if (i19 != 0) {
                                                i14 = ~i14 ? 1 : 0;
                                            }
                                        }
                                        bArr4[i54][i58] = (byte) i14;
                                    }
                                }
                                i54 += i56;
                            }
                            i56 = -i56;
                            i54 += i56;
                            i53 -= 2;
                        }
                        if (i55 == aVar.f8270b) {
                            return;
                        }
                        throw new Exception("Not all bits consumed: " + i55 + '/' + aVar.f8270b);
                    }
                    throw new Exception("should not happen but we got: " + aVar2.f8270b);
                }
                throw new IllegalArgumentException("Sizes don't match");
            }
            throw new Exception("Invalid mask pattern");
        }
        throw new Exception();
    }

    public static int c(int i10, int i11) {
        if (i11 != 0) {
            int numberOfLeadingZeros = Integer.numberOfLeadingZeros(i11);
            int i12 = 32 - numberOfLeadingZeros;
            int i13 = i10 << (31 - numberOfLeadingZeros);
            while (32 - Integer.numberOfLeadingZeros(i13) >= i12) {
                i13 ^= i11 << ((32 - Integer.numberOfLeadingZeros(i13)) - i12);
            }
            return i13;
        }
        throw new IllegalArgumentException("0 polynomial");
    }

    public static void d(int i10, int i11, b bVar) {
        for (int i12 = 0; i12 < 8; i12++) {
            int i13 = i10 + i12;
            if (g(bVar.a(i13, i11))) {
                bVar.b(i13, i11, 0);
            } else {
                throw new Exception();
            }
        }
    }

    public static void e(int i10, int i11, b bVar) {
        for (int i12 = 0; i12 < 7; i12++) {
            int[] iArr = f14112a[i12];
            for (int i13 = 0; i13 < 7; i13++) {
                bVar.b(i10 + i13, i11 + i12, iArr[i13]);
            }
        }
    }

    public static void f(int i10, int i11, b bVar) {
        for (int i12 = 0; i12 < 7; i12++) {
            int i13 = i11 + i12;
            if (g(bVar.a(i10, i13))) {
                bVar.b(i10, i13, 0);
            } else {
                throw new Exception();
            }
        }
    }

    public static boolean g(int i10) {
        if (i10 == -1) {
            return true;
        }
        return false;
    }
}

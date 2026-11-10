package ic;

import java.util.Arrays;
import jg.g;
public abstract class c {
    public static final int[][] f15442a = {new int[]{1, 1, 1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1, 1, 1}};
    public static final int[][] f15443b = {new int[]{1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 0, 1, 0, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1}};
    public static final int[][] f15444c = {new int[]{-1, -1, -1, -1, -1, -1, -1}, new int[]{6, 18, -1, -1, -1, -1, -1}, new int[]{6, 22, -1, -1, -1, -1, -1}, new int[]{6, 26, -1, -1, -1, -1, -1}, new int[]{6, 30, -1, -1, -1, -1, -1}, new int[]{6, 34, -1, -1, -1, -1, -1}, new int[]{6, 22, 38, -1, -1, -1, -1}, new int[]{6, 24, 42, -1, -1, -1, -1}, new int[]{6, 26, 46, -1, -1, -1, -1}, new int[]{6, 28, 50, -1, -1, -1, -1}, new int[]{6, 30, 54, -1, -1, -1, -1}, new int[]{6, 32, 58, -1, -1, -1, -1}, new int[]{6, 34, 62, -1, -1, -1, -1}, new int[]{6, 26, 46, 66, -1, -1, -1}, new int[]{6, 26, 48, 70, -1, -1, -1}, new int[]{6, 26, 50, 74, -1, -1, -1}, new int[]{6, 30, 54, 78, -1, -1, -1}, new int[]{6, 30, 56, 82, -1, -1, -1}, new int[]{6, 30, 58, 86, -1, -1, -1}, new int[]{6, 34, 62, 90, -1, -1, -1}, new int[]{6, 28, 50, 72, 94, -1, -1}, new int[]{6, 26, 50, 74, 98, -1, -1}, new int[]{6, 30, 54, 78, 102, -1, -1}, new int[]{6, 28, 54, 80, 106, -1, -1}, new int[]{6, 32, 58, 84, 110, -1, -1}, new int[]{6, 30, 58, 86, 114, -1, -1}, new int[]{6, 34, 62, 90, 118, -1, -1}, new int[]{6, 26, 50, 74, 98, 122, -1}, new int[]{6, 30, 54, 78, 102, 126, -1}, new int[]{6, 26, 52, 78, 104, 130, -1}, new int[]{6, 30, 56, 82, 108, 134, -1}, new int[]{6, 34, 60, 86, 112, 138, -1}, new int[]{6, 30, 58, 86, 114, 142, -1}, new int[]{6, 34, 62, 90, 118, 146, -1}, new int[]{6, 30, 54, 78, 102, 126, 150}, new int[]{6, 24, 50, 76, 102, 128, 154}, new int[]{6, 28, 54, 80, 106, 132, 158}, new int[]{6, 32, 58, 84, 110, 136, 162}, new int[]{6, 26, 54, 82, 110, 138, 166}, new int[]{6, 30, 58, 86, 114, 142, 170}};
    public static final int[][] d = {new int[]{8, 0}, new int[]{8, 1}, new int[]{8, 2}, new int[]{8, 3}, new int[]{8, 4}, new int[]{8, 5}, new int[]{8, 7}, new int[]{8, 8}, new int[]{7, 8}, new int[]{5, 8}, new int[]{4, 8}, new int[]{3, 8}, new int[]{2, 8}, new int[]{1, 8}, new int[]{0, 8}};

    public static int a(cc.c cVar, boolean z9) {
        int i7;
        byte b10;
        int i10 = cVar.f6051b;
        int i11 = cVar.f6052c;
        if (z9) {
            i7 = i11;
        } else {
            i7 = i10;
        }
        if (!z9) {
            i10 = i11;
        }
        byte[][] bArr = (byte[][]) cVar.d;
        int i12 = 0;
        for (int i13 = 0; i13 < i7; i13++) {
            byte b11 = -1;
            int i14 = 0;
            for (int i15 = 0; i15 < i10; i15++) {
                if (z9) {
                    b10 = bArr[i13][i15];
                } else {
                    b10 = bArr[i15][i13];
                }
                if (b10 == b11) {
                    i14++;
                } else {
                    if (i14 >= 5) {
                        i12 += i14 - 2;
                    }
                    i14 = 1;
                    b11 = b10;
                }
            }
            if (i14 >= 5) {
                i12 = (i14 - 2) + i12;
            }
        }
        return i12;
    }

    public static void b(cc.a aVar, gc.b bVar, gc.e eVar, int i7, cc.c cVar) {
        int i10;
        int i11;
        byte[][] bArr;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        byte[][] bArr2 = (byte[][]) cVar.d;
        int i21 = cVar.f6051b;
        int i22 = cVar.f6052c;
        for (byte[] bArr3 : bArr2) {
            Arrays.fill(bArr3, (byte) -1);
        }
        int length = f15442a[0].length;
        e(0, 0, cVar);
        int i23 = i21 - length;
        e(i23, 0, cVar);
        e(0, i23, cVar);
        d(0, 7, cVar);
        int i24 = i21 - 8;
        d(i24, 7, cVar);
        d(0, i24, cVar);
        f(7, 0, cVar);
        int i25 = i22 - 8;
        f(i25, 0, cVar);
        int i26 = i22 - 7;
        f(7, i26, cVar);
        if (cVar.e(8, i25) != 0) {
            cVar.g(8, i25, 1);
            int i27 = eVar.f13814a;
            if (i27 < 2) {
                i10 = 0;
                i11 = 1;
            } else {
                i10 = 0;
                int[] iArr = f15444c[i27 - 1];
                i11 = 1;
                int length2 = iArr.length;
                int i28 = 0;
                while (i28 < length2) {
                    int i29 = iArr[i28];
                    if (i29 >= 0) {
                        int length3 = iArr.length;
                        int i30 = 0;
                        while (i30 < length3) {
                            int i31 = iArr[i30];
                            if (i31 >= 0 && g(cVar.e(i31, i29))) {
                                int i32 = i31 - 2;
                                int i33 = i29 - 2;
                                bArr = bArr2;
                                i12 = i21;
                                int i34 = 0;
                                while (true) {
                                    if (i34 >= 5) {
                                        break;
                                    }
                                    int[] iArr2 = f15443b[i34];
                                    int i35 = i34;
                                    int i36 = 0;
                                    for (int i37 = 5; i36 < i37; i37 = 5) {
                                        int i38 = i36;
                                        cVar.g(i32 + i36, i33 + i35, iArr2[i38]);
                                        i36 = i38 + 1;
                                        length3 = length3;
                                    }
                                    i34 = i35 + 1;
                                }
                            } else {
                                bArr = bArr2;
                                i12 = i21;
                            }
                            i30++;
                            bArr2 = bArr;
                            i21 = i12;
                            length3 = length3;
                        }
                    }
                    i28++;
                    bArr2 = bArr2;
                    i21 = i21;
                }
            }
            byte[][] bArr4 = bArr2;
            int i39 = i21;
            int i40 = 8;
            while (i40 < i24) {
                int i41 = i40 + 1;
                int i42 = i41 % 2;
                if (g(cVar.e(i40, 6))) {
                    cVar.g(i40, 6, i42);
                }
                if (g(cVar.e(6, i40))) {
                    cVar.g(6, i40, i42);
                }
                i40 = i41;
            }
            cc.a aVar2 = new cc.a();
            if (i7 >= 0 && i7 < 8) {
                int i43 = (bVar.f13797a << 3) | i7;
                aVar2.b(i43, 5);
                aVar2.b(c(i43, 1335), 10);
                cc.a aVar3 = new cc.a();
                aVar3.b(21522, 15);
                if (aVar2.f6046b == aVar3.f6046b) {
                    int i44 = i10;
                    while (true) {
                        int[] iArr3 = aVar2.f6045a;
                        if (i44 >= iArr3.length) {
                            break;
                        }
                        iArr3[i44] = iArr3[i44] ^ aVar3.f6045a[i44];
                        i44++;
                    }
                    if (aVar2.f6046b == 15) {
                        int i45 = i10;
                        while (true) {
                            int i46 = aVar2.f6046b;
                            if (i45 >= i46) {
                                break;
                            }
                            boolean d2 = aVar2.d((i46 - 1) - i45);
                            int[] iArr4 = d[i45];
                            int i47 = iArr4[i10];
                            byte[] bArr5 = bArr4[iArr4[i11]];
                            byte b10 = d2 ? (byte) 1 : (byte) 0;
                            bArr5[i47] = b10;
                            if (i45 < 8) {
                                i20 = (i39 - i45) - 1;
                                i19 = 8;
                            } else {
                                i19 = (i45 - 8) + i26;
                                i20 = 8;
                            }
                            bArr4[i19][i20] = b10;
                            i45++;
                        }
                        if (i27 >= 7) {
                            cc.a aVar4 = new cc.a();
                            aVar4.b(i27, 6);
                            aVar4.b(c(i27, 7973), 12);
                            if (aVar4.f6046b == 18) {
                                int i48 = 17;
                                for (int i49 = i10; i49 < 6; i49++) {
                                    for (int i50 = i10; i50 < 3; i50++) {
                                        boolean d10 = aVar4.d(i48);
                                        i48--;
                                        int i51 = (i22 - 11) + i50;
                                        byte[] bArr6 = bArr4[i51];
                                        byte b11 = d10 ? (byte) 1 : (byte) 0;
                                        bArr6[i49] = b11;
                                        bArr4[i49][i51] = b11;
                                    }
                                }
                            } else {
                                throw new Exception("should not happen but we got: " + aVar4.f6046b);
                            }
                        }
                        int i52 = i39 - 1;
                        int i53 = i22 - 1;
                        int i54 = i10;
                        int i55 = -1;
                        while (i52 > 0) {
                            if (i52 == 6) {
                                i52--;
                            }
                            while (i53 >= 0 && i53 < i22) {
                                for (int i56 = i10; i56 < 2; i56++) {
                                    int i57 = i52 - i56;
                                    if (g(cVar.e(i57, i53))) {
                                        if (i54 < aVar.f6046b) {
                                            boolean d11 = aVar.d(i54);
                                            i54++;
                                            i13 = d11;
                                        } else {
                                            i13 = i10;
                                        }
                                        if (i7 != -1) {
                                            switch (i7) {
                                                case 0:
                                                    i14 = i53 + i57;
                                                    i15 = i14 & 1;
                                                    break;
                                                case 1:
                                                    i15 = i53 & 1;
                                                    break;
                                                case 2:
                                                    i15 = i57 % 3;
                                                    break;
                                                case 3:
                                                    i15 = (i53 + i57) % 3;
                                                    break;
                                                case 4:
                                                    i15 = ((i57 / 3) + (i53 / 2)) & 1;
                                                    break;
                                                case 5:
                                                    int i58 = i53 * i57;
                                                    i15 = (i58 % 3) + (i58 & 1);
                                                    break;
                                                case 6:
                                                    int i59 = i53 * i57;
                                                    i16 = i59 & 1;
                                                    i17 = i59 % 3;
                                                    i14 = i17 + i16;
                                                    i15 = i14 & 1;
                                                    break;
                                                case 7:
                                                    i17 = (i53 * i57) % 3;
                                                    i16 = (i53 + i57) & 1;
                                                    i14 = i17 + i16;
                                                    i15 = i14 & 1;
                                                    break;
                                                default:
                                                    throw new IllegalArgumentException(g.j(i7, "Invalid mask pattern: "));
                                            }
                                            if (i15 == 0) {
                                                i18 = i11;
                                            } else {
                                                i18 = i10;
                                            }
                                            if (i18 != 0) {
                                                i13 = ~i13 ? 1 : 0;
                                            }
                                        }
                                        bArr4[i53][i57] = (byte) i13;
                                    }
                                }
                                i53 += i55;
                            }
                            i55 = -i55;
                            i53 += i55;
                            i52 -= 2;
                        }
                        if (i54 == aVar.f6046b) {
                            return;
                        }
                        throw new Exception("Not all bits consumed: " + i54 + '/' + aVar.f6046b);
                    }
                    throw new Exception("should not happen but we got: " + aVar2.f6046b);
                }
                throw new IllegalArgumentException("Sizes don't match");
            }
            throw new Exception("Invalid mask pattern");
        }
        throw new Exception();
    }

    public static int c(int i7, int i10) {
        if (i10 != 0) {
            int numberOfLeadingZeros = Integer.numberOfLeadingZeros(i10);
            int i11 = 32 - numberOfLeadingZeros;
            int i12 = i7 << (31 - numberOfLeadingZeros);
            while (32 - Integer.numberOfLeadingZeros(i12) >= i11) {
                i12 ^= i10 << ((32 - Integer.numberOfLeadingZeros(i12)) - i11);
            }
            return i12;
        }
        throw new IllegalArgumentException("0 polynomial");
    }

    public static void d(int i7, int i10, cc.c cVar) {
        for (int i11 = 0; i11 < 8; i11++) {
            int i12 = i7 + i11;
            if (g(cVar.e(i12, i10))) {
                cVar.g(i12, i10, 0);
            } else {
                throw new Exception();
            }
        }
    }

    public static void e(int i7, int i10, cc.c cVar) {
        for (int i11 = 0; i11 < 7; i11++) {
            int[] iArr = f15442a[i11];
            for (int i12 = 0; i12 < 7; i12++) {
                cVar.g(i7 + i12, i10 + i11, iArr[i12]);
            }
        }
    }

    public static void f(int i7, int i10, cc.c cVar) {
        for (int i11 = 0; i11 < 7; i11++) {
            int i12 = i10 + i11;
            if (g(cVar.e(i7, i12))) {
                cVar.g(i7, i12, 0);
            } else {
                throw new Exception();
            }
        }
    }

    public static boolean g(int i7) {
        if (i7 == -1) {
            return true;
        }
        return false;
    }
}

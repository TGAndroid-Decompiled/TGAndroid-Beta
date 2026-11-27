package defpackage;

import java.lang.reflect.Array;
public final class vi5 extends rx6 {
    public rj0 F;

    @Override
    public final rj0 I() {
        int min;
        int min2;
        byte[] bArr;
        rj0 rj0Var = this.F;
        if (rj0Var != null) {
            return rj0Var;
        }
        ki6 ki6Var = (ki6) this.b;
        int i = ki6Var.a;
        int i2 = ki6Var.b;
        if (i >= 40 && i2 >= 40) {
            byte[] a = ki6Var.a();
            int i3 = i >> 3;
            if ((i & 7) != 0) {
                i3++;
            }
            int i4 = i2 >> 3;
            if ((i2 & 7) != 0) {
                i4++;
            }
            int i5 = i2 - 8;
            int i6 = i - 8;
            boolean z = true;
            int i7 = 0;
            int[][] iArr = (int[][]) Array.newInstance(Integer.TYPE, i4, i3);
            int i8 = 0;
            while (true) {
                int i9 = 8;
                if (i8 >= i4) {
                    break;
                }
                int i10 = i8 << 3;
                if (i10 > i5) {
                    i10 = i5;
                }
                boolean z2 = z;
                int i11 = i7;
                while (i11 < i3) {
                    int i12 = i11 << 3;
                    if (i12 > i6) {
                        i12 = i6;
                    }
                    int i13 = (i10 * i) + i12;
                    int i14 = 255;
                    int i15 = 0;
                    int i16 = 0;
                    int i17 = 0;
                    while (true) {
                        bArr = a;
                        if (i15 >= i9) {
                            break;
                        }
                        int i18 = i17;
                        int i19 = 0;
                        while (i19 < i9) {
                            int i20 = i19;
                            int i21 = bArr[i13 + i19] & 255;
                            i16 += i21;
                            if (i21 < i14) {
                                i14 = i21;
                            }
                            if (i21 > i18) {
                                i18 = i21;
                            }
                            i19 = i20 + 1;
                            i9 = 8;
                        }
                        if (i18 - i14 <= 24) {
                            i15++;
                            i13 += i;
                            i14 = i14;
                            a = bArr;
                            i9 = 8;
                            i17 = i18;
                        }
                        while (true) {
                            i15++;
                            i13 += i;
                            if (i15 < 8) {
                                int i22 = 0;
                                for (int i23 = 8; i22 < i23; i23 = 8) {
                                    i16 += bArr[i13 + i22] & 255;
                                    i22++;
                                    i14 = i14;
                                }
                            }
                        }
                        i15++;
                        i13 += i;
                        i14 = i14;
                        a = bArr;
                        i9 = 8;
                        i17 = i18;
                    }
                    int i24 = i16 >> 6;
                    if (i17 - i14 <= 24) {
                        i24 = i14 / 2;
                        if (i8 > 0 && i11 > 0) {
                            int[] iArr2 = iArr[i8 - 1];
                            int i25 = i11 - 1;
                            int i26 = ((iArr2[i11] + (iArr[i8][i25] << 1)) + iArr2[i25]) / 4;
                            if (i14 < i26) {
                                i24 = i26;
                            }
                        }
                    }
                    iArr[i8][i11] = i24;
                    i11++;
                    a = bArr;
                    i9 = 8;
                }
                i8++;
                z = z2;
                i7 = 0;
            }
            byte[] bArr2 = a;
            rj0 rj0Var2 = new rj0(i, i2);
            int i27 = 0;
            while (i27 < i4) {
                int i28 = i27 << 3;
                if (i28 > i5) {
                    i28 = i5;
                }
                int i29 = i4 - 3;
                if (i27 < 2) {
                    min = 2;
                } else {
                    min = Math.min(i27, i29);
                }
                int i30 = 0;
                while (i30 < i3) {
                    int i31 = i30 << 3;
                    if (i31 > i6) {
                        i31 = i6;
                    }
                    int i32 = i3 - 3;
                    if (i30 < 2) {
                        min2 = 2;
                    } else {
                        min2 = Math.min(i30, i32);
                    }
                    int i33 = -2;
                    int i34 = 0;
                    for (int i35 = 2; i33 <= i35; i35 = 2) {
                        int[] iArr3 = iArr[min + i33];
                        i34 = iArr3[min2 - 2] + iArr3[min2 - 1] + iArr3[min2] + iArr3[min2 + 1] + iArr3[min2 + 2] + i34;
                        i33++;
                    }
                    int i36 = i34 / 25;
                    int i37 = (i28 * i) + i31;
                    int i38 = i;
                    int i39 = 0;
                    while (true) {
                        if (i39 < 8) {
                            int i40 = i27;
                            int i41 = 0;
                            for (int i42 = 8; i41 < i42; i42 = 8) {
                                int i43 = i41;
                                if ((bArr2[i37 + i41] & 255) <= i36) {
                                    rj0Var2.c(i31 + i43, i28 + i39);
                                }
                                i41 = i43 + 1;
                            }
                            i39++;
                            i37 += i38;
                            i27 = i40;
                        }
                    }
                    i30++;
                    i = i38;
                }
                i27++;
            }
            this.F = rj0Var2;
            return rj0Var2;
        }
        rj0 I = super.I();
        this.F = I;
        return I;
    }
}

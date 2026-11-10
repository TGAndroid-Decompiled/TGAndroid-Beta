package cc;

import java.lang.reflect.Array;
public final class h extends g {
    public b f6069e;

    @Override
    public final b a() {
        int min;
        int min2;
        b bVar = this.f6069e;
        if (bVar != null) {
            return bVar;
        }
        bc.d dVar = this.f6066a;
        int i7 = dVar.f3165a;
        int i10 = dVar.f3166b;
        if (i7 >= 40 && i10 >= 40) {
            byte[] a10 = dVar.a();
            int i11 = i7 >> 3;
            if ((i7 & 7) != 0) {
                i11++;
            }
            int i12 = i10 >> 3;
            if ((i10 & 7) != 0) {
                i12++;
            }
            int i13 = i10 - 8;
            int i14 = i7 - 8;
            int i15 = 2;
            boolean z9 = true;
            int i16 = 0;
            int[][] iArr = (int[][]) Array.newInstance(Integer.TYPE, i12, i11);
            int i17 = 0;
            while (true) {
                int i18 = 8;
                if (i17 >= i12) {
                    break;
                }
                int i19 = i17 << 3;
                if (i19 > i13) {
                    i19 = i13;
                }
                boolean z10 = z9;
                int i20 = i16;
                while (i20 < i11) {
                    int i21 = i20 << 3;
                    if (i21 > i14) {
                        i21 = i14;
                    }
                    int i22 = (i19 * i7) + i21;
                    int i23 = i15;
                    int i24 = 255;
                    int i25 = 0;
                    int i26 = 0;
                    int i27 = 0;
                    while (i25 < i18) {
                        byte[] bArr = a10;
                        int i28 = i27;
                        int i29 = 0;
                        while (i29 < i18) {
                            int i30 = i29;
                            int i31 = bArr[i22 + i29] & 255;
                            i26 += i31;
                            if (i31 < i24) {
                                i24 = i31;
                            }
                            if (i31 > i28) {
                                i28 = i31;
                            }
                            i29 = i30 + 1;
                            i18 = 8;
                        }
                        if (i28 - i24 > 24) {
                            while (true) {
                                i25++;
                                i22 += i7;
                                if (i25 < 8) {
                                    int i32 = 0;
                                    for (int i33 = 8; i32 < i33; i33 = 8) {
                                        i26 += bArr[i22 + i32] & 255;
                                        i32++;
                                        i24 = i24;
                                    }
                                }
                            }
                        }
                        i25++;
                        i22 += i7;
                        i24 = i24;
                        a10 = bArr;
                        i18 = 8;
                        i27 = i28;
                    }
                    byte[] bArr2 = a10;
                    int i34 = i26 >> 6;
                    if (i27 - i24 <= 24) {
                        i34 = i24 / 2;
                        if (i17 > 0 && i20 > 0) {
                            int[] iArr2 = iArr[i17 - 1];
                            int i35 = i20 - 1;
                            int i36 = (((iArr[i17][i35] * 2) + iArr2[i20]) + iArr2[i35]) / 4;
                            if (i24 < i36) {
                                i34 = i36;
                            }
                        }
                    }
                    iArr[i17][i20] = i34;
                    i20++;
                    i15 = i23;
                    a10 = bArr2;
                    i18 = 8;
                }
                i17++;
                z9 = z10;
                i16 = 0;
            }
            byte[] bArr3 = a10;
            int i37 = i15;
            b bVar2 = new b(i7, i10);
            int i38 = 0;
            while (i38 < i12) {
                int i39 = i38 << 3;
                if (i39 > i13) {
                    i39 = i13;
                }
                int i40 = i12 - 3;
                if (i38 < i37) {
                    min = 2;
                } else {
                    min = Math.min(i38, i40);
                }
                int i41 = 0;
                while (i41 < i11) {
                    int i42 = i41 << 3;
                    if (i42 > i14) {
                        i42 = i14;
                    }
                    int i43 = i11 - 3;
                    if (i41 < 2) {
                        min2 = 2;
                    } else {
                        min2 = Math.min(i41, i43);
                    }
                    int i44 = -2;
                    int i45 = 0;
                    for (int i46 = 2; i44 <= i46; i46 = 2) {
                        int[] iArr3 = iArr[min + i44];
                        i45 = iArr3[min2 - 2] + iArr3[min2 - 1] + iArr3[min2] + iArr3[min2 + 1] + iArr3[min2 + 2] + i45;
                        i44++;
                    }
                    int i47 = i45 / 25;
                    int i48 = (i39 * i7) + i42;
                    int i49 = i7;
                    int i50 = 0;
                    while (true) {
                        if (i50 < 8) {
                            int i51 = i38;
                            int i52 = 0;
                            for (int i53 = 8; i52 < i53; i53 = 8) {
                                int i54 = i52;
                                if ((bArr3[i48 + i52] & 255) <= i47) {
                                    bVar2.c(i42 + i54, i39 + i50);
                                }
                                i52 = i54 + 1;
                            }
                            i50++;
                            i48 += i49;
                            i38 = i51;
                        }
                    }
                    i41++;
                    i7 = i49;
                }
                i37 = 2;
                i38++;
            }
            this.f6069e = bVar2;
        } else {
            this.f6069e = super.a();
        }
        return this.f6069e;
    }
}

package ec;

import java.lang.reflect.Array;
public final class f extends e {
    public b e;

    @Override
    public final b a() {
        int min;
        int min2;
        b bVar = this.e;
        if (bVar != null) {
            return bVar;
        }
        dc.d dVar = this.f8593a;
        int i10 = dVar.f7929a;
        int i11 = dVar.f7930b;
        if (i10 >= 40 && i11 >= 40) {
            byte[] a2 = dVar.a();
            int i12 = i10 >> 3;
            if ((i10 & 7) != 0) {
                i12++;
            }
            int i13 = i11 >> 3;
            if ((i11 & 7) != 0) {
                i13++;
            }
            int i14 = i11 - 8;
            int i15 = i10 - 8;
            int i16 = 2;
            boolean z10 = true;
            int i17 = 0;
            int[][] iArr = (int[][]) Array.newInstance(Integer.TYPE, i13, i12);
            int i18 = 0;
            while (true) {
                int i19 = 8;
                if (i18 >= i13) {
                    break;
                }
                int i20 = i18 << 3;
                if (i20 > i14) {
                    i20 = i14;
                }
                boolean z11 = z10;
                int i21 = i17;
                while (i21 < i12) {
                    int i22 = i21 << 3;
                    if (i22 > i15) {
                        i22 = i15;
                    }
                    int i23 = (i20 * i10) + i22;
                    int i24 = i16;
                    int i25 = 255;
                    int i26 = 0;
                    int i27 = 0;
                    int i28 = 0;
                    while (i26 < i19) {
                        byte[] bArr = a2;
                        int i29 = i28;
                        int i30 = 0;
                        while (i30 < i19) {
                            int i31 = i30;
                            int i32 = bArr[i23 + i30] & 255;
                            i27 += i32;
                            if (i32 < i25) {
                                i25 = i32;
                            }
                            if (i32 > i29) {
                                i29 = i32;
                            }
                            i30 = i31 + 1;
                            i19 = 8;
                        }
                        if (i29 - i25 > 24) {
                            while (true) {
                                i26++;
                                i23 += i10;
                                if (i26 < 8) {
                                    int i33 = 0;
                                    for (int i34 = 8; i33 < i34; i34 = 8) {
                                        i27 += bArr[i23 + i33] & 255;
                                        i33++;
                                        i25 = i25;
                                    }
                                }
                            }
                        }
                        i26++;
                        i23 += i10;
                        i25 = i25;
                        a2 = bArr;
                        i19 = 8;
                        i28 = i29;
                    }
                    byte[] bArr2 = a2;
                    int i35 = i27 >> 6;
                    if (i28 - i25 <= 24) {
                        i35 = i25 / 2;
                        if (i18 > 0 && i21 > 0) {
                            int[] iArr2 = iArr[i18 - 1];
                            int i36 = i21 - 1;
                            int i37 = (((iArr[i18][i36] * 2) + iArr2[i21]) + iArr2[i36]) / 4;
                            if (i25 < i37) {
                                i35 = i37;
                            }
                        }
                    }
                    iArr[i18][i21] = i35;
                    i21++;
                    i16 = i24;
                    a2 = bArr2;
                    i19 = 8;
                }
                i18++;
                z10 = z11;
                i17 = 0;
            }
            byte[] bArr3 = a2;
            int i38 = i16;
            b bVar2 = new b(i10, i11);
            int i39 = 0;
            while (i39 < i13) {
                int i40 = i39 << 3;
                if (i40 > i14) {
                    i40 = i14;
                }
                int i41 = i13 - 3;
                if (i39 < i38) {
                    min = 2;
                } else {
                    min = Math.min(i39, i41);
                }
                int i42 = 0;
                while (i42 < i12) {
                    int i43 = i42 << 3;
                    if (i43 > i15) {
                        i43 = i15;
                    }
                    int i44 = i12 - 3;
                    if (i42 < 2) {
                        min2 = 2;
                    } else {
                        min2 = Math.min(i42, i44);
                    }
                    int i45 = -2;
                    int i46 = 0;
                    for (int i47 = 2; i45 <= i47; i47 = 2) {
                        int[] iArr3 = iArr[min + i45];
                        i46 = iArr3[min2 - 2] + iArr3[min2 - 1] + iArr3[min2] + iArr3[min2 + 1] + iArr3[min2 + 2] + i46;
                        i45++;
                    }
                    int i48 = i46 / 25;
                    int i49 = (i40 * i10) + i43;
                    int i50 = i10;
                    int i51 = 0;
                    while (true) {
                        if (i51 < 8) {
                            int i52 = i39;
                            int i53 = 0;
                            for (int i54 = 8; i53 < i54; i54 = 8) {
                                int i55 = i53;
                                if ((bArr3[i49 + i53] & 255) <= i48) {
                                    bVar2.c(i43 + i55, i40 + i51);
                                }
                                i53 = i55 + 1;
                            }
                            i51++;
                            i49 += i50;
                            i39 = i52;
                        }
                    }
                    i42++;
                    i10 = i50;
                }
                i38 = 2;
                i39++;
            }
            this.e = bVar2;
        } else {
            this.e = super.a();
        }
        return this.e;
    }
}

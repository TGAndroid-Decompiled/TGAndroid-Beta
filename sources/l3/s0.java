package l3;

import java.util.Arrays;
public final class s0 {
    public final int f14177a;
    public final int f14178b;
    public final float f14179c;
    public final float d;
    public final float f14180e;
    public final int f14181f;
    public final int f14182g;
    public final int h;
    public final short[] f14183i;
    public short[] f14184j;
    public int f14185k;
    public short[] f14186l;
    public int f14187m;
    public short[] f14188n;
    public int f14189o;
    public int f14190p;
    public int f14191q;
    public int f14192r;
    public int f14193s;
    public int f14194t;
    public int f14195u;
    public int v;

    public s0(int i10, float f9, int i11, float f10, int i12) {
        this.f14177a = i10;
        this.f14178b = i11;
        this.f14179c = f9;
        this.d = f10;
        this.f14180e = i10 / i12;
        this.f14181f = i10 / 400;
        int i13 = i10 / 65;
        this.f14182g = i13;
        int i14 = i13 * 2;
        this.h = i14;
        this.f14183i = new short[i14];
        this.f14184j = new short[i14 * i11];
        this.f14186l = new short[i14 * i11];
        this.f14188n = new short[i14 * i11];
    }

    public static void e(int i10, int i11, short[] sArr, int i12, short[] sArr2, int i13, short[] sArr3, int i14) {
        for (int i15 = 0; i15 < i11; i15++) {
            int i16 = (i12 * i11) + i15;
            int i17 = (i14 * i11) + i15;
            int i18 = (i13 * i11) + i15;
            for (int i19 = 0; i19 < i10; i19++) {
                sArr[i16] = (short) (((sArr3[i17] * i19) + ((i10 - i19) * sArr2[i18])) / i10);
                i16 += i11;
                i18 += i11;
                i17 += i11;
            }
        }
    }

    public final void a(short[] sArr, int i10, int i11) {
        short[] c3 = c(this.f14186l, this.f14187m, i11);
        this.f14186l = c3;
        int i12 = this.f14178b;
        System.arraycopy(sArr, i10 * i12, c3, this.f14187m * i12, i12 * i11);
        this.f14187m += i11;
    }

    public final void b(short[] sArr, int i10, int i11) {
        int i12 = this.h / i11;
        int i13 = this.f14178b;
        int i14 = i11 * i13;
        int i15 = i10 * i13;
        for (int i16 = 0; i16 < i12; i16++) {
            int i17 = 0;
            for (int i18 = 0; i18 < i14; i18++) {
                i17 += sArr[(i16 * i14) + i15 + i18];
            }
            this.f14183i[i16] = (short) (i17 / i14);
        }
    }

    public final short[] c(short[] sArr, int i10, int i11) {
        int length = sArr.length;
        int i12 = this.f14178b;
        int i13 = length / i12;
        if (i10 + i11 <= i13) {
            return sArr;
        }
        return Arrays.copyOf(sArr, (((i13 * 3) / 2) + i11) * i12);
    }

    public final int d(short[] sArr, int i10, int i11, int i12) {
        int i13 = i10 * this.f14178b;
        int i14 = 255;
        int i15 = 1;
        int i16 = 0;
        int i17 = 0;
        while (i11 <= i12) {
            int i18 = 0;
            for (int i19 = 0; i19 < i11; i19++) {
                i18 += Math.abs(sArr[i13 + i19] - sArr[(i13 + i11) + i19]);
            }
            if (i18 * i16 < i15 * i11) {
                i16 = i11;
                i15 = i18;
            }
            if (i18 * i14 > i17 * i11) {
                i14 = i11;
                i17 = i18;
            }
            i11++;
        }
        this.f14195u = i15 / i16;
        this.v = i17 / i14;
        return i16;
    }

    public final void f() {
        int i10;
        float f9;
        float f10;
        float f11;
        double d;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        boolean z10;
        int i19 = this.f14187m;
        float f12 = this.f14179c;
        float f13 = this.d;
        float f14 = f12 / f13;
        float f15 = this.f14180e * f13;
        double d10 = f14;
        int i20 = this.f14177a;
        int i21 = 1;
        int i22 = this.f14178b;
        if (d10 <= 1.00001d && d10 >= 0.99999d) {
            a(this.f14184j, 0, this.f14185k);
            this.f14185k = 0;
        } else {
            int i23 = this.f14185k;
            int i24 = this.h;
            if (i23 >= i24) {
                int i25 = 0;
                while (true) {
                    int i26 = this.f14192r;
                    if (i26 > 0) {
                        int min = Math.min(i24, i26);
                        a(this.f14184j, i25, min);
                        this.f14192r -= min;
                        i25 += min;
                        f10 = f14;
                        f11 = f15;
                        d = d10;
                        f9 = 1.0f;
                    } else {
                        short[] sArr = this.f14184j;
                        if (i20 > 4000) {
                            i10 = i20 / 4000;
                        } else {
                            i10 = 1;
                        }
                        f9 = 1.0f;
                        int i27 = this.f14182g;
                        int i28 = this.f14181f;
                        if (i22 == i21 && i10 == i21) {
                            i11 = d(sArr, i25, i28, i27);
                            f10 = f14;
                            f11 = f15;
                            d = d10;
                        } else {
                            b(sArr, i25, i10);
                            f10 = f14;
                            f11 = f15;
                            short[] sArr2 = this.f14183i;
                            d = d10;
                            int d11 = d(sArr2, 0, i28 / i10, i27 / i10);
                            if (i10 != 1) {
                                int i29 = d11 * i10;
                                int i30 = i10 * 4;
                                int i31 = i29 - i30;
                                int i32 = i29 + i30;
                                if (i31 >= i28) {
                                    i28 = i31;
                                }
                                if (i32 <= i27) {
                                    i27 = i32;
                                }
                                if (i22 == 1) {
                                    i11 = d(sArr, i25, i28, i27);
                                } else {
                                    b(sArr, i25, 1);
                                    i11 = d(sArr2, 0, i28, i27);
                                }
                            } else {
                                i11 = d11;
                            }
                        }
                        int i33 = this.f14195u;
                        int i34 = this.v;
                        if (i33 == 0 || (i12 = this.f14193s) == 0 || i34 > i33 * 3 || i33 * 2 <= this.f14194t * 3) {
                            i12 = i11;
                        }
                        this.f14194t = i33;
                        this.f14193s = i11;
                        if (d > 1.0d) {
                            short[] sArr3 = this.f14184j;
                            if (f10 >= 2.0f) {
                                i14 = (int) (i12 / (f10 - 1.0f));
                            } else {
                                this.f14192r = (int) (((2.0f - f10) * i12) / (f10 - 1.0f));
                                i14 = i12;
                            }
                            short[] c3 = c(this.f14186l, this.f14187m, i14);
                            this.f14186l = c3;
                            int i35 = i25 + i12;
                            int i36 = i25;
                            int i37 = i14;
                            e(i37, this.f14178b, c3, this.f14187m, sArr3, i36, sArr3, i35);
                            this.f14187m += i37;
                            i25 = i12 + i37 + i36;
                        } else {
                            int i38 = i25;
                            short[] sArr4 = this.f14184j;
                            if (f10 < 0.5f) {
                                i13 = (int) ((i12 * f10) / (1.0f - f10));
                            } else {
                                this.f14192r = (int) ((((2.0f * f10) - 1.0f) * i12) / (1.0f - f10));
                                i13 = i12;
                            }
                            int i39 = i12 + i13;
                            short[] c6 = c(this.f14186l, this.f14187m, i39);
                            this.f14186l = c6;
                            System.arraycopy(sArr4, i38 * i22, c6, this.f14187m * i22, i12 * i22);
                            e(i13, this.f14178b, this.f14186l, this.f14187m + i12, sArr4, i38 + i12, sArr4, i38);
                            this.f14187m += i39;
                            i25 = i38 + i13;
                        }
                    }
                    if (i25 + i24 > i23) {
                        break;
                    }
                    f14 = f10;
                    f15 = f11;
                    d10 = d;
                    i21 = 1;
                }
                int i40 = this.f14185k - i25;
                short[] sArr5 = this.f14184j;
                System.arraycopy(sArr5, i25 * i22, sArr5, 0, i40 * i22);
                this.f14185k = i40;
                if (f11 == f9 && this.f14187m != i19) {
                    int i41 = (int) (i20 / f11);
                    while (true) {
                        if (i41 <= 16384 && i20 <= 16384) {
                            break;
                        }
                        i41 /= 2;
                        i20 /= 2;
                    }
                    int i42 = this.f14187m - i19;
                    short[] c10 = c(this.f14188n, this.f14189o, i42);
                    this.f14188n = c10;
                    System.arraycopy(this.f14186l, i19 * i22, c10, this.f14189o * i22, i42 * i22);
                    this.f14187m = i19;
                    this.f14189o += i42;
                    int i43 = 0;
                    while (true) {
                        i15 = this.f14189o;
                        i16 = i15 - 1;
                        if (i43 >= i16) {
                            break;
                        }
                        while (true) {
                            i17 = this.f14190p + 1;
                            int i44 = i17 * i41;
                            i18 = this.f14191q;
                            if (i44 <= i18 * i20) {
                                break;
                            }
                            this.f14186l = c(this.f14186l, this.f14187m, 1);
                            for (int i45 = 0; i45 < i22; i45++) {
                                short[] sArr6 = this.f14188n;
                                int i46 = (i43 * i22) + i45;
                                short s10 = sArr6[i46];
                                short s11 = sArr6[i46 + i22];
                                int i47 = this.f14190p;
                                int i48 = i47 * i41;
                                int i49 = (i47 + 1) * i41;
                                int i50 = i49 - (this.f14191q * i20);
                                int i51 = i49 - i48;
                                this.f14186l[(this.f14187m * i22) + i45] = (short) ((((i51 - i50) * s11) + (s10 * i50)) / i51);
                            }
                            this.f14191q++;
                            this.f14187m++;
                        }
                        this.f14190p = i17;
                        if (i17 == i20) {
                            this.f14190p = 0;
                            if (i18 == i41) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            f5.a.i(z10);
                            this.f14191q = 0;
                        }
                        i43++;
                    }
                    if (i16 != 0) {
                        short[] sArr7 = this.f14188n;
                        System.arraycopy(sArr7, i16 * i22, sArr7, 0, (i15 - i16) * i22);
                        this.f14189o -= i16;
                        return;
                    }
                    return;
                }
            }
        }
        f11 = f15;
        f9 = 1.0f;
        if (f11 == f9) {
        }
    }
}

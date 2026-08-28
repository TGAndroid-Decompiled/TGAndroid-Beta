package j3;

import java.util.Arrays;
public final class q0 {
    public final int f13315a;
    public final int f13316b;
    public final float f13317c;
    public final float d;
    public final float f13318e;
    public final int f13319f;
    public final int f13320g;
    public final int h;
    public final short[] f13321i;
    public short[] f13322j;
    public int f13323k;
    public short[] f13324l;
    public int f13325m;
    public short[] f13326n;
    public int f13327o;
    public int f13328p;
    public int f13329q;
    public int f13330r;
    public int f13331s;
    public int f13332t;
    public int f13333u;
    public int v;

    public q0(int i9, float f10, int i10, float f11, int i11) {
        this.f13315a = i9;
        this.f13316b = i10;
        this.f13317c = f10;
        this.d = f11;
        this.f13318e = i9 / i11;
        this.f13319f = i9 / 400;
        int i12 = i9 / 65;
        this.f13320g = i12;
        int i13 = i12 * 2;
        this.h = i13;
        this.f13321i = new short[i13];
        this.f13322j = new short[i13 * i10];
        this.f13324l = new short[i13 * i10];
        this.f13326n = new short[i13 * i10];
    }

    public static void e(int i9, int i10, short[] sArr, int i11, short[] sArr2, int i12, short[] sArr3, int i13) {
        for (int i14 = 0; i14 < i10; i14++) {
            int i15 = (i11 * i10) + i14;
            int i16 = (i13 * i10) + i14;
            int i17 = (i12 * i10) + i14;
            for (int i18 = 0; i18 < i9; i18++) {
                sArr[i15] = (short) (((sArr3[i16] * i18) + ((i9 - i18) * sArr2[i17])) / i9);
                i15 += i10;
                i17 += i10;
                i16 += i10;
            }
        }
    }

    public final void a(short[] sArr, int i9, int i10) {
        short[] c10 = c(this.f13324l, this.f13325m, i10);
        this.f13324l = c10;
        int i11 = this.f13316b;
        System.arraycopy(sArr, i9 * i11, c10, this.f13325m * i11, i11 * i10);
        this.f13325m += i10;
    }

    public final void b(short[] sArr, int i9, int i10) {
        int i11 = this.h / i10;
        int i12 = this.f13316b;
        int i13 = i10 * i12;
        int i14 = i9 * i12;
        for (int i15 = 0; i15 < i11; i15++) {
            int i16 = 0;
            for (int i17 = 0; i17 < i13; i17++) {
                i16 += sArr[(i15 * i13) + i14 + i17];
            }
            this.f13321i[i15] = (short) (i16 / i13);
        }
    }

    public final short[] c(short[] sArr, int i9, int i10) {
        int length = sArr.length;
        int i11 = this.f13316b;
        int i12 = length / i11;
        if (i9 + i10 <= i12) {
            return sArr;
        }
        return Arrays.copyOf(sArr, (((i12 * 3) / 2) + i10) * i11);
    }

    public final int d(short[] sArr, int i9, int i10, int i11) {
        int i12 = i9 * this.f13316b;
        int i13 = 255;
        int i14 = 1;
        int i15 = 0;
        int i16 = 0;
        while (i10 <= i11) {
            int i17 = 0;
            for (int i18 = 0; i18 < i10; i18++) {
                i17 += Math.abs(sArr[i12 + i18] - sArr[(i12 + i10) + i18]);
            }
            if (i17 * i15 < i14 * i10) {
                i15 = i10;
                i14 = i17;
            }
            if (i17 * i13 > i16 * i10) {
                i13 = i10;
                i16 = i17;
            }
            i10++;
        }
        this.f13333u = i14 / i15;
        this.v = i16 / i13;
        return i15;
    }

    public final void f() {
        int i9;
        float f10;
        float f11;
        float f12;
        double d;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z10;
        int i18 = this.f13325m;
        float f13 = this.f13317c;
        float f14 = this.d;
        float f15 = f13 / f14;
        float f16 = this.f13318e * f14;
        double d9 = f15;
        int i19 = this.f13315a;
        int i20 = 1;
        int i21 = this.f13316b;
        if (d9 <= 1.00001d && d9 >= 0.99999d) {
            a(this.f13322j, 0, this.f13323k);
            this.f13323k = 0;
        } else {
            int i22 = this.f13323k;
            int i23 = this.h;
            if (i22 >= i23) {
                int i24 = 0;
                while (true) {
                    int i25 = this.f13330r;
                    if (i25 > 0) {
                        int min = Math.min(i23, i25);
                        a(this.f13322j, i24, min);
                        this.f13330r -= min;
                        i24 += min;
                        f11 = f15;
                        f12 = f16;
                        d = d9;
                        f10 = 1.0f;
                    } else {
                        short[] sArr = this.f13322j;
                        if (i19 > 4000) {
                            i9 = i19 / 4000;
                        } else {
                            i9 = 1;
                        }
                        f10 = 1.0f;
                        int i26 = this.f13320g;
                        int i27 = this.f13319f;
                        if (i21 == i20 && i9 == i20) {
                            i10 = d(sArr, i24, i27, i26);
                            f11 = f15;
                            f12 = f16;
                            d = d9;
                        } else {
                            b(sArr, i24, i9);
                            f11 = f15;
                            f12 = f16;
                            short[] sArr2 = this.f13321i;
                            d = d9;
                            int d10 = d(sArr2, 0, i27 / i9, i26 / i9);
                            if (i9 != 1) {
                                int i28 = d10 * i9;
                                int i29 = i9 * 4;
                                int i30 = i28 - i29;
                                int i31 = i28 + i29;
                                if (i30 >= i27) {
                                    i27 = i30;
                                }
                                if (i31 <= i26) {
                                    i26 = i31;
                                }
                                if (i21 == 1) {
                                    i10 = d(sArr, i24, i27, i26);
                                } else {
                                    b(sArr, i24, 1);
                                    i10 = d(sArr2, 0, i27, i26);
                                }
                            } else {
                                i10 = d10;
                            }
                        }
                        int i32 = this.f13333u;
                        int i33 = this.v;
                        if (i32 == 0 || (i11 = this.f13331s) == 0 || i33 > i32 * 3 || i32 * 2 <= this.f13332t * 3) {
                            i11 = i10;
                        }
                        this.f13332t = i32;
                        this.f13331s = i10;
                        if (d > 1.0d) {
                            short[] sArr3 = this.f13322j;
                            if (f11 >= 2.0f) {
                                i13 = (int) (i11 / (f11 - 1.0f));
                            } else {
                                this.f13330r = (int) (((2.0f - f11) * i11) / (f11 - 1.0f));
                                i13 = i11;
                            }
                            short[] c10 = c(this.f13324l, this.f13325m, i13);
                            this.f13324l = c10;
                            int i34 = i24 + i11;
                            int i35 = i24;
                            int i36 = i13;
                            e(i36, this.f13316b, c10, this.f13325m, sArr3, i35, sArr3, i34);
                            this.f13325m += i36;
                            i24 = i11 + i36 + i35;
                        } else {
                            int i37 = i24;
                            short[] sArr4 = this.f13322j;
                            if (f11 < 0.5f) {
                                i12 = (int) ((i11 * f11) / (1.0f - f11));
                            } else {
                                this.f13330r = (int) ((((2.0f * f11) - 1.0f) * i11) / (1.0f - f11));
                                i12 = i11;
                            }
                            int i38 = i11 + i12;
                            short[] c11 = c(this.f13324l, this.f13325m, i38);
                            this.f13324l = c11;
                            System.arraycopy(sArr4, i37 * i21, c11, this.f13325m * i21, i11 * i21);
                            e(i12, this.f13316b, this.f13324l, this.f13325m + i11, sArr4, i37 + i11, sArr4, i37);
                            this.f13325m += i38;
                            i24 = i37 + i12;
                        }
                    }
                    if (i24 + i23 > i22) {
                        break;
                    }
                    f15 = f11;
                    f16 = f12;
                    d9 = d;
                    i20 = 1;
                }
                int i39 = this.f13323k - i24;
                short[] sArr5 = this.f13322j;
                System.arraycopy(sArr5, i24 * i21, sArr5, 0, i39 * i21);
                this.f13323k = i39;
                if (f12 == f10 && this.f13325m != i18) {
                    int i40 = (int) (i19 / f12);
                    while (true) {
                        if (i40 <= 16384 && i19 <= 16384) {
                            break;
                        }
                        i40 /= 2;
                        i19 /= 2;
                    }
                    int i41 = this.f13325m - i18;
                    short[] c12 = c(this.f13326n, this.f13327o, i41);
                    this.f13326n = c12;
                    System.arraycopy(this.f13324l, i18 * i21, c12, this.f13327o * i21, i41 * i21);
                    this.f13325m = i18;
                    this.f13327o += i41;
                    int i42 = 0;
                    while (true) {
                        i14 = this.f13327o;
                        i15 = i14 - 1;
                        if (i42 >= i15) {
                            break;
                        }
                        while (true) {
                            i16 = this.f13328p + 1;
                            int i43 = i16 * i40;
                            i17 = this.f13329q;
                            if (i43 <= i17 * i19) {
                                break;
                            }
                            this.f13324l = c(this.f13324l, this.f13325m, 1);
                            for (int i44 = 0; i44 < i21; i44++) {
                                short[] sArr6 = this.f13326n;
                                int i45 = (i42 * i21) + i44;
                                short s10 = sArr6[i45];
                                short s11 = sArr6[i45 + i21];
                                int i46 = this.f13328p;
                                int i47 = i46 * i40;
                                int i48 = (i46 + 1) * i40;
                                int i49 = i48 - (this.f13329q * i19);
                                int i50 = i48 - i47;
                                this.f13324l[(this.f13325m * i21) + i44] = (short) ((((i50 - i49) * s11) + (s10 * i49)) / i50);
                            }
                            this.f13329q++;
                            this.f13325m++;
                        }
                        this.f13328p = i16;
                        if (i16 == i19) {
                            this.f13328p = 0;
                            if (i17 == i40) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            d5.a.i(z10);
                            this.f13329q = 0;
                        }
                        i42++;
                    }
                    if (i15 != 0) {
                        short[] sArr7 = this.f13326n;
                        System.arraycopy(sArr7, i15 * i21, sArr7, 0, (i14 - i15) * i21);
                        this.f13327o -= i15;
                        return;
                    }
                    return;
                }
            }
        }
        f12 = f16;
        f10 = 1.0f;
        if (f12 == f10) {
        }
    }
}

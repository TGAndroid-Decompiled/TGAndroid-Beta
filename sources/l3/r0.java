package l3;

import java.util.Arrays;
public final class r0 {
    public final int f11339a;
    public final int f11340b;
    public final float f11341c;
    public final float d;
    public final float e;
    public final int f11342f;
    public final int f11343g;
    public final int h;
    public final short[] f11344i;
    public short[] f11345j;
    public int f11346k;
    public short[] f11347l;
    public int f11348m;
    public short[] f11349n;
    public int f11350o;
    public int f11351p;
    public int f11352q;
    public int f11353r;
    public int f11354s;
    public int f11355t;
    public int f11356u;
    public int v;

    public r0(int i10, float f10, int i11, float f11, int i12) {
        this.f11339a = i10;
        this.f11340b = i11;
        this.f11341c = f10;
        this.d = f11;
        this.e = i10 / i12;
        this.f11342f = i10 / 400;
        int i13 = i10 / 65;
        this.f11343g = i13;
        int i14 = i13 * 2;
        this.h = i14;
        this.f11344i = new short[i14];
        this.f11345j = new short[i14 * i11];
        this.f11347l = new short[i14 * i11];
        this.f11349n = new short[i14 * i11];
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
        short[] c3 = c(this.f11347l, this.f11348m, i11);
        this.f11347l = c3;
        int i12 = this.f11340b;
        System.arraycopy(sArr, i10 * i12, c3, this.f11348m * i12, i12 * i11);
        this.f11348m += i11;
    }

    public final void b(short[] sArr, int i10, int i11) {
        int i12 = this.h / i11;
        int i13 = this.f11340b;
        int i14 = i11 * i13;
        int i15 = i10 * i13;
        for (int i16 = 0; i16 < i12; i16++) {
            int i17 = 0;
            for (int i18 = 0; i18 < i14; i18++) {
                i17 += sArr[(i16 * i14) + i15 + i18];
            }
            this.f11344i[i16] = (short) (i17 / i14);
        }
    }

    public final short[] c(short[] sArr, int i10, int i11) {
        int length = sArr.length;
        int i12 = this.f11340b;
        int i13 = length / i12;
        if (i10 + i11 <= i13) {
            return sArr;
        }
        return Arrays.copyOf(sArr, (((i13 * 3) / 2) + i11) * i12);
    }

    public final int d(short[] sArr, int i10, int i11, int i12) {
        int i13 = i10 * this.f11340b;
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
        this.f11356u = i15 / i16;
        this.v = i17 / i14;
        return i16;
    }

    public final void f() {
        int i10;
        float f10;
        float f11;
        float f12;
        double d;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        boolean z4;
        int i19 = this.f11348m;
        float f13 = this.f11341c;
        float f14 = this.d;
        float f15 = f13 / f14;
        float f16 = this.e * f14;
        double d10 = f15;
        int i20 = this.f11339a;
        int i21 = 1;
        int i22 = this.f11340b;
        if (d10 <= 1.00001d && d10 >= 0.99999d) {
            a(this.f11345j, 0, this.f11346k);
            this.f11346k = 0;
        } else {
            int i23 = this.f11346k;
            int i24 = this.h;
            if (i23 >= i24) {
                int i25 = 0;
                while (true) {
                    int i26 = this.f11353r;
                    if (i26 > 0) {
                        int min = Math.min(i24, i26);
                        a(this.f11345j, i25, min);
                        this.f11353r -= min;
                        i25 += min;
                        f11 = f15;
                        f12 = f16;
                        d = d10;
                        f10 = 1.0f;
                    } else {
                        short[] sArr = this.f11345j;
                        if (i20 > 4000) {
                            i10 = i20 / 4000;
                        } else {
                            i10 = 1;
                        }
                        f10 = 1.0f;
                        int i27 = this.f11343g;
                        int i28 = this.f11342f;
                        if (i22 == i21 && i10 == i21) {
                            i11 = d(sArr, i25, i28, i27);
                            f11 = f15;
                            f12 = f16;
                            d = d10;
                        } else {
                            b(sArr, i25, i10);
                            f11 = f15;
                            f12 = f16;
                            short[] sArr2 = this.f11344i;
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
                        int i33 = this.f11356u;
                        int i34 = this.v;
                        if (i33 == 0 || (i12 = this.f11354s) == 0 || i34 > i33 * 3 || i33 * 2 <= this.f11355t * 3) {
                            i12 = i11;
                        }
                        this.f11355t = i33;
                        this.f11354s = i11;
                        if (d > 1.0d) {
                            short[] sArr3 = this.f11345j;
                            if (f11 >= 2.0f) {
                                i14 = (int) (i12 / (f11 - 1.0f));
                            } else {
                                this.f11353r = (int) (((2.0f - f11) * i12) / (f11 - 1.0f));
                                i14 = i12;
                            }
                            short[] c3 = c(this.f11347l, this.f11348m, i14);
                            this.f11347l = c3;
                            int i35 = i25 + i12;
                            int i36 = i25;
                            int i37 = i14;
                            e(i37, this.f11340b, c3, this.f11348m, sArr3, i36, sArr3, i35);
                            this.f11348m += i37;
                            i25 = i12 + i37 + i36;
                        } else {
                            int i38 = i25;
                            short[] sArr4 = this.f11345j;
                            if (f11 < 0.5f) {
                                i13 = (int) ((i12 * f11) / (1.0f - f11));
                            } else {
                                this.f11353r = (int) ((((2.0f * f11) - 1.0f) * i12) / (1.0f - f11));
                                i13 = i12;
                            }
                            int i39 = i12 + i13;
                            short[] c10 = c(this.f11347l, this.f11348m, i39);
                            this.f11347l = c10;
                            System.arraycopy(sArr4, i38 * i22, c10, this.f11348m * i22, i12 * i22);
                            e(i13, this.f11340b, this.f11347l, this.f11348m + i12, sArr4, i38 + i12, sArr4, i38);
                            this.f11348m += i39;
                            i25 = i38 + i13;
                        }
                    }
                    if (i25 + i24 > i23) {
                        break;
                    }
                    f15 = f11;
                    f16 = f12;
                    d10 = d;
                    i21 = 1;
                }
                int i40 = this.f11346k - i25;
                short[] sArr5 = this.f11345j;
                System.arraycopy(sArr5, i25 * i22, sArr5, 0, i40 * i22);
                this.f11346k = i40;
                if (f12 == f10 && this.f11348m != i19) {
                    int i41 = (int) (i20 / f12);
                    while (true) {
                        if (i41 <= 16384 && i20 <= 16384) {
                            break;
                        }
                        i41 /= 2;
                        i20 /= 2;
                    }
                    int i42 = this.f11348m - i19;
                    short[] c11 = c(this.f11349n, this.f11350o, i42);
                    this.f11349n = c11;
                    System.arraycopy(this.f11347l, i19 * i22, c11, this.f11350o * i22, i42 * i22);
                    this.f11348m = i19;
                    this.f11350o += i42;
                    int i43 = 0;
                    while (true) {
                        i15 = this.f11350o;
                        i16 = i15 - 1;
                        if (i43 >= i16) {
                            break;
                        }
                        while (true) {
                            i17 = this.f11351p + 1;
                            int i44 = i17 * i41;
                            i18 = this.f11352q;
                            if (i44 <= i18 * i20) {
                                break;
                            }
                            this.f11347l = c(this.f11347l, this.f11348m, 1);
                            for (int i45 = 0; i45 < i22; i45++) {
                                short[] sArr6 = this.f11349n;
                                int i46 = (i43 * i22) + i45;
                                short s6 = sArr6[i46];
                                short s9 = sArr6[i46 + i22];
                                int i47 = this.f11351p;
                                int i48 = i47 * i41;
                                int i49 = (i47 + 1) * i41;
                                int i50 = i49 - (this.f11352q * i20);
                                int i51 = i49 - i48;
                                this.f11347l[(this.f11348m * i22) + i45] = (short) ((((i51 - i50) * s9) + (s6 * i50)) / i51);
                            }
                            this.f11352q++;
                            this.f11348m++;
                        }
                        this.f11351p = i17;
                        if (i17 == i20) {
                            this.f11351p = 0;
                            if (i18 == i41) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            h5.a.i(z4);
                            this.f11352q = 0;
                        }
                        i43++;
                    }
                    if (i16 != 0) {
                        short[] sArr7 = this.f11349n;
                        System.arraycopy(sArr7, i16 * i22, sArr7, 0, (i15 - i16) * i22);
                        this.f11350o -= i16;
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

package l3;

import java.util.Arrays;
public final class r0 {
    public final int f11229a;
    public final int f11230b;
    public final float f11231c;
    public final float d;
    public final float e;
    public final int f11232f;
    public final int f11233g;
    public final int h;
    public final short[] f11234i;
    public short[] f11235j;
    public int f11236k;
    public short[] f11237l;
    public int f11238m;
    public short[] f11239n;
    public int f11240o;
    public int f11241p;
    public int f11242q;
    public int f11243r;
    public int f11244s;
    public int f11245t;
    public int f11246u;
    public int v;

    public r0(int i10, float f10, int i11, float f11, int i12) {
        this.f11229a = i10;
        this.f11230b = i11;
        this.f11231c = f10;
        this.d = f11;
        this.e = i10 / i12;
        this.f11232f = i10 / 400;
        int i13 = i10 / 65;
        this.f11233g = i13;
        int i14 = i13 * 2;
        this.h = i14;
        this.f11234i = new short[i14];
        this.f11235j = new short[i14 * i11];
        this.f11237l = new short[i14 * i11];
        this.f11239n = new short[i14 * i11];
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
        short[] c3 = c(this.f11237l, this.f11238m, i11);
        this.f11237l = c3;
        int i12 = this.f11230b;
        System.arraycopy(sArr, i10 * i12, c3, this.f11238m * i12, i12 * i11);
        this.f11238m += i11;
    }

    public final void b(short[] sArr, int i10, int i11) {
        int i12 = this.h / i11;
        int i13 = this.f11230b;
        int i14 = i11 * i13;
        int i15 = i10 * i13;
        for (int i16 = 0; i16 < i12; i16++) {
            int i17 = 0;
            for (int i18 = 0; i18 < i14; i18++) {
                i17 += sArr[(i16 * i14) + i15 + i18];
            }
            this.f11234i[i16] = (short) (i17 / i14);
        }
    }

    public final short[] c(short[] sArr, int i10, int i11) {
        int length = sArr.length;
        int i12 = this.f11230b;
        int i13 = length / i12;
        if (i10 + i11 <= i13) {
            return sArr;
        }
        return Arrays.copyOf(sArr, (((i13 * 3) / 2) + i11) * i12);
    }

    public final int d(short[] sArr, int i10, int i11, int i12) {
        int i13 = i10 * this.f11230b;
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
        this.f11246u = i15 / i16;
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
        int i19 = this.f11238m;
        float f13 = this.f11231c;
        float f14 = this.d;
        float f15 = f13 / f14;
        float f16 = this.e * f14;
        double d10 = f15;
        int i20 = this.f11229a;
        int i21 = 1;
        int i22 = this.f11230b;
        if (d10 <= 1.00001d && d10 >= 0.99999d) {
            a(this.f11235j, 0, this.f11236k);
            this.f11236k = 0;
        } else {
            int i23 = this.f11236k;
            int i24 = this.h;
            if (i23 >= i24) {
                int i25 = 0;
                while (true) {
                    int i26 = this.f11243r;
                    if (i26 > 0) {
                        int min = Math.min(i24, i26);
                        a(this.f11235j, i25, min);
                        this.f11243r -= min;
                        i25 += min;
                        f11 = f15;
                        f12 = f16;
                        d = d10;
                        f10 = 1.0f;
                    } else {
                        short[] sArr = this.f11235j;
                        if (i20 > 4000) {
                            i10 = i20 / 4000;
                        } else {
                            i10 = 1;
                        }
                        f10 = 1.0f;
                        int i27 = this.f11233g;
                        int i28 = this.f11232f;
                        if (i22 == i21 && i10 == i21) {
                            i11 = d(sArr, i25, i28, i27);
                            f11 = f15;
                            f12 = f16;
                            d = d10;
                        } else {
                            b(sArr, i25, i10);
                            f11 = f15;
                            f12 = f16;
                            short[] sArr2 = this.f11234i;
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
                        int i33 = this.f11246u;
                        int i34 = this.v;
                        if (i33 == 0 || (i12 = this.f11244s) == 0 || i34 > i33 * 3 || i33 * 2 <= this.f11245t * 3) {
                            i12 = i11;
                        }
                        this.f11245t = i33;
                        this.f11244s = i11;
                        if (d > 1.0d) {
                            short[] sArr3 = this.f11235j;
                            if (f11 >= 2.0f) {
                                i14 = (int) (i12 / (f11 - 1.0f));
                            } else {
                                this.f11243r = (int) (((2.0f - f11) * i12) / (f11 - 1.0f));
                                i14 = i12;
                            }
                            short[] c3 = c(this.f11237l, this.f11238m, i14);
                            this.f11237l = c3;
                            int i35 = i25 + i12;
                            int i36 = i25;
                            int i37 = i14;
                            e(i37, this.f11230b, c3, this.f11238m, sArr3, i36, sArr3, i35);
                            this.f11238m += i37;
                            i25 = i12 + i37 + i36;
                        } else {
                            int i38 = i25;
                            short[] sArr4 = this.f11235j;
                            if (f11 < 0.5f) {
                                i13 = (int) ((i12 * f11) / (1.0f - f11));
                            } else {
                                this.f11243r = (int) ((((2.0f * f11) - 1.0f) * i12) / (1.0f - f11));
                                i13 = i12;
                            }
                            int i39 = i12 + i13;
                            short[] c10 = c(this.f11237l, this.f11238m, i39);
                            this.f11237l = c10;
                            System.arraycopy(sArr4, i38 * i22, c10, this.f11238m * i22, i12 * i22);
                            e(i13, this.f11230b, this.f11237l, this.f11238m + i12, sArr4, i38 + i12, sArr4, i38);
                            this.f11238m += i39;
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
                int i40 = this.f11236k - i25;
                short[] sArr5 = this.f11235j;
                System.arraycopy(sArr5, i25 * i22, sArr5, 0, i40 * i22);
                this.f11236k = i40;
                if (f12 == f10 && this.f11238m != i19) {
                    int i41 = (int) (i20 / f12);
                    while (true) {
                        if (i41 <= 16384 && i20 <= 16384) {
                            break;
                        }
                        i41 /= 2;
                        i20 /= 2;
                    }
                    int i42 = this.f11238m - i19;
                    short[] c11 = c(this.f11239n, this.f11240o, i42);
                    this.f11239n = c11;
                    System.arraycopy(this.f11237l, i19 * i22, c11, this.f11240o * i22, i42 * i22);
                    this.f11238m = i19;
                    this.f11240o += i42;
                    int i43 = 0;
                    while (true) {
                        i15 = this.f11240o;
                        i16 = i15 - 1;
                        if (i43 >= i16) {
                            break;
                        }
                        while (true) {
                            i17 = this.f11241p + 1;
                            int i44 = i17 * i41;
                            i18 = this.f11242q;
                            if (i44 <= i18 * i20) {
                                break;
                            }
                            this.f11237l = c(this.f11237l, this.f11238m, 1);
                            for (int i45 = 0; i45 < i22; i45++) {
                                short[] sArr6 = this.f11239n;
                                int i46 = (i43 * i22) + i45;
                                short s6 = sArr6[i46];
                                short s9 = sArr6[i46 + i22];
                                int i47 = this.f11241p;
                                int i48 = i47 * i41;
                                int i49 = (i47 + 1) * i41;
                                int i50 = i49 - (this.f11242q * i20);
                                int i51 = i49 - i48;
                                this.f11237l[(this.f11238m * i22) + i45] = (short) ((((i51 - i50) * s9) + (s6 * i50)) / i51);
                            }
                            this.f11242q++;
                            this.f11238m++;
                        }
                        this.f11241p = i17;
                        if (i17 == i20) {
                            this.f11241p = 0;
                            if (i18 == i41) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            h5.a.i(z4);
                            this.f11242q = 0;
                        }
                        i43++;
                    }
                    if (i16 != 0) {
                        short[] sArr7 = this.f11239n;
                        System.arraycopy(sArr7, i16 * i22, sArr7, 0, (i15 - i16) * i22);
                        this.f11240o -= i16;
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

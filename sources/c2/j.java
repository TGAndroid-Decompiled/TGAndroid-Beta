package c2;

import java.util.Arrays;
public final class j {
    public final int f3968a;
    public final int f3969b;
    public final float f3970c;
    public final float d;
    public final float f3971e;
    public final int f3972f;
    public final int f3973g;
    public final int h;
    public final short[] f3974i;
    public short[] f3975j;
    public int f3976k;
    public short[] f3977l;
    public int f3978m;
    public short[] f3979n;
    public int f3980o;
    public int f3981p;
    public int f3982q;
    public int f3983r;
    public int f3984s;
    public int f3985t;
    public int f3986u;
    public int v;
    public double f3987w;

    public j(int i10, float f7, int i11, float f10, int i12) {
        this.f3968a = i10;
        this.f3969b = i11;
        this.f3970c = f7;
        this.d = f10;
        this.f3971e = i10 / i12;
        this.f3972f = i10 / 400;
        int i13 = i10 / 65;
        this.f3973g = i13;
        int i14 = i13 * 2;
        this.h = i14;
        this.f3974i = new short[i14];
        this.f3975j = new short[i14 * i11];
        this.f3977l = new short[i14 * i11];
        this.f3979n = new short[i14 * i11];
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
        short[] c10 = c(this.f3977l, this.f3978m, i11);
        this.f3977l = c10;
        int i12 = this.f3969b;
        System.arraycopy(sArr, i10 * i12, c10, this.f3978m * i12, i12 * i11);
        this.f3978m += i11;
    }

    public final void b(short[] sArr, int i10, int i11) {
        int i12 = this.h / i11;
        int i13 = this.f3969b;
        int i14 = i11 * i13;
        int i15 = i10 * i13;
        for (int i16 = 0; i16 < i12; i16++) {
            int i17 = 0;
            for (int i18 = 0; i18 < i14; i18++) {
                i17 += sArr[(i16 * i14) + i15 + i18];
            }
            this.f3974i[i16] = (short) (i17 / i14);
        }
    }

    public final short[] c(short[] sArr, int i10, int i11) {
        int length = sArr.length;
        int i12 = this.f3969b;
        int i13 = length / i12;
        if (i10 + i11 <= i13) {
            return sArr;
        }
        return Arrays.copyOf(sArr, (((i13 * 3) / 2) + i11) * i12);
    }

    public final int d(short[] sArr, int i10, int i11, int i12) {
        int i13 = i10 * this.f3969b;
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
        this.f3986u = i15 / i16;
        this.v = i17 / i14;
        return i16;
    }

    public final void f() {
        int i10;
        float f7;
        double d;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        long j3;
        long j10;
        boolean z10;
        int i19;
        int i20 = this.f3978m;
        float f10 = this.f3970c;
        float f11 = this.d;
        double d10 = f10 / f11;
        float f12 = this.f3971e * f11;
        int i21 = this.f3968a;
        int i22 = 1;
        int i23 = this.f3969b;
        int i24 = 0;
        if (d10 <= 1.0000100135803223d && d10 >= 0.9999899864196777d) {
            a(this.f3975j, 0, this.f3976k);
            this.f3976k = 0;
        } else {
            int i25 = this.f3976k;
            int i26 = this.h;
            if (i25 >= i26) {
                int i27 = 0;
                while (true) {
                    int i28 = this.f3983r;
                    if (i28 > 0) {
                        int min = Math.min(i26, i28);
                        a(this.f3975j, i27, min);
                        this.f3983r -= min;
                        i27 += min;
                        f7 = f12;
                        d = d10;
                    } else {
                        short[] sArr = this.f3975j;
                        if (i21 > 4000) {
                            i10 = i21 / 4000;
                        } else {
                            i10 = 1;
                        }
                        int i29 = this.f3973g;
                        int i30 = this.f3972f;
                        if (i23 == i22 && i10 == i22) {
                            i11 = d(sArr, i27, i30, i29);
                            f7 = f12;
                            d = d10;
                        } else {
                            b(sArr, i27, i10);
                            f7 = f12;
                            d = d10;
                            short[] sArr2 = this.f3974i;
                            int d11 = d(sArr2, i24, i30 / i10, i29 / i10);
                            if (i10 != 1) {
                                int i31 = d11 * i10;
                                int i32 = i10 * 4;
                                int i33 = i31 - i32;
                                int i34 = i31 + i32;
                                if (i33 >= i30) {
                                    i30 = i33;
                                }
                                if (i34 <= i29) {
                                    i29 = i34;
                                }
                                if (i23 == 1) {
                                    i11 = d(sArr, i27, i30, i29);
                                } else {
                                    b(sArr, i27, 1);
                                    i11 = d(sArr2, i24, i30, i29);
                                }
                            } else {
                                i11 = d11;
                            }
                        }
                        int i35 = this.f3986u;
                        int i36 = this.v;
                        if (i35 == 0 || (i12 = this.f3984s) == 0 || i36 > i35 * 3 || i35 * 2 <= this.f3985t * 3) {
                            i12 = i11;
                        }
                        this.f3985t = i35;
                        this.f3984s = i11;
                        if (d > 1.0d) {
                            short[] sArr3 = this.f3975j;
                            if (d >= 2.0d) {
                                i14 = i27;
                                double d12 = (i12 / (d - 1.0d)) + this.f3987w;
                                int round = (int) Math.round(d12);
                                this.f3987w = d12 - round;
                                i15 = round;
                            } else {
                                i14 = i27;
                                double d13 = (((2.0d - d) * i12) / (d - 1.0d)) + this.f3987w;
                                int round2 = (int) Math.round(d13);
                                this.f3983r = round2;
                                this.f3987w = d13 - round2;
                                i15 = i12;
                            }
                            short[] c10 = c(this.f3977l, this.f3978m, i15);
                            this.f3977l = c10;
                            int i37 = i14;
                            e(i15, this.f3969b, c10, this.f3978m, sArr3, i37, sArr3, i37 + i12);
                            this.f3978m += i15;
                            i27 = i12 + i15 + i37;
                        } else {
                            int i38 = i27;
                            short[] sArr4 = this.f3975j;
                            if (d < 0.5d) {
                                double d14 = ((i12 * d) / (1.0d - d)) + this.f3987w;
                                int round3 = (int) Math.round(d14);
                                this.f3987w = d14 - round3;
                                i13 = round3;
                            } else {
                                double d15 = ((((2.0d * d) - 1.0d) * i12) / (1.0d - d)) + this.f3987w;
                                int round4 = (int) Math.round(d15);
                                this.f3983r = round4;
                                this.f3987w = d15 - round4;
                                i13 = i12;
                            }
                            int i39 = i12 + i13;
                            short[] c11 = c(this.f3977l, this.f3978m, i39);
                            this.f3977l = c11;
                            System.arraycopy(sArr4, i38 * i23, c11, this.f3978m * i23, i12 * i23);
                            e(i13, this.f3969b, this.f3977l, this.f3978m + i12, sArr4, i38 + i12, sArr4, i38);
                            this.f3978m += i39;
                            i27 = i38 + i13;
                        }
                    }
                    if (i27 + i26 > i25) {
                        break;
                    }
                    f12 = f7;
                    d10 = d;
                    i22 = 1;
                    i24 = 0;
                }
                int i40 = this.f3976k - i27;
                short[] sArr5 = this.f3975j;
                System.arraycopy(sArr5, i27 * i23, sArr5, 0, i40 * i23);
                this.f3976k = i40;
                if (f7 == 1.0f && this.f3978m != i20) {
                    long j11 = i21 / f7;
                    long j12 = i21;
                    while (j11 != 0 && j12 != 0 && j11 % 2 == 0 && j12 % 2 == 0) {
                        j11 /= 2;
                        j12 /= 2;
                    }
                    int i41 = this.f3978m - i20;
                    short[] c12 = c(this.f3979n, this.f3980o, i41);
                    this.f3979n = c12;
                    System.arraycopy(this.f3977l, i20 * i23, c12, this.f3980o * i23, i41 * i23);
                    this.f3978m = i20;
                    this.f3980o += i41;
                    int i42 = 0;
                    while (true) {
                        i16 = this.f3980o;
                        i17 = i16 - 1;
                        if (i42 >= i17) {
                            break;
                        }
                        while (true) {
                            i18 = this.f3981p + 1;
                            j3 = i18;
                            j10 = this.f3982q;
                            if (j3 * j11 <= j10 * j12) {
                                break;
                            }
                            this.f3977l = c(this.f3977l, this.f3978m, 1);
                            int i43 = 0;
                            while (i43 < i23) {
                                short[] sArr6 = this.f3979n;
                                int i44 = (i42 * i23) + i43;
                                short s10 = sArr6[i44];
                                short s11 = sArr6[i44 + i23];
                                int i45 = i42;
                                long j13 = (i19 + 1) * j11;
                                long j14 = j13 - (this.f3982q * j12);
                                long j15 = j13 - (this.f3981p * j11);
                                this.f3977l[(this.f3978m * i23) + i43] = (short) ((((j15 - j14) * s11) + (s10 * j14)) / j15);
                                i43++;
                                i42 = i45;
                            }
                            this.f3982q++;
                            this.f3978m++;
                            i42 = i42;
                        }
                        int i46 = i42;
                        this.f3981p = i18;
                        if (j3 == j12) {
                            this.f3981p = 0;
                            if (j10 == j11) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            e2.d.g(z10);
                            this.f3982q = 0;
                        }
                        i42 = i46 + 1;
                    }
                    if (i17 != 0) {
                        short[] sArr7 = this.f3979n;
                        System.arraycopy(sArr7, i17 * i23, sArr7, 0, (i16 - i17) * i23);
                        this.f3980o -= i17;
                        return;
                    }
                    return;
                }
            }
        }
        f7 = f12;
        if (f7 == 1.0f) {
        }
    }
}

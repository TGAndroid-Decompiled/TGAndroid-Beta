package c2;

import java.util.Arrays;
public final class j {
    public final int f4162a;
    public final int f4163b;
    public final float f4164c;
    public final float d;
    public final float f4165e;
    public final int f4166f;
    public final int f4167g;
    public final int h;
    public final short[] f4168i;
    public short[] f4169j;
    public int f4170k;
    public short[] f4171l;
    public int f4172m;
    public short[] f4173n;
    public int f4174o;
    public int f4175p;
    public int f4176q;
    public int f4177r;
    public int f4178s;
    public int f4179t;
    public int f4180u;
    public int v;
    public double f4181w;

    public j(int i10, float f7, int i11, float f10, int i12) {
        this.f4162a = i10;
        this.f4163b = i11;
        this.f4164c = f7;
        this.d = f10;
        this.f4165e = i10 / i12;
        this.f4166f = i10 / 400;
        int i13 = i10 / 65;
        this.f4167g = i13;
        int i14 = i13 * 2;
        this.h = i14;
        this.f4168i = new short[i14];
        this.f4169j = new short[i14 * i11];
        this.f4171l = new short[i14 * i11];
        this.f4173n = new short[i14 * i11];
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
        short[] c10 = c(this.f4171l, this.f4172m, i11);
        this.f4171l = c10;
        int i12 = this.f4163b;
        System.arraycopy(sArr, i10 * i12, c10, this.f4172m * i12, i12 * i11);
        this.f4172m += i11;
    }

    public final void b(short[] sArr, int i10, int i11) {
        int i12 = this.h / i11;
        int i13 = this.f4163b;
        int i14 = i11 * i13;
        int i15 = i10 * i13;
        for (int i16 = 0; i16 < i12; i16++) {
            int i17 = 0;
            for (int i18 = 0; i18 < i14; i18++) {
                i17 += sArr[(i16 * i14) + i15 + i18];
            }
            this.f4168i[i16] = (short) (i17 / i14);
        }
    }

    public final short[] c(short[] sArr, int i10, int i11) {
        int length = sArr.length;
        int i12 = this.f4163b;
        int i13 = length / i12;
        if (i10 + i11 <= i13) {
            return sArr;
        }
        return Arrays.copyOf(sArr, (((i13 * 3) / 2) + i11) * i12);
    }

    public final int d(short[] sArr, int i10, int i11, int i12) {
        int i13 = i10 * this.f4163b;
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
        this.f4180u = i15 / i16;
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
        int i20 = this.f4172m;
        float f10 = this.f4164c;
        float f11 = this.d;
        double d10 = f10 / f11;
        float f12 = this.f4165e * f11;
        int i21 = this.f4162a;
        int i22 = 1;
        int i23 = this.f4163b;
        int i24 = 0;
        if (d10 <= 1.0000100135803223d && d10 >= 0.9999899864196777d) {
            a(this.f4169j, 0, this.f4170k);
            this.f4170k = 0;
        } else {
            int i25 = this.f4170k;
            int i26 = this.h;
            if (i25 >= i26) {
                int i27 = 0;
                while (true) {
                    int i28 = this.f4177r;
                    if (i28 > 0) {
                        int min = Math.min(i26, i28);
                        a(this.f4169j, i27, min);
                        this.f4177r -= min;
                        i27 += min;
                        f7 = f12;
                        d = d10;
                    } else {
                        short[] sArr = this.f4169j;
                        if (i21 > 4000) {
                            i10 = i21 / 4000;
                        } else {
                            i10 = 1;
                        }
                        int i29 = this.f4167g;
                        int i30 = this.f4166f;
                        if (i23 == i22 && i10 == i22) {
                            i11 = d(sArr, i27, i30, i29);
                            f7 = f12;
                            d = d10;
                        } else {
                            b(sArr, i27, i10);
                            f7 = f12;
                            d = d10;
                            short[] sArr2 = this.f4168i;
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
                        int i35 = this.f4180u;
                        int i36 = this.v;
                        if (i35 == 0 || (i12 = this.f4178s) == 0 || i36 > i35 * 3 || i35 * 2 <= this.f4179t * 3) {
                            i12 = i11;
                        }
                        this.f4179t = i35;
                        this.f4178s = i11;
                        if (d > 1.0d) {
                            short[] sArr3 = this.f4169j;
                            if (d >= 2.0d) {
                                i14 = i27;
                                double d12 = (i12 / (d - 1.0d)) + this.f4181w;
                                int round = (int) Math.round(d12);
                                this.f4181w = d12 - round;
                                i15 = round;
                            } else {
                                i14 = i27;
                                double d13 = (((2.0d - d) * i12) / (d - 1.0d)) + this.f4181w;
                                int round2 = (int) Math.round(d13);
                                this.f4177r = round2;
                                this.f4181w = d13 - round2;
                                i15 = i12;
                            }
                            short[] c10 = c(this.f4171l, this.f4172m, i15);
                            this.f4171l = c10;
                            int i37 = i14;
                            e(i15, this.f4163b, c10, this.f4172m, sArr3, i37, sArr3, i37 + i12);
                            this.f4172m += i15;
                            i27 = i12 + i15 + i37;
                        } else {
                            int i38 = i27;
                            short[] sArr4 = this.f4169j;
                            if (d < 0.5d) {
                                double d14 = ((i12 * d) / (1.0d - d)) + this.f4181w;
                                int round3 = (int) Math.round(d14);
                                this.f4181w = d14 - round3;
                                i13 = round3;
                            } else {
                                double d15 = ((((2.0d * d) - 1.0d) * i12) / (1.0d - d)) + this.f4181w;
                                int round4 = (int) Math.round(d15);
                                this.f4177r = round4;
                                this.f4181w = d15 - round4;
                                i13 = i12;
                            }
                            int i39 = i12 + i13;
                            short[] c11 = c(this.f4171l, this.f4172m, i39);
                            this.f4171l = c11;
                            System.arraycopy(sArr4, i38 * i23, c11, this.f4172m * i23, i12 * i23);
                            e(i13, this.f4163b, this.f4171l, this.f4172m + i12, sArr4, i38 + i12, sArr4, i38);
                            this.f4172m += i39;
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
                int i40 = this.f4170k - i27;
                short[] sArr5 = this.f4169j;
                System.arraycopy(sArr5, i27 * i23, sArr5, 0, i40 * i23);
                this.f4170k = i40;
                if (f7 == 1.0f && this.f4172m != i20) {
                    long j11 = i21 / f7;
                    long j12 = i21;
                    while (j11 != 0 && j12 != 0 && j11 % 2 == 0 && j12 % 2 == 0) {
                        j11 /= 2;
                        j12 /= 2;
                    }
                    int i41 = this.f4172m - i20;
                    short[] c12 = c(this.f4173n, this.f4174o, i41);
                    this.f4173n = c12;
                    System.arraycopy(this.f4171l, i20 * i23, c12, this.f4174o * i23, i41 * i23);
                    this.f4172m = i20;
                    this.f4174o += i41;
                    int i42 = 0;
                    while (true) {
                        i16 = this.f4174o;
                        i17 = i16 - 1;
                        if (i42 >= i17) {
                            break;
                        }
                        while (true) {
                            i18 = this.f4175p + 1;
                            j3 = i18;
                            j10 = this.f4176q;
                            if (j3 * j11 <= j10 * j12) {
                                break;
                            }
                            this.f4171l = c(this.f4171l, this.f4172m, 1);
                            int i43 = 0;
                            while (i43 < i23) {
                                short[] sArr6 = this.f4173n;
                                int i44 = (i42 * i23) + i43;
                                short s10 = sArr6[i44];
                                short s11 = sArr6[i44 + i23];
                                int i45 = i42;
                                long j13 = (i19 + 1) * j11;
                                long j14 = j13 - (this.f4176q * j12);
                                long j15 = j13 - (this.f4175p * j11);
                                this.f4171l[(this.f4172m * i23) + i43] = (short) ((((j15 - j14) * s11) + (s10 * j14)) / j15);
                                i43++;
                                i42 = i45;
                            }
                            this.f4176q++;
                            this.f4172m++;
                            i42 = i42;
                        }
                        int i46 = i42;
                        this.f4175p = i18;
                        if (j3 == j12) {
                            this.f4175p = 0;
                            if (j10 == j11) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            e2.d.g(z10);
                            this.f4176q = 0;
                        }
                        i42 = i46 + 1;
                    }
                    if (i17 != 0) {
                        short[] sArr7 = this.f4173n;
                        System.arraycopy(sArr7, i17 * i23, sArr7, 0, (i16 - i17) * i23);
                        this.f4174o -= i17;
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

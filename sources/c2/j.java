package c2;

import java.util.Arrays;
public final class j {
    public final int f4017a;
    public final int f4018b;
    public final float f4019c;
    public final float d;
    public final float f4020e;
    public final int f4021f;
    public final int f4022g;
    public final int h;
    public final short[] f4023i;
    public short[] f4024j;
    public int f4025k;
    public short[] f4026l;
    public int f4027m;
    public short[] f4028n;
    public int f4029o;
    public int f4030p;
    public int f4031q;
    public int f4032r;
    public int f4033s;
    public int f4034t;
    public int f4035u;
    public int v;
    public double f4036w;

    public j(int i10, float f7, int i11, float f10, int i12) {
        this.f4017a = i10;
        this.f4018b = i11;
        this.f4019c = f7;
        this.d = f10;
        this.f4020e = i10 / i12;
        this.f4021f = i10 / 400;
        int i13 = i10 / 65;
        this.f4022g = i13;
        int i14 = i13 * 2;
        this.h = i14;
        this.f4023i = new short[i14];
        this.f4024j = new short[i14 * i11];
        this.f4026l = new short[i14 * i11];
        this.f4028n = new short[i14 * i11];
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
        short[] c10 = c(this.f4026l, this.f4027m, i11);
        this.f4026l = c10;
        int i12 = this.f4018b;
        System.arraycopy(sArr, i10 * i12, c10, this.f4027m * i12, i12 * i11);
        this.f4027m += i11;
    }

    public final void b(short[] sArr, int i10, int i11) {
        int i12 = this.h / i11;
        int i13 = this.f4018b;
        int i14 = i11 * i13;
        int i15 = i10 * i13;
        for (int i16 = 0; i16 < i12; i16++) {
            int i17 = 0;
            for (int i18 = 0; i18 < i14; i18++) {
                i17 += sArr[(i16 * i14) + i15 + i18];
            }
            this.f4023i[i16] = (short) (i17 / i14);
        }
    }

    public final short[] c(short[] sArr, int i10, int i11) {
        int length = sArr.length;
        int i12 = this.f4018b;
        int i13 = length / i12;
        if (i10 + i11 <= i13) {
            return sArr;
        }
        return Arrays.copyOf(sArr, (((i13 * 3) / 2) + i11) * i12);
    }

    public final int d(short[] sArr, int i10, int i11, int i12) {
        int i13 = i10 * this.f4018b;
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
        this.f4035u = i15 / i16;
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
        int i20 = this.f4027m;
        float f10 = this.f4019c;
        float f11 = this.d;
        double d10 = f10 / f11;
        float f12 = this.f4020e * f11;
        int i21 = (d10 > 1.0000100135803223d ? 1 : (d10 == 1.0000100135803223d ? 0 : -1));
        int i22 = this.f4017a;
        int i23 = 1;
        int i24 = this.f4018b;
        int i25 = 0;
        if (i21 <= 0 && d10 >= 0.9999899864196777d) {
            a(this.f4024j, 0, this.f4025k);
            this.f4025k = 0;
        } else {
            int i26 = this.f4025k;
            int i27 = this.h;
            if (i26 >= i27) {
                int i28 = 0;
                while (true) {
                    int i29 = this.f4032r;
                    if (i29 > 0) {
                        int min = Math.min(i27, i29);
                        a(this.f4024j, i28, min);
                        this.f4032r -= min;
                        i28 += min;
                        f7 = f12;
                        d = d10;
                        i13 = i27;
                    } else {
                        short[] sArr = this.f4024j;
                        if (i22 > 4000) {
                            i10 = i22 / 4000;
                        } else {
                            i10 = i23;
                        }
                        int i30 = this.f4022g;
                        int i31 = this.f4021f;
                        if (i24 == i23 && i10 == i23) {
                            i11 = d(sArr, i28, i31, i30);
                            f7 = f12;
                            d = d10;
                        } else {
                            b(sArr, i28, i10);
                            f7 = f12;
                            d = d10;
                            short[] sArr2 = this.f4023i;
                            int d11 = d(sArr2, i25, i31 / i10, i30 / i10);
                            if (i10 != 1) {
                                int i32 = d11 * i10;
                                int i33 = i10 * 4;
                                int i34 = i32 - i33;
                                int i35 = i32 + i33;
                                if (i34 >= i31) {
                                    i31 = i34;
                                }
                                if (i35 <= i30) {
                                    i30 = i35;
                                }
                                if (i24 == 1) {
                                    i11 = d(sArr, i28, i31, i30);
                                } else {
                                    b(sArr, i28, 1);
                                    i11 = d(sArr2, i25, i31, i30);
                                }
                            } else {
                                i11 = d11;
                            }
                        }
                        int i36 = this.f4035u;
                        int i37 = this.v;
                        if (i36 == 0 || (i12 = this.f4033s) == 0 || i37 > i36 * 3 || i36 * 2 <= this.f4034t * 3) {
                            i12 = i11;
                        }
                        this.f4034t = i36;
                        this.f4033s = i11;
                        if (d > 1.0d) {
                            short[] sArr3 = this.f4024j;
                            if (d >= 2.0d) {
                                i13 = i27;
                                double d12 = (i12 / (d - 1.0d)) + this.f4036w;
                                i15 = (int) Math.round(d12);
                                this.f4036w = d12 - i15;
                            } else {
                                i13 = i27;
                                double d13 = (((2.0d - d) * i12) / (d - 1.0d)) + this.f4036w;
                                int round = (int) Math.round(d13);
                                this.f4032r = round;
                                this.f4036w = d13 - round;
                                i15 = i12;
                            }
                            short[] c10 = c(this.f4026l, this.f4027m, i15);
                            this.f4026l = c10;
                            int i38 = i28 + i12;
                            int i39 = i28;
                            int i40 = i15;
                            e(i40, this.f4018b, c10, this.f4027m, sArr3, i39, sArr3, i38);
                            this.f4027m += i40;
                            i28 = i12 + i40 + i39;
                        } else {
                            i13 = i27;
                            int i41 = i28;
                            short[] sArr4 = this.f4024j;
                            if (d < 0.5d) {
                                double d14 = ((i12 * d) / (1.0d - d)) + this.f4036w;
                                int round2 = (int) Math.round(d14);
                                this.f4036w = d14 - round2;
                                i14 = round2;
                            } else {
                                double d15 = ((((d * 2.0d) - 1.0d) * i12) / (1.0d - d)) + this.f4036w;
                                int round3 = (int) Math.round(d15);
                                this.f4032r = round3;
                                this.f4036w = d15 - round3;
                                i14 = i12;
                            }
                            int i42 = i12 + i14;
                            short[] c11 = c(this.f4026l, this.f4027m, i42);
                            this.f4026l = c11;
                            System.arraycopy(sArr4, i41 * i24, c11, this.f4027m * i24, i12 * i24);
                            e(i14, this.f4018b, this.f4026l, this.f4027m + i12, sArr4, i41 + i12, sArr4, i41);
                            this.f4027m += i42;
                            i28 = i41 + i14;
                        }
                    }
                    if (i28 + i13 > i26) {
                        break;
                    }
                    i25 = 0;
                    i27 = i13;
                    i23 = 1;
                    f12 = f7;
                    d10 = d;
                }
                int i43 = this.f4025k - i28;
                short[] sArr5 = this.f4024j;
                System.arraycopy(sArr5, i28 * i24, sArr5, 0, i43 * i24);
                this.f4025k = i43;
                if (f7 == 1.0f && this.f4027m != i20) {
                    long j11 = i22 / f7;
                    long j12 = i22;
                    while (j11 != 0 && j12 != 0 && j11 % 2 == 0 && j12 % 2 == 0) {
                        j11 /= 2;
                        j12 /= 2;
                    }
                    int i44 = this.f4027m - i20;
                    short[] c12 = c(this.f4028n, this.f4029o, i44);
                    this.f4028n = c12;
                    System.arraycopy(this.f4026l, i20 * i24, c12, this.f4029o * i24, i44 * i24);
                    this.f4027m = i20;
                    this.f4029o += i44;
                    int i45 = 0;
                    while (true) {
                        i16 = this.f4029o;
                        i17 = i16 - 1;
                        if (i45 >= i17) {
                            break;
                        }
                        while (true) {
                            i18 = this.f4030p + 1;
                            j3 = i18;
                            j10 = this.f4031q;
                            if (j3 * j11 <= j10 * j12) {
                                break;
                            }
                            this.f4026l = c(this.f4026l, this.f4027m, 1);
                            int i46 = 0;
                            while (i46 < i24) {
                                short[] sArr6 = this.f4028n;
                                int i47 = (i45 * i24) + i46;
                                short s10 = sArr6[i47];
                                short s11 = sArr6[i47 + i24];
                                long j13 = j11;
                                int i48 = i45;
                                long j14 = (i19 + 1) * j13;
                                long j15 = j14 - (this.f4031q * j12);
                                long j16 = j14 - (this.f4030p * j13);
                                this.f4026l[(this.f4027m * i24) + i46] = (short) ((((j16 - j15) * s11) + (s10 * j15)) / j16);
                                i46++;
                                i45 = i48;
                                j11 = j13;
                            }
                            this.f4031q++;
                            this.f4027m++;
                            i45 = i45;
                            j11 = j11;
                        }
                        long j17 = j11;
                        int i49 = i45;
                        this.f4030p = i18;
                        if (j3 == j12) {
                            this.f4030p = 0;
                            if (j10 == j17) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            e2.d.g(z10);
                            this.f4031q = 0;
                        }
                        i45 = i49 + 1;
                        j11 = j17;
                    }
                    if (i17 != 0) {
                        short[] sArr7 = this.f4028n;
                        System.arraycopy(sArr7, i17 * i24, sArr7, 0, (i16 - i17) * i24);
                        this.f4029o -= i17;
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

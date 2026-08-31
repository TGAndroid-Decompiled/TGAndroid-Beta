package l3;

import java.util.Arrays;
public final class r0 {
    public final int f11597a;
    public final int f11598b;
    public final float f11599c;
    public final float d;
    public final float f11600e;
    public final int f11601f;
    public final int f11602g;
    public final int h;
    public final short[] f11603i;
    public short[] f11604j;
    public int f11605k;
    public short[] f11606l;
    public int f11607m;
    public short[] f11608n;
    public int f11609o;
    public int f11610p;
    public int f11611q;
    public int f11612r;
    public int f11613s;
    public int f11614t;
    public int f11615u;
    public int v;

    public r0(int i10, float f10, int i11, float f11, int i12) {
        this.f11597a = i10;
        this.f11598b = i11;
        this.f11599c = f10;
        this.d = f11;
        this.f11600e = i10 / i12;
        this.f11601f = i10 / 400;
        int i13 = i10 / 65;
        this.f11602g = i13;
        int i14 = i13 * 2;
        this.h = i14;
        this.f11603i = new short[i14];
        this.f11604j = new short[i14 * i11];
        this.f11606l = new short[i14 * i11];
        this.f11608n = new short[i14 * i11];
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
        short[] c3 = c(this.f11606l, this.f11607m, i11);
        this.f11606l = c3;
        int i12 = this.f11598b;
        System.arraycopy(sArr, i10 * i12, c3, this.f11607m * i12, i12 * i11);
        this.f11607m += i11;
    }

    public final void b(short[] sArr, int i10, int i11) {
        int i12 = this.h / i11;
        int i13 = this.f11598b;
        int i14 = i11 * i13;
        int i15 = i10 * i13;
        for (int i16 = 0; i16 < i12; i16++) {
            int i17 = 0;
            for (int i18 = 0; i18 < i14; i18++) {
                i17 += sArr[(i16 * i14) + i15 + i18];
            }
            this.f11603i[i16] = (short) (i17 / i14);
        }
    }

    public final short[] c(short[] sArr, int i10, int i11) {
        int length = sArr.length;
        int i12 = this.f11598b;
        int i13 = length / i12;
        if (i10 + i11 <= i13) {
            return sArr;
        }
        return Arrays.copyOf(sArr, (((i13 * 3) / 2) + i11) * i12);
    }

    public final int d(short[] sArr, int i10, int i11, int i12) {
        int i13 = i10 * this.f11598b;
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
        this.f11615u = i15 / i16;
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
        int i19 = this.f11607m;
        float f13 = this.f11599c;
        float f14 = this.d;
        float f15 = f13 / f14;
        float f16 = this.f11600e * f14;
        double d10 = f15;
        int i20 = this.f11597a;
        int i21 = 1;
        int i22 = this.f11598b;
        if (d10 <= 1.00001d && d10 >= 0.99999d) {
            a(this.f11604j, 0, this.f11605k);
            this.f11605k = 0;
        } else {
            int i23 = this.f11605k;
            int i24 = this.h;
            if (i23 >= i24) {
                int i25 = 0;
                while (true) {
                    int i26 = this.f11612r;
                    if (i26 > 0) {
                        int min = Math.min(i24, i26);
                        a(this.f11604j, i25, min);
                        this.f11612r -= min;
                        i25 += min;
                        f11 = f15;
                        f12 = f16;
                        d = d10;
                        f10 = 1.0f;
                    } else {
                        short[] sArr = this.f11604j;
                        if (i20 > 4000) {
                            i10 = i20 / 4000;
                        } else {
                            i10 = 1;
                        }
                        f10 = 1.0f;
                        int i27 = this.f11602g;
                        int i28 = this.f11601f;
                        if (i22 == i21 && i10 == i21) {
                            i11 = d(sArr, i25, i28, i27);
                            f11 = f15;
                            f12 = f16;
                            d = d10;
                        } else {
                            b(sArr, i25, i10);
                            f11 = f15;
                            f12 = f16;
                            short[] sArr2 = this.f11603i;
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
                        int i33 = this.f11615u;
                        int i34 = this.v;
                        if (i33 == 0 || (i12 = this.f11613s) == 0 || i34 > i33 * 3 || i33 * 2 <= this.f11614t * 3) {
                            i12 = i11;
                        }
                        this.f11614t = i33;
                        this.f11613s = i11;
                        if (d > 1.0d) {
                            short[] sArr3 = this.f11604j;
                            if (f11 >= 2.0f) {
                                i14 = (int) (i12 / (f11 - 1.0f));
                            } else {
                                this.f11612r = (int) (((2.0f - f11) * i12) / (f11 - 1.0f));
                                i14 = i12;
                            }
                            short[] c3 = c(this.f11606l, this.f11607m, i14);
                            this.f11606l = c3;
                            int i35 = i25 + i12;
                            int i36 = i25;
                            int i37 = i14;
                            e(i37, this.f11598b, c3, this.f11607m, sArr3, i36, sArr3, i35);
                            this.f11607m += i37;
                            i25 = i12 + i37 + i36;
                        } else {
                            int i38 = i25;
                            short[] sArr4 = this.f11604j;
                            if (f11 < 0.5f) {
                                i13 = (int) ((i12 * f11) / (1.0f - f11));
                            } else {
                                this.f11612r = (int) ((((2.0f * f11) - 1.0f) * i12) / (1.0f - f11));
                                i13 = i12;
                            }
                            int i39 = i12 + i13;
                            short[] c10 = c(this.f11606l, this.f11607m, i39);
                            this.f11606l = c10;
                            System.arraycopy(sArr4, i38 * i22, c10, this.f11607m * i22, i12 * i22);
                            e(i13, this.f11598b, this.f11606l, this.f11607m + i12, sArr4, i38 + i12, sArr4, i38);
                            this.f11607m += i39;
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
                int i40 = this.f11605k - i25;
                short[] sArr5 = this.f11604j;
                System.arraycopy(sArr5, i25 * i22, sArr5, 0, i40 * i22);
                this.f11605k = i40;
                if (f12 == f10 && this.f11607m != i19) {
                    int i41 = (int) (i20 / f12);
                    while (true) {
                        if (i41 <= 16384 && i20 <= 16384) {
                            break;
                        }
                        i41 /= 2;
                        i20 /= 2;
                    }
                    int i42 = this.f11607m - i19;
                    short[] c11 = c(this.f11608n, this.f11609o, i42);
                    this.f11608n = c11;
                    System.arraycopy(this.f11606l, i19 * i22, c11, this.f11609o * i22, i42 * i22);
                    this.f11607m = i19;
                    this.f11609o += i42;
                    int i43 = 0;
                    while (true) {
                        i15 = this.f11609o;
                        i16 = i15 - 1;
                        if (i43 >= i16) {
                            break;
                        }
                        while (true) {
                            i17 = this.f11610p + 1;
                            int i44 = i17 * i41;
                            i18 = this.f11611q;
                            if (i44 <= i18 * i20) {
                                break;
                            }
                            this.f11606l = c(this.f11606l, this.f11607m, 1);
                            for (int i45 = 0; i45 < i22; i45++) {
                                short[] sArr6 = this.f11608n;
                                int i46 = (i43 * i22) + i45;
                                short s6 = sArr6[i46];
                                short s9 = sArr6[i46 + i22];
                                int i47 = this.f11610p;
                                int i48 = i47 * i41;
                                int i49 = (i47 + 1) * i41;
                                int i50 = i49 - (this.f11611q * i20);
                                int i51 = i49 - i48;
                                this.f11606l[(this.f11607m * i22) + i45] = (short) ((((i51 - i50) * s9) + (s6 * i50)) / i51);
                            }
                            this.f11611q++;
                            this.f11607m++;
                        }
                        this.f11610p = i17;
                        if (i17 == i20) {
                            this.f11610p = 0;
                            if (i18 == i41) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            h5.a.i(z4);
                            this.f11611q = 0;
                        }
                        i43++;
                    }
                    if (i16 != 0) {
                        short[] sArr7 = this.f11608n;
                        System.arraycopy(sArr7, i16 * i22, sArr7, 0, (i15 - i16) * i22);
                        this.f11609o -= i16;
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

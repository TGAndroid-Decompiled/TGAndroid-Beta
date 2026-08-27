package j3;

import java.util.Arrays;

public final class r0 {

    public final int f12415a;

    public final int f12416b;

    public final float f12417c;
    public final float d;

    public final float f12418e;

    public final int f12419f;

    public final int f12420g;
    public final int h;

    public final short[] f12421i;

    public short[] f12422j;

    public int f12423k;

    public short[] f12424l;

    public int f12425m;

    public short[] f12426n;

    public int f12427o;

    public int f12428p;

    public int f12429q;

    public int f12430r;

    public int f12431s;

    public int f12432t;

    public int f12433u;
    public int v;

    public r0(int i10, float f10, int i11, float f11, int i12) {
        this.f12415a = i10;
        this.f12416b = i11;
        this.f12417c = f10;
        this.d = f11;
        this.f12418e = i10 / i12;
        this.f12419f = i10 / 400;
        int i13 = i10 / 65;
        this.f12420g = i13;
        int i14 = i13 * 2;
        this.h = i14;
        this.f12421i = new short[i14];
        this.f12422j = new short[i14 * i11];
        this.f12424l = new short[i14 * i11];
        this.f12426n = new short[i14 * i11];
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
        short[] sArrC = c(this.f12424l, this.f12425m, i11);
        this.f12424l = sArrC;
        int i12 = this.f12416b;
        System.arraycopy(sArr, i10 * i12, sArrC, this.f12425m * i12, i12 * i11);
        this.f12425m += i11;
    }

    public final void b(short[] sArr, int i10, int i11) {
        int i12 = this.h / i11;
        int i13 = this.f12416b;
        int i14 = i11 * i13;
        int i15 = i10 * i13;
        for (int i16 = 0; i16 < i12; i16++) {
            int i17 = 0;
            for (int i18 = 0; i18 < i14; i18++) {
                i17 += sArr[(i16 * i14) + i15 + i18];
            }
            this.f12421i[i16] = (short) (i17 / i14);
        }
    }

    public final short[] c(short[] sArr, int i10, int i11) {
        int length = sArr.length;
        int i12 = this.f12416b;
        int i13 = length / i12;
        return i10 + i11 <= i13 ? sArr : Arrays.copyOf(sArr, (((i13 * 3) / 2) + i11) * i12);
    }

    public final int d(short[] sArr, int i10, int i11, int i12) {
        int i13 = i10 * this.f12416b;
        int i14 = 255;
        int i15 = 1;
        int i16 = 0;
        int i17 = 0;
        while (i11 <= i12) {
            int iAbs = 0;
            for (int i18 = 0; i18 < i11; i18++) {
                iAbs += Math.abs(sArr[i13 + i18] - sArr[(i13 + i11) + i18]);
            }
            if (iAbs * i16 < i15 * i11) {
                i16 = i11;
                i15 = iAbs;
            }
            if (iAbs * i14 > i17 * i11) {
                i14 = i11;
                i17 = iAbs;
            }
            i11++;
        }
        this.f12433u = i15 / i16;
        this.v = i17 / i14;
        return i16;
    }

    public final void f() {
        float f10;
        float f11;
        float f12;
        double d;
        int iD;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17 = this.f12425m;
        float f13 = this.f12417c;
        float f14 = this.d;
        float f15 = f13 / f14;
        float f16 = this.f12418e * f14;
        double d10 = f15;
        int i18 = this.f12415a;
        int i19 = 1;
        int i20 = this.f12416b;
        if (d10 > 1.00001d || d10 < 0.99999d) {
            int i21 = this.f12423k;
            int i22 = this.h;
            if (i21 >= i22) {
                int i23 = 0;
                while (true) {
                    int i24 = this.f12430r;
                    if (i24 > 0) {
                        int iMin = Math.min(i22, i24);
                        a(this.f12422j, i23, iMin);
                        this.f12430r -= iMin;
                        i23 += iMin;
                        f11 = f15;
                        f12 = f16;
                        d = d10;
                        f10 = 1.0f;
                    } else {
                        short[] sArr = this.f12422j;
                        int i25 = i18 > 4000 ? i18 / 4000 : 1;
                        f10 = 1.0f;
                        int i26 = this.f12420g;
                        int i27 = this.f12419f;
                        if (i20 == i19 && i25 == i19) {
                            iD = d(sArr, i23, i27, i26);
                            f11 = f15;
                            f12 = f16;
                            d = d10;
                        } else {
                            b(sArr, i23, i25);
                            f11 = f15;
                            f12 = f16;
                            short[] sArr2 = this.f12421i;
                            d = d10;
                            int iD2 = d(sArr2, 0, i27 / i25, i26 / i25);
                            if (i25 != 1) {
                                int i28 = iD2 * i25;
                                int i29 = i25 * 4;
                                int i30 = i28 - i29;
                                int i31 = i28 + i29;
                                if (i30 >= i27) {
                                    i27 = i30;
                                }
                                if (i31 <= i26) {
                                    i26 = i31;
                                }
                                if (i20 == 1) {
                                    iD = d(sArr, i23, i27, i26);
                                } else {
                                    b(sArr, i23, 1);
                                    iD = d(sArr2, 0, i27, i26);
                                }
                            } else {
                                iD = iD2;
                            }
                        }
                        int i32 = this.f12433u;
                        int i33 = this.v;
                        if (i32 == 0 || (i10 = this.f12431s) == 0 || i33 > i32 * 3 || i32 * 2 <= this.f12432t * 3) {
                            i10 = iD;
                        }
                        this.f12432t = i32;
                        this.f12431s = iD;
                        if (d > 1.0d) {
                            short[] sArr3 = this.f12422j;
                            if (f11 >= 2.0f) {
                                i12 = (int) (i10 / (f11 - 1.0f));
                            } else {
                                this.f12430r = (int) (((2.0f - f11) * i10) / (f11 - 1.0f));
                                i12 = i10;
                            }
                            short[] sArrC = c(this.f12424l, this.f12425m, i12);
                            this.f12424l = sArrC;
                            int i34 = i23 + i10;
                            int i35 = i23;
                            int i36 = i12;
                            e(i36, this.f12416b, sArrC, this.f12425m, sArr3, i35, sArr3, i34);
                            this.f12425m += i36;
                            i23 = i10 + i36 + i35;
                        } else {
                            int i37 = i23;
                            short[] sArr4 = this.f12422j;
                            if (f11 < 0.5f) {
                                i11 = (int) ((i10 * f11) / (1.0f - f11));
                            } else {
                                this.f12430r = (int) ((((2.0f * f11) - 1.0f) * i10) / (1.0f - f11));
                                i11 = i10;
                            }
                            int i38 = i10 + i11;
                            short[] sArrC2 = c(this.f12424l, this.f12425m, i38);
                            this.f12424l = sArrC2;
                            System.arraycopy(sArr4, i37 * i20, sArrC2, this.f12425m * i20, i10 * i20);
                            e(i11, this.f12416b, this.f12424l, this.f12425m + i10, sArr4, i37 + i10, sArr4, i37);
                            this.f12425m += i38;
                            i23 = i37 + i11;
                        }
                    }
                    if (i23 + i22 > i21) {
                        break;
                    }
                    f15 = f11;
                    f16 = f12;
                    d10 = d;
                    i19 = 1;
                }
                int i39 = this.f12423k - i23;
                short[] sArr5 = this.f12422j;
                System.arraycopy(sArr5, i23 * i20, sArr5, 0, i39 * i20);
                this.f12423k = i39;
            }
            if (f12 != f10 || this.f12425m == i17) {
            }
            int i40 = (int) (i18 / f12);
            while (true) {
                if (i40 <= 16384 && i18 <= 16384) {
                    break;
                }
                i40 /= 2;
                i18 /= 2;
            }
            int i41 = this.f12425m - i17;
            short[] sArrC3 = c(this.f12426n, this.f12427o, i41);
            this.f12426n = sArrC3;
            System.arraycopy(this.f12424l, i17 * i20, sArrC3, this.f12427o * i20, i41 * i20);
            this.f12425m = i17;
            this.f12427o += i41;
            int i42 = 0;
            while (true) {
                i13 = this.f12427o;
                i14 = i13 - 1;
                if (i42 >= i14) {
                    break;
                }
                while (true) {
                    i15 = this.f12428p + 1;
                    int i43 = i15 * i40;
                    i16 = this.f12429q;
                    if (i43 <= i16 * i18) {
                        break;
                    }
                    this.f12424l = c(this.f12424l, this.f12425m, 1);
                    for (int i44 = 0; i44 < i20; i44++) {
                        short[] sArr6 = this.f12424l;
                        int i45 = (this.f12425m * i20) + i44;
                        short[] sArr7 = this.f12426n;
                        int i46 = (i42 * i20) + i44;
                        short s10 = sArr7[i46];
                        short s11 = sArr7[i46 + i20];
                        int i47 = this.f12429q * i18;
                        int i48 = this.f12428p;
                        int i49 = i48 * i40;
                        int i50 = (i48 + 1) * i40;
                        int i51 = i50 - i47;
                        int i52 = i50 - i49;
                        sArr6[i45] = (short) ((((i52 - i51) * s11) + (s10 * i51)) / i52);
                    }
                    this.f12429q++;
                    this.f12425m++;
                }
                this.f12428p = i15;
                if (i15 == i18) {
                    this.f12428p = 0;
                    d5.a.i(i16 == i40);
                    this.f12429q = 0;
                }
                i42++;
            }
            if (i14 == 0) {
                return;
            }
            short[] sArr8 = this.f12426n;
            System.arraycopy(sArr8, i14 * i20, sArr8, 0, (i13 - i14) * i20);
            this.f12427o -= i14;
            return;
        }
        a(this.f12422j, 0, this.f12423k);
        this.f12423k = 0;
        f12 = f16;
        f10 = 1.0f;
        if (f12 != f10) {
        }
    }
}

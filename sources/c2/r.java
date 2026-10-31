package c2;

import v7.t6;
public final class r {
    public final int f3567a;
    public final int f3568b;
    public final float f3569c;
    public final float d;
    public final float e;
    public final int f3570f;
    public final int f3571g;
    public final int h;
    public final p f3572i;
    public int f3573j;
    public int f3574k;
    public int f3575l;
    public int f3576m;
    public int f3577n;
    public int f3578o;
    public int f3579p;
    public double f3580q;

    public r(int i10, int i11, float f7, float f10, int i12, boolean z10) {
        p qVar;
        this.f3567a = i10;
        this.f3568b = i11;
        this.f3569c = f7;
        this.d = f10;
        this.e = i10 / i12;
        this.f3570f = i10 / 400;
        int i13 = i10 / 65;
        this.f3571g = i13;
        this.h = i13 * 2;
        if (z10) {
            qVar = new o(this);
        } else {
            qVar = new q(this);
        }
        this.f3572i = qVar;
    }

    public final void a(int i10, int i11) {
        p pVar = this.f3572i;
        pVar.i(i11);
        Object g10 = pVar.g();
        int i12 = this.f3568b;
        System.arraycopy(g10, i10 * i12, pVar.h(), this.f3574k * i12, i12 * i11);
        this.f3574k += i11;
    }

    public final void b() {
        int i10;
        float f7;
        int i11;
        int i12;
        double d;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        long j10;
        long j11;
        boolean z10;
        int i20 = this.f3574k;
        float f10 = this.f3569c;
        float f11 = this.d;
        double d10 = f10 / f11;
        float f12 = this.e * f11;
        int i21 = (d10 > 1.0000100135803223d ? 1 : (d10 == 1.0000100135803223d ? 0 : -1));
        int i22 = this.f3567a;
        int i23 = 1;
        p pVar = this.f3572i;
        int i24 = this.f3568b;
        if (i21 <= 0 && d10 >= 0.9999899864196777d) {
            a(0, this.f3573j);
            this.f3573j = 0;
        } else {
            int i25 = this.f3573j;
            int i26 = this.h;
            if (i25 >= i26) {
                int i27 = 0;
                while (true) {
                    int i28 = this.f3578o;
                    if (i28 > 0) {
                        int min = Math.min(i26, i28);
                        a(i27, min);
                        this.f3578o -= min;
                        i27 += min;
                        f7 = f12;
                        d = d10;
                        i15 = i23;
                        i13 = i26;
                    } else {
                        if (i22 > 4000) {
                            i10 = i22 / 4000;
                        } else {
                            i10 = i23;
                        }
                        int i29 = this.f3571g;
                        int i30 = this.f3570f;
                        if (i24 == i23 && i10 == i23) {
                            i11 = pVar.e(i27, i30, i29);
                            f7 = f12;
                        } else {
                            pVar.d(i27, i10);
                            f7 = f12;
                            int q6 = pVar.q(i30 / i10, i29 / i10);
                            if (i10 != i23) {
                                int i31 = q6 * i10;
                                int i32 = i10 * 4;
                                int i33 = i31 - i32;
                                int i34 = i31 + i32;
                                if (i33 >= i30) {
                                    i30 = i33;
                                }
                                if (i34 <= i29) {
                                    i29 = i34;
                                }
                                if (i24 == i23) {
                                    i11 = pVar.e(i27, i30, i29);
                                } else {
                                    pVar.d(i27, i23);
                                    i11 = pVar.q(i30, i29);
                                }
                            } else {
                                i11 = q6;
                            }
                        }
                        if (pVar.j()) {
                            i12 = this.f3579p;
                        } else {
                            i12 = i11;
                        }
                        pVar.f();
                        this.f3579p = i11;
                        if (d10 > 1.0d) {
                            if (d10 >= 2.0d) {
                                i16 = i23;
                                double d11 = (i12 / (d10 - 1.0d)) + this.f3580q;
                                i17 = (int) Math.round(d11);
                                d = d10;
                                this.f3580q = d11 - i17;
                                pVar = pVar;
                            } else {
                                d = d10;
                                i16 = i23;
                                double d12 = (((2.0d - d) * i12) / (d - 1.0d)) + this.f3580q;
                                int round = (int) Math.round(d12);
                                this.f3578o = round;
                                this.f3580q = d12 - round;
                                i17 = i12;
                            }
                            pVar.i(i17);
                            int i35 = i26;
                            int i36 = i17;
                            pVar.m(i36, this.f3568b, this.f3574k, i27, i27 + i12);
                            this.f3574k += i36;
                            i27 = i12 + i36 + i27;
                            i13 = i35;
                            i15 = i16;
                        } else {
                            d = d10;
                            int i37 = i23;
                            int i38 = i26;
                            if (d < 0.5d) {
                                i13 = i38;
                                double d13 = ((i12 * d) / (1.0d - d)) + this.f3580q;
                                int round2 = (int) Math.round(d13);
                                this.f3580q = d13 - round2;
                                i14 = round2;
                            } else {
                                i13 = i38;
                                double d14 = ((((d * 2.0d) - 1.0d) * i12) / (1.0d - d)) + this.f3580q;
                                int round3 = (int) Math.round(d14);
                                this.f3578o = round3;
                                this.f3580q = d14 - round3;
                                i14 = i12;
                            }
                            int i39 = i12 + i14;
                            pVar.i(i39);
                            i15 = i37;
                            System.arraycopy(pVar.g(), i27 * i24, pVar.h(), this.f3574k * i24, i12 * i24);
                            int i40 = i27;
                            pVar.m(i14, this.f3568b, this.f3574k + i12, i12 + i27, i40);
                            this.f3574k += i39;
                            i27 = i40 + i14;
                        }
                    }
                    if (i27 + i13 > i25) {
                        break;
                    }
                    i26 = i13;
                    f12 = f7;
                    i23 = i15;
                    d10 = d;
                }
                int i41 = this.f3573j - i27;
                System.arraycopy(pVar.g(), i27 * i24, pVar.g(), 0, i41 * i24);
                this.f3573j = i41;
                if (f7 == 1.0f && this.f3574k != i20) {
                    long j12 = i22 / f7;
                    long j13 = i22;
                    while (j12 != 0 && j13 != 0 && j12 % 2 == 0 && j13 % 2 == 0) {
                        j12 /= 2;
                        j13 /= 2;
                    }
                    int i42 = this.f3574k - i20;
                    pVar.n(i42);
                    System.arraycopy(pVar.h(), i20 * i24, pVar.l(), this.f3575l * i24, i42 * i24);
                    this.f3574k = i20;
                    this.f3575l += i42;
                    int i43 = 0;
                    while (true) {
                        i18 = this.f3575l - 1;
                        if (i43 >= i18) {
                            break;
                        }
                        while (true) {
                            i19 = this.f3576m + 1;
                            j10 = i19;
                            j11 = this.f3577n;
                            if (j10 * j12 <= j11 * j13) {
                                break;
                            }
                            int i44 = i15;
                            pVar.i(i44);
                            pVar.k(j13, i43, j12);
                            this.f3577n += i44;
                            this.f3574k += i44;
                        }
                        int i45 = i15;
                        this.f3576m = i19;
                        if (j10 == j13) {
                            this.f3576m = 0;
                            if (j11 == j12) {
                                z10 = i45;
                            } else {
                                z10 = 0;
                            }
                            t6.p(z10);
                            this.f3577n = 0;
                        }
                        i43++;
                        i15 = i45;
                    }
                    if (i18 != 0) {
                        System.arraycopy(pVar.l(), i18 * i24, pVar.l(), 0, (this.f3575l - i18) * i24);
                        this.f3575l -= i18;
                        return;
                    }
                    return;
                }
            }
        }
        f7 = f12;
        i15 = 1;
        if (f7 == 1.0f) {
        }
    }
}

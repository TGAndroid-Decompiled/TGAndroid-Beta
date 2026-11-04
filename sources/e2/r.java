package e2;

import b8.zb;
public final class r {
    public final int f9376a;
    public final int f9377b;
    public final float f9378c;
    public final float d;
    public final float f9379e;
    public final int f9380f;
    public final int f9381g;
    public final int h;
    public final p f9382i;
    public int f9383j;
    public int f9384k;
    public int f9385l;
    public int f9386m;
    public int f9387n;
    public int f9388o;
    public int f9389p;
    public double f9390q;

    public r(int i3, int i10, float f10, float f11, int i11, boolean z10) {
        p qVar;
        this.f9376a = i3;
        this.f9377b = i10;
        this.f9378c = f10;
        this.d = f11;
        this.f9379e = i3 / i11;
        this.f9380f = i3 / 400;
        int i12 = i3 / 65;
        this.f9381g = i12;
        this.h = i12 * 2;
        if (z10) {
            qVar = new o(this);
        } else {
            qVar = new q(this);
        }
        this.f9382i = qVar;
    }

    public final void a(int i3, int i10) {
        p pVar = this.f9382i;
        pVar.i(i10);
        Object g7 = pVar.g();
        int i11 = this.f9377b;
        System.arraycopy(g7, i3 * i11, pVar.h(), this.f9384k * i11, i11 * i10);
        this.f9384k += i10;
    }

    public final void b() {
        int i3;
        float f10;
        int i10;
        int i11;
        double d;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        long j10;
        long j11;
        boolean z10;
        int i19 = this.f9384k;
        float f11 = this.f9378c;
        float f12 = this.d;
        double d10 = f11 / f12;
        float f13 = this.f9379e * f12;
        int i20 = (d10 > 1.0000100135803223d ? 1 : (d10 == 1.0000100135803223d ? 0 : -1));
        int i21 = this.f9376a;
        int i22 = 1;
        p pVar = this.f9382i;
        int i23 = this.f9377b;
        if (i20 <= 0 && d10 >= 0.9999899864196777d) {
            a(0, this.f9383j);
            this.f9383j = 0;
        } else {
            int i24 = this.f9383j;
            int i25 = this.h;
            if (i24 >= i25) {
                int i26 = 0;
                while (true) {
                    int i27 = this.f9388o;
                    if (i27 > 0) {
                        int min = Math.min(i25, i27);
                        a(i26, min);
                        this.f9388o -= min;
                        i26 += min;
                        f10 = f13;
                        d = d10;
                        i14 = i22;
                        i12 = i25;
                    } else {
                        if (i21 > 4000) {
                            i3 = i21 / 4000;
                        } else {
                            i3 = i22;
                        }
                        int i28 = this.f9381g;
                        int i29 = this.f9380f;
                        if (i23 == i22 && i3 == i22) {
                            i10 = pVar.e(i26, i29, i28);
                            f10 = f13;
                        } else {
                            pVar.d(i26, i3);
                            f10 = f13;
                            int q10 = pVar.q(i29 / i3, i28 / i3);
                            if (i3 != i22) {
                                int i30 = q10 * i3;
                                int i31 = i3 * 4;
                                int i32 = i30 - i31;
                                int i33 = i30 + i31;
                                if (i32 >= i29) {
                                    i29 = i32;
                                }
                                if (i33 <= i28) {
                                    i28 = i33;
                                }
                                if (i23 == i22) {
                                    i10 = pVar.e(i26, i29, i28);
                                } else {
                                    pVar.d(i26, i22);
                                    i10 = pVar.q(i29, i28);
                                }
                            } else {
                                i10 = q10;
                            }
                        }
                        if (pVar.j()) {
                            i11 = this.f9389p;
                        } else {
                            i11 = i10;
                        }
                        pVar.f();
                        this.f9389p = i10;
                        if (d10 > 1.0d) {
                            if (d10 >= 2.0d) {
                                i15 = i22;
                                double d11 = (i11 / (d10 - 1.0d)) + this.f9390q;
                                i16 = (int) Math.round(d11);
                                d = d10;
                                this.f9390q = d11 - i16;
                                pVar = pVar;
                            } else {
                                d = d10;
                                i15 = i22;
                                double d12 = (((2.0d - d) * i11) / (d - 1.0d)) + this.f9390q;
                                int round = (int) Math.round(d12);
                                this.f9388o = round;
                                this.f9390q = d12 - round;
                                i16 = i11;
                            }
                            pVar.i(i16);
                            int i34 = i25;
                            int i35 = i16;
                            pVar.m(i35, this.f9377b, this.f9384k, i26, i26 + i11);
                            this.f9384k += i35;
                            i26 = i11 + i35 + i26;
                            i12 = i34;
                            i14 = i15;
                        } else {
                            d = d10;
                            int i36 = i22;
                            int i37 = i25;
                            if (d < 0.5d) {
                                i12 = i37;
                                double d13 = ((i11 * d) / (1.0d - d)) + this.f9390q;
                                int round2 = (int) Math.round(d13);
                                this.f9390q = d13 - round2;
                                i13 = round2;
                            } else {
                                i12 = i37;
                                double d14 = ((((d * 2.0d) - 1.0d) * i11) / (1.0d - d)) + this.f9390q;
                                int round3 = (int) Math.round(d14);
                                this.f9388o = round3;
                                this.f9390q = d14 - round3;
                                i13 = i11;
                            }
                            int i38 = i11 + i13;
                            pVar.i(i38);
                            i14 = i36;
                            System.arraycopy(pVar.g(), i26 * i23, pVar.h(), this.f9384k * i23, i11 * i23);
                            int i39 = i26;
                            pVar.m(i13, this.f9377b, this.f9384k + i11, i11 + i26, i39);
                            this.f9384k += i38;
                            i26 = i39 + i13;
                        }
                    }
                    if (i26 + i12 > i24) {
                        break;
                    }
                    i25 = i12;
                    f13 = f10;
                    i22 = i14;
                    d10 = d;
                }
                int i40 = this.f9383j - i26;
                System.arraycopy(pVar.g(), i26 * i23, pVar.g(), 0, i40 * i23);
                this.f9383j = i40;
                if (f10 == 1.0f && this.f9384k != i19) {
                    long j12 = i21 / f10;
                    long j13 = i21;
                    while (j12 != 0 && j13 != 0 && j12 % 2 == 0 && j13 % 2 == 0) {
                        j12 /= 2;
                        j13 /= 2;
                    }
                    int i41 = this.f9384k - i19;
                    pVar.n(i41);
                    System.arraycopy(pVar.h(), i19 * i23, pVar.l(), this.f9385l * i23, i41 * i23);
                    this.f9384k = i19;
                    this.f9385l += i41;
                    int i42 = 0;
                    while (true) {
                        i17 = this.f9385l - 1;
                        if (i42 >= i17) {
                            break;
                        }
                        while (true) {
                            i18 = this.f9386m + 1;
                            j10 = i18;
                            j11 = this.f9387n;
                            if (j10 * j12 <= j11 * j13) {
                                break;
                            }
                            int i43 = i14;
                            pVar.i(i43);
                            pVar.k(j13, i42, j12);
                            this.f9387n += i43;
                            this.f9384k += i43;
                        }
                        int i44 = i14;
                        this.f9386m = i18;
                        if (j10 == j13) {
                            this.f9386m = 0;
                            if (j11 == j12) {
                                z10 = i44;
                            } else {
                                z10 = 0;
                            }
                            zb.p(z10);
                            this.f9387n = 0;
                        }
                        i42++;
                        i14 = i44;
                    }
                    if (i17 != 0) {
                        System.arraycopy(pVar.l(), i17 * i23, pVar.l(), 0, (this.f9385l - i17) * i23);
                        this.f9385l -= i17;
                        return;
                    }
                    return;
                }
            }
        }
        f10 = f13;
        i14 = 1;
        if (f10 == 1.0f) {
        }
    }
}

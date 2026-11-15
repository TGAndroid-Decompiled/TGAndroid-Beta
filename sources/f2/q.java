package f2;

import a8.ja;
public final class q {
    public final int f10747a;
    public final int f10748b;
    public final float f10749c;
    public final float d;
    public final float f10750e;
    public final int f10751f;
    public final int f10752g;
    public final int h;
    public final p f10753i;
    public int f10754j;
    public int f10755k;
    public int f10756l;
    public int f10757m;
    public int f10758n;
    public int f10759o;
    public int f10760p;
    public double f10761q;

    public q(int i7, int i10, float f10, float f11, int i11, boolean z10) {
        p eVar;
        this.f10747a = i7;
        this.f10748b = i10;
        this.f10749c = f10;
        this.d = f11;
        this.f10750e = i7 / i11;
        this.f10751f = i7 / 400;
        int i12 = i7 / 65;
        this.f10752g = i12;
        this.h = i12 * 2;
        if (z10) {
            eVar = new o(this);
        } else {
            eVar = new cc.e(this);
        }
        this.f10753i = eVar;
    }

    public final void a(int i7, int i10) {
        p pVar = this.f10753i;
        pVar.i(i10);
        Object g10 = pVar.g();
        int i11 = this.f10748b;
        System.arraycopy(g10, i7 * i11, pVar.h(), this.f10755k * i11, i11 * i10);
        this.f10755k += i10;
    }

    public final void b() {
        int i7;
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
        long j3;
        long j10;
        boolean z10;
        int i19 = this.f10755k;
        float f11 = this.f10749c;
        float f12 = this.d;
        double d2 = f11 / f12;
        float f13 = this.f10750e * f12;
        int i20 = (d2 > 1.0000100135803223d ? 1 : (d2 == 1.0000100135803223d ? 0 : -1));
        int i21 = this.f10747a;
        int i22 = 1;
        p pVar = this.f10753i;
        int i23 = this.f10748b;
        if (i20 <= 0 && d2 >= 0.9999899864196777d) {
            a(0, this.f10754j);
            this.f10754j = 0;
        } else {
            int i24 = this.f10754j;
            int i25 = this.h;
            if (i24 >= i25) {
                int i26 = 0;
                while (true) {
                    int i27 = this.f10759o;
                    if (i27 > 0) {
                        int min = Math.min(i25, i27);
                        a(i26, min);
                        this.f10759o -= min;
                        i26 += min;
                        f10 = f13;
                        d = d2;
                        i14 = i22;
                        i12 = i25;
                    } else {
                        if (i21 > 4000) {
                            i7 = i21 / 4000;
                        } else {
                            i7 = i22;
                        }
                        int i28 = this.f10752g;
                        int i29 = this.f10751f;
                        if (i23 == i22 && i7 == i22) {
                            i10 = pVar.e(i26, i29, i28);
                            f10 = f13;
                        } else {
                            pVar.d(i26, i7);
                            f10 = f13;
                            int q10 = pVar.q(i29 / i7, i28 / i7);
                            if (i7 != i22) {
                                int i30 = q10 * i7;
                                int i31 = i7 * 4;
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
                            i11 = this.f10760p;
                        } else {
                            i11 = i10;
                        }
                        pVar.f();
                        this.f10760p = i10;
                        if (d2 > 1.0d) {
                            if (d2 >= 2.0d) {
                                i15 = i22;
                                double d10 = (i11 / (d2 - 1.0d)) + this.f10761q;
                                i16 = (int) Math.round(d10);
                                d = d2;
                                this.f10761q = d10 - i16;
                                pVar = pVar;
                            } else {
                                d = d2;
                                i15 = i22;
                                double d11 = (((2.0d - d) * i11) / (d - 1.0d)) + this.f10761q;
                                int round = (int) Math.round(d11);
                                this.f10759o = round;
                                this.f10761q = d11 - round;
                                i16 = i11;
                            }
                            pVar.i(i16);
                            int i34 = i25;
                            int i35 = i16;
                            pVar.m(i35, this.f10748b, this.f10755k, i26, i26 + i11);
                            this.f10755k += i35;
                            i26 = i11 + i35 + i26;
                            i12 = i34;
                            i14 = i15;
                        } else {
                            d = d2;
                            int i36 = i22;
                            int i37 = i25;
                            if (d < 0.5d) {
                                i12 = i37;
                                double d12 = ((i11 * d) / (1.0d - d)) + this.f10761q;
                                int round2 = (int) Math.round(d12);
                                this.f10761q = d12 - round2;
                                i13 = round2;
                            } else {
                                i12 = i37;
                                double d13 = ((((d * 2.0d) - 1.0d) * i11) / (1.0d - d)) + this.f10761q;
                                int round3 = (int) Math.round(d13);
                                this.f10759o = round3;
                                this.f10761q = d13 - round3;
                                i13 = i11;
                            }
                            int i38 = i11 + i13;
                            pVar.i(i38);
                            i14 = i36;
                            System.arraycopy(pVar.g(), i26 * i23, pVar.h(), this.f10755k * i23, i11 * i23);
                            int i39 = i26;
                            pVar.m(i13, this.f10748b, this.f10755k + i11, i11 + i26, i39);
                            this.f10755k += i38;
                            i26 = i39 + i13;
                        }
                    }
                    if (i26 + i12 > i24) {
                        break;
                    }
                    i25 = i12;
                    f13 = f10;
                    i22 = i14;
                    d2 = d;
                }
                int i40 = this.f10754j - i26;
                System.arraycopy(pVar.g(), i26 * i23, pVar.g(), 0, i40 * i23);
                this.f10754j = i40;
                if (f10 == 1.0f && this.f10755k != i19) {
                    long j11 = i21 / f10;
                    long j12 = i21;
                    while (j11 != 0 && j12 != 0 && j11 % 2 == 0 && j12 % 2 == 0) {
                        j11 /= 2;
                        j12 /= 2;
                    }
                    int i41 = this.f10755k - i19;
                    pVar.n(i41);
                    System.arraycopy(pVar.h(), i19 * i23, pVar.l(), this.f10756l * i23, i41 * i23);
                    this.f10755k = i19;
                    this.f10756l += i41;
                    int i42 = 0;
                    while (true) {
                        i17 = this.f10756l - 1;
                        if (i42 >= i17) {
                            break;
                        }
                        while (true) {
                            i18 = this.f10757m + 1;
                            j3 = i18;
                            j10 = this.f10758n;
                            if (j3 * j11 <= j10 * j12) {
                                break;
                            }
                            int i43 = i14;
                            pVar.i(i43);
                            pVar.k(j12, i42, j11);
                            this.f10758n += i43;
                            this.f10755k += i43;
                        }
                        int i44 = i14;
                        this.f10757m = i18;
                        if (j3 == j12) {
                            this.f10757m = 0;
                            if (j10 == j11) {
                                z10 = i44;
                            } else {
                                z10 = 0;
                            }
                            ja.p(z10);
                            this.f10758n = 0;
                        }
                        i42++;
                        i14 = i44;
                    }
                    if (i17 != 0) {
                        System.arraycopy(pVar.l(), i17 * i23, pVar.l(), 0, (this.f10756l - i17) * i23);
                        this.f10756l -= i17;
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

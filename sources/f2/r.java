package f2;

import a8.la;
public final class r {
    public final int f11098a;
    public final int f11099b;
    public final float f11100c;
    public final float d;
    public final float f11101e;
    public final int f11102f;
    public final int f11103g;
    public final int h;
    public final q f11104i;
    public int f11105j;
    public int f11106k;
    public int f11107l;
    public int f11108m;
    public int f11109n;
    public int f11110o;
    public int f11111p;
    public double f11112q;

    public r(int i7, int i10, float f10, float f11, int i11, boolean z10) {
        p pVar;
        this.f11098a = i7;
        this.f11099b = i10;
        this.f11100c = f10;
        this.d = f11;
        this.f11101e = i7 / i11;
        this.f11102f = i7 / 400;
        int i12 = i7 / 65;
        this.f11103g = i12;
        this.h = i12 * 2;
        if (z10) {
            pVar = new p(this);
        } else {
            ?? obj = new Object();
            obj.h = this;
            int i13 = this.h;
            obj.d = new short[i13];
            int i14 = i13 * this.f11099b;
            obj.f5200e = new short[i14];
            obj.f5201f = new short[i14];
            obj.f5202g = new short[i14];
            pVar = obj;
        }
        this.f11104i = pVar;
    }

    public final void a(int i7, int i10) {
        q qVar = this.f11104i;
        qVar.i(i10);
        Object g10 = qVar.g();
        int i11 = this.f11099b;
        System.arraycopy(g10, i7 * i11, qVar.h(), this.f11106k * i11, i11 * i10);
        this.f11106k += i10;
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
        int i19 = this.f11106k;
        float f11 = this.f11100c;
        float f12 = this.d;
        double d2 = f11 / f12;
        float f13 = this.f11101e * f12;
        int i20 = (d2 > 1.0000100135803223d ? 1 : (d2 == 1.0000100135803223d ? 0 : -1));
        int i21 = this.f11098a;
        int i22 = 1;
        q qVar = this.f11104i;
        int i23 = this.f11099b;
        if (i20 <= 0 && d2 >= 0.9999899864196777d) {
            a(0, this.f11105j);
            this.f11105j = 0;
        } else {
            int i24 = this.f11105j;
            int i25 = this.h;
            if (i24 >= i25) {
                int i26 = 0;
                while (true) {
                    int i27 = this.f11110o;
                    if (i27 > 0) {
                        int min = Math.min(i25, i27);
                        a(i26, min);
                        this.f11110o -= min;
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
                        int i28 = this.f11103g;
                        int i29 = this.f11102f;
                        if (i23 == i22 && i7 == i22) {
                            i10 = qVar.e(i26, i29, i28);
                            f10 = f13;
                        } else {
                            qVar.d(i26, i7);
                            f10 = f13;
                            int q10 = qVar.q(i29 / i7, i28 / i7);
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
                                    i10 = qVar.e(i26, i29, i28);
                                } else {
                                    qVar.d(i26, i22);
                                    i10 = qVar.q(i29, i28);
                                }
                            } else {
                                i10 = q10;
                            }
                        }
                        if (qVar.j()) {
                            i11 = this.f11111p;
                        } else {
                            i11 = i10;
                        }
                        qVar.f();
                        this.f11111p = i10;
                        if (d2 > 1.0d) {
                            if (d2 >= 2.0d) {
                                i15 = i22;
                                double d10 = (i11 / (d2 - 1.0d)) + this.f11112q;
                                i16 = (int) Math.round(d10);
                                d = d2;
                                this.f11112q = d10 - i16;
                                qVar = qVar;
                            } else {
                                d = d2;
                                i15 = i22;
                                double d11 = (((2.0d - d) * i11) / (d - 1.0d)) + this.f11112q;
                                int round = (int) Math.round(d11);
                                this.f11110o = round;
                                this.f11112q = d11 - round;
                                i16 = i11;
                            }
                            qVar.i(i16);
                            int i34 = i25;
                            int i35 = i16;
                            qVar.m(i35, this.f11099b, this.f11106k, i26, i26 + i11);
                            this.f11106k += i35;
                            i26 = i11 + i35 + i26;
                            i12 = i34;
                            i14 = i15;
                        } else {
                            d = d2;
                            int i36 = i22;
                            int i37 = i25;
                            if (d < 0.5d) {
                                i12 = i37;
                                double d12 = ((i11 * d) / (1.0d - d)) + this.f11112q;
                                int round2 = (int) Math.round(d12);
                                this.f11112q = d12 - round2;
                                i13 = round2;
                            } else {
                                i12 = i37;
                                double d13 = ((((d * 2.0d) - 1.0d) * i11) / (1.0d - d)) + this.f11112q;
                                int round3 = (int) Math.round(d13);
                                this.f11110o = round3;
                                this.f11112q = d13 - round3;
                                i13 = i11;
                            }
                            int i38 = i11 + i13;
                            qVar.i(i38);
                            i14 = i36;
                            System.arraycopy(qVar.g(), i26 * i23, qVar.h(), this.f11106k * i23, i11 * i23);
                            int i39 = i26;
                            qVar.m(i13, this.f11099b, this.f11106k + i11, i11 + i26, i39);
                            this.f11106k += i38;
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
                int i40 = this.f11105j - i26;
                System.arraycopy(qVar.g(), i26 * i23, qVar.g(), 0, i40 * i23);
                this.f11105j = i40;
                if (f10 == 1.0f && this.f11106k != i19) {
                    long j11 = i21 / f10;
                    long j12 = i21;
                    while (j11 != 0 && j12 != 0 && j11 % 2 == 0 && j12 % 2 == 0) {
                        j11 /= 2;
                        j12 /= 2;
                    }
                    int i41 = this.f11106k - i19;
                    qVar.n(i41);
                    System.arraycopy(qVar.h(), i19 * i23, qVar.l(), this.f11107l * i23, i41 * i23);
                    this.f11106k = i19;
                    this.f11107l += i41;
                    int i42 = 0;
                    while (true) {
                        i17 = this.f11107l - 1;
                        if (i42 >= i17) {
                            break;
                        }
                        while (true) {
                            i18 = this.f11108m + 1;
                            j3 = i18;
                            j10 = this.f11109n;
                            if (j3 * j11 <= j10 * j12) {
                                break;
                            }
                            int i43 = i14;
                            qVar.i(i43);
                            qVar.k(j12, i42, j11);
                            this.f11109n += i43;
                            this.f11106k += i43;
                        }
                        int i44 = i14;
                        this.f11108m = i18;
                        if (j3 == j12) {
                            this.f11108m = 0;
                            if (j10 == j11) {
                                z10 = i44;
                            } else {
                                z10 = 0;
                            }
                            la.p(z10);
                            this.f11109n = 0;
                        }
                        i42++;
                        i14 = i44;
                    }
                    if (i17 != 0) {
                        System.arraycopy(qVar.l(), i17 * i23, qVar.l(), 0, (this.f11107l - i17) * i23);
                        this.f11107l -= i17;
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

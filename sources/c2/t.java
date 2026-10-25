package c2;

import a8.yb;
public final class t {
    public final int f5974a;
    public final int f5975b;
    public final float f5976c;
    public final float d;
    public final float e;
    public final int f5977f;
    public final int f5978g;
    public final int h;
    public final r f5979i;
    public int f5980j;
    public int f5981k;
    public int f5982l;
    public int f5983m;
    public int f5984n;
    public int f5985o;
    public int f5986p;
    public double f5987q;

    public t(int i10, int i11, float f7, float f10, int i12, boolean z10) {
        r sVar;
        this.f5974a = i10;
        this.f5975b = i11;
        this.f5976c = f7;
        this.d = f10;
        this.e = i10 / i12;
        this.f5977f = i10 / 400;
        int i13 = i10 / 65;
        this.f5978g = i13;
        this.h = i13 * 2;
        if (z10) {
            sVar = new q(this);
        } else {
            sVar = new s(this);
        }
        this.f5979i = sVar;
    }

    public final void a(int i10, int i11) {
        r rVar = this.f5979i;
        rVar.j(i11);
        Object h = rVar.h();
        int i12 = this.f5975b;
        System.arraycopy(h, i10 * i12, rVar.i(), this.f5981k * i12, i12 * i11);
        this.f5981k += i11;
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
        int i20 = this.f5981k;
        float f10 = this.f5976c;
        float f11 = this.d;
        double d10 = f10 / f11;
        float f12 = this.e * f11;
        int i21 = (d10 > 1.0000100135803223d ? 1 : (d10 == 1.0000100135803223d ? 0 : -1));
        int i22 = this.f5974a;
        int i23 = 1;
        r rVar = this.f5979i;
        int i24 = this.f5975b;
        if (i21 <= 0 && d10 >= 0.9999899864196777d) {
            a(0, this.f5980j);
            this.f5980j = 0;
        } else {
            int i25 = this.f5980j;
            int i26 = this.h;
            if (i25 >= i26) {
                int i27 = 0;
                while (true) {
                    int i28 = this.f5985o;
                    if (i28 > 0) {
                        int min = Math.min(i26, i28);
                        a(i27, min);
                        this.f5985o -= min;
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
                        int i29 = this.f5978g;
                        int i30 = this.f5977f;
                        if (i24 == i23 && i10 == i23) {
                            i11 = rVar.f(i27, i30, i29);
                            f7 = f12;
                        } else {
                            rVar.e(i27, i10);
                            f7 = f12;
                            int q5 = rVar.q(i30 / i10, i29 / i10);
                            if (i10 != i23) {
                                int i31 = q5 * i10;
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
                                    i11 = rVar.f(i27, i30, i29);
                                } else {
                                    rVar.e(i27, i23);
                                    i11 = rVar.q(i30, i29);
                                }
                            } else {
                                i11 = q5;
                            }
                        }
                        if (rVar.k()) {
                            i12 = this.f5986p;
                        } else {
                            i12 = i11;
                        }
                        rVar.g();
                        this.f5986p = i11;
                        if (d10 > 1.0d) {
                            if (d10 >= 2.0d) {
                                i16 = i23;
                                double d11 = (i12 / (d10 - 1.0d)) + this.f5987q;
                                i17 = (int) Math.round(d11);
                                d = d10;
                                this.f5987q = d11 - i17;
                                rVar = rVar;
                            } else {
                                d = d10;
                                i16 = i23;
                                double d12 = (((2.0d - d) * i12) / (d - 1.0d)) + this.f5987q;
                                int round = (int) Math.round(d12);
                                this.f5985o = round;
                                this.f5987q = d12 - round;
                                i17 = i12;
                            }
                            rVar.j(i17);
                            int i35 = i26;
                            int i36 = i17;
                            rVar.m(i36, this.f5975b, this.f5981k, i27, i27 + i12);
                            this.f5981k += i36;
                            i27 = i12 + i36 + i27;
                            i13 = i35;
                            i15 = i16;
                        } else {
                            d = d10;
                            int i37 = i23;
                            int i38 = i26;
                            if (d < 0.5d) {
                                i13 = i38;
                                double d13 = ((i12 * d) / (1.0d - d)) + this.f5987q;
                                int round2 = (int) Math.round(d13);
                                this.f5987q = d13 - round2;
                                i14 = round2;
                            } else {
                                i13 = i38;
                                double d14 = ((((d * 2.0d) - 1.0d) * i12) / (1.0d - d)) + this.f5987q;
                                int round3 = (int) Math.round(d14);
                                this.f5985o = round3;
                                this.f5987q = d14 - round3;
                                i14 = i12;
                            }
                            int i39 = i12 + i14;
                            rVar.j(i39);
                            i15 = i37;
                            System.arraycopy(rVar.h(), i27 * i24, rVar.i(), this.f5981k * i24, i12 * i24);
                            int i40 = i27;
                            rVar.m(i14, this.f5975b, this.f5981k + i12, i12 + i27, i40);
                            this.f5981k += i39;
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
                int i41 = this.f5980j - i27;
                System.arraycopy(rVar.h(), i27 * i24, rVar.h(), 0, i41 * i24);
                this.f5980j = i41;
                if (f7 == 1.0f && this.f5981k != i20) {
                    long j12 = i22 / f7;
                    long j13 = i22;
                    while (j12 != 0 && j13 != 0 && j12 % 2 == 0 && j13 % 2 == 0) {
                        j12 /= 2;
                        j13 /= 2;
                    }
                    int i42 = this.f5981k - i20;
                    rVar.n(i42);
                    System.arraycopy(rVar.i(), i20 * i24, rVar.l(), this.f5982l * i24, i42 * i24);
                    this.f5981k = i20;
                    this.f5982l += i42;
                    int i43 = 0;
                    while (true) {
                        i18 = this.f5982l - 1;
                        if (i43 >= i18) {
                            break;
                        }
                        while (true) {
                            i19 = this.f5983m + 1;
                            j10 = i19;
                            j11 = this.f5984n;
                            if (j10 * j12 <= j11 * j13) {
                                break;
                            }
                            int i44 = i15;
                            rVar.j(i44);
                            rVar.c(i43, j13, j12);
                            this.f5984n += i44;
                            this.f5981k += i44;
                        }
                        int i45 = i15;
                        this.f5983m = i19;
                        if (j10 == j13) {
                            this.f5983m = 0;
                            if (j11 == j12) {
                                z10 = i45;
                            } else {
                                z10 = 0;
                            }
                            yb.p(z10);
                            this.f5984n = 0;
                        }
                        i43++;
                        i15 = i45;
                    }
                    if (i18 != 0) {
                        System.arraycopy(rVar.l(), i18 * i24, rVar.l(), 0, (this.f5982l - i18) * i24);
                        this.f5982l -= i18;
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

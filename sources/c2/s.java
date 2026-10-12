package c2;

import v7.u6;
public final class s {
    public final int f4162a;
    public final int f4163b;
    public final float f4164c;
    public final float d;
    public final float e;
    public final int f4165f;
    public final int f4166g;
    public final int h;
    public final q f4167i;
    public int f4168j;
    public int f4169k;
    public int f4170l;
    public int f4171m;
    public int f4172n;
    public int f4173o;
    public int f4174p;
    public double f4175q;

    public s(int i10, int i11, float f7, float f10, int i12, boolean z10) {
        q rVar;
        this.f4162a = i10;
        this.f4163b = i11;
        this.f4164c = f7;
        this.d = f10;
        this.e = i10 / i12;
        this.f4165f = i10 / 400;
        int i13 = i10 / 65;
        this.f4166g = i13;
        this.h = i13 * 2;
        if (z10) {
            rVar = new p(this);
        } else {
            rVar = new r(this);
        }
        this.f4167i = rVar;
    }

    public final void a(int i10, int i11) {
        q qVar = this.f4167i;
        qVar.j(i11);
        Object h = qVar.h();
        int i12 = this.f4163b;
        System.arraycopy(h, i10 * i12, qVar.i(), this.f4169k * i12, i12 * i11);
        this.f4169k += i11;
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
        int i20 = this.f4169k;
        float f10 = this.f4164c;
        float f11 = this.d;
        double d10 = f10 / f11;
        float f12 = this.e * f11;
        int i21 = (d10 > 1.0000100135803223d ? 1 : (d10 == 1.0000100135803223d ? 0 : -1));
        int i22 = this.f4162a;
        int i23 = 1;
        q qVar = this.f4167i;
        int i24 = this.f4163b;
        if (i21 <= 0 && d10 >= 0.9999899864196777d) {
            a(0, this.f4168j);
            this.f4168j = 0;
        } else {
            int i25 = this.f4168j;
            int i26 = this.h;
            if (i25 >= i26) {
                int i27 = 0;
                while (true) {
                    int i28 = this.f4173o;
                    if (i28 > 0) {
                        int min = Math.min(i26, i28);
                        a(i27, min);
                        this.f4173o -= min;
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
                        int i29 = this.f4166g;
                        int i30 = this.f4165f;
                        if (i24 == i23 && i10 == i23) {
                            i11 = qVar.f(i27, i30, i29);
                            f7 = f12;
                        } else {
                            qVar.e(i27, i10);
                            f7 = f12;
                            int q6 = qVar.q(i30 / i10, i29 / i10);
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
                                    i11 = qVar.f(i27, i30, i29);
                                } else {
                                    qVar.e(i27, i23);
                                    i11 = qVar.q(i30, i29);
                                }
                            } else {
                                i11 = q6;
                            }
                        }
                        if (qVar.k()) {
                            i12 = this.f4174p;
                        } else {
                            i12 = i11;
                        }
                        qVar.g();
                        this.f4174p = i11;
                        if (d10 > 1.0d) {
                            if (d10 >= 2.0d) {
                                i16 = i23;
                                double d11 = (i12 / (d10 - 1.0d)) + this.f4175q;
                                i17 = (int) Math.round(d11);
                                d = d10;
                                this.f4175q = d11 - i17;
                                qVar = qVar;
                            } else {
                                d = d10;
                                i16 = i23;
                                double d12 = (((2.0d - d) * i12) / (d - 1.0d)) + this.f4175q;
                                int round = (int) Math.round(d12);
                                this.f4173o = round;
                                this.f4175q = d12 - round;
                                i17 = i12;
                            }
                            qVar.j(i17);
                            int i35 = i26;
                            int i36 = i17;
                            qVar.m(i36, this.f4163b, this.f4169k, i27, i27 + i12);
                            this.f4169k += i36;
                            i27 = i12 + i36 + i27;
                            i13 = i35;
                            i15 = i16;
                        } else {
                            d = d10;
                            int i37 = i23;
                            int i38 = i26;
                            if (d < 0.5d) {
                                i13 = i38;
                                double d13 = ((i12 * d) / (1.0d - d)) + this.f4175q;
                                int round2 = (int) Math.round(d13);
                                this.f4175q = d13 - round2;
                                i14 = round2;
                            } else {
                                i13 = i38;
                                double d14 = ((((d * 2.0d) - 1.0d) * i12) / (1.0d - d)) + this.f4175q;
                                int round3 = (int) Math.round(d14);
                                this.f4173o = round3;
                                this.f4175q = d14 - round3;
                                i14 = i12;
                            }
                            int i39 = i12 + i14;
                            qVar.j(i39);
                            i15 = i37;
                            System.arraycopy(qVar.h(), i27 * i24, qVar.i(), this.f4169k * i24, i12 * i24);
                            int i40 = i27;
                            qVar.m(i14, this.f4163b, this.f4169k + i12, i12 + i27, i40);
                            this.f4169k += i39;
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
                int i41 = this.f4168j - i27;
                System.arraycopy(qVar.h(), i27 * i24, qVar.h(), 0, i41 * i24);
                this.f4168j = i41;
                if (f7 == 1.0f && this.f4169k != i20) {
                    long j12 = i22 / f7;
                    long j13 = i22;
                    while (j12 != 0 && j13 != 0 && j12 % 2 == 0 && j13 % 2 == 0) {
                        j12 /= 2;
                        j13 /= 2;
                    }
                    int i42 = this.f4169k - i20;
                    qVar.n(i42);
                    System.arraycopy(qVar.i(), i20 * i24, qVar.l(), this.f4170l * i24, i42 * i24);
                    this.f4169k = i20;
                    this.f4170l += i42;
                    int i43 = 0;
                    while (true) {
                        i18 = this.f4170l - 1;
                        if (i43 >= i18) {
                            break;
                        }
                        while (true) {
                            i19 = this.f4171m + 1;
                            j10 = i19;
                            j11 = this.f4172n;
                            if (j10 * j12 <= j11 * j13) {
                                break;
                            }
                            int i44 = i15;
                            qVar.j(i44);
                            qVar.c(i43, j13, j12);
                            this.f4172n += i44;
                            this.f4169k += i44;
                        }
                        int i45 = i15;
                        this.f4171m = i19;
                        if (j10 == j13) {
                            this.f4171m = 0;
                            if (j11 == j12) {
                                z10 = i45;
                            } else {
                                z10 = 0;
                            }
                            u6.p(z10);
                            this.f4172n = 0;
                        }
                        i43++;
                        i15 = i45;
                    }
                    if (i18 != 0) {
                        System.arraycopy(qVar.l(), i18 * i24, qVar.l(), 0, (this.f4170l - i18) * i24);
                        this.f4170l -= i18;
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

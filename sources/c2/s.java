package c2;

import v7.u6;
public final class s {
    public final int f4536a;
    public final int f4537b;
    public final float f4538c;
    public final float d;
    public final float e;
    public final int f4539f;
    public final int f4540g;
    public final int h;
    public final q f4541i;
    public int f4542j;
    public int f4543k;
    public int f4544l;
    public int f4545m;
    public int f4546n;
    public int f4547o;
    public int f4548p;
    public double f4549q;

    public s(int i10, int i11, float f7, float f10, int i12, boolean z10) {
        q rVar;
        this.f4536a = i10;
        this.f4537b = i11;
        this.f4538c = f7;
        this.d = f10;
        this.e = i10 / i12;
        this.f4539f = i10 / 400;
        int i13 = i10 / 65;
        this.f4540g = i13;
        this.h = i13 * 2;
        if (z10) {
            rVar = new p(this);
        } else {
            rVar = new r(this);
        }
        this.f4541i = rVar;
    }

    public final void a(int i10, int i11) {
        q qVar = this.f4541i;
        qVar.j(i11);
        Object h = qVar.h();
        int i12 = this.f4537b;
        System.arraycopy(h, i10 * i12, qVar.i(), this.f4543k * i12, i12 * i11);
        this.f4543k += i11;
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
        int i20 = this.f4543k;
        float f10 = this.f4538c;
        float f11 = this.d;
        double d10 = f10 / f11;
        float f12 = this.e * f11;
        int i21 = (d10 > 1.0000100135803223d ? 1 : (d10 == 1.0000100135803223d ? 0 : -1));
        int i22 = this.f4536a;
        int i23 = 1;
        q qVar = this.f4541i;
        int i24 = this.f4537b;
        if (i21 <= 0 && d10 >= 0.9999899864196777d) {
            a(0, this.f4542j);
            this.f4542j = 0;
        } else {
            int i25 = this.f4542j;
            int i26 = this.h;
            if (i25 >= i26) {
                int i27 = 0;
                while (true) {
                    int i28 = this.f4547o;
                    if (i28 > 0) {
                        int min = Math.min(i26, i28);
                        a(i27, min);
                        this.f4547o -= min;
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
                        int i29 = this.f4540g;
                        int i30 = this.f4539f;
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
                            i12 = this.f4548p;
                        } else {
                            i12 = i11;
                        }
                        qVar.g();
                        this.f4548p = i11;
                        if (d10 > 1.0d) {
                            if (d10 >= 2.0d) {
                                i16 = i23;
                                double d11 = (i12 / (d10 - 1.0d)) + this.f4549q;
                                i17 = (int) Math.round(d11);
                                d = d10;
                                this.f4549q = d11 - i17;
                                qVar = qVar;
                            } else {
                                d = d10;
                                i16 = i23;
                                double d12 = (((2.0d - d) * i12) / (d - 1.0d)) + this.f4549q;
                                int round = (int) Math.round(d12);
                                this.f4547o = round;
                                this.f4549q = d12 - round;
                                i17 = i12;
                            }
                            qVar.j(i17);
                            int i35 = i26;
                            int i36 = i17;
                            qVar.m(i36, this.f4537b, this.f4543k, i27, i27 + i12);
                            this.f4543k += i36;
                            i27 = i12 + i36 + i27;
                            i13 = i35;
                            i15 = i16;
                        } else {
                            d = d10;
                            int i37 = i23;
                            int i38 = i26;
                            if (d < 0.5d) {
                                i13 = i38;
                                double d13 = ((i12 * d) / (1.0d - d)) + this.f4549q;
                                int round2 = (int) Math.round(d13);
                                this.f4549q = d13 - round2;
                                i14 = round2;
                            } else {
                                i13 = i38;
                                double d14 = ((((d * 2.0d) - 1.0d) * i12) / (1.0d - d)) + this.f4549q;
                                int round3 = (int) Math.round(d14);
                                this.f4547o = round3;
                                this.f4549q = d14 - round3;
                                i14 = i12;
                            }
                            int i39 = i12 + i14;
                            qVar.j(i39);
                            i15 = i37;
                            System.arraycopy(qVar.h(), i27 * i24, qVar.i(), this.f4543k * i24, i12 * i24);
                            int i40 = i27;
                            qVar.m(i14, this.f4537b, this.f4543k + i12, i12 + i27, i40);
                            this.f4543k += i39;
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
                int i41 = this.f4542j - i27;
                System.arraycopy(qVar.h(), i27 * i24, qVar.h(), 0, i41 * i24);
                this.f4542j = i41;
                if (f7 == 1.0f && this.f4543k != i20) {
                    long j12 = i22 / f7;
                    long j13 = i22;
                    while (j12 != 0 && j13 != 0 && j12 % 2 == 0 && j13 % 2 == 0) {
                        j12 /= 2;
                        j13 /= 2;
                    }
                    int i42 = this.f4543k - i20;
                    qVar.n(i42);
                    System.arraycopy(qVar.i(), i20 * i24, qVar.l(), this.f4544l * i24, i42 * i24);
                    this.f4543k = i20;
                    this.f4544l += i42;
                    int i43 = 0;
                    while (true) {
                        i18 = this.f4544l - 1;
                        if (i43 >= i18) {
                            break;
                        }
                        while (true) {
                            i19 = this.f4545m + 1;
                            j10 = i19;
                            j11 = this.f4546n;
                            if (j10 * j12 <= j11 * j13) {
                                break;
                            }
                            int i44 = i15;
                            qVar.j(i44);
                            qVar.c(i43, j13, j12);
                            this.f4546n += i44;
                            this.f4543k += i44;
                        }
                        int i45 = i15;
                        this.f4545m = i19;
                        if (j10 == j13) {
                            this.f4545m = 0;
                            if (j11 == j12) {
                                z10 = i45;
                            } else {
                                z10 = 0;
                            }
                            u6.p(z10);
                            this.f4546n = 0;
                        }
                        i43++;
                        i15 = i45;
                    }
                    if (i18 != 0) {
                        System.arraycopy(qVar.l(), i18 * i24, qVar.l(), 0, (this.f4544l - i18) * i24);
                        this.f4544l -= i18;
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

package defpackage;
public final class lka {
    public final int a;
    public final int b;
    public final float c;
    public final float d;
    public final float e;
    public final int f;
    public final int g;
    public final int h;
    public final jka i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public double q;

    public lka(int i, int i2, float f, float f2, int i3, boolean z) {
        jka kkaVar;
        this.a = i;
        this.b = i2;
        this.c = f;
        this.d = f2;
        this.e = i / i3;
        this.f = i / 400;
        int i4 = i / 65;
        this.g = i4;
        this.h = i4 << 1;
        if (z) {
            kkaVar = new ika(this);
        } else {
            kkaVar = new kka(this);
        }
        this.i = kkaVar;
    }

    public final void a(int i, int i2) {
        jka jkaVar = this.i;
        jkaVar.i(i2);
        Object g = jkaVar.g();
        int i3 = this.b;
        System.arraycopy(g, i * i3, jkaVar.h(), this.k * i3, i3 * i2);
        this.k += i2;
    }

    public final void b() {
        int i;
        float f;
        int i2;
        int i3;
        double d;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        long j;
        long j2;
        int i11;
        boolean z;
        int i12 = this.k;
        float f2 = this.c;
        float f3 = this.d;
        double d2 = f2 / f3;
        float f4 = this.e * f3;
        int i13 = (d2 > 1.0000100135803223d ? 1 : (d2 == 1.0000100135803223d ? 0 : -1));
        int i14 = this.a;
        int i15 = 1;
        jka jkaVar = this.i;
        int i16 = this.b;
        if (i13 <= 0 && d2 >= 0.9999899864196777d) {
            a(0, this.j);
            this.j = 0;
        } else {
            int i17 = this.j;
            int i18 = this.h;
            if (i17 >= i18) {
                int i19 = 0;
                while (true) {
                    int i20 = this.o;
                    if (i20 > 0) {
                        int min = Math.min(i18, i20);
                        a(i19, min);
                        this.o -= min;
                        i19 += min;
                        f = f4;
                        d = d2;
                        i6 = i15;
                        i4 = i18;
                    } else {
                        if (i14 > 4000) {
                            i = i14 / 4000;
                        } else {
                            i = i15;
                        }
                        int i21 = this.g;
                        int i22 = this.f;
                        if (i16 == i15 && i == i15) {
                            i2 = jkaVar.e(i19, i22, i21);
                            f = f4;
                        } else {
                            jkaVar.d(i19, i);
                            f = f4;
                            int q = jkaVar.q(i22 / i, i21 / i);
                            if (i != i15) {
                                int i23 = q * i;
                                int i24 = i << 2;
                                int i25 = i23 - i24;
                                int i26 = i23 + i24;
                                if (i25 >= i22) {
                                    i22 = i25;
                                }
                                if (i26 <= i21) {
                                    i21 = i26;
                                }
                                if (i16 == i15) {
                                    i2 = jkaVar.e(i19, i22, i21);
                                } else {
                                    jkaVar.d(i19, i15);
                                    i2 = jkaVar.q(i22, i21);
                                }
                            } else {
                                i2 = q;
                            }
                        }
                        if (jkaVar.j()) {
                            i3 = this.p;
                        } else {
                            i3 = i2;
                        }
                        jkaVar.f();
                        this.p = i2;
                        int i27 = (d2 > 1.0d ? 1 : (d2 == 1.0d ? 0 : -1));
                        double d3 = this.q;
                        if (i27 > 0) {
                            if (d2 >= 2.0d) {
                                i7 = i15;
                                double d4 = (i3 / (d2 - 1.0d)) + d3;
                                i8 = (int) Math.round(d4);
                                d = d2;
                                this.q = d4 - i8;
                                jkaVar = jkaVar;
                            } else {
                                d = d2;
                                i7 = i15;
                                double d5 = (((2.0d - d) * i3) / (d - 1.0d)) + d3;
                                int round = (int) Math.round(d5);
                                this.o = round;
                                this.q = d5 - round;
                                i8 = i3;
                            }
                            jkaVar.i(i8);
                            int i28 = i18;
                            int i29 = i8;
                            jkaVar.m(i29, this.b, this.k, i19, i19 + i3);
                            this.k += i29;
                            i19 = i3 + i29 + i19;
                            i4 = i28;
                            i6 = i7;
                        } else {
                            d = d2;
                            int i30 = i15;
                            i4 = i18;
                            if (d < 0.5d) {
                                double d6 = ((i3 * d) / (1.0d - d)) + d3;
                                i5 = (int) Math.round(d6);
                                this.q = d6 - i5;
                            } else {
                                double d7 = ((((2.0d * d) - 1.0d) * i3) / (1.0d - d)) + d3;
                                int round2 = (int) Math.round(d7);
                                this.o = round2;
                                this.q = d7 - round2;
                                i5 = i3;
                            }
                            int i31 = i3 + i5;
                            jkaVar.i(i31);
                            i6 = i30;
                            System.arraycopy(jkaVar.g(), i19 * i16, jkaVar.h(), this.k * i16, i3 * i16);
                            int i32 = i19;
                            jkaVar.m(i5, this.b, this.k + i3, i3 + i19, i32);
                            this.k += i31;
                            i19 = i32 + i5;
                        }
                    }
                    if (i19 + i4 > i17) {
                        break;
                    }
                    i18 = i4;
                    f4 = f;
                    i15 = i6;
                    d2 = d;
                }
                int i33 = this.j - i19;
                System.arraycopy(jkaVar.g(), i19 * i16, jkaVar.g(), 0, i33 * i16);
                this.j = i33;
                if (f == 1.0f && this.k != i12) {
                    long j3 = i14 / f;
                    long j4 = i14;
                    while (j3 != 0 && j4 != 0 && j3 % 2 == 0 && j4 % 2 == 0) {
                        j3 /= 2;
                        j4 /= 2;
                    }
                    int i34 = this.k - i12;
                    jkaVar.n(i34);
                    System.arraycopy(jkaVar.h(), i12 * i16, jkaVar.l(), this.l * i16, i34 * i16);
                    this.k = i12;
                    this.l += i34;
                    int i35 = 0;
                    while (true) {
                        i9 = this.l - 1;
                        if (i35 >= i9) {
                            break;
                        }
                        while (true) {
                            i10 = this.m + 1;
                            j = i10;
                            j2 = this.n;
                            i11 = i6;
                            if (j * j3 <= j2 * j4) {
                                break;
                            }
                            jkaVar.i(i11);
                            jkaVar.k(j4, i35, j3);
                            this.n += i11;
                            this.k += i11;
                        }
                        this.m = i10;
                        if (j == j4) {
                            this.m = 0;
                            if (j2 == j3) {
                                z = i11;
                            } else {
                                z = 0;
                            }
                            gre.p(z);
                            this.n = 0;
                        }
                        i35++;
                        i6 = i11;
                    }
                    if (i9 != 0) {
                        System.arraycopy(jkaVar.l(), i9 * i16, jkaVar.l(), 0, (this.l - i9) * i16);
                        this.l -= i9;
                        return;
                    }
                    return;
                }
            }
        }
        f = f4;
        i6 = 1;
        if (f == 1.0f) {
        }
    }
}

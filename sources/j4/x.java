package j4;

import e2.k0;
public final class x implements h0 {
    public final i f9645a;
    public final a4.g f9646b = new a4.g(new byte[10], 10);
    public int f9647c = 0;
    public int d;
    public k0 e;
    public boolean f9648f;
    public boolean f9649g;
    public boolean h;
    public int f9650i;
    public int f9651j;
    public boolean f9652k;
    public long f9653l;

    public x(i iVar) {
        this.f9645a = iVar;
    }

    @Override
    public final void a(int i10, e2.x xVar) {
        int i11;
        int i12;
        int i13;
        boolean z10;
        this.e.getClass();
        int i14 = i10 & 1;
        int i15 = -1;
        int i16 = 2;
        i iVar = this.f9645a;
        if (i14 != 0) {
            int i17 = this.f9647c;
            if (i17 != 0 && i17 != 1) {
                if (i17 != 2) {
                    if (i17 == 3) {
                        if (this.f9651j != -1) {
                            e2.a.l("PesReader", "Unexpected start indicator: expected " + this.f9651j + " more bytes");
                        }
                        if (xVar.f6209c == 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        iVar.g(z10);
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    e2.a.l("PesReader", "Unexpected start indicator reading extended header");
                }
            }
            this.f9647c = 1;
            this.d = 0;
        }
        int i18 = i10;
        while (xVar.a() > 0) {
            int i19 = this.f9647c;
            if (i19 != 0) {
                a4.g gVar = this.f9646b;
                if (i19 != 1) {
                    if (i19 != i16) {
                        if (i19 == 3) {
                            int a2 = xVar.a();
                            int i20 = this.f9651j;
                            if (i20 == i15) {
                                i13 = 0;
                            } else {
                                i13 = a2 - i20;
                            }
                            if (i13 > 0) {
                                a2 -= i13;
                                xVar.M(xVar.f6208b + a2);
                            }
                            iVar.c(xVar);
                            int i21 = this.f9651j;
                            if (i21 != i15) {
                                int i22 = i21 - a2;
                                this.f9651j = i22;
                                if (i22 == 0) {
                                    iVar.g(false);
                                    this.f9647c = 1;
                                    this.d = 0;
                                }
                            }
                        } else {
                            throw new IllegalStateException();
                        }
                    } else {
                        if (b(xVar, (byte[]) gVar.f260b, Math.min(10, this.f9650i)) && b(xVar, null, this.f9650i)) {
                            gVar.d0(0);
                            this.f9653l = -9223372036854775807L;
                            if (this.f9648f) {
                                gVar.f0(4);
                                gVar.f0(1);
                                long i23 = gVar.i(15) << 15;
                                gVar.f0(1);
                                long i24 = i23 | (gVar.i(3) << 30) | gVar.i(15);
                                gVar.f0(1);
                                if (!this.h && this.f9649g) {
                                    gVar.f0(4);
                                    gVar.f0(1);
                                    gVar.f0(1);
                                    gVar.f0(1);
                                    this.e.b((gVar.i(3) << 30) | (gVar.i(15) << 15) | gVar.i(15));
                                    this.h = true;
                                }
                                this.f9653l = this.e.b(i24);
                            }
                            if (this.f9652k) {
                                i12 = 4;
                            } else {
                                i12 = 0;
                            }
                            i18 |= i12;
                            iVar.h(i18, this.f9653l);
                            this.f9647c = 3;
                            this.d = 0;
                        }
                    }
                } else if (b(xVar, (byte[]) gVar.f260b, 9)) {
                    if (c()) {
                        i11 = 2;
                    } else {
                        i11 = 0;
                    }
                    this.f9647c = i11;
                    this.d = 0;
                }
            } else {
                xVar.O(xVar.a());
            }
            i15 = -1;
            i16 = 2;
        }
    }

    public final boolean b(e2.x xVar, byte[] bArr, int i10) {
        int min = Math.min(xVar.a(), i10 - this.d);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            xVar.O(min);
        } else {
            xVar.k(this.d, min, bArr);
        }
        int i11 = this.d + min;
        this.d = i11;
        if (i11 == i10) {
            return true;
        }
        return false;
    }

    public final boolean c() {
        a4.g gVar = this.f9646b;
        gVar.d0(0);
        int i10 = gVar.i(24);
        if (i10 != 1) {
            a1.g.w(i10, "Unexpected start code prefix: ", "PesReader");
            this.f9651j = -1;
            return false;
        }
        gVar.f0(8);
        int i11 = gVar.i(16);
        gVar.f0(5);
        this.f9652k = gVar.h();
        gVar.f0(2);
        this.f9648f = gVar.h();
        this.f9649g = gVar.h();
        gVar.f0(6);
        int i12 = gVar.i(8);
        this.f9650i = i12;
        if (i11 == 0) {
            this.f9651j = -1;
        } else {
            int i13 = (i11 - 3) - i12;
            this.f9651j = i13;
            if (i13 < 0) {
                e2.a.l("PesReader", "Found negative packet payload size: " + this.f9651j);
                this.f9651j = -1;
            }
        }
        return true;
    }

    @Override
    public final void d(k0 k0Var, c3.q qVar, g0 g0Var) {
        this.e = k0Var;
        this.f9645a.f(qVar, g0Var);
    }

    @Override
    public final void e() {
        this.f9647c = 0;
        this.d = 0;
        this.h = false;
        this.f9645a.e();
    }
}

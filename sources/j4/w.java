package j4;

import e2.k0;
public final class w implements g0 {
    public final i f12812a;
    public final a4.g f12813b = new a4.g(new byte[10], 10);
    public int f12814c = 0;
    public int d;
    public k0 e;
    public boolean f12815f;
    public boolean f12816g;
    public boolean h;
    public int f12817i;
    public int f12818j;
    public boolean f12819k;
    public long f12820l;

    public w(i iVar) {
        this.f12812a = iVar;
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
        i iVar = this.f12812a;
        if (i14 != 0) {
            int i17 = this.f12814c;
            if (i17 != 0 && i17 != 1) {
                if (i17 != 2) {
                    if (i17 == 3) {
                        if (this.f12818j != -1) {
                            e2.a.l("PesReader", "Unexpected start indicator: expected " + this.f12818j + " more bytes");
                        }
                        if (xVar.f8416c == 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        iVar.e(z10);
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    e2.a.l("PesReader", "Unexpected start indicator reading extended header");
                }
            }
            this.f12814c = 1;
            this.d = 0;
        }
        int i18 = i10;
        while (xVar.a() > 0) {
            int i19 = this.f12814c;
            if (i19 != 0) {
                a4.g gVar = this.f12813b;
                if (i19 != 1) {
                    if (i19 != i16) {
                        if (i19 == 3) {
                            int a2 = xVar.a();
                            int i20 = this.f12818j;
                            if (i20 == i15) {
                                i13 = 0;
                            } else {
                                i13 = a2 - i20;
                            }
                            if (i13 > 0) {
                                a2 -= i13;
                                xVar.M(xVar.f8415b + a2);
                            }
                            iVar.a(xVar);
                            int i21 = this.f12818j;
                            if (i21 != i15) {
                                int i22 = i21 - a2;
                                this.f12818j = i22;
                                if (i22 == 0) {
                                    iVar.e(false);
                                    this.f12814c = 1;
                                    this.d = 0;
                                }
                            }
                        } else {
                            throw new IllegalStateException();
                        }
                    } else {
                        if (d(xVar, gVar.f260b, Math.min(10, this.f12817i)) && d(xVar, null, this.f12817i)) {
                            gVar.m(0);
                            this.f12820l = -9223372036854775807L;
                            if (this.f12815f) {
                                gVar.o(4);
                                gVar.o(1);
                                long g10 = gVar.g(15) << 15;
                                gVar.o(1);
                                long g11 = g10 | (gVar.g(3) << 30) | gVar.g(15);
                                gVar.o(1);
                                if (!this.h && this.f12816g) {
                                    gVar.o(4);
                                    gVar.o(1);
                                    gVar.o(1);
                                    gVar.o(1);
                                    this.e.b((gVar.g(3) << 30) | (gVar.g(15) << 15) | gVar.g(15));
                                    this.h = true;
                                }
                                this.f12820l = this.e.b(g11);
                            }
                            if (this.f12819k) {
                                i12 = 4;
                            } else {
                                i12 = 0;
                            }
                            i18 |= i12;
                            iVar.f(i18, this.f12820l);
                            this.f12814c = 3;
                            this.d = 0;
                        }
                    }
                } else if (d(xVar, gVar.f260b, 9)) {
                    if (e()) {
                        i11 = 2;
                    } else {
                        i11 = 0;
                    }
                    this.f12814c = i11;
                    this.d = 0;
                }
            } else {
                xVar.O(xVar.a());
            }
            i15 = -1;
            i16 = 2;
        }
    }

    @Override
    public final void b(k0 k0Var, c3.q qVar, f0 f0Var) {
        this.e = k0Var;
        this.f12812a.d(qVar, f0Var);
    }

    @Override
    public final void c() {
        this.f12814c = 0;
        this.d = 0;
        this.h = false;
        this.f12812a.c();
    }

    public final boolean d(e2.x xVar, byte[] bArr, int i10) {
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

    public final boolean e() {
        a4.g gVar = this.f12813b;
        gVar.m(0);
        int g10 = gVar.g(24);
        if (g10 != 1) {
            a1.g.x(g10, "Unexpected start code prefix: ", "PesReader");
            this.f12818j = -1;
            return false;
        }
        gVar.o(8);
        int g11 = gVar.g(16);
        gVar.o(5);
        this.f12819k = gVar.f();
        gVar.o(2);
        this.f12815f = gVar.f();
        this.f12816g = gVar.f();
        gVar.o(6);
        int g12 = gVar.g(8);
        this.f12817i = g12;
        if (g11 == 0) {
            this.f12818j = -1;
        } else {
            int i10 = (g11 - 3) - g12;
            this.f12818j = i10;
            if (i10 < 0) {
                e2.a.l("PesReader", "Found negative packet payload size: " + this.f12818j);
                this.f12818j = -1;
            }
        }
        return true;
    }
}

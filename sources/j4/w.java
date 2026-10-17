package j4;

import e2.k0;
public final class w implements g0 {
    public final i f14217a;
    public final a4.g f14218b = new a4.g(new byte[10], 10);
    public int f14219c = 0;
    public int d;
    public k0 e;
    public boolean f14220f;
    public boolean f14221g;
    public boolean h;
    public int f14222i;
    public int f14223j;
    public boolean f14224k;
    public long f14225l;

    public w(i iVar) {
        this.f14217a = iVar;
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
        i iVar = this.f14217a;
        if (i14 != 0) {
            int i17 = this.f14219c;
            if (i17 != 0 && i17 != 1) {
                if (i17 != 2) {
                    if (i17 == 3) {
                        if (this.f14223j != -1) {
                            e2.a.l("PesReader", "Unexpected start indicator: expected " + this.f14223j + " more bytes");
                        }
                        if (xVar.f8295c == 0) {
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
            this.f14219c = 1;
            this.d = 0;
        }
        int i18 = i10;
        while (xVar.a() > 0) {
            int i19 = this.f14219c;
            if (i19 != 0) {
                a4.g gVar = this.f14218b;
                if (i19 != 1) {
                    if (i19 != i16) {
                        if (i19 == 3) {
                            int a2 = xVar.a();
                            int i20 = this.f14223j;
                            if (i20 == i15) {
                                i13 = 0;
                            } else {
                                i13 = a2 - i20;
                            }
                            if (i13 > 0) {
                                a2 -= i13;
                                xVar.M(xVar.f8294b + a2);
                            }
                            iVar.a(xVar);
                            int i21 = this.f14223j;
                            if (i21 != i15) {
                                int i22 = i21 - a2;
                                this.f14223j = i22;
                                if (i22 == 0) {
                                    iVar.e(false);
                                    this.f14219c = 1;
                                    this.d = 0;
                                }
                            }
                        } else {
                            throw new IllegalStateException();
                        }
                    } else {
                        if (d(xVar, gVar.f260b, Math.min(10, this.f14222i)) && d(xVar, null, this.f14222i)) {
                            gVar.m(0);
                            this.f14225l = -9223372036854775807L;
                            if (this.f14220f) {
                                gVar.o(4);
                                gVar.o(1);
                                long g10 = gVar.g(15) << 15;
                                gVar.o(1);
                                long g11 = g10 | (gVar.g(3) << 30) | gVar.g(15);
                                gVar.o(1);
                                if (!this.h && this.f14221g) {
                                    gVar.o(4);
                                    gVar.o(1);
                                    gVar.o(1);
                                    gVar.o(1);
                                    this.e.b((gVar.g(3) << 30) | (gVar.g(15) << 15) | gVar.g(15));
                                    this.h = true;
                                }
                                this.f14225l = this.e.b(g11);
                            }
                            if (this.f14224k) {
                                i12 = 4;
                            } else {
                                i12 = 0;
                            }
                            i18 |= i12;
                            iVar.f(i18, this.f14225l);
                            this.f14219c = 3;
                            this.d = 0;
                        }
                    }
                } else if (d(xVar, gVar.f260b, 9)) {
                    if (e()) {
                        i11 = 2;
                    } else {
                        i11 = 0;
                    }
                    this.f14219c = i11;
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
        this.f14217a.d(qVar, f0Var);
    }

    @Override
    public final void c() {
        this.f14219c = 0;
        this.d = 0;
        this.h = false;
        this.f14217a.c();
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
        a4.g gVar = this.f14218b;
        gVar.m(0);
        int g10 = gVar.g(24);
        if (g10 != 1) {
            a1.g.x(g10, "Unexpected start code prefix: ", "PesReader");
            this.f14223j = -1;
            return false;
        }
        gVar.o(8);
        int g11 = gVar.g(16);
        gVar.o(5);
        this.f14224k = gVar.f();
        gVar.o(2);
        this.f14220f = gVar.f();
        this.f14221g = gVar.f();
        gVar.o(6);
        int g12 = gVar.g(8);
        this.f14222i = g12;
        if (g11 == 0) {
            this.f14223j = -1;
        } else {
            int i10 = (g11 - 3) - g12;
            this.f14223j = i10;
            if (i10 < 0) {
                e2.a.l("PesReader", "Found negative packet payload size: " + this.f14223j);
                this.f14223j = -1;
            }
        }
        return true;
    }
}

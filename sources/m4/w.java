package m4;

import h2.k0;
public final class w implements h0 {
    public final i f19844a;
    public final d4.f f19845b = new d4.f(new byte[10], 10);
    public int f19846c = 0;
    public int d;
    public k0 f19847e;
    public boolean f19848f;
    public boolean f19849g;
    public boolean h;
    public int f19850i;
    public int f19851j;
    public boolean f19852k;
    public long f19853l;

    public w(i iVar) {
        this.f19844a = iVar;
    }

    @Override
    public final void a(int i7, h2.x xVar) {
        int i10;
        int i11;
        int i12;
        boolean z9;
        this.f19847e.getClass();
        int i13 = i7 & 1;
        int i14 = -1;
        int i15 = 2;
        i iVar = this.f19844a;
        if (i13 != 0) {
            int i16 = this.f19846c;
            if (i16 != 0 && i16 != 1) {
                if (i16 != 2) {
                    if (i16 == 3) {
                        if (this.f19851j != -1) {
                            h2.a.l("PesReader", "Unexpected start indicator: expected " + this.f19851j + " more bytes");
                        }
                        if (xVar.f14166c == 0) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        iVar.e(z9);
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    h2.a.l("PesReader", "Unexpected start indicator reading extended header");
                }
            }
            this.f19846c = 1;
            this.d = 0;
        }
        int i17 = i7;
        while (xVar.a() > 0) {
            int i18 = this.f19846c;
            if (i18 != 0) {
                d4.f fVar = this.f19845b;
                if (i18 != 1) {
                    if (i18 != i15) {
                        if (i18 == 3) {
                            int a10 = xVar.a();
                            int i19 = this.f19851j;
                            if (i19 == i14) {
                                i12 = 0;
                            } else {
                                i12 = a10 - i19;
                            }
                            if (i12 > 0) {
                                a10 -= i12;
                                xVar.M(xVar.f14165b + a10);
                            }
                            iVar.c(xVar);
                            int i20 = this.f19851j;
                            if (i20 != i14) {
                                int i21 = i20 - a10;
                                this.f19851j = i21;
                                if (i21 == 0) {
                                    iVar.e(false);
                                    this.f19846c = 1;
                                    this.d = 0;
                                }
                            }
                        } else {
                            throw new IllegalStateException();
                        }
                    } else {
                        if (c(xVar, (byte[]) fVar.f8167b, Math.min(10, this.f19850i)) && c(xVar, null, this.f19850i)) {
                            fVar.J(0);
                            this.f19853l = -9223372036854775807L;
                            if (this.f19848f) {
                                fVar.L(4);
                                fVar.L(1);
                                long j3 = fVar.j(15) << 15;
                                fVar.L(1);
                                long j10 = j3 | (fVar.j(3) << 30) | fVar.j(15);
                                fVar.L(1);
                                if (!this.h && this.f19849g) {
                                    fVar.L(4);
                                    fVar.L(1);
                                    fVar.L(1);
                                    fVar.L(1);
                                    this.f19847e.b((fVar.j(3) << 30) | (fVar.j(15) << 15) | fVar.j(15));
                                    this.h = true;
                                }
                                this.f19853l = this.f19847e.b(j10);
                            }
                            if (this.f19852k) {
                                i11 = 4;
                            } else {
                                i11 = 0;
                            }
                            i17 |= i11;
                            iVar.f(i17, this.f19853l);
                            this.f19846c = 3;
                            this.d = 0;
                        }
                    }
                } else if (c(xVar, (byte[]) fVar.f8167b, 9)) {
                    if (e()) {
                        i10 = 2;
                    } else {
                        i10 = 0;
                    }
                    this.f19846c = i10;
                    this.d = 0;
                }
            } else {
                xVar.O(xVar.a());
            }
            i14 = -1;
            i15 = 2;
        }
    }

    @Override
    public final void b(k0 k0Var, f3.q qVar, g0 g0Var) {
        this.f19847e = k0Var;
        this.f19844a.g(qVar, g0Var);
    }

    public final boolean c(h2.x xVar, byte[] bArr, int i7) {
        int min = Math.min(xVar.a(), i7 - this.d);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            xVar.O(min);
        } else {
            xVar.k(this.d, min, bArr);
        }
        int i10 = this.d + min;
        this.d = i10;
        if (i10 == i7) {
            return true;
        }
        return false;
    }

    @Override
    public final void d() {
        this.f19846c = 0;
        this.d = 0;
        this.h = false;
        this.f19844a.d();
    }

    public final boolean e() {
        d4.f fVar = this.f19845b;
        fVar.J(0);
        int j3 = fVar.j(24);
        if (j3 != 1) {
            com.google.android.recaptcha.internal.a.o(j3, "Unexpected start code prefix: ", "PesReader");
            this.f19851j = -1;
            return false;
        }
        fVar.L(8);
        int j10 = fVar.j(16);
        fVar.L(5);
        this.f19852k = fVar.i();
        fVar.L(2);
        this.f19848f = fVar.i();
        this.f19849g = fVar.i();
        fVar.L(6);
        int j11 = fVar.j(8);
        this.f19850i = j11;
        if (j10 == 0) {
            this.f19851j = -1;
        } else {
            int i7 = (j10 - 3) - j11;
            this.f19851j = i7;
            if (i7 < 0) {
                h2.a.l("PesReader", "Found negative packet payload size: " + this.f19851j);
                this.f19851j = -1;
            }
        }
        return true;
    }
}

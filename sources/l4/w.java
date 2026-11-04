package l4;

import g2.l0;
public final class w implements g0 {
    public final i f18003a;
    public final c4.f f18004b = new c4.f(new byte[10], 10);
    public int f18005c = 0;
    public int d;
    public l0 f18006e;
    public boolean f18007f;
    public boolean f18008g;
    public boolean h;
    public int f18009i;
    public int f18010j;
    public boolean f18011k;
    public long f18012l;

    public w(i iVar) {
        this.f18003a = iVar;
    }

    @Override
    public final void a() {
        this.f18005c = 0;
        this.d = 0;
        this.h = false;
        this.f18003a.a();
    }

    @Override
    public final void b(l0 l0Var, e3.q qVar, f0 f0Var) {
        this.f18006e = l0Var;
        this.f18003a.f(qVar, f0Var);
    }

    @Override
    public final void c(int i3, g2.y yVar) {
        int i10;
        int i11;
        int i12;
        boolean z10;
        this.f18006e.getClass();
        int i13 = i3 & 1;
        int i14 = -1;
        int i15 = 2;
        i iVar = this.f18003a;
        if (i13 != 0) {
            int i16 = this.f18005c;
            if (i16 != 0 && i16 != 1) {
                if (i16 != 2) {
                    if (i16 == 3) {
                        if (this.f18010j != -1) {
                            g2.a.l("PesReader", "Unexpected start indicator: expected " + this.f18010j + " more bytes");
                        }
                        if (yVar.f11925c == 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        iVar.d(z10);
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    g2.a.l("PesReader", "Unexpected start indicator reading extended header");
                }
            }
            this.f18005c = 1;
            this.d = 0;
        }
        int i17 = i3;
        while (yVar.a() > 0) {
            int i18 = this.f18005c;
            if (i18 != 0) {
                c4.f fVar = this.f18004b;
                if (i18 != 1) {
                    if (i18 != i15) {
                        if (i18 == 3) {
                            int a10 = yVar.a();
                            int i19 = this.f18010j;
                            if (i19 == i14) {
                                i12 = 0;
                            } else {
                                i12 = a10 - i19;
                            }
                            if (i12 > 0) {
                                a10 -= i12;
                                yVar.M(yVar.f11924b + a10);
                            }
                            iVar.c(yVar);
                            int i20 = this.f18010j;
                            if (i20 != i14) {
                                int i21 = i20 - a10;
                                this.f18010j = i21;
                                if (i21 == 0) {
                                    iVar.d(false);
                                    this.f18005c = 1;
                                    this.d = 0;
                                }
                            }
                        } else {
                            throw new IllegalStateException();
                        }
                    } else {
                        if (d(yVar, (byte[]) fVar.f4190b, Math.min(10, this.f18009i)) && d(yVar, null, this.f18009i)) {
                            fVar.J(0);
                            this.f18012l = -9223372036854775807L;
                            if (this.f18007f) {
                                fVar.L(4);
                                fVar.L(1);
                                long j10 = fVar.j(15) << 15;
                                fVar.L(1);
                                long j11 = j10 | (fVar.j(3) << 30) | fVar.j(15);
                                fVar.L(1);
                                if (!this.h && this.f18008g) {
                                    fVar.L(4);
                                    fVar.L(1);
                                    fVar.L(1);
                                    fVar.L(1);
                                    this.f18006e.b((fVar.j(3) << 30) | (fVar.j(15) << 15) | fVar.j(15));
                                    this.h = true;
                                }
                                this.f18012l = this.f18006e.b(j11);
                            }
                            if (this.f18011k) {
                                i11 = 4;
                            } else {
                                i11 = 0;
                            }
                            i17 |= i11;
                            iVar.e(i17, this.f18012l);
                            this.f18005c = 3;
                            this.d = 0;
                        }
                    }
                } else if (d(yVar, (byte[]) fVar.f4190b, 9)) {
                    if (e()) {
                        i10 = 2;
                    } else {
                        i10 = 0;
                    }
                    this.f18005c = i10;
                    this.d = 0;
                }
            } else {
                yVar.O(yVar.a());
            }
            i14 = -1;
            i15 = 2;
        }
    }

    public final boolean d(g2.y yVar, byte[] bArr, int i3) {
        int min = Math.min(yVar.a(), i3 - this.d);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            yVar.O(min);
        } else {
            yVar.k(this.d, min, bArr);
        }
        int i10 = this.d + min;
        this.d = i10;
        if (i10 == i3) {
            return true;
        }
        return false;
    }

    public final boolean e() {
        c4.f fVar = this.f18004b;
        fVar.J(0);
        int j10 = fVar.j(24);
        if (j10 != 1) {
            com.google.android.recaptcha.internal.a.o(j10, "Unexpected start code prefix: ", "PesReader");
            this.f18010j = -1;
            return false;
        }
        fVar.L(8);
        int j11 = fVar.j(16);
        fVar.L(5);
        this.f18011k = fVar.i();
        fVar.L(2);
        this.f18007f = fVar.i();
        this.f18008g = fVar.i();
        fVar.L(6);
        int j12 = fVar.j(8);
        this.f18009i = j12;
        if (j11 == 0) {
            this.f18010j = -1;
        } else {
            int i3 = (j11 - 3) - j12;
            this.f18010j = i3;
            if (i3 < 0) {
                g2.a.l("PesReader", "Found negative packet payload size: " + this.f18010j);
                this.f18010j = -1;
            }
        }
        return true;
    }
}

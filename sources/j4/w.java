package j4;

import com.google.android.gms.internal.vision.e2;
public final class w implements g0 {
    public final i f13986a;
    public final a4.g f13987b = new a4.g(new byte[10], 10);
    public int f13988c = 0;
    public int d;
    public e2.b0 f13989e;
    public boolean f13990f;
    public boolean f13991g;
    public boolean h;
    public int f13992i;
    public int f13993j;
    public boolean f13994k;
    public long f13995l;

    public w(i iVar) {
        this.f13986a = iVar;
    }

    @Override
    public final void a(int i10, e2.v vVar) {
        int i11;
        int i12;
        int i13;
        boolean z10;
        e2.d.h(this.f13989e);
        int i14 = i10 & 1;
        int i15 = -1;
        int i16 = 2;
        i iVar = this.f13986a;
        if (i14 != 0) {
            int i17 = this.f13988c;
            if (i17 != 0 && i17 != 1) {
                if (i17 != 2) {
                    if (i17 == 3) {
                        if (this.f13993j != -1) {
                            e2.a.n("PesReader", "Unexpected start indicator: expected " + this.f13993j + " more bytes");
                        }
                        if (vVar.f8583c == 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        iVar.f(z10);
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    e2.a.n("PesReader", "Unexpected start indicator reading extended header");
                }
            }
            this.f13988c = 1;
            this.d = 0;
        }
        int i18 = i10;
        while (vVar.a() > 0) {
            int i19 = this.f13988c;
            if (i19 != 0) {
                a4.g gVar = this.f13987b;
                if (i19 != 1) {
                    if (i19 != i16) {
                        if (i19 == 3) {
                            int a2 = vVar.a();
                            int i20 = this.f13993j;
                            if (i20 == i15) {
                                i13 = 0;
                            } else {
                                i13 = a2 - i20;
                            }
                            if (i13 > 0) {
                                a2 -= i13;
                                vVar.I(vVar.f8582b + a2);
                            }
                            iVar.b(vVar);
                            int i21 = this.f13993j;
                            if (i21 != i15) {
                                int i22 = i21 - a2;
                                this.f13993j = i22;
                                if (i22 == 0) {
                                    iVar.f(false);
                                    this.f13988c = 1;
                                    this.d = 0;
                                }
                            }
                        } else {
                            throw new IllegalStateException();
                        }
                    } else {
                        if (b(vVar, gVar.f276b, Math.min(10, this.f13992i)) && b(vVar, null, this.f13992i)) {
                            gVar.q(0);
                            this.f13995l = -9223372036854775807L;
                            if (this.f13990f) {
                                gVar.t(4);
                                gVar.t(1);
                                long i23 = gVar.i(15) << 15;
                                gVar.t(1);
                                long i24 = i23 | (gVar.i(3) << 30) | gVar.i(15);
                                gVar.t(1);
                                if (!this.h && this.f13991g) {
                                    gVar.t(4);
                                    gVar.t(1);
                                    gVar.t(1);
                                    gVar.t(1);
                                    this.f13989e.b((gVar.i(3) << 30) | (gVar.i(15) << 15) | gVar.i(15));
                                    this.h = true;
                                }
                                this.f13995l = this.f13989e.b(i24);
                            }
                            if (this.f13994k) {
                                i12 = 4;
                            } else {
                                i12 = 0;
                            }
                            i18 |= i12;
                            iVar.g(i18, this.f13995l);
                            this.f13988c = 3;
                            this.d = 0;
                        }
                    }
                } else if (b(vVar, gVar.f276b, 9)) {
                    if (e()) {
                        i11 = 2;
                    } else {
                        i11 = 0;
                    }
                    this.f13988c = i11;
                    this.d = 0;
                }
            } else {
                vVar.K(vVar.a());
            }
            i15 = -1;
            i16 = 2;
        }
    }

    public final boolean b(e2.v vVar, byte[] bArr, int i10) {
        int min = Math.min(vVar.a(), i10 - this.d);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            vVar.K(min);
        } else {
            vVar.h(this.d, min, bArr);
        }
        int i11 = this.d + min;
        this.d = i11;
        if (i11 == i10) {
            return true;
        }
        return false;
    }

    @Override
    public final void c(e2.b0 b0Var, c3.q qVar, f0 f0Var) {
        this.f13989e = b0Var;
        this.f13986a.e(qVar, f0Var);
    }

    @Override
    public final void d() {
        this.f13988c = 0;
        this.d = 0;
        this.h = false;
        this.f13986a.d();
    }

    public final boolean e() {
        a4.g gVar = this.f13987b;
        gVar.q(0);
        int i10 = gVar.i(24);
        if (i10 != 1) {
            e2.m(i10, "Unexpected start code prefix: ", "PesReader");
            this.f13993j = -1;
            return false;
        }
        gVar.t(8);
        int i11 = gVar.i(16);
        gVar.t(5);
        this.f13994k = gVar.h();
        gVar.t(2);
        this.f13990f = gVar.h();
        this.f13991g = gVar.h();
        gVar.t(6);
        int i12 = gVar.i(8);
        this.f13992i = i12;
        if (i11 == 0) {
            this.f13993j = -1;
        } else {
            int i13 = (i11 - 3) - i12;
            this.f13993j = i13;
            if (i13 < 0) {
                e2.a.n("PesReader", "Found negative packet payload size: " + this.f13993j);
                this.f13993j = -1;
            }
        }
        return true;
    }
}

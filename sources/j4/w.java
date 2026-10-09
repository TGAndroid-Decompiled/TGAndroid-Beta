package j4;

import com.google.android.gms.internal.vision.e2;
public final class w implements g0 {
    public final i f13989a;
    public final a4.g f13990b = new a4.g(new byte[10], 10);
    public int f13991c = 0;
    public int d;
    public e2.b0 f13992e;
    public boolean f13993f;
    public boolean f13994g;
    public boolean h;
    public int f13995i;
    public int f13996j;
    public boolean f13997k;
    public long f13998l;

    public w(i iVar) {
        this.f13989a = iVar;
    }

    @Override
    public final void a(int i10, e2.v vVar) {
        int i11;
        int i12;
        int i13;
        boolean z10;
        e2.d.h(this.f13992e);
        int i14 = i10 & 1;
        int i15 = -1;
        int i16 = 2;
        i iVar = this.f13989a;
        if (i14 != 0) {
            int i17 = this.f13991c;
            if (i17 != 0 && i17 != 1) {
                if (i17 != 2) {
                    if (i17 == 3) {
                        if (this.f13996j != -1) {
                            e2.a.n("PesReader", "Unexpected start indicator: expected " + this.f13996j + " more bytes");
                        }
                        if (vVar.f8586c == 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        iVar.e(z10);
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    e2.a.n("PesReader", "Unexpected start indicator reading extended header");
                }
            }
            this.f13991c = 1;
            this.d = 0;
        }
        int i18 = i10;
        while (vVar.a() > 0) {
            int i19 = this.f13991c;
            if (i19 != 0) {
                a4.g gVar = this.f13990b;
                if (i19 != 1) {
                    if (i19 != i16) {
                        if (i19 == 3) {
                            int a2 = vVar.a();
                            int i20 = this.f13996j;
                            if (i20 == i15) {
                                i13 = 0;
                            } else {
                                i13 = a2 - i20;
                            }
                            if (i13 > 0) {
                                a2 -= i13;
                                vVar.I(vVar.f8585b + a2);
                            }
                            iVar.a(vVar);
                            int i21 = this.f13996j;
                            if (i21 != i15) {
                                int i22 = i21 - a2;
                                this.f13996j = i22;
                                if (i22 == 0) {
                                    iVar.e(false);
                                    this.f13991c = 1;
                                    this.d = 0;
                                }
                            }
                        } else {
                            throw new IllegalStateException();
                        }
                    } else {
                        if (d(vVar, gVar.f276b, Math.min(10, this.f13995i)) && d(vVar, null, this.f13995i)) {
                            gVar.q(0);
                            this.f13998l = -9223372036854775807L;
                            if (this.f13993f) {
                                gVar.t(4);
                                gVar.t(1);
                                long i23 = gVar.i(15) << 15;
                                gVar.t(1);
                                long i24 = i23 | (gVar.i(3) << 30) | gVar.i(15);
                                gVar.t(1);
                                if (!this.h && this.f13994g) {
                                    gVar.t(4);
                                    gVar.t(1);
                                    gVar.t(1);
                                    gVar.t(1);
                                    this.f13992e.b((gVar.i(3) << 30) | (gVar.i(15) << 15) | gVar.i(15));
                                    this.h = true;
                                }
                                this.f13998l = this.f13992e.b(i24);
                            }
                            if (this.f13997k) {
                                i12 = 4;
                            } else {
                                i12 = 0;
                            }
                            i18 |= i12;
                            iVar.f(i18, this.f13998l);
                            this.f13991c = 3;
                            this.d = 0;
                        }
                    }
                } else if (d(vVar, gVar.f276b, 9)) {
                    if (e()) {
                        i11 = 2;
                    } else {
                        i11 = 0;
                    }
                    this.f13991c = i11;
                    this.d = 0;
                }
            } else {
                vVar.K(vVar.a());
            }
            i15 = -1;
            i16 = 2;
        }
    }

    @Override
    public final void b(e2.b0 b0Var, c3.q qVar, f0 f0Var) {
        this.f13992e = b0Var;
        this.f13989a.d(qVar, f0Var);
    }

    @Override
    public final void c() {
        this.f13991c = 0;
        this.d = 0;
        this.h = false;
        this.f13989a.c();
    }

    public final boolean d(e2.v vVar, byte[] bArr, int i10) {
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

    public final boolean e() {
        a4.g gVar = this.f13990b;
        gVar.q(0);
        int i10 = gVar.i(24);
        if (i10 != 1) {
            e2.m(i10, "Unexpected start code prefix: ", "PesReader");
            this.f13996j = -1;
            return false;
        }
        gVar.t(8);
        int i11 = gVar.i(16);
        gVar.t(5);
        this.f13997k = gVar.h();
        gVar.t(2);
        this.f13993f = gVar.h();
        this.f13994g = gVar.h();
        gVar.t(6);
        int i12 = gVar.i(8);
        this.f13995i = i12;
        if (i11 == 0) {
            this.f13996j = -1;
        } else {
            int i13 = (i11 - 3) - i12;
            this.f13996j = i13;
            if (i13 < 0) {
                e2.a.n("PesReader", "Found negative packet payload size: " + this.f13996j);
                this.f13996j = -1;
            }
        }
        return true;
    }
}

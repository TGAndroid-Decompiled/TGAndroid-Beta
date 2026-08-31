package b4;
public final class w implements i0 {
    public final i f1655a;
    public final h5.v f1656b = new h5.v(new byte[10], 10);
    public int f1657c = 0;
    public int d;
    public h5.c0 f1658e;
    public boolean f1659f;
    public boolean f1660g;
    public boolean h;
    public int f1661i;
    public int f1662j;
    public boolean f1663k;
    public long f1664l;

    public w(i iVar) {
        this.f1655a = iVar;
    }

    @Override
    public final void a(int i10, h5.w wVar) {
        int i11;
        int i12;
        int i13;
        h5.a.j(this.f1658e);
        int i14 = i10 & 1;
        i iVar = this.f1655a;
        int i15 = 2;
        int i16 = 0;
        if (i14 != 0) {
            int i17 = this.f1657c;
            if (i17 != 0 && i17 != 1) {
                if (i17 != 2) {
                    if (i17 == 3) {
                        if (this.f1662j != -1) {
                            h5.a.K("PesReader", "Unexpected start indicator: expected " + this.f1662j + " more bytes");
                        }
                        iVar.d();
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    h5.a.K("PesReader", "Unexpected start indicator reading extended header");
                }
            }
            this.f1657c = 1;
            this.d = 0;
        }
        int i18 = i10;
        while (wVar.a() > 0) {
            int i19 = this.f1657c;
            if (i19 != 0) {
                h5.v vVar = this.f1656b;
                if (i19 != 1) {
                    if (i19 != i15) {
                        if (i19 == 3) {
                            int a2 = wVar.a();
                            int i20 = this.f1662j;
                            if (i20 == -1) {
                                i13 = 0;
                            } else {
                                i13 = a2 - i20;
                            }
                            if (i13 > 0) {
                                a2 -= i13;
                                wVar.E(wVar.f7309b + a2);
                            }
                            iVar.a(wVar);
                            int i21 = this.f1662j;
                            if (i21 != -1) {
                                int i22 = i21 - a2;
                                this.f1662j = i22;
                                if (i22 == 0) {
                                    iVar.d();
                                    this.f1657c = 1;
                                    this.d = i16;
                                }
                            }
                        } else {
                            throw new IllegalStateException();
                        }
                    } else {
                        if (d(wVar, vVar.f7303b, Math.min(10, this.f1661i)) && d(wVar, null, this.f1661i)) {
                            vVar.p(i16);
                            this.f1664l = -9223372036854775807L;
                            if (this.f1659f) {
                                vVar.s(4);
                                vVar.s(1);
                                long i23 = vVar.i(15) << 15;
                                vVar.s(1);
                                long i24 = i23 | (vVar.i(3) << 30) | vVar.i(15);
                                vVar.s(1);
                                if (!this.h && this.f1660g) {
                                    vVar.s(4);
                                    vVar.s(1);
                                    vVar.s(1);
                                    vVar.s(1);
                                    this.f1658e.b((vVar.i(3) << 30) | (vVar.i(15) << 15) | vVar.i(15));
                                    this.h = true;
                                }
                                this.f1664l = this.f1658e.b(i24);
                            }
                            if (this.f1663k) {
                                i12 = 4;
                            } else {
                                i12 = 0;
                            }
                            i18 |= i12;
                            iVar.e(i18, this.f1664l);
                            this.f1657c = 3;
                            this.d = 0;
                        }
                    }
                } else if (d(wVar, vVar.f7303b, 9)) {
                    vVar.p(0);
                    int i25 = vVar.i(24);
                    if (i25 != 1) {
                        e2.c.q(i25, "Unexpected start code prefix: ", "PesReader");
                        this.f1662j = -1;
                        i11 = 0;
                    } else {
                        vVar.s(8);
                        int i26 = vVar.i(16);
                        vVar.s(5);
                        this.f1663k = vVar.h();
                        vVar.s(2);
                        this.f1659f = vVar.h();
                        this.f1660g = vVar.h();
                        vVar.s(6);
                        int i27 = vVar.i(8);
                        this.f1661i = i27;
                        if (i26 == 0) {
                            this.f1662j = -1;
                        } else {
                            int i28 = (i26 - 3) - i27;
                            this.f1662j = i28;
                            if (i28 < 0) {
                                h5.a.K("PesReader", "Found negative packet payload size: " + this.f1662j);
                                this.f1662j = -1;
                            }
                        }
                        i11 = 2;
                    }
                    this.f1657c = i11;
                    this.d = 0;
                }
            } else {
                wVar.G(wVar.a());
            }
            i15 = 2;
            i16 = 0;
        }
    }

    @Override
    public final void b() {
        this.f1657c = 0;
        this.d = 0;
        this.h = false;
        this.f1655a.b();
    }

    @Override
    public final void c(h5.c0 c0Var, r3.m mVar, h0 h0Var) {
        this.f1658e = c0Var;
        this.f1655a.c(mVar, h0Var);
    }

    public final boolean d(h5.w wVar, byte[] bArr, int i10) {
        int min = Math.min(wVar.a(), i10 - this.d);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            wVar.G(min);
        } else {
            wVar.e(this.d, min, bArr);
        }
        int i11 = this.d + min;
        this.d = i11;
        if (i11 == i10) {
            return true;
        }
        return false;
    }
}

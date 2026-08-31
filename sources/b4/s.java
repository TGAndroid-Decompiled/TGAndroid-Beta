package b4;
public final class s implements i {
    public final d0 f1609a;
    public String f1610b;
    public r3.v f1611c;
    public r d;
    public boolean f1612e;
    public long f1618l;
    public final boolean[] f1613f = new boolean[3];
    public final v f1614g = new v(32);
    public final v h = new v(33);
    public final v f1615i = new v(34);
    public final v f1616j = new v(39);
    public final v f1617k = new v(40);
    public long f1619m = -9223372036854775807L;
    public final h5.w f1620n = new h5.w();

    public s(d0 d0Var) {
        this.f1609a = d0Var;
    }

    @Override
    public final void a(h5.w r34) {
        throw new UnsupportedOperationException("Method not decompiled: b4.s.a(h5.w):void");
    }

    @Override
    public final void b() {
        this.f1618l = 0L;
        this.f1619m = -9223372036854775807L;
        h5.a.m(this.f1613f);
        this.f1614g.f();
        this.h.f();
        this.f1615i.f();
        this.f1616j.f();
        this.f1617k.f();
        r rVar = this.d;
        if (rVar != null) {
            rVar.f1602f = false;
            rVar.f1603g = false;
            rVar.h = false;
            rVar.f1604i = false;
            rVar.f1605j = false;
        }
    }

    @Override
    public final void c(r3.m mVar, h0 h0Var) {
        h0Var.a();
        h0Var.b();
        this.f1610b = h0Var.f1514e;
        h0Var.b();
        r3.v i22 = mVar.i2(h0Var.d, 2);
        this.f1611c = i22;
        this.d = new r(i22);
        this.f1609a.b(mVar, h0Var);
    }

    @Override
    public final void e(int i10, long j10) {
        if (j10 != -9223372036854775807L) {
            this.f1619m = j10;
        }
    }

    public final void f(int i10, int i11, byte[] bArr) {
        boolean z4;
        r rVar = this.d;
        if (rVar.f1602f) {
            int i12 = rVar.d;
            int i13 = (i10 + 2) - i12;
            if (i13 < i11) {
                if ((bArr[i13] & 128) != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                rVar.f1603g = z4;
                rVar.f1602f = false;
            } else {
                rVar.d = (i11 - i10) + i12;
            }
        }
        if (!this.f1612e) {
            this.f1614g.a(i10, i11, bArr);
            this.h.a(i10, i11, bArr);
            this.f1615i.a(i10, i11, bArr);
        }
        this.f1616j.a(i10, i11, bArr);
        this.f1617k.a(i10, i11, bArr);
    }

    @Override
    public final void d() {
    }
}

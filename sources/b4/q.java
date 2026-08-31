package b4;
public final class q implements i {
    public final d0 f1585a;
    public final boolean f1586b;
    public final boolean f1587c;
    public long f1590g;
    public String f1591i;
    public r3.v f1592j;
    public p f1593k;
    public boolean f1594l;
    public boolean f1596n;
    public final boolean[] h = new boolean[3];
    public final v d = new v(7);
    public final v f1588e = new v(8);
    public final v f1589f = new v(6);
    public long f1595m = -9223372036854775807L;
    public final h5.w f1597o = new h5.w();

    public q(d0 d0Var, boolean z4, boolean z10) {
        this.f1585a = d0Var;
        this.f1586b = z4;
        this.f1587c = z10;
    }

    @Override
    public final void a(h5.w r32) {
        throw new UnsupportedOperationException("Method not decompiled: b4.q.a(h5.w):void");
    }

    @Override
    public final void b() {
        this.f1590g = 0L;
        this.f1596n = false;
        this.f1595m = -9223372036854775807L;
        h5.a.m(this.h);
        this.d.f();
        this.f1588e.f();
        this.f1589f.f();
        p pVar = this.f1593k;
        if (pVar != null) {
            pVar.f1577k = false;
            pVar.f1581o = false;
            o oVar = pVar.f1580n;
            oVar.f1556b = false;
            oVar.f1555a = false;
        }
    }

    @Override
    public final void c(r3.m mVar, h0 h0Var) {
        h0Var.a();
        h0Var.b();
        this.f1591i = h0Var.f1514e;
        h0Var.b();
        r3.v i22 = mVar.i2(h0Var.d, 2);
        this.f1592j = i22;
        this.f1593k = new p(i22, this.f1586b, this.f1587c);
        this.f1585a.b(mVar, h0Var);
    }

    @Override
    public final void e(int i10, long j10) {
        boolean z4;
        if (j10 != -9223372036854775807L) {
            this.f1595m = j10;
        }
        boolean z10 = this.f1596n;
        if ((i10 & 2) != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f1596n = z4 | z10;
    }

    public final void f(int r17, int r18, byte[] r19) {
        throw new UnsupportedOperationException("Method not decompiled: b4.q.f(int, int, byte[]):void");
    }

    @Override
    public final void d() {
    }
}

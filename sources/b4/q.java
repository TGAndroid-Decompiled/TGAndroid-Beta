package b4;
public final class q implements i {
    public final d0 f1478a;
    public final boolean f1479b;
    public final boolean f1480c;
    public long f1482g;
    public String f1483i;
    public r3.v f1484j;
    public p f1485k;
    public boolean f1486l;
    public boolean f1488n;
    public final boolean[] h = new boolean[3];
    public final v d = new v(7);
    public final v e = new v(8);
    public final v f1481f = new v(6);
    public long f1487m = -9223372036854775807L;
    public final h5.w f1489o = new h5.w();

    public q(d0 d0Var, boolean z4, boolean z10) {
        this.f1478a = d0Var;
        this.f1479b = z4;
        this.f1480c = z10;
    }

    @Override
    public final void a(h5.w r32) {
        throw new UnsupportedOperationException("Method not decompiled: b4.q.a(h5.w):void");
    }

    @Override
    public final void b() {
        this.f1482g = 0L;
        this.f1488n = false;
        this.f1487m = -9223372036854775807L;
        h5.a.m(this.h);
        this.d.f();
        this.e.f();
        this.f1481f.f();
        p pVar = this.f1485k;
        if (pVar != null) {
            pVar.f1470k = false;
            pVar.f1474o = false;
            o oVar = pVar.f1473n;
            oVar.f1451b = false;
            oVar.f1450a = false;
        }
    }

    @Override
    public final void c(r3.m mVar, h0 h0Var) {
        h0Var.a();
        h0Var.b();
        this.f1483i = h0Var.e;
        h0Var.b();
        r3.v d22 = mVar.d2(h0Var.d, 2);
        this.f1484j = d22;
        this.f1485k = new p(d22, this.f1479b, this.f1480c);
        this.f1478a.b(mVar, h0Var);
    }

    @Override
    public final void e(int i10, long j10) {
        boolean z4;
        if (j10 != -9223372036854775807L) {
            this.f1487m = j10;
        }
        boolean z10 = this.f1488n;
        if ((i10 & 2) != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f1488n = z4 | z10;
    }

    public final void f(int r17, int r18, byte[] r19) {
        throw new UnsupportedOperationException("Method not decompiled: b4.q.f(int, int, byte[]):void");
    }

    @Override
    public final void d() {
    }
}

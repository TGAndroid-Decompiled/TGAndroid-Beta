package b4;
public final class q implements i {
    public final d0 f1467a;
    public final boolean f1468b;
    public final boolean f1469c;
    public long f1471g;
    public String f1472i;
    public r3.v f1473j;
    public p f1474k;
    public boolean f1475l;
    public boolean f1477n;
    public final boolean[] h = new boolean[3];
    public final v d = new v(7);
    public final v e = new v(8);
    public final v f1470f = new v(6);
    public long f1476m = -9223372036854775807L;
    public final h5.w f1478o = new h5.w();

    public q(d0 d0Var, boolean z4, boolean z10) {
        this.f1467a = d0Var;
        this.f1468b = z4;
        this.f1469c = z10;
    }

    @Override
    public final void a(h5.w r32) {
        throw new UnsupportedOperationException("Method not decompiled: b4.q.a(h5.w):void");
    }

    @Override
    public final void b() {
        this.f1471g = 0L;
        this.f1477n = false;
        this.f1476m = -9223372036854775807L;
        h5.a.m(this.h);
        this.d.f();
        this.e.f();
        this.f1470f.f();
        p pVar = this.f1474k;
        if (pVar != null) {
            pVar.f1459k = false;
            pVar.f1463o = false;
            o oVar = pVar.f1462n;
            oVar.f1440b = false;
            oVar.f1439a = false;
        }
    }

    @Override
    public final void c(r3.m mVar, h0 h0Var) {
        h0Var.a();
        h0Var.b();
        this.f1472i = h0Var.e;
        h0Var.b();
        r3.v c22 = mVar.c2(h0Var.d, 2);
        this.f1473j = c22;
        this.f1474k = new p(c22, this.f1468b, this.f1469c);
        this.f1467a.b(mVar, h0Var);
    }

    @Override
    public final void e(int i10, long j10) {
        boolean z4;
        if (j10 != -9223372036854775807L) {
            this.f1476m = j10;
        }
        boolean z10 = this.f1477n;
        if ((i10 & 2) != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f1477n = z4 | z10;
    }

    public final void f(int r17, int r18, byte[] r19) {
        throw new UnsupportedOperationException("Method not decompiled: b4.q.f(int, int, byte[]):void");
    }

    @Override
    public final void d() {
    }
}

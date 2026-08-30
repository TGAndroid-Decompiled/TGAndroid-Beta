package b4;
public final class k implements i {
    public static final double[] f1407q = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    public String f1408a;
    public r3.v f1409b;
    public final d0 f1410c;
    public final h5.w d;
    public final v e;
    public final boolean[] f1411f = new boolean[4];
    public final j f1412g;
    public long h;
    public boolean f1413i;
    public boolean f1414j;
    public long f1415k;
    public long f1416l;
    public long f1417m;
    public long f1418n;
    public boolean f1419o;
    public boolean f1420p;

    public k(d0 d0Var) {
        this.f1410c = d0Var;
        ?? obj = new Object();
        obj.d = new byte[128];
        this.f1412g = obj;
        if (d0Var != null) {
            this.e = new v(178);
            this.d = new h5.w();
        } else {
            this.e = null;
            this.d = null;
        }
        this.f1416l = -9223372036854775807L;
        this.f1418n = -9223372036854775807L;
    }

    @Override
    public final void a(h5.w r23) {
        throw new UnsupportedOperationException("Method not decompiled: b4.k.a(h5.w):void");
    }

    @Override
    public final void b() {
        h5.a.m(this.f1411f);
        j jVar = this.f1412g;
        jVar.f1404a = false;
        jVar.f1405b = 0;
        jVar.f1406c = 0;
        v vVar = this.e;
        if (vVar != null) {
            vVar.f();
        }
        this.h = 0L;
        this.f1413i = false;
        this.f1416l = -9223372036854775807L;
        this.f1418n = -9223372036854775807L;
    }

    @Override
    public final void c(r3.m mVar, h0 h0Var) {
        h0Var.a();
        h0Var.b();
        this.f1408a = h0Var.e;
        h0Var.b();
        this.f1409b = mVar.c2(h0Var.d, 2);
        d0 d0Var = this.f1410c;
        if (d0Var != null) {
            d0Var.b(mVar, h0Var);
        }
    }

    @Override
    public final void e(int i10, long j10) {
        this.f1416l = j10;
    }

    @Override
    public final void d() {
    }
}

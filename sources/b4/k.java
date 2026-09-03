package b4;
public final class k implements i {
    public static final double[] f1418q = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    public String f1419a;
    public r3.v f1420b;
    public final d0 f1421c;
    public final h5.w d;
    public final v e;
    public final boolean[] f1422f = new boolean[4];
    public final j f1423g;
    public long h;
    public boolean f1424i;
    public boolean f1425j;
    public long f1426k;
    public long f1427l;
    public long f1428m;
    public long f1429n;
    public boolean f1430o;
    public boolean f1431p;

    public k(d0 d0Var) {
        this.f1421c = d0Var;
        ?? obj = new Object();
        obj.d = new byte[128];
        this.f1423g = obj;
        if (d0Var != null) {
            this.e = new v(178);
            this.d = new h5.w();
        } else {
            this.e = null;
            this.d = null;
        }
        this.f1427l = -9223372036854775807L;
        this.f1429n = -9223372036854775807L;
    }

    @Override
    public final void a(h5.w r23) {
        throw new UnsupportedOperationException("Method not decompiled: b4.k.a(h5.w):void");
    }

    @Override
    public final void b() {
        h5.a.m(this.f1422f);
        j jVar = this.f1423g;
        jVar.f1415a = false;
        jVar.f1416b = 0;
        jVar.f1417c = 0;
        v vVar = this.e;
        if (vVar != null) {
            vVar.f();
        }
        this.h = 0L;
        this.f1424i = false;
        this.f1427l = -9223372036854775807L;
        this.f1429n = -9223372036854775807L;
    }

    @Override
    public final void c(r3.m mVar, h0 h0Var) {
        h0Var.a();
        h0Var.b();
        this.f1419a = h0Var.e;
        h0Var.b();
        this.f1420b = mVar.d2(h0Var.d, 2);
        d0 d0Var = this.f1421c;
        if (d0Var != null) {
            d0Var.b(mVar, h0Var);
        }
    }

    @Override
    public final void e(int i10, long j10) {
        this.f1427l = j10;
    }

    @Override
    public final void d() {
    }
}

package b4;
public final class k implements i {
    public static final double[] f1519q = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    public String f1520a;
    public r3.v f1521b;
    public final d0 f1522c;
    public final h5.w d;
    public final v f1523e;
    public final boolean[] f1524f = new boolean[4];
    public final j f1525g;
    public long h;
    public boolean f1526i;
    public boolean f1527j;
    public long f1528k;
    public long f1529l;
    public long f1530m;
    public long f1531n;
    public boolean f1532o;
    public boolean f1533p;

    public k(d0 d0Var) {
        this.f1522c = d0Var;
        ?? obj = new Object();
        obj.d = new byte[128];
        this.f1525g = obj;
        if (d0Var != null) {
            this.f1523e = new v(178);
            this.d = new h5.w();
        } else {
            this.f1523e = null;
            this.d = null;
        }
        this.f1529l = -9223372036854775807L;
        this.f1531n = -9223372036854775807L;
    }

    @Override
    public final void a(h5.w r23) {
        throw new UnsupportedOperationException("Method not decompiled: b4.k.a(h5.w):void");
    }

    @Override
    public final void b() {
        h5.a.m(this.f1524f);
        j jVar = this.f1525g;
        jVar.f1516a = false;
        jVar.f1517b = 0;
        jVar.f1518c = 0;
        v vVar = this.f1523e;
        if (vVar != null) {
            vVar.f();
        }
        this.h = 0L;
        this.f1526i = false;
        this.f1529l = -9223372036854775807L;
        this.f1531n = -9223372036854775807L;
    }

    @Override
    public final void c(r3.m mVar, h0 h0Var) {
        h0Var.a();
        h0Var.b();
        this.f1520a = h0Var.f1514e;
        h0Var.b();
        this.f1521b = mVar.i2(h0Var.d, 2);
        d0 d0Var = this.f1522c;
        if (d0Var != null) {
            d0Var.b(mVar, h0Var);
        }
    }

    @Override
    public final void e(int i10, long j10) {
        this.f1529l = j10;
    }

    @Override
    public final void d() {
    }
}

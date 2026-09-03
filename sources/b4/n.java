package b4;
public final class n implements i {
    public static final float[] f1441l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    public final d0 f1442a;
    public final h5.w f1443b;
    public final boolean[] f1444c = new boolean[4];
    public final l d;
    public final v e;
    public m f1445f;
    public long f1446g;
    public String h;
    public r3.v f1447i;
    public boolean f1448j;
    public long f1449k;

    public n(d0 d0Var) {
        this.f1442a = d0Var;
        ?? obj = new Object();
        obj.e = new byte[128];
        this.d = obj;
        this.f1449k = -9223372036854775807L;
        this.e = new v(178);
        this.f1443b = new h5.w();
    }

    @Override
    public final void a(h5.w r26) {
        throw new UnsupportedOperationException("Method not decompiled: b4.n.a(h5.w):void");
    }

    @Override
    public final void b() {
        h5.a.m(this.f1444c);
        l lVar = this.d;
        lVar.f1433a = false;
        lVar.f1435c = 0;
        lVar.f1434b = 0;
        m mVar = this.f1445f;
        if (mVar != null) {
            mVar.f1437b = false;
            mVar.f1438c = false;
            mVar.d = false;
            mVar.e = -1;
        }
        v vVar = this.e;
        if (vVar != null) {
            vVar.f();
        }
        this.f1446g = 0L;
        this.f1449k = -9223372036854775807L;
    }

    @Override
    public final void c(r3.m mVar, h0 h0Var) {
        h0Var.a();
        h0Var.b();
        this.h = h0Var.e;
        h0Var.b();
        r3.v d22 = mVar.d2(h0Var.d, 2);
        this.f1447i = d22;
        this.f1445f = new m(d22);
        this.f1442a.b(mVar, h0Var);
    }

    @Override
    public final void e(int i10, long j10) {
        if (j10 != -9223372036854775807L) {
            this.f1449k = j10;
        }
    }

    @Override
    public final void d() {
    }
}

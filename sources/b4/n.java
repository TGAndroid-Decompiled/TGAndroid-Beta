package b4;
public final class n implements i {
    public static final float[] f1545l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    public final d0 f1546a;
    public final h5.w f1547b;
    public final boolean[] f1548c = new boolean[4];
    public final l d;
    public final v f1549e;
    public m f1550f;
    public long f1551g;
    public String h;
    public r3.v f1552i;
    public boolean f1553j;
    public long f1554k;

    public n(d0 d0Var) {
        this.f1546a = d0Var;
        ?? obj = new Object();
        obj.f1538e = new byte[128];
        this.d = obj;
        this.f1554k = -9223372036854775807L;
        this.f1549e = new v(178);
        this.f1547b = new h5.w();
    }

    @Override
    public final void a(h5.w r26) {
        throw new UnsupportedOperationException("Method not decompiled: b4.n.a(h5.w):void");
    }

    @Override
    public final void b() {
        h5.a.m(this.f1548c);
        l lVar = this.d;
        lVar.f1535a = false;
        lVar.f1537c = 0;
        lVar.f1536b = 0;
        m mVar = this.f1550f;
        if (mVar != null) {
            mVar.f1540b = false;
            mVar.f1541c = false;
            mVar.d = false;
            mVar.f1542e = -1;
        }
        v vVar = this.f1549e;
        if (vVar != null) {
            vVar.f();
        }
        this.f1551g = 0L;
        this.f1554k = -9223372036854775807L;
    }

    @Override
    public final void c(r3.m mVar, h0 h0Var) {
        h0Var.a();
        h0Var.b();
        this.h = h0Var.f1514e;
        h0Var.b();
        r3.v i22 = mVar.i2(h0Var.d, 2);
        this.f1552i = i22;
        this.f1550f = new m(i22);
        this.f1546a.b(mVar, h0Var);
    }

    @Override
    public final void e(int i10, long j10) {
        if (j10 != -9223372036854775807L) {
            this.f1554k = j10;
        }
    }

    @Override
    public final void d() {
    }
}

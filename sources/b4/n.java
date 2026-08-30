package b4;
public final class n implements i {
    public static final float[] f1430l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    public final d0 f1431a;
    public final h5.w f1432b;
    public final boolean[] f1433c = new boolean[4];
    public final l d;
    public final v e;
    public m f1434f;
    public long f1435g;
    public String h;
    public r3.v f1436i;
    public boolean f1437j;
    public long f1438k;

    public n(d0 d0Var) {
        this.f1431a = d0Var;
        ?? obj = new Object();
        obj.e = new byte[128];
        this.d = obj;
        this.f1438k = -9223372036854775807L;
        this.e = new v(178);
        this.f1432b = new h5.w();
    }

    @Override
    public final void a(h5.w r26) {
        throw new UnsupportedOperationException("Method not decompiled: b4.n.a(h5.w):void");
    }

    @Override
    public final void b() {
        h5.a.m(this.f1433c);
        l lVar = this.d;
        lVar.f1422a = false;
        lVar.f1424c = 0;
        lVar.f1423b = 0;
        m mVar = this.f1434f;
        if (mVar != null) {
            mVar.f1426b = false;
            mVar.f1427c = false;
            mVar.d = false;
            mVar.e = -1;
        }
        v vVar = this.e;
        if (vVar != null) {
            vVar.f();
        }
        this.f1435g = 0L;
        this.f1438k = -9223372036854775807L;
    }

    @Override
    public final void c(r3.m mVar, h0 h0Var) {
        h0Var.a();
        h0Var.b();
        this.h = h0Var.e;
        h0Var.b();
        r3.v c22 = mVar.c2(h0Var.d, 2);
        this.f1436i = c22;
        this.f1434f = new m(c22);
        this.f1431a.b(mVar, h0Var);
    }

    @Override
    public final void e(int i10, long j10) {
        if (j10 != -9223372036854775807L) {
            this.f1438k = j10;
        }
    }

    @Override
    public final void d() {
    }
}

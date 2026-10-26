package k2;
public final class t implements Runnable {
    public final int f16273a;
    public final int f16274b;
    public final long f16275c;
    public final long d;
    public final Object e;

    public t(Object obj, int i10, long j10, long j11, int i11) {
        this.f16273a = i11;
        this.e = obj;
        this.f16274b = i10;
        this.f16275c = j10;
        this.d = j11;
    }

    @Override
    public final void run() {
        u2.g0 g0Var;
        int i10 = this.f16273a;
        Object obj = this.e;
        switch (i10) {
            case 0:
                String str = e2.n0.f9692a;
                j2.e eVar = ((i2.d0) ((v) ((rf.b) obj).f47336c)).f13509a.f13614s;
                j2.a p10 = eVar.p();
                eVar.q(p10, 1011, new j2.d(p10, this.f16274b, this.f16275c, this.d));
                return;
            default:
                j2.e eVar2 = ((y2.b) obj).f51931b;
                aa.m0 m0Var = eVar2.d;
                if (((f9.i0) m0Var.f1151b).isEmpty()) {
                    g0Var = null;
                } else {
                    g0Var = (u2.g0) f9.o.m((f9.i0) m0Var.f1151b);
                }
                j2.a n10 = eVar2.n(g0Var);
                eVar2.q(n10, 1006, new j2.c(n10, this.f16274b, this.f16275c, this.d));
                return;
        }
    }
}

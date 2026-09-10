package k2;
public final class i implements Runnable {
    public final int f12149a;
    public final int f12150b;
    public final long f12151c;
    public final long d;
    public final Object e;

    public i(Object obj, int i10, long j3, long j10, int i11) {
        this.f12149a = i11;
        this.e = obj;
        this.f12150b = i10;
        this.f12151c = j3;
        this.d = j10;
    }

    @Override
    public final void run() {
        u2.g0 g0Var;
        int i10 = this.f12149a;
        Object obj = this.e;
        switch (i10) {
            case 0:
                String str = e2.d0.f7188a;
                j2.e eVar = ((i2.b0) ((j) ((of.b) obj).f14295c)).f10108a.f10157s;
                j2.a p5 = eVar.p();
                eVar.q(p5, 1011, new i0.b(p5, this.f12150b, this.f12151c, this.d));
                return;
            default:
                j2.e eVar2 = ((y2.b) obj).f46408b;
                com.google.firebase.messaging.n nVar = eVar2.d;
                if (((e9.i0) nVar.f6104b).isEmpty()) {
                    g0Var = null;
                } else {
                    g0Var = (u2.g0) e9.q.l((e9.i0) nVar.f6104b);
                }
                j2.a n10 = eVar2.n(g0Var);
                eVar2.q(n10, 1006, new j2.c(n10, this.f12150b, this.f12151c, this.d));
                return;
        }
    }
}

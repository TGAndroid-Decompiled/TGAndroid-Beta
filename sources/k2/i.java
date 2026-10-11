package k2;
public final class i implements Runnable {
    public final int f14484a;
    public final int f14485b;
    public final long f14486c;
    public final long d;
    public final Object f14487e;

    public i(Object obj, int i10, long j3, long j10, int i11) {
        this.f14484a = i11;
        this.f14487e = obj;
        this.f14485b = i10;
        this.f14486c = j3;
        this.d = j10;
    }

    @Override
    public final void run() {
        u2.f0 f0Var;
        int i10 = this.f14484a;
        Object obj = this.f14487e;
        switch (i10) {
            case 0:
                String str = e2.d0.f8531a;
                j2.f fVar = ((i2.c0) ((j) ((n4.x) obj).f16695c)).f11619a.f11682s;
                j2.a p5 = fVar.p();
                fVar.q(p5, 1011, new j2.c(p5, this.f14485b, this.f14486c, this.d));
                return;
            default:
                j2.f fVar2 = ((y2.b) obj).f51780b;
                com.google.firebase.messaging.n nVar = fVar2.d;
                if (((e9.i0) nVar.f7954b).isEmpty()) {
                    f0Var = null;
                } else {
                    f0Var = (u2.f0) e9.q.l((e9.i0) nVar.f7954b);
                }
                j2.a n10 = fVar2.n(f0Var);
                fVar2.q(n10, 1006, new j2.d(n10, this.f14485b, this.f14486c, this.d));
                return;
        }
    }
}

package k2;
public final class i implements Runnable {
    public final int f14485a;
    public final int f14486b;
    public final long f14487c;
    public final long d;
    public final Object f14488e;

    public i(Object obj, int i10, long j3, long j10, int i11) {
        this.f14485a = i11;
        this.f14488e = obj;
        this.f14486b = i10;
        this.f14487c = j3;
        this.d = j10;
    }

    @Override
    public final void run() {
        u2.f0 f0Var;
        int i10 = this.f14485a;
        Object obj = this.f14488e;
        switch (i10) {
            case 0:
                String str = e2.d0.f8532a;
                j2.f fVar = ((i2.c0) ((j) ((n4.x) obj).f16617c)).f11620a.f11683s;
                j2.a p5 = fVar.p();
                fVar.q(p5, 1011, new j2.c(p5, this.f14486b, this.f14487c, this.d));
                return;
            default:
                j2.f fVar2 = ((y2.b) obj).f51703b;
                com.google.firebase.messaging.n nVar = fVar2.d;
                if (((e9.i0) nVar.f7955b).isEmpty()) {
                    f0Var = null;
                } else {
                    f0Var = (u2.f0) e9.q.l((e9.i0) nVar.f7955b);
                }
                j2.a n10 = fVar2.n(f0Var);
                fVar2.q(n10, 1006, new j2.d(n10, this.f14486b, this.f14487c, this.d));
                return;
        }
    }
}

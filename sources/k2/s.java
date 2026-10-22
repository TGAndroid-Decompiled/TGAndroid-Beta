package k2;
public final class s implements Runnable {
    public final int f14790a;
    public final int f14791b;
    public final long f14792c;
    public final long d;
    public final Object e;

    public s(Object obj, int i10, long j10, long j11, int i11) {
        this.f14790a = i11;
        this.e = obj;
        this.f14791b = i10;
        this.f14792c = j10;
        this.d = j11;
    }

    @Override
    public final void run() {
        u2.g0 g0Var;
        int i10 = this.f14790a;
        Object obj = this.e;
        switch (i10) {
            case 0:
                String str = e2.m0.f8252a;
                j2.f fVar = ((i2.c0) ((u) ((qf.b) obj).f44451c)).f12325a.f12413s;
                j2.a p5 = fVar.p();
                fVar.q(p5, 1011, new j2.e(p5, this.f14791b, this.f14792c, this.d));
                return;
            default:
                j2.f fVar2 = ((y2.b) obj).f49901b;
                com.google.firebase.messaging.l lVar = fVar2.d;
                if (((e9.n0) lVar.f7646b).isEmpty()) {
                    g0Var = null;
                } else {
                    g0Var = (u2.g0) e9.s.m((e9.n0) lVar.f7646b);
                }
                j2.a n10 = fVar2.n(g0Var);
                fVar2.q(n10, 1006, new j2.d(n10, this.f14791b, this.f14792c, this.d));
                return;
        }
    }
}

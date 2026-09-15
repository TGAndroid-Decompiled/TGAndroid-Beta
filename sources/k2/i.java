package k2;
public final class i implements Runnable {
    public final int f13295a;
    public final int f13296b;
    public final long f13297c;
    public final long d;
    public final Object e;

    public i(Object obj, int i10, long j3, long j10, int i11) {
        this.f13295a = i11;
        this.e = obj;
        this.f13296b = i10;
        this.f13297c = j3;
        this.d = j10;
    }

    @Override
    public final void run() {
        u2.f0 f0Var;
        int i10 = this.f13295a;
        Object obj = this.e;
        switch (i10) {
            case 0:
                String str = e2.d0.f7883a;
                j2.f fVar = ((i2.b0) ((j) ((n4.y) obj).f14995c)).f10621a.f10671s;
                j2.a p5 = fVar.p();
                fVar.q(p5, 1011, new j2.c(p5, this.f13296b, this.f13297c, this.d));
                return;
            default:
                j2.f fVar2 = ((y2.b) obj).f46259b;
                com.google.firebase.messaging.n nVar = fVar2.d;
                if (((e9.i0) nVar.f7332b).isEmpty()) {
                    f0Var = null;
                } else {
                    f0Var = (u2.f0) e9.q.l((e9.i0) nVar.f7332b);
                }
                j2.a n10 = fVar2.n(f0Var);
                fVar2.q(n10, 1006, new j2.d(n10, this.f13296b, this.f13297c, this.d));
                return;
        }
    }
}

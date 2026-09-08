package k2;
public final class i implements Runnable {
    public final int f14620a;
    public final int f14621b;
    public final long f14622c;
    public final long d;
    public final Object f14623e;

    public i(Object obj, int i10, long j3, long j10, int i11) {
        this.f14620a = i11;
        this.f14623e = obj;
        this.f14621b = i10;
        this.f14622c = j3;
        this.d = j10;
    }

    @Override
    public final void run() {
        u2.f0 f0Var;
        int i10 = this.f14620a;
        Object obj = this.f14623e;
        switch (i10) {
            case 0:
                String str = e2.d0.f8765a;
                j2.f fVar = ((i2.c0) ((j) ((n4.y) obj).f16524c)).f11497a.f11559s;
                j2.a p5 = fVar.p();
                fVar.q(p5, 1011, new j2.c(p5, this.f14621b, this.f14622c, this.d));
                return;
            default:
                j2.f fVar2 = ((y2.b) obj).f49507b;
                com.google.firebase.messaging.n nVar = fVar2.d;
                if (((e9.i0) nVar.f6402b).isEmpty()) {
                    f0Var = null;
                } else {
                    f0Var = (u2.f0) e9.q.l((e9.i0) nVar.f6402b);
                }
                j2.a n10 = fVar2.n(f0Var);
                fVar2.q(n10, 1006, new j2.d(n10, this.f14621b, this.f14622c, this.d));
                return;
        }
    }
}

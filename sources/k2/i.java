package k2;
public final class i implements Runnable {
    public final int f14594a;
    public final int f14595b;
    public final long f14596c;
    public final long d;
    public final Object f14597e;

    public i(Object obj, int i10, long j3, long j10, int i11) {
        this.f14594a = i11;
        this.f14597e = obj;
        this.f14595b = i10;
        this.f14596c = j3;
        this.d = j10;
    }

    @Override
    public final void run() {
        u2.f0 f0Var;
        int i10 = this.f14594a;
        Object obj = this.f14597e;
        switch (i10) {
            case 0:
                String str = e2.d0.f8737a;
                j2.f fVar = ((i2.c0) ((j) ((n4.y) obj).f16497c)).f11471a.f11533s;
                j2.a p5 = fVar.p();
                fVar.q(p5, 1011, new j2.c(p5, this.f14595b, this.f14596c, this.d));
                return;
            default:
                j2.f fVar2 = ((y2.b) obj).f49478b;
                com.google.firebase.messaging.n nVar = fVar2.d;
                if (((e9.i0) nVar.f6375b).isEmpty()) {
                    f0Var = null;
                } else {
                    f0Var = (u2.f0) e9.q.l((e9.i0) nVar.f6375b);
                }
                j2.a n10 = fVar2.n(f0Var);
                fVar2.q(n10, 1006, new j2.d(n10, this.f14595b, this.f14596c, this.d));
                return;
        }
    }
}

package k2;
public final class j implements Runnable {
    public final int f14456a;
    public final int f14457b;
    public final long f14458c;
    public final long d;
    public final Object f14459e;

    public j(Object obj, int i10, long j3, long j10, int i11) {
        this.f14456a = i11;
        this.f14459e = obj;
        this.f14457b = i10;
        this.f14458c = j3;
        this.d = j10;
    }

    @Override
    public final void run() {
        u2.f0 f0Var;
        int i10 = this.f14456a;
        Object obj = this.f14459e;
        switch (i10) {
            case 0:
                String str = e2.d0.f8537a;
                j2.f fVar = ((i2.c0) ((k) ((n4.y) obj).f16641c)).f11569a.f11632s;
                j2.a p5 = fVar.p();
                fVar.q(p5, 1011, new j2.c(p5, this.f14457b, this.f14458c, this.d));
                return;
            default:
                j2.f fVar2 = ((y2.b) obj).f50363b;
                com.google.firebase.messaging.n nVar = fVar2.d;
                if (((e9.i0) nVar.f7905b).isEmpty()) {
                    f0Var = null;
                } else {
                    f0Var = (u2.f0) e9.q.l((e9.i0) nVar.f7905b);
                }
                j2.a n10 = fVar2.n(f0Var);
                fVar2.q(n10, 1006, new j2.d(n10, this.f14457b, this.f14458c, this.d));
                return;
        }
    }
}

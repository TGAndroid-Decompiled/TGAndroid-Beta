package k2;
public final class s implements Runnable {
    public final int f14792a;
    public final int f14793b;
    public final long f14794c;
    public final long d;
    public final Object e;

    public s(Object obj, int i10, long j10, long j11, int i11) {
        this.f14792a = i11;
        this.e = obj;
        this.f14793b = i10;
        this.f14794c = j10;
        this.d = j11;
    }

    @Override
    public final void run() {
        u2.f0 f0Var;
        int i10 = this.f14792a;
        Object obj = this.e;
        switch (i10) {
            case 0:
                String str = e2.m0.f8255a;
                j2.f fVar = ((i2.b0) ((u) ((qf.b) obj).f44486c)).f12324a.f12412s;
                j2.a p5 = fVar.p();
                fVar.q(p5, 1011, new j2.e(p5, this.f14793b, this.f14794c, this.d));
                return;
            default:
                j2.f fVar2 = ((y2.b) obj).f49939b;
                com.google.firebase.messaging.l lVar = fVar2.d;
                if (((e9.n0) lVar.f7649b).isEmpty()) {
                    f0Var = null;
                } else {
                    f0Var = (u2.f0) e9.s.m((e9.n0) lVar.f7649b);
                }
                j2.a n10 = fVar2.n(f0Var);
                fVar2.q(n10, 1006, new j2.d(n10, this.f14793b, this.f14794c, this.d));
                return;
        }
    }
}

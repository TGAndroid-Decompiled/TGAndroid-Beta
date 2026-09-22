package k2;
public final class i implements Runnable {
    public final int f13297a;
    public final int f13298b;
    public final long f13299c;
    public final long d;
    public final Object e;

    public i(Object obj, int i10, long j3, long j10, int i11) {
        this.f13297a = i11;
        this.e = obj;
        this.f13298b = i10;
        this.f13299c = j3;
        this.d = j10;
    }

    @Override
    public final void run() {
        u2.f0 f0Var;
        int i10 = this.f13297a;
        Object obj = this.e;
        switch (i10) {
            case 0:
                String str = e2.d0.f7885a;
                j2.f fVar = ((i2.b0) ((j) ((n4.y) obj).f14993c)).f10623a.f10673s;
                j2.a p5 = fVar.p();
                fVar.q(p5, 1011, new j2.c(p5, this.f13298b, this.f13299c, this.d));
                return;
            default:
                j2.f fVar2 = ((y2.b) obj).f46255b;
                com.google.firebase.messaging.n nVar = fVar2.d;
                if (((e9.i0) nVar.f7334b).isEmpty()) {
                    f0Var = null;
                } else {
                    f0Var = (u2.f0) e9.q.l((e9.i0) nVar.f7334b);
                }
                j2.a n10 = fVar2.n(f0Var);
                fVar2.q(n10, 1006, new j2.d(n10, this.f13298b, this.f13299c, this.d));
                return;
        }
    }
}

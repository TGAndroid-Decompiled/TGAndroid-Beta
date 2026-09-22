package k2;
public final class j implements Runnable {
    public final int f13311a;
    public final int f13312b;
    public final long f13313c;
    public final long d;
    public final Object e;

    public j(Object obj, int i10, long j3, long j10, int i11) {
        this.f13311a = i11;
        this.e = obj;
        this.f13312b = i10;
        this.f13313c = j3;
        this.d = j10;
    }

    @Override
    public final void run() {
        u2.f0 f0Var;
        int i10 = this.f13311a;
        Object obj = this.e;
        switch (i10) {
            case 0:
                String str = e2.d0.f7887a;
                j2.f fVar = ((i2.b0) ((k) ((n4.y) obj).f15231b)).f10625a.f10675s;
                j2.a p5 = fVar.p();
                fVar.q(p5, 1011, new j2.c(p5, this.f13312b, this.f13313c, this.d));
                return;
            default:
                j2.f fVar2 = ((y2.b) obj).f46582b;
                com.google.firebase.messaging.n nVar = fVar2.d;
                if (((e9.i0) nVar.f7329b).isEmpty()) {
                    f0Var = null;
                } else {
                    f0Var = (u2.f0) e9.q.l((e9.i0) nVar.f7329b);
                }
                j2.a n10 = fVar2.n(f0Var);
                fVar2.q(n10, 1006, new j2.d(n10, this.f13312b, this.f13313c, this.d));
                return;
        }
    }
}

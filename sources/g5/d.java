package g5;
public final class d implements Runnable {
    public final int f6366a;
    public final int f6367b;
    public final long f6368c;
    public final long d;
    public final Object e;

    public d(Object obj, int i10, long j10, long j11, int i11) {
        this.f6366a = i11;
        this.e = obj;
        this.f6367b = i10;
        this.f6368c = j10;
        this.d = j11;
    }

    @Override
    public final void run() {
        o4.v vVar;
        int i10 = this.f6366a;
        Object obj = this.e;
        switch (i10) {
            case 0:
                k3.f fVar = ((e) obj).f6370b;
                a9.a aVar = fVar.d;
                if (((s8.v) aVar.f144b).isEmpty()) {
                    vVar = null;
                } else {
                    vVar = (o4.v) s8.l.h((s8.v) aVar.f144b);
                }
                k3.a n10 = fVar.n(vVar);
                fVar.q(n10, 1006, new k3.d(n10, this.f6367b, this.f6368c, this.d));
                return;
            default:
                int i11 = h5.d0.f6937a;
                k3.f fVar2 = ((j3.c0) ((l3.q) ((f7.b) obj).f6013c)).f8441a.f8561q;
                k3.a p10 = fVar2.p();
                fVar2.q(p10, 1011, new j3.q0(p10, this.f6367b, this.f6368c, this.d));
                return;
        }
    }
}

package a3;
public final class j0 implements Runnable {
    public final int f128a = 0;
    public final n4.s f129b;
    public final long f130c;
    public final int d;

    public j0(n4.s sVar, int i10, long j10) {
        this.f129b = sVar;
        this.d = i10;
        this.f130c = j10;
    }

    @Override
    public final void run() {
        int i10 = this.f128a;
        int i11 = this.d;
        long j10 = this.f130c;
        n4.s sVar = this.f129b;
        switch (i10) {
            case 0:
                String str = e2.n0.f9692a;
                j2.e eVar = ((i2.d0) ((m0) sVar.f18697c)).f13509a.f13614s;
                j2.a n10 = eVar.n((u2.g0) eVar.d.e);
                eVar.q(n10, 1018, new ig.g(n10, i11, j10));
                return;
            default:
                String str2 = e2.n0.f9692a;
                j2.e eVar2 = ((i2.d0) ((m0) sVar.f18697c)).f13509a.f13614s;
                j2.a n11 = eVar2.n((u2.g0) eVar2.d.e);
                eVar2.q(n11, 1021, new ig.g(n11, j10, i11));
                return;
        }
    }

    public j0(n4.s sVar, long j10, int i10) {
        this.f129b = sVar;
        this.f130c = j10;
        this.d = i10;
    }
}

package a3;
public final class i0 implements Runnable {
    public final int f125a = 0;
    public final of.b f126b;
    public final long f127c;
    public final int d;

    public i0(of.b bVar, int i10, long j3) {
        this.f126b = bVar;
        this.d = i10;
        this.f127c = j3;
    }

    @Override
    public final void run() {
        int i10 = this.f125a;
        int i11 = this.d;
        long j3 = this.f127c;
        of.b bVar = this.f126b;
        switch (i10) {
            case 0:
                String str = e2.d0.f7888a;
                j2.f fVar = ((i2.b0) ((l0) bVar.f15683c)).f10625a.f10675s;
                j2.a n10 = fVar.n((u2.f0) fVar.d.e);
                fVar.q(n10, 1018, new j2.c(n10, i11, j3));
                return;
            default:
                String str2 = e2.d0.f7888a;
                j2.f fVar2 = ((i2.b0) ((l0) bVar.f15683c)).f10625a.f10675s;
                j2.a n11 = fVar2.n((u2.f0) fVar2.d.e);
                fVar2.q(n11, 1021, new j2.c(n11, j3, i11));
                return;
        }
    }

    public i0(of.b bVar, long j3, int i10) {
        this.f126b = bVar;
        this.f127c = j3;
        this.d = i10;
    }
}

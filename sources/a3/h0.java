package a3;
public final class h0 implements Runnable {
    public final int f111a = 0;
    public final pf.b f112b;
    public final long f113c;
    public final int d;

    public h0(pf.b bVar, int i10, long j3) {
        this.f112b = bVar;
        this.d = i10;
        this.f113c = j3;
    }

    @Override
    public final void run() {
        int i10 = this.f111a;
        int i11 = this.d;
        long j3 = this.f113c;
        pf.b bVar = this.f112b;
        switch (i10) {
            case 0:
                String str = e2.d0.f8737a;
                j2.f fVar = ((i2.c0) bVar.f44047c).f11471a.f11533s;
                j2.a n10 = fVar.n((u2.f0) fVar.d.f6377e);
                fVar.q(n10, 1018, new j2.c(n10, i11, j3));
                return;
            default:
                String str2 = e2.d0.f8737a;
                j2.f fVar2 = ((i2.c0) bVar.f44047c).f11471a.f11533s;
                j2.a n11 = fVar2.n((u2.f0) fVar2.d.f6377e);
                fVar2.q(n11, 1021, new j2.c(n11, j3, i11));
                return;
        }
    }

    public h0(pf.b bVar, long j3, int i10) {
        this.f112b = bVar;
        this.f113c = j3;
        this.d = i10;
    }
}

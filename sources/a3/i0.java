package a3;
public final class i0 implements Runnable {
    public final int f137a = 0;
    public final pf.b f138b;
    public final long f139c;
    public final int d;

    public i0(pf.b bVar, int i10, long j3) {
        this.f138b = bVar;
        this.d = i10;
        this.f139c = j3;
    }

    @Override
    public final void run() {
        int i10 = this.f137a;
        int i11 = this.d;
        long j3 = this.f139c;
        pf.b bVar = this.f138b;
        switch (i10) {
            case 0:
                String str = e2.d0.f8532a;
                j2.f fVar = ((i2.c0) ((l0) bVar.f45557c)).f11620a.f11683s;
                j2.a n10 = fVar.n((u2.f0) fVar.d.f7957e);
                fVar.q(n10, 1018, new j2.c(n10, i11, j3));
                return;
            default:
                String str2 = e2.d0.f8532a;
                j2.f fVar2 = ((i2.c0) ((l0) bVar.f45557c)).f11620a.f11683s;
                j2.a n11 = fVar2.n((u2.f0) fVar2.d.f7957e);
                fVar2.q(n11, 1021, new j2.c(n11, j3, i11));
                return;
        }
    }

    public i0(pf.b bVar, long j3, int i10) {
        this.f138b = bVar;
        this.f139c = j3;
        this.d = i10;
    }
}

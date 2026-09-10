package a3;
public final class i0 implements Runnable {
    public final int f123a = 0;
    public final of.b f124b;
    public final long f125c;
    public final int d;

    public i0(of.b bVar, int i10, long j3) {
        this.f124b = bVar;
        this.d = i10;
        this.f125c = j3;
    }

    @Override
    public final void run() {
        int i10 = this.f123a;
        int i11 = this.d;
        long j3 = this.f125c;
        of.b bVar = this.f124b;
        switch (i10) {
            case 0:
                String str = e2.d0.f7188a;
                j2.e eVar = ((i2.b0) ((l0) bVar.f14295c)).f10108a.f10157s;
                j2.a n10 = eVar.n((u2.g0) eVar.d.e);
                eVar.q(n10, 1018, new j2.d(n10, i11, j3));
                return;
            default:
                String str2 = e2.d0.f7188a;
                j2.e eVar2 = ((i2.b0) ((l0) bVar.f14295c)).f10108a.f10157s;
                j2.a n11 = eVar2.n((u2.g0) eVar2.d.e);
                eVar2.q(n11, 1021, new j2.d(n11, j3, i11));
                return;
        }
    }

    public i0(of.b bVar, long j3, int i10) {
        this.f124b = bVar;
        this.f125c = j3;
        this.d = i10;
    }
}

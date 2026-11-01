package a3;
public final class j0 implements Runnable {
    public final int f128a = 0;
    public final hf.b f129b;
    public final long f130c;
    public final int d;

    public j0(hf.b bVar, int i10, long j10) {
        this.f129b = bVar;
        this.d = i10;
        this.f130c = j10;
    }

    @Override
    public final void run() {
        int i10 = this.f128a;
        int i11 = this.d;
        long j10 = this.f130c;
        hf.b bVar = this.f129b;
        switch (i10) {
            case 0:
                String str = e2.l0.f6165a;
                j2.g gVar = ((i2.c0) ((m0) bVar.f7659c)).f7822a.f7928s;
                j2.a S = gVar.S((u2.g0) gVar.d.e);
                gVar.V(S, 1018, new j2.c(S, i11, j10));
                return;
            default:
                String str2 = e2.l0.f6165a;
                j2.g gVar2 = ((i2.c0) ((m0) bVar.f7659c)).f7822a.f7928s;
                j2.a S2 = gVar2.S((u2.g0) gVar2.d.e);
                gVar2.V(S2, 1021, new j2.c(S2, j10, i11));
                return;
        }
    }

    public j0(hf.b bVar, long j10, int i10) {
        this.f129b = bVar;
        this.f130c = j10;
        this.d = i10;
    }
}

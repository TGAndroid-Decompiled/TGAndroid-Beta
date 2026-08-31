package l3;
public final class o implements Runnable {
    public final int f11568a;
    public final f7.b f11569b;
    public final Exception f11570c;

    public o(f7.b bVar, Exception exc, int i10) {
        this.f11568a = i10;
        this.f11569b = bVar;
        this.f11570c = exc;
    }

    @Override
    public final void run() {
        int i10 = this.f11568a;
        Exception exc = this.f11570c;
        f7.b bVar = this.f11569b;
        switch (i10) {
            case 0:
                int i11 = h5.d0.f7237a;
                k3.f fVar = ((j3.c0) ((q) bVar.f6121c)).f9000a.f9128q;
                k3.a p10 = fVar.p();
                fVar.q(p10, 1029, new k3.e(p10, exc, 5));
                return;
            default:
                int i12 = h5.d0.f7237a;
                k3.f fVar2 = ((j3.c0) ((q) bVar.f6121c)).f9000a.f9128q;
                k3.a p11 = fVar2.p();
                fVar2.q(p11, 1014, new k3.c(p11, exc, 16));
                return;
        }
    }
}

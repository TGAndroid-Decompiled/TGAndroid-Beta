package l3;
public final class o implements Runnable {
    public final int f11202a;
    public final f7.b f11203b;
    public final Exception f11204c;

    public o(f7.b bVar, Exception exc, int i10) {
        this.f11202a = i10;
        this.f11203b = bVar;
        this.f11204c = exc;
    }

    @Override
    public final void run() {
        int i10 = this.f11202a;
        Exception exc = this.f11204c;
        f7.b bVar = this.f11203b;
        switch (i10) {
            case 0:
                int i11 = h5.d0.f6937a;
                k3.f fVar = ((j3.c0) ((q) bVar.f6013c)).f8441a.f8561q;
                k3.a p10 = fVar.p();
                fVar.q(p10, 1029, new k3.e(p10, exc, 5));
                return;
            default:
                int i12 = h5.d0.f6937a;
                k3.f fVar2 = ((j3.c0) ((q) bVar.f6013c)).f8441a.f8561q;
                k3.a p11 = fVar2.p();
                fVar2.q(p11, 1014, new k3.c(p11, exc, 16));
                return;
        }
    }
}

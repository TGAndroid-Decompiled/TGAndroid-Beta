package l3;
public final class o implements Runnable {
    public final int f11312a;
    public final f7.b f11313b;
    public final Exception f11314c;

    public o(f7.b bVar, Exception exc, int i10) {
        this.f11312a = i10;
        this.f11313b = bVar;
        this.f11314c = exc;
    }

    @Override
    public final void run() {
        int i10 = this.f11312a;
        Exception exc = this.f11314c;
        f7.b bVar = this.f11313b;
        switch (i10) {
            case 0:
                int i11 = h5.d0.f6924a;
                k3.f fVar = ((j3.c0) ((q) bVar.f6002c)).f8423a.f8543q;
                k3.a p10 = fVar.p();
                fVar.q(p10, 1029, new k3.e(p10, exc, 6));
                return;
            default:
                int i12 = h5.d0.f6924a;
                k3.f fVar2 = ((j3.c0) ((q) bVar.f6002c)).f8423a.f8543q;
                k3.a p11 = fVar2.p();
                fVar2.q(p11, 1014, new k3.c(p11, exc, 17));
                return;
        }
    }
}

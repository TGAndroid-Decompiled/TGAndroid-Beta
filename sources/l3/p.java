package l3;
public final class p implements Runnable {
    public final int f11210a;
    public final f7.b f11211b;
    public final n3.f f11212c;

    public p(f7.b bVar, n3.f fVar, int i10) {
        this.f11210a = i10;
        this.f11211b = bVar;
        this.f11212c = fVar;
    }

    @Override
    public final void run() {
        switch (this.f11210a) {
            case 0:
                f7.b bVar = this.f11211b;
                n3.f fVar = this.f11212c;
                int i10 = h5.d0.f6937a;
                k3.f fVar2 = ((j3.c0) ((q) bVar.f6013c)).f8441a.f8561q;
                k3.a p10 = fVar2.p();
                fVar2.q(p10, 1007, new k3.c(p10, fVar, 20));
                return;
            default:
                f7.b bVar2 = this.f11211b;
                n3.f fVar3 = this.f11212c;
                synchronized (fVar3) {
                }
                int i11 = h5.d0.f6937a;
                k3.f fVar4 = ((j3.c0) ((q) bVar2.f6013c)).f8441a.f8561q;
                k3.a n10 = fVar4.n((o4.v) fVar4.d.e);
                fVar4.q(n10, 1013, new k3.c(n10, fVar3, 6));
                return;
        }
    }
}

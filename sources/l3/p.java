package l3;
public final class p implements Runnable {
    public final int f11320a;
    public final f7.b f11321b;
    public final n3.f f11322c;

    public p(f7.b bVar, n3.f fVar, int i10) {
        this.f11320a = i10;
        this.f11321b = bVar;
        this.f11322c = fVar;
    }

    @Override
    public final void run() {
        switch (this.f11320a) {
            case 0:
                f7.b bVar = this.f11321b;
                n3.f fVar = this.f11322c;
                int i10 = h5.d0.f6924a;
                k3.f fVar2 = ((j3.c0) ((q) bVar.f6002c)).f8423a.f8543q;
                k3.a p10 = fVar2.p();
                fVar2.q(p10, 1007, new k3.c(p10, fVar, 21));
                return;
            default:
                f7.b bVar2 = this.f11321b;
                n3.f fVar3 = this.f11322c;
                synchronized (fVar3) {
                }
                int i11 = h5.d0.f6924a;
                k3.f fVar4 = ((j3.c0) ((q) bVar2.f6002c)).f8423a.f8543q;
                k3.a n10 = fVar4.n((o4.v) fVar4.d.e);
                fVar4.q(n10, 1013, new k3.c(n10, fVar3, 7));
                return;
        }
    }
}

package l3;
public final class p implements Runnable {
    public final int f11577a;
    public final f7.b f11578b;
    public final n3.f f11579c;

    public p(f7.b bVar, n3.f fVar, int i10) {
        this.f11577a = i10;
        this.f11578b = bVar;
        this.f11579c = fVar;
    }

    @Override
    public final void run() {
        switch (this.f11577a) {
            case 0:
                f7.b bVar = this.f11578b;
                n3.f fVar = this.f11579c;
                int i10 = h5.d0.f7237a;
                k3.f fVar2 = ((j3.c0) ((q) bVar.f6121c)).f9000a.f9128q;
                k3.a p10 = fVar2.p();
                fVar2.q(p10, 1007, new k3.c(p10, fVar, 20));
                return;
            default:
                f7.b bVar2 = this.f11578b;
                n3.f fVar3 = this.f11579c;
                synchronized (fVar3) {
                }
                int i11 = h5.d0.f7237a;
                k3.f fVar4 = ((j3.c0) ((q) bVar2.f6121c)).f9000a.f9128q;
                k3.a n10 = fVar4.n((o4.v) fVar4.d.f158e);
                fVar4.q(n10, 1013, new k3.c(n10, fVar3, 6));
                return;
        }
    }
}

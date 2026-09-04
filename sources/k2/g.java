package k2;
public final class g implements Runnable {
    public final int f14574a;
    public final n4.y f14575b;
    public final i2.h f14576c;

    public g(n4.y yVar, i2.h hVar, int i10) {
        this.f14574a = i10;
        this.f14575b = yVar;
        this.f14576c = hVar;
    }

    @Override
    public final void run() {
        switch (this.f14574a) {
            case 0:
                n4.y yVar = this.f14575b;
                i2.h hVar = this.f14576c;
                synchronized (hVar) {
                }
                String str = e2.d0.f8737a;
                j2.f fVar = ((i2.c0) ((j) yVar.f16497c)).f11471a.f11533s;
                j2.a n10 = fVar.n((u2.f0) fVar.d.f6377e);
                fVar.q(n10, 1013, new j2.c(n10, hVar, 11));
                return;
            default:
                n4.y yVar2 = this.f14575b;
                i2.h hVar2 = this.f14576c;
                String str2 = e2.d0.f8737a;
                j2.f fVar2 = ((i2.c0) ((j) yVar2.f16497c)).f11471a.f11533s;
                j2.a p5 = fVar2.p();
                fVar2.q(p5, 1007, new j2.c(p5, hVar2, 4));
                return;
        }
    }
}

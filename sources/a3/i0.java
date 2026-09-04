package a3;
public final class i0 implements Runnable {
    public final int f117a;
    public final pf.b f118b;
    public final i2.h f119c;

    public i0(pf.b bVar, i2.h hVar, int i10) {
        this.f117a = i10;
        this.f118b = bVar;
        this.f119c = hVar;
    }

    @Override
    public final void run() {
        switch (this.f117a) {
            case 0:
                pf.b bVar = this.f118b;
                i2.h hVar = this.f119c;
                String str = e2.d0.f8737a;
                j2.f fVar = ((i2.c0) bVar.f44047c).f11471a.f11533s;
                j2.a p5 = fVar.p();
                fVar.q(p5, 1015, new j2.c(p5, hVar, 20));
                return;
            default:
                pf.b bVar2 = this.f118b;
                i2.h hVar2 = this.f119c;
                synchronized (hVar2) {
                }
                String str2 = e2.d0.f8737a;
                i2.f0 f0Var = ((i2.c0) bVar2.f44047c).f11471a;
                j2.f fVar2 = f0Var.f11533s;
                j2.a n10 = fVar2.n((u2.f0) fVar2.d.f6377e);
                fVar2.q(n10, 1020, new fi.f(n10, hVar2, 17));
                f0Var.Q = null;
                return;
        }
    }
}

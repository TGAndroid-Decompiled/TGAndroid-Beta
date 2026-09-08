package a3;
public final class j0 implements Runnable {
    public final int f141a;
    public final pf.b f142b;
    public final i2.h f143c;

    public j0(pf.b bVar, i2.h hVar, int i10) {
        this.f141a = i10;
        this.f142b = bVar;
        this.f143c = hVar;
    }

    @Override
    public final void run() {
        switch (this.f141a) {
            case 0:
                pf.b bVar = this.f142b;
                i2.h hVar = this.f143c;
                String str = e2.d0.f8765a;
                j2.f fVar = ((i2.c0) ((l0) bVar.f44074c)).f11497a.f11559s;
                j2.a p5 = fVar.p();
                fVar.q(p5, 1015, new j2.c(p5, hVar, 20));
                return;
            default:
                pf.b bVar2 = this.f142b;
                i2.h hVar2 = this.f143c;
                synchronized (hVar2) {
                }
                String str2 = e2.d0.f8765a;
                i2.f0 f0Var = ((i2.c0) ((l0) bVar2.f44074c)).f11497a;
                j2.f fVar2 = f0Var.f11559s;
                j2.a n10 = fVar2.n((u2.f0) fVar2.d.f6404e);
                fVar2.q(n10, 1020, new fi.f(n10, hVar2, 17));
                f0Var.Q = null;
                return;
        }
    }
}

package a3;

import hi.y1;
public final class j0 implements Runnable {
    public final int f129a;
    public final of.b f130b;
    public final i2.g f131c;

    public j0(of.b bVar, i2.g gVar, int i10) {
        this.f129a = i10;
        this.f130b = bVar;
        this.f131c = gVar;
    }

    @Override
    public final void run() {
        switch (this.f129a) {
            case 0:
                of.b bVar = this.f130b;
                i2.g gVar = this.f131c;
                String str = e2.d0.f7188a;
                j2.e eVar = ((i2.b0) ((l0) bVar.f14295c)).f10108a.f10157s;
                j2.a p5 = eVar.p();
                eVar.q(p5, 1015, new j2.d(p5, gVar, 14));
                return;
            default:
                of.b bVar2 = this.f130b;
                i2.g gVar2 = this.f131c;
                synchronized (gVar2) {
                }
                String str2 = e2.d0.f7188a;
                i2.e0 e0Var = ((i2.b0) ((l0) bVar2.f14295c)).f10108a;
                j2.e eVar2 = e0Var.f10157s;
                j2.a n10 = eVar2.n((u2.g0) eVar2.d.e);
                eVar2.q(n10, 1020, new y1(n10, gVar2, 16));
                e0Var.Q = null;
                return;
        }
    }
}

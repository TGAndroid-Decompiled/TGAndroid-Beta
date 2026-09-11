package k2;
public final class f implements Runnable {
    public final int f14571a;
    public final n4.y f14572b;
    public final Exception f14573c;

    public f(n4.y yVar, Exception exc, int i10) {
        this.f14571a = i10;
        this.f14572b = yVar;
        this.f14573c = exc;
    }

    @Override
    public final void run() {
        int i10 = this.f14571a;
        Exception exc = this.f14573c;
        n4.y yVar = this.f14572b;
        switch (i10) {
            case 0:
                String str = e2.d0.f8737a;
                j2.f fVar = ((i2.c0) ((j) yVar.f16497c)).f11471a.f11533s;
                j2.a p5 = fVar.p();
                fVar.q(p5, 1029, new i0.b(p5, exc, 29));
                return;
            default:
                String str2 = e2.d0.f8737a;
                j2.f fVar2 = ((i2.c0) ((j) yVar.f16497c)).f11471a.f11533s;
                j2.a p10 = fVar2.p();
                fVar2.q(p10, 1014, new j2.c(p10, exc, 23));
                return;
        }
    }
}

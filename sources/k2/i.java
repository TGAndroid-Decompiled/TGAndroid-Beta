package k2;
public final class i implements Runnable {
    public final int f14441a;
    public final n4.y f14442b;
    public final l f14443c;

    public i(n4.y yVar, l lVar, int i10) {
        this.f14441a = i10;
        this.f14442b = yVar;
        this.f14443c = lVar;
    }

    @Override
    public final void run() {
        int i10 = this.f14441a;
        l lVar = this.f14443c;
        n4.y yVar = this.f14442b;
        switch (i10) {
            case 0:
                String str = e2.d0.f8537a;
                j2.f fVar = ((i2.c0) ((k) yVar.f16640c)).f11569a.f11632s;
                j2.a p5 = fVar.p();
                fVar.q(p5, 1032, new j2.e(p5, lVar, 2));
                return;
            default:
                String str2 = e2.d0.f8537a;
                j2.f fVar2 = ((i2.c0) ((k) yVar.f16640c)).f11569a.f11632s;
                j2.a p10 = fVar2.p();
                fVar2.q(p10, 1031, new j2.c(p10, lVar, 19));
                return;
        }
    }
}

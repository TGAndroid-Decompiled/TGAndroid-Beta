package k2;
public final class f implements Runnable {
    public final int f14597a;
    public final n4.y f14598b;
    public final Exception f14599c;

    public f(n4.y yVar, Exception exc, int i10) {
        this.f14597a = i10;
        this.f14598b = yVar;
        this.f14599c = exc;
    }

    @Override
    public final void run() {
        int i10 = this.f14597a;
        Exception exc = this.f14599c;
        n4.y yVar = this.f14598b;
        switch (i10) {
            case 0:
                String str = e2.d0.f8765a;
                j2.f fVar = ((i2.c0) ((j) yVar.f16524c)).f11497a.f11559s;
                j2.a p5 = fVar.p();
                fVar.q(p5, 1029, new i0.b(p5, exc, 29));
                return;
            default:
                String str2 = e2.d0.f8765a;
                j2.f fVar2 = ((i2.c0) ((j) yVar.f16524c)).f11497a.f11559s;
                j2.a p10 = fVar2.p();
                fVar2.q(p10, 1014, new j2.c(p10, exc, 23));
                return;
        }
    }
}

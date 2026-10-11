package k2;

import hg.o1;
public final class f implements Runnable {
    public final int f14462a;
    public final n4.x f14463b;
    public final Exception f14464c;

    public f(n4.x xVar, Exception exc, int i10) {
        this.f14462a = i10;
        this.f14463b = xVar;
        this.f14464c = exc;
    }

    @Override
    public final void run() {
        int i10 = this.f14462a;
        Exception exc = this.f14464c;
        n4.x xVar = this.f14463b;
        switch (i10) {
            case 0:
                String str = e2.d0.f8531a;
                j2.f fVar = ((i2.c0) ((j) xVar.f16695c)).f11619a.f11682s;
                j2.a p5 = fVar.p();
                fVar.q(p5, 1029, new o1(p5, exc, 29));
                return;
            default:
                String str2 = e2.d0.f8531a;
                j2.f fVar2 = ((i2.c0) ((j) xVar.f16695c)).f11619a.f11682s;
                j2.a p10 = fVar2.p();
                fVar2.q(p10, 1014, new j2.c(p10, exc, 23));
                return;
        }
    }
}

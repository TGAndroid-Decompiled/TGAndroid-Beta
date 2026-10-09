package k2;

import hg.o1;
public final class f implements Runnable {
    public final int f14463a;
    public final n4.x f14464b;
    public final Exception f14465c;

    public f(n4.x xVar, Exception exc, int i10) {
        this.f14463a = i10;
        this.f14464b = xVar;
        this.f14465c = exc;
    }

    @Override
    public final void run() {
        int i10 = this.f14463a;
        Exception exc = this.f14465c;
        n4.x xVar = this.f14464b;
        switch (i10) {
            case 0:
                String str = e2.d0.f8532a;
                j2.f fVar = ((i2.c0) ((j) xVar.f16613c)).f11620a.f11683s;
                j2.a p5 = fVar.p();
                fVar.q(p5, 1029, new o1(p5, exc, 29));
                return;
            default:
                String str2 = e2.d0.f8532a;
                j2.f fVar2 = ((i2.c0) ((j) xVar.f16613c)).f11620a.f11683s;
                j2.a p10 = fVar2.p();
                fVar2.q(p10, 1014, new j2.c(p10, exc, 23));
                return;
        }
    }
}

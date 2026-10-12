package k2;

import hg.o1;
public final class f implements Runnable {
    public final int f14459a;
    public final n4.y f14460b;
    public final Exception f14461c;

    public f(n4.y yVar, Exception exc, int i10) {
        this.f14459a = i10;
        this.f14460b = yVar;
        this.f14461c = exc;
    }

    @Override
    public final void run() {
        int i10 = this.f14459a;
        Exception exc = this.f14461c;
        n4.y yVar = this.f14460b;
        switch (i10) {
            case 0:
                String str = e2.d0.f8529a;
                j2.f fVar = ((i2.c0) ((j) yVar.f16363c)).f11618a.f11681s;
                j2.a p5 = fVar.p();
                fVar.q(p5, 1029, new o1(p5, exc, 29));
                return;
            default:
                String str2 = e2.d0.f8529a;
                j2.f fVar2 = ((i2.c0) ((j) yVar.f16363c)).f11618a.f11681s;
                j2.a p10 = fVar2.p();
                fVar2.q(p10, 1014, new j2.c(p10, exc, 23));
                return;
        }
    }
}

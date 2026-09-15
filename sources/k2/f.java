package k2;
public final class f implements Runnable {
    public final int f13244a;
    public final n4.y f13245b;
    public final Exception f13246c;

    public f(n4.y yVar, Exception exc, int i10) {
        this.f13244a = i10;
        this.f13245b = yVar;
        this.f13246c = exc;
    }

    @Override
    public final void run() {
        int i10 = this.f13244a;
        Exception exc = this.f13246c;
        n4.y yVar = this.f13245b;
        switch (i10) {
            case 0:
                String str = e2.d0.f7883a;
                j2.f fVar = ((i2.b0) ((j) yVar.f14995c)).f10621a.f10671s;
                j2.a p5 = fVar.p();
                fVar.q(p5, 1029, new j2.c(p5, exc, 1));
                return;
            default:
                String str2 = e2.d0.f7883a;
                j2.f fVar2 = ((i2.b0) ((j) yVar.f14995c)).f10621a.f10671s;
                j2.a p10 = fVar2.p();
                fVar2.q(p10, 1014, new j2.c(p10, exc, 25));
                return;
        }
    }
}

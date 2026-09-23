package k2;
public final class f implements Runnable {
    public final int f13236a;
    public final n4.y f13237b;
    public final Exception f13238c;

    public f(n4.y yVar, Exception exc, int i10) {
        this.f13236a = i10;
        this.f13237b = yVar;
        this.f13238c = exc;
    }

    @Override
    public final void run() {
        int i10 = this.f13236a;
        Exception exc = this.f13238c;
        n4.y yVar = this.f13237b;
        switch (i10) {
            case 0:
                String str = e2.d0.f7871a;
                j2.f fVar = ((i2.c0) ((j) yVar.f14970c)).f10616a.f10675s;
                j2.a p5 = fVar.p();
                fVar.q(p5, 1029, new j2.c(p5, exc, 0));
                return;
            default:
                String str2 = e2.d0.f7871a;
                j2.f fVar2 = ((i2.c0) ((j) yVar.f14970c)).f10616a.f10675s;
                j2.a p10 = fVar2.p();
                fVar2.q(p10, 1014, new j2.c(p10, exc, 24));
                return;
        }
    }
}

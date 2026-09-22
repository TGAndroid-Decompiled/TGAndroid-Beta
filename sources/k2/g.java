package k2;
public final class g implements Runnable {
    public final int f13289a;
    public final n4.y f13290b;
    public final Exception f13291c;

    public g(n4.y yVar, Exception exc, int i10) {
        this.f13289a = i10;
        this.f13290b = yVar;
        this.f13291c = exc;
    }

    @Override
    public final void run() {
        int i10 = this.f13289a;
        Exception exc = this.f13291c;
        n4.y yVar = this.f13290b;
        switch (i10) {
            case 0:
                String str = e2.d0.f7887a;
                j2.f fVar = ((i2.b0) ((k) yVar.f15231b)).f10625a.f10675s;
                j2.a p5 = fVar.p();
                fVar.q(p5, 1029, new j2.c(p5, exc, 1));
                return;
            default:
                String str2 = e2.d0.f7887a;
                j2.f fVar2 = ((i2.b0) ((k) yVar.f15231b)).f10625a.f10675s;
                j2.a p10 = fVar2.p();
                fVar2.q(p10, 1014, new j2.c(p10, exc, 25));
                return;
        }
    }
}

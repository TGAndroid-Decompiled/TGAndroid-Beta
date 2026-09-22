package k2;
public final class i implements Runnable {
    public final int f13296a;
    public final n4.y f13297b;
    public final l f13298c;

    public i(n4.y yVar, l lVar, int i10) {
        this.f13296a = i10;
        this.f13297b = yVar;
        this.f13298c = lVar;
    }

    @Override
    public final void run() {
        int i10 = this.f13296a;
        l lVar = this.f13298c;
        n4.y yVar = this.f13297b;
        switch (i10) {
            case 0:
                String str = e2.d0.f7887a;
                j2.f fVar = ((i2.b0) ((k) yVar.f15231b)).f10625a.f10675s;
                j2.a p5 = fVar.p();
                fVar.q(p5, 1032, new j2.e(p5, lVar, 2));
                return;
            default:
                String str2 = e2.d0.f7887a;
                j2.f fVar2 = ((i2.b0) ((k) yVar.f15231b)).f10625a.f10675s;
                j2.a p10 = fVar2.p();
                fVar2.q(p10, 1031, new j2.c(p10, lVar, 19));
                return;
        }
    }
}

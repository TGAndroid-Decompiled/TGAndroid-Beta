package k2;
public final class f implements Runnable {
    public final int f13248a;
    public final n4.y f13249b;
    public final Exception f13250c;

    public f(n4.y yVar, Exception exc, int i10) {
        this.f13248a = i10;
        this.f13249b = yVar;
        this.f13250c = exc;
    }

    @Override
    public final void run() {
        int i10 = this.f13248a;
        Exception exc = this.f13250c;
        n4.y yVar = this.f13249b;
        switch (i10) {
            case 0:
                String str = e2.d0.f7887a;
                j2.f fVar = ((i2.b0) ((j) yVar.f15180c)).f10624a.f10674s;
                j2.a p5 = fVar.p();
                fVar.q(p5, 1029, new j2.c(p5, exc, 1));
                return;
            default:
                String str2 = e2.d0.f7887a;
                j2.f fVar2 = ((i2.b0) ((j) yVar.f15180c)).f10624a.f10674s;
                j2.a p10 = fVar2.p();
                fVar2.q(p10, 1014, new j2.c(p10, exc, 25));
                return;
        }
    }
}

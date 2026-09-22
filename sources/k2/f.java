package k2;
public final class f implements Runnable {
    public final int f13246a;
    public final n4.y f13247b;
    public final Exception f13248c;

    public f(n4.y yVar, Exception exc, int i10) {
        this.f13246a = i10;
        this.f13247b = yVar;
        this.f13248c = exc;
    }

    @Override
    public final void run() {
        int i10 = this.f13246a;
        Exception exc = this.f13248c;
        n4.y yVar = this.f13247b;
        switch (i10) {
            case 0:
                String str = e2.d0.f7885a;
                j2.f fVar = ((i2.b0) ((j) yVar.f14993c)).f10623a.f10673s;
                j2.a p5 = fVar.p();
                fVar.q(p5, 1029, new j2.c(p5, exc, 0));
                return;
            default:
                String str2 = e2.d0.f7885a;
                j2.f fVar2 = ((i2.b0) ((j) yVar.f14993c)).f10623a.f10673s;
                j2.a p10 = fVar2.p();
                fVar2.q(p10, 1014, new j2.c(p10, exc, 24));
                return;
        }
    }
}

package k2;
public final class f implements Runnable {
    public final int f13287a;
    public final n4.y f13288b;
    public final Exception f13289c;

    public f(n4.y yVar, Exception exc, int i10) {
        this.f13287a = i10;
        this.f13288b = yVar;
        this.f13289c = exc;
    }

    @Override
    public final void run() {
        int i10 = this.f13287a;
        Exception exc = this.f13289c;
        n4.y yVar = this.f13288b;
        switch (i10) {
            case 0:
                String str = e2.d0.f7882a;
                j2.f fVar = ((i2.c0) ((j) yVar.f15239c)).f10630a.f10689s;
                j2.a p5 = fVar.p();
                fVar.q(p5, 1029, new j2.c(p5, exc, 0));
                return;
            default:
                String str2 = e2.d0.f7882a;
                j2.f fVar2 = ((i2.c0) ((j) yVar.f15239c)).f10630a.f10689s;
                j2.a p10 = fVar2.p();
                fVar2.q(p10, 1014, new j2.c(p10, exc, 24));
                return;
        }
    }
}

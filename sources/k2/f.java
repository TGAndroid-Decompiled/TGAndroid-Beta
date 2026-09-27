package k2;
public final class f implements Runnable {
    public final int f13275a;
    public final n4.y f13276b;
    public final Exception f13277c;

    public f(n4.y yVar, Exception exc, int i10) {
        this.f13275a = i10;
        this.f13276b = yVar;
        this.f13277c = exc;
    }

    @Override
    public final void run() {
        int i10 = this.f13275a;
        Exception exc = this.f13277c;
        n4.y yVar = this.f13276b;
        switch (i10) {
            case 0:
                String str = e2.d0.f7872a;
                j2.f fVar = ((i2.c0) ((j) yVar.f15258c)).f10619a.f10678s;
                j2.a p5 = fVar.p();
                fVar.q(p5, 1029, new j2.c(p5, exc, 1));
                return;
            default:
                String str2 = e2.d0.f7872a;
                j2.f fVar2 = ((i2.c0) ((j) yVar.f15258c)).f10619a.f10678s;
                j2.a p10 = fVar2.p();
                fVar2.q(p10, 1014, new j2.c(p10, exc, 25));
                return;
        }
    }
}

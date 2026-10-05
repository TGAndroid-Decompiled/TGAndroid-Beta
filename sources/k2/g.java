package k2;
public final class g implements Runnable {
    public final int f14435a;
    public final n4.y f14436b;
    public final Exception f14437c;

    public g(n4.y yVar, Exception exc, int i10) {
        this.f14435a = i10;
        this.f14436b = yVar;
        this.f14437c = exc;
    }

    @Override
    public final void run() {
        int i10 = this.f14435a;
        Exception exc = this.f14437c;
        n4.y yVar = this.f14436b;
        switch (i10) {
            case 0:
                String str = e2.d0.f8538a;
                j2.f fVar = ((i2.c0) ((k) yVar.f16650c)).f11570a.f11633s;
                j2.a p5 = fVar.p();
                fVar.q(p5, 1029, new j2.c(p5, exc, 1));
                return;
            default:
                String str2 = e2.d0.f8538a;
                j2.f fVar2 = ((i2.c0) ((k) yVar.f16650c)).f11570a.f11633s;
                j2.a p10 = fVar2.p();
                fVar2.q(p10, 1014, new j2.c(p10, exc, 25));
                return;
        }
    }
}

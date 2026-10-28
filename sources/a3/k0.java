package a3;
public final class k0 implements Runnable {
    public final int f136a;
    public final n4.s f137b;
    public final i2.e f138c;

    public k0(n4.s sVar, i2.e eVar, int i10) {
        this.f136a = i10;
        this.f137b = sVar;
        this.f138c = eVar;
    }

    @Override
    public final void run() {
        switch (this.f136a) {
            case 0:
                n4.s sVar = this.f137b;
                i2.e eVar = this.f138c;
                String str = e2.n0.f9691a;
                j2.e eVar2 = ((i2.d0) ((m0) sVar.f18696c)).f13508a.f13613s;
                j2.a p10 = eVar2.p();
                eVar2.q(p10, 1015, new j2.d(p10, eVar, 7));
                return;
            default:
                n4.s sVar2 = this.f137b;
                i2.e eVar3 = this.f138c;
                synchronized (eVar3) {
                }
                String str2 = e2.n0.f9691a;
                i2.j0 j0Var = ((i2.d0) ((m0) sVar2.f18696c)).f13508a;
                j2.e eVar4 = j0Var.f13613s;
                j2.a n10 = eVar4.n((u2.g0) eVar4.d.e);
                eVar4.q(n10, 1020, new e1.c(n10, eVar3, 26));
                j0Var.S = null;
                return;
        }
    }
}

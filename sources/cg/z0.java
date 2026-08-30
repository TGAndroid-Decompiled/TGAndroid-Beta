package cg;
public final class z0 implements Runnable {
    public final int f2582a;
    public final d1 f2583b;

    public z0(d1 d1Var, int i10) {
        this.f2582a = i10;
        this.f2583b = d1Var;
    }

    @Override
    public final void run() {
        switch (this.f2582a) {
            case 0:
                d1 d1Var = this.f2583b;
                d1Var.f2336c = null;
                o5.i iVar = d1Var.f2334a;
                if (iVar != null) {
                    iVar.d();
                    return;
                }
                return;
            default:
                this.f2583b.b();
                return;
        }
    }
}

package cg;
public final class z0 implements Runnable {
    public final int f2565a;
    public final d1 f2566b;

    public z0(d1 d1Var, int i10) {
        this.f2565a = i10;
        this.f2566b = d1Var;
    }

    @Override
    public final void run() {
        switch (this.f2565a) {
            case 0:
                d1 d1Var = this.f2566b;
                d1Var.f2319c = null;
                o5.i iVar = d1Var.f2317a;
                if (iVar != null) {
                    iVar.q();
                    return;
                }
                return;
            default:
                this.f2566b.b();
                return;
        }
    }
}

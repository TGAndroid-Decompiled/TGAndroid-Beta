package dg;
public final class y0 implements Runnable {
    public final int f4723a;
    public final c1 f4724b;

    public y0(c1 c1Var, int i10) {
        this.f4723a = i10;
        this.f4724b = c1Var;
    }

    @Override
    public final void run() {
        switch (this.f4723a) {
            case 0:
                c1 c1Var = this.f4724b;
                c1Var.f4453c = null;
                o5.i iVar = c1Var.f4451a;
                if (iVar != null) {
                    iVar.c();
                    return;
                }
                return;
            default:
                this.f4724b.b();
                return;
        }
    }
}

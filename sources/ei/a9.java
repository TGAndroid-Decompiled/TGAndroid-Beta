package ei;
public final class a9 implements Runnable {
    public final int f8748a;
    public final k9 f8749b;

    public a9(k9 k9Var, int i10) {
        this.f8748a = i10;
        this.f8749b = k9Var;
    }

    @Override
    public final void run() {
        switch (this.f8748a) {
            case 0:
                r9 r9Var = this.f8749b.W;
                org.telegram.ui.Components.qc.h(r9Var.container);
                r9.E(r9Var);
                return;
            case 1:
                k9 k9Var = this.f8749b;
                k9Var.v.setLoading(false);
                r9 r9Var2 = k9Var.W;
                r9Var2.g1();
                r9Var2.f9746b.D(0);
                return;
            case 2:
                this.f8749b.U = false;
                return;
            case 3:
                r9 r9Var3 = this.f8749b.W;
                r9Var3.M = 6;
                r9Var3.f9746b.D(1);
                return;
            case 4:
                k9 k9Var2 = this.f8749b;
                k9Var2.f9331n.m(2);
                k9Var2.f9330f.forceLayout();
                k9Var2.j();
                return;
            default:
                k9 k9Var3 = this.f8749b;
                r9 r9Var4 = k9Var3.W;
                if (k9Var3.f9327a == 0) {
                    r9Var4.dismiss();
                    return;
                } else {
                    r9Var4.onBackPressed();
                    return;
                }
        }
    }
}

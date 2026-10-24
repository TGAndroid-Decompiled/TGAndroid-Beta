package ei;
public final class a9 implements Runnable {
    public final int f8755a;
    public final k9 f8756b;

    public a9(k9 k9Var, int i10) {
        this.f8755a = i10;
        this.f8756b = k9Var;
    }

    @Override
    public final void run() {
        switch (this.f8755a) {
            case 0:
                r9 r9Var = this.f8756b.W;
                org.telegram.ui.Components.oc.h(r9Var.container);
                r9.D(r9Var);
                return;
            case 1:
                k9 k9Var = this.f8756b;
                k9Var.v.setLoading(false);
                r9 r9Var2 = k9Var.W;
                r9Var2.g1();
                r9Var2.f9760b.D(0);
                return;
            case 2:
                this.f8756b.U = false;
                return;
            case 3:
                r9 r9Var3 = this.f8756b.W;
                r9Var3.M = 6;
                r9Var3.f9760b.D(1);
                return;
            case 4:
                k9 k9Var2 = this.f8756b;
                k9Var2.f9340n.m(2);
                k9Var2.f9339f.forceLayout();
                k9Var2.j();
                return;
            default:
                k9 k9Var3 = this.f8756b;
                r9 r9Var4 = k9Var3.W;
                if (k9Var3.f9336a == 0) {
                    r9Var4.dismiss();
                    return;
                } else {
                    r9Var4.onBackPressed();
                    return;
                }
        }
    }
}

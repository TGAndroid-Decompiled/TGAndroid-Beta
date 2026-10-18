package ei;
public final class a9 implements Runnable {
    public final int f8749a;
    public final k9 f8750b;

    public a9(k9 k9Var, int i10) {
        this.f8749a = i10;
        this.f8750b = k9Var;
    }

    @Override
    public final void run() {
        switch (this.f8749a) {
            case 0:
                r9 r9Var = this.f8750b.W;
                org.telegram.ui.Components.qc.h(r9Var.container);
                r9.F(r9Var);
                return;
            case 1:
                k9 k9Var = this.f8750b;
                k9Var.v.setLoading(false);
                r9 r9Var2 = k9Var.W;
                r9Var2.g1();
                r9Var2.f9747b.D(0);
                return;
            case 2:
                this.f8750b.U = false;
                return;
            case 3:
                r9 r9Var3 = this.f8750b.W;
                r9Var3.M = 6;
                r9Var3.f9747b.D(1);
                return;
            case 4:
                k9 k9Var2 = this.f8750b;
                k9Var2.f9332n.m(2);
                k9Var2.f9331f.forceLayout();
                k9Var2.j();
                return;
            default:
                k9 k9Var3 = this.f8750b;
                r9 r9Var4 = k9Var3.W;
                if (k9Var3.f9328a == 0) {
                    r9Var4.dismiss();
                    return;
                } else {
                    r9Var4.onBackPressed();
                    return;
                }
        }
    }
}

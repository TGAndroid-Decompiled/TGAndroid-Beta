package fi;
public final class w8 implements Runnable {
    public final int f11940a;
    public final g9 f11941b;

    public w8(g9 g9Var, int i10) {
        this.f11940a = i10;
        this.f11941b = g9Var;
    }

    @Override
    public final void run() {
        switch (this.f11940a) {
            case 0:
                n9 n9Var = this.f11941b.W;
                org.telegram.ui.Components.qc.h(n9Var.container);
                n9.D(n9Var);
                return;
            case 1:
                g9 g9Var = this.f11941b;
                g9Var.v.setLoading(false);
                n9 n9Var2 = g9Var.W;
                n9Var2.g1();
                n9Var2.f11311b.E(0);
                return;
            case 2:
                this.f11941b.U = false;
                return;
            case 3:
                n9 n9Var3 = this.f11941b.W;
                n9Var3.M = 6;
                n9Var3.f11311b.E(1);
                return;
            case 4:
                g9 g9Var2 = this.f11941b;
                g9Var2.f10924n.m(2);
                g9Var2.f10923f.forceLayout();
                g9Var2.j();
                return;
            default:
                g9 g9Var3 = this.f11941b;
                n9 n9Var4 = g9Var3.W;
                if (g9Var3.f10920a == 0) {
                    n9Var4.dismiss();
                    return;
                } else {
                    n9Var4.onBackPressed();
                    return;
                }
        }
    }
}

package fi;
public final class w8 implements Runnable {
    public final int f11939a;
    public final g9 f11940b;

    public w8(g9 g9Var, int i10) {
        this.f11939a = i10;
        this.f11940b = g9Var;
    }

    @Override
    public final void run() {
        switch (this.f11939a) {
            case 0:
                n9 n9Var = this.f11940b.W;
                org.telegram.ui.Components.qc.h(n9Var.container);
                n9.D(n9Var);
                return;
            case 1:
                g9 g9Var = this.f11940b;
                g9Var.v.setLoading(false);
                n9 n9Var2 = g9Var.W;
                n9Var2.g1();
                n9Var2.f11310b.E(0);
                return;
            case 2:
                this.f11940b.U = false;
                return;
            case 3:
                n9 n9Var3 = this.f11940b.W;
                n9Var3.M = 6;
                n9Var3.f11310b.E(1);
                return;
            case 4:
                g9 g9Var2 = this.f11940b;
                g9Var2.f10923n.m(2);
                g9Var2.f10922f.forceLayout();
                g9Var2.j();
                return;
            default:
                g9 g9Var3 = this.f11940b;
                n9 n9Var4 = g9Var3.W;
                if (g9Var3.f10919a == 0) {
                    n9Var4.dismiss();
                    return;
                } else {
                    n9Var4.onBackPressed();
                    return;
                }
        }
    }
}

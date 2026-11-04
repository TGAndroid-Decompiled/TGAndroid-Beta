package gi;

import org.telegram.ui.Components.ac;
public final class c8 implements Runnable {
    public final int f12500a;
    public final o8 f12501b;

    public c8(o8 o8Var, int i3) {
        this.f12500a = i3;
        this.f12501b = o8Var;
    }

    @Override
    public final void run() {
        switch (this.f12500a) {
            case 0:
                t8 t8Var = this.f12501b.f13340a0;
                ac.h(t8Var.f28589c);
                super/*org.telegram.ui.ActionBar.t2*/.dismiss();
                return;
            case 1:
                o8 o8Var = this.f12501b;
                o8Var.f13348w.setLoading(false);
                t8 t8Var2 = o8Var.f13340a0;
                t8Var2.M0();
                t8Var2.f13621j1.D(0);
                return;
            case 2:
                this.f12501b.V = false;
                return;
            case 3:
                t8 t8Var3 = this.f12501b.f13340a0;
                t8Var3.E1 = 6;
                t8Var3.f13621j1.D(1);
                return;
            case 4:
                o8 o8Var2 = this.f12501b;
                o8Var2.f13345n.g(2);
                o8Var2.f13344f.forceLayout();
                o8Var2.k();
                return;
            default:
                o8 o8Var3 = this.f12501b;
                t8 t8Var4 = o8Var3.f13340a0;
                if (o8Var3.f13339a == 0) {
                    t8Var4.dismiss();
                    return;
                } else {
                    t8Var4.onBackPressed();
                    return;
                }
        }
    }
}

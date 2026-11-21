package hi;

import org.telegram.ui.Components.gc;
public final class a8 implements Runnable {
    public final int f14252a;
    public final k8 f14253b;

    public a8(k8 k8Var, int i7) {
        this.f14252a = i7;
        this.f14253b = k8Var;
    }

    @Override
    public final void run() {
        switch (this.f14252a) {
            case 0:
                p8 p8Var = this.f14253b.f14927a0;
                gc.h(p8Var.f30176c);
                super/*org.telegram.ui.ActionBar.w2*/.dismiss();
                return;
            case 1:
                k8 k8Var = this.f14253b;
                k8Var.f14935w.setLoading(false);
                p8 p8Var2 = k8Var.f14927a0;
                p8Var2.N0();
                p8Var2.f15266m1.A(0);
                return;
            case 2:
                this.f14253b.V = false;
                return;
            case 3:
                p8 p8Var3 = this.f14253b.f14927a0;
                p8Var3.H1 = 6;
                p8Var3.f15266m1.A(1);
                return;
            case 4:
                k8 k8Var2 = this.f14253b;
                k8Var2.f14932n.g(2);
                k8Var2.f14931f.forceLayout();
                k8Var2.k();
                return;
            default:
                k8 k8Var3 = this.f14253b;
                p8 p8Var4 = k8Var3.f14927a0;
                if (k8Var3.f14926a == 0) {
                    p8Var4.dismiss();
                    return;
                } else {
                    p8Var4.onBackPressed();
                    return;
                }
        }
    }
}

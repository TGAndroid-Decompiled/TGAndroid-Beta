package hi;

import org.telegram.ui.Components.gc;
public final class b8 implements Runnable {
    public final int f14274a;
    public final l8 f14275b;

    public b8(l8 l8Var, int i7) {
        this.f14274a = i7;
        this.f14275b = l8Var;
    }

    @Override
    public final void run() {
        switch (this.f14274a) {
            case 0:
                q8 q8Var = this.f14275b.f14955a0;
                gc.h(q8Var.f30195c);
                super/*org.telegram.ui.ActionBar.x2*/.dismiss();
                return;
            case 1:
                l8 l8Var = this.f14275b;
                l8Var.f14963w.setLoading(false);
                q8 q8Var2 = l8Var.f14955a0;
                q8Var2.N0();
                q8Var2.f15283m1.A(0);
                return;
            case 2:
                this.f14275b.V = false;
                return;
            case 3:
                q8 q8Var3 = this.f14275b.f14955a0;
                q8Var3.H1 = 6;
                q8Var3.f15283m1.A(1);
                return;
            case 4:
                l8 l8Var2 = this.f14275b;
                l8Var2.f14960n.g(2);
                l8Var2.f14959f.forceLayout();
                l8Var2.k();
                return;
            default:
                l8 l8Var3 = this.f14275b;
                q8 q8Var4 = l8Var3.f14955a0;
                if (l8Var3.f14954a == 0) {
                    q8Var4.dismiss();
                    return;
                } else {
                    q8Var4.onBackPressed();
                    return;
                }
        }
    }
}

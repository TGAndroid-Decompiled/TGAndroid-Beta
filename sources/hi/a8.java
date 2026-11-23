package hi;

import org.telegram.ui.Components.gc;
public final class a8 implements Runnable {
    public final int f14255a;
    public final k8 f14256b;

    public a8(k8 k8Var, int i7) {
        this.f14255a = i7;
        this.f14256b = k8Var;
    }

    @Override
    public final void run() {
        switch (this.f14255a) {
            case 0:
                p8 p8Var = this.f14256b.f14930a0;
                gc.h(p8Var.f30179c);
                super/*org.telegram.ui.ActionBar.w2*/.dismiss();
                return;
            case 1:
                k8 k8Var = this.f14256b;
                k8Var.f14938w.setLoading(false);
                p8 p8Var2 = k8Var.f14930a0;
                p8Var2.N0();
                p8Var2.f15269m1.A(0);
                return;
            case 2:
                this.f14256b.V = false;
                return;
            case 3:
                p8 p8Var3 = this.f14256b.f14930a0;
                p8Var3.H1 = 6;
                p8Var3.f15269m1.A(1);
                return;
            case 4:
                k8 k8Var2 = this.f14256b;
                k8Var2.f14935n.g(2);
                k8Var2.f14934f.forceLayout();
                k8Var2.k();
                return;
            default:
                k8 k8Var3 = this.f14256b;
                p8 p8Var4 = k8Var3.f14930a0;
                if (k8Var3.f14929a == 0) {
                    p8Var4.dismiss();
                    return;
                } else {
                    p8Var4.onBackPressed();
                    return;
                }
        }
    }
}

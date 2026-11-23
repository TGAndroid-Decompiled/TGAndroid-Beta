package hi;

import org.telegram.ui.Components.gc;
public final class b8 implements Runnable {
    public final int f14220a;
    public final l8 f14221b;

    public b8(l8 l8Var, int i7) {
        this.f14220a = i7;
        this.f14221b = l8Var;
    }

    @Override
    public final void run() {
        switch (this.f14220a) {
            case 0:
                q8 q8Var = this.f14221b.f14942a0;
                gc.h(q8Var.f30145c);
                super/*org.telegram.ui.ActionBar.w2*/.dismiss();
                return;
            case 1:
                l8 l8Var = this.f14221b;
                l8Var.f14950w.setLoading(false);
                q8 q8Var2 = l8Var.f14942a0;
                q8Var2.N0();
                q8Var2.f15242m1.A(0);
                return;
            case 2:
                this.f14221b.V = false;
                return;
            case 3:
                q8 q8Var3 = this.f14221b.f14942a0;
                q8Var3.H1 = 6;
                q8Var3.f15242m1.A(1);
                return;
            case 4:
                l8 l8Var2 = this.f14221b;
                l8Var2.f14947n.g(2);
                l8Var2.f14946f.forceLayout();
                l8Var2.k();
                return;
            default:
                l8 l8Var3 = this.f14221b;
                q8 q8Var4 = l8Var3.f14942a0;
                if (l8Var3.f14941a == 0) {
                    q8Var4.dismiss();
                    return;
                } else {
                    q8Var4.onBackPressed();
                    return;
                }
        }
    }
}

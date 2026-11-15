package hi;

import org.telegram.ui.Components.xb;
public final class b8 implements Runnable {
    public final int f13937a;
    public final l8 f13938b;

    public b8(l8 l8Var, int i7) {
        this.f13937a = i7;
        this.f13938b = l8Var;
    }

    @Override
    public final void run() {
        switch (this.f13937a) {
            case 0:
                q8 q8Var = this.f13938b.f14600a0;
                xb.h(q8Var.f29685c);
                super/*org.telegram.ui.ActionBar.u2*/.dismiss();
                return;
            case 1:
                l8 l8Var = this.f13938b;
                l8Var.f14608w.setLoading(false);
                q8 q8Var2 = l8Var.f14600a0;
                q8Var2.M0();
                q8Var2.f14918m1.C(0);
                return;
            case 2:
                this.f13938b.V = false;
                return;
            case 3:
                q8 q8Var3 = this.f13938b.f14600a0;
                q8Var3.H1 = 6;
                q8Var3.f14918m1.C(1);
                return;
            case 4:
                l8 l8Var2 = this.f13938b;
                l8Var2.f14605n.g(2);
                l8Var2.f14604f.forceLayout();
                l8Var2.k();
                return;
            default:
                l8 l8Var3 = this.f13938b;
                q8 q8Var4 = l8Var3.f14600a0;
                if (l8Var3.f14599a == 0) {
                    q8Var4.dismiss();
                    return;
                } else {
                    q8Var4.onBackPressed();
                    return;
                }
        }
    }
}

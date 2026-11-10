package fi;

import org.telegram.ui.Components.bc;
public final class d8 implements Runnable {
    public final int f11798a;
    public final n8 f11799b;

    public d8(n8 n8Var, int i7) {
        this.f11798a = i7;
        this.f11799b = n8Var;
    }

    @Override
    public final void run() {
        switch (this.f11798a) {
            case 0:
                s8 s8Var = this.f11799b.W;
                bc.h(s8Var.f28675c);
                super/*org.telegram.ui.ActionBar.w2*/.dismiss();
                return;
            case 1:
                n8 n8Var = this.f11799b;
                n8Var.f12497w.setLoading(false);
                s8 s8Var2 = n8Var.W;
                s8Var2.M0();
                s8Var2.l1.E(0);
                return;
            case 2:
                this.f11799b.U = false;
                return;
            case 3:
                s8 s8Var3 = this.f11799b.W;
                s8Var3.G1 = 6;
                s8Var3.l1.E(1);
                return;
            case 4:
                n8 n8Var2 = this.f11799b;
                n8Var2.f12494n.g(2);
                n8Var2.f12493f.forceLayout();
                n8Var2.k();
                return;
            default:
                n8 n8Var3 = this.f11799b;
                s8 s8Var4 = n8Var3.W;
                if (n8Var3.f12489a == 0) {
                    s8Var4.dismiss();
                    return;
                } else {
                    s8Var4.onBackPressed();
                    return;
                }
        }
    }
}

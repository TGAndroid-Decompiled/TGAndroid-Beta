package fi;

import org.telegram.ui.Components.cc;
public final class d8 implements Runnable {
    public final int f11794a;
    public final n8 f11795b;

    public d8(n8 n8Var, int i7) {
        this.f11794a = i7;
        this.f11795b = n8Var;
    }

    @Override
    public final void run() {
        switch (this.f11794a) {
            case 0:
                s8 s8Var = this.f11795b.W;
                cc.h(s8Var.f28627c);
                super/*org.telegram.ui.ActionBar.v2*/.dismiss();
                return;
            case 1:
                n8 n8Var = this.f11795b;
                n8Var.f12493w.setLoading(false);
                s8 s8Var2 = n8Var.W;
                s8Var2.M0();
                s8Var2.f12802i1.E(0);
                return;
            case 2:
                this.f11795b.U = false;
                return;
            case 3:
                s8 s8Var3 = this.f11795b.W;
                s8Var3.D1 = 6;
                s8Var3.f12802i1.E(1);
                return;
            case 4:
                n8 n8Var2 = this.f11795b;
                n8Var2.f12490n.g(2);
                n8Var2.f12489f.forceLayout();
                n8Var2.k();
                return;
            default:
                n8 n8Var3 = this.f11795b;
                s8 s8Var4 = n8Var3.W;
                if (n8Var3.f12485a == 0) {
                    s8Var4.dismiss();
                    return;
                } else {
                    s8Var4.onBackPressed();
                    return;
                }
        }
    }
}

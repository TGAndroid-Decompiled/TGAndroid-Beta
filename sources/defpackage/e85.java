package defpackage;

import android.view.ViewTreeObserver;
public final class e85 implements ViewTreeObserver.OnPreDrawListener {
    public final byte a;
    public final g95 b;

    public e85(g95 g95Var, byte b) {
        this.a = b;
        this.b = g95Var;
    }

    @Override
    public final boolean onPreDraw() {
        byte b = this.a;
        g95 g95Var = this.b;
        switch (b) {
            case 0:
                g95Var.J1.getViewTreeObserver().removeOnPreDrawListener(this);
                g95Var.T3.h(null);
                gm.V3(g95Var.e4);
                g95Var.b.requestLayout();
                return false;
            default:
                g95Var.J1.getViewTreeObserver().removeOnPreDrawListener(this);
                g95Var.T3.h(null);
                gm.V3(g95Var.e4);
                g95Var.b.requestLayout();
                return false;
        }
    }
}

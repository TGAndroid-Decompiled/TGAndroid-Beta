package defpackage;

import android.view.ViewTreeObserver;
public final class g65 implements ViewTreeObserver.OnPreDrawListener {
    public final byte a;
    public final h75 b;

    public g65(h75 h75Var, byte b) {
        this.a = b;
        this.b = h75Var;
    }

    @Override
    public final boolean onPreDraw() {
        byte b = this.a;
        h75 h75Var = this.b;
        switch (b) {
            case 0:
                h75Var.J1.getViewTreeObserver().removeOnPreDrawListener(this);
                h75Var.T3.h(null);
                gl.W3(h75Var.e4);
                h75Var.b.requestLayout();
                return false;
            default:
                h75Var.J1.getViewTreeObserver().removeOnPreDrawListener(this);
                h75Var.T3.h(null);
                gl.W3(h75Var.e4);
                h75Var.b.requestLayout();
                return false;
        }
    }
}

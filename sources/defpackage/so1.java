package defpackage;

import android.view.ViewTreeObserver;
public final class so1 implements ViewTreeObserver.OnPreDrawListener {
    public final byte a = 1;
    public boolean b;
    public final Object c;
    public final Object d;

    public so1(h75 h75Var, gc2 gc2Var, boolean z) {
        this.d = h75Var;
        this.c = gc2Var;
        this.b = z;
    }

    @Override
    public final boolean onPreDraw() {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.d;
        switch (b) {
            case 0:
                mu1 mu1Var = (mu1) obj2;
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) obj;
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnPreDrawListener(this);
                }
                cq1 cq1Var = mu1Var.p1;
                if (cq1Var != null) {
                    cq1Var.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                if (this.b) {
                    return true;
                }
                this.b = true;
                return mu1Var.H6();
            default:
                h75 h75Var = (h75) obj2;
                r65 r65Var = h75Var.J1;
                r65Var.getViewTreeObserver().removeOnPreDrawListener(this);
                h75Var.i4 = null;
                gc2 gc2Var = (gc2) obj;
                h75Var.T3.h(gc2Var);
                if (h75Var.l2) {
                    h75Var.l2 = false;
                    h75Var.D0(true);
                    if (this.b && gc2Var != null) {
                        r65Var.w0(0);
                    }
                    h75Var.l2 = true;
                } else {
                    h75Var.D0(true);
                }
                h75Var.b.requestLayout();
                return false;
        }
    }

    public so1(mu1 mu1Var, ViewTreeObserver viewTreeObserver) {
        this.d = mu1Var;
        this.c = viewTreeObserver;
    }
}

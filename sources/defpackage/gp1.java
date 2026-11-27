package defpackage;

import android.view.ViewTreeObserver;
public final class gp1 implements ViewTreeObserver.OnPreDrawListener {
    public final byte a = 1;
    public boolean b;
    public final Object c;
    public final Object d;

    public gp1(j95 j95Var, wc2 wc2Var, boolean z) {
        this.d = j95Var;
        this.c = wc2Var;
        this.b = z;
    }

    @Override
    public final boolean onPreDraw() {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.d;
        switch (b) {
            case 0:
                zu1 zu1Var = (zu1) obj2;
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) obj;
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnPreDrawListener(this);
                }
                qq1 qq1Var = zu1Var.p1;
                if (qq1Var != null) {
                    qq1Var.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                if (this.b) {
                    return true;
                }
                this.b = true;
                return zu1Var.O6();
            default:
                j95 j95Var = (j95) obj2;
                t85 t85Var = j95Var.J1;
                t85Var.getViewTreeObserver().removeOnPreDrawListener(this);
                j95Var.i4 = null;
                wc2 wc2Var = (wc2) obj;
                j95Var.T3.h(wc2Var);
                if (j95Var.l2) {
                    j95Var.l2 = false;
                    j95Var.E0(true);
                    if (this.b && wc2Var != null) {
                        t85Var.x0(0);
                    }
                    j95Var.l2 = true;
                } else {
                    j95Var.E0(true);
                }
                j95Var.b.requestLayout();
                return false;
        }
    }

    public gp1(zu1 zu1Var, ViewTreeObserver viewTreeObserver) {
        this.d = zu1Var;
        this.c = viewTreeObserver;
    }
}

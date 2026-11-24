package defpackage;

import android.view.ViewTreeObserver;
public final class fq1 implements ViewTreeObserver.OnPreDrawListener {
    public final byte a = 1;
    public boolean b;
    public final Object c;
    public final Object d;

    public fq1(g95 g95Var, rd2 rd2Var, boolean z) {
        this.d = g95Var;
        this.c = rd2Var;
        this.b = z;
    }

    @Override
    public final boolean onPreDraw() {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.d;
        switch (b) {
            case 0:
                yv1 yv1Var = (yv1) obj2;
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) obj;
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnPreDrawListener(this);
                }
                pr1 pr1Var = yv1Var.p1;
                if (pr1Var != null) {
                    pr1Var.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                if (this.b) {
                    return true;
                }
                this.b = true;
                return yv1Var.O6();
            default:
                g95 g95Var = (g95) obj2;
                p85 p85Var = g95Var.J1;
                p85Var.getViewTreeObserver().removeOnPreDrawListener(this);
                g95Var.i4 = null;
                rd2 rd2Var = (rd2) obj;
                g95Var.T3.h(rd2Var);
                if (g95Var.l2) {
                    g95Var.l2 = false;
                    g95Var.D0(true);
                    if (this.b && rd2Var != null) {
                        p85Var.w0(0);
                    }
                    g95Var.l2 = true;
                } else {
                    g95Var.D0(true);
                }
                g95Var.b.requestLayout();
                return false;
        }
    }

    public fq1(yv1 yv1Var, ViewTreeObserver viewTreeObserver) {
        this.d = yv1Var;
        this.c = viewTreeObserver;
    }
}

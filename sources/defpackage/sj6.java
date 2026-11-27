package defpackage;

import android.view.View;
public final class sj6 implements Runnable {
    public final ck6 a;

    public sj6(ck6 ck6Var) {
        this.a = ck6Var;
    }

    @Override
    public final void run() {
        ck6 ck6Var = this.a;
        if (ck6Var.b == null) {
            return;
        }
        for (int i = 0; i < ck6Var.b.getChildCount(); i++) {
            View childAt = ck6Var.b.getChildAt(i);
            if (childAt instanceof zj6) {
                zj6 zj6Var = (zj6) childAt;
                if (zj6Var.J) {
                    zj6Var.b(zj6Var.n, zj6Var.r);
                }
            }
        }
        hl.d3(this, 500L);
    }
}

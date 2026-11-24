package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
public final class rg1 implements ViewTreeObserver.OnPreDrawListener {
    public final View a;
    public final u69 b;
    public final sg1 c;

    public rg1(sg1 sg1Var, View view, u69 u69Var) {
        this.c = sg1Var;
        this.a = view;
        this.b = u69Var;
    }

    @Override
    public final boolean onPreDraw() {
        int i;
        View view = this.a;
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        vg1 vg1Var = this.c.n;
        int measuredHeight = vg1Var.w.getMeasuredHeight();
        int top = view.getTop();
        view.getBottom();
        if (top >= 0) {
            i = 0;
        } else {
            i = -top;
        }
        int i2 = i;
        int measuredHeight2 = view.getMeasuredHeight();
        if (measuredHeight2 > measuredHeight) {
            measuredHeight2 = i2 + measuredHeight;
        }
        View view2 = this.b.a;
        if (view2 instanceof rc2) {
            ((rc2) view).D3(i2, measuredHeight2 - i2, (vg1Var.Y.getHeightWithKeyboard() - gm.L(48.0f)) - vg1Var.w.getTop(), 0.0f, (view.getY() + vg1.C0(vg1Var).getMeasuredHeight()) - vg1Var.Y.getBackgroundTranslationY(), vg1Var.Y.getMeasuredWidth(), vg1Var.Y.getBackgroundSizeY(), 0, 0, 0);
            return true;
        } else if ((view2 instanceof cm1) && vg1.D0(vg1Var) != null && vg1Var.Y != null) {
            ((cm1) view).j0((view.getY() + vg1.E0(vg1Var).getMeasuredHeight()) - vg1Var.Y.getBackgroundTranslationY(), vg1Var.Y.getBackgroundSizeY());
            return true;
        } else {
            return true;
        }
    }
}

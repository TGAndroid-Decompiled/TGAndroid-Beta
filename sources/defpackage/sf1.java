package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
public final class sf1 implements ViewTreeObserver.OnPreDrawListener {
    public final View a;
    public final f89 b;
    public final tf1 c;

    public sf1(tf1 tf1Var, View view, f89 f89Var) {
        this.c = tf1Var;
        this.a = view;
        this.b = f89Var;
    }

    @Override
    public final boolean onPreDraw() {
        int i;
        View view = this.a;
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        wf1 wf1Var = this.c.n;
        int measuredHeight = wf1Var.w.getMeasuredHeight();
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
        if (view2 instanceof wb2) {
            ((wb2) view).D3(i2, measuredHeight2 - i2, (wf1Var.Y.getHeightWithKeyboard() - hl.L(48.0f)) - wf1Var.w.getTop(), 0.0f, (view.getY() + wf1.w0(wf1Var).getMeasuredHeight()) - wf1Var.Y.getBackgroundTranslationY(), wf1Var.Y.getMeasuredWidth(), wf1Var.Y.getBackgroundSizeY(), 0, 0, 0);
            return true;
        } else if ((view2 instanceof dl1) && wf1.x0(wf1Var) != null && wf1Var.Y != null) {
            ((dl1) view).j0((view.getY() + wf1.y0(wf1Var).getMeasuredHeight()) - wf1Var.Y.getBackgroundTranslationY(), wf1Var.Y.getBackgroundSizeY());
            return true;
        } else {
            return true;
        }
    }
}

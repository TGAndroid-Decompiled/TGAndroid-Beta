package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
public final class jf1 implements ViewTreeObserver.OnPreDrawListener {
    public final View a;
    public final s49 b;
    public final kf1 c;

    public jf1(kf1 kf1Var, View view, s49 s49Var) {
        this.c = kf1Var;
        this.a = view;
        this.b = s49Var;
    }

    @Override
    public final boolean onPreDraw() {
        int i;
        View view = this.a;
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        nf1 nf1Var = this.c.n;
        int measuredHeight = nf1Var.w.getMeasuredHeight();
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
        if (view2 instanceof gb2) {
            ((gb2) view).D3(i2, measuredHeight2 - i2, (nf1Var.Y.getHeightWithKeyboard() - gl.L(48.0f)) - nf1Var.w.getTop(), 0.0f, (view.getY() + nf1.B0(nf1Var).getMeasuredHeight()) - nf1Var.Y.getBackgroundTranslationY(), nf1Var.Y.getMeasuredWidth(), nf1Var.Y.getBackgroundSizeY(), 0, 0, 0);
            return true;
        } else if ((view2 instanceof uk1) && nf1.C0(nf1Var) != null && nf1Var.Y != null) {
            ((uk1) view).k0((view.getY() + nf1.D0(nf1Var).getMeasuredHeight()) - nf1Var.Y.getBackgroundTranslationY(), nf1Var.Y.getBackgroundSizeY());
            return true;
        } else {
            return true;
        }
    }
}

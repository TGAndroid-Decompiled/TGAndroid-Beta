package defpackage;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class x82 extends m8 {
    public final z82 o;

    public x82(z82 z82Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.o = z82Var;
    }

    @Override
    public final void dismiss() {
        d(true);
        yv1 yv1Var = this.o.H;
        if (yv1Var != null) {
            yv1Var.y6(false, true, 0.0f);
        }
    }
}

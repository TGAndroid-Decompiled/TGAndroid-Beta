package defpackage;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class cx2 extends m8 {
    public final dx2 o;

    public cx2(dx2 dx2Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.o = dx2Var;
    }

    @Override
    public final void dismiss() {
        d(true);
        hx2 hx2Var = this.o.a;
        hx2Var.k = null;
        hx2Var.K = false;
        if (hx2Var.R) {
            hx2Var.b();
        }
    }
}

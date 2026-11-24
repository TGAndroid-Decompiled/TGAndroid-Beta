package defpackage;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class m72 extends m8 {
    public final o72 o;

    public m72(o72 o72Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.o = o72Var;
    }

    @Override
    public final void dismiss() {
        d(true);
        mu1 mu1Var = this.o.H;
        if (mu1Var != null) {
            mu1Var.r6(false, true, 0.0f);
        }
    }
}

package defpackage;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class d82 extends n8 {
    public final f82 o;

    public d82(f82 f82Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.o = f82Var;
    }

    @Override
    public final void dismiss() {
        d(true);
        zu1 zu1Var = this.o.H;
        if (zu1Var != null) {
            zu1Var.y6(false, true, 0.0f);
        }
    }
}

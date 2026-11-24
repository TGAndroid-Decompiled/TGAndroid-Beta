package defpackage;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class ka6 extends m8 {
    public final qa6 o;

    public ka6(qa6 qa6Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.o = qa6Var;
    }

    @Override
    public final void dismiss() {
        d(true);
        this.o.P0 = null;
    }
}

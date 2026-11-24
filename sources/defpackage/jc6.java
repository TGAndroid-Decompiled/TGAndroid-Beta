package defpackage;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class jc6 extends m8 {
    public final pc6 o;

    public jc6(pc6 pc6Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.o = pc6Var;
    }

    @Override
    public final void dismiss() {
        d(true);
        this.o.P0 = null;
    }
}

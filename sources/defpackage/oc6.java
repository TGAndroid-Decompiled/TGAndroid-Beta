package defpackage;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class oc6 extends n8 {
    public final uc6 o;

    public oc6(uc6 uc6Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.o = uc6Var;
    }

    @Override
    public final void dismiss() {
        d(true);
        this.o.P0 = null;
    }
}

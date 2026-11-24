package defpackage;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class vw2 implements Runnable {
    public final byte a;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout b;

    public vw2(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, byte b) {
        this.a = b;
        this.b = actionBarPopupWindow$ActionBarPopupWindowLayout;
    }

    @Override
    public final void run() {
        byte b = this.a;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.b;
        switch (b) {
            case 0:
                actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
                return;
            case 1:
                if (actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack() != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
                    return;
                }
                return;
            default:
                gm.t1(actionBarPopupWindow$ActionBarPopupWindowLayout);
                return;
        }
    }
}

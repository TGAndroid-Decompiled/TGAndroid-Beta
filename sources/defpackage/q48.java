package defpackage;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class q48 implements Runnable {
    public final byte a;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout b;
    public final int c;

    public q48(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int i, byte b) {
        this.a = b;
        this.b = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.c = i;
    }

    @Override
    public final void run() {
        byte b = this.a;
        int i = this.c;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.b;
        switch (b) {
            case 0:
                if (actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack() != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(i);
                    return;
                }
                return;
            default:
                if (actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack() != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(i);
                    return;
                }
                return;
        }
    }
}

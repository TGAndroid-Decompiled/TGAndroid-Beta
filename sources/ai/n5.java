package ai;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class n5 implements Runnable {
    public final int f1297a;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f1298b;
    public final int f1299c;

    public n5(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int i10, int i11) {
        this.f1297a = i11;
        this.f1298b = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.f1299c = i10;
    }

    @Override
    public final void run() {
        switch (this.f1297a) {
            case 0:
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f1298b;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack() != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(this.f1299c);
                    return;
                }
                return;
            default:
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = this.f1298b;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout2.getSwipeBack() != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout2.getSwipeBack().e(this.f1299c);
                    return;
                }
                return;
        }
    }
}

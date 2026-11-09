package di;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class t3 implements Runnable {
    public final int f9776a;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f9777b;
    public final int f9778c;

    public t3(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int i7, int i10) {
        this.f9776a = i10;
        this.f9777b = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.f9778c = i7;
    }

    @Override
    public final void run() {
        switch (this.f9776a) {
            case 0:
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f9777b;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack() != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(this.f9778c);
                    return;
                }
                return;
            default:
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = this.f9777b;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout2.getSwipeBack() != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout2.getSwipeBack().e(this.f9778c);
                    return;
                }
                return;
        }
    }
}

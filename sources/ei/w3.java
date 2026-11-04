package ei;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class w3 implements Runnable {
    public final int f11177a;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f11178b;
    public final int f11179c;

    public w3(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int i3, int i10) {
        this.f11177a = i10;
        this.f11178b = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.f11179c = i3;
    }

    @Override
    public final void run() {
        switch (this.f11177a) {
            case 0:
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f11178b;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack() != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(this.f11179c);
                    return;
                }
                return;
            default:
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = this.f11178b;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout2.getSwipeBack() != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout2.getSwipeBack().e(this.f11179c);
                    return;
                }
                return;
        }
    }
}

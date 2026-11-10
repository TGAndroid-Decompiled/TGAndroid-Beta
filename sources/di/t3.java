package di;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class t3 implements Runnable {
    public final int f9781a;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f9782b;
    public final int f9783c;

    public t3(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int i7, int i10) {
        this.f9781a = i10;
        this.f9782b = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.f9783c = i7;
    }

    @Override
    public final void run() {
        switch (this.f9781a) {
            case 0:
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f9782b;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack() != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(this.f9783c);
                    return;
                }
                return;
            default:
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = this.f9782b;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout2.getSwipeBack() != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout2.getSwipeBack().e(this.f9783c);
                    return;
                }
                return;
        }
    }
}

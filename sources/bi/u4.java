package bi;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class u4 implements Runnable {
    public final int f3900a;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f3901b;

    public u4(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int i7) {
        this.f3900a = i7;
        this.f3901b = actionBarPopupWindow$ActionBarPopupWindowLayout;
    }

    @Override
    public final void run() {
        switch (this.f3900a) {
            case 0:
                org.telegram.messenger.g0.v1(this.f3901b);
                return;
            default:
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f3901b;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack() != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
                    return;
                }
                return;
        }
    }
}

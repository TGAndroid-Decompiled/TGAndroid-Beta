package bi;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class c7 implements Runnable {
    public final int f3502a;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f3503b;

    public c7(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int i7) {
        this.f3502a = i7;
        this.f3503b = actionBarPopupWindow$ActionBarPopupWindowLayout;
    }

    @Override
    public final void run() {
        switch (this.f3502a) {
            case 0:
                org.telegram.messenger.g0.v1(this.f3503b);
                return;
            default:
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f3503b;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack() != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
                    return;
                }
                return;
        }
    }
}

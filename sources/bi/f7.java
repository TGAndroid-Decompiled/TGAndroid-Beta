package bi;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class f7 implements Runnable {
    public final int f3633a;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f3634b;

    public f7(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int i7) {
        this.f3633a = i7;
        this.f3634b = actionBarPopupWindow$ActionBarPopupWindowLayout;
    }

    @Override
    public final void run() {
        switch (this.f3633a) {
            case 0:
                org.telegram.messenger.g0.v1(this.f3634b);
                return;
            default:
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f3634b;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack() != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
                    return;
                }
                return;
        }
    }
}

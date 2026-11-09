package di;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class u3 implements Runnable {
    public final int f9822a;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f9823b;

    public u3(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int i7) {
        this.f9822a = i7;
        this.f9823b = actionBarPopupWindow$ActionBarPopupWindowLayout;
    }

    @Override
    public final void run() {
        switch (this.f9822a) {
            case 0:
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f9823b;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack() != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
                    return;
                }
                return;
            default:
                org.telegram.messenger.g0.v1(this.f9823b);
                return;
        }
    }
}

package lh;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class q3 implements Runnable {
    public final int f16121a;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f16122b;
    public final int f16123c;

    public q3(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int i10, int i11) {
        this.f16121a = i11;
        this.f16122b = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.f16123c = i10;
    }

    @Override
    public final void run() {
        switch (this.f16121a) {
            case 0:
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f16122b;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack() != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(this.f16123c);
                    return;
                }
                return;
            default:
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = this.f16122b;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout2.getSwipeBack() != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout2.getSwipeBack().e(this.f16123c);
                    return;
                }
                return;
        }
    }
}

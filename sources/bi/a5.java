package bi;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class a5 implements Runnable {
    public final int f2827a;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f2828b;
    public final int f2829c;

    public a5(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int i10, int i11) {
        this.f2827a = i11;
        this.f2828b = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.f2829c = i10;
    }

    @Override
    public final void run() {
        switch (this.f2827a) {
            case 0:
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f2828b;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack() != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(this.f2829c);
                    return;
                }
                return;
            default:
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = this.f2828b;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout2.getSwipeBack() != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout2.getSwipeBack().e(this.f2829c);
                    return;
                }
                return;
        }
    }
}

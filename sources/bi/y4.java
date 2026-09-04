package bi;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class y4 implements Runnable {
    public final int f4012a;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f4013b;
    public final int f4014c;

    public y4(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int i10, int i11) {
        this.f4012a = i11;
        this.f4013b = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.f4014c = i10;
    }

    @Override
    public final void run() {
        switch (this.f4012a) {
            case 0:
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f4013b;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack() != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(this.f4014c);
                    return;
                }
                return;
            default:
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = this.f4013b;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout2.getSwipeBack() != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout2.getSwipeBack().e(this.f4014c);
                    return;
                }
                return;
        }
    }
}

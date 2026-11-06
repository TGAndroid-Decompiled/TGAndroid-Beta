package di;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class t3 implements Runnable {
    public final int f9782a;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f9783b;
    public final int f9784c;

    public t3(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int i7, int i10) {
        this.f9782a = i10;
        this.f9783b = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.f9784c = i7;
    }

    @Override
    public final void run() {
        switch (this.f9782a) {
            case 0:
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f9783b;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack() != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(this.f9784c);
                    return;
                }
                return;
            default:
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = this.f9783b;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout2.getSwipeBack() != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout2.getSwipeBack().e(this.f9784c);
                    return;
                }
                return;
        }
    }
}

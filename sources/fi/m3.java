package fi;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class m3 implements Runnable {
    public final int f12261a;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f12262b;
    public final int f12263c;

    public m3(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int i7, int i10) {
        this.f12261a = i10;
        this.f12262b = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.f12263c = i7;
    }

    @Override
    public final void run() {
        switch (this.f12261a) {
            case 0:
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f12262b;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack() != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(this.f12263c);
                    return;
                }
                return;
            default:
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = this.f12262b;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout2.getSwipeBack() != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout2.getSwipeBack().e(this.f12263c);
                    return;
                }
                return;
        }
    }
}

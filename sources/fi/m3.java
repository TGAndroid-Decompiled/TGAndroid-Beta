package fi;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class m3 implements Runnable {
    public final int f12307a;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f12308b;
    public final int f12309c;

    public m3(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int i7, int i10) {
        this.f12307a = i10;
        this.f12308b = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.f12309c = i7;
    }

    @Override
    public final void run() {
        switch (this.f12307a) {
            case 0:
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f12308b;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack() != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(this.f12309c);
                    return;
                }
                return;
            default:
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = this.f12308b;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout2.getSwipeBack() != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout2.getSwipeBack().e(this.f12309c);
                    return;
                }
                return;
        }
    }
}

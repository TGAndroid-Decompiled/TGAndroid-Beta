package ih;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class w3 implements Runnable {
    public final int f12289a;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f12290b;
    public final int f12291c;

    public w3(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int i9, int i10) {
        this.f12289a = i10;
        this.f12290b = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.f12291c = i9;
    }

    @Override
    public final void run() {
        switch (this.f12289a) {
            case 0:
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f12290b;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack() != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(this.f12291c);
                    return;
                }
                return;
            default:
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = this.f12290b;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout2.getSwipeBack() != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout2.getSwipeBack().e(this.f12291c);
                    return;
                }
                return;
        }
    }
}

package di;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class a4 implements Runnable {
    public final int f8366a;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f8367b;
    public final int f8368c;

    public a4(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int i10, int i11) {
        this.f8366a = i11;
        this.f8367b = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.f8368c = i10;
    }

    @Override
    public final void run() {
        switch (this.f8366a) {
            case 0:
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f8367b;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack() != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(this.f8368c);
                    return;
                }
                return;
            default:
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = this.f8367b;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout2.getSwipeBack() != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout2.getSwipeBack().e(this.f8368c);
                    return;
                }
                return;
        }
    }
}

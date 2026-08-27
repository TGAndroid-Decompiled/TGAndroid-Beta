package jh;

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

public final class s3 implements Runnable {

    public final int f13938a;

    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f13939b;

    public final int f13940c;

    public s3(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int i10, int i11) {
        this.f13938a = i11;
        this.f13939b = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.f13940c = i10;
    }

    @Override
    public final void run() {
        switch (this.f13938a) {
            case 0:
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f13939b;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack() != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(this.f13940c);
                }
                break;
            default:
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = this.f13939b;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout2.getSwipeBack() != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout2.getSwipeBack().e(this.f13940c);
                }
                break;
        }
    }
}

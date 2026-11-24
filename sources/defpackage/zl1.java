package defpackage;

import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class zl1 implements View.OnClickListener {
    public final byte a;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout b;

    public zl1(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, byte b) {
        this.a = b;
        this.b = actionBarPopupWindow$ActionBarPopupWindowLayout;
    }

    @Override
    public final void onClick(View view) {
        byte b = this.a;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.b;
        switch (b) {
            case 0:
                actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
                return;
            case 1:
                actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
                return;
            case 2:
                actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
                return;
            default:
                actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
                return;
        }
    }
}

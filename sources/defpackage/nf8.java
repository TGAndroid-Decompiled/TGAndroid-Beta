package defpackage;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.PopupNotificationActivity;
public final class nf8 implements ViewTreeObserver.OnPreDrawListener {
    public final byte a;
    public final PopupNotificationActivity b;

    public nf8(PopupNotificationActivity popupNotificationActivity, byte b) {
        this.a = b;
        this.b = popupNotificationActivity;
    }

    @Override
    public final boolean onPreDraw() {
        byte b = this.a;
        PopupNotificationActivity popupNotificationActivity = this.b;
        switch (b) {
            case 0:
                FrameLayout frameLayout = popupNotificationActivity.f;
                if (frameLayout != null) {
                    frameLayout.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                int D = ug8.D(48.0f, a.getCurrentActionBarHeight(), 2);
                FrameLayout frameLayout2 = popupNotificationActivity.f;
                frameLayout2.setPadding(frameLayout2.getPaddingLeft(), D, popupNotificationActivity.f.getPaddingRight(), D);
                return true;
            default:
                popupNotificationActivity.n.getViewTreeObserver().removeOnPreDrawListener(this);
                if (!popupNotificationActivity.c() && !popupNotificationActivity.Y) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) popupNotificationActivity.n.getLayoutParams();
                    marginLayoutParams.topMargin = a.getCurrentActionBarHeight();
                    marginLayoutParams.bottomMargin = gl.L(48.0f);
                    marginLayoutParams.width = -1;
                    marginLayoutParams.height = -1;
                    popupNotificationActivity.n.setLayoutParams(marginLayoutParams);
                    popupNotificationActivity.a(0);
                }
                return true;
        }
    }
}

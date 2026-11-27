package defpackage;

import android.window.OnBackInvokedCallback;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.LaunchActivity;
public final class b26 implements OnBackInvokedCallback {
    public final LaunchActivity a;

    public b26(LaunchActivity launchActivity) {
        this.a = launchActivity;
    }

    public final void onBackInvoked() {
        boolean O1 = hl.O1();
        LaunchActivity launchActivity = this.a;
        if (O1) {
            launchActivity.onBackPressed();
        } else if (!launchActivity.d0(true)) {
        } else {
            ActionBarLayout actionBarLayout = launchActivity.p0;
            if (actionBarLayout != null) {
                if (!actionBarLayout.j1) {
                    actionBarLayout.G();
                    return;
                }
                actionBarLayout.j1 = false;
                actionBarLayout.d(false);
                return;
            }
            launchActivity.onBackPressed();
        }
    }
}

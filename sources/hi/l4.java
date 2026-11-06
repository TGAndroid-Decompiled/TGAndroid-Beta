package hi;

import android.app.Activity;
import android.content.Context;
import org.telegram.ui.LaunchActivity;
public final class l4 extends org.telegram.ui.ActionBar.f2 {
    @Override
    public final Context getContext() {
        return org.telegram.messenger.g0.W(LaunchActivity.G1);
    }

    @Override
    public final int getCurrentAccount() {
        return this.currentAccount;
    }

    @Override
    public final Activity getParentActivity() {
        Activity W = org.telegram.messenger.g0.W(org.telegram.messenger.t0.f25563b);
        if (W == null) {
            return LaunchActivity.G1;
        }
        return W;
    }
}

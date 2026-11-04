package ii;

import android.app.Activity;
import android.content.Context;
import org.telegram.ui.LaunchActivity;
public final class k4 extends org.telegram.ui.ActionBar.d2 {
    @Override
    public final Context getContext() {
        return org.telegram.messenger.g0.W(LaunchActivity.K1);
    }

    @Override
    public final int getCurrentAccount() {
        return this.currentAccount;
    }

    @Override
    public final Activity getParentActivity() {
        Activity W = org.telegram.messenger.g0.W(org.telegram.messenger.t0.f25457b);
        if (W == null) {
            return LaunchActivity.K1;
        }
        return W;
    }
}

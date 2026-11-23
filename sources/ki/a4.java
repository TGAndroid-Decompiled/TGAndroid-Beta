package ki;

import android.app.Activity;
import android.content.Context;
import org.telegram.ui.LaunchActivity;
public final class a4 extends org.telegram.ui.ActionBar.g2 {
    @Override
    public final Context getContext() {
        return org.telegram.messenger.g0.W(LaunchActivity.H1);
    }

    @Override
    public final int getCurrentAccount() {
        return this.currentAccount;
    }

    @Override
    public final Activity getParentActivity() {
        Activity W = org.telegram.messenger.g0.W(org.telegram.messenger.t0.f27013b);
        if (W == null) {
            return LaunchActivity.H1;
        }
        return W;
    }
}

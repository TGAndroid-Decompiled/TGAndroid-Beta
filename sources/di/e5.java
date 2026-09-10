package di;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.ui.LaunchActivity;
public final class e5 extends org.telegram.ui.ActionBar.p2 {
    @Override
    public final Context getContext() {
        return AndroidUtilities.findActivity(LaunchActivity.G1);
    }

    @Override
    public final int getCurrentAccount() {
        return this.currentAccount;
    }

    @Override
    public final Activity getParentActivity() {
        Activity findActivity = AndroidUtilities.findActivity(ApplicationLoader.applicationContext);
        if (findActivity == null) {
            return LaunchActivity.G1;
        }
        return findActivity;
    }
}

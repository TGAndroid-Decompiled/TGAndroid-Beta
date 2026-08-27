package nh;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.ui.LaunchActivity;

public final class l4 extends org.telegram.ui.ActionBar.n2 {
    @Override
    public final Context getContext() {
        return AndroidUtilities.findActivity(LaunchActivity.C1);
    }

    @Override
    public final int getCurrentAccount() {
        return this.currentAccount;
    }

    @Override
    public final Activity getParentActivity() {
        Activity activityFindActivity = AndroidUtilities.findActivity(ApplicationLoader.applicationContext);
        return activityFindActivity == null ? LaunchActivity.C1 : activityFindActivity;
    }
}

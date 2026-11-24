package defpackage;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.a;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
public final class vaa extends d {
    @Override
    public final Context getContext() {
        return gm.W(LaunchActivity.H1);
    }

    @Override
    public final int getCurrentAccount() {
        return this.currentAccount;
    }

    @Override
    public final Activity getParentActivity() {
        Activity W = gm.W(a.b);
        if (W == null) {
            return LaunchActivity.H1;
        }
        return W;
    }
}

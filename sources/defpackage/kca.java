package defpackage;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.a;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
public final class kca extends e {
    @Override
    public final Context getContext() {
        return hl.W(LaunchActivity.H1);
    }

    @Override
    public final int getCurrentAccount() {
        return this.currentAccount;
    }

    @Override
    public final Activity getParentActivity() {
        Activity W = hl.W(a.b);
        if (W == null) {
            return LaunchActivity.H1;
        }
        return W;
    }
}

package ci;

import android.os.Bundle;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.wm;
public final class u3 implements Runnable {
    public final int f6083a;
    public final long f6084b;

    public u3(long j10, int i3) {
        this.f6083a = i3;
        this.f6084b = j10;
    }

    @Override
    public final void run() {
        switch (this.f6083a) {
            case 0:
                org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
                if (T != null) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", this.f6084b);
                    bundle.putBoolean("my_profile", true);
                    bundle.putBoolean("open_gifts", true);
                    T.presentFragment(new ProfileActivity(bundle, null));
                    return;
                }
                return;
            case 1:
                org.telegram.ui.ActionBar.d2 T2 = LaunchActivity.T();
                if (T2 != null) {
                    T2.presentFragment(wm.ra(this.f6084b));
                    return;
                }
                return;
            case 2:
                org.telegram.ui.ActionBar.d2 T3 = LaunchActivity.T();
                if (T3 != null) {
                    T3.presentFragment(wm.ra(this.f6084b));
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.d2 T4 = LaunchActivity.T();
                if (T4 != null) {
                    T4.presentFragment(wm.ra(this.f6084b));
                    return;
                }
                return;
        }
    }
}

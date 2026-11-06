package bi;

import android.os.Bundle;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.an;
public final class k4 implements Runnable {
    public final int f4144a;
    public final long f4145b;

    public k4(long j3, int i7) {
        this.f4144a = i7;
        this.f4145b = j3;
    }

    @Override
    public final void run() {
        switch (this.f4144a) {
            case 0:
                org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                if (T != null) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", this.f4145b);
                    bundle.putBoolean("my_profile", true);
                    bundle.putBoolean("open_gifts", true);
                    T.presentFragment(new ProfileActivity(bundle, null));
                    return;
                }
                return;
            case 1:
                org.telegram.ui.ActionBar.f2 T2 = LaunchActivity.T();
                if (T2 != null) {
                    T2.presentFragment(an.ra(this.f4145b));
                    return;
                }
                return;
            case 2:
                org.telegram.ui.ActionBar.f2 T3 = LaunchActivity.T();
                if (T3 != null) {
                    T3.presentFragment(an.ra(this.f4145b));
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.f2 T4 = LaunchActivity.T();
                if (T4 != null) {
                    T4.presentFragment(an.ra(this.f4145b));
                    return;
                }
                return;
        }
    }
}

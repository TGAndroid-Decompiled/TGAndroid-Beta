package bi;

import android.os.Bundle;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.wn;
public final class j4 implements Runnable {
    public final int f4868a;
    public final long f4869b;

    public j4(long j10, int i10) {
        this.f4868a = i10;
        this.f4869b = j10;
    }

    @Override
    public final void run() {
        switch (this.f4868a) {
            case 0:
                org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
                if (U != null) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", this.f4869b);
                    bundle.putBoolean("my_profile", true);
                    bundle.putBoolean("open_gifts", true);
                    U.presentFragment(new ProfileActivity(bundle, null));
                    return;
                }
                return;
            case 1:
                org.telegram.ui.ActionBar.r2 U2 = LaunchActivity.U();
                if (U2 != null) {
                    U2.presentFragment(wn.ea(this.f4869b));
                    return;
                }
                return;
            case 2:
                org.telegram.ui.ActionBar.r2 U3 = LaunchActivity.U();
                if (U3 != null) {
                    U3.presentFragment(wn.ea(this.f4869b));
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.r2 U4 = LaunchActivity.U();
                if (U4 != null) {
                    U4.presentFragment(wn.ea(this.f4869b));
                    return;
                }
                return;
        }
    }
}

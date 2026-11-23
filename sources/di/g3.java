package di;

import android.os.Bundle;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.bn;
public final class g3 implements Runnable {
    public final int f8888a;
    public final long f8889b;

    public g3(long j3, int i7) {
        this.f8888a = i7;
        this.f8889b = j3;
    }

    @Override
    public final void run() {
        switch (this.f8888a) {
            case 0:
                org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                if (T != null) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", this.f8889b);
                    bundle.putBoolean("my_profile", true);
                    bundle.putBoolean("open_gifts", true);
                    T.presentFragment(new ProfileActivity(bundle, null));
                    return;
                }
                return;
            case 1:
                org.telegram.ui.ActionBar.g2 T2 = LaunchActivity.T();
                if (T2 != null) {
                    T2.presentFragment(bn.ua(this.f8889b));
                    return;
                }
                return;
            case 2:
                org.telegram.ui.ActionBar.g2 T3 = LaunchActivity.T();
                if (T3 != null) {
                    T3.presentFragment(bn.ua(this.f8889b));
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.g2 T4 = LaunchActivity.T();
                if (T4 != null) {
                    T4.presentFragment(bn.ua(this.f8889b));
                    return;
                }
                return;
        }
    }
}

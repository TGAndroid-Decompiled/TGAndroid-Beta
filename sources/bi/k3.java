package bi;

import android.os.Bundle;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.d51;
public final class k3 implements Runnable {
    public final int f4141a = 0;
    public final org.telegram.ui.ActionBar.f2 f4142b;
    public final long f4143c;

    public k3(long j3, org.telegram.ui.ActionBar.f2 f2Var) {
        this.f4143c = j3;
        this.f4142b = f2Var;
    }

    @Override
    public final void run() {
        switch (this.f4141a) {
            case 0:
                Bundle bundle = new Bundle();
                long j3 = this.f4143c;
                if (j3 >= 0) {
                    bundle.putLong("user_id", j3);
                } else {
                    bundle.putLong("chat_id", -j3);
                }
                bundle.putBoolean("my_profile", true);
                bundle.putBoolean("open_gifts", true);
                this.f4142b.presentFragment(new ProfileActivity(bundle, null));
                return;
            default:
                org.telegram.ui.ActionBar.f2 f2Var = this.f4142b;
                f2Var.presentFragment(d51.g0(f2Var.getMessagesController().M0(Long.valueOf(-this.f4143c)), true));
                return;
        }
    }

    public k3(org.telegram.ui.ActionBar.f2 f2Var, long j3) {
        this.f4142b = f2Var;
        this.f4143c = j3;
    }
}

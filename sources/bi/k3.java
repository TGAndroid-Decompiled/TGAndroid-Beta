package bi;

import android.os.Bundle;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.e51;
public final class k3 implements Runnable {
    public final int f4138a = 0;
    public final org.telegram.ui.ActionBar.f2 f4139b;
    public final long f4140c;

    public k3(long j3, org.telegram.ui.ActionBar.f2 f2Var) {
        this.f4140c = j3;
        this.f4139b = f2Var;
    }

    @Override
    public final void run() {
        switch (this.f4138a) {
            case 0:
                Bundle bundle = new Bundle();
                long j3 = this.f4140c;
                if (j3 >= 0) {
                    bundle.putLong("user_id", j3);
                } else {
                    bundle.putLong("chat_id", -j3);
                }
                bundle.putBoolean("my_profile", true);
                bundle.putBoolean("open_gifts", true);
                this.f4139b.presentFragment(new ProfileActivity(bundle, null));
                return;
            default:
                org.telegram.ui.ActionBar.f2 f2Var = this.f4139b;
                f2Var.presentFragment(e51.g0(f2Var.getMessagesController().M0(Long.valueOf(-this.f4140c)), true));
                return;
        }
    }

    public k3(org.telegram.ui.ActionBar.f2 f2Var, long j3) {
        this.f4139b = f2Var;
        this.f4140c = j3;
    }
}

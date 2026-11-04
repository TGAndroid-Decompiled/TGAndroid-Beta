package ci;

import android.os.Bundle;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.r41;
public final class x2 implements Runnable {
    public final int f6328a = 0;
    public final org.telegram.ui.ActionBar.d2 f6329b;
    public final long f6330c;

    public x2(long j10, org.telegram.ui.ActionBar.d2 d2Var) {
        this.f6330c = j10;
        this.f6329b = d2Var;
    }

    @Override
    public final void run() {
        switch (this.f6328a) {
            case 0:
                Bundle bundle = new Bundle();
                long j10 = this.f6330c;
                if (j10 >= 0) {
                    bundle.putLong("user_id", j10);
                } else {
                    bundle.putLong("chat_id", -j10);
                }
                bundle.putBoolean("my_profile", true);
                bundle.putBoolean("open_gifts", true);
                this.f6329b.presentFragment(new ProfileActivity(bundle, null));
                return;
            default:
                org.telegram.ui.ActionBar.d2 d2Var = this.f6329b;
                d2Var.presentFragment(r41.g0(d2Var.getMessagesController().M0(Long.valueOf(-this.f6330c)), true));
                return;
        }
    }

    public x2(org.telegram.ui.ActionBar.d2 d2Var, long j10) {
        this.f6329b = d2Var;
        this.f6330c = j10;
    }
}

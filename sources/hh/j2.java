package hh;

import android.os.Bundle;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.q91;

public final class j2 implements Runnable {

    public final int f9518a = 0;

    public final org.telegram.ui.ActionBar.n2 f9519b;

    public final long f9520c;

    public j2(long j10, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f9520c = j10;
        this.f9519b = n2Var;
    }

    @Override
    public final void run() {
        switch (this.f9518a) {
            case 0:
                Bundle bundle = new Bundle();
                long j10 = this.f9520c;
                if (j10 >= 0) {
                    bundle.putLong("user_id", j10);
                } else {
                    bundle.putLong("chat_id", -j10);
                }
                bundle.putBoolean("my_profile", true);
                bundle.putBoolean("open_gifts", true);
                this.f9519b.presentFragment(new ProfileActivity(bundle, null));
                break;
            default:
                org.telegram.ui.ActionBar.n2 n2Var = this.f9519b;
                n2Var.presentFragment(q91.d0(n2Var.getMessagesController().getChat(Long.valueOf(-this.f9520c)), true));
                break;
        }
    }

    public j2(org.telegram.ui.ActionBar.n2 n2Var, long j10) {
        this.f9519b = n2Var;
        this.f9520c = j10;
    }
}

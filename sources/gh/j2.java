package gh;

import android.os.Bundle;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.s91;
public final class j2 implements Runnable {
    public final int f8332a = 0;
    public final org.telegram.ui.ActionBar.o2 f8333b;
    public final long f8334c;

    public j2(long j10, org.telegram.ui.ActionBar.o2 o2Var) {
        this.f8334c = j10;
        this.f8333b = o2Var;
    }

    @Override
    public final void run() {
        switch (this.f8332a) {
            case 0:
                Bundle bundle = new Bundle();
                long j10 = this.f8334c;
                if (j10 >= 0) {
                    bundle.putLong("user_id", j10);
                } else {
                    bundle.putLong("chat_id", -j10);
                }
                bundle.putBoolean("my_profile", true);
                bundle.putBoolean("open_gifts", true);
                this.f8333b.presentFragment(new ProfileActivity(bundle, null));
                return;
            default:
                org.telegram.ui.ActionBar.o2 o2Var = this.f8333b;
                o2Var.presentFragment(s91.c0(o2Var.getMessagesController().getChat(Long.valueOf(-this.f8334c)), true));
                return;
        }
    }

    public j2(org.telegram.ui.ActionBar.o2 o2Var, long j10) {
        this.f8333b = o2Var;
        this.f8334c = j10;
    }
}

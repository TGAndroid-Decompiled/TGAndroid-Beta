package lh;

import android.os.Bundle;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.oa1;
public final class h2 implements Runnable {
    public final int f12519a = 0;
    public final org.telegram.ui.ActionBar.p2 f12520b;
    public final long f12521c;

    public h2(long j10, org.telegram.ui.ActionBar.p2 p2Var) {
        this.f12521c = j10;
        this.f12520b = p2Var;
    }

    @Override
    public final void run() {
        switch (this.f12519a) {
            case 0:
                Bundle bundle = new Bundle();
                long j10 = this.f12521c;
                if (j10 >= 0) {
                    bundle.putLong("user_id", j10);
                } else {
                    bundle.putLong("chat_id", -j10);
                }
                bundle.putBoolean("my_profile", true);
                bundle.putBoolean("open_gifts", true);
                this.f12520b.presentFragment(new ProfileActivity(bundle, null));
                return;
            default:
                org.telegram.ui.ActionBar.p2 p2Var = this.f12520b;
                p2Var.presentFragment(oa1.d0(p2Var.getMessagesController().getChat(Long.valueOf(-this.f12521c)), true));
                return;
        }
    }

    public h2(org.telegram.ui.ActionBar.p2 p2Var, long j10) {
        this.f12520b = p2Var;
        this.f12521c = j10;
    }
}

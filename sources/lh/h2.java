package lh;

import android.os.Bundle;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ga1;
public final class h2 implements Runnable {
    public final int f12535a = 0;
    public final org.telegram.ui.ActionBar.p2 f12536b;
    public final long f12537c;

    public h2(long j10, org.telegram.ui.ActionBar.p2 p2Var) {
        this.f12537c = j10;
        this.f12536b = p2Var;
    }

    @Override
    public final void run() {
        switch (this.f12535a) {
            case 0:
                Bundle bundle = new Bundle();
                long j10 = this.f12537c;
                if (j10 >= 0) {
                    bundle.putLong("user_id", j10);
                } else {
                    bundle.putLong("chat_id", -j10);
                }
                bundle.putBoolean("my_profile", true);
                bundle.putBoolean("open_gifts", true);
                this.f12536b.presentFragment(new ProfileActivity(bundle, null));
                return;
            default:
                org.telegram.ui.ActionBar.p2 p2Var = this.f12536b;
                p2Var.presentFragment(ga1.d0(p2Var.getMessagesController().getChat(Long.valueOf(-this.f12537c)), true));
                return;
        }
    }

    public h2(org.telegram.ui.ActionBar.p2 p2Var, long j10) {
        this.f12536b = p2Var;
        this.f12537c = j10;
    }
}

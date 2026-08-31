package mh;

import android.os.Bundle;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ha1;
public final class g2 implements Runnable {
    public final int f14074a = 0;
    public final org.telegram.ui.ActionBar.p2 f14075b;
    public final long f14076c;

    public g2(long j10, org.telegram.ui.ActionBar.p2 p2Var) {
        this.f14076c = j10;
        this.f14075b = p2Var;
    }

    @Override
    public final void run() {
        switch (this.f14074a) {
            case 0:
                Bundle bundle = new Bundle();
                long j10 = this.f14076c;
                if (j10 >= 0) {
                    bundle.putLong("user_id", j10);
                } else {
                    bundle.putLong("chat_id", -j10);
                }
                bundle.putBoolean("my_profile", true);
                bundle.putBoolean("open_gifts", true);
                this.f14075b.presentFragment(new ProfileActivity(bundle, null));
                return;
            default:
                org.telegram.ui.ActionBar.p2 p2Var = this.f14075b;
                p2Var.presentFragment(ha1.d0(p2Var.getMessagesController().getChat(Long.valueOf(-this.f14076c)), true));
                return;
        }
    }

    public g2(org.telegram.ui.ActionBar.p2 p2Var, long j10) {
        this.f14075b = p2Var;
        this.f14076c = j10;
    }
}

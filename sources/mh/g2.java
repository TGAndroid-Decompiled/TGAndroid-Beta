package mh;

import android.os.Bundle;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.na1;
public final class g2 implements Runnable {
    public final int f14076a = 0;
    public final org.telegram.ui.ActionBar.p2 f14077b;
    public final long f14078c;

    public g2(long j10, org.telegram.ui.ActionBar.p2 p2Var) {
        this.f14078c = j10;
        this.f14077b = p2Var;
    }

    @Override
    public final void run() {
        switch (this.f14076a) {
            case 0:
                Bundle bundle = new Bundle();
                long j10 = this.f14078c;
                if (j10 >= 0) {
                    bundle.putLong("user_id", j10);
                } else {
                    bundle.putLong("chat_id", -j10);
                }
                bundle.putBoolean("my_profile", true);
                bundle.putBoolean("open_gifts", true);
                this.f14077b.presentFragment(new ProfileActivity(bundle, null));
                return;
            default:
                org.telegram.ui.ActionBar.p2 p2Var = this.f14077b;
                p2Var.presentFragment(na1.d0(p2Var.getMessagesController().getChat(Long.valueOf(-this.f14078c)), true));
                return;
        }
    }

    public g2(org.telegram.ui.ActionBar.p2 p2Var, long j10) {
        this.f14077b = p2Var;
        this.f14078c = j10;
    }
}

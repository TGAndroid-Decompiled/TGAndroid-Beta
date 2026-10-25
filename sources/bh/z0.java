package bh;

import android.os.Bundle;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.w91;
public final class z0 implements Runnable {
    public final int f4239a = 1;
    public final long f4240b;
    public final r2 f4241c;

    public z0(long j10, r2 r2Var) {
        this.f4240b = j10;
        this.f4241c = r2Var;
    }

    @Override
    public final void run() {
        switch (this.f4239a) {
            case 0:
                r2 r2Var = this.f4241c;
                r2Var.presentFragment(w91.c0(r2Var.getMessagesController().getChat(Long.valueOf(-this.f4240b)), true));
                return;
            default:
                Bundle bundle = new Bundle();
                long j10 = this.f4240b;
                if (j10 >= 0) {
                    bundle.putLong("user_id", j10);
                } else {
                    bundle.putLong("chat_id", -j10);
                }
                bundle.putBoolean("my_profile", true);
                bundle.putBoolean("open_gifts", true);
                this.f4241c.presentFragment(new ProfileActivity(bundle, null));
                return;
        }
    }

    public z0(r2 r2Var, long j10) {
        this.f4241c = r2Var;
        this.f4240b = j10;
    }
}

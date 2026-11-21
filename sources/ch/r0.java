package ch;

import android.os.Bundle;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.c51;
public final class r0 implements Runnable {
    public final int f5532a = 1;
    public final long f5533b;
    public final g2 f5534c;

    public r0(long j3, g2 g2Var) {
        this.f5533b = j3;
        this.f5534c = g2Var;
    }

    @Override
    public final void run() {
        switch (this.f5532a) {
            case 0:
                g2 g2Var = this.f5534c;
                g2Var.presentFragment(c51.g0(g2Var.getMessagesController().O0(Long.valueOf(-this.f5533b)), true));
                return;
            default:
                Bundle bundle = new Bundle();
                long j3 = this.f5533b;
                if (j3 >= 0) {
                    bundle.putLong("user_id", j3);
                } else {
                    bundle.putLong("chat_id", -j3);
                }
                bundle.putBoolean("my_profile", true);
                bundle.putBoolean("open_gifts", true);
                this.f5534c.presentFragment(new ProfileActivity(bundle, null));
                return;
        }
    }

    public r0(g2 g2Var, long j3) {
        this.f5534c = g2Var;
        this.f5533b = j3;
    }
}

package ch;

import android.os.Bundle;
import org.telegram.ui.ActionBar.h2;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.c51;
public final class r0 implements Runnable {
    public final int f5503a = 1;
    public final long f5504b;
    public final h2 f5505c;

    public r0(long j3, h2 h2Var) {
        this.f5504b = j3;
        this.f5505c = h2Var;
    }

    @Override
    public final void run() {
        switch (this.f5503a) {
            case 0:
                h2 h2Var = this.f5505c;
                h2Var.presentFragment(c51.g0(h2Var.getMessagesController().O0(Long.valueOf(-this.f5504b)), true));
                return;
            default:
                Bundle bundle = new Bundle();
                long j3 = this.f5504b;
                if (j3 >= 0) {
                    bundle.putLong("user_id", j3);
                } else {
                    bundle.putLong("chat_id", -j3);
                }
                bundle.putBoolean("my_profile", true);
                bundle.putBoolean("open_gifts", true);
                this.f5505c.presentFragment(new ProfileActivity(bundle, null));
                return;
        }
    }

    public r0(h2 h2Var, long j3) {
        this.f5505c = h2Var;
        this.f5504b = j3;
    }
}

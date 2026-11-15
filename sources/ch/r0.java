package ch;

import android.os.Bundle;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.z41;
public final class r0 implements Runnable {
    public final int f5228a = 1;
    public final long f5229b;
    public final e2 f5230c;

    public r0(long j3, e2 e2Var) {
        this.f5229b = j3;
        this.f5230c = e2Var;
    }

    @Override
    public final void run() {
        switch (this.f5228a) {
            case 0:
                e2 e2Var = this.f5230c;
                e2Var.presentFragment(z41.g0(e2Var.getMessagesController().M0(Long.valueOf(-this.f5229b)), true));
                return;
            default:
                Bundle bundle = new Bundle();
                long j3 = this.f5229b;
                if (j3 >= 0) {
                    bundle.putLong("user_id", j3);
                } else {
                    bundle.putLong("chat_id", -j3);
                }
                bundle.putBoolean("my_profile", true);
                bundle.putBoolean("open_gifts", true);
                this.f5230c.presentFragment(new ProfileActivity(bundle, null));
                return;
        }
    }

    public r0(e2 e2Var, long j3) {
        this.f5230c = e2Var;
        this.f5229b = j3;
    }
}

package ah;

import android.os.Bundle;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.t91;
public final class k1 implements Runnable {
    public final int f819a = 1;
    public final long f820b;
    public final o2 f821c;

    public k1(long j10, o2 o2Var) {
        this.f820b = j10;
        this.f821c = o2Var;
    }

    @Override
    public final void run() {
        switch (this.f819a) {
            case 0:
                o2 o2Var = this.f821c;
                o2Var.presentFragment(t91.d0(o2Var.getMessagesController().getChat(Long.valueOf(-this.f820b)), true));
                return;
            default:
                Bundle bundle = new Bundle();
                long j10 = this.f820b;
                if (j10 >= 0) {
                    bundle.putLong("user_id", j10);
                } else {
                    bundle.putLong("chat_id", -j10);
                }
                bundle.putBoolean("my_profile", true);
                bundle.putBoolean("open_gifts", true);
                this.f821c.presentFragment(new ProfileActivity(bundle, null));
                return;
        }
    }

    public k1(o2 o2Var, long j10) {
        this.f821c = o2Var;
        this.f820b = j10;
    }
}

package ah;

import android.os.Bundle;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.hb1;
public final class k1 implements Runnable {
    public final int f818a = 1;
    public final long f819b;
    public final m2 f820c;

    public k1(long j10, m2 m2Var) {
        this.f819b = j10;
        this.f820c = m2Var;
    }

    @Override
    public final void run() {
        switch (this.f818a) {
            case 0:
                m2 m2Var = this.f820c;
                m2Var.presentFragment(hb1.d0(m2Var.getMessagesController().getChat(Long.valueOf(-this.f819b)), true));
                return;
            default:
                Bundle bundle = new Bundle();
                long j10 = this.f819b;
                if (j10 >= 0) {
                    bundle.putLong("user_id", j10);
                } else {
                    bundle.putLong("chat_id", -j10);
                }
                bundle.putBoolean("my_profile", true);
                bundle.putBoolean("open_gifts", true);
                this.f820c.presentFragment(new ProfileActivity(bundle, null));
                return;
        }
    }

    public k1(m2 m2Var, long j10) {
        this.f820c = m2Var;
        this.f819b = j10;
    }
}

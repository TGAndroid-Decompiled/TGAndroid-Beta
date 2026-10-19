package ah;

import android.os.Bundle;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.p91;
public final class k1 implements Runnable {
    public final int f818a = 1;
    public final long f819b;
    public final n2 f820c;

    public k1(long j10, n2 n2Var) {
        this.f819b = j10;
        this.f820c = n2Var;
    }

    @Override
    public final void run() {
        switch (this.f818a) {
            case 0:
                n2 n2Var = this.f820c;
                n2Var.presentFragment(p91.d0(n2Var.getMessagesController().getChat(Long.valueOf(-this.f819b)), true));
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

    public k1(n2 n2Var, long j10) {
        this.f820c = n2Var;
        this.f819b = j10;
    }
}

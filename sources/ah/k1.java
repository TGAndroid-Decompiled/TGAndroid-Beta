package ah;

import android.os.Bundle;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.r91;
public final class k1 implements Runnable {
    public final int f820a = 1;
    public final long f821b;
    public final n2 f822c;

    public k1(long j10, n2 n2Var) {
        this.f821b = j10;
        this.f822c = n2Var;
    }

    @Override
    public final void run() {
        switch (this.f820a) {
            case 0:
                n2 n2Var = this.f822c;
                n2Var.presentFragment(r91.d0(n2Var.getMessagesController().getChat(Long.valueOf(-this.f821b)), true));
                return;
            default:
                Bundle bundle = new Bundle();
                long j10 = this.f821b;
                if (j10 >= 0) {
                    bundle.putLong("user_id", j10);
                } else {
                    bundle.putLong("chat_id", -j10);
                }
                bundle.putBoolean("my_profile", true);
                bundle.putBoolean("open_gifts", true);
                this.f822c.presentFragment(new ProfileActivity(bundle, null));
                return;
        }
    }

    public k1(n2 n2Var, long j10) {
        this.f822c = n2Var;
        this.f821b = j10;
    }
}

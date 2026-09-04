package ah;

import android.os.Bundle;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.bb1;
public final class l1 implements Runnable {
    public final int f634a = 1;
    public final long f635b;
    public final n2 f636c;

    public l1(long j3, n2 n2Var) {
        this.f635b = j3;
        this.f636c = n2Var;
    }

    @Override
    public final void run() {
        switch (this.f634a) {
            case 0:
                n2 n2Var = this.f636c;
                n2Var.presentFragment(bb1.d0(n2Var.getMessagesController().getChat(Long.valueOf(-this.f635b)), true));
                return;
            default:
                Bundle bundle = new Bundle();
                long j3 = this.f635b;
                if (j3 >= 0) {
                    bundle.putLong("user_id", j3);
                } else {
                    bundle.putLong("chat_id", -j3);
                }
                bundle.putBoolean("my_profile", true);
                bundle.putBoolean("open_gifts", true);
                this.f636c.presentFragment(new ProfileActivity(bundle, null));
                return;
        }
    }

    public l1(n2 n2Var, long j3) {
        this.f636c = n2Var;
        this.f635b = j3;
    }
}

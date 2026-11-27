package defpackage;

import android.os.Bundle;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.ProfileActivity;
public final class y49 implements Runnable {
    public final byte a = 1;
    public final long b;
    public final e c;

    public y49(long j, e eVar) {
        this.b = j;
        this.c = eVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        e eVar = this.c;
        long j = this.b;
        switch (b) {
            case 0:
                eVar.presentFragment(w1b.d0(eVar.getMessagesController().M0(Long.valueOf(-j)), true));
                return;
            default:
                Bundle bundle = new Bundle();
                if (j >= 0) {
                    bundle.putLong("user_id", j);
                } else {
                    bundle.putLong("chat_id", -j);
                }
                bundle.putBoolean("my_profile", true);
                bundle.putBoolean("open_gifts", true);
                eVar.presentFragment(new ProfileActivity(bundle, null));
                return;
        }
    }

    public y49(e eVar, long j) {
        this.c = eVar;
        this.b = j;
    }
}

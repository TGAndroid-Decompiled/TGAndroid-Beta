package defpackage;

import android.os.Bundle;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.ProfileActivity;
public final class m39 implements Runnable {
    public final byte a = 1;
    public final long b;
    public final d c;

    public m39(long j, d dVar) {
        this.b = j;
        this.c = dVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        d dVar = this.c;
        long j = this.b;
        switch (b) {
            case 0:
                dVar.presentFragment(xza.e0(dVar.getMessagesController().L0(Long.valueOf(-j)), true));
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
                dVar.presentFragment(new ProfileActivity(bundle, null));
                return;
        }
    }

    public m39(d dVar, long j) {
        this.c = dVar;
        this.b = j;
    }
}

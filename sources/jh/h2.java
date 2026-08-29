package jh;

import android.os.Bundle;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.t91;
public final class h2 implements Runnable {
    public final int f12154a = 0;
    public final org.telegram.ui.ActionBar.o2 f12155b;
    public final long f12156c;

    public h2(long j10, org.telegram.ui.ActionBar.o2 o2Var) {
        this.f12156c = j10;
        this.f12155b = o2Var;
    }

    @Override
    public final void run() {
        switch (this.f12154a) {
            case 0:
                Bundle bundle = new Bundle();
                long j10 = this.f12156c;
                if (j10 >= 0) {
                    bundle.putLong("user_id", j10);
                } else {
                    bundle.putLong("chat_id", -j10);
                }
                bundle.putBoolean("my_profile", true);
                bundle.putBoolean("open_gifts", true);
                this.f12155b.presentFragment(new ProfileActivity(bundle, null));
                return;
            default:
                org.telegram.ui.ActionBar.o2 o2Var = this.f12155b;
                o2Var.presentFragment(t91.d0(o2Var.getMessagesController().getChat(Long.valueOf(-this.f12156c)), true));
                return;
        }
    }

    public h2(org.telegram.ui.ActionBar.o2 o2Var, long j10) {
        this.f12155b = o2Var;
        this.f12156c = j10;
    }
}

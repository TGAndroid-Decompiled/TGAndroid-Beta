package jh;

import android.os.Bundle;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.jr;
import org.telegram.ui.pv0;
import org.telegram.ui.tn;
public final class a8 implements Runnable {
    public final int f11741a;
    public final long f11742b;
    public final int f11743c;

    public a8(int i10, long j10) {
        this.f11741a = 2;
        this.f11743c = i10;
        this.f11742b = j10;
    }

    @Override
    public final void run() {
        switch (this.f11741a) {
            case 0:
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                if (U != null) {
                    long j10 = this.f11742b;
                    if (j10 >= 0) {
                        U.presentFragment(new PrivacyControlActivity(10, false));
                        return;
                    }
                    int i10 = this.f11743c;
                    long j11 = -j10;
                    if (ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(i10).getChat(Long.valueOf(j11)))) {
                        U.presentFragment(new pv0(j11));
                        return;
                    }
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", j11);
                    bundle.putInt("type", 3);
                    jr jrVar = new jr(bundle);
                    jrVar.x0(MessagesController.getInstance(i10).getChatFull(j11));
                    U.presentFragment(jrVar);
                    return;
                }
                return;
            case 1:
                org.telegram.ui.ActionBar.o2 U2 = LaunchActivity.U();
                if (U2 != null) {
                    U2.presentFragment(tn.Q9(this.f11743c, this.f11742b));
                    return;
                }
                return;
            default:
                SendMessagesHelper.getInstance(this.f11743c).sendMessage(SendMessagesHelper.SendMessageParams.of("/privacy", this.f11742b, null, null, null, false, null, null, null, true, 0, 0, null, false));
                return;
        }
    }

    public a8(long j10, int i10, int i11) {
        this.f11741a = i11;
        this.f11742b = j10;
        this.f11743c = i10;
    }
}

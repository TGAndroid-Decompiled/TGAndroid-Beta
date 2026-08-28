package gh;

import android.os.Bundle;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.jr;
import org.telegram.ui.pv0;
import org.telegram.ui.qn;
public final class d8 implements Runnable {
    public final int f7981a;
    public final int f7982b;
    public final long f7983c;

    public d8(int i9, long j10) {
        this.f7981a = 1;
        this.f7982b = i9;
        this.f7983c = j10;
    }

    @Override
    public final void run() {
        switch (this.f7981a) {
            case 0:
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                if (U != null) {
                    long j10 = this.f7983c;
                    if (j10 >= 0) {
                        U.presentFragment(new PrivacyControlActivity(10, false));
                        return;
                    }
                    int i9 = this.f7982b;
                    long j11 = -j10;
                    if (ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(i9).getChat(Long.valueOf(j11)))) {
                        U.presentFragment(new pv0(j11));
                        return;
                    }
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", j11);
                    bundle.putInt("type", 3);
                    jr jrVar = new jr(bundle);
                    jrVar.w0(MessagesController.getInstance(i9).getChatFull(j11));
                    U.presentFragment(jrVar);
                    return;
                }
                return;
            case 1:
                SendMessagesHelper.getInstance(this.f7982b).sendMessage(SendMessagesHelper.SendMessageParams.of("/privacy", this.f7983c, null, null, null, false, null, null, null, true, 0, 0, null, false));
                return;
            default:
                org.telegram.ui.ActionBar.o2 U2 = LaunchActivity.U();
                if (U2 != null) {
                    U2.presentFragment(qn.Q9(this.f7982b, this.f7983c));
                    return;
                }
                return;
        }
    }

    public d8(long j10, int i9, int i10) {
        this.f7981a = i10;
        this.f7983c = j10;
        this.f7982b = i9;
    }
}

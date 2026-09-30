package ei;

import android.os.Bundle;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.kw0;
import org.telegram.ui.pr;
import org.telegram.ui.wn;
public final class b2 implements Runnable {
    public final int f8230a;
    public final long f8231b;
    public final int f8232c;

    public b2(int i10, long j3) {
        this.f8230a = 0;
        this.f8232c = i10;
        this.f8231b = j3;
    }

    @Override
    public final void run() {
        switch (this.f8230a) {
            case 0:
                SendMessagesHelper.getInstance(this.f8232c).sendMessage(SendMessagesHelper.SendMessageParams.of("/privacy", this.f8231b, null, null, null, false, null, null, null, true, 0, 0, null, false));
                return;
            case 1:
                org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(wn.Q9(this.f8232c, this.f8231b));
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.m2 U2 = LaunchActivity.U();
                if (U2 != null) {
                    long j3 = this.f8231b;
                    if (j3 >= 0) {
                        U2.presentFragment(new PrivacyControlActivity(10, false));
                        return;
                    }
                    int i10 = this.f8232c;
                    long j10 = -j3;
                    if (ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(i10).getChat(Long.valueOf(j10)))) {
                        U2.presentFragment(new kw0(j10));
                        return;
                    }
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", j10);
                    bundle.putInt("type", 3);
                    pr prVar = new pr(bundle);
                    prVar.x0(MessagesController.getInstance(i10).getChatFull(j10));
                    U2.presentFragment(prVar);
                    return;
                }
                return;
        }
    }

    public b2(long j3, int i10, int i11) {
        this.f8230a = i11;
        this.f8231b = j3;
        this.f8232c = i10;
    }
}

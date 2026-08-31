package mh;

import android.os.Bundle;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.aw0;
import org.telegram.ui.qr;
import org.telegram.ui.xn;
public final class b8 implements Runnable {
    public final int f13758a;
    public final long f13759b;
    public final int f13760c;

    public b8(int i10, long j10) {
        this.f13758a = 2;
        this.f13760c = i10;
        this.f13759b = j10;
    }

    @Override
    public final void run() {
        switch (this.f13758a) {
            case 0:
                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                if (U != null) {
                    long j10 = this.f13759b;
                    if (j10 >= 0) {
                        U.presentFragment(new PrivacyControlActivity(10, false));
                        return;
                    }
                    int i10 = this.f13760c;
                    long j11 = -j10;
                    if (ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(i10).getChat(Long.valueOf(j11)))) {
                        U.presentFragment(new aw0(j11));
                        return;
                    }
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", j11);
                    bundle.putInt("type", 3);
                    qr qrVar = new qr(bundle);
                    qrVar.x0(MessagesController.getInstance(i10).getChatFull(j11));
                    U.presentFragment(qrVar);
                    return;
                }
                return;
            case 1:
                org.telegram.ui.ActionBar.p2 U2 = LaunchActivity.U();
                if (U2 != null) {
                    U2.presentFragment(xn.Q9(this.f13760c, this.f13759b));
                    return;
                }
                return;
            default:
                SendMessagesHelper.getInstance(this.f13760c).sendMessage(SendMessagesHelper.SendMessageParams.of("/privacy", this.f13759b, null, null, null, false, null, null, null, true, 0, 0, null, false));
                return;
        }
    }

    public b8(long j10, int i10, int i11) {
        this.f13758a = i11;
        this.f13759b = j10;
        this.f13760c = i10;
    }
}

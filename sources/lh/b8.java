package lh;

import android.os.Bundle;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.pr;
import org.telegram.ui.xn;
import org.telegram.ui.yv0;
public final class b8 implements Runnable {
    public final int f12171a;
    public final long f12172b;
    public final int f12173c;

    public b8(int i10, long j10) {
        this.f12171a = 2;
        this.f12173c = i10;
        this.f12172b = j10;
    }

    @Override
    public final void run() {
        switch (this.f12171a) {
            case 0:
                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                if (U != null) {
                    long j10 = this.f12172b;
                    if (j10 >= 0) {
                        U.presentFragment(new PrivacyControlActivity(10, false));
                        return;
                    }
                    int i10 = this.f12173c;
                    long j11 = -j10;
                    if (ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(i10).getChat(Long.valueOf(j11)))) {
                        U.presentFragment(new yv0(j11));
                        return;
                    }
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", j11);
                    bundle.putInt("type", 3);
                    pr prVar = new pr(bundle);
                    prVar.x0(MessagesController.getInstance(i10).getChatFull(j11));
                    U.presentFragment(prVar);
                    return;
                }
                return;
            case 1:
                org.telegram.ui.ActionBar.p2 U2 = LaunchActivity.U();
                if (U2 != null) {
                    U2.presentFragment(xn.Q9(this.f12173c, this.f12172b));
                    return;
                }
                return;
            default:
                SendMessagesHelper.getInstance(this.f12173c).sendMessage(SendMessagesHelper.SendMessageParams.of("/privacy", this.f12172b, null, null, null, false, null, null, null, true, 0, 0, null, false));
                return;
        }
    }

    public b8(long j10, int i10, int i11) {
        this.f12171a = i11;
        this.f12172b = j10;
        this.f12173c = i10;
    }
}

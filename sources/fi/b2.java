package fi;

import android.os.Bundle;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.co;
import org.telegram.ui.tw0;
import org.telegram.ui.vr;
public final class b2 implements Runnable {
    public final int f9561a;
    public final long f9562b;
    public final int f9563c;

    public b2(int i10, long j3) {
        this.f9561a = 0;
        this.f9563c = i10;
        this.f9562b = j3;
    }

    @Override
    public final void run() {
        switch (this.f9561a) {
            case 0:
                SendMessagesHelper.getInstance(this.f9563c).sendMessage(SendMessagesHelper.SendMessageParams.of("/privacy", this.f9562b, null, null, null, false, null, null, null, true, 0, 0, null, false));
                return;
            case 1:
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(co.Q9(this.f9563c, this.f9562b));
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.n2 U2 = LaunchActivity.U();
                if (U2 != null) {
                    long j3 = this.f9562b;
                    if (j3 >= 0) {
                        U2.presentFragment(new PrivacyControlActivity(10, false));
                        return;
                    }
                    int i10 = this.f9563c;
                    long j10 = -j3;
                    if (ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(i10).getChat(Long.valueOf(j10)))) {
                        U2.presentFragment(new tw0(j10));
                        return;
                    }
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", j10);
                    bundle.putInt("type", 3);
                    vr vrVar = new vr(bundle);
                    vrVar.x0(MessagesController.getInstance(i10).getChatFull(j10));
                    U2.presentFragment(vrVar);
                    return;
                }
                return;
        }
    }

    public b2(long j3, int i10, int i11) {
        this.f9561a = i11;
        this.f9562b = j3;
        this.f9563c = i10;
    }
}

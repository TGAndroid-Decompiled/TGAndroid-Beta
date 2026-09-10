package di;

import android.os.Bundle;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.eo;
import org.telegram.ui.vw0;
import org.telegram.ui.wr;
public final class e2 implements Runnable {
    public final int f6600a;
    public final long f6601b;
    public final int f6602c;

    public e2(int i10, long j3) {
        this.f6600a = 0;
        this.f6602c = i10;
        this.f6601b = j3;
    }

    @Override
    public final void run() {
        switch (this.f6600a) {
            case 0:
                SendMessagesHelper.getInstance(this.f6602c).sendMessage(SendMessagesHelper.SendMessageParams.of("/privacy", this.f6601b, null, null, null, false, null, null, null, true, 0, 0, null, false));
                return;
            case 1:
                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(eo.Q9(this.f6602c, this.f6601b));
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.p2 U2 = LaunchActivity.U();
                if (U2 != null) {
                    long j3 = this.f6601b;
                    if (j3 >= 0) {
                        U2.presentFragment(new PrivacyControlActivity(10, false));
                        return;
                    }
                    int i10 = this.f6602c;
                    long j10 = -j3;
                    if (ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(i10).getChat(Long.valueOf(j10)))) {
                        U2.presentFragment(new vw0(j10));
                        return;
                    }
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", j10);
                    bundle.putInt("type", 3);
                    wr wrVar = new wr(bundle);
                    wrVar.x0(MessagesController.getInstance(i10).getChatFull(j10));
                    U2.presentFragment(wrVar);
                    return;
                }
                return;
        }
    }

    public e2(long j3, int i10, int i11) {
        this.f6600a = i11;
        this.f6601b = j3;
        this.f6602c = i10;
    }
}

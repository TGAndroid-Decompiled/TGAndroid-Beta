package ei;

import android.os.Bundle;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.mw0;
import org.telegram.ui.qr;
import org.telegram.ui.xn;
public final class b2 implements Runnable {
    public final int f8231a;
    public final long f8232b;
    public final int f8233c;

    public b2(int i10, long j3) {
        this.f8231a = 0;
        this.f8233c = i10;
        this.f8232b = j3;
    }

    @Override
    public final void run() {
        switch (this.f8231a) {
            case 0:
                SendMessagesHelper.getInstance(this.f8233c).sendMessage(SendMessagesHelper.SendMessageParams.of("/privacy", this.f8232b, null, null, null, false, null, null, null, true, 0, 0, null, false));
                return;
            case 1:
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(xn.Q9(this.f8233c, this.f8232b));
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.n2 U2 = LaunchActivity.U();
                if (U2 != null) {
                    long j3 = this.f8232b;
                    if (j3 >= 0) {
                        U2.presentFragment(new PrivacyControlActivity(10, false));
                        return;
                    }
                    int i10 = this.f8233c;
                    long j10 = -j3;
                    if (ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(i10).getChat(Long.valueOf(j10)))) {
                        U2.presentFragment(new mw0(j10));
                        return;
                    }
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", j10);
                    bundle.putInt("type", 3);
                    qr qrVar = new qr(bundle);
                    qrVar.x0(MessagesController.getInstance(i10).getChatFull(j10));
                    U2.presentFragment(qrVar);
                    return;
                }
                return;
        }
    }

    public b2(long j3, int i10, int i11) {
        this.f8231a = i11;
        this.f8232b = j3;
        this.f8233c = i10;
    }
}

package ei;

import android.os.Bundle;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.nw0;
import org.telegram.ui.rr;
import org.telegram.ui.yn;
public final class c2 implements Runnable {
    public final int f8955a;
    public final long f8956b;
    public final int f8957c;

    public c2(int i10, long j3) {
        this.f8955a = 0;
        this.f8957c = i10;
        this.f8956b = j3;
    }

    @Override
    public final void run() {
        switch (this.f8955a) {
            case 0:
                SendMessagesHelper.getInstance(this.f8957c).sendMessage(SendMessagesHelper.SendMessageParams.of("/privacy", this.f8956b, null, null, null, false, null, null, null, true, 0, 0, null, false));
                return;
            case 1:
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(yn.P9(this.f8957c, this.f8956b));
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.n2 U2 = LaunchActivity.U();
                if (U2 != null) {
                    long j3 = this.f8956b;
                    if (j3 >= 0) {
                        U2.presentFragment(new PrivacyControlActivity(10, false));
                        return;
                    }
                    int i10 = this.f8957c;
                    long j10 = -j3;
                    if (ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(i10).getChat(Long.valueOf(j10)))) {
                        U2.presentFragment(new nw0(j10));
                        return;
                    }
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", j10);
                    bundle.putInt("type", 3);
                    rr rrVar = new rr(bundle);
                    rrVar.x0(MessagesController.getInstance(i10).getChatFull(j10));
                    U2.presentFragment(rrVar);
                    return;
                }
                return;
        }
    }

    public c2(long j3, int i10, int i11) {
        this.f8955a = i11;
        this.f8956b = j3;
        this.f8957c = i10;
    }
}

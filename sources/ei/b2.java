package ei;

import android.os.Bundle;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.bo;
import org.telegram.ui.tw0;
import org.telegram.ui.ur;
public final class b2 implements Runnable {
    public final int f8245a;
    public final long f8246b;
    public final int f8247c;

    public b2(int i10, long j3) {
        this.f8245a = 0;
        this.f8247c = i10;
        this.f8246b = j3;
    }

    @Override
    public final void run() {
        switch (this.f8245a) {
            case 0:
                SendMessagesHelper.getInstance(this.f8247c).sendMessage(SendMessagesHelper.SendMessageParams.of("/privacy", this.f8246b, null, null, null, false, null, null, null, true, 0, 0, null, false));
                return;
            case 1:
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(bo.Q9(this.f8247c, this.f8246b));
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.n2 U2 = LaunchActivity.U();
                if (U2 != null) {
                    long j3 = this.f8246b;
                    if (j3 >= 0) {
                        U2.presentFragment(new PrivacyControlActivity(10, false));
                        return;
                    }
                    int i10 = this.f8247c;
                    long j10 = -j3;
                    if (ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(i10).getChat(Long.valueOf(j10)))) {
                        U2.presentFragment(new tw0(j10));
                        return;
                    }
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", j10);
                    bundle.putInt("type", 3);
                    ur urVar = new ur(bundle);
                    urVar.x0(MessagesController.getInstance(i10).getChatFull(j10));
                    U2.presentFragment(urVar);
                    return;
                }
                return;
        }
    }

    public b2(long j3, int i10, int i11) {
        this.f8245a = i11;
        this.f8246b = j3;
        this.f8247c = i10;
    }
}

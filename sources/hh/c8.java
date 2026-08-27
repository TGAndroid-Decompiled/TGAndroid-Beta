package hh;

import android.os.Bundle;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.lr;
import org.telegram.ui.qv0;
import org.telegram.ui.rn;

public final class c8 implements Runnable {

    public final int f9098a;

    public final int f9099b;

    public final long f9100c;

    public c8(int i10, long j10) {
        this.f9098a = 1;
        this.f9099b = i10;
        this.f9100c = j10;
    }

    @Override
    public final void run() {
        switch (this.f9098a) {
            case 0:
                org.telegram.ui.ActionBar.n2 n2VarU = LaunchActivity.U();
                if (n2VarU != null) {
                    long j10 = this.f9100c;
                    if (j10 < 0) {
                        int i10 = this.f9099b;
                        long j11 = -j10;
                        if (!ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(i10).getChat(Long.valueOf(j11)))) {
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", j11);
                            bundle.putInt("type", 3);
                            lr lrVar = new lr(bundle);
                            lrVar.x0(MessagesController.getInstance(i10).getChatFull(j11));
                            n2VarU.presentFragment(lrVar);
                        } else {
                            n2VarU.presentFragment(new qv0(j11));
                        }
                    } else {
                        n2VarU.presentFragment(new PrivacyControlActivity(10, false));
                    }
                }
                break;
            case 1:
                SendMessagesHelper.getInstance(this.f9099b).sendMessage(SendMessagesHelper.SendMessageParams.of("/privacy", this.f9100c, null, null, null, false, null, null, null, true, 0, 0, null, false));
                break;
            default:
                org.telegram.ui.ActionBar.n2 n2VarU2 = LaunchActivity.U();
                if (n2VarU2 != null) {
                    n2VarU2.presentFragment(rn.Q9(this.f9099b, this.f9100c));
                }
                break;
        }
    }

    public c8(long j10, int i10, int i11) {
        this.f9098a = i11;
        this.f9100c = j10;
        this.f9099b = i10;
    }
}

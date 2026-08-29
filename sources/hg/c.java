package hg;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.tn;
public final class c implements Runnable {
    public final int f8023a;
    public final d f8024b;
    public final MessageObject f8025c;
    public final TLRPC.TL_messageMediaGiveawayResults d;

    public c(d dVar, MessageObject messageObject, TLRPC.TL_messageMediaGiveawayResults tL_messageMediaGiveawayResults, int i10) {
        this.f8023a = i10;
        this.f8024b = dVar;
        this.f8025c = messageObject;
        this.d = tL_messageMediaGiveawayResults;
    }

    @Override
    public final void run() {
        switch (this.f8023a) {
            case 0:
                AndroidUtilities.runOnUIThread(new c(this.f8024b, this.f8025c, this.d, 1));
                return;
            default:
                s1 s1Var = this.f8024b.f8028c;
                long dialogId = this.f8025c.getDialogId();
                TLRPC.TL_messageMediaGiveawayResults tL_messageMediaGiveawayResults = this.d;
                if (dialogId == (-tL_messageMediaGiveawayResults.channel_id)) {
                    s1Var.getDelegate().b2(s1Var, tL_messageMediaGiveawayResults.launch_msg_id, 0.0f, 0.0f, false);
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", tL_messageMediaGiveawayResults.channel_id);
                bundle.putInt("message_id", tL_messageMediaGiveawayResults.launch_msg_id);
                LaunchActivity.R().presentFragment(new tn(bundle));
                return;
        }
    }
}

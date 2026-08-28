package eg;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.qn;
public final class c implements Runnable {
    public final int f5145a;
    public final d f5146b;
    public final MessageObject f5147c;
    public final TLRPC.TL_messageMediaGiveawayResults d;

    public c(d dVar, MessageObject messageObject, TLRPC.TL_messageMediaGiveawayResults tL_messageMediaGiveawayResults, int i9) {
        this.f5145a = i9;
        this.f5146b = dVar;
        this.f5147c = messageObject;
        this.d = tL_messageMediaGiveawayResults;
    }

    @Override
    public final void run() {
        switch (this.f5145a) {
            case 0:
                AndroidUtilities.runOnUIThread(new c(this.f5146b, this.f5147c, this.d, 1));
                return;
            default:
                t1 t1Var = this.f5146b.f5150c;
                long dialogId = this.f5147c.getDialogId();
                TLRPC.TL_messageMediaGiveawayResults tL_messageMediaGiveawayResults = this.d;
                if (dialogId == (-tL_messageMediaGiveawayResults.channel_id)) {
                    t1Var.getDelegate().S1(t1Var, tL_messageMediaGiveawayResults.launch_msg_id, 0.0f, 0.0f, false);
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", tL_messageMediaGiveawayResults.channel_id);
                bundle.putInt("message_id", tL_messageMediaGiveawayResults.launch_msg_id);
                LaunchActivity.R().presentFragment(new qn(bundle));
                return;
        }
    }
}

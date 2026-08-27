package fg;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.rn;

public final class c implements Runnable {

    public final int f6076a;

    public final d f6077b;

    public final MessageObject f6078c;
    public final TLRPC.TL_messageMediaGiveawayResults d;

    public c(d dVar, MessageObject messageObject, TLRPC.TL_messageMediaGiveawayResults tL_messageMediaGiveawayResults, int i10) {
        this.f6076a = i10;
        this.f6077b = dVar;
        this.f6078c = messageObject;
        this.d = tL_messageMediaGiveawayResults;
    }

    @Override
    public final void run() {
        switch (this.f6076a) {
            case 0:
                AndroidUtilities.runOnUIThread(new c(this.f6077b, this.f6078c, this.d, 1));
                break;
            default:
                s1 s1Var = this.f6077b.f6081c;
                long dialogId = this.f6078c.getDialogId();
                TLRPC.TL_messageMediaGiveawayResults tL_messageMediaGiveawayResults = this.d;
                if (dialogId != (-tL_messageMediaGiveawayResults.channel_id)) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", tL_messageMediaGiveawayResults.channel_id);
                    bundle.putInt("message_id", tL_messageMediaGiveawayResults.launch_msg_id);
                    LaunchActivity.R().presentFragment(new rn(bundle));
                } else {
                    s1Var.getDelegate().R1(s1Var, tL_messageMediaGiveawayResults.launch_msg_id, 0.0f, 0.0f, false);
                }
                break;
        }
    }
}

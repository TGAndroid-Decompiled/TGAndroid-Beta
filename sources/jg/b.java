package jg;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.zn;
public final class b implements Runnable {
    public final int f9373a;
    public final c f9374b;
    public final MessageObject f9375c;
    public final TLRPC.TL_messageMediaGiveawayResults d;

    public b(c cVar, MessageObject messageObject, TLRPC.TL_messageMediaGiveawayResults tL_messageMediaGiveawayResults, int i10) {
        this.f9373a = i10;
        this.f9374b = cVar;
        this.f9375c = messageObject;
        this.d = tL_messageMediaGiveawayResults;
    }

    @Override
    public final void run() {
        switch (this.f9373a) {
            case 0:
                AndroidUtilities.runOnUIThread(new b(this.f9374b, this.f9375c, this.d, 1));
                return;
            default:
                s1 s1Var = this.f9374b.f9378c;
                long dialogId = this.f9375c.getDialogId();
                TLRPC.TL_messageMediaGiveawayResults tL_messageMediaGiveawayResults = this.d;
                if (dialogId == (-tL_messageMediaGiveawayResults.channel_id)) {
                    s1Var.getDelegate().f2(s1Var, tL_messageMediaGiveawayResults.launch_msg_id, 0.0f, 0.0f, false);
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", tL_messageMediaGiveawayResults.channel_id);
                bundle.putInt("message_id", tL_messageMediaGiveawayResults.launch_msg_id);
                LaunchActivity.R().presentFragment(new zn(bundle));
                return;
        }
    }
}

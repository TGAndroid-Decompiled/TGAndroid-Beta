package ah;

import android.os.Bundle;
import org.telegram.messenger.g0;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.wm;
public final class c implements Runnable {
    public final int f447a;
    public final d f448b;
    public final zi f449c;
    public final TLRPC.TL_messageMediaGiveawayResults d;

    public c(d dVar, zi ziVar, TLRPC.TL_messageMediaGiveawayResults tL_messageMediaGiveawayResults, int i3) {
        this.f447a = i3;
        this.f448b = dVar;
        this.f449c = ziVar;
        this.d = tL_messageMediaGiveawayResults;
    }

    @Override
    public final void run() {
        switch (this.f447a) {
            case 0:
                g0.h3(new c(this.f448b, this.f449c, this.d, 1));
                return;
            default:
                q1 q1Var = this.f448b.f452c;
                long B0 = zi.B0(this.f449c.f26868k);
                TLRPC.TL_messageMediaGiveawayResults tL_messageMediaGiveawayResults = this.d;
                if (B0 == (-tL_messageMediaGiveawayResults.channel_id)) {
                    q1Var.getDelegate().W1(q1Var, tL_messageMediaGiveawayResults.launch_msg_id, 0.0f, 0.0f, false);
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", tL_messageMediaGiveawayResults.channel_id);
                bundle.putInt("message_id", tL_messageMediaGiveawayResults.launch_msg_id);
                LaunchActivity.Q().presentFragment(new wm(bundle));
                return;
        }
    }
}

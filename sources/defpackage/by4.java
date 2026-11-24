package defpackage;

import android.os.Bundle;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class by4 implements Runnable {
    public final byte a;
    public final cy4 b;
    public final k47 c;
    public final TLRPC.TL_messageMediaGiveawayResults d;

    public by4(cy4 cy4Var, k47 k47Var, TLRPC.TL_messageMediaGiveawayResults tL_messageMediaGiveawayResults, byte b) {
        this.a = b;
        this.b = cy4Var;
        this.c = k47Var;
        this.d = tL_messageMediaGiveawayResults;
    }

    @Override
    public final void run() {
        byte b = this.a;
        TLRPC.TL_messageMediaGiveawayResults tL_messageMediaGiveawayResults = this.d;
        k47 k47Var = this.c;
        cy4 cy4Var = this.b;
        switch (b) {
            case 0:
                gm.c3(new by4(cy4Var, k47Var, tL_messageMediaGiveawayResults, (byte) 1));
                return;
            default:
                rc2 rc2Var = cy4Var.c;
                if (k47.B0(k47Var.k) == (-tL_messageMediaGiveawayResults.channel_id)) {
                    rc2Var.getDelegate().H(rc2Var, tL_messageMediaGiveawayResults.launch_msg_id, 0.0f, 0.0f, false);
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", tL_messageMediaGiveawayResults.channel_id);
                bundle.putInt("message_id", tL_messageMediaGiveawayResults.launch_msg_id);
                LaunchActivity.Q().presentFragment(new yv1(bundle));
                return;
        }
    }
}

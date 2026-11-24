package defpackage;

import android.os.Bundle;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class zv4 implements Runnable {
    public final byte a;
    public final aw4 b;
    public final k27 c;
    public final TLRPC.TL_messageMediaGiveawayResults d;

    public zv4(aw4 aw4Var, k27 k27Var, TLRPC.TL_messageMediaGiveawayResults tL_messageMediaGiveawayResults, byte b) {
        this.a = b;
        this.b = aw4Var;
        this.c = k27Var;
        this.d = tL_messageMediaGiveawayResults;
    }

    @Override
    public final void run() {
        byte b = this.a;
        TLRPC.TL_messageMediaGiveawayResults tL_messageMediaGiveawayResults = this.d;
        k27 k27Var = this.c;
        aw4 aw4Var = this.b;
        switch (b) {
            case 0:
                gl.c3(new zv4(aw4Var, k27Var, tL_messageMediaGiveawayResults, (byte) 1));
                return;
            default:
                gb2 gb2Var = aw4Var.c;
                if (k27.B0(k27Var.k) == (-tL_messageMediaGiveawayResults.channel_id)) {
                    gb2Var.getDelegate().N(gb2Var, tL_messageMediaGiveawayResults.launch_msg_id, 0.0f, 0.0f, false);
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", tL_messageMediaGiveawayResults.channel_id);
                bundle.putInt("message_id", tL_messageMediaGiveawayResults.launch_msg_id);
                LaunchActivity.Q().presentFragment(new mu1(bundle));
                return;
        }
    }
}

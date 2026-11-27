package defpackage;

import android.os.Bundle;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class ey4 implements Runnable {
    public final byte a;
    public final fy4 b;
    public final r47 c;
    public final TLRPC.TL_messageMediaGiveawayResults d;

    public ey4(fy4 fy4Var, r47 r47Var, TLRPC.TL_messageMediaGiveawayResults tL_messageMediaGiveawayResults, byte b) {
        this.a = b;
        this.b = fy4Var;
        this.c = r47Var;
        this.d = tL_messageMediaGiveawayResults;
    }

    @Override
    public final void run() {
        byte b = this.a;
        TLRPC.TL_messageMediaGiveawayResults tL_messageMediaGiveawayResults = this.d;
        r47 r47Var = this.c;
        fy4 fy4Var = this.b;
        switch (b) {
            case 0:
                hl.c3(new ey4(fy4Var, r47Var, tL_messageMediaGiveawayResults, (byte) 1));
                return;
            default:
                wb2 wb2Var = fy4Var.c;
                if (r47.B0(r47Var.k) == (-tL_messageMediaGiveawayResults.channel_id)) {
                    wb2Var.getDelegate().H(wb2Var, tL_messageMediaGiveawayResults.launch_msg_id, 0.0f, 0.0f, false);
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", tL_messageMediaGiveawayResults.channel_id);
                bundle.putInt("message_id", tL_messageMediaGiveawayResults.launch_msg_id);
                LaunchActivity.Q().presentFragment(new zu1(bundle));
                return;
        }
    }
}

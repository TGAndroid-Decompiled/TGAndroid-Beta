package defpackage;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class y06 implements Runnable {
    public final byte a;
    public final zu1 b;
    public final long c;
    public final TLRPC.Chat d;

    public y06(zu1 zu1Var, long j, TLRPC.Chat chat, byte b) {
        this.a = b;
        this.b = zu1Var;
        this.c = j;
        this.d = chat;
    }

    @Override
    public final void run() {
        byte b = this.a;
        TLRPC.Chat chat = this.d;
        long j = this.c;
        zu1 zu1Var = this.b;
        switch (b) {
            case 0:
                String str = LaunchActivity.C1;
                d31.b0(zu1Var).I(2131624220, ob6.M0(2131744651, null), hl.S2(ob6.G((int) j, "StarsSubscriptionCompletedText", chat.title))).k(true);
                return;
            default:
                d31.b0(zu1Var).I(2131624220, ob6.M0(2131744651, null), hl.S2(ob6.G((int) j, "StarsSubscriptionCompletedText", chat.title))).k(true);
                return;
        }
    }
}

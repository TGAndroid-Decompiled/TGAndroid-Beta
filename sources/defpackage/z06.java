package defpackage;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class z06 implements Runnable {
    public final byte a;
    public final yv1 b;
    public final long c;
    public final TLRPC.Chat d;

    public z06(yv1 yv1Var, long j, TLRPC.Chat chat, byte b) {
        this.a = b;
        this.b = yv1Var;
        this.c = j;
        this.d = chat;
    }

    @Override
    public final void run() {
        byte b = this.a;
        TLRPC.Chat chat = this.d;
        long j = this.c;
        yv1 yv1Var = this.b;
        switch (b) {
            case 0:
                String str = LaunchActivity.C1;
                c41.b0(yv1Var).I(2131624220, jb6.M0(2131744683, null), gm.S2(jb6.G((int) j, "StarsSubscriptionCompletedText", chat.title))).k(true);
                return;
            default:
                c41.b0(yv1Var).I(2131624220, jb6.M0(2131744683, null), gm.S2(jb6.G((int) j, "StarsSubscriptionCompletedText", chat.title))).k(true);
                return;
        }
    }
}

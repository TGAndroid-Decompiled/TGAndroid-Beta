package defpackage;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class zy5 implements Runnable {
    public final byte a;
    public final mu1 b;
    public final long c;
    public final TLRPC.Chat d;

    public zy5(mu1 mu1Var, long j, TLRPC.Chat chat, byte b) {
        this.a = b;
        this.b = mu1Var;
        this.c = j;
        this.d = chat;
    }

    @Override
    public final void run() {
        byte b = this.a;
        TLRPC.Chat chat = this.d;
        long j = this.c;
        mu1 mu1Var = this.b;
        switch (b) {
            case 0:
                String str = LaunchActivity.C1;
                u21.b0(mu1Var).I(2131624221, k96.M0(2131744757, null), gl.T2(k96.G((int) j, "StarsSubscriptionCompletedText", chat.title))).k(true);
                return;
            default:
                u21.b0(mu1Var).I(2131624221, k96.M0(2131744757, null), gl.T2(k96.G((int) j, "StarsSubscriptionCompletedText", chat.title))).k(true);
                return;
        }
    }
}

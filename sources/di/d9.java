package di;

import org.telegram.messenger.gd;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bn;
public final class d9 implements Runnable {
    public final int f8693a;
    public final bn f8694b;
    public final long f8695c;
    public final TLRPC.Chat d;

    public d9(bn bnVar, long j3, TLRPC.Chat chat, int i7) {
        this.f8693a = i7;
        this.f8694b = bnVar;
        this.f8695c = j3;
        this.d = chat;
    }

    @Override
    public final void run() {
        int i7 = this.f8693a;
        TLRPC.Chat chat = this.d;
        long j3 = this.f8695c;
        bn bnVar = this.f8694b;
        switch (i7) {
            case 0:
                org.telegram.ui.Components.lc.b0(bnVar).I(2131624226, gd.N0(2131744753, null), org.telegram.messenger.g0.W2(gd.G((int) j3, "StarsSubscriptionCompletedText", chat.title))).k(true);
                return;
            default:
                String str = LaunchActivity.C1;
                org.telegram.ui.Components.lc.b0(bnVar).I(2131624226, gd.N0(2131744753, null), org.telegram.messenger.g0.W2(gd.G((int) j3, "StarsSubscriptionCompletedText", chat.title))).k(true);
                return;
        }
    }
}

package di;

import org.telegram.messenger.gd;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bn;
public final class c9 implements Runnable {
    public final int f8619a;
    public final bn f8620b;
    public final long f8621c;
    public final TLRPC.Chat d;

    public c9(bn bnVar, long j3, TLRPC.Chat chat, int i7) {
        this.f8619a = i7;
        this.f8620b = bnVar;
        this.f8621c = j3;
        this.d = chat;
    }

    @Override
    public final void run() {
        int i7 = this.f8619a;
        TLRPC.Chat chat = this.d;
        long j3 = this.f8621c;
        bn bnVar = this.f8620b;
        switch (i7) {
            case 0:
                org.telegram.ui.Components.lc.b0(bnVar).I(2131624226, gd.M0(2131744759, null), org.telegram.messenger.g0.W2(gd.G((int) j3, "StarsSubscriptionCompletedText", chat.title))).k(true);
                return;
            default:
                String str = LaunchActivity.C1;
                org.telegram.ui.Components.lc.b0(bnVar).I(2131624226, gd.M0(2131744759, null), org.telegram.messenger.g0.W2(gd.G((int) j3, "StarsSubscriptionCompletedText", chat.title))).k(true);
                return;
        }
    }
}

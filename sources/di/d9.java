package di;

import org.telegram.messenger.hd;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bn;
public final class d9 implements Runnable {
    public final int f8659a;
    public final bn f8660b;
    public final long f8661c;
    public final TLRPC.Chat d;

    public d9(bn bnVar, long j3, TLRPC.Chat chat, int i7) {
        this.f8659a = i7;
        this.f8660b = bnVar;
        this.f8661c = j3;
        this.d = chat;
    }

    @Override
    public final void run() {
        int i7 = this.f8659a;
        TLRPC.Chat chat = this.d;
        long j3 = this.f8661c;
        bn bnVar = this.f8660b;
        switch (i7) {
            case 0:
                org.telegram.ui.Components.lc.b0(bnVar).I(2131624226, hd.N0(2131744753, null), org.telegram.messenger.g0.W2(hd.G((int) j3, "StarsSubscriptionCompletedText", chat.title))).k(true);
                return;
            default:
                String str = LaunchActivity.C1;
                org.telegram.ui.Components.lc.b0(bnVar).I(2131624226, hd.N0(2131744753, null), org.telegram.messenger.g0.W2(hd.G((int) j3, "StarsSubscriptionCompletedText", chat.title))).k(true);
                return;
        }
    }
}

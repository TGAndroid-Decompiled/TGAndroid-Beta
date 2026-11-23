package di;

import org.telegram.messenger.gd;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bn;
public final class d9 implements Runnable {
    public final int f8657a;
    public final bn f8658b;
    public final long f8659c;
    public final TLRPC.Chat d;

    public d9(bn bnVar, long j3, TLRPC.Chat chat, int i7) {
        this.f8657a = i7;
        this.f8658b = bnVar;
        this.f8659c = j3;
        this.d = chat;
    }

    @Override
    public final void run() {
        int i7 = this.f8657a;
        TLRPC.Chat chat = this.d;
        long j3 = this.f8659c;
        bn bnVar = this.f8658b;
        switch (i7) {
            case 0:
                org.telegram.ui.Components.kc.b0(bnVar).I(2131624226, gd.N0(2131744753, null), org.telegram.messenger.g0.W2(gd.G((int) j3, "StarsSubscriptionCompletedText", chat.title))).k(true);
                return;
            default:
                String str = LaunchActivity.C1;
                org.telegram.ui.Components.kc.b0(bnVar).I(2131624226, gd.N0(2131744753, null), org.telegram.messenger.g0.W2(gd.G((int) j3, "StarsSubscriptionCompletedText", chat.title))).k(true);
                return;
        }
    }
}

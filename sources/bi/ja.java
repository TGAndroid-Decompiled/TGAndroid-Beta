package bi;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.cn;
public final class ja implements Runnable {
    public final int f4107a;
    public final cn f4108b;
    public final long f4109c;
    public final TLRPC.Chat d;

    public ja(cn cnVar, long j3, TLRPC.Chat chat, int i7) {
        this.f4107a = i7;
        this.f4108b = cnVar;
        this.f4109c = j3;
        this.d = chat;
    }

    @Override
    public final void run() {
        int i7 = this.f4107a;
        TLRPC.Chat chat = this.d;
        long j3 = this.f4109c;
        cn cnVar = this.f4108b;
        switch (i7) {
            case 0:
                org.telegram.ui.Components.gc.a0(cnVar).I(2131624225, org.telegram.messenger.id.M0(2131744994, null), org.telegram.messenger.g0.X2(org.telegram.messenger.id.G((int) j3, "StarsSubscriptionCompletedText", chat.title))).k(true);
                return;
            default:
                String str = LaunchActivity.B1;
                org.telegram.ui.Components.gc.a0(cnVar).I(2131624225, org.telegram.messenger.id.M0(2131744994, null), org.telegram.messenger.g0.X2(org.telegram.messenger.id.G((int) j3, "StarsSubscriptionCompletedText", chat.title))).k(true);
                return;
        }
    }
}

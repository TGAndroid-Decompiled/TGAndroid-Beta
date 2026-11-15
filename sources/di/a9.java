package di;

import org.telegram.messenger.hd;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.an;
public final class a9 implements Runnable {
    public final int f8208a;
    public final an f8209b;
    public final long f8210c;
    public final TLRPC.Chat d;

    public a9(an anVar, long j3, TLRPC.Chat chat, int i7) {
        this.f8208a = i7;
        this.f8209b = anVar;
        this.f8210c = j3;
        this.d = chat;
    }

    @Override
    public final void run() {
        int i7 = this.f8208a;
        TLRPC.Chat chat = this.d;
        long j3 = this.f8210c;
        an anVar = this.f8209b;
        switch (i7) {
            case 0:
                org.telegram.ui.Components.cc.a0(anVar).I(2131624226, hd.M0(2131744994, null), org.telegram.messenger.g0.X2(hd.G((int) j3, "StarsSubscriptionCompletedText", chat.title))).k(true);
                return;
            default:
                String str = LaunchActivity.C1;
                org.telegram.ui.Components.cc.a0(anVar).I(2131624226, hd.M0(2131744994, null), org.telegram.messenger.g0.X2(hd.G((int) j3, "StarsSubscriptionCompletedText", chat.title))).k(true);
                return;
        }
    }
}

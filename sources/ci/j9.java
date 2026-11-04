package ci;

import org.telegram.messenger.bd;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.wm;
public final class j9 implements Runnable {
    public final int f5347a;
    public final wm f5348b;
    public final long f5349c;
    public final TLRPC.Chat d;

    public j9(wm wmVar, long j10, TLRPC.Chat chat, int i3) {
        this.f5347a = i3;
        this.f5348b = wmVar;
        this.f5349c = j10;
        this.d = chat;
    }

    @Override
    public final void run() {
        int i3 = this.f5347a;
        TLRPC.Chat chat = this.d;
        long j10 = this.f5349c;
        wm wmVar = this.f5348b;
        switch (i3) {
            case 0:
                org.telegram.ui.Components.fc.a0(wmVar).I(2131624225, bd.M0(2131745004, null), org.telegram.messenger.g0.X2(bd.G((int) j10, "StarsSubscriptionCompletedText", chat.title))).k(true);
                return;
            default:
                String str = LaunchActivity.E1;
                org.telegram.ui.Components.fc.a0(wmVar).I(2131624225, bd.M0(2131745004, null), org.telegram.messenger.g0.X2(bd.G((int) j10, "StarsSubscriptionCompletedText", chat.title))).k(true);
                return;
        }
    }
}

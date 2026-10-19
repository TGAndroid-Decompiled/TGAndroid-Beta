package ai;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.p91;
public final class p3 implements Runnable {
    public final int f1999a = 0;
    public final TLRPC.Chat f2000b;

    public p3(k7 k7Var, TLRPC.Chat chat) {
        this.f2000b = chat;
    }

    @Override
    public final void run() {
        switch (this.f1999a) {
            case 0:
                k7.E2(p91.d0(this.f2000b, true));
                return;
            default:
                TLRPC.Chat chat = this.f2000b;
                if (chat != null) {
                    ?? obj = new Object();
                    obj.f21555a = true;
                    LaunchActivity.R().showAsSheet(new org.telegram.ui.z5(-chat.f20275id), obj);
                    return;
                }
                return;
        }
    }

    public p3(TLRPC.Chat chat) {
        this.f2000b = chat;
    }
}

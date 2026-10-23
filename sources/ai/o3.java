package ai;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.p91;
public final class o3 implements Runnable {
    public final int f1929a = 0;
    public final TLRPC.Chat f1930b;

    public o3(l7 l7Var, TLRPC.Chat chat) {
        this.f1930b = chat;
    }

    @Override
    public final void run() {
        switch (this.f1929a) {
            case 0:
                l7.E2(p91.d0(this.f1930b, true));
                return;
            default:
                TLRPC.Chat chat = this.f1930b;
                if (chat != null) {
                    ?? obj = new Object();
                    obj.f21560a = true;
                    LaunchActivity.R().showAsSheet(new org.telegram.ui.z5(-chat.f20280id), obj);
                    return;
                }
                return;
        }
    }

    public o3(TLRPC.Chat chat) {
        this.f1930b = chat;
    }
}

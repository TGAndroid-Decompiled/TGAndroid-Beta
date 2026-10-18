package ai;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.r91;
public final class o3 implements Runnable {
    public final int f1933a = 0;
    public final TLRPC.Chat f1934b;

    public o3(k7 k7Var, TLRPC.Chat chat) {
        this.f1934b = chat;
    }

    @Override
    public final void run() {
        switch (this.f1933a) {
            case 0:
                k7.x2(r91.d0(this.f1934b, true));
                return;
            default:
                TLRPC.Chat chat = this.f1934b;
                if (chat != null) {
                    ?? obj = new Object();
                    obj.f21559a = true;
                    LaunchActivity.R().showAsSheet(new org.telegram.ui.z5(-chat.f20279id), obj);
                    return;
                }
                return;
        }
    }

    public o3(TLRPC.Chat chat) {
        this.f1934b = chat;
    }
}

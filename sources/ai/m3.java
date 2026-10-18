package ai;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.r91;
public final class m3 implements Runnable {
    public final int f1810a = 0;
    public final TLRPC.Chat f1811b;

    public m3(k7 k7Var, TLRPC.Chat chat) {
        this.f1811b = chat;
    }

    @Override
    public final void run() {
        switch (this.f1810a) {
            case 0:
                k7.x2(r91.d0(this.f1811b, true));
                return;
            default:
                TLRPC.Chat chat = this.f1811b;
                if (chat != null) {
                    ?? obj = new Object();
                    obj.f21552a = true;
                    LaunchActivity.R().showAsSheet(new org.telegram.ui.z5(-chat.f20272id), obj);
                    return;
                }
                return;
        }
    }

    public m3(TLRPC.Chat chat) {
        this.f1811b = chat;
    }
}

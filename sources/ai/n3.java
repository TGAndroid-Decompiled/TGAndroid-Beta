package ai;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.r91;
public final class n3 implements Runnable {
    public final int f1888a = 0;
    public final TLRPC.Chat f1889b;

    public n3(k7 k7Var, TLRPC.Chat chat) {
        this.f1889b = chat;
    }

    @Override
    public final void run() {
        switch (this.f1888a) {
            case 0:
                k7.v2(r91.d0(this.f1889b, true));
                return;
            default:
                TLRPC.Chat chat = this.f1889b;
                if (chat != null) {
                    ?? obj = new Object();
                    obj.f21552a = true;
                    LaunchActivity.R().showAsSheet(new org.telegram.ui.z5(-chat.f20272id), obj);
                    return;
                }
                return;
        }
    }

    public n3(TLRPC.Chat chat) {
        this.f1889b = chat;
    }
}

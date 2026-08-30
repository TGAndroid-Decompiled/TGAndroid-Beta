package gg;

import lh.g5;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ga1;
import org.telegram.ui.y5;
public final class i implements Runnable {
    public final int f6663a = 1;
    public final TLRPC.Chat f6664b;

    public i(g5 g5Var, TLRPC.Chat chat) {
        this.f6664b = chat;
    }

    @Override
    public final void run() {
        switch (this.f6663a) {
            case 0:
                TLRPC.Chat chat = this.f6664b;
                if (chat != null) {
                    ?? obj = new Object();
                    obj.f20478a = true;
                    LaunchActivity.R().showAsSheet(new y5(-chat.f19184id), obj);
                    return;
                }
                return;
            default:
                g5.d2(ga1.d0(this.f6664b, true));
                return;
        }
    }

    public i(TLRPC.Chat chat) {
        this.f6664b = chat;
    }
}

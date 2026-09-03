package hg;

import mh.g5;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.na1;
import org.telegram.ui.y5;
public final class i implements Runnable {
    public final int f7508a = 1;
    public final TLRPC.Chat f7509b;

    public i(g5 g5Var, TLRPC.Chat chat) {
        this.f7509b = chat;
    }

    @Override
    public final void run() {
        switch (this.f7508a) {
            case 0:
                TLRPC.Chat chat = this.f7509b;
                if (chat != null) {
                    ?? obj = new Object();
                    obj.f22158a = true;
                    LaunchActivity.R().showAsSheet(new y5(-chat.f20845id), obj);
                    return;
                }
                return;
            default:
                g5.d2(na1.d0(this.f7509b, true));
                return;
        }
    }

    public i(TLRPC.Chat chat) {
        this.f7509b = chat;
    }
}

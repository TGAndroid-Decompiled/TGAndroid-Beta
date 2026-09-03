package gg;

import lh.g5;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.a6;
import org.telegram.ui.oa1;
public final class i implements Runnable {
    public final int f6650a = 1;
    public final TLRPC.Chat f6651b;

    public i(g5 g5Var, TLRPC.Chat chat) {
        this.f6651b = chat;
    }

    @Override
    public final void run() {
        switch (this.f6650a) {
            case 0:
                TLRPC.Chat chat = this.f6651b;
                if (chat != null) {
                    ?? obj = new Object();
                    obj.f20453a = true;
                    LaunchActivity.R().showAsSheet(new a6(-chat.f19159id), obj);
                    return;
                }
                return;
            default:
                g5.d2(oa1.d0(this.f6651b, true));
                return;
        }
    }

    public i(TLRPC.Chat chat) {
        this.f6651b = chat;
    }
}

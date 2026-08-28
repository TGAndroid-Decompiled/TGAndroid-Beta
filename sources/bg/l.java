package bg;

import gh.k5;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.s91;
import org.telegram.ui.u5;
public final class l implements Runnable {
    public final int f1862a = 1;
    public final TLRPC.Chat f1863b;

    public l(k5 k5Var, TLRPC.Chat chat) {
        this.f1863b = chat;
    }

    @Override
    public final void run() {
        switch (this.f1862a) {
            case 0:
                TLRPC.Chat chat = this.f1863b;
                if (chat != null) {
                    ?? obj = new Object();
                    obj.f23653a = true;
                    LaunchActivity.R().showAsSheet(new u5(-chat.f22380id), obj);
                    return;
                }
                return;
            default:
                k5.d2(s91.c0(this.f1863b, true));
                return;
        }
    }

    public l(TLRPC.Chat chat) {
        this.f1863b = chat;
    }
}

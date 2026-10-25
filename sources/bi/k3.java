package bi;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.w91;
public final class k3 implements Runnable {
    public final int f4947a = 0;
    public final TLRPC.Chat f4948b;

    public k3(h7 h7Var, TLRPC.Chat chat) {
        this.f4948b = chat;
    }

    @Override
    public final void run() {
        switch (this.f4947a) {
            case 0:
                h7.D2(w91.c0(this.f4948b, true));
                return;
            default:
                TLRPC.Chat chat = this.f4948b;
                if (chat != null) {
                    ?? obj = new Object();
                    obj.f22926a = true;
                    LaunchActivity.R().showAsSheet(new org.telegram.ui.x5(-chat.f22027id), obj);
                    return;
                }
                return;
        }
    }

    public k3(TLRPC.Chat chat) {
        this.f4948b = chat;
    }
}

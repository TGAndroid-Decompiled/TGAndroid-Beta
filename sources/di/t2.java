package di;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.c51;
public final class t2 implements Runnable {
    public final int f9797a = 0;
    public final TLRPC.Chat f9798b;

    public t2(f6 f6Var, TLRPC.Chat chat) {
        this.f9798b = chat;
    }

    @Override
    public final void run() {
        switch (this.f9797a) {
            case 0:
                f6.p2(c51.g0(this.f9798b, true));
                return;
            default:
                TLRPC.Chat chat = this.f9798b;
                if (chat != null) {
                    ?? obj = new Object();
                    obj.f28923a = true;
                    LaunchActivity.Q().showAsSheet(new org.telegram.ui.t5(-chat.f28405id), obj);
                    return;
                }
                return;
        }
    }

    public t2(TLRPC.Chat chat) {
        this.f9798b = chat;
    }
}

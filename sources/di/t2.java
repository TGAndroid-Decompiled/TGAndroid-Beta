package di;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.c51;
public final class t2 implements Runnable {
    public final int f9779a = 0;
    public final TLRPC.Chat f9780b;

    public t2(f6 f6Var, TLRPC.Chat chat) {
        this.f9780b = chat;
    }

    @Override
    public final void run() {
        switch (this.f9779a) {
            case 0:
                f6.p2(c51.g0(this.f9780b, true));
                return;
            default:
                TLRPC.Chat chat = this.f9780b;
                if (chat != null) {
                    ?? obj = new Object();
                    obj.f28871a = true;
                    LaunchActivity.Q().showAsSheet(new org.telegram.ui.t5(-chat.f28398id), obj);
                    return;
                }
                return;
        }
    }

    public t2(TLRPC.Chat chat) {
        this.f9780b = chat;
    }
}

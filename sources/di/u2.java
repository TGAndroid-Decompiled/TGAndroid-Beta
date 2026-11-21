package di;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.c51;
public final class u2 implements Runnable {
    public final int f9880a = 0;
    public final TLRPC.Chat f9881b;

    public u2(f6 f6Var, TLRPC.Chat chat) {
        this.f9881b = chat;
    }

    @Override
    public final void run() {
        switch (this.f9880a) {
            case 0:
                f6.p2(c51.g0(this.f9881b, true));
                return;
            default:
                TLRPC.Chat chat = this.f9881b;
                if (chat != null) {
                    ?? obj = new Object();
                    obj.f28902a = true;
                    LaunchActivity.Q().showAsSheet(new org.telegram.ui.t5(-chat.f28431id), obj);
                    return;
                }
                return;
        }
    }

    public u2(TLRPC.Chat chat) {
        this.f9881b = chat;
    }
}

package di;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.b51;
public final class u2 implements Runnable {
    public final int f9844a = 0;
    public final TLRPC.Chat f9845b;

    public u2(f6 f6Var, TLRPC.Chat chat) {
        this.f9845b = chat;
    }

    @Override
    public final void run() {
        switch (this.f9844a) {
            case 0:
                f6.p2(b51.g0(this.f9845b, true));
                return;
            default:
                TLRPC.Chat chat = this.f9845b;
                if (chat != null) {
                    ?? obj = new Object();
                    obj.f28948a = true;
                    LaunchActivity.Q().showAsSheet(new org.telegram.ui.t5(-chat.f28492id), obj);
                    return;
                }
                return;
        }
    }

    public u2(TLRPC.Chat chat) {
        this.f9845b = chat;
    }
}

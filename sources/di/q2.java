package di;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.z41;
public final class q2 implements Runnable {
    public final int f9258a = 0;
    public final TLRPC.Chat f9259b;

    public q2(c6 c6Var, TLRPC.Chat chat) {
        this.f9259b = chat;
    }

    @Override
    public final void run() {
        switch (this.f9258a) {
            case 0:
                c6.d2(z41.g0(this.f9259b, true));
                return;
            default:
                TLRPC.Chat chat = this.f9259b;
                if (chat != null) {
                    ?? obj = new Object();
                    obj.f28476a = true;
                    LaunchActivity.Q().showAsSheet(new org.telegram.ui.t5(-chat.f28051id), obj);
                    return;
                }
                return;
        }
    }

    public q2(TLRPC.Chat chat) {
        this.f9259b = chat;
    }
}

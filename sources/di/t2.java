package di;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.c51;
public final class t2 implements Runnable {
    public final int f9794a = 0;
    public final TLRPC.Chat f9795b;

    public t2(f6 f6Var, TLRPC.Chat chat) {
        this.f9795b = chat;
    }

    @Override
    public final void run() {
        switch (this.f9794a) {
            case 0:
                f6.p2(c51.g0(this.f9795b, true));
                return;
            default:
                TLRPC.Chat chat = this.f9795b;
                if (chat != null) {
                    ?? obj = new Object();
                    obj.f28921a = true;
                    LaunchActivity.Q().showAsSheet(new org.telegram.ui.t5(-chat.f28403id), obj);
                    return;
                }
                return;
        }
    }

    public t2(TLRPC.Chat chat) {
        this.f9795b = chat;
    }
}

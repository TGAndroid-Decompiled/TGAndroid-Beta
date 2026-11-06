package bi;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.c51;
public final class j3 implements Runnable {
    public final int f4080a = 0;
    public final TLRPC.Chat f4081b;

    public j3(k7 k7Var, TLRPC.Chat chat) {
        this.f4081b = chat;
    }

    @Override
    public final void run() {
        switch (this.f4080a) {
            case 0:
                k7.c2(c51.g0(this.f4081b, true));
                return;
            default:
                TLRPC.Chat chat = this.f4081b;
                if (chat != null) {
                    ?? obj = new Object();
                    obj.f27421a = true;
                    LaunchActivity.Q().showAsSheet(new org.telegram.ui.t5(-chat.f26953id), obj);
                    return;
                }
                return;
        }
    }

    public j3(TLRPC.Chat chat) {
        this.f4081b = chat;
    }
}

package ci;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.r41;
public final class w2 implements Runnable {
    public final int f6233a = 0;
    public final TLRPC.Chat f6234b;

    public w2(l6 l6Var, TLRPC.Chat chat) {
        this.f6234b = chat;
    }

    @Override
    public final void run() {
        switch (this.f6233a) {
            case 0:
                l6.c2(r41.g0(this.f6234b, true));
                return;
            default:
                TLRPC.Chat chat = this.f6234b;
                if (chat != null) {
                    ?? obj = new Object();
                    obj.f27395a = true;
                    LaunchActivity.Q().showAsSheet(new org.telegram.ui.v5(-chat.f27001id), obj);
                    return;
                }
                return;
        }
    }

    public w2(TLRPC.Chat chat) {
        this.f6234b = chat;
    }
}

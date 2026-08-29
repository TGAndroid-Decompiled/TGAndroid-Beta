package eg;

import jh.h5;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.t91;
import org.telegram.ui.v5;
public final class i implements Runnable {
    public final int f6031a = 1;
    public final TLRPC.Chat f6032b;

    public i(h5 h5Var, TLRPC.Chat chat) {
        this.f6032b = chat;
    }

    @Override
    public final void run() {
        switch (this.f6031a) {
            case 0:
                TLRPC.Chat chat = this.f6032b;
                if (chat != null) {
                    ?? obj = new Object();
                    obj.f23673a = true;
                    LaunchActivity.R().showAsSheet(new v5(-chat.f22392id), obj);
                    return;
                }
                return;
            default:
                h5.d2(t91.d0(this.f6032b, true));
                return;
        }
    }

    public i(TLRPC.Chat chat) {
        this.f6032b = chat;
    }
}

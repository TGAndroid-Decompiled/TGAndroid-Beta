package bi;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.e51;
public final class j3 implements Runnable {
    public final int f4077a = 0;
    public final TLRPC.Chat f4078b;

    public j3(k7 k7Var, TLRPC.Chat chat) {
        this.f4078b = chat;
    }

    @Override
    public final void run() {
        switch (this.f4077a) {
            case 0:
                k7.b2(e51.g0(this.f4078b, true));
                return;
            default:
                TLRPC.Chat chat = this.f4078b;
                if (chat != null) {
                    ?? obj = new Object();
                    obj.f27388a = true;
                    LaunchActivity.Q().showAsSheet(new org.telegram.ui.t5(-chat.f26960id), obj);
                    return;
                }
                return;
        }
    }

    public j3(TLRPC.Chat chat) {
        this.f4078b = chat;
    }
}

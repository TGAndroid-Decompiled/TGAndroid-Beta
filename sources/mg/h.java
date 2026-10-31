package mg;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.t5;
import org.telegram.ui.u61;
import rh.e4;
public final class h implements Runnable {
    public final int f13124a = 0;
    public final TLRPC.Chat f13125b;

    public h(TLRPC.Chat chat) {
        this.f13125b = chat;
    }

    @Override
    public final void run() {
        switch (this.f13124a) {
            case 0:
                TLRPC.Chat chat = this.f13125b;
                if (chat != null) {
                    ?? obj = new Object();
                    obj.f20389a = true;
                    LaunchActivity.Q().showAsSheet(new t5(-chat.f19793id), obj);
                    return;
                }
                return;
            default:
                e4.c2(u61.f0(this.f13125b, true));
                return;
        }
    }

    public h(e4 e4Var, TLRPC.Chat chat) {
        this.f13125b = chat;
    }
}

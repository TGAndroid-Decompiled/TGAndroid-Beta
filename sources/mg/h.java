package mg;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.s61;
import org.telegram.ui.t5;
import rh.e4;
public final class h implements Runnable {
    public final int f13125a = 0;
    public final TLRPC.Chat f13126b;

    public h(TLRPC.Chat chat) {
        this.f13126b = chat;
    }

    @Override
    public final void run() {
        switch (this.f13125a) {
            case 0:
                TLRPC.Chat chat = this.f13126b;
                if (chat != null) {
                    ?? obj = new Object();
                    obj.f20390a = true;
                    LaunchActivity.Q().showAsSheet(new t5(-chat.f19794id), obj);
                    return;
                }
                return;
            default:
                e4.c2(s61.g0(this.f13126b, true));
                return;
        }
    }

    public h(e4 e4Var, TLRPC.Chat chat) {
        this.f13126b = chat;
    }
}

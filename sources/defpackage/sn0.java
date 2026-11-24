package defpackage;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class sn0 implements Runnable {
    public final byte a = 0;
    public final TLRPC.Chat b;

    public sn0(wsa wsaVar, TLRPC.Chat chat) {
        this.b = chat;
    }

    @Override
    public final void run() {
        byte b = this.a;
        TLRPC.Chat chat = this.b;
        switch (b) {
            case 0:
                if (chat != null) {
                    ?? obj = new Object();
                    obj.a = true;
                    LaunchActivity.Q().showAsSheet(new lp0(-chat.id), obj);
                    return;
                }
                return;
            default:
                wsa.g2(xza.e0(chat, true));
                return;
        }
    }

    public sn0(TLRPC.Chat chat) {
        this.b = chat;
    }
}

package defpackage;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class sm0 implements Runnable {
    public final byte a = 0;
    public final TLRPC.Chat b;

    public sm0(wua wuaVar, TLRPC.Chat chat) {
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
                    LaunchActivity.Q().showAsSheet(new lo0(-chat.id), obj);
                    return;
                }
                return;
            default:
                wua.h2(w1b.d0(chat, true));
                return;
        }
    }

    public sm0(TLRPC.Chat chat) {
        this.b = chat;
    }
}

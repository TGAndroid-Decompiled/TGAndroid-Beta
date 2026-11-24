package defpackage;

import org.telegram.tgnet.TLRPC;
public final class z47 implements Runnable {
    public final byte a;
    public final na7 b;
    public final TLRPC.Chat c;

    public z47(na7 na7Var, TLRPC.Chat chat, byte b) {
        this.a = b;
        this.b = na7Var;
        this.c = chat;
    }

    @Override
    public final void run() {
        byte b = this.a;
        TLRPC.Chat chat = this.c;
        na7 na7Var = this.b;
        switch (b) {
            case 0:
                na7Var.g(chat);
                return;
            case 1:
                na7Var.getNotificationCenter().k(90, chat);
                return;
            case 2:
                na7Var.C(chat.id, true);
                return;
            case 3:
                na7Var.getNotificationCenter().k(90, chat);
                return;
            case 4:
                na7Var.getNotificationCenter().k(323, Long.valueOf(chat.id), Boolean.valueOf(chat.forum), Boolean.valueOf(chat.forum_tabs), Boolean.valueOf(chat.forum_sidebar));
                return;
            default:
                na7Var.Y4(null);
                na7Var.getNotificationCenter().k(351, Long.valueOf(chat.id), Boolean.valueOf(chat.collapsed_in_dialogs));
                na7Var.getNotificationCenter().k(3, new Object[0]);
                return;
        }
    }
}

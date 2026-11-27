package defpackage;

import org.telegram.tgnet.TLRPC;
public final class d97 implements Runnable {
    public final byte a;
    public final uc7 b;
    public final TLRPC.Chat c;

    public d97(uc7 uc7Var, TLRPC.Chat chat, byte b) {
        this.a = b;
        this.b = uc7Var;
        this.c = chat;
    }

    @Override
    public final void run() {
        byte b = this.a;
        TLRPC.Chat chat = this.c;
        uc7 uc7Var = this.b;
        switch (b) {
            case 0:
                uc7Var.getNotificationCenter().k(91, chat);
                return;
            case 1:
                uc7Var.E(chat.id, true);
                return;
            case 2:
                uc7Var.getNotificationCenter().k(91, chat);
                return;
            case 3:
                uc7Var.getNotificationCenter().k(324, Long.valueOf(chat.id), Boolean.valueOf(chat.forum), Boolean.valueOf(chat.forum_tabs), Boolean.valueOf(chat.forum_sidebar));
                return;
            case 4:
                uc7Var.h5(null);
                uc7Var.getNotificationCenter().k(352, Long.valueOf(chat.id), Boolean.valueOf(chat.collapsed_in_dialogs));
                uc7Var.getNotificationCenter().k(3, new Object[0]);
                return;
            default:
                uc7Var.g(chat);
                return;
        }
    }
}

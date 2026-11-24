package defpackage;

import org.telegram.tgnet.TLRPC;
public final class z67 implements Runnable {
    public final byte a;
    public final oc7 b;
    public final TLRPC.Chat c;

    public z67(oc7 oc7Var, TLRPC.Chat chat, byte b) {
        this.a = b;
        this.b = oc7Var;
        this.c = chat;
    }

    @Override
    public final void run() {
        byte b = this.a;
        TLRPC.Chat chat = this.c;
        oc7 oc7Var = this.b;
        switch (b) {
            case 0:
                oc7Var.g(chat);
                return;
            case 1:
                oc7Var.getNotificationCenter().k(91, chat);
                return;
            case 2:
                oc7Var.C(chat.id, true);
                return;
            case 3:
                oc7Var.getNotificationCenter().k(91, chat);
                return;
            case 4:
                oc7Var.getNotificationCenter().k(325, Long.valueOf(chat.id), Boolean.valueOf(chat.forum), Boolean.valueOf(chat.forum_tabs), Boolean.valueOf(chat.forum_sidebar));
                return;
            default:
                oc7Var.b5(null);
                oc7Var.getNotificationCenter().k(353, Long.valueOf(chat.id), Boolean.valueOf(chat.collapsed_in_dialogs));
                oc7Var.getNotificationCenter().k(3, new Object[0]);
                return;
        }
    }
}

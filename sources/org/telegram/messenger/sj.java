package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class sj implements Runnable {
    public final int f25469a;
    public final qp f25470b;
    public final TLRPC.Chat f25471c;

    public sj(qp qpVar, TLRPC.Chat chat, int i7) {
        this.f25469a = i7;
        this.f25470b = qpVar;
        this.f25471c = chat;
    }

    @Override
    public final void run() {
        int i7 = this.f25469a;
        TLRPC.Chat chat = this.f25471c;
        qp qpVar = this.f25470b;
        switch (i7) {
            case 0:
                qpVar.j(chat);
                return;
            case 1:
                qpVar.getNotificationCenter().k(90, chat);
                return;
            case 2:
                qpVar.getClass();
                qpVar.G(chat.f26952id, true);
                return;
            case 3:
                qpVar.getNotificationCenter().k(90, chat);
                return;
            case 4:
                qpVar.getNotificationCenter().k(320, Long.valueOf(chat.f26952id), Boolean.valueOf(chat.forum), Boolean.valueOf(chat.forum_tabs), Boolean.valueOf(chat.forum_sidebar));
                return;
            default:
                qpVar.T4(null);
                qpVar.getNotificationCenter().k(348, Long.valueOf(chat.f26952id), Boolean.valueOf(chat.collapsed_in_dialogs));
                qpVar.getNotificationCenter().k(3, new Object[0]);
                return;
        }
    }
}

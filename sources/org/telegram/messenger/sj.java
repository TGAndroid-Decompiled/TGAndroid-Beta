package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class sj implements Runnable {
    public final int f25477a;
    public final qp f25478b;
    public final TLRPC.Chat f25479c;

    public sj(qp qpVar, TLRPC.Chat chat, int i7) {
        this.f25477a = i7;
        this.f25478b = qpVar;
        this.f25479c = chat;
    }

    @Override
    public final void run() {
        int i7 = this.f25477a;
        TLRPC.Chat chat = this.f25479c;
        qp qpVar = this.f25478b;
        switch (i7) {
            case 0:
                qpVar.j(chat);
                return;
            case 1:
                qpVar.getNotificationCenter().k(90, chat);
                return;
            case 2:
                qpVar.getClass();
                qpVar.G(chat.f26953id, true);
                return;
            case 3:
                qpVar.getNotificationCenter().k(90, chat);
                return;
            case 4:
                qpVar.getNotificationCenter().k(320, Long.valueOf(chat.f26953id), Boolean.valueOf(chat.forum), Boolean.valueOf(chat.forum_tabs), Boolean.valueOf(chat.forum_sidebar));
                return;
            default:
                qpVar.T4(null);
                qpVar.getNotificationCenter().k(348, Long.valueOf(chat.f26953id), Boolean.valueOf(chat.collapsed_in_dialogs));
                qpVar.getNotificationCenter().k(3, new Object[0]);
                return;
        }
    }
}

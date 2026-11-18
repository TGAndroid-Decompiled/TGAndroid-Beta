package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class oj implements Runnable {
    public final int f26064a;
    public final mp f26065b;
    public final TLRPC.Chat f26066c;

    public oj(mp mpVar, TLRPC.Chat chat, int i7) {
        this.f26064a = i7;
        this.f26065b = mpVar;
        this.f26066c = chat;
    }

    @Override
    public final void run() {
        int i7 = this.f26064a;
        TLRPC.Chat chat = this.f26066c;
        mp mpVar = this.f26065b;
        switch (i7) {
            case 0:
                mpVar.j(chat);
                return;
            case 1:
                mpVar.getNotificationCenter().k(90, chat);
                return;
            case 2:
                mpVar.getClass();
                mpVar.G(chat.f28405id, true);
                return;
            case 3:
                mpVar.getNotificationCenter().k(90, chat);
                return;
            case 4:
                mpVar.getNotificationCenter().k(322, Long.valueOf(chat.f28405id), Boolean.valueOf(chat.forum), Boolean.valueOf(chat.forum_tabs), Boolean.valueOf(chat.forum_sidebar));
                return;
            default:
                mpVar.f5(null);
                mpVar.getNotificationCenter().k(350, Long.valueOf(chat.f28405id), Boolean.valueOf(chat.collapsed_in_dialogs));
                mpVar.getNotificationCenter().k(3, new Object[0]);
                return;
        }
    }
}

package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class oj implements Runnable {
    public final int f26090a;
    public final mp f26091b;
    public final TLRPC.Chat f26092c;

    public oj(mp mpVar, TLRPC.Chat chat, int i7) {
        this.f26090a = i7;
        this.f26091b = mpVar;
        this.f26092c = chat;
    }

    @Override
    public final void run() {
        int i7 = this.f26090a;
        TLRPC.Chat chat = this.f26092c;
        mp mpVar = this.f26091b;
        switch (i7) {
            case 0:
                mpVar.j(chat);
                return;
            case 1:
                mpVar.getNotificationCenter().k(90, chat);
                return;
            case 2:
                mpVar.getClass();
                mpVar.G(chat.f28431id, true);
                return;
            case 3:
                mpVar.getNotificationCenter().k(90, chat);
                return;
            case 4:
                mpVar.getNotificationCenter().k(323, Long.valueOf(chat.f28431id), Boolean.valueOf(chat.forum), Boolean.valueOf(chat.forum_tabs), Boolean.valueOf(chat.forum_sidebar));
                return;
            default:
                mpVar.f5(null);
                mpVar.getNotificationCenter().k(351, Long.valueOf(chat.f28431id), Boolean.valueOf(chat.collapsed_in_dialogs));
                mpVar.getNotificationCenter().k(3, new Object[0]);
                return;
        }
    }
}

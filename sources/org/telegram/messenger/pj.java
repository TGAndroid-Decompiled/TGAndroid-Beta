package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class pj implements Runnable {
    public final int f26272a;
    public final np f26273b;
    public final TLRPC.Chat f26274c;

    public pj(np npVar, TLRPC.Chat chat, int i7) {
        this.f26272a = i7;
        this.f26273b = npVar;
        this.f26274c = chat;
    }

    @Override
    public final void run() {
        int i7 = this.f26272a;
        TLRPC.Chat chat = this.f26274c;
        np npVar = this.f26273b;
        switch (i7) {
            case 0:
                npVar.j(chat);
                return;
            case 1:
                npVar.getNotificationCenter().k(90, chat);
                return;
            case 2:
                npVar.getClass();
                npVar.G(chat.f28398id, true);
                return;
            case 3:
                npVar.getNotificationCenter().k(90, chat);
                return;
            case 4:
                npVar.getNotificationCenter().k(323, Long.valueOf(chat.f28398id), Boolean.valueOf(chat.forum), Boolean.valueOf(chat.forum_tabs), Boolean.valueOf(chat.forum_sidebar));
                return;
            default:
                npVar.f5(null);
                npVar.getNotificationCenter().k(351, Long.valueOf(chat.f28398id), Boolean.valueOf(chat.collapsed_in_dialogs));
                npVar.getNotificationCenter().k(3, new Object[0]);
                return;
        }
    }
}

package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class pj implements Runnable {
    public final int f26308a;
    public final np f26309b;
    public final TLRPC.Chat f26310c;

    public pj(np npVar, TLRPC.Chat chat, int i7) {
        this.f26308a = i7;
        this.f26309b = npVar;
        this.f26310c = chat;
    }

    @Override
    public final void run() {
        int i7 = this.f26308a;
        TLRPC.Chat chat = this.f26310c;
        np npVar = this.f26309b;
        switch (i7) {
            case 0:
                npVar.j(chat);
                return;
            case 1:
                npVar.getNotificationCenter().k(90, chat);
                return;
            case 2:
                npVar.getClass();
                npVar.G(chat.f28434id, true);
                return;
            case 3:
                npVar.getNotificationCenter().k(90, chat);
                return;
            case 4:
                npVar.getNotificationCenter().k(323, Long.valueOf(chat.f28434id), Boolean.valueOf(chat.forum), Boolean.valueOf(chat.forum_tabs), Boolean.valueOf(chat.forum_sidebar));
                return;
            default:
                npVar.f5(null);
                npVar.getNotificationCenter().k(351, Long.valueOf(chat.f28434id), Boolean.valueOf(chat.collapsed_in_dialogs));
                npVar.getNotificationCenter().k(3, new Object[0]);
                return;
        }
    }
}

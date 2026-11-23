package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class oj implements Runnable {
    public final int f26159a;
    public final mp f26160b;
    public final TLRPC.Chat f26161c;

    public oj(mp mpVar, TLRPC.Chat chat, int i7) {
        this.f26159a = i7;
        this.f26160b = mpVar;
        this.f26161c = chat;
    }

    @Override
    public final void run() {
        int i7 = this.f26159a;
        TLRPC.Chat chat = this.f26161c;
        mp mpVar = this.f26160b;
        switch (i7) {
            case 0:
                mpVar.j(chat);
                return;
            case 1:
                mpVar.getNotificationCenter().k(90, chat);
                return;
            case 2:
                mpVar.getClass();
                mpVar.G(chat.f28492id, true);
                return;
            case 3:
                mpVar.getNotificationCenter().k(90, chat);
                return;
            case 4:
                mpVar.getNotificationCenter().k(323, Long.valueOf(chat.f28492id), Boolean.valueOf(chat.forum), Boolean.valueOf(chat.forum_tabs), Boolean.valueOf(chat.forum_sidebar));
                return;
            default:
                mpVar.f5(null);
                mpVar.getNotificationCenter().k(351, Long.valueOf(chat.f28492id), Boolean.valueOf(chat.collapsed_in_dialogs));
                mpVar.getNotificationCenter().k(3, new Object[0]);
                return;
        }
    }
}

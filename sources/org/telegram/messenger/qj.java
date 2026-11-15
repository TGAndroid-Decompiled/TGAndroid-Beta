package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class qj implements Runnable {
    public final int f26101a;
    public final np f26102b;
    public final TLRPC.Chat f26103c;

    public qj(np npVar, TLRPC.Chat chat, int i7) {
        this.f26101a = i7;
        this.f26102b = npVar;
        this.f26103c = chat;
    }

    @Override
    public final void run() {
        int i7 = this.f26101a;
        TLRPC.Chat chat = this.f26103c;
        np npVar = this.f26102b;
        switch (i7) {
            case 0:
                npVar.j(chat);
                return;
            case 1:
                npVar.getNotificationCenter().k(90, chat);
                return;
            case 2:
                npVar.getClass();
                npVar.G(chat.f28051id, true);
                return;
            case 3:
                npVar.getNotificationCenter().k(90, chat);
                return;
            case 4:
                npVar.getNotificationCenter().k(320, Long.valueOf(chat.f28051id), Boolean.valueOf(chat.forum), Boolean.valueOf(chat.forum_tabs), Boolean.valueOf(chat.forum_sidebar));
                return;
            default:
                npVar.U4(null);
                npVar.getNotificationCenter().k(348, Long.valueOf(chat.f28051id), Boolean.valueOf(chat.collapsed_in_dialogs));
                npVar.getNotificationCenter().k(3, new Object[0]);
                return;
        }
    }
}

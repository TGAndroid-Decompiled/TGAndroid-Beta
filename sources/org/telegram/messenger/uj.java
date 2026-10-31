package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class uj implements Runnable {
    public final int f18364a;
    public final vp f18365b;
    public final TLRPC.Chat f18366c;

    public uj(vp vpVar, TLRPC.Chat chat, int i10) {
        this.f18364a = i10;
        this.f18365b = vpVar;
        this.f18366c = chat;
    }

    @Override
    public final void run() {
        int i10 = this.f18364a;
        TLRPC.Chat chat = this.f18366c;
        vp vpVar = this.f18365b;
        switch (i10) {
            case 0:
                vpVar.j(chat);
                return;
            case 1:
                vpVar.getNotificationCenter().k(90, chat);
                return;
            case 2:
                vpVar.getClass();
                vpVar.G(chat.f19793id, true);
                return;
            case 3:
                vpVar.getNotificationCenter().k(90, chat);
                return;
            case 4:
                vpVar.getNotificationCenter().k(320, Long.valueOf(chat.f19793id), Boolean.valueOf(chat.forum), Boolean.valueOf(chat.forum_tabs), Boolean.valueOf(chat.forum_sidebar));
                return;
            default:
                vpVar.Q4(null);
                vpVar.getNotificationCenter().k(348, Long.valueOf(chat.f19793id), Boolean.valueOf(chat.collapsed_in_dialogs));
                vpVar.getNotificationCenter().k(3, new Object[0]);
                return;
        }
    }
}

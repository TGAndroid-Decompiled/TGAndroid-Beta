package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class vj implements Runnable {
    public final int f18746a;
    public final wp f18747b;
    public final TLRPC.Chat f18748c;

    public vj(wp wpVar, TLRPC.Chat chat, int i10) {
        this.f18746a = i10;
        this.f18747b = wpVar;
        this.f18748c = chat;
    }

    @Override
    public final void run() {
        int i10 = this.f18746a;
        TLRPC.Chat chat = this.f18748c;
        wp wpVar = this.f18747b;
        switch (i10) {
            case 0:
                wpVar.j(chat);
                return;
            case 1:
                wpVar.getNotificationCenter().k(90, chat);
                return;
            case 2:
                wpVar.getClass();
                wpVar.G(chat.f19794id, true);
                return;
            case 3:
                wpVar.getNotificationCenter().k(90, chat);
                return;
            case 4:
                wpVar.getNotificationCenter().k(320, Long.valueOf(chat.f19794id), Boolean.valueOf(chat.forum), Boolean.valueOf(chat.forum_tabs), Boolean.valueOf(chat.forum_sidebar));
                return;
            default:
                wpVar.Q4(null);
                wpVar.getNotificationCenter().k(348, Long.valueOf(chat.f19794id), Boolean.valueOf(chat.collapsed_in_dialogs));
                wpVar.getNotificationCenter().k(3, new Object[0]);
                return;
        }
    }
}

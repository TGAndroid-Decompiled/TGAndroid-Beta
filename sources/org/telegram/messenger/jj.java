package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class jj implements Runnable {
    public final int f23676a;
    public final hp f23677b;
    public final TLRPC.Chat f23678c;

    public jj(hp hpVar, TLRPC.Chat chat, int i3) {
        this.f23676a = i3;
        this.f23677b = hpVar;
        this.f23678c = chat;
    }

    @Override
    public final void run() {
        int i3 = this.f23676a;
        TLRPC.Chat chat = this.f23678c;
        hp hpVar = this.f23677b;
        switch (i3) {
            case 0:
                hpVar.j(chat);
                return;
            case 1:
                hpVar.getNotificationCenter().k(90, chat);
                return;
            case 2:
                hpVar.getClass();
                hpVar.G(chat.f27001id, true);
                return;
            case 3:
                hpVar.getNotificationCenter().k(90, chat);
                return;
            case 4:
                hpVar.getNotificationCenter().k(320, Long.valueOf(chat.f27001id), Boolean.valueOf(chat.forum), Boolean.valueOf(chat.forum_tabs), Boolean.valueOf(chat.forum_sidebar));
                return;
            default:
                hpVar.T4(null);
                hpVar.getNotificationCenter().k(348, Long.valueOf(chat.f27001id), Boolean.valueOf(chat.collapsed_in_dialogs));
                hpVar.getNotificationCenter().k(3, new Object[0]);
                return;
        }
    }
}

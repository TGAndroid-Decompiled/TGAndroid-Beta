package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
public final class vc implements Utilities.Callback {
    public final int f19820a = 2;
    public final MessagesController f19821b;
    public final Object f19822c;
    public final int d;
    public final Object e;
    public final Object f19823f;
    public final Object f19824g;

    public vc(MessagesController messagesController, TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers, int[] iArr, int i10, TLRPC.Chat chat, Runnable runnable) {
        this.f19821b = messagesController;
        this.e = tL_messages_invitedUsers;
        this.f19823f = iArr;
        this.d = i10;
        this.f19824g = chat;
        this.f19822c = runnable;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f19820a) {
            case 0:
                this.f19821b.lambda$openByUserName$458((pf.c) this.e, (org.telegram.ui.ActionBar.c2[]) this.f19823f, (org.telegram.ui.ActionBar.o2) this.f19824g, (boolean[]) this.f19822c, this.d, (Long) obj);
                return;
            case 1:
                this.f19821b.lambda$openApp$503((boolean[]) this.f19822c, (TL_bots.BotInfo[]) this.e, (TLRPC.User) this.f19823f, this.d, (h3) this.f19824g, (TL_bots.BotInfo) obj);
                return;
            default:
                this.f19821b.lambda$addUsersToChat$296((TLRPC.TL_messages_invitedUsers) this.e, (int[]) this.f19823f, this.d, (TLRPC.Chat) this.f19824g, (Runnable) this.f19822c, (TLRPC.TL_messages_invitedUsers) obj);
                return;
        }
    }

    public vc(MessagesController messagesController, pf.c cVar, org.telegram.ui.ActionBar.c2[] c2VarArr, org.telegram.ui.ActionBar.o2 o2Var, boolean[] zArr, int i10) {
        this.f19821b = messagesController;
        this.e = cVar;
        this.f19823f = c2VarArr;
        this.f19824g = o2Var;
        this.f19822c = zArr;
        this.d = i10;
    }

    public vc(MessagesController messagesController, boolean[] zArr, TL_bots.BotInfo[] botInfoArr, TLRPC.User user, int i10, h3 h3Var) {
        this.f19821b = messagesController;
        this.f19822c = zArr;
        this.e = botInfoArr;
        this.f19823f = user;
        this.d = i10;
        this.f19824g = h3Var;
    }
}

package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
public final class sc implements Utilities.Callback {
    public final int f19515a = 2;
    public final MessagesController f19516b;
    public final Object f19517c;
    public final int d;
    public final Object e;
    public final Object f19518f;
    public final Object f19519g;

    public sc(MessagesController messagesController, TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers, int[] iArr, int i10, TLRPC.Chat chat, Runnable runnable) {
        this.f19516b = messagesController;
        this.e = tL_messages_invitedUsers;
        this.f19518f = iArr;
        this.d = i10;
        this.f19519g = chat;
        this.f19517c = runnable;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f19515a) {
            case 0:
                this.f19516b.lambda$openByUserName$458((pf.c) this.e, (org.telegram.ui.ActionBar.b2[]) this.f19518f, (org.telegram.ui.ActionBar.n2) this.f19519g, (boolean[]) this.f19517c, this.d, (Long) obj);
                return;
            case 1:
                this.f19516b.lambda$openApp$503((boolean[]) this.f19517c, (TL_bots.BotInfo[]) this.e, (TLRPC.User) this.f19518f, this.d, (g3) this.f19519g, (TL_bots.BotInfo) obj);
                return;
            default:
                this.f19516b.lambda$addUsersToChat$296((TLRPC.TL_messages_invitedUsers) this.e, (int[]) this.f19518f, this.d, (TLRPC.Chat) this.f19519g, (Runnable) this.f19517c, (TLRPC.TL_messages_invitedUsers) obj);
                return;
        }
    }

    public sc(MessagesController messagesController, pf.c cVar, org.telegram.ui.ActionBar.b2[] b2VarArr, org.telegram.ui.ActionBar.n2 n2Var, boolean[] zArr, int i10) {
        this.f19516b = messagesController;
        this.e = cVar;
        this.f19518f = b2VarArr;
        this.f19519g = n2Var;
        this.f19517c = zArr;
        this.d = i10;
    }

    public sc(MessagesController messagesController, boolean[] zArr, TL_bots.BotInfo[] botInfoArr, TLRPC.User user, int i10, g3 g3Var) {
        this.f19516b = messagesController;
        this.f19517c = zArr;
        this.e = botInfoArr;
        this.f19518f = user;
        this.d = i10;
        this.f19519g = g3Var;
    }
}

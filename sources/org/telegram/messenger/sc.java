package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
public final class sc implements Utilities.Callback {
    public final int f19512a = 2;
    public final MessagesController f19513b;
    public final Object f19514c;
    public final int d;
    public final Object e;
    public final Object f19515f;
    public final Object f19516g;

    public sc(MessagesController messagesController, TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers, int[] iArr, int i10, TLRPC.Chat chat, Runnable runnable) {
        this.f19513b = messagesController;
        this.e = tL_messages_invitedUsers;
        this.f19515f = iArr;
        this.d = i10;
        this.f19516g = chat;
        this.f19514c = runnable;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f19512a) {
            case 0:
                this.f19513b.lambda$openByUserName$458((pf.c) this.e, (org.telegram.ui.ActionBar.b2[]) this.f19515f, (org.telegram.ui.ActionBar.n2) this.f19516g, (boolean[]) this.f19514c, this.d, (Long) obj);
                return;
            case 1:
                this.f19513b.lambda$openApp$503((boolean[]) this.f19514c, (TL_bots.BotInfo[]) this.e, (TLRPC.User) this.f19515f, this.d, (h3) this.f19516g, (TL_bots.BotInfo) obj);
                return;
            default:
                this.f19513b.lambda$addUsersToChat$296((TLRPC.TL_messages_invitedUsers) this.e, (int[]) this.f19515f, this.d, (TLRPC.Chat) this.f19516g, (Runnable) this.f19514c, (TLRPC.TL_messages_invitedUsers) obj);
                return;
        }
    }

    public sc(MessagesController messagesController, pf.c cVar, org.telegram.ui.ActionBar.b2[] b2VarArr, org.telegram.ui.ActionBar.n2 n2Var, boolean[] zArr, int i10) {
        this.f19513b = messagesController;
        this.e = cVar;
        this.f19515f = b2VarArr;
        this.f19516g = n2Var;
        this.f19514c = zArr;
        this.d = i10;
    }

    public sc(MessagesController messagesController, boolean[] zArr, TL_bots.BotInfo[] botInfoArr, TLRPC.User user, int i10, h3 h3Var) {
        this.f19513b = messagesController;
        this.f19514c = zArr;
        this.e = botInfoArr;
        this.f19515f = user;
        this.d = i10;
        this.f19516g = h3Var;
    }
}

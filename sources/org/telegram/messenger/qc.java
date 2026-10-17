package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
public final class qc implements Utilities.Callback {
    public final int f19340a = 2;
    public final MessagesController f19341b;
    public final Object f19342c;
    public final int d;
    public final Object e;
    public final Object f19343f;
    public final Object f19344g;

    public qc(MessagesController messagesController, TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers, int[] iArr, int i10, TLRPC.Chat chat, Runnable runnable) {
        this.f19341b = messagesController;
        this.e = tL_messages_invitedUsers;
        this.f19343f = iArr;
        this.d = i10;
        this.f19344g = chat;
        this.f19342c = runnable;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f19340a) {
            case 0:
                this.f19341b.lambda$openByUserName$458((pf.c) this.e, (org.telegram.ui.ActionBar.b2[]) this.f19343f, (org.telegram.ui.ActionBar.n2) this.f19344g, (boolean[]) this.f19342c, this.d, (Long) obj);
                return;
            case 1:
                this.f19341b.lambda$openApp$503((boolean[]) this.f19342c, (TL_bots.BotInfo[]) this.e, (TLRPC.User) this.f19343f, this.d, (f3) this.f19344g, (TL_bots.BotInfo) obj);
                return;
            default:
                this.f19341b.lambda$addUsersToChat$296((TLRPC.TL_messages_invitedUsers) this.e, (int[]) this.f19343f, this.d, (TLRPC.Chat) this.f19344g, (Runnable) this.f19342c, (TLRPC.TL_messages_invitedUsers) obj);
                return;
        }
    }

    public qc(MessagesController messagesController, pf.c cVar, org.telegram.ui.ActionBar.b2[] b2VarArr, org.telegram.ui.ActionBar.n2 n2Var, boolean[] zArr, int i10) {
        this.f19341b = messagesController;
        this.e = cVar;
        this.f19343f = b2VarArr;
        this.f19344g = n2Var;
        this.f19342c = zArr;
        this.d = i10;
    }

    public qc(MessagesController messagesController, boolean[] zArr, TL_bots.BotInfo[] botInfoArr, TLRPC.User user, int i10, f3 f3Var) {
        this.f19341b = messagesController;
        this.f19342c = zArr;
        this.e = botInfoArr;
        this.f19343f = user;
        this.d = i10;
        this.f19344g = f3Var;
    }
}

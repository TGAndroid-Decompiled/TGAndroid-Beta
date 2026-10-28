package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
public final class qc implements Utilities.Callback {
    public final int f21040a = 2;
    public final MessagesController f21041b;
    public final Object f21042c;
    public final int d;
    public final Object e;
    public final Object f21043f;
    public final Object f21044g;

    public qc(MessagesController messagesController, TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers, int[] iArr, int i10, TLRPC.Chat chat, Runnable runnable) {
        this.f21041b = messagesController;
        this.e = tL_messages_invitedUsers;
        this.f21043f = iArr;
        this.d = i10;
        this.f21044g = chat;
        this.f21042c = runnable;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f21040a) {
            case 0:
                this.f21041b.lambda$openByUserName$461((qf.c) this.e, (org.telegram.ui.ActionBar.e2[]) this.f21043f, (org.telegram.ui.ActionBar.r2) this.f21044g, (boolean[]) this.f21042c, this.d, (Long) obj);
                return;
            case 1:
                this.f21041b.lambda$openApp$506((boolean[]) this.f21042c, (TL_bots.BotInfo[]) this.e, (TLRPC.User) this.f21043f, this.d, (i3) this.f21044g, (TL_bots.BotInfo) obj);
                return;
            default:
                this.f21041b.lambda$addUsersToChat$296((TLRPC.TL_messages_invitedUsers) this.e, (int[]) this.f21043f, this.d, (TLRPC.Chat) this.f21044g, (Runnable) this.f21042c, (TLRPC.TL_messages_invitedUsers) obj);
                return;
        }
    }

    public qc(MessagesController messagesController, qf.c cVar, org.telegram.ui.ActionBar.e2[] e2VarArr, org.telegram.ui.ActionBar.r2 r2Var, boolean[] zArr, int i10) {
        this.f21041b = messagesController;
        this.e = cVar;
        this.f21043f = e2VarArr;
        this.f21044g = r2Var;
        this.f21042c = zArr;
        this.d = i10;
    }

    public qc(MessagesController messagesController, boolean[] zArr, TL_bots.BotInfo[] botInfoArr, TLRPC.User user, int i10, i3 i3Var) {
        this.f21041b = messagesController;
        this.f21042c = zArr;
        this.e = botInfoArr;
        this.f21043f = user;
        this.d = i10;
        this.f21044g = i3Var;
    }
}

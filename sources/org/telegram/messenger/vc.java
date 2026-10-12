package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
public final class vc implements Utilities.Callback {
    public final int f18670a = 2;
    public final MessagesController f18671b;
    public final Object f18672c;
    public final int d;
    public final Object e;
    public final Object f18673f;
    public final Object f18674g;

    public vc(MessagesController messagesController, TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers, int[] iArr, int i10, TLRPC.Chat chat, Runnable runnable) {
        this.f18671b = messagesController;
        this.e = tL_messages_invitedUsers;
        this.f18673f = iArr;
        this.d = i10;
        this.f18674g = chat;
        this.f18672c = runnable;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f18670a) {
            case 0:
                this.f18671b.lambda$openByUserName$458((pf.c) this.e, (org.telegram.ui.ActionBar.a2[]) this.f18673f, (org.telegram.ui.ActionBar.m2) this.f18674g, (boolean[]) this.f18672c, this.d, (Long) obj);
                return;
            case 1:
                this.f18671b.lambda$openApp$503((boolean[]) this.f18672c, (TL_bots.BotInfo[]) this.e, (TLRPC.User) this.f18673f, this.d, (f3) this.f18674g, (TL_bots.BotInfo) obj);
                return;
            default:
                this.f18671b.lambda$addUsersToChat$296((TLRPC.TL_messages_invitedUsers) this.e, (int[]) this.f18673f, this.d, (TLRPC.Chat) this.f18674g, (Runnable) this.f18672c, (TLRPC.TL_messages_invitedUsers) obj);
                return;
        }
    }

    public vc(MessagesController messagesController, pf.c cVar, org.telegram.ui.ActionBar.a2[] a2VarArr, org.telegram.ui.ActionBar.m2 m2Var, boolean[] zArr, int i10) {
        this.f18671b = messagesController;
        this.e = cVar;
        this.f18673f = a2VarArr;
        this.f18674g = m2Var;
        this.f18672c = zArr;
        this.d = i10;
    }

    public vc(MessagesController messagesController, boolean[] zArr, TL_bots.BotInfo[] botInfoArr, TLRPC.User user, int i10, f3 f3Var) {
        this.f18671b = messagesController;
        this.f18672c = zArr;
        this.e = botInfoArr;
        this.f18673f = user;
        this.d = i10;
        this.f18674g = f3Var;
    }
}

package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
public final class rc implements Utilities.Callback {
    public final int f21130a = 2;
    public final MessagesController f21131b;
    public final Object f21132c;
    public final int d;
    public final Object e;
    public final Object f21133f;
    public final Object f21134g;

    public rc(MessagesController messagesController, TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers, int[] iArr, int i10, TLRPC.Chat chat, Runnable runnable) {
        this.f21131b = messagesController;
        this.e = tL_messages_invitedUsers;
        this.f21133f = iArr;
        this.d = i10;
        this.f21134g = chat;
        this.f21132c = runnable;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f21130a) {
            case 0:
                this.f21131b.lambda$openByUserName$460((qf.c) this.e, (org.telegram.ui.ActionBar.e2[]) this.f21133f, (org.telegram.ui.ActionBar.r2) this.f21134g, (boolean[]) this.f21132c, this.d, (Long) obj);
                return;
            case 1:
                this.f21131b.lambda$openApp$505((boolean[]) this.f21132c, (TL_bots.BotInfo[]) this.e, (TLRPC.User) this.f21133f, this.d, (i3) this.f21134g, (TL_bots.BotInfo) obj);
                return;
            default:
                this.f21131b.lambda$addUsersToChat$296((TLRPC.TL_messages_invitedUsers) this.e, (int[]) this.f21133f, this.d, (TLRPC.Chat) this.f21134g, (Runnable) this.f21132c, (TLRPC.TL_messages_invitedUsers) obj);
                return;
        }
    }

    public rc(MessagesController messagesController, qf.c cVar, org.telegram.ui.ActionBar.e2[] e2VarArr, org.telegram.ui.ActionBar.r2 r2Var, boolean[] zArr, int i10) {
        this.f21131b = messagesController;
        this.e = cVar;
        this.f21133f = e2VarArr;
        this.f21134g = r2Var;
        this.f21132c = zArr;
        this.d = i10;
    }

    public rc(MessagesController messagesController, boolean[] zArr, TL_bots.BotInfo[] botInfoArr, TLRPC.User user, int i10, i3 i3Var) {
        this.f21131b = messagesController;
        this.f21132c = zArr;
        this.e = botInfoArr;
        this.f21133f = user;
        this.d = i10;
        this.f21134g = i3Var;
    }
}

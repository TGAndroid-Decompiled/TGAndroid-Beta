package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
public final class vc implements Utilities.Callback {
    public final int f18368a = 2;
    public final MessagesController f18369b;
    public final Object f18370c;
    public final int d;
    public final Object e;
    public final Object f18371f;
    public final Object f18372g;

    public vc(MessagesController messagesController, TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers, int[] iArr, int i10, TLRPC.Chat chat, Runnable runnable) {
        this.f18369b = messagesController;
        this.e = tL_messages_invitedUsers;
        this.f18371f = iArr;
        this.d = i10;
        this.f18372g = chat;
        this.f18370c = runnable;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f18368a) {
            case 0:
                this.f18369b.lambda$openByUserName$458((pf.c) this.e, (org.telegram.ui.ActionBar.a2[]) this.f18371f, (org.telegram.ui.ActionBar.m2) this.f18372g, (boolean[]) this.f18370c, this.d, (Long) obj);
                return;
            case 1:
                this.f18369b.lambda$openApp$503((boolean[]) this.f18370c, (TL_bots.BotInfo[]) this.e, (TLRPC.User) this.f18371f, this.d, (f3) this.f18372g, (TL_bots.BotInfo) obj);
                return;
            default:
                this.f18369b.lambda$addUsersToChat$296((TLRPC.TL_messages_invitedUsers) this.e, (int[]) this.f18371f, this.d, (TLRPC.Chat) this.f18372g, (Runnable) this.f18370c, (TLRPC.TL_messages_invitedUsers) obj);
                return;
        }
    }

    public vc(MessagesController messagesController, pf.c cVar, org.telegram.ui.ActionBar.a2[] a2VarArr, org.telegram.ui.ActionBar.m2 m2Var, boolean[] zArr, int i10) {
        this.f18369b = messagesController;
        this.e = cVar;
        this.f18371f = a2VarArr;
        this.f18372g = m2Var;
        this.f18370c = zArr;
        this.d = i10;
    }

    public vc(MessagesController messagesController, boolean[] zArr, TL_bots.BotInfo[] botInfoArr, TLRPC.User user, int i10, f3 f3Var) {
        this.f18369b = messagesController;
        this.f18370c = zArr;
        this.e = botInfoArr;
        this.f18371f = user;
        this.d = i10;
        this.f18372g = f3Var;
    }
}

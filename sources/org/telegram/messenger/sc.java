package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
public final class sc implements Utilities.Callback {
    public final int f19145a = 0;
    public final MessagesController f19146b;
    public final Object f19147c;
    public final int d;
    public final Object f19148e;
    public final Object f19149f;
    public final Object f19150g;

    public sc(MessagesController messagesController, of.e eVar, org.telegram.ui.ActionBar.a2[] a2VarArr, org.telegram.ui.ActionBar.m2 m2Var, boolean[] zArr, int i10) {
        this.f19146b = messagesController;
        this.f19148e = eVar;
        this.f19149f = a2VarArr;
        this.f19150g = m2Var;
        this.f19147c = zArr;
        this.d = i10;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f19145a) {
            case 0:
                this.f19146b.lambda$openByUserName$458((of.e) this.f19148e, (org.telegram.ui.ActionBar.a2[]) this.f19149f, (org.telegram.ui.ActionBar.m2) this.f19150g, (boolean[]) this.f19147c, this.d, (Long) obj);
                return;
            case 1:
                this.f19146b.lambda$openApp$503((boolean[]) this.f19147c, (TL_bots.BotInfo[]) this.f19148e, (TLRPC.User) this.f19149f, this.d, (c3) this.f19150g, (TL_bots.BotInfo) obj);
                return;
            default:
                this.f19146b.lambda$addUsersToChat$296((TLRPC.TL_messages_invitedUsers) this.f19148e, (int[]) this.f19149f, this.d, (TLRPC.Chat) this.f19150g, (Runnable) this.f19147c, (TLRPC.TL_messages_invitedUsers) obj);
                return;
        }
    }

    public sc(MessagesController messagesController, TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers, int[] iArr, int i10, TLRPC.Chat chat, Runnable runnable) {
        this.f19146b = messagesController;
        this.f19148e = tL_messages_invitedUsers;
        this.f19149f = iArr;
        this.d = i10;
        this.f19150g = chat;
        this.f19147c = runnable;
    }

    public sc(MessagesController messagesController, boolean[] zArr, TL_bots.BotInfo[] botInfoArr, TLRPC.User user, int i10, c3 c3Var) {
        this.f19146b = messagesController;
        this.f19147c = zArr;
        this.f19148e = botInfoArr;
        this.f19149f = user;
        this.d = i10;
        this.f19150g = c3Var;
    }
}

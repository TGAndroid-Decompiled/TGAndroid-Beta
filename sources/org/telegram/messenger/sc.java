package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
public final class sc implements Utilities.Callback {
    public final int f19181a = 0;
    public final MessagesController f19182b;
    public final Object f19183c;
    public final int d;
    public final Object f19184e;
    public final Object f19185f;
    public final Object f19186g;

    public sc(MessagesController messagesController, of.e eVar, org.telegram.ui.ActionBar.a2[] a2VarArr, org.telegram.ui.ActionBar.m2 m2Var, boolean[] zArr, int i10) {
        this.f19182b = messagesController;
        this.f19184e = eVar;
        this.f19185f = a2VarArr;
        this.f19186g = m2Var;
        this.f19183c = zArr;
        this.d = i10;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f19181a) {
            case 0:
                this.f19182b.lambda$openByUserName$458((of.e) this.f19184e, (org.telegram.ui.ActionBar.a2[]) this.f19185f, (org.telegram.ui.ActionBar.m2) this.f19186g, (boolean[]) this.f19183c, this.d, (Long) obj);
                return;
            case 1:
                this.f19182b.lambda$openApp$503((boolean[]) this.f19183c, (TL_bots.BotInfo[]) this.f19184e, (TLRPC.User) this.f19185f, this.d, (c3) this.f19186g, (TL_bots.BotInfo) obj);
                return;
            default:
                this.f19182b.lambda$addUsersToChat$296((TLRPC.TL_messages_invitedUsers) this.f19184e, (int[]) this.f19185f, this.d, (TLRPC.Chat) this.f19186g, (Runnable) this.f19183c, (TLRPC.TL_messages_invitedUsers) obj);
                return;
        }
    }

    public sc(MessagesController messagesController, TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers, int[] iArr, int i10, TLRPC.Chat chat, Runnable runnable) {
        this.f19182b = messagesController;
        this.f19184e = tL_messages_invitedUsers;
        this.f19185f = iArr;
        this.d = i10;
        this.f19186g = chat;
        this.f19183c = runnable;
    }

    public sc(MessagesController messagesController, boolean[] zArr, TL_bots.BotInfo[] botInfoArr, TLRPC.User user, int i10, c3 c3Var) {
        this.f19182b = messagesController;
        this.f19183c = zArr;
        this.f19184e = botInfoArr;
        this.f19185f = user;
        this.d = i10;
        this.f19186g = c3Var;
    }
}

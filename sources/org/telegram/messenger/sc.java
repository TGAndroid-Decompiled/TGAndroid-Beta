package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
public final class sc implements Utilities.Callback {
    public final int f19139a = 0;
    public final MessagesController f19140b;
    public final Object f19141c;
    public final int d;
    public final Object f19142e;
    public final Object f19143f;
    public final Object f19144g;

    public sc(MessagesController messagesController, of.e eVar, org.telegram.ui.ActionBar.b2[] b2VarArr, org.telegram.ui.ActionBar.n2 n2Var, boolean[] zArr, int i10) {
        this.f19140b = messagesController;
        this.f19142e = eVar;
        this.f19143f = b2VarArr;
        this.f19144g = n2Var;
        this.f19141c = zArr;
        this.d = i10;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f19139a) {
            case 0:
                this.f19140b.lambda$openByUserName$458((of.e) this.f19142e, (org.telegram.ui.ActionBar.b2[]) this.f19143f, (org.telegram.ui.ActionBar.n2) this.f19144g, (boolean[]) this.f19141c, this.d, (Long) obj);
                return;
            case 1:
                this.f19140b.lambda$openApp$503((boolean[]) this.f19141c, (TL_bots.BotInfo[]) this.f19142e, (TLRPC.User) this.f19143f, this.d, (c3) this.f19144g, (TL_bots.BotInfo) obj);
                return;
            default:
                this.f19140b.lambda$addUsersToChat$296((TLRPC.TL_messages_invitedUsers) this.f19142e, (int[]) this.f19143f, this.d, (TLRPC.Chat) this.f19144g, (Runnable) this.f19141c, (TLRPC.TL_messages_invitedUsers) obj);
                return;
        }
    }

    public sc(MessagesController messagesController, TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers, int[] iArr, int i10, TLRPC.Chat chat, Runnable runnable) {
        this.f19140b = messagesController;
        this.f19142e = tL_messages_invitedUsers;
        this.f19143f = iArr;
        this.d = i10;
        this.f19144g = chat;
        this.f19141c = runnable;
    }

    public sc(MessagesController messagesController, boolean[] zArr, TL_bots.BotInfo[] botInfoArr, TLRPC.User user, int i10, c3 c3Var) {
        this.f19140b = messagesController;
        this.f19141c = zArr;
        this.f19142e = botInfoArr;
        this.f19143f = user;
        this.d = i10;
        this.f19144g = c3Var;
    }
}

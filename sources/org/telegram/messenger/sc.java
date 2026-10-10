package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
public final class sc implements Utilities.Callback {
    public final int f19143a = 0;
    public final MessagesController f19144b;
    public final Object f19145c;
    public final int d;
    public final Object f19146e;
    public final Object f19147f;
    public final Object f19148g;

    public sc(MessagesController messagesController, of.e eVar, org.telegram.ui.ActionBar.b2[] b2VarArr, org.telegram.ui.ActionBar.n2 n2Var, boolean[] zArr, int i10) {
        this.f19144b = messagesController;
        this.f19146e = eVar;
        this.f19147f = b2VarArr;
        this.f19148g = n2Var;
        this.f19145c = zArr;
        this.d = i10;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f19143a) {
            case 0:
                this.f19144b.lambda$openByUserName$458((of.e) this.f19146e, (org.telegram.ui.ActionBar.b2[]) this.f19147f, (org.telegram.ui.ActionBar.n2) this.f19148g, (boolean[]) this.f19145c, this.d, (Long) obj);
                return;
            case 1:
                this.f19144b.lambda$openApp$503((boolean[]) this.f19145c, (TL_bots.BotInfo[]) this.f19146e, (TLRPC.User) this.f19147f, this.d, (c3) this.f19148g, (TL_bots.BotInfo) obj);
                return;
            default:
                this.f19144b.lambda$addUsersToChat$296((TLRPC.TL_messages_invitedUsers) this.f19146e, (int[]) this.f19147f, this.d, (TLRPC.Chat) this.f19148g, (Runnable) this.f19145c, (TLRPC.TL_messages_invitedUsers) obj);
                return;
        }
    }

    public sc(MessagesController messagesController, TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers, int[] iArr, int i10, TLRPC.Chat chat, Runnable runnable) {
        this.f19144b = messagesController;
        this.f19146e = tL_messages_invitedUsers;
        this.f19147f = iArr;
        this.d = i10;
        this.f19148g = chat;
        this.f19145c = runnable;
    }

    public sc(MessagesController messagesController, boolean[] zArr, TL_bots.BotInfo[] botInfoArr, TLRPC.User user, int i10, c3 c3Var) {
        this.f19144b = messagesController;
        this.f19145c = zArr;
        this.f19146e = botInfoArr;
        this.f19147f = user;
        this.d = i10;
        this.f19148g = c3Var;
    }
}

package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
public final class rc implements Utilities.Callback {
    public final int f19422a = 2;
    public final MessagesController f19423b;
    public final Object f19424c;
    public final int d;
    public final Object e;
    public final Object f19425f;
    public final Object f19426g;

    public rc(MessagesController messagesController, TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers, int[] iArr, int i10, TLRPC.Chat chat, Runnable runnable) {
        this.f19423b = messagesController;
        this.e = tL_messages_invitedUsers;
        this.f19425f = iArr;
        this.d = i10;
        this.f19426g = chat;
        this.f19424c = runnable;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f19422a) {
            case 0:
                this.f19423b.lambda$openByUserName$458((pf.c) this.e, (org.telegram.ui.ActionBar.b2[]) this.f19425f, (org.telegram.ui.ActionBar.n2) this.f19426g, (boolean[]) this.f19424c, this.d, (Long) obj);
                return;
            case 1:
                this.f19423b.lambda$openApp$503((boolean[]) this.f19424c, (TL_bots.BotInfo[]) this.e, (TLRPC.User) this.f19425f, this.d, (f3) this.f19426g, (TL_bots.BotInfo) obj);
                return;
            default:
                this.f19423b.lambda$addUsersToChat$296((TLRPC.TL_messages_invitedUsers) this.e, (int[]) this.f19425f, this.d, (TLRPC.Chat) this.f19426g, (Runnable) this.f19424c, (TLRPC.TL_messages_invitedUsers) obj);
                return;
        }
    }

    public rc(MessagesController messagesController, pf.c cVar, org.telegram.ui.ActionBar.b2[] b2VarArr, org.telegram.ui.ActionBar.n2 n2Var, boolean[] zArr, int i10) {
        this.f19423b = messagesController;
        this.e = cVar;
        this.f19425f = b2VarArr;
        this.f19426g = n2Var;
        this.f19424c = zArr;
        this.d = i10;
    }

    public rc(MessagesController messagesController, boolean[] zArr, TL_bots.BotInfo[] botInfoArr, TLRPC.User user, int i10, f3 f3Var) {
        this.f19423b = messagesController;
        this.f19424c = zArr;
        this.e = botInfoArr;
        this.f19425f = user;
        this.d = i10;
        this.f19426g = f3Var;
    }
}

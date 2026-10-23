package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
public final class uc implements Utilities.Callback {
    public final int f19684a = 2;
    public final MessagesController f19685b;
    public final Object f19686c;
    public final int d;
    public final Object e;
    public final Object f19687f;
    public final Object f19688g;

    public uc(MessagesController messagesController, TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers, int[] iArr, int i10, TLRPC.Chat chat, Runnable runnable) {
        this.f19685b = messagesController;
        this.e = tL_messages_invitedUsers;
        this.f19687f = iArr;
        this.d = i10;
        this.f19688g = chat;
        this.f19686c = runnable;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f19684a) {
            case 0:
                this.f19685b.lambda$openByUserName$458((pf.c) this.e, (org.telegram.ui.ActionBar.b2[]) this.f19687f, (org.telegram.ui.ActionBar.n2) this.f19688g, (boolean[]) this.f19686c, this.d, (Long) obj);
                return;
            case 1:
                this.f19685b.lambda$openApp$503((boolean[]) this.f19686c, (TL_bots.BotInfo[]) this.e, (TLRPC.User) this.f19687f, this.d, (h3) this.f19688g, (TL_bots.BotInfo) obj);
                return;
            default:
                this.f19685b.lambda$addUsersToChat$296((TLRPC.TL_messages_invitedUsers) this.e, (int[]) this.f19687f, this.d, (TLRPC.Chat) this.f19688g, (Runnable) this.f19686c, (TLRPC.TL_messages_invitedUsers) obj);
                return;
        }
    }

    public uc(MessagesController messagesController, pf.c cVar, org.telegram.ui.ActionBar.b2[] b2VarArr, org.telegram.ui.ActionBar.n2 n2Var, boolean[] zArr, int i10) {
        this.f19685b = messagesController;
        this.e = cVar;
        this.f19687f = b2VarArr;
        this.f19688g = n2Var;
        this.f19686c = zArr;
        this.d = i10;
    }

    public uc(MessagesController messagesController, boolean[] zArr, TL_bots.BotInfo[] botInfoArr, TLRPC.User user, int i10, h3 h3Var) {
        this.f19685b = messagesController;
        this.f19686c = zArr;
        this.e = botInfoArr;
        this.f19687f = user;
        this.d = i10;
        this.f19688g = h3Var;
    }
}

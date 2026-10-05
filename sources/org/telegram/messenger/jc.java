package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
public final class jc implements Utilities.Callback {
    public final int f18255a = 0;
    public final MessagesController f18256b;
    public final Object f18257c;
    public final int d;
    public final Object f18258e;
    public final Object f18259f;
    public final Object f18260g;

    public jc(MessagesController messagesController, nf.e eVar, org.telegram.ui.ActionBar.b2[] b2VarArr, org.telegram.ui.ActionBar.n2 n2Var, boolean[] zArr, int i10) {
        this.f18256b = messagesController;
        this.f18258e = eVar;
        this.f18259f = b2VarArr;
        this.f18260g = n2Var;
        this.f18257c = zArr;
        this.d = i10;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f18255a) {
            case 0:
                this.f18256b.lambda$openByUserName$455((nf.e) this.f18258e, (org.telegram.ui.ActionBar.b2[]) this.f18259f, (org.telegram.ui.ActionBar.n2) this.f18260g, (boolean[]) this.f18257c, this.d, (Long) obj);
                return;
            case 1:
                this.f18256b.lambda$openApp$500((boolean[]) this.f18257c, (TL_bots.BotInfo[]) this.f18258e, (TLRPC.User) this.f18259f, this.d, (c3) this.f18260g, (TL_bots.BotInfo) obj);
                return;
            default:
                this.f18256b.lambda$addUsersToChat$297((TLRPC.TL_messages_invitedUsers) this.f18258e, (int[]) this.f18259f, this.d, (TLRPC.Chat) this.f18260g, (Runnable) this.f18257c, (TLRPC.TL_messages_invitedUsers) obj);
                return;
        }
    }

    public jc(MessagesController messagesController, TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers, int[] iArr, int i10, TLRPC.Chat chat, Runnable runnable) {
        this.f18256b = messagesController;
        this.f18258e = tL_messages_invitedUsers;
        this.f18259f = iArr;
        this.d = i10;
        this.f18260g = chat;
        this.f18257c = runnable;
    }

    public jc(MessagesController messagesController, boolean[] zArr, TL_bots.BotInfo[] botInfoArr, TLRPC.User user, int i10, c3 c3Var) {
        this.f18256b = messagesController;
        this.f18257c = zArr;
        this.f18258e = botInfoArr;
        this.f18259f = user;
        this.d = i10;
        this.f18260g = c3Var;
    }
}

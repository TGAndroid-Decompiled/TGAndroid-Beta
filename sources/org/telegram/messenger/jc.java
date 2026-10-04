package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
public final class jc implements Utilities.Callback {
    public final int f18256a = 0;
    public final MessagesController f18257b;
    public final Object f18258c;
    public final int d;
    public final Object f18259e;
    public final Object f18260f;
    public final Object f18261g;

    public jc(MessagesController messagesController, nf.e eVar, org.telegram.ui.ActionBar.b2[] b2VarArr, org.telegram.ui.ActionBar.n2 n2Var, boolean[] zArr, int i10) {
        this.f18257b = messagesController;
        this.f18259e = eVar;
        this.f18260f = b2VarArr;
        this.f18261g = n2Var;
        this.f18258c = zArr;
        this.d = i10;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f18256a) {
            case 0:
                this.f18257b.lambda$openByUserName$455((nf.e) this.f18259e, (org.telegram.ui.ActionBar.b2[]) this.f18260f, (org.telegram.ui.ActionBar.n2) this.f18261g, (boolean[]) this.f18258c, this.d, (Long) obj);
                return;
            case 1:
                this.f18257b.lambda$openApp$500((boolean[]) this.f18258c, (TL_bots.BotInfo[]) this.f18259e, (TLRPC.User) this.f18260f, this.d, (c3) this.f18261g, (TL_bots.BotInfo) obj);
                return;
            default:
                this.f18257b.lambda$addUsersToChat$297((TLRPC.TL_messages_invitedUsers) this.f18259e, (int[]) this.f18260f, this.d, (TLRPC.Chat) this.f18261g, (Runnable) this.f18258c, (TLRPC.TL_messages_invitedUsers) obj);
                return;
        }
    }

    public jc(MessagesController messagesController, TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers, int[] iArr, int i10, TLRPC.Chat chat, Runnable runnable) {
        this.f18257b = messagesController;
        this.f18259e = tL_messages_invitedUsers;
        this.f18260f = iArr;
        this.d = i10;
        this.f18261g = chat;
        this.f18258c = runnable;
    }

    public jc(MessagesController messagesController, boolean[] zArr, TL_bots.BotInfo[] botInfoArr, TLRPC.User user, int i10, c3 c3Var) {
        this.f18257b = messagesController;
        this.f18258c = zArr;
        this.f18259e = botInfoArr;
        this.f18260f = user;
        this.d = i10;
        this.f18261g = c3Var;
    }
}

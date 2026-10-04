package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
public final class jc implements Utilities.Callback {
    public final int f18250a = 0;
    public final MessagesController f18251b;
    public final Object f18252c;
    public final int d;
    public final Object f18253e;
    public final Object f18254f;
    public final Object f18255g;

    public jc(MessagesController messagesController, nf.e eVar, org.telegram.ui.ActionBar.b2[] b2VarArr, org.telegram.ui.ActionBar.n2 n2Var, boolean[] zArr, int i10) {
        this.f18251b = messagesController;
        this.f18253e = eVar;
        this.f18254f = b2VarArr;
        this.f18255g = n2Var;
        this.f18252c = zArr;
        this.d = i10;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f18250a) {
            case 0:
                this.f18251b.lambda$openByUserName$455((nf.e) this.f18253e, (org.telegram.ui.ActionBar.b2[]) this.f18254f, (org.telegram.ui.ActionBar.n2) this.f18255g, (boolean[]) this.f18252c, this.d, (Long) obj);
                return;
            case 1:
                this.f18251b.lambda$openApp$500((boolean[]) this.f18252c, (TL_bots.BotInfo[]) this.f18253e, (TLRPC.User) this.f18254f, this.d, (c3) this.f18255g, (TL_bots.BotInfo) obj);
                return;
            default:
                this.f18251b.lambda$addUsersToChat$297((TLRPC.TL_messages_invitedUsers) this.f18253e, (int[]) this.f18254f, this.d, (TLRPC.Chat) this.f18255g, (Runnable) this.f18252c, (TLRPC.TL_messages_invitedUsers) obj);
                return;
        }
    }

    public jc(MessagesController messagesController, TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers, int[] iArr, int i10, TLRPC.Chat chat, Runnable runnable) {
        this.f18251b = messagesController;
        this.f18253e = tL_messages_invitedUsers;
        this.f18254f = iArr;
        this.d = i10;
        this.f18255g = chat;
        this.f18252c = runnable;
    }

    public jc(MessagesController messagesController, boolean[] zArr, TL_bots.BotInfo[] botInfoArr, TLRPC.User user, int i10, c3 c3Var) {
        this.f18251b = messagesController;
        this.f18252c = zArr;
        this.f18253e = botInfoArr;
        this.f18254f = user;
        this.d = i10;
        this.f18255g = c3Var;
    }
}

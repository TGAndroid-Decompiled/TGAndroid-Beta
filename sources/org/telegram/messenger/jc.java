package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
public final class jc implements Utilities.Callback {
    public final int f16733a = 0;
    public final MessagesController f16734b;
    public final Object f16735c;
    public final int d;
    public final Object e;
    public final Object f16736f;
    public final Object f16737g;

    public jc(MessagesController messagesController, nf.e eVar, org.telegram.ui.ActionBar.a2[] a2VarArr, org.telegram.ui.ActionBar.m2 m2Var, boolean[] zArr, int i10) {
        this.f16734b = messagesController;
        this.e = eVar;
        this.f16736f = a2VarArr;
        this.f16737g = m2Var;
        this.f16735c = zArr;
        this.d = i10;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f16733a) {
            case 0:
                this.f16734b.lambda$openByUserName$455((nf.e) this.e, (org.telegram.ui.ActionBar.a2[]) this.f16736f, (org.telegram.ui.ActionBar.m2) this.f16737g, (boolean[]) this.f16735c, this.d, (Long) obj);
                return;
            case 1:
                this.f16734b.lambda$openApp$500((boolean[]) this.f16735c, (TL_bots.BotInfo[]) this.e, (TLRPC.User) this.f16736f, this.d, (c3) this.f16737g, (TL_bots.BotInfo) obj);
                return;
            default:
                this.f16734b.lambda$addUsersToChat$297((TLRPC.TL_messages_invitedUsers) this.e, (int[]) this.f16736f, this.d, (TLRPC.Chat) this.f16737g, (Runnable) this.f16735c, (TLRPC.TL_messages_invitedUsers) obj);
                return;
        }
    }

    public jc(MessagesController messagesController, TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers, int[] iArr, int i10, TLRPC.Chat chat, Runnable runnable) {
        this.f16734b = messagesController;
        this.e = tL_messages_invitedUsers;
        this.f16736f = iArr;
        this.d = i10;
        this.f16737g = chat;
        this.f16735c = runnable;
    }

    public jc(MessagesController messagesController, boolean[] zArr, TL_bots.BotInfo[] botInfoArr, TLRPC.User user, int i10, c3 c3Var) {
        this.f16734b = messagesController;
        this.f16735c = zArr;
        this.e = botInfoArr;
        this.f16736f = user;
        this.d = i10;
        this.f16737g = c3Var;
    }
}

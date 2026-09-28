package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
public final class jc implements Utilities.Callback {
    public final int f16732a = 0;
    public final MessagesController f16733b;
    public final Object f16734c;
    public final int d;
    public final Object e;
    public final Object f16735f;
    public final Object f16736g;

    public jc(MessagesController messagesController, nf.e eVar, org.telegram.ui.ActionBar.a2[] a2VarArr, org.telegram.ui.ActionBar.m2 m2Var, boolean[] zArr, int i10) {
        this.f16733b = messagesController;
        this.e = eVar;
        this.f16735f = a2VarArr;
        this.f16736g = m2Var;
        this.f16734c = zArr;
        this.d = i10;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f16732a) {
            case 0:
                this.f16733b.lambda$openByUserName$455((nf.e) this.e, (org.telegram.ui.ActionBar.a2[]) this.f16735f, (org.telegram.ui.ActionBar.m2) this.f16736g, (boolean[]) this.f16734c, this.d, (Long) obj);
                return;
            case 1:
                this.f16733b.lambda$openApp$500((boolean[]) this.f16734c, (TL_bots.BotInfo[]) this.e, (TLRPC.User) this.f16735f, this.d, (c3) this.f16736g, (TL_bots.BotInfo) obj);
                return;
            default:
                this.f16733b.lambda$addUsersToChat$297((TLRPC.TL_messages_invitedUsers) this.e, (int[]) this.f16735f, this.d, (TLRPC.Chat) this.f16736g, (Runnable) this.f16734c, (TLRPC.TL_messages_invitedUsers) obj);
                return;
        }
    }

    public jc(MessagesController messagesController, TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers, int[] iArr, int i10, TLRPC.Chat chat, Runnable runnable) {
        this.f16733b = messagesController;
        this.e = tL_messages_invitedUsers;
        this.f16735f = iArr;
        this.d = i10;
        this.f16736g = chat;
        this.f16734c = runnable;
    }

    public jc(MessagesController messagesController, boolean[] zArr, TL_bots.BotInfo[] botInfoArr, TLRPC.User user, int i10, c3 c3Var) {
        this.f16733b = messagesController;
        this.f16734c = zArr;
        this.e = botInfoArr;
        this.f16735f = user;
        this.d = i10;
        this.f16736g = c3Var;
    }
}

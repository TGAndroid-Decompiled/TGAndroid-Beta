package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
public final class jc implements Utilities.Callback {
    public final int f16729a = 0;
    public final MessagesController f16730b;
    public final Object f16731c;
    public final int d;
    public final Object e;
    public final Object f16732f;
    public final Object f16733g;

    public jc(MessagesController messagesController, nf.e eVar, org.telegram.ui.ActionBar.a2[] a2VarArr, org.telegram.ui.ActionBar.m2 m2Var, boolean[] zArr, int i10) {
        this.f16730b = messagesController;
        this.e = eVar;
        this.f16732f = a2VarArr;
        this.f16733g = m2Var;
        this.f16731c = zArr;
        this.d = i10;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f16729a) {
            case 0:
                this.f16730b.lambda$openByUserName$455((nf.e) this.e, (org.telegram.ui.ActionBar.a2[]) this.f16732f, (org.telegram.ui.ActionBar.m2) this.f16733g, (boolean[]) this.f16731c, this.d, (Long) obj);
                return;
            case 1:
                this.f16730b.lambda$openApp$500((boolean[]) this.f16731c, (TL_bots.BotInfo[]) this.e, (TLRPC.User) this.f16732f, this.d, (c3) this.f16733g, (TL_bots.BotInfo) obj);
                return;
            default:
                this.f16730b.lambda$addUsersToChat$297((TLRPC.TL_messages_invitedUsers) this.e, (int[]) this.f16732f, this.d, (TLRPC.Chat) this.f16733g, (Runnable) this.f16731c, (TLRPC.TL_messages_invitedUsers) obj);
                return;
        }
    }

    public jc(MessagesController messagesController, TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers, int[] iArr, int i10, TLRPC.Chat chat, Runnable runnable) {
        this.f16730b = messagesController;
        this.e = tL_messages_invitedUsers;
        this.f16732f = iArr;
        this.d = i10;
        this.f16733g = chat;
        this.f16731c = runnable;
    }

    public jc(MessagesController messagesController, boolean[] zArr, TL_bots.BotInfo[] botInfoArr, TLRPC.User user, int i10, c3 c3Var) {
        this.f16730b = messagesController;
        this.f16731c = zArr;
        this.e = botInfoArr;
        this.f16732f = user;
        this.d = i10;
        this.f16733g = c3Var;
    }
}

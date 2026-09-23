package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
public final class jc implements Utilities.Callback {
    public final int f16469a = 0;
    public final MessagesController f16470b;
    public final Object f16471c;
    public final int d;
    public final Object e;
    public final Object f16472f;
    public final Object f16473g;

    public jc(MessagesController messagesController, nf.e eVar, org.telegram.ui.ActionBar.b2[] b2VarArr, org.telegram.ui.ActionBar.n2 n2Var, boolean[] zArr, int i10) {
        this.f16470b = messagesController;
        this.e = eVar;
        this.f16472f = b2VarArr;
        this.f16473g = n2Var;
        this.f16471c = zArr;
        this.d = i10;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f16469a) {
            case 0:
                this.f16470b.lambda$openByUserName$455((nf.e) this.e, (org.telegram.ui.ActionBar.b2[]) this.f16472f, (org.telegram.ui.ActionBar.n2) this.f16473g, (boolean[]) this.f16471c, this.d, (Long) obj);
                return;
            case 1:
                this.f16470b.lambda$openApp$500((boolean[]) this.f16471c, (TL_bots.BotInfo[]) this.e, (TLRPC.User) this.f16472f, this.d, (c3) this.f16473g, (TL_bots.BotInfo) obj);
                return;
            default:
                this.f16470b.lambda$addUsersToChat$297((TLRPC.TL_messages_invitedUsers) this.e, (int[]) this.f16472f, this.d, (TLRPC.Chat) this.f16473g, (Runnable) this.f16471c, (TLRPC.TL_messages_invitedUsers) obj);
                return;
        }
    }

    public jc(MessagesController messagesController, TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers, int[] iArr, int i10, TLRPC.Chat chat, Runnable runnable) {
        this.f16470b = messagesController;
        this.e = tL_messages_invitedUsers;
        this.f16472f = iArr;
        this.d = i10;
        this.f16473g = chat;
        this.f16471c = runnable;
    }

    public jc(MessagesController messagesController, boolean[] zArr, TL_bots.BotInfo[] botInfoArr, TLRPC.User user, int i10, c3 c3Var) {
        this.f16470b = messagesController;
        this.f16471c = zArr;
        this.e = botInfoArr;
        this.f16472f = user;
        this.d = i10;
        this.f16473g = c3Var;
    }
}

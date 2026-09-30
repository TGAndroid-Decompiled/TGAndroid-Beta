package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
public final class jc implements Utilities.Callback {
    public final int f16749a = 0;
    public final MessagesController f16750b;
    public final Object f16751c;
    public final int d;
    public final Object e;
    public final Object f16752f;
    public final Object f16753g;

    public jc(MessagesController messagesController, nf.e eVar, org.telegram.ui.ActionBar.a2[] a2VarArr, org.telegram.ui.ActionBar.m2 m2Var, boolean[] zArr, int i10) {
        this.f16750b = messagesController;
        this.e = eVar;
        this.f16752f = a2VarArr;
        this.f16753g = m2Var;
        this.f16751c = zArr;
        this.d = i10;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f16749a) {
            case 0:
                this.f16750b.lambda$openByUserName$455((nf.e) this.e, (org.telegram.ui.ActionBar.a2[]) this.f16752f, (org.telegram.ui.ActionBar.m2) this.f16753g, (boolean[]) this.f16751c, this.d, (Long) obj);
                return;
            case 1:
                this.f16750b.lambda$openApp$500((boolean[]) this.f16751c, (TL_bots.BotInfo[]) this.e, (TLRPC.User) this.f16752f, this.d, (c3) this.f16753g, (TL_bots.BotInfo) obj);
                return;
            default:
                this.f16750b.lambda$addUsersToChat$297((TLRPC.TL_messages_invitedUsers) this.e, (int[]) this.f16752f, this.d, (TLRPC.Chat) this.f16753g, (Runnable) this.f16751c, (TLRPC.TL_messages_invitedUsers) obj);
                return;
        }
    }

    public jc(MessagesController messagesController, TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers, int[] iArr, int i10, TLRPC.Chat chat, Runnable runnable) {
        this.f16750b = messagesController;
        this.e = tL_messages_invitedUsers;
        this.f16752f = iArr;
        this.d = i10;
        this.f16753g = chat;
        this.f16751c = runnable;
    }

    public jc(MessagesController messagesController, boolean[] zArr, TL_bots.BotInfo[] botInfoArr, TLRPC.User user, int i10, c3 c3Var) {
        this.f16750b = messagesController;
        this.f16751c = zArr;
        this.e = botInfoArr;
        this.f16752f = user;
        this.d = i10;
        this.f16753g = c3Var;
    }
}

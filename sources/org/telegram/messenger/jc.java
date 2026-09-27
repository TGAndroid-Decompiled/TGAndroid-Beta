package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
public final class jc implements Utilities.Callback {
    public final int f16726a = 0;
    public final MessagesController f16727b;
    public final Object f16728c;
    public final int d;
    public final Object e;
    public final Object f16729f;
    public final Object f16730g;

    public jc(MessagesController messagesController, nf.e eVar, org.telegram.ui.ActionBar.c2[] c2VarArr, org.telegram.ui.ActionBar.o2 o2Var, boolean[] zArr, int i10) {
        this.f16727b = messagesController;
        this.e = eVar;
        this.f16729f = c2VarArr;
        this.f16730g = o2Var;
        this.f16728c = zArr;
        this.d = i10;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f16726a) {
            case 0:
                this.f16727b.lambda$openByUserName$455((nf.e) this.e, (org.telegram.ui.ActionBar.c2[]) this.f16729f, (org.telegram.ui.ActionBar.o2) this.f16730g, (boolean[]) this.f16728c, this.d, (Long) obj);
                return;
            case 1:
                this.f16727b.lambda$openApp$500((boolean[]) this.f16728c, (TL_bots.BotInfo[]) this.e, (TLRPC.User) this.f16729f, this.d, (c3) this.f16730g, (TL_bots.BotInfo) obj);
                return;
            default:
                this.f16727b.lambda$addUsersToChat$297((TLRPC.TL_messages_invitedUsers) this.e, (int[]) this.f16729f, this.d, (TLRPC.Chat) this.f16730g, (Runnable) this.f16728c, (TLRPC.TL_messages_invitedUsers) obj);
                return;
        }
    }

    public jc(MessagesController messagesController, TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers, int[] iArr, int i10, TLRPC.Chat chat, Runnable runnable) {
        this.f16727b = messagesController;
        this.e = tL_messages_invitedUsers;
        this.f16729f = iArr;
        this.d = i10;
        this.f16730g = chat;
        this.f16728c = runnable;
    }

    public jc(MessagesController messagesController, boolean[] zArr, TL_bots.BotInfo[] botInfoArr, TLRPC.User user, int i10, c3 c3Var) {
        this.f16727b = messagesController;
        this.f16728c = zArr;
        this.e = botInfoArr;
        this.f16729f = user;
        this.d = i10;
        this.f16730g = c3Var;
    }
}

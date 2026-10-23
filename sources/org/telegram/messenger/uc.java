package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
public final class uc implements Utilities.Callback {
    public final int f19749a = 2;
    public final MessagesController f19750b;
    public final Object f19751c;
    public final int d;
    public final Object e;
    public final Object f19752f;
    public final Object f19753g;

    public uc(MessagesController messagesController, TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers, int[] iArr, int i10, TLRPC.Chat chat, Runnable runnable) {
        this.f19750b = messagesController;
        this.e = tL_messages_invitedUsers;
        this.f19752f = iArr;
        this.d = i10;
        this.f19753g = chat;
        this.f19751c = runnable;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f19749a) {
            case 0:
                this.f19750b.lambda$openByUserName$458((pf.c) this.e, (org.telegram.ui.ActionBar.c2[]) this.f19752f, (org.telegram.ui.ActionBar.o2) this.f19753g, (boolean[]) this.f19751c, this.d, (Long) obj);
                return;
            case 1:
                this.f19750b.lambda$openApp$503((boolean[]) this.f19751c, (TL_bots.BotInfo[]) this.e, (TLRPC.User) this.f19752f, this.d, (h3) this.f19753g, (TL_bots.BotInfo) obj);
                return;
            default:
                this.f19750b.lambda$addUsersToChat$296((TLRPC.TL_messages_invitedUsers) this.e, (int[]) this.f19752f, this.d, (TLRPC.Chat) this.f19753g, (Runnable) this.f19751c, (TLRPC.TL_messages_invitedUsers) obj);
                return;
        }
    }

    public uc(MessagesController messagesController, pf.c cVar, org.telegram.ui.ActionBar.c2[] c2VarArr, org.telegram.ui.ActionBar.o2 o2Var, boolean[] zArr, int i10) {
        this.f19750b = messagesController;
        this.e = cVar;
        this.f19752f = c2VarArr;
        this.f19753g = o2Var;
        this.f19751c = zArr;
        this.d = i10;
    }

    public uc(MessagesController messagesController, boolean[] zArr, TL_bots.BotInfo[] botInfoArr, TLRPC.User user, int i10, h3 h3Var) {
        this.f19750b = messagesController;
        this.f19751c = zArr;
        this.e = botInfoArr;
        this.f19752f = user;
        this.d = i10;
        this.f19753g = h3Var;
    }
}

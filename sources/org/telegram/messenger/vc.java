package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
public final class vc implements Utilities.Callback {
    public final int f19191a = 0;
    public final MessagesController f19192b;
    public final Object f19193c;
    public final int d;
    public final Object f19194e;
    public final Object f19195f;
    public final Object f19196g;

    public vc(MessagesController messagesController, of.e eVar, org.telegram.ui.ActionBar.a2[] a2VarArr, org.telegram.ui.ActionBar.m2 m2Var, boolean[] zArr, int i10) {
        this.f19192b = messagesController;
        this.f19194e = eVar;
        this.f19195f = a2VarArr;
        this.f19196g = m2Var;
        this.f19193c = zArr;
        this.d = i10;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f19191a) {
            case 0:
                this.f19192b.lambda$openByUserName$458((of.e) this.f19194e, (org.telegram.ui.ActionBar.a2[]) this.f19195f, (org.telegram.ui.ActionBar.m2) this.f19196g, (boolean[]) this.f19193c, this.d, (Long) obj);
                return;
            case 1:
                this.f19192b.lambda$openApp$503((boolean[]) this.f19193c, (TL_bots.BotInfo[]) this.f19194e, (TLRPC.User) this.f19195f, this.d, (g3) this.f19196g, (TL_bots.BotInfo) obj);
                return;
            default:
                this.f19192b.lambda$addUsersToChat$296((TLRPC.TL_messages_invitedUsers) this.f19194e, (int[]) this.f19195f, this.d, (TLRPC.Chat) this.f19196g, (Runnable) this.f19193c, (TLRPC.TL_messages_invitedUsers) obj);
                return;
        }
    }

    public vc(MessagesController messagesController, TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers, int[] iArr, int i10, TLRPC.Chat chat, Runnable runnable) {
        this.f19192b = messagesController;
        this.f19194e = tL_messages_invitedUsers;
        this.f19195f = iArr;
        this.d = i10;
        this.f19196g = chat;
        this.f19193c = runnable;
    }

    public vc(MessagesController messagesController, boolean[] zArr, TL_bots.BotInfo[] botInfoArr, TLRPC.User user, int i10, g3 g3Var) {
        this.f19192b = messagesController;
        this.f19193c = zArr;
        this.f19194e = botInfoArr;
        this.f19195f = user;
        this.d = i10;
        this.f19196g = g3Var;
    }
}

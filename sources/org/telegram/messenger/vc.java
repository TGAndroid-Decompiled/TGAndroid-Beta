package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
public final class vc implements Utilities.Callback {
    public final int f19192a = 0;
    public final MessagesController f19193b;
    public final Object f19194c;
    public final int d;
    public final Object f19195e;
    public final Object f19196f;
    public final Object f19197g;

    public vc(MessagesController messagesController, of.e eVar, org.telegram.ui.ActionBar.a2[] a2VarArr, org.telegram.ui.ActionBar.m2 m2Var, boolean[] zArr, int i10) {
        this.f19193b = messagesController;
        this.f19195e = eVar;
        this.f19196f = a2VarArr;
        this.f19197g = m2Var;
        this.f19194c = zArr;
        this.d = i10;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f19192a) {
            case 0:
                this.f19193b.lambda$openByUserName$458((of.e) this.f19195e, (org.telegram.ui.ActionBar.a2[]) this.f19196f, (org.telegram.ui.ActionBar.m2) this.f19197g, (boolean[]) this.f19194c, this.d, (Long) obj);
                return;
            case 1:
                this.f19193b.lambda$openApp$503((boolean[]) this.f19194c, (TL_bots.BotInfo[]) this.f19195e, (TLRPC.User) this.f19196f, this.d, (g3) this.f19197g, (TL_bots.BotInfo) obj);
                return;
            default:
                this.f19193b.lambda$addUsersToChat$296((TLRPC.TL_messages_invitedUsers) this.f19195e, (int[]) this.f19196f, this.d, (TLRPC.Chat) this.f19197g, (Runnable) this.f19194c, (TLRPC.TL_messages_invitedUsers) obj);
                return;
        }
    }

    public vc(MessagesController messagesController, TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers, int[] iArr, int i10, TLRPC.Chat chat, Runnable runnable) {
        this.f19193b = messagesController;
        this.f19195e = tL_messages_invitedUsers;
        this.f19196f = iArr;
        this.d = i10;
        this.f19197g = chat;
        this.f19194c = runnable;
    }

    public vc(MessagesController messagesController, boolean[] zArr, TL_bots.BotInfo[] botInfoArr, TLRPC.User user, int i10, g3 g3Var) {
        this.f19193b = messagesController;
        this.f19194c = zArr;
        this.f19195e = botInfoArr;
        this.f19196f = user;
        this.d = i10;
        this.f19197g = g3Var;
    }
}

package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
public final class vc implements Utilities.Callback {
    public final int f19757a = 2;
    public final MessagesController f19758b;
    public final Object f19759c;
    public final int d;
    public final Object e;
    public final Object f19760f;
    public final Object f19761g;

    public vc(MessagesController messagesController, TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers, int[] iArr, int i10, TLRPC.Chat chat, Runnable runnable) {
        this.f19758b = messagesController;
        this.e = tL_messages_invitedUsers;
        this.f19760f = iArr;
        this.d = i10;
        this.f19761g = chat;
        this.f19759c = runnable;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f19757a) {
            case 0:
                this.f19758b.lambda$openByUserName$458((pf.c) this.e, (org.telegram.ui.ActionBar.b2[]) this.f19760f, (org.telegram.ui.ActionBar.n2) this.f19761g, (boolean[]) this.f19759c, this.d, (Long) obj);
                return;
            case 1:
                this.f19758b.lambda$openApp$503((boolean[]) this.f19759c, (TL_bots.BotInfo[]) this.e, (TLRPC.User) this.f19760f, this.d, (h3) this.f19761g, (TL_bots.BotInfo) obj);
                return;
            default:
                this.f19758b.lambda$addUsersToChat$296((TLRPC.TL_messages_invitedUsers) this.e, (int[]) this.f19760f, this.d, (TLRPC.Chat) this.f19761g, (Runnable) this.f19759c, (TLRPC.TL_messages_invitedUsers) obj);
                return;
        }
    }

    public vc(MessagesController messagesController, pf.c cVar, org.telegram.ui.ActionBar.b2[] b2VarArr, org.telegram.ui.ActionBar.n2 n2Var, boolean[] zArr, int i10) {
        this.f19758b = messagesController;
        this.e = cVar;
        this.f19760f = b2VarArr;
        this.f19761g = n2Var;
        this.f19759c = zArr;
        this.d = i10;
    }

    public vc(MessagesController messagesController, boolean[] zArr, TL_bots.BotInfo[] botInfoArr, TLRPC.User user, int i10, h3 h3Var) {
        this.f19758b = messagesController;
        this.f19759c = zArr;
        this.e = botInfoArr;
        this.f19760f = user;
        this.d = i10;
        this.f19761g = h3Var;
    }
}

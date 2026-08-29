package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
public final class ad implements Utilities.Callback {
    public final int f19709a = 1;
    public final MessagesController f19710b;
    public final int f19711c;
    public final Object d;
    public final Object f19712e;
    public final TLObject f19713f;
    public final Runnable f19714g;

    public ad(MessagesController messagesController, TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers, int[] iArr, int i10, TLRPC.Chat chat, Runnable runnable) {
        this.f19710b = messagesController;
        this.d = tL_messages_invitedUsers;
        this.f19712e = iArr;
        this.f19711c = i10;
        this.f19713f = chat;
        this.f19714g = runnable;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f19709a) {
            case 0:
                this.f19710b.lambda$openApp$500((boolean[]) this.d, (TL_bots.BotInfo[]) this.f19712e, (TLRPC.User) this.f19713f, this.f19711c, (c3) this.f19714g, (TL_bots.BotInfo) obj);
                return;
            default:
                this.f19710b.lambda$addUsersToChat$297((TLRPC.TL_messages_invitedUsers) this.d, (int[]) this.f19712e, this.f19711c, (TLRPC.Chat) this.f19713f, this.f19714g, (TLRPC.TL_messages_invitedUsers) obj);
                return;
        }
    }

    public ad(MessagesController messagesController, boolean[] zArr, TL_bots.BotInfo[] botInfoArr, TLRPC.User user, int i10, c3 c3Var) {
        this.f19710b = messagesController;
        this.d = zArr;
        this.f19712e = botInfoArr;
        this.f19713f = user;
        this.f19711c = i10;
        this.f19714g = c3Var;
    }
}

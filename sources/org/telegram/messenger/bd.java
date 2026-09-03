package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
public final class bd implements Utilities.Callback {
    public final int f18268a = 1;
    public final MessagesController f18269b;
    public final int f18270c;
    public final Object d;
    public final Object f18271e;
    public final TLObject f18272f;
    public final Runnable f18273g;

    public bd(MessagesController messagesController, TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers, int[] iArr, int i10, TLRPC.Chat chat, Runnable runnable) {
        this.f18269b = messagesController;
        this.d = tL_messages_invitedUsers;
        this.f18271e = iArr;
        this.f18270c = i10;
        this.f18272f = chat;
        this.f18273g = runnable;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f18268a) {
            case 0:
                this.f18269b.lambda$openApp$500((boolean[]) this.d, (TL_bots.BotInfo[]) this.f18271e, (TLRPC.User) this.f18272f, this.f18270c, (d3) this.f18273g, (TL_bots.BotInfo) obj);
                return;
            default:
                this.f18269b.lambda$addUsersToChat$297((TLRPC.TL_messages_invitedUsers) this.d, (int[]) this.f18271e, this.f18270c, (TLRPC.Chat) this.f18272f, this.f18273g, (TLRPC.TL_messages_invitedUsers) obj);
                return;
        }
    }

    public bd(MessagesController messagesController, boolean[] zArr, TL_bots.BotInfo[] botInfoArr, TLRPC.User user, int i10, d3 d3Var) {
        this.f18269b = messagesController;
        this.d = zArr;
        this.f18271e = botInfoArr;
        this.f18272f = user;
        this.f18270c = i10;
        this.f18273g = d3Var;
    }
}

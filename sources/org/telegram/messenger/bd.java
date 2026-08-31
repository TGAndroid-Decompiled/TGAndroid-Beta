package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
public final class bd implements Utilities.Callback {
    public final int f18266a = 1;
    public final MessagesController f18267b;
    public final int f18268c;
    public final Object d;
    public final Object f18269e;
    public final TLObject f18270f;
    public final Runnable f18271g;

    public bd(MessagesController messagesController, TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers, int[] iArr, int i10, TLRPC.Chat chat, Runnable runnable) {
        this.f18267b = messagesController;
        this.d = tL_messages_invitedUsers;
        this.f18269e = iArr;
        this.f18268c = i10;
        this.f18270f = chat;
        this.f18271g = runnable;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f18266a) {
            case 0:
                this.f18267b.lambda$openApp$500((boolean[]) this.d, (TL_bots.BotInfo[]) this.f18269e, (TLRPC.User) this.f18270f, this.f18268c, (d3) this.f18271g, (TL_bots.BotInfo) obj);
                return;
            default:
                this.f18267b.lambda$addUsersToChat$297((TLRPC.TL_messages_invitedUsers) this.d, (int[]) this.f18269e, this.f18268c, (TLRPC.Chat) this.f18270f, this.f18271g, (TLRPC.TL_messages_invitedUsers) obj);
                return;
        }
    }

    public bd(MessagesController messagesController, boolean[] zArr, TL_bots.BotInfo[] botInfoArr, TLRPC.User user, int i10, d3 d3Var) {
        this.f18267b = messagesController;
        this.d = zArr;
        this.f18269e = botInfoArr;
        this.f18270f = user;
        this.f18268c = i10;
        this.f18271g = d3Var;
    }
}

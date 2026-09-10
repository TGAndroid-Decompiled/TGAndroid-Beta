package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
public final class hd implements Utilities.Callback {
    public final int f15368a = 1;
    public final MessagesController f15369b;
    public final int f15370c;
    public final Object d;
    public final Object e;
    public final TLObject f15371f;
    public final Runnable f15372g;

    public hd(MessagesController messagesController, TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers, int[] iArr, int i10, TLRPC.Chat chat, Runnable runnable) {
        this.f15369b = messagesController;
        this.d = tL_messages_invitedUsers;
        this.e = iArr;
        this.f15370c = i10;
        this.f15371f = chat;
        this.f15372g = runnable;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f15368a) {
            case 0:
                this.f15369b.lambda$openApp$500((boolean[]) this.d, (TL_bots.BotInfo[]) this.e, (TLRPC.User) this.f15371f, this.f15370c, (h3) this.f15372g, (TL_bots.BotInfo) obj);
                return;
            default:
                this.f15369b.lambda$addUsersToChat$297((TLRPC.TL_messages_invitedUsers) this.d, (int[]) this.e, this.f15370c, (TLRPC.Chat) this.f15371f, this.f15372g, (TLRPC.TL_messages_invitedUsers) obj);
                return;
        }
    }

    public hd(MessagesController messagesController, boolean[] zArr, TL_bots.BotInfo[] botInfoArr, TLRPC.User user, int i10, h3 h3Var) {
        this.f15369b = messagesController;
        this.d = zArr;
        this.e = botInfoArr;
        this.f15371f = user;
        this.f15370c = i10;
        this.f15372g = h3Var;
    }
}

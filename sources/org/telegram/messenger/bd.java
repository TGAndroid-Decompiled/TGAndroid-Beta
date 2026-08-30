package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
public final class bd implements Utilities.Callback {
    public final int f16853a = 1;
    public final MessagesController f16854b;
    public final int f16855c;
    public final Object d;
    public final Object e;
    public final TLObject f16856f;
    public final Runnable f16857g;

    public bd(MessagesController messagesController, TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers, int[] iArr, int i10, TLRPC.Chat chat, Runnable runnable) {
        this.f16854b = messagesController;
        this.d = tL_messages_invitedUsers;
        this.e = iArr;
        this.f16855c = i10;
        this.f16856f = chat;
        this.f16857g = runnable;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f16853a) {
            case 0:
                this.f16854b.lambda$openApp$500((boolean[]) this.d, (TL_bots.BotInfo[]) this.e, (TLRPC.User) this.f16856f, this.f16855c, (d3) this.f16857g, (TL_bots.BotInfo) obj);
                return;
            default:
                this.f16854b.lambda$addUsersToChat$297((TLRPC.TL_messages_invitedUsers) this.d, (int[]) this.e, this.f16855c, (TLRPC.Chat) this.f16856f, this.f16857g, (TLRPC.TL_messages_invitedUsers) obj);
                return;
        }
    }

    public bd(MessagesController messagesController, boolean[] zArr, TL_bots.BotInfo[] botInfoArr, TLRPC.User user, int i10, d3 d3Var) {
        this.f16854b = messagesController;
        this.d = zArr;
        this.e = botInfoArr;
        this.f16856f = user;
        this.f16855c = i10;
        this.f16857g = d3Var;
    }
}

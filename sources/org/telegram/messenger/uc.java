package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
public final class uc implements Utilities.Callback {
    public final int f21662a = 1;
    public final MessagesController f21663b;
    public final int f21664c;
    public final Object d;
    public final Object f21665e;
    public final TLObject f21666f;
    public final Runnable f21667g;

    public uc(MessagesController messagesController, TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers, int[] iArr, int i9, TLRPC.Chat chat, Runnable runnable) {
        this.f21663b = messagesController;
        this.d = tL_messages_invitedUsers;
        this.f21665e = iArr;
        this.f21664c = i9;
        this.f21666f = chat;
        this.f21667g = runnable;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f21662a) {
            case 0:
                this.f21663b.lambda$openApp$500((boolean[]) this.d, (TL_bots.BotInfo[]) this.f21665e, (TLRPC.User) this.f21666f, this.f21664c, (b3) this.f21667g, (TL_bots.BotInfo) obj);
                return;
            default:
                this.f21663b.lambda$addUsersToChat$297((TLRPC.TL_messages_invitedUsers) this.d, (int[]) this.f21665e, this.f21664c, (TLRPC.Chat) this.f21666f, this.f21667g, (TLRPC.TL_messages_invitedUsers) obj);
                return;
        }
    }

    public uc(MessagesController messagesController, boolean[] zArr, TL_bots.BotInfo[] botInfoArr, TLRPC.User user, int i9, b3 b3Var) {
        this.f21663b = messagesController;
        this.d = zArr;
        this.f21665e = botInfoArr;
        this.f21666f = user;
        this.f21664c = i9;
        this.f21667g = b3Var;
    }
}

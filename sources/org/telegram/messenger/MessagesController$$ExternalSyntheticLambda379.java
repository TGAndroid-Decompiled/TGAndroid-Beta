package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;

public final class MessagesController$$ExternalSyntheticLambda379 implements Utilities.Callback {
    public final int $r8$classId = 1;
    public final MessagesController f$0;
    public final Object f$1;
    public final Object f$2;
    public final TLObject f$3;
    public final int f$4;
    public final Runnable f$5;

    public MessagesController$$ExternalSyntheticLambda379(MessagesController messagesController, TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers, int[] iArr, int i, TLRPC.Chat chat, Runnable runnable) {
        this.f$0 = messagesController;
        this.f$1 = tL_messages_invitedUsers;
        this.f$2 = iArr;
        this.f$4 = i;
        this.f$3 = chat;
        this.f$5 = runnable;
    }

    @Override
    public final void run(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$openApp$500((boolean[]) this.f$1, (TL_bots.BotInfo[]) this.f$2, (TLRPC.User) this.f$3, this.f$4, (FileLoader$1$$ExternalSyntheticLambda1) this.f$5, (TL_bots.BotInfo) obj);
                break;
            default:
                MessagesController messagesController = this.f$0;
                TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers = (TLRPC.TL_messages_invitedUsers) this.f$1;
                int[] iArr = (int[]) this.f$2;
                TLRPC.Chat chat = (TLRPC.Chat) this.f$3;
                messagesController.lambda$addUsersToChat$297(tL_messages_invitedUsers, iArr, this.f$4, chat, this.f$5, (TLRPC.TL_messages_invitedUsers) obj);
                break;
        }
    }

    public MessagesController$$ExternalSyntheticLambda379(MessagesController messagesController, boolean[] zArr, TL_bots.BotInfo[] botInfoArr, TLRPC.User user, int i, FileLoader$1$$ExternalSyntheticLambda1 fileLoader$1$$ExternalSyntheticLambda1) {
        this.f$0 = messagesController;
        this.f$1 = zArr;
        this.f$2 = botInfoArr;
        this.f$3 = user;
        this.f$4 = i;
        this.f$5 = fileLoader$1$$ExternalSyntheticLambda1;
    }
}

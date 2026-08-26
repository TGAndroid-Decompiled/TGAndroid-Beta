package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

public final class MessagesController$$ExternalSyntheticLambda293 implements Runnable {
    public final int $r8$classId;
    public final MessagesController f$0;
    public final TLRPC.User f$1;

    public MessagesController$$ExternalSyntheticLambda293(MessagesController messagesController, TLRPC.User user, int i) {
        this.$r8$classId = i;
        this.f$0 = messagesController;
        this.f$1 = user;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$loadFullUser$71(this.f$1);
                break;
            default:
                this.f$0.lambda$processUpdateArray$408(this.f$1);
                break;
        }
    }
}

package org.telegram.messenger;

public final class MessagesController$$ExternalSyntheticLambda221 implements Runnable {
    public final int $r8$classId;
    public final MessagesController f$0;
    public final long f$1;
    public final Runnable f$2;

    public MessagesController$$ExternalSyntheticLambda221(long j, Runnable runnable, MessagesController messagesController) {
        this.$r8$classId = 1;
        this.f$0 = messagesController;
        this.f$2 = runnable;
        this.f$1 = j;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$setUserAdminRole$105(this.f$1, this.f$2);
                break;
            case 1:
                this.f$0.lambda$setCustomChatReactions$467(this.f$2, this.f$1);
                break;
            default:
                this.f$0.lambda$setUserAdminRole$99(this.f$1, this.f$2);
                break;
        }
    }

    public MessagesController$$ExternalSyntheticLambda221(MessagesController messagesController, long j, Runnable runnable, int i) {
        this.$r8$classId = i;
        this.f$0 = messagesController;
        this.f$1 = j;
        this.f$2 = runnable;
    }
}

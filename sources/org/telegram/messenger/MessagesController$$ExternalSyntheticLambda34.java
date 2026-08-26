package org.telegram.messenger;

public final class MessagesController$$ExternalSyntheticLambda34 implements Runnable {
    public final int $r8$classId;
    public final MessagesController f$0;
    public final int f$1;
    public final long f$2;
    public final long f$3;

    public MessagesController$$ExternalSyntheticLambda34(int i, long j, long j2, MessagesController messagesController) {
        this.$r8$classId = 2;
        this.f$0 = messagesController;
        this.f$2 = j;
        this.f$3 = j2;
        this.f$1 = i;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$sendTyping$173(this.f$1, this.f$2, this.f$3);
                break;
            case 1:
                this.f$0.lambda$sendTyping$171(this.f$1, this.f$2, this.f$3);
                break;
            default:
                this.f$0.lambda$checkDeletingTask$84(this.f$2, this.f$3, this.f$1);
                break;
        }
    }

    public MessagesController$$ExternalSyntheticLambda34(MessagesController messagesController, int i, long j, long j2, int i2) {
        this.$r8$classId = i2;
        this.f$0 = messagesController;
        this.f$1 = i;
        this.f$2 = j;
        this.f$3 = j2;
    }
}

package org.telegram.messenger;

public final class MessagesStorage$$ExternalSyntheticLambda28 implements Runnable {
    public final int $r8$classId = 0;
    public final MessagesStorage f$0;
    public final int f$1;
    public final boolean f$2;
    public final long f$3;

    public MessagesStorage$$ExternalSyntheticLambda28(MessagesStorage messagesStorage, int i, boolean z, long j) {
        this.f$0 = messagesStorage;
        this.f$1 = i;
        this.f$2 = z;
        this.f$3 = j;
    }

    @Override
    public final void run() throws Throwable {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$loadPendingTasks$31(this.f$1, this.f$2, this.f$3);
                break;
            case 1:
                this.f$0.lambda$markMessagesAsDeleted$231(this.f$3, this.f$1, this.f$2);
                break;
            default:
                this.f$0.lambda$removeFromDownloadQueue$182(this.f$2, this.f$1, this.f$3);
                break;
        }
    }

    public MessagesStorage$$ExternalSyntheticLambda28(MessagesStorage messagesStorage, long j, int i, boolean z) {
        this.f$0 = messagesStorage;
        this.f$3 = j;
        this.f$1 = i;
        this.f$2 = z;
    }

    public MessagesStorage$$ExternalSyntheticLambda28(MessagesStorage messagesStorage, boolean z, int i, long j) {
        this.f$0 = messagesStorage;
        this.f$2 = z;
        this.f$1 = i;
        this.f$3 = j;
    }
}

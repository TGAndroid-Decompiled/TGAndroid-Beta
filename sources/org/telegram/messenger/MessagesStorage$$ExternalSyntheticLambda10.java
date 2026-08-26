package org.telegram.messenger;

public final class MessagesStorage$$ExternalSyntheticLambda10 implements Runnable {
    public final int $r8$classId;
    public final MessagesStorage f$0;
    public final int f$1;
    public final long f$2;
    public final long f$3;

    public MessagesStorage$$ExternalSyntheticLambda10(int i, long j, long j2, MessagesStorage messagesStorage) {
        this.$r8$classId = 3;
        this.f$0 = messagesStorage;
        this.f$2 = j;
        this.f$1 = i;
        this.f$3 = j2;
    }

    @Override
    public final void run() throws Throwable {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$deleteAllReactionsFromChat$84(this.f$1, this.f$2, this.f$3);
                break;
            case 1:
                this.f$0.lambda$updateMessageTopicId$214(this.f$1, this.f$2, this.f$3);
                break;
            case 2:
                this.f$0.lambda$markMessagePollVotesAsRead$263(this.f$2, this.f$3, this.f$1);
                break;
            case 3:
                this.f$0.lambda$loadPendingTasks$13(this.f$2, this.f$1, this.f$3);
                break;
            case 4:
                this.f$0.lambda$markMessageReactionsAsRead$262(this.f$2, this.f$3, this.f$1);
                break;
            case 5:
                this.f$0.lambda$loadPendingTasks$32(this.f$2, this.f$3, this.f$1);
                break;
            case 6:
                this.f$0.lambda$markMentionMessageAsRead$112(this.f$1, this.f$2, this.f$3);
                break;
            default:
                this.f$0.lambda$resetMentionsCount$114(this.f$2, this.f$3, this.f$1);
                break;
        }
    }

    public MessagesStorage$$ExternalSyntheticLambda10(MessagesStorage messagesStorage, int i, long j, long j2, int i2) {
        this.$r8$classId = i2;
        this.f$0 = messagesStorage;
        this.f$1 = i;
        this.f$2 = j;
        this.f$3 = j2;
    }

    public MessagesStorage$$ExternalSyntheticLambda10(MessagesStorage messagesStorage, long j, long j2, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = messagesStorage;
        this.f$2 = j;
        this.f$3 = j2;
        this.f$1 = i;
    }
}

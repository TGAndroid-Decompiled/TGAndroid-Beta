package org.telegram.messenger;
public final class re implements Runnable {
    public final int f21405a;
    public final MessagesStorage f21406b;
    public final int f21407c;
    public final long d;
    public final long f21408e;

    public re(int i9, long j10, long j11, MessagesStorage messagesStorage) {
        this.f21405a = 4;
        this.f21406b = messagesStorage;
        this.d = j10;
        this.f21407c = i9;
        this.f21408e = j11;
    }

    @Override
    public final void run() {
        switch (this.f21405a) {
            case 0:
                long j10 = this.d;
                long j11 = this.f21408e;
                this.f21406b.lambda$deleteAllReactionsFromChat$84(this.f21407c, j10, j11);
                return;
            case 1:
                long j12 = this.d;
                long j13 = this.f21408e;
                this.f21406b.lambda$updateMessageTopicId$214(this.f21407c, j12, j13);
                return;
            case 2:
                long j14 = this.f21408e;
                int i9 = this.f21407c;
                this.f21406b.lambda$markMessagePollVotesAsRead$263(this.d, j14, i9);
                return;
            case 3:
                long j15 = this.f21408e;
                int i10 = this.f21407c;
                this.f21406b.lambda$markMessageReactionsAsRead$262(this.d, j15, i10);
                return;
            case 4:
                int i11 = this.f21407c;
                long j16 = this.f21408e;
                this.f21406b.lambda$loadPendingTasks$13(this.d, i11, j16);
                return;
            case 5:
                long j17 = this.f21408e;
                int i12 = this.f21407c;
                this.f21406b.lambda$loadPendingTasks$32(this.d, j17, i12);
                return;
            case 6:
                long j18 = this.d;
                long j19 = this.f21408e;
                this.f21406b.lambda$markMentionMessageAsRead$112(this.f21407c, j18, j19);
                return;
            default:
                long j20 = this.f21408e;
                int i13 = this.f21407c;
                this.f21406b.lambda$resetMentionsCount$114(this.d, j20, i13);
                return;
        }
    }

    public re(MessagesStorage messagesStorage, int i9, long j10, long j11, int i10) {
        this.f21405a = i10;
        this.f21406b = messagesStorage;
        this.f21407c = i9;
        this.d = j10;
        this.f21408e = j11;
    }

    public re(MessagesStorage messagesStorage, long j10, long j11, int i9, int i10) {
        this.f21405a = i10;
        this.f21406b = messagesStorage;
        this.d = j10;
        this.f21408e = j11;
        this.f21407c = i9;
    }
}

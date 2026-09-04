package org.telegram.messenger;
public final class we implements Runnable {
    public final int f19497a;
    public final MessagesStorage f19498b;
    public final int f19499c;
    public final long d;
    public final long f19500e;

    public we(int i10, long j3, long j10, MessagesStorage messagesStorage) {
        this.f19497a = 4;
        this.f19498b = messagesStorage;
        this.d = j3;
        this.f19499c = i10;
        this.f19500e = j10;
    }

    @Override
    public final void run() {
        switch (this.f19497a) {
            case 0:
                long j3 = this.d;
                long j10 = this.f19500e;
                this.f19498b.lambda$deleteAllReactionsFromChat$84(this.f19499c, j3, j10);
                return;
            case 1:
                long j11 = this.d;
                long j12 = this.f19500e;
                this.f19498b.lambda$updateMessageTopicId$214(this.f19499c, j11, j12);
                return;
            case 2:
                long j13 = this.f19500e;
                int i10 = this.f19499c;
                this.f19498b.lambda$markMessagePollVotesAsRead$263(this.d, j13, i10);
                return;
            case 3:
                long j14 = this.f19500e;
                int i11 = this.f19499c;
                this.f19498b.lambda$markMessageReactionsAsRead$262(this.d, j14, i11);
                return;
            case 4:
                int i12 = this.f19499c;
                long j15 = this.f19500e;
                this.f19498b.lambda$loadPendingTasks$13(this.d, i12, j15);
                return;
            case 5:
                long j16 = this.f19500e;
                int i13 = this.f19499c;
                this.f19498b.lambda$loadPendingTasks$32(this.d, j16, i13);
                return;
            case 6:
                long j17 = this.d;
                long j18 = this.f19500e;
                this.f19498b.lambda$markMentionMessageAsRead$112(this.f19499c, j17, j18);
                return;
            default:
                long j19 = this.f19500e;
                int i14 = this.f19499c;
                this.f19498b.lambda$resetMentionsCount$114(this.d, j19, i14);
                return;
        }
    }

    public we(MessagesStorage messagesStorage, int i10, long j3, long j10, int i11) {
        this.f19497a = i11;
        this.f19498b = messagesStorage;
        this.f19499c = i10;
        this.d = j3;
        this.f19500e = j10;
    }

    public we(MessagesStorage messagesStorage, long j3, long j10, int i10, int i11) {
        this.f19497a = i11;
        this.f19498b = messagesStorage;
        this.d = j3;
        this.f19500e = j10;
        this.f19499c = i10;
    }
}

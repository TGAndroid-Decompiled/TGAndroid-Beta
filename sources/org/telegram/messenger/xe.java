package org.telegram.messenger;
public final class xe implements Runnable {
    public final int f20147a;
    public final MessagesStorage f20148b;
    public final int f20149c;
    public final long d;
    public final long e;

    public xe(int i10, long j10, long j11, MessagesStorage messagesStorage) {
        this.f20147a = 4;
        this.f20148b = messagesStorage;
        this.d = j10;
        this.f20149c = i10;
        this.e = j11;
    }

    @Override
    public final void run() {
        switch (this.f20147a) {
            case 0:
                long j10 = this.d;
                long j11 = this.e;
                this.f20148b.lambda$deleteAllReactionsFromChat$84(this.f20149c, j10, j11);
                return;
            case 1:
                long j12 = this.d;
                long j13 = this.e;
                this.f20148b.lambda$updateMessageTopicId$214(this.f20149c, j12, j13);
                return;
            case 2:
                long j14 = this.e;
                int i10 = this.f20149c;
                this.f20148b.lambda$markMessagePollVotesAsRead$263(this.d, j14, i10);
                return;
            case 3:
                long j15 = this.e;
                int i11 = this.f20149c;
                this.f20148b.lambda$markMessageReactionsAsRead$262(this.d, j15, i11);
                return;
            case 4:
                int i12 = this.f20149c;
                long j16 = this.e;
                this.f20148b.lambda$loadPendingTasks$13(this.d, i12, j16);
                return;
            case 5:
                long j17 = this.e;
                int i13 = this.f20149c;
                this.f20148b.lambda$loadPendingTasks$32(this.d, j17, i13);
                return;
            case 6:
                long j18 = this.d;
                long j19 = this.e;
                this.f20148b.lambda$markMentionMessageAsRead$112(this.f20149c, j18, j19);
                return;
            default:
                long j20 = this.e;
                int i14 = this.f20149c;
                this.f20148b.lambda$resetMentionsCount$114(this.d, j20, i14);
                return;
        }
    }

    public xe(MessagesStorage messagesStorage, int i10, long j10, long j11, int i11) {
        this.f20147a = i11;
        this.f20148b = messagesStorage;
        this.f20149c = i10;
        this.d = j10;
        this.e = j11;
    }

    public xe(MessagesStorage messagesStorage, long j10, long j11, int i10, int i11) {
        this.f20147a = i11;
        this.f20148b = messagesStorage;
        this.d = j10;
        this.e = j11;
        this.f20149c = i10;
    }
}

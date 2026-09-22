package org.telegram.messenger;
public final class we implements Runnable {
    public final int f18019a;
    public final MessagesStorage f18020b;
    public final int f18021c;
    public final long d;
    public final long e;

    public we(int i10, long j3, long j10, MessagesStorage messagesStorage) {
        this.f18019a = 4;
        this.f18020b = messagesStorage;
        this.d = j3;
        this.f18021c = i10;
        this.e = j10;
    }

    @Override
    public final void run() {
        switch (this.f18019a) {
            case 0:
                long j3 = this.d;
                long j10 = this.e;
                this.f18020b.lambda$deleteAllReactionsFromChat$84(this.f18021c, j3, j10);
                return;
            case 1:
                long j11 = this.d;
                long j12 = this.e;
                this.f18020b.lambda$updateMessageTopicId$214(this.f18021c, j11, j12);
                return;
            case 2:
                long j13 = this.e;
                int i10 = this.f18021c;
                this.f18020b.lambda$markMessagePollVotesAsRead$263(this.d, j13, i10);
                return;
            case 3:
                long j14 = this.e;
                int i11 = this.f18021c;
                this.f18020b.lambda$markMessageReactionsAsRead$262(this.d, j14, i11);
                return;
            case 4:
                int i12 = this.f18021c;
                long j15 = this.e;
                this.f18020b.lambda$loadPendingTasks$13(this.d, i12, j15);
                return;
            case 5:
                long j16 = this.e;
                int i13 = this.f18021c;
                this.f18020b.lambda$loadPendingTasks$32(this.d, j16, i13);
                return;
            case 6:
                long j17 = this.d;
                long j18 = this.e;
                this.f18020b.lambda$markMentionMessageAsRead$112(this.f18021c, j17, j18);
                return;
            default:
                long j19 = this.e;
                int i14 = this.f18021c;
                this.f18020b.lambda$resetMentionsCount$114(this.d, j19, i14);
                return;
        }
    }

    public we(MessagesStorage messagesStorage, int i10, long j3, long j10, int i11) {
        this.f18019a = i11;
        this.f18020b = messagesStorage;
        this.f18021c = i10;
        this.d = j3;
        this.e = j10;
    }

    public we(MessagesStorage messagesStorage, long j3, long j10, int i10, int i11) {
        this.f18019a = i11;
        this.f18020b = messagesStorage;
        this.d = j3;
        this.e = j10;
        this.f18021c = i10;
    }
}

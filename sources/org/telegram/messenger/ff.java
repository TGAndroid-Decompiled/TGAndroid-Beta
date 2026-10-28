package org.telegram.messenger;
public final class ff implements Runnable {
    public final int f20094a;
    public final MessagesStorage f20095b;
    public final int f20096c;
    public final long d;
    public final long e;

    public ff(int i10, long j10, long j11, MessagesStorage messagesStorage) {
        this.f20094a = 3;
        this.f20095b = messagesStorage;
        this.d = j10;
        this.f20096c = i10;
        this.e = j11;
    }

    @Override
    public final void run() {
        switch (this.f20094a) {
            case 0:
                long j10 = this.d;
                long j11 = this.e;
                this.f20095b.lambda$deleteAllReactionsFromChat$87(this.f20096c, j10, j11);
                return;
            case 1:
                long j12 = this.d;
                long j13 = this.e;
                this.f20095b.lambda$updateMessageTopicId$218(this.f20096c, j12, j13);
                return;
            case 2:
                long j14 = this.e;
                int i10 = this.f20096c;
                this.f20095b.lambda$markMessagePollVotesAsRead$267(this.d, j14, i10);
                return;
            case 3:
                int i11 = this.f20096c;
                long j15 = this.e;
                this.f20095b.lambda$loadPendingTasks$13(this.d, i11, j15);
                return;
            case 4:
                long j16 = this.e;
                int i12 = this.f20096c;
                this.f20095b.lambda$markMessageReactionsAsRead$266(this.d, j16, i12);
                return;
            case 5:
                long j17 = this.e;
                int i13 = this.f20096c;
                this.f20095b.lambda$loadPendingTasks$32(this.d, j17, i13);
                return;
            case 6:
                long j18 = this.d;
                long j19 = this.e;
                this.f20095b.lambda$markMentionMessageAsRead$116(this.f20096c, j18, j19);
                return;
            default:
                long j20 = this.e;
                int i14 = this.f20096c;
                this.f20095b.lambda$resetMentionsCount$118(this.d, j20, i14);
                return;
        }
    }

    public ff(MessagesStorage messagesStorage, int i10, long j10, long j11, int i11) {
        this.f20094a = i11;
        this.f20095b = messagesStorage;
        this.f20096c = i10;
        this.d = j10;
        this.e = j11;
    }

    public ff(MessagesStorage messagesStorage, long j10, long j11, int i10, int i11) {
        this.f20094a = i11;
        this.f20095b = messagesStorage;
        this.d = j10;
        this.e = j11;
        this.f20096c = i10;
    }
}

package org.telegram.messenger;
public final class ve implements Runnable {
    public final int f19468a;
    public final MessagesStorage f19469b;
    public final int f19470c;
    public final long d;
    public final long f19471e;

    public ve(int i10, long j3, long j10, MessagesStorage messagesStorage) {
        this.f19468a = 4;
        this.f19469b = messagesStorage;
        this.d = j3;
        this.f19470c = i10;
        this.f19471e = j10;
    }

    @Override
    public final void run() {
        switch (this.f19468a) {
            case 0:
                long j3 = this.d;
                long j10 = this.f19471e;
                this.f19469b.lambda$deleteAllReactionsFromChat$84(this.f19470c, j3, j10);
                return;
            case 1:
                long j11 = this.d;
                long j12 = this.f19471e;
                this.f19469b.lambda$updateMessageTopicId$214(this.f19470c, j11, j12);
                return;
            case 2:
                long j13 = this.f19471e;
                int i10 = this.f19470c;
                this.f19469b.lambda$markMessagePollVotesAsRead$263(this.d, j13, i10);
                return;
            case 3:
                long j14 = this.f19471e;
                int i11 = this.f19470c;
                this.f19469b.lambda$markMessageReactionsAsRead$262(this.d, j14, i11);
                return;
            case 4:
                int i12 = this.f19470c;
                long j15 = this.f19471e;
                this.f19469b.lambda$loadPendingTasks$13(this.d, i12, j15);
                return;
            case 5:
                long j16 = this.f19471e;
                int i13 = this.f19470c;
                this.f19469b.lambda$loadPendingTasks$32(this.d, j16, i13);
                return;
            case 6:
                long j17 = this.d;
                long j18 = this.f19471e;
                this.f19469b.lambda$markMentionMessageAsRead$112(this.f19470c, j17, j18);
                return;
            default:
                long j19 = this.f19471e;
                int i14 = this.f19470c;
                this.f19469b.lambda$resetMentionsCount$114(this.d, j19, i14);
                return;
        }
    }

    public ve(MessagesStorage messagesStorage, int i10, long j3, long j10, int i11) {
        this.f19468a = i11;
        this.f19469b = messagesStorage;
        this.f19470c = i10;
        this.d = j3;
        this.f19471e = j10;
    }

    public ve(MessagesStorage messagesStorage, long j3, long j10, int i10, int i11) {
        this.f19468a = i11;
        this.f19469b = messagesStorage;
        this.d = j3;
        this.f19471e = j10;
        this.f19470c = i10;
    }
}

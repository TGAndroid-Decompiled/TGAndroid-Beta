package org.telegram.messenger;

public final class ve implements Runnable {

    public final int f21800a;

    public final MessagesStorage f21801b;

    public final int f21802c;
    public final long d;

    public final long f21803e;

    public ve(int i10, long j10, long j11, MessagesStorage messagesStorage) {
        this.f21800a = 4;
        this.f21801b = messagesStorage;
        this.d = j10;
        this.f21802c = i10;
        this.f21803e = j11;
    }

    @Override
    public final void run() throws Throwable {
        switch (this.f21800a) {
            case 0:
                long j10 = this.d;
                long j11 = this.f21803e;
                this.f21801b.lambda$deleteAllReactionsFromChat$84(this.f21802c, j10, j11);
                break;
            case 1:
                long j12 = this.d;
                long j13 = this.f21803e;
                this.f21801b.lambda$updateMessageTopicId$214(this.f21802c, j12, j13);
                break;
            case 2:
                long j14 = this.f21803e;
                int i10 = this.f21802c;
                this.f21801b.lambda$markMessagePollVotesAsRead$263(this.d, j14, i10);
                break;
            case 3:
                long j15 = this.f21803e;
                int i11 = this.f21802c;
                this.f21801b.lambda$markMessageReactionsAsRead$262(this.d, j15, i11);
                break;
            case 4:
                int i12 = this.f21802c;
                long j16 = this.f21803e;
                this.f21801b.lambda$loadPendingTasks$13(this.d, i12, j16);
                break;
            case 5:
                long j17 = this.f21803e;
                int i13 = this.f21802c;
                this.f21801b.lambda$loadPendingTasks$32(this.d, j17, i13);
                break;
            case 6:
                long j18 = this.d;
                long j19 = this.f21803e;
                this.f21801b.lambda$markMentionMessageAsRead$112(this.f21802c, j18, j19);
                break;
            default:
                long j20 = this.f21803e;
                int i14 = this.f21802c;
                this.f21801b.lambda$resetMentionsCount$114(this.d, j20, i14);
                break;
        }
    }

    public ve(MessagesStorage messagesStorage, int i10, long j10, long j11, int i11) {
        this.f21800a = i11;
        this.f21801b = messagesStorage;
        this.f21802c = i10;
        this.d = j10;
        this.f21803e = j11;
    }

    public ve(MessagesStorage messagesStorage, long j10, long j11, int i10, int i11) {
        this.f21800a = i11;
        this.f21801b = messagesStorage;
        this.d = j10;
        this.f21803e = j11;
        this.f21802c = i10;
    }
}

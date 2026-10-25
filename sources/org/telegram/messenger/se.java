package org.telegram.messenger;
public final class se implements Runnable {
    public final int f21245a = 2;
    public final MessagesStorage f21246b;
    public final boolean f21247c;
    public final int d;
    public final long e;

    public se(MessagesStorage messagesStorage, int i10, boolean z10, long j10) {
        this.f21246b = messagesStorage;
        this.d = i10;
        this.f21247c = z10;
        this.e = j10;
    }

    @Override
    public final void run() {
        switch (this.f21245a) {
            case 0:
                this.f21246b.lambda$markMessagesAsDeleted$234(this.e, this.d, this.f21247c);
                return;
            case 1:
                this.f21246b.lambda$removeFromDownloadQueue$185(this.f21247c, this.d, this.e);
                return;
            default:
                this.f21246b.lambda$loadPendingTasks$31(this.d, this.f21247c, this.e);
                return;
        }
    }

    public se(MessagesStorage messagesStorage, long j10, int i10, boolean z10) {
        this.f21246b = messagesStorage;
        this.e = j10;
        this.d = i10;
        this.f21247c = z10;
    }

    public se(MessagesStorage messagesStorage, boolean z10, int i10, long j10) {
        this.f21246b = messagesStorage;
        this.f21247c = z10;
        this.d = i10;
        this.e = j10;
    }
}

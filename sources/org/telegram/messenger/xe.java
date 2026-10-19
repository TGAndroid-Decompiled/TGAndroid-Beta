package org.telegram.messenger;
public final class xe implements Runnable {
    public final int f20081a = 2;
    public final MessagesStorage f20082b;
    public final boolean f20083c;
    public final int d;
    public final long e;

    public xe(MessagesStorage messagesStorage, int i10, boolean z10, long j10) {
        this.f20082b = messagesStorage;
        this.d = i10;
        this.f20083c = z10;
        this.e = j10;
    }

    @Override
    public final void run() {
        switch (this.f20081a) {
            case 0:
                this.f20082b.lambda$markMessagesAsDeleted$231(this.e, this.d, this.f20083c);
                return;
            case 1:
                this.f20082b.lambda$removeFromDownloadQueue$182(this.f20083c, this.d, this.e);
                return;
            default:
                this.f20082b.lambda$loadPendingTasks$31(this.d, this.f20083c, this.e);
                return;
        }
    }

    public xe(MessagesStorage messagesStorage, long j10, int i10, boolean z10) {
        this.f20082b = messagesStorage;
        this.e = j10;
        this.d = i10;
        this.f20083c = z10;
    }

    public xe(MessagesStorage messagesStorage, boolean z10, int i10, long j10) {
        this.f20082b = messagesStorage;
        this.f20083c = z10;
        this.d = i10;
        this.e = j10;
    }
}

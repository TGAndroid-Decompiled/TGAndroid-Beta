package org.telegram.messenger;
public final class ef implements Runnable {
    public final int f17129a = 2;
    public final MessagesStorage f17130b;
    public final boolean f17131c;
    public final int d;
    public final long e;

    public ef(MessagesStorage messagesStorage, int i10, boolean z4, long j10) {
        this.f17130b = messagesStorage;
        this.d = i10;
        this.f17131c = z4;
        this.e = j10;
    }

    @Override
    public final void run() {
        switch (this.f17129a) {
            case 0:
                this.f17130b.lambda$markMessagesAsDeleted$231(this.e, this.d, this.f17131c);
                return;
            case 1:
                this.f17130b.lambda$removeFromDownloadQueue$182(this.f17131c, this.d, this.e);
                return;
            default:
                this.f17130b.lambda$loadPendingTasks$31(this.d, this.f17131c, this.e);
                return;
        }
    }

    public ef(MessagesStorage messagesStorage, long j10, int i10, boolean z4) {
        this.f17130b = messagesStorage;
        this.e = j10;
        this.d = i10;
        this.f17131c = z4;
    }

    public ef(MessagesStorage messagesStorage, boolean z4, int i10, long j10) {
        this.f17130b = messagesStorage;
        this.f17131c = z4;
        this.d = i10;
        this.e = j10;
    }
}

package org.telegram.messenger;
public final class ef implements Runnable {
    public final int f17144a = 2;
    public final MessagesStorage f17145b;
    public final boolean f17146c;
    public final int d;
    public final long e;

    public ef(MessagesStorage messagesStorage, int i10, boolean z4, long j10) {
        this.f17145b = messagesStorage;
        this.d = i10;
        this.f17146c = z4;
        this.e = j10;
    }

    @Override
    public final void run() {
        switch (this.f17144a) {
            case 0:
                this.f17145b.lambda$markMessagesAsDeleted$231(this.e, this.d, this.f17146c);
                return;
            case 1:
                this.f17145b.lambda$removeFromDownloadQueue$182(this.f17146c, this.d, this.e);
                return;
            default:
                this.f17145b.lambda$loadPendingTasks$31(this.d, this.f17146c, this.e);
                return;
        }
    }

    public ef(MessagesStorage messagesStorage, long j10, int i10, boolean z4) {
        this.f17145b = messagesStorage;
        this.e = j10;
        this.d = i10;
        this.f17146c = z4;
    }

    public ef(MessagesStorage messagesStorage, boolean z4, int i10, long j10) {
        this.f17145b = messagesStorage;
        this.f17146c = z4;
        this.d = i10;
        this.e = j10;
    }
}

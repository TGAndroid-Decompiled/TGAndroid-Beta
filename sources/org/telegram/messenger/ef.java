package org.telegram.messenger;
public final class ef implements Runnable {
    public final int f18587a = 2;
    public final MessagesStorage f18588b;
    public final boolean f18589c;
    public final int d;
    public final long f18590e;

    public ef(MessagesStorage messagesStorage, int i10, boolean z4, long j10) {
        this.f18588b = messagesStorage;
        this.d = i10;
        this.f18589c = z4;
        this.f18590e = j10;
    }

    @Override
    public final void run() {
        switch (this.f18587a) {
            case 0:
                this.f18588b.lambda$markMessagesAsDeleted$231(this.f18590e, this.d, this.f18589c);
                return;
            case 1:
                this.f18588b.lambda$removeFromDownloadQueue$182(this.f18589c, this.d, this.f18590e);
                return;
            default:
                this.f18588b.lambda$loadPendingTasks$31(this.d, this.f18589c, this.f18590e);
                return;
        }
    }

    public ef(MessagesStorage messagesStorage, long j10, int i10, boolean z4) {
        this.f18588b = messagesStorage;
        this.f18590e = j10;
        this.d = i10;
        this.f18589c = z4;
    }

    public ef(MessagesStorage messagesStorage, boolean z4, int i10, long j10) {
        this.f18588b = messagesStorage;
        this.f18589c = z4;
        this.d = i10;
        this.f18590e = j10;
    }
}

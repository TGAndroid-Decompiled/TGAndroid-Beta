package org.telegram.messenger;
public final class ve implements Runnable {
    public final int f21517a = 2;
    public final MessagesStorage f21518b;
    public final boolean f21519c;
    public final int d;
    public final long e;

    public ve(MessagesStorage messagesStorage, int i10, boolean z10, long j10) {
        this.f21518b = messagesStorage;
        this.d = i10;
        this.f21519c = z10;
        this.e = j10;
    }

    @Override
    public final void run() {
        switch (this.f21517a) {
            case 0:
                this.f21518b.lambda$markMessagesAsDeleted$235(this.e, this.d, this.f21519c);
                return;
            case 1:
                this.f21518b.lambda$removeFromDownloadQueue$186(this.f21519c, this.d, this.e);
                return;
            default:
                this.f21518b.lambda$loadPendingTasks$31(this.d, this.f21519c, this.e);
                return;
        }
    }

    public ve(MessagesStorage messagesStorage, long j10, int i10, boolean z10) {
        this.f21518b = messagesStorage;
        this.e = j10;
        this.d = i10;
        this.f21519c = z10;
    }

    public ve(MessagesStorage messagesStorage, boolean z10, int i10, long j10) {
        this.f21518b = messagesStorage;
        this.f21519c = z10;
        this.d = i10;
        this.e = j10;
    }
}

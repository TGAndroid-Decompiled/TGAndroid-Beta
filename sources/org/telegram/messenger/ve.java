package org.telegram.messenger;
public final class ve implements Runnable {
    public final int f21766a = 2;
    public final MessagesStorage f21767b;
    public final boolean f21768c;
    public final int d;
    public final long f21769e;

    public ve(MessagesStorage messagesStorage, int i9, boolean z10, long j10) {
        this.f21767b = messagesStorage;
        this.d = i9;
        this.f21768c = z10;
        this.f21769e = j10;
    }

    @Override
    public final void run() {
        switch (this.f21766a) {
            case 0:
                this.f21767b.lambda$markMessagesAsDeleted$231(this.f21769e, this.d, this.f21768c);
                return;
            case 1:
                this.f21767b.lambda$removeFromDownloadQueue$182(this.f21768c, this.d, this.f21769e);
                return;
            default:
                this.f21767b.lambda$loadPendingTasks$31(this.d, this.f21768c, this.f21769e);
                return;
        }
    }

    public ve(MessagesStorage messagesStorage, long j10, int i9, boolean z10) {
        this.f21767b = messagesStorage;
        this.f21769e = j10;
        this.d = i9;
        this.f21768c = z10;
    }

    public ve(MessagesStorage messagesStorage, boolean z10, int i9, long j10) {
        this.f21767b = messagesStorage;
        this.f21768c = z10;
        this.d = i9;
        this.f21769e = j10;
    }
}

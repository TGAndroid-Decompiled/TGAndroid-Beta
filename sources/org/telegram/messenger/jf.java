package org.telegram.messenger;
public final class jf implements Runnable {
    public final int f15543a = 2;
    public final MessagesStorage f15544b;
    public final boolean f15545c;
    public final int d;
    public final long e;

    public jf(MessagesStorage messagesStorage, int i10, boolean z10, long j3) {
        this.f15544b = messagesStorage;
        this.d = i10;
        this.f15545c = z10;
        this.e = j3;
    }

    @Override
    public final void run() {
        switch (this.f15543a) {
            case 0:
                this.f15544b.lambda$markMessagesAsDeleted$231(this.e, this.d, this.f15545c);
                return;
            case 1:
                this.f15544b.lambda$removeFromDownloadQueue$182(this.f15545c, this.d, this.e);
                return;
            default:
                this.f15544b.lambda$loadPendingTasks$31(this.d, this.f15545c, this.e);
                return;
        }
    }

    public jf(MessagesStorage messagesStorage, long j3, int i10, boolean z10) {
        this.f15544b = messagesStorage;
        this.e = j3;
        this.d = i10;
        this.f15545c = z10;
    }

    public jf(MessagesStorage messagesStorage, boolean z10, int i10, long j3) {
        this.f15544b = messagesStorage;
        this.f15545c = z10;
        this.d = i10;
        this.e = j3;
    }
}

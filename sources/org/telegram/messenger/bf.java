package org.telegram.messenger;
public final class bf implements Runnable {
    public final int f17971a = 2;
    public final MessagesStorage f17972b;
    public final boolean f17973c;
    public final int d;
    public final long e;

    public bf(MessagesStorage messagesStorage, int i10, boolean z10, long j10) {
        this.f17972b = messagesStorage;
        this.d = i10;
        this.f17973c = z10;
        this.e = j10;
    }

    @Override
    public final void run() {
        switch (this.f17971a) {
            case 0:
                MessagesStorage.Z2(this.f17972b, this.d, this.f17973c, this.e);
                return;
            case 1:
                MessagesStorage.f4(this.f17972b, this.d, this.f17973c, this.e);
                return;
            default:
                MessagesStorage.V2(this.f17972b, this.d, this.f17973c, this.e);
                return;
        }
    }

    public bf(MessagesStorage messagesStorage, long j10, int i10, boolean z10) {
        this.f17972b = messagesStorage;
        this.e = j10;
        this.d = i10;
        this.f17973c = z10;
    }

    public bf(MessagesStorage messagesStorage, boolean z10, int i10, long j10) {
        this.f17972b = messagesStorage;
        this.f17973c = z10;
        this.d = i10;
        this.e = j10;
    }
}

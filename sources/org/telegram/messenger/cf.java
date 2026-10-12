package org.telegram.messenger;
public final class cf implements Runnable {
    public final int f17007a = 2;
    public final MessagesStorage f17008b;
    public final boolean f17009c;
    public final int d;
    public final long e;

    public cf(MessagesStorage messagesStorage, int i10, boolean z10, long j10) {
        this.f17008b = messagesStorage;
        this.d = i10;
        this.f17009c = z10;
        this.e = j10;
    }

    @Override
    public final void run() {
        switch (this.f17007a) {
            case 0:
                MessagesStorage.Z2(this.f17008b, this.d, this.f17009c, this.e);
                return;
            case 1:
                MessagesStorage.f4(this.f17008b, this.d, this.f17009c, this.e);
                return;
            default:
                MessagesStorage.V2(this.f17008b, this.d, this.f17009c, this.e);
                return;
        }
    }

    public cf(MessagesStorage messagesStorage, long j10, int i10, boolean z10) {
        this.f17008b = messagesStorage;
        this.e = j10;
        this.d = i10;
        this.f17009c = z10;
    }

    public cf(MessagesStorage messagesStorage, boolean z10, int i10, long j10) {
        this.f17008b = messagesStorage;
        this.f17009c = z10;
        this.d = i10;
        this.e = j10;
    }
}

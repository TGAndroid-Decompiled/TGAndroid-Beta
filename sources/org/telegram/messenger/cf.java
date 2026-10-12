package org.telegram.messenger;
public final class cf implements Runnable {
    public final int f17322a = 2;
    public final MessagesStorage f17323b;
    public final boolean f17324c;
    public final int d;
    public final long f17325e;

    public cf(MessagesStorage messagesStorage, int i10, boolean z10, long j3) {
        this.f17323b = messagesStorage;
        this.d = i10;
        this.f17324c = z10;
        this.f17325e = j3;
    }

    @Override
    public final void run() {
        switch (this.f17322a) {
            case 0:
                MessagesStorage.Z2(this.f17323b, this.d, this.f17324c, this.f17325e);
                return;
            case 1:
                MessagesStorage.f4(this.f17323b, this.d, this.f17324c, this.f17325e);
                return;
            default:
                MessagesStorage.V2(this.f17323b, this.d, this.f17324c, this.f17325e);
                return;
        }
    }

    public cf(MessagesStorage messagesStorage, long j3, int i10, boolean z10) {
        this.f17323b = messagesStorage;
        this.f17325e = j3;
        this.d = i10;
        this.f17324c = z10;
    }

    public cf(MessagesStorage messagesStorage, boolean z10, int i10, long j3) {
        this.f17323b = messagesStorage;
        this.f17324c = z10;
        this.d = i10;
        this.f17325e = j3;
    }
}

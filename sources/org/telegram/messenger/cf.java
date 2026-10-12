package org.telegram.messenger;
public final class cf implements Runnable {
    public final int f17323a = 2;
    public final MessagesStorage f17324b;
    public final boolean f17325c;
    public final int d;
    public final long f17326e;

    public cf(MessagesStorage messagesStorage, int i10, boolean z10, long j3) {
        this.f17324b = messagesStorage;
        this.d = i10;
        this.f17325c = z10;
        this.f17326e = j3;
    }

    @Override
    public final void run() {
        switch (this.f17323a) {
            case 0:
                MessagesStorage.Z2(this.f17324b, this.d, this.f17325c, this.f17326e);
                return;
            case 1:
                MessagesStorage.f4(this.f17324b, this.d, this.f17325c, this.f17326e);
                return;
            default:
                MessagesStorage.V2(this.f17324b, this.d, this.f17325c, this.f17326e);
                return;
        }
    }

    public cf(MessagesStorage messagesStorage, long j3, int i10, boolean z10) {
        this.f17324b = messagesStorage;
        this.f17326e = j3;
        this.d = i10;
        this.f17325c = z10;
    }

    public cf(MessagesStorage messagesStorage, boolean z10, int i10, long j3) {
        this.f17324b = messagesStorage;
        this.f17325c = z10;
        this.d = i10;
        this.f17326e = j3;
    }
}

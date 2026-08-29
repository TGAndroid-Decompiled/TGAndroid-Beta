package org.telegram.messenger;
public final class cf implements Runnable {
    public final int f19953a = 2;
    public final MessagesStorage f19954b;
    public final boolean f19955c;
    public final int d;
    public final long f19956e;

    public cf(MessagesStorage messagesStorage, int i10, boolean z10, long j10) {
        this.f19954b = messagesStorage;
        this.d = i10;
        this.f19955c = z10;
        this.f19956e = j10;
    }

    @Override
    public final void run() {
        switch (this.f19953a) {
            case 0:
                MessagesStorage.Z2(this.f19954b, this.d, this.f19955c, this.f19956e);
                return;
            case 1:
                MessagesStorage.f4(this.f19954b, this.d, this.f19955c, this.f19956e);
                return;
            default:
                MessagesStorage.V2(this.f19954b, this.d, this.f19955c, this.f19956e);
                return;
        }
    }

    public cf(MessagesStorage messagesStorage, long j10, int i10, boolean z10) {
        this.f19954b = messagesStorage;
        this.f19956e = j10;
        this.d = i10;
        this.f19955c = z10;
    }

    public cf(MessagesStorage messagesStorage, boolean z10, int i10, long j10) {
        this.f19954b = messagesStorage;
        this.f19955c = z10;
        this.d = i10;
        this.f19956e = j10;
    }
}

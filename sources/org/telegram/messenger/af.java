package org.telegram.messenger;
public final class af implements Runnable {
    public final int f17165a = 2;
    public final MessagesStorage f17166b;
    public final boolean f17167c;
    public final int d;
    public final long f17168e;

    public af(MessagesStorage messagesStorage, int i10, boolean z10, long j3) {
        this.f17166b = messagesStorage;
        this.d = i10;
        this.f17167c = z10;
        this.f17168e = j3;
    }

    @Override
    public final void run() {
        switch (this.f17165a) {
            case 0:
                MessagesStorage.Z2(this.f17166b, this.d, this.f17167c, this.f17168e);
                return;
            case 1:
                MessagesStorage.f4(this.f17166b, this.d, this.f17167c, this.f17168e);
                return;
            default:
                MessagesStorage.V2(this.f17166b, this.d, this.f17167c, this.f17168e);
                return;
        }
    }

    public af(MessagesStorage messagesStorage, long j3, int i10, boolean z10) {
        this.f17166b = messagesStorage;
        this.f17168e = j3;
        this.d = i10;
        this.f17167c = z10;
    }

    public af(MessagesStorage messagesStorage, boolean z10, int i10, long j3) {
        this.f17166b = messagesStorage;
        this.f17167c = z10;
        this.d = i10;
        this.f17168e = j3;
    }
}

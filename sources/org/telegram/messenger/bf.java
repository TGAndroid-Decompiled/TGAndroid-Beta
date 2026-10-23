package org.telegram.messenger;
public final class bf implements Runnable {
    public final int f18035a = 2;
    public final MessagesStorage f18036b;
    public final boolean f18037c;
    public final int d;
    public final long e;

    public bf(MessagesStorage messagesStorage, int i10, boolean z10, long j10) {
        this.f18036b = messagesStorage;
        this.d = i10;
        this.f18037c = z10;
        this.e = j10;
    }

    @Override
    public final void run() {
        switch (this.f18035a) {
            case 0:
                MessagesStorage.Z2(this.f18036b, this.d, this.f18037c, this.e);
                return;
            case 1:
                MessagesStorage.f4(this.f18036b, this.d, this.f18037c, this.e);
                return;
            default:
                MessagesStorage.V2(this.f18036b, this.d, this.f18037c, this.e);
                return;
        }
    }

    public bf(MessagesStorage messagesStorage, long j10, int i10, boolean z10) {
        this.f18036b = messagesStorage;
        this.e = j10;
        this.d = i10;
        this.f18037c = z10;
    }

    public bf(MessagesStorage messagesStorage, boolean z10, int i10, long j10) {
        this.f18036b = messagesStorage;
        this.f18037c = z10;
        this.d = i10;
        this.e = j10;
    }
}

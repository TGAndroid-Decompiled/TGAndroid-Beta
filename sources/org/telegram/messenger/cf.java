package org.telegram.messenger;
public final class cf implements Runnable {
    public final int f16704a = 2;
    public final MessagesStorage f16705b;
    public final boolean f16706c;
    public final int d;
    public final long e;

    public cf(MessagesStorage messagesStorage, int i10, boolean z10, long j10) {
        this.f16705b = messagesStorage;
        this.d = i10;
        this.f16706c = z10;
        this.e = j10;
    }

    @Override
    public final void run() {
        switch (this.f16704a) {
            case 0:
                MessagesStorage.Z2(this.f16705b, this.d, this.f16706c, this.e);
                return;
            case 1:
                MessagesStorage.f4(this.f16705b, this.d, this.f16706c, this.e);
                return;
            default:
                MessagesStorage.V2(this.f16705b, this.d, this.f16706c, this.e);
                return;
        }
    }

    public cf(MessagesStorage messagesStorage, long j10, int i10, boolean z10) {
        this.f16705b = messagesStorage;
        this.e = j10;
        this.d = i10;
        this.f16706c = z10;
    }

    public cf(MessagesStorage messagesStorage, boolean z10, int i10, long j10) {
        this.f16705b = messagesStorage;
        this.f16706c = z10;
        this.d = i10;
        this.e = j10;
    }
}

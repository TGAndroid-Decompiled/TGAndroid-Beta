package org.telegram.messenger;
public final class af implements Runnable {
    public final int f15899a = 2;
    public final MessagesStorage f15900b;
    public final boolean f15901c;
    public final int d;
    public final long e;

    public af(MessagesStorage messagesStorage, int i10, boolean z10, long j3) {
        this.f15900b = messagesStorage;
        this.d = i10;
        this.f15901c = z10;
        this.e = j3;
    }

    @Override
    public final void run() {
        switch (this.f15899a) {
            case 0:
                MessagesStorage.Z2(this.f15900b, this.d, this.f15901c, this.e);
                return;
            case 1:
                MessagesStorage.f4(this.f15900b, this.d, this.f15901c, this.e);
                return;
            default:
                MessagesStorage.V2(this.f15900b, this.d, this.f15901c, this.e);
                return;
        }
    }

    public af(MessagesStorage messagesStorage, long j3, int i10, boolean z10) {
        this.f15900b = messagesStorage;
        this.e = j3;
        this.d = i10;
        this.f15901c = z10;
    }

    public af(MessagesStorage messagesStorage, boolean z10, int i10, long j3) {
        this.f15900b = messagesStorage;
        this.f15901c = z10;
        this.d = i10;
        this.e = j3;
    }
}

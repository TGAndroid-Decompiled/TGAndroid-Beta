package org.telegram.messenger;
public final class af implements Runnable {
    public final int f15691a = 2;
    public final MessagesStorage f15692b;
    public final boolean f15693c;
    public final int d;
    public final long e;

    public af(MessagesStorage messagesStorage, int i10, boolean z10, long j3) {
        this.f15692b = messagesStorage;
        this.d = i10;
        this.f15693c = z10;
        this.e = j3;
    }

    @Override
    public final void run() {
        switch (this.f15691a) {
            case 0:
                MessagesStorage.Z2(this.f15692b, this.d, this.f15693c, this.e);
                return;
            case 1:
                MessagesStorage.f4(this.f15692b, this.d, this.f15693c, this.e);
                return;
            default:
                MessagesStorage.V2(this.f15692b, this.d, this.f15693c, this.e);
                return;
        }
    }

    public af(MessagesStorage messagesStorage, long j3, int i10, boolean z10) {
        this.f15692b = messagesStorage;
        this.e = j3;
        this.d = i10;
        this.f15693c = z10;
    }

    public af(MessagesStorage messagesStorage, boolean z10, int i10, long j3) {
        this.f15692b = messagesStorage;
        this.f15693c = z10;
        this.d = i10;
        this.e = j3;
    }
}

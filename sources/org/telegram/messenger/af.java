package org.telegram.messenger;
public final class af implements Runnable {
    public final int f18156a;
    public final MessagesStorage f18157b;
    public final int f18158c;
    public final long d;
    public final long f18159e;

    public af(int i10, long j10, long j11, MessagesStorage messagesStorage) {
        this.f18156a = 4;
        this.f18157b = messagesStorage;
        this.d = j10;
        this.f18158c = i10;
        this.f18159e = j11;
    }

    @Override
    public final void run() {
        switch (this.f18156a) {
            case 0:
                MessagesStorage.c3(this.f18158c, this.d, this.f18159e, this.f18157b);
                return;
            case 1:
                MessagesStorage.c0(this.f18158c, this.d, this.f18159e, this.f18157b);
                return;
            case 2:
                MessagesStorage.p(this.f18158c, this.d, this.f18159e, this.f18157b);
                return;
            case 3:
                MessagesStorage.z1(this.f18158c, this.d, this.f18159e, this.f18157b);
                return;
            case 4:
                MessagesStorage.e1(this.f18158c, this.d, this.f18159e, this.f18157b);
                return;
            case 5:
                MessagesStorage.x3(this.f18158c, this.d, this.f18159e, this.f18157b);
                return;
            case 6:
                MessagesStorage.M1(this.f18158c, this.d, this.f18159e, this.f18157b);
                return;
            default:
                MessagesStorage.D0(this.f18158c, this.d, this.f18159e, this.f18157b);
                return;
        }
    }

    public af(MessagesStorage messagesStorage, int i10, long j10, long j11, int i11) {
        this.f18156a = i11;
        this.f18157b = messagesStorage;
        this.f18158c = i10;
        this.d = j10;
        this.f18159e = j11;
    }

    public af(MessagesStorage messagesStorage, long j10, long j11, int i10, int i11) {
        this.f18156a = i11;
        this.f18157b = messagesStorage;
        this.d = j10;
        this.f18159e = j11;
        this.f18158c = i10;
    }
}

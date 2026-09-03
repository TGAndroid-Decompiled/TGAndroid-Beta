package org.telegram.messenger;
public final class af implements Runnable {
    public final int f18158a;
    public final MessagesStorage f18159b;
    public final int f18160c;
    public final long d;
    public final long f18161e;

    public af(int i10, long j10, long j11, MessagesStorage messagesStorage) {
        this.f18158a = 4;
        this.f18159b = messagesStorage;
        this.d = j10;
        this.f18160c = i10;
        this.f18161e = j11;
    }

    @Override
    public final void run() {
        switch (this.f18158a) {
            case 0:
                MessagesStorage.c3(this.f18160c, this.d, this.f18161e, this.f18159b);
                return;
            case 1:
                MessagesStorage.c0(this.f18160c, this.d, this.f18161e, this.f18159b);
                return;
            case 2:
                MessagesStorage.p(this.f18160c, this.d, this.f18161e, this.f18159b);
                return;
            case 3:
                MessagesStorage.z1(this.f18160c, this.d, this.f18161e, this.f18159b);
                return;
            case 4:
                MessagesStorage.e1(this.f18160c, this.d, this.f18161e, this.f18159b);
                return;
            case 5:
                MessagesStorage.x3(this.f18160c, this.d, this.f18161e, this.f18159b);
                return;
            case 6:
                MessagesStorage.M1(this.f18160c, this.d, this.f18161e, this.f18159b);
                return;
            default:
                MessagesStorage.D0(this.f18160c, this.d, this.f18161e, this.f18159b);
                return;
        }
    }

    public af(MessagesStorage messagesStorage, int i10, long j10, long j11, int i11) {
        this.f18158a = i11;
        this.f18159b = messagesStorage;
        this.f18160c = i10;
        this.d = j10;
        this.f18161e = j11;
    }

    public af(MessagesStorage messagesStorage, long j10, long j11, int i10, int i11) {
        this.f18158a = i11;
        this.f18159b = messagesStorage;
        this.d = j10;
        this.f18161e = j11;
        this.f18160c = i10;
    }
}

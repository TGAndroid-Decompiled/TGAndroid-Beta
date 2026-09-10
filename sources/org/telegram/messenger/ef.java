package org.telegram.messenger;
public final class ef implements Runnable {
    public final int f15089a;
    public final MessagesStorage f15090b;
    public final int f15091c;
    public final long d;
    public final long e;

    public ef(int i10, long j3, long j10, MessagesStorage messagesStorage) {
        this.f15089a = 4;
        this.f15090b = messagesStorage;
        this.d = j3;
        this.f15091c = i10;
        this.e = j10;
    }

    @Override
    public final void run() {
        switch (this.f15089a) {
            case 0:
                MessagesStorage.c3(this.f15091c, this.d, this.e, this.f15090b);
                return;
            case 1:
                MessagesStorage.c0(this.f15091c, this.d, this.e, this.f15090b);
                return;
            case 2:
                MessagesStorage.p(this.f15091c, this.d, this.e, this.f15090b);
                return;
            case 3:
                MessagesStorage.z1(this.f15091c, this.d, this.e, this.f15090b);
                return;
            case 4:
                MessagesStorage.e1(this.f15091c, this.d, this.e, this.f15090b);
                return;
            case 5:
                MessagesStorage.x3(this.f15091c, this.d, this.e, this.f15090b);
                return;
            case 6:
                MessagesStorage.M1(this.f15091c, this.d, this.e, this.f15090b);
                return;
            default:
                MessagesStorage.D0(this.f15091c, this.d, this.e, this.f15090b);
                return;
        }
    }

    public ef(MessagesStorage messagesStorage, int i10, long j3, long j10, int i11) {
        this.f15089a = i11;
        this.f15090b = messagesStorage;
        this.f15091c = i10;
        this.d = j3;
        this.e = j10;
    }

    public ef(MessagesStorage messagesStorage, long j3, long j10, int i10, int i11) {
        this.f15089a = i11;
        this.f15090b = messagesStorage;
        this.d = j3;
        this.e = j10;
        this.f15091c = i10;
    }
}

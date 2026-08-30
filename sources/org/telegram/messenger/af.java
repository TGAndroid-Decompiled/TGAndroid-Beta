package org.telegram.messenger;
public final class af implements Runnable {
    public final int f16760a;
    public final MessagesStorage f16761b;
    public final int f16762c;
    public final long d;
    public final long e;

    public af(int i10, long j10, long j11, MessagesStorage messagesStorage) {
        this.f16760a = 4;
        this.f16761b = messagesStorage;
        this.d = j10;
        this.f16762c = i10;
        this.e = j11;
    }

    @Override
    public final void run() {
        switch (this.f16760a) {
            case 0:
                MessagesStorage.c3(this.f16762c, this.d, this.e, this.f16761b);
                return;
            case 1:
                MessagesStorage.c0(this.f16762c, this.d, this.e, this.f16761b);
                return;
            case 2:
                MessagesStorage.p(this.f16762c, this.d, this.e, this.f16761b);
                return;
            case 3:
                MessagesStorage.z1(this.f16762c, this.d, this.e, this.f16761b);
                return;
            case 4:
                MessagesStorage.e1(this.f16762c, this.d, this.e, this.f16761b);
                return;
            case 5:
                MessagesStorage.x3(this.f16762c, this.d, this.e, this.f16761b);
                return;
            case 6:
                MessagesStorage.M1(this.f16762c, this.d, this.e, this.f16761b);
                return;
            default:
                MessagesStorage.D0(this.f16762c, this.d, this.e, this.f16761b);
                return;
        }
    }

    public af(MessagesStorage messagesStorage, int i10, long j10, long j11, int i11) {
        this.f16760a = i11;
        this.f16761b = messagesStorage;
        this.f16762c = i10;
        this.d = j10;
        this.e = j11;
    }

    public af(MessagesStorage messagesStorage, long j10, long j11, int i10, int i11) {
        this.f16760a = i11;
        this.f16761b = messagesStorage;
        this.d = j10;
        this.e = j11;
        this.f16762c = i10;
    }
}

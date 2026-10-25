package org.telegram.messenger;
public final class af implements Runnable {
    public final int f19637a;
    public final MessagesStorage f19638b;
    public final long f19639c;
    public final long d;

    public af(int i10, long j10, long j11, MessagesStorage messagesStorage) {
        this.f19637a = i10;
        this.f19638b = messagesStorage;
        this.f19639c = j10;
        this.d = j11;
    }

    @Override
    public final void run() {
        switch (this.f19637a) {
            case 0:
                MessagesStorage.C3(this.f19638b, this.f19639c, this.d);
                return;
            case 1:
                MessagesStorage.q1(this.f19638b, this.f19639c, this.d);
                return;
            case 2:
                MessagesStorage.y2(this.f19638b, this.f19639c, this.d);
                return;
            case 3:
                MessagesStorage.e0(this.f19638b, this.f19639c, this.d);
                return;
            default:
                MessagesStorage.M1(this.f19638b, this.f19639c, this.d);
                return;
        }
    }
}

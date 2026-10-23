package org.telegram.messenger;
public final class ba implements Runnable {
    public final int f17954a;
    public final MessagesController f17955b;
    public final int f17956c;
    public final long d;
    public final long e;

    public ba(int i10, long j10, long j11, MessagesController messagesController) {
        this.f17954a = 2;
        this.f17955b = messagesController;
        this.d = j10;
        this.e = j11;
        this.f17956c = i10;
    }

    @Override
    public final void run() {
        switch (this.f17954a) {
            case 0:
                MessagesController.r4(this.f17956c, this.d, this.e, this.f17955b);
                return;
            case 1:
                MessagesController.o1(this.f17956c, this.d, this.e, this.f17955b);
                return;
            default:
                MessagesController.R1(this.f17956c, this.d, this.e, this.f17955b);
                return;
        }
    }

    public ba(MessagesController messagesController, int i10, long j10, long j11, int i11) {
        this.f17954a = i11;
        this.f17955b = messagesController;
        this.f17956c = i10;
        this.d = j10;
        this.e = j11;
    }
}

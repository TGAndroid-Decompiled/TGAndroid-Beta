package org.telegram.messenger;
public final class aa implements Runnable {
    public final int f16456a;
    public final MessagesController f16457b;
    public final int f16458c;
    public final long d;
    public final long e;

    public aa(int i10, long j10, long j11, MessagesController messagesController) {
        this.f16456a = 2;
        this.f16457b = messagesController;
        this.d = j10;
        this.e = j11;
        this.f16458c = i10;
    }

    @Override
    public final void run() {
        switch (this.f16456a) {
            case 0:
                MessagesController.r4(this.f16458c, this.d, this.e, this.f16457b);
                return;
            case 1:
                MessagesController.o1(this.f16458c, this.d, this.e, this.f16457b);
                return;
            default:
                MessagesController.R1(this.f16458c, this.d, this.e, this.f16457b);
                return;
        }
    }

    public aa(MessagesController messagesController, int i10, long j10, long j11, int i11) {
        this.f16456a = i11;
        this.f16457b = messagesController;
        this.f16458c = i10;
        this.d = j10;
        this.e = j11;
    }
}

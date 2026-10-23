package org.telegram.messenger;
public final class ba implements Runnable {
    public final int f18018a;
    public final MessagesController f18019b;
    public final int f18020c;
    public final long d;
    public final long e;

    public ba(int i10, long j10, long j11, MessagesController messagesController) {
        this.f18018a = 2;
        this.f18019b = messagesController;
        this.d = j10;
        this.e = j11;
        this.f18020c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18018a) {
            case 0:
                MessagesController.r4(this.f18020c, this.d, this.e, this.f18019b);
                return;
            case 1:
                MessagesController.o1(this.f18020c, this.d, this.e, this.f18019b);
                return;
            default:
                MessagesController.R1(this.f18020c, this.d, this.e, this.f18019b);
                return;
        }
    }

    public ba(MessagesController messagesController, int i10, long j10, long j11, int i11) {
        this.f18018a = i11;
        this.f18019b = messagesController;
        this.f18020c = i10;
        this.d = j10;
        this.e = j11;
    }
}

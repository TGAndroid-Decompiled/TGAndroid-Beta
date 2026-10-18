package org.telegram.messenger;
public final class x9 implements Runnable {
    public final int f20070a;
    public final MessagesController f20071b;
    public final int f20072c;
    public final long d;
    public final long e;

    public x9(int i10, long j10, long j11, MessagesController messagesController) {
        this.f20070a = 2;
        this.f20071b = messagesController;
        this.d = j10;
        this.e = j11;
        this.f20072c = i10;
    }

    @Override
    public final void run() {
        switch (this.f20070a) {
            case 0:
                long j10 = this.d;
                long j11 = this.e;
                this.f20071b.lambda$sendTyping$170(this.f20072c, j10, j11);
                return;
            case 1:
                long j12 = this.d;
                long j13 = this.e;
                this.f20071b.lambda$sendTyping$172(this.f20072c, j12, j13);
                return;
            default:
                long j14 = this.e;
                int i10 = this.f20072c;
                this.f20071b.lambda$checkDeletingTask$83(this.d, j14, i10);
                return;
        }
    }

    public x9(MessagesController messagesController, int i10, long j10, long j11, int i11) {
        this.f20070a = i11;
        this.f20071b = messagesController;
        this.f20072c = i10;
        this.d = j10;
        this.e = j11;
    }
}

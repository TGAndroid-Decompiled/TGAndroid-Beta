package org.telegram.messenger;
public final class rc implements Runnable {
    public final int f17213a;
    public final MessagesController f17214b;
    public final int f17215c;
    public final long d;
    public final long e;

    public rc(int i10, long j3, long j10, MessagesController messagesController) {
        this.f17213a = 2;
        this.f17214b = messagesController;
        this.d = j3;
        this.e = j10;
        this.f17215c = i10;
    }

    @Override
    public final void run() {
        switch (this.f17213a) {
            case 0:
                long j3 = this.d;
                long j10 = this.e;
                this.f17214b.lambda$sendTyping$173(this.f17215c, j3, j10);
                return;
            case 1:
                long j11 = this.d;
                long j12 = this.e;
                this.f17214b.lambda$sendTyping$171(this.f17215c, j11, j12);
                return;
            default:
                long j13 = this.e;
                int i10 = this.f17215c;
                this.f17214b.lambda$checkDeletingTask$84(this.d, j13, i10);
                return;
        }
    }

    public rc(MessagesController messagesController, int i10, long j3, long j10, int i11) {
        this.f17213a = i11;
        this.f17214b = messagesController;
        this.f17215c = i10;
        this.d = j3;
        this.e = j10;
    }
}

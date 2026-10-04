package org.telegram.messenger;
public final class rc implements Runnable {
    public final int f19072a;
    public final MessagesController f19073b;
    public final int f19074c;
    public final long d;
    public final long f19075e;

    public rc(int i10, long j3, long j10, MessagesController messagesController) {
        this.f19072a = 2;
        this.f19073b = messagesController;
        this.d = j3;
        this.f19075e = j10;
        this.f19074c = i10;
    }

    @Override
    public final void run() {
        switch (this.f19072a) {
            case 0:
                long j3 = this.d;
                long j10 = this.f19075e;
                this.f19073b.lambda$sendTyping$173(this.f19074c, j3, j10);
                return;
            case 1:
                long j11 = this.d;
                long j12 = this.f19075e;
                this.f19073b.lambda$sendTyping$171(this.f19074c, j11, j12);
                return;
            default:
                long j13 = this.f19075e;
                int i10 = this.f19074c;
                this.f19073b.lambda$checkDeletingTask$84(this.d, j13, i10);
                return;
        }
    }

    public rc(MessagesController messagesController, int i10, long j3, long j10, int i11) {
        this.f19072a = i11;
        this.f19073b = messagesController;
        this.f19074c = i10;
        this.d = j3;
        this.f19075e = j10;
    }
}

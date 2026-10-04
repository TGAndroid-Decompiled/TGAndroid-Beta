package org.telegram.messenger;
public final class rc implements Runnable {
    public final int f19071a;
    public final MessagesController f19072b;
    public final int f19073c;
    public final long d;
    public final long f19074e;

    public rc(int i10, long j3, long j10, MessagesController messagesController) {
        this.f19071a = 2;
        this.f19072b = messagesController;
        this.d = j3;
        this.f19074e = j10;
        this.f19073c = i10;
    }

    @Override
    public final void run() {
        switch (this.f19071a) {
            case 0:
                long j3 = this.d;
                long j10 = this.f19074e;
                this.f19072b.lambda$sendTyping$173(this.f19073c, j3, j10);
                return;
            case 1:
                long j11 = this.d;
                long j12 = this.f19074e;
                this.f19072b.lambda$sendTyping$171(this.f19073c, j11, j12);
                return;
            default:
                long j13 = this.f19074e;
                int i10 = this.f19073c;
                this.f19072b.lambda$checkDeletingTask$84(this.d, j13, i10);
                return;
        }
    }

    public rc(MessagesController messagesController, int i10, long j3, long j10, int i11) {
        this.f19071a = i11;
        this.f19072b = messagesController;
        this.f19073c = i10;
        this.d = j3;
        this.f19074e = j10;
    }
}

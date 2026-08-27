package org.telegram.messenger;

public final class qc implements Runnable {

    public final int f21348a;

    public final MessagesController f21349b;

    public final int f21350c;
    public final long d;

    public final long f21351e;

    public qc(int i10, long j10, long j11, MessagesController messagesController) {
        this.f21348a = 2;
        this.f21349b = messagesController;
        this.d = j10;
        this.f21351e = j11;
        this.f21350c = i10;
    }

    @Override
    public final void run() {
        switch (this.f21348a) {
            case 0:
                long j10 = this.d;
                long j11 = this.f21351e;
                this.f21349b.lambda$sendTyping$173(this.f21350c, j10, j11);
                break;
            case 1:
                long j12 = this.d;
                long j13 = this.f21351e;
                this.f21349b.lambda$sendTyping$171(this.f21350c, j12, j13);
                break;
            default:
                long j14 = this.f21351e;
                int i10 = this.f21350c;
                this.f21349b.lambda$checkDeletingTask$84(this.d, j14, i10);
                break;
        }
    }

    public qc(MessagesController messagesController, int i10, long j10, long j11, int i11) {
        this.f21348a = i11;
        this.f21349b = messagesController;
        this.f21350c = i10;
        this.d = j10;
        this.f21351e = j11;
    }
}

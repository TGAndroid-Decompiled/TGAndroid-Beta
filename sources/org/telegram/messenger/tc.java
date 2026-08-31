package org.telegram.messenger;
public final class tc implements Runnable {
    public final int f20092a;
    public final MessagesController f20093b;
    public final int f20094c;
    public final long d;
    public final long f20095e;

    public tc(int i10, long j10, long j11, MessagesController messagesController) {
        this.f20092a = 2;
        this.f20093b = messagesController;
        this.d = j10;
        this.f20095e = j11;
        this.f20094c = i10;
    }

    @Override
    public final void run() {
        switch (this.f20092a) {
            case 0:
                long j10 = this.d;
                long j11 = this.f20095e;
                this.f20093b.lambda$sendTyping$173(this.f20094c, j10, j11);
                return;
            case 1:
                long j12 = this.d;
                long j13 = this.f20095e;
                this.f20093b.lambda$sendTyping$171(this.f20094c, j12, j13);
                return;
            default:
                long j14 = this.f20095e;
                int i10 = this.f20094c;
                this.f20093b.lambda$checkDeletingTask$84(this.d, j14, i10);
                return;
        }
    }

    public tc(MessagesController messagesController, int i10, long j10, long j11, int i11) {
        this.f20092a = i11;
        this.f20093b = messagesController;
        this.f20094c = i10;
        this.d = j10;
        this.f20095e = j11;
    }
}

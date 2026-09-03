package org.telegram.messenger;
public final class tc implements Runnable {
    public final int f20094a;
    public final MessagesController f20095b;
    public final int f20096c;
    public final long d;
    public final long f20097e;

    public tc(int i10, long j10, long j11, MessagesController messagesController) {
        this.f20094a = 2;
        this.f20095b = messagesController;
        this.d = j10;
        this.f20097e = j11;
        this.f20096c = i10;
    }

    @Override
    public final void run() {
        switch (this.f20094a) {
            case 0:
                long j10 = this.d;
                long j11 = this.f20097e;
                this.f20095b.lambda$sendTyping$173(this.f20096c, j10, j11);
                return;
            case 1:
                long j12 = this.d;
                long j13 = this.f20097e;
                this.f20095b.lambda$sendTyping$171(this.f20096c, j12, j13);
                return;
            default:
                long j14 = this.f20097e;
                int i10 = this.f20096c;
                this.f20095b.lambda$checkDeletingTask$84(this.d, j14, i10);
                return;
        }
    }

    public tc(MessagesController messagesController, int i10, long j10, long j11, int i11) {
        this.f20094a = i11;
        this.f20095b = messagesController;
        this.f20096c = i10;
        this.d = j10;
        this.f20097e = j11;
    }
}

package org.telegram.messenger;
public final class sc implements Runnable {
    public final int f21537a;
    public final MessagesController f21538b;
    public final int f21539c;
    public final long d;
    public final long f21540e;

    public sc(int i10, long j10, long j11, MessagesController messagesController) {
        this.f21537a = 2;
        this.f21538b = messagesController;
        this.d = j10;
        this.f21540e = j11;
        this.f21539c = i10;
    }

    @Override
    public final void run() {
        switch (this.f21537a) {
            case 0:
                long j10 = this.d;
                long j11 = this.f21540e;
                this.f21538b.lambda$sendTyping$173(this.f21539c, j10, j11);
                return;
            case 1:
                long j12 = this.d;
                long j13 = this.f21540e;
                this.f21538b.lambda$sendTyping$171(this.f21539c, j12, j13);
                return;
            default:
                long j14 = this.f21540e;
                int i10 = this.f21539c;
                this.f21538b.lambda$checkDeletingTask$84(this.d, j14, i10);
                return;
        }
    }

    public sc(MessagesController messagesController, int i10, long j10, long j11, int i11) {
        this.f21537a = i11;
        this.f21538b = messagesController;
        this.f21539c = i10;
        this.d = j10;
        this.f21540e = j11;
    }
}

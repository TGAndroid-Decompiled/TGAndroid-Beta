package org.telegram.messenger;
public final class rc implements Runnable {
    public final int f18908a;
    public final MessagesController f18909b;
    public final int f18910c;
    public final long d;
    public final long f18911e;

    public rc(int i10, long j3, long j10, MessagesController messagesController) {
        this.f18908a = 2;
        this.f18909b = messagesController;
        this.d = j3;
        this.f18911e = j10;
        this.f18910c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18908a) {
            case 0:
                long j3 = this.d;
                long j10 = this.f18911e;
                this.f18909b.lambda$sendTyping$173(this.f18910c, j3, j10);
                return;
            case 1:
                long j11 = this.d;
                long j12 = this.f18911e;
                this.f18909b.lambda$sendTyping$171(this.f18910c, j11, j12);
                return;
            default:
                long j13 = this.f18911e;
                int i10 = this.f18910c;
                this.f18909b.lambda$checkDeletingTask$84(this.d, j13, i10);
                return;
        }
    }

    public rc(MessagesController messagesController, int i10, long j3, long j10, int i11) {
        this.f18908a = i11;
        this.f18909b = messagesController;
        this.f18910c = i10;
        this.d = j3;
        this.f18911e = j10;
    }
}

package org.telegram.messenger;
public final class tc implements Runnable {
    public final int f18491a;
    public final MessagesController f18492b;
    public final int f18493c;
    public final long d;
    public final long e;

    public tc(int i10, long j10, long j11, MessagesController messagesController) {
        this.f18491a = 2;
        this.f18492b = messagesController;
        this.d = j10;
        this.e = j11;
        this.f18493c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18491a) {
            case 0:
                long j10 = this.d;
                long j11 = this.e;
                this.f18492b.lambda$sendTyping$173(this.f18493c, j10, j11);
                return;
            case 1:
                long j12 = this.d;
                long j13 = this.e;
                this.f18492b.lambda$sendTyping$171(this.f18493c, j12, j13);
                return;
            default:
                long j14 = this.e;
                int i10 = this.f18493c;
                this.f18492b.lambda$checkDeletingTask$84(this.d, j14, i10);
                return;
        }
    }

    public tc(MessagesController messagesController, int i10, long j10, long j11, int i11) {
        this.f18491a = i11;
        this.f18492b = messagesController;
        this.f18493c = i10;
        this.d = j10;
        this.e = j11;
    }
}

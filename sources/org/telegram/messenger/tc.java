package org.telegram.messenger;
public final class tc implements Runnable {
    public final int f18475a;
    public final MessagesController f18476b;
    public final int f18477c;
    public final long d;
    public final long e;

    public tc(int i10, long j10, long j11, MessagesController messagesController) {
        this.f18475a = 2;
        this.f18476b = messagesController;
        this.d = j10;
        this.e = j11;
        this.f18477c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18475a) {
            case 0:
                long j10 = this.d;
                long j11 = this.e;
                this.f18476b.lambda$sendTyping$173(this.f18477c, j10, j11);
                return;
            case 1:
                long j12 = this.d;
                long j13 = this.e;
                this.f18476b.lambda$sendTyping$171(this.f18477c, j12, j13);
                return;
            default:
                long j14 = this.e;
                int i10 = this.f18477c;
                this.f18476b.lambda$checkDeletingTask$84(this.d, j14, i10);
                return;
        }
    }

    public tc(MessagesController messagesController, int i10, long j10, long j11, int i11) {
        this.f18475a = i11;
        this.f18476b = messagesController;
        this.f18477c = i10;
        this.d = j10;
        this.e = j11;
    }
}

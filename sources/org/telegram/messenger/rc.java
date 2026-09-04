package org.telegram.messenger;
public final class rc implements Runnable {
    public final int f18881a;
    public final MessagesController f18882b;
    public final int f18883c;
    public final long d;
    public final long f18884e;

    public rc(int i10, long j3, long j10, MessagesController messagesController) {
        this.f18881a = 2;
        this.f18882b = messagesController;
        this.d = j3;
        this.f18884e = j10;
        this.f18883c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18881a) {
            case 0:
                long j3 = this.d;
                long j10 = this.f18884e;
                this.f18882b.lambda$sendTyping$173(this.f18883c, j3, j10);
                return;
            case 1:
                long j11 = this.d;
                long j12 = this.f18884e;
                this.f18882b.lambda$sendTyping$171(this.f18883c, j11, j12);
                return;
            default:
                long j13 = this.f18884e;
                int i10 = this.f18883c;
                this.f18882b.lambda$checkDeletingTask$84(this.d, j13, i10);
                return;
        }
    }

    public rc(MessagesController messagesController, int i10, long j3, long j10, int i11) {
        this.f18881a = i11;
        this.f18882b = messagesController;
        this.f18883c = i10;
        this.d = j3;
        this.f18884e = j10;
    }
}

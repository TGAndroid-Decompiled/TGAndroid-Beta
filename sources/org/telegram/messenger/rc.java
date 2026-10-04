package org.telegram.messenger;
public final class rc implements Runnable {
    public final int f19076a;
    public final MessagesController f19077b;
    public final int f19078c;
    public final long d;
    public final long f19079e;

    public rc(int i10, long j3, long j10, MessagesController messagesController) {
        this.f19076a = 2;
        this.f19077b = messagesController;
        this.d = j3;
        this.f19079e = j10;
        this.f19078c = i10;
    }

    @Override
    public final void run() {
        switch (this.f19076a) {
            case 0:
                long j3 = this.d;
                long j10 = this.f19079e;
                this.f19077b.lambda$sendTyping$173(this.f19078c, j3, j10);
                return;
            case 1:
                long j11 = this.d;
                long j12 = this.f19079e;
                this.f19077b.lambda$sendTyping$171(this.f19078c, j11, j12);
                return;
            default:
                long j13 = this.f19079e;
                int i10 = this.f19078c;
                this.f19077b.lambda$checkDeletingTask$84(this.d, j13, i10);
                return;
        }
    }

    public rc(MessagesController messagesController, int i10, long j3, long j10, int i11) {
        this.f19076a = i11;
        this.f19077b = messagesController;
        this.f19078c = i10;
        this.d = j3;
        this.f19079e = j10;
    }
}

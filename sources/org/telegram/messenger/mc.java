package org.telegram.messenger;
public final class mc implements Runnable {
    public final int f20964a;
    public final MessagesController f20965b;
    public final int f20966c;
    public final long d;
    public final long f20967e;

    public mc(int i9, long j10, long j11, MessagesController messagesController) {
        this.f20964a = 2;
        this.f20965b = messagesController;
        this.d = j10;
        this.f20967e = j11;
        this.f20966c = i9;
    }

    @Override
    public final void run() {
        switch (this.f20964a) {
            case 0:
                long j10 = this.d;
                long j11 = this.f20967e;
                this.f20965b.lambda$sendTyping$173(this.f20966c, j10, j11);
                return;
            case 1:
                long j12 = this.d;
                long j13 = this.f20967e;
                this.f20965b.lambda$sendTyping$171(this.f20966c, j12, j13);
                return;
            default:
                long j14 = this.f20967e;
                int i9 = this.f20966c;
                this.f20965b.lambda$checkDeletingTask$84(this.d, j14, i9);
                return;
        }
    }

    public mc(MessagesController messagesController, int i9, long j10, long j11, int i10) {
        this.f20964a = i10;
        this.f20965b = messagesController;
        this.f20966c = i9;
        this.d = j10;
        this.f20967e = j11;
    }
}

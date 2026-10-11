package org.telegram.messenger;
public final class x9 implements Runnable {
    public final int f19781a;
    public final MessagesController f19782b;
    public final int f19783c;
    public final long d;
    public final long f19784e;

    public x9(int i10, long j3, long j10, MessagesController messagesController) {
        this.f19781a = 2;
        this.f19782b = messagesController;
        this.d = j3;
        this.f19784e = j10;
        this.f19783c = i10;
    }

    @Override
    public final void run() {
        switch (this.f19781a) {
            case 0:
                long j3 = this.d;
                long j10 = this.f19784e;
                this.f19782b.lambda$sendTyping$170(this.f19783c, j3, j10);
                return;
            case 1:
                long j11 = this.d;
                long j12 = this.f19784e;
                this.f19782b.lambda$sendTyping$172(this.f19783c, j11, j12);
                return;
            default:
                long j13 = this.f19784e;
                int i10 = this.f19783c;
                this.f19782b.lambda$checkDeletingTask$83(this.d, j13, i10);
                return;
        }
    }

    public x9(MessagesController messagesController, int i10, long j3, long j10, int i11) {
        this.f19781a = i11;
        this.f19782b = messagesController;
        this.f19783c = i10;
        this.d = j3;
        this.f19784e = j10;
    }
}

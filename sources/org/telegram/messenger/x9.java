package org.telegram.messenger;
public final class x9 implements Runnable {
    public final int f19784a;
    public final MessagesController f19785b;
    public final int f19786c;
    public final long d;
    public final long f19787e;

    public x9(int i10, long j3, long j10, MessagesController messagesController) {
        this.f19784a = 2;
        this.f19785b = messagesController;
        this.d = j3;
        this.f19787e = j10;
        this.f19786c = i10;
    }

    @Override
    public final void run() {
        switch (this.f19784a) {
            case 0:
                long j3 = this.d;
                long j10 = this.f19787e;
                this.f19785b.lambda$sendTyping$170(this.f19786c, j3, j10);
                return;
            case 1:
                long j11 = this.d;
                long j12 = this.f19787e;
                this.f19785b.lambda$sendTyping$172(this.f19786c, j11, j12);
                return;
            default:
                long j13 = this.f19787e;
                int i10 = this.f19786c;
                this.f19785b.lambda$checkDeletingTask$83(this.d, j13, i10);
                return;
        }
    }

    public x9(MessagesController messagesController, int i10, long j3, long j10, int i11) {
        this.f19784a = i11;
        this.f19785b = messagesController;
        this.f19786c = i10;
        this.d = j3;
        this.f19787e = j10;
    }
}

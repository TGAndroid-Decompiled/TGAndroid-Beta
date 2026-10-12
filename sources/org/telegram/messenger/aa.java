package org.telegram.messenger;
public final class aa implements Runnable {
    public final int f16762a;
    public final MessagesController f16763b;
    public final int f16764c;
    public final long d;
    public final long e;

    public aa(int i10, long j10, long j11, MessagesController messagesController) {
        this.f16762a = 2;
        this.f16763b = messagesController;
        this.d = j10;
        this.e = j11;
        this.f16764c = i10;
    }

    @Override
    public final void run() {
        switch (this.f16762a) {
            case 0:
                MessagesController.r4(this.f16764c, this.d, this.e, this.f16763b);
                return;
            case 1:
                MessagesController.o1(this.f16764c, this.d, this.e, this.f16763b);
                return;
            default:
                MessagesController.R1(this.f16764c, this.d, this.e, this.f16763b);
                return;
        }
    }

    public aa(MessagesController messagesController, int i10, long j10, long j11, int i11) {
        this.f16762a = i11;
        this.f16763b = messagesController;
        this.f16764c = i10;
        this.d = j10;
        this.e = j11;
    }
}

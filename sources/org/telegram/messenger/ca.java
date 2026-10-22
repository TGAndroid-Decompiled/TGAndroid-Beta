package org.telegram.messenger;
public final class ca implements Runnable {
    public final int f18032a;
    public final MessagesController f18033b;
    public final int f18034c;
    public final long d;
    public final long e;

    public ca(int i10, long j10, long j11, MessagesController messagesController) {
        this.f18032a = 2;
        this.f18033b = messagesController;
        this.d = j10;
        this.e = j11;
        this.f18034c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18032a) {
            case 0:
                MessagesController.r4(this.f18034c, this.d, this.e, this.f18033b);
                return;
            case 1:
                MessagesController.o1(this.f18034c, this.d, this.e, this.f18033b);
                return;
            default:
                MessagesController.R1(this.f18034c, this.d, this.e, this.f18033b);
                return;
        }
    }

    public ca(MessagesController messagesController, int i10, long j10, long j11, int i11) {
        this.f18032a = i11;
        this.f18033b = messagesController;
        this.f18034c = i10;
        this.d = j10;
        this.e = j11;
    }
}

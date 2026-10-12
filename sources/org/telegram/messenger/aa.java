package org.telegram.messenger;
public final class aa implements Runnable {
    public final int f17059a;
    public final MessagesController f17060b;
    public final int f17061c;
    public final long d;
    public final long f17062e;

    public aa(int i10, long j3, long j10, MessagesController messagesController) {
        this.f17059a = 2;
        this.f17060b = messagesController;
        this.d = j3;
        this.f17062e = j10;
        this.f17061c = i10;
    }

    @Override
    public final void run() {
        switch (this.f17059a) {
            case 0:
                MessagesController.r4(this.f17061c, this.d, this.f17062e, this.f17060b);
                return;
            case 1:
                MessagesController.o1(this.f17061c, this.d, this.f17062e, this.f17060b);
                return;
            default:
                MessagesController.R1(this.f17061c, this.d, this.f17062e, this.f17060b);
                return;
        }
    }

    public aa(MessagesController messagesController, int i10, long j3, long j10, int i11) {
        this.f17059a = i11;
        this.f17060b = messagesController;
        this.f17061c = i10;
        this.d = j3;
        this.f17062e = j10;
    }
}

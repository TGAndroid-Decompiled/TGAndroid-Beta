package org.telegram.messenger;
public final class aa implements Runnable {
    public final int f17060a;
    public final MessagesController f17061b;
    public final int f17062c;
    public final long d;
    public final long f17063e;

    public aa(int i10, long j3, long j10, MessagesController messagesController) {
        this.f17060a = 2;
        this.f17061b = messagesController;
        this.d = j3;
        this.f17063e = j10;
        this.f17062c = i10;
    }

    @Override
    public final void run() {
        switch (this.f17060a) {
            case 0:
                MessagesController.r4(this.f17062c, this.d, this.f17063e, this.f17061b);
                return;
            case 1:
                MessagesController.o1(this.f17062c, this.d, this.f17063e, this.f17061b);
                return;
            default:
                MessagesController.R1(this.f17062c, this.d, this.f17063e, this.f17061b);
                return;
        }
    }

    public aa(MessagesController messagesController, int i10, long j3, long j10, int i11) {
        this.f17060a = i11;
        this.f17061b = messagesController;
        this.f17062c = i10;
        this.d = j3;
        this.f17063e = j10;
    }
}

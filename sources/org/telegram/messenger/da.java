package org.telegram.messenger;
public final class da implements Runnable {
    public final int f19895a;
    public final MessagesController f19896b;
    public final int f19897c;
    public final long d;
    public final long e;

    public da(int i10, long j10, long j11, MessagesController messagesController) {
        this.f19895a = 2;
        this.f19896b = messagesController;
        this.d = j10;
        this.e = j11;
        this.f19897c = i10;
    }

    @Override
    public final void run() {
        switch (this.f19895a) {
            case 0:
                MessagesController.k4(this.f19897c, this.d, this.e, this.f19896b);
                return;
            case 1:
                MessagesController.n1(this.f19897c, this.d, this.e, this.f19896b);
                return;
            default:
                MessagesController.J1(this.f19897c, this.d, this.e, this.f19896b);
                return;
        }
    }

    public da(MessagesController messagesController, int i10, long j10, long j11, int i11) {
        this.f19895a = i11;
        this.f19896b = messagesController;
        this.f19897c = i10;
        this.d = j10;
        this.e = j11;
    }
}

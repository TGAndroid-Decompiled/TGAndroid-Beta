package org.telegram.messenger;
public final class ab implements Runnable {
    public final int f19720a;
    public final MessagesController f19721b;
    public final Runnable f19722c;
    public final long d;

    public ab(long j10, Runnable runnable, MessagesController messagesController) {
        this.f19720a = 1;
        this.f19721b = messagesController;
        this.f19722c = runnable;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f19720a) {
            case 0:
                MessagesController.Z4(this.d, this.f19722c, this.f19721b);
                return;
            case 1:
                MessagesController.k3(this.d, this.f19722c, this.f19721b);
                return;
            default:
                MessagesController.p4(this.d, this.f19722c, this.f19721b);
                return;
        }
    }

    public ab(MessagesController messagesController, long j10, Runnable runnable, int i9) {
        this.f19720a = i9;
        this.f19721b = messagesController;
        this.d = j10;
        this.f19722c = runnable;
    }
}

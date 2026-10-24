package org.telegram.messenger;
public final class ca implements Runnable {
    public final int f18096a;
    public final MessagesController f18097b;
    public final int f18098c;
    public final long d;
    public final long e;

    public ca(int i10, long j10, long j11, MessagesController messagesController) {
        this.f18096a = 2;
        this.f18097b = messagesController;
        this.d = j10;
        this.e = j11;
        this.f18098c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18096a) {
            case 0:
                MessagesController.r4(this.f18098c, this.d, this.e, this.f18097b);
                return;
            case 1:
                MessagesController.o1(this.f18098c, this.d, this.e, this.f18097b);
                return;
            default:
                MessagesController.R1(this.f18098c, this.d, this.e, this.f18097b);
                return;
        }
    }

    public ca(MessagesController messagesController, int i10, long j10, long j11, int i11) {
        this.f18096a = i11;
        this.f18097b = messagesController;
        this.f18098c = i10;
        this.d = j10;
        this.e = j11;
    }
}

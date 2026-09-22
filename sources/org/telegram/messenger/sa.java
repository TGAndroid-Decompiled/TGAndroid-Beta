package org.telegram.messenger;
public final class sa implements Runnable {
    public final int f17302a;
    public final Runnable f17303b;

    public sa(int i10, Runnable runnable) {
        this.f17302a = i10;
        this.f17303b = runnable;
    }

    @Override
    public final void run() {
        switch (this.f17302a) {
            case 0:
                MessagesController.lambda$unblockPeer$110(this.f17303b);
                return;
            case 1:
                this.f17303b.run();
                return;
            default:
                SendMessagesHelper.h0(this.f17303b);
                return;
        }
    }
}

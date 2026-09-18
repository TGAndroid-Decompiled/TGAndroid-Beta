package org.telegram.messenger;
public final class sa implements Runnable {
    public final int f17486a;
    public final Runnable f17487b;

    public sa(int i10, Runnable runnable) {
        this.f17486a = i10;
        this.f17487b = runnable;
    }

    @Override
    public final void run() {
        switch (this.f17486a) {
            case 0:
                MessagesController.lambda$unblockPeer$110(this.f17487b);
                return;
            case 1:
                this.f17487b.run();
                return;
            default:
                SendMessagesHelper.h0(this.f17487b);
                return;
        }
    }
}

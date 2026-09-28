package org.telegram.messenger;
public final class sa implements Runnable {
    public final int f17528a;
    public final Runnable f17529b;

    public sa(int i10, Runnable runnable) {
        this.f17528a = i10;
        this.f17529b = runnable;
    }

    @Override
    public final void run() {
        switch (this.f17528a) {
            case 0:
                MessagesController.lambda$unblockPeer$110(this.f17529b);
                return;
            case 1:
                this.f17529b.run();
                return;
            default:
                SendMessagesHelper.h0(this.f17529b);
                return;
        }
    }
}

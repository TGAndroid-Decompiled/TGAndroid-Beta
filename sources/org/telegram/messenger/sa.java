package org.telegram.messenger;
public final class sa implements Runnable {
    public final int f17314a;
    public final Runnable f17315b;

    public sa(int i10, Runnable runnable) {
        this.f17314a = i10;
        this.f17315b = runnable;
    }

    @Override
    public final void run() {
        switch (this.f17314a) {
            case 0:
                MessagesController.lambda$unblockPeer$110(this.f17315b);
                return;
            case 1:
                this.f17315b.run();
                return;
            default:
                SendMessagesHelper.h0(this.f17315b);
                return;
        }
    }
}

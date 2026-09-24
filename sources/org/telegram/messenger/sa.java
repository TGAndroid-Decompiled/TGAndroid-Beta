package org.telegram.messenger;
public final class sa implements Runnable {
    public final int f17509a;
    public final Runnable f17510b;

    public sa(int i10, Runnable runnable) {
        this.f17509a = i10;
        this.f17510b = runnable;
    }

    @Override
    public final void run() {
        switch (this.f17509a) {
            case 0:
                MessagesController.lambda$unblockPeer$110(this.f17510b);
                return;
            case 1:
                this.f17510b.run();
                return;
            default:
                SendMessagesHelper.h0(this.f17510b);
                return;
        }
    }
}

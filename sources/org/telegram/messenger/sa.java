package org.telegram.messenger;
public final class sa implements Runnable {
    public final int f17527a;
    public final Runnable f17528b;

    public sa(int i10, Runnable runnable) {
        this.f17527a = i10;
        this.f17528b = runnable;
    }

    @Override
    public final void run() {
        switch (this.f17527a) {
            case 0:
                MessagesController.lambda$unblockPeer$110(this.f17528b);
                return;
            case 1:
                this.f17528b.run();
                return;
            default:
                SendMessagesHelper.h0(this.f17528b);
                return;
        }
    }
}

package org.telegram.messenger;
public final class sa implements Runnable {
    public final int f17277a;
    public final Runnable f17278b;

    public sa(int i10, Runnable runnable) {
        this.f17277a = i10;
        this.f17278b = runnable;
    }

    @Override
    public final void run() {
        switch (this.f17277a) {
            case 0:
                MessagesController.lambda$unblockPeer$110(this.f17278b);
                return;
            case 1:
                this.f17278b.run();
                return;
            default:
                SendMessagesHelper.h0(this.f17278b);
                return;
        }
    }
}

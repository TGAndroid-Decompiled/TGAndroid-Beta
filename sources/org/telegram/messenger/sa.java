package org.telegram.messenger;
public final class sa implements Runnable {
    public final int f17518a;
    public final Runnable f17519b;

    public sa(int i10, Runnable runnable) {
        this.f17518a = i10;
        this.f17519b = runnable;
    }

    @Override
    public final void run() {
        switch (this.f17518a) {
            case 0:
                MessagesController.lambda$unblockPeer$110(this.f17519b);
                return;
            case 1:
                this.f17519b.run();
                return;
            default:
                SendMessagesHelper.h0(this.f17519b);
                return;
        }
    }
}

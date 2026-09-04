package org.telegram.messenger;
public final class sa implements Runnable {
    public final int f18972a;
    public final Runnable f18973b;

    public sa(int i10, Runnable runnable) {
        this.f18972a = i10;
        this.f18973b = runnable;
    }

    @Override
    public final void run() {
        switch (this.f18972a) {
            case 0:
                MessagesController.lambda$unblockPeer$110(this.f18973b);
                return;
            case 1:
                this.f18973b.run();
                return;
            default:
                SendMessagesHelper.h0(this.f18973b);
                return;
        }
    }
}

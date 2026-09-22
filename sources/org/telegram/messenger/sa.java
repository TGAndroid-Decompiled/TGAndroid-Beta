package org.telegram.messenger;
public final class sa implements Runnable {
    public final int f17535a;
    public final Runnable f17536b;

    public sa(int i10, Runnable runnable) {
        this.f17535a = i10;
        this.f17536b = runnable;
    }

    @Override
    public final void run() {
        switch (this.f17535a) {
            case 0:
                MessagesController.lambda$unblockPeer$110(this.f17536b);
                return;
            case 1:
                this.f17536b.run();
                return;
            default:
                SendMessagesHelper.h0(this.f17536b);
                return;
        }
    }
}

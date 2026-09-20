package org.telegram.messenger;
public final class sa implements Runnable {
    public final int f17520a;
    public final Runnable f17521b;

    public sa(int i10, Runnable runnable) {
        this.f17520a = i10;
        this.f17521b = runnable;
    }

    @Override
    public final void run() {
        switch (this.f17520a) {
            case 0:
                MessagesController.lambda$unblockPeer$110(this.f17521b);
                return;
            case 1:
                this.f17521b.run();
                return;
            default:
                SendMessagesHelper.h0(this.f17521b);
                return;
        }
    }
}

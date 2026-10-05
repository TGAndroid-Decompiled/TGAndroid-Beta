package org.telegram.messenger;
public final class sa implements Runnable {
    public final int f19151a;
    public final Runnable f19152b;

    public sa(int i10, Runnable runnable) {
        this.f19151a = i10;
        this.f19152b = runnable;
    }

    @Override
    public final void run() {
        switch (this.f19151a) {
            case 0:
                MessagesController.lambda$unblockPeer$110(this.f19152b);
                return;
            case 1:
                this.f19152b.run();
                return;
            default:
                SendMessagesHelper.h0(this.f19152b);
                return;
        }
    }
}

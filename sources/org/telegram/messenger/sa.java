package org.telegram.messenger;
public final class sa implements Runnable {
    public final int f18999a;
    public final Runnable f19000b;

    public sa(int i10, Runnable runnable) {
        this.f18999a = i10;
        this.f19000b = runnable;
    }

    @Override
    public final void run() {
        switch (this.f18999a) {
            case 0:
                MessagesController.lambda$unblockPeer$110(this.f19000b);
                return;
            case 1:
                this.f19000b.run();
                return;
            default:
                SendMessagesHelper.h0(this.f19000b);
                return;
        }
    }
}

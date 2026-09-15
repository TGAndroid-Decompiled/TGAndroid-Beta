package org.telegram.messenger;
public final class sa implements Runnable {
    public final int f17305a;
    public final Runnable f17306b;

    public sa(int i10, Runnable runnable) {
        this.f17305a = i10;
        this.f17306b = runnable;
    }

    @Override
    public final void run() {
        switch (this.f17305a) {
            case 0:
                MessagesController.lambda$unblockPeer$110(this.f17306b);
                return;
            case 1:
                this.f17306b.run();
                return;
            default:
                SendMessagesHelper.h0(this.f17306b);
                return;
        }
    }
}

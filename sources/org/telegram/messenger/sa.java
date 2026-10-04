package org.telegram.messenger;
public final class sa implements Runnable {
    public final int f19146a;
    public final Runnable f19147b;

    public sa(int i10, Runnable runnable) {
        this.f19146a = i10;
        this.f19147b = runnable;
    }

    @Override
    public final void run() {
        switch (this.f19146a) {
            case 0:
                MessagesController.lambda$unblockPeer$110(this.f19147b);
                return;
            case 1:
                this.f19147b.run();
                return;
            default:
                SendMessagesHelper.h0(this.f19147b);
                return;
        }
    }
}

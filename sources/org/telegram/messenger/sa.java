package org.telegram.messenger;
public final class sa implements Runnable {
    public final int f17544a;
    public final Runnable f17545b;

    public sa(int i10, Runnable runnable) {
        this.f17544a = i10;
        this.f17545b = runnable;
    }

    @Override
    public final void run() {
        switch (this.f17544a) {
            case 0:
                MessagesController.lambda$unblockPeer$110(this.f17545b);
                return;
            case 1:
                this.f17545b.run();
                return;
            default:
                SendMessagesHelper.h0(this.f17545b);
                return;
        }
    }
}

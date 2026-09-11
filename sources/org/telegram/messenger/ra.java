package org.telegram.messenger;
public final class ra implements Runnable {
    public final int f18893a;
    public final Runnable f18894b;

    public ra(int i10, Runnable runnable) {
        this.f18893a = i10;
        this.f18894b = runnable;
    }

    @Override
    public final void run() {
        switch (this.f18893a) {
            case 0:
                MessagesController.lambda$unblockPeer$110(this.f18894b);
                return;
            case 1:
                this.f18894b.run();
                return;
            default:
                SendMessagesHelper.h0(this.f18894b);
                return;
        }
    }
}

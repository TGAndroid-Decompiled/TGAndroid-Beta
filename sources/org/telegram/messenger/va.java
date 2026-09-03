package org.telegram.messenger;
public final class va implements Runnable {
    public final int f20271a;
    public final Runnable f20272b;

    public va(int i10, Runnable runnable) {
        this.f20271a = i10;
        this.f20272b = runnable;
    }

    @Override
    public final void run() {
        switch (this.f20271a) {
            case 0:
                MessagesController.lambda$unblockPeer$110(this.f20272b);
                return;
            case 1:
                this.f20272b.run();
                return;
            default:
                SendMessagesHelper.h0(this.f20272b);
                return;
        }
    }
}

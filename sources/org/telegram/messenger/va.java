package org.telegram.messenger;
public final class va implements Runnable {
    public final int f20269a;
    public final Runnable f20270b;

    public va(int i10, Runnable runnable) {
        this.f20269a = i10;
        this.f20270b = runnable;
    }

    @Override
    public final void run() {
        switch (this.f20269a) {
            case 0:
                MessagesController.lambda$unblockPeer$110(this.f20270b);
                return;
            case 1:
                this.f20270b.run();
                return;
            default:
                SendMessagesHelper.h0(this.f20270b);
                return;
        }
    }
}

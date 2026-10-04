package org.telegram.messenger;
public final class sa implements Runnable {
    public final int f19139a;
    public final Runnable f19140b;

    public sa(int i10, Runnable runnable) {
        this.f19139a = i10;
        this.f19140b = runnable;
    }

    @Override
    public final void run() {
        switch (this.f19139a) {
            case 0:
                MessagesController.lambda$unblockPeer$110(this.f19140b);
                return;
            case 1:
                this.f19140b.run();
                return;
            default:
                SendMessagesHelper.h0(this.f19140b);
                return;
        }
    }
}

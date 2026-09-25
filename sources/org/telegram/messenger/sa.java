package org.telegram.messenger;
public final class sa implements Runnable {
    public final int f17524a;
    public final Runnable f17525b;

    public sa(int i10, Runnable runnable) {
        this.f17524a = i10;
        this.f17525b = runnable;
    }

    @Override
    public final void run() {
        switch (this.f17524a) {
            case 0:
                MessagesController.lambda$unblockPeer$110(this.f17525b);
                return;
            case 1:
                this.f17525b.run();
                return;
            default:
                SendMessagesHelper.h0(this.f17525b);
                return;
        }
    }
}

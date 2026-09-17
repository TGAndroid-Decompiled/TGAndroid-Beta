package org.telegram.messenger;
public final class ra implements Runnable {
    public final int f18920a;
    public final Runnable f18921b;

    public ra(int i10, Runnable runnable) {
        this.f18920a = i10;
        this.f18921b = runnable;
    }

    @Override
    public final void run() {
        switch (this.f18920a) {
            case 0:
                MessagesController.lambda$unblockPeer$110(this.f18921b);
                return;
            case 1:
                this.f18921b.run();
                return;
            default:
                SendMessagesHelper.h0(this.f18921b);
                return;
        }
    }
}

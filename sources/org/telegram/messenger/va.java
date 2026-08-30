package org.telegram.messenger;
public final class va implements Runnable {
    public final int f18652a;
    public final Runnable f18653b;

    public va(int i10, Runnable runnable) {
        this.f18652a = i10;
        this.f18653b = runnable;
    }

    @Override
    public final void run() {
        switch (this.f18652a) {
            case 0:
                MessagesController.lambda$unblockPeer$110(this.f18653b);
                return;
            case 1:
                this.f18653b.run();
                return;
            default:
                SendMessagesHelper.h0(this.f18653b);
                return;
        }
    }
}

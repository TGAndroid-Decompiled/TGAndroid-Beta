package org.telegram.messenger;
public final class va implements Runnable {
    public final int f18634a;
    public final Runnable f18635b;

    public va(int i10, Runnable runnable) {
        this.f18634a = i10;
        this.f18635b = runnable;
    }

    @Override
    public final void run() {
        switch (this.f18634a) {
            case 0:
                MessagesController.lambda$unblockPeer$110(this.f18635b);
                return;
            case 1:
                this.f18635b.run();
                return;
            default:
                SendMessagesHelper.h0(this.f18635b);
                return;
        }
    }
}

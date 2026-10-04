package org.telegram.messenger;
public final class sa implements Runnable {
    public final int f19140a;
    public final Runnable f19141b;

    public sa(int i10, Runnable runnable) {
        this.f19140a = i10;
        this.f19141b = runnable;
    }

    @Override
    public final void run() {
        switch (this.f19140a) {
            case 0:
                MessagesController.lambda$unblockPeer$110(this.f19141b);
                return;
            case 1:
                this.f19141b.run();
                return;
            default:
                SendMessagesHelper.lambda$prepareSendingPoll$134(this.f19141b);
                return;
        }
    }
}

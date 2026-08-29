package org.telegram.messenger;
public final class ua implements Runnable {
    public final int f21717a;
    public final Runnable f21718b;

    public ua(int i10, Runnable runnable) {
        this.f21717a = i10;
        this.f21718b = runnable;
    }

    @Override
    public final void run() {
        switch (this.f21717a) {
            case 0:
                MessagesController.lambda$unblockPeer$110(this.f21718b);
                return;
            case 1:
                this.f21718b.run();
                return;
            default:
                SendMessagesHelper.lambda$prepareSendingPoll$134(this.f21718b);
                return;
        }
    }
}

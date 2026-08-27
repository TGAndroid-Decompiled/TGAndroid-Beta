package org.telegram.messenger;

public final class sa implements Runnable {

    public final int f21521a;

    public final Runnable f21522b;

    public sa(int i10, Runnable runnable) {
        this.f21521a = i10;
        this.f21522b = runnable;
    }

    @Override
    public final void run() {
        switch (this.f21521a) {
            case 0:
                MessagesController.lambda$unblockPeer$110(this.f21522b);
                break;
            case 1:
                this.f21522b.run();
                break;
            default:
                SendMessagesHelper.lambda$prepareSendingPoll$134(this.f21522b);
                break;
        }
    }
}

package org.telegram.messenger;
public final class oa implements Runnable {
    public final int f21124a;
    public final Runnable f21125b;

    public oa(int i9, Runnable runnable) {
        this.f21124a = i9;
        this.f21125b = runnable;
    }

    @Override
    public final void run() {
        switch (this.f21124a) {
            case 0:
                MessagesController.lambda$unblockPeer$110(this.f21125b);
                return;
            case 1:
                this.f21125b.run();
                return;
            default:
                SendMessagesHelper.lambda$prepareSendingPoll$134(this.f21125b);
                return;
        }
    }
}

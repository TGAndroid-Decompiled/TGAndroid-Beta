package org.telegram.messenger;
public final class j3 implements Runnable {
    public final int f18670a;
    public final Runnable f18671b;

    public j3(int i10, Runnable runnable) {
        this.f18670a = i10;
        this.f18671b = runnable;
    }

    @Override
    public final void run() {
        switch (this.f18670a) {
            case 0:
                FileLog.a(this.f18671b);
                return;
            case 1:
                MessagesController.lambda$unblockPeer$109(this.f18671b);
                return;
            case 2:
                this.f18671b.run();
                return;
            default:
                SendMessagesHelper.lambda$prepareSendingPoll$137(this.f18671b);
                return;
        }
    }
}

package org.telegram.messenger;
public final class h3 implements Runnable {
    public final int f18489a;
    public final Runnable f18490b;

    public h3(int i10, Runnable runnable) {
        this.f18489a = i10;
        this.f18490b = runnable;
    }

    @Override
    public final void run() {
        switch (this.f18489a) {
            case 0:
                FileLog.a(this.f18490b);
                return;
            case 1:
                MessagesController.lambda$unblockPeer$109(this.f18490b);
                return;
            case 2:
                this.f18490b.run();
                return;
            default:
                SendMessagesHelper.lambda$prepareSendingPoll$137(this.f18490b);
                return;
        }
    }
}

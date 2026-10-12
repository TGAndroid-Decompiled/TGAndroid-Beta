package org.telegram.messenger;
public final class h3 implements Runnable {
    public final int f17367a;
    public final Runnable f17368b;

    public h3(int i10, Runnable runnable) {
        this.f17367a = i10;
        this.f17368b = runnable;
    }

    @Override
    public final void run() {
        switch (this.f17367a) {
            case 0:
                FileLog.a(this.f17368b);
                return;
            case 1:
                MessagesController.lambda$unblockPeer$109(this.f17368b);
                return;
            case 2:
                this.f17368b.run();
                return;
            default:
                SendMessagesHelper.D1(this.f17368b);
                return;
        }
    }
}

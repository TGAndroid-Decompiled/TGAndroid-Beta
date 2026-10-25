package org.telegram.messenger;
public final class k3 implements Runnable {
    public final int f20481a;
    public final Runnable f20482b;

    public k3(int i10, Runnable runnable) {
        this.f20481a = i10;
        this.f20482b = runnable;
    }

    @Override
    public final void run() {
        switch (this.f20481a) {
            case 0:
                FileLog.a(this.f20482b);
                return;
            case 1:
                this.f20482b.run();
                return;
            case 2:
                MessagesController.lambda$unblockPeer$109(this.f20482b);
                return;
            default:
                SendMessagesHelper.D1(this.f20482b);
                return;
        }
    }
}

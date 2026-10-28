package org.telegram.messenger;
public final class l3 implements Runnable {
    public final int f20566a;
    public final Runnable f20567b;

    public l3(int i10, Runnable runnable) {
        this.f20566a = i10;
        this.f20567b = runnable;
    }

    @Override
    public final void run() {
        switch (this.f20566a) {
            case 0:
                FileLog.a(this.f20567b);
                return;
            case 1:
                MessagesController.lambda$unblockPeer$109(this.f20567b);
                return;
            case 2:
                this.f20567b.run();
                return;
            default:
                SendMessagesHelper.D1(this.f20567b);
                return;
        }
    }
}

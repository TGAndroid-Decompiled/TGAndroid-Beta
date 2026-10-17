package org.telegram.messenger;
public final class h3 implements Runnable {
    public final int f18497a;
    public final Runnable f18498b;

    public h3(int i10, Runnable runnable) {
        this.f18497a = i10;
        this.f18498b = runnable;
    }

    @Override
    public final void run() {
        switch (this.f18497a) {
            case 0:
                FileLog.a(this.f18498b);
                return;
            case 1:
                MessagesController.lambda$unblockPeer$109(this.f18498b);
                return;
            case 2:
                this.f18498b.run();
                return;
            default:
                SendMessagesHelper.D1(this.f18498b);
                return;
        }
    }
}

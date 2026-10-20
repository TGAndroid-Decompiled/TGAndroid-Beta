package org.telegram.messenger;
public final class i3 implements Runnable {
    public final int f18582a;
    public final Runnable f18583b;

    public i3(int i10, Runnable runnable) {
        this.f18582a = i10;
        this.f18583b = runnable;
    }

    @Override
    public final void run() {
        switch (this.f18582a) {
            case 0:
                FileLog.a(this.f18583b);
                return;
            case 1:
                MessagesController.lambda$unblockPeer$109(this.f18583b);
                return;
            case 2:
                this.f18583b.run();
                return;
            default:
                SendMessagesHelper.D1(this.f18583b);
                return;
        }
    }
}

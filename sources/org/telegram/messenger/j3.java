package org.telegram.messenger;
public final class j3 implements Runnable {
    public final int f18647a;
    public final Runnable f18648b;

    public j3(int i10, Runnable runnable) {
        this.f18647a = i10;
        this.f18648b = runnable;
    }

    @Override
    public final void run() {
        switch (this.f18647a) {
            case 0:
                FileLog.a(this.f18648b);
                return;
            case 1:
                MessagesController.lambda$unblockPeer$109(this.f18648b);
                return;
            case 2:
                this.f18648b.run();
                return;
            default:
                SendMessagesHelper.D1(this.f18648b);
                return;
        }
    }
}

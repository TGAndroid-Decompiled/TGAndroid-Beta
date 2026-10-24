package org.telegram.messenger;
public final class j3 implements Runnable {
    public final int f18715a;
    public final Runnable f18716b;

    public j3(int i10, Runnable runnable) {
        this.f18715a = i10;
        this.f18716b = runnable;
    }

    @Override
    public final void run() {
        switch (this.f18715a) {
            case 0:
                FileLog.a(this.f18716b);
                return;
            case 1:
                MessagesController.lambda$unblockPeer$109(this.f18716b);
                return;
            case 2:
                this.f18716b.run();
                return;
            default:
                SendMessagesHelper.D1(this.f18716b);
                return;
        }
    }
}

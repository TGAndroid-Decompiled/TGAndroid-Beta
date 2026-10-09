package org.telegram.messenger;
public final class e3 implements Runnable {
    public final int f17696a;
    public final Runnable f17697b;

    public e3(int i10, Runnable runnable) {
        this.f17696a = i10;
        this.f17697b = runnable;
    }

    @Override
    public final void run() {
        switch (this.f17696a) {
            case 0:
                FileLog.a(this.f17697b);
                return;
            case 1:
                MessagesController.lambda$unblockPeer$109(this.f17697b);
                return;
            case 2:
                MessagesController.lambda$deleteMessagesRange$468(this.f17697b);
                return;
            default:
                SendMessagesHelper.D1(this.f17697b);
                return;
        }
    }
}

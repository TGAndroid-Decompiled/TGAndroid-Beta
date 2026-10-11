package org.telegram.messenger;
public final class e3 implements Runnable {
    public final int f17698a;
    public final Runnable f17699b;

    public e3(int i10, Runnable runnable) {
        this.f17698a = i10;
        this.f17699b = runnable;
    }

    @Override
    public final void run() {
        switch (this.f17698a) {
            case 0:
                FileLog.a(this.f17699b);
                return;
            case 1:
                MessagesController.lambda$unblockPeer$109(this.f17699b);
                return;
            case 2:
                MessagesController.lambda$deleteMessagesRange$468(this.f17699b);
                return;
            default:
                SendMessagesHelper.D1(this.f17699b);
                return;
        }
    }
}

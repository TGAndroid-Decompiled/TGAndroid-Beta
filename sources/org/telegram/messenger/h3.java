package org.telegram.messenger;
public final class h3 implements Runnable {
    public final int f17746a;
    public final Runnable f17747b;

    public h3(int i10, Runnable runnable) {
        this.f17746a = i10;
        this.f17747b = runnable;
    }

    @Override
    public final void run() {
        switch (this.f17746a) {
            case 0:
                FileLog.a(this.f17747b);
                return;
            case 1:
                MessagesController.lambda$unblockPeer$109(this.f17747b);
                return;
            case 2:
                MessagesController.lambda$deleteMessagesRange$468(this.f17747b);
                return;
            default:
                SendMessagesHelper.D1(this.f17747b);
                return;
        }
    }
}

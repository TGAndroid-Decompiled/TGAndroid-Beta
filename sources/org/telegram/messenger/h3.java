package org.telegram.messenger;
public final class h3 implements Runnable {
    public final int f17745a;
    public final Runnable f17746b;

    public h3(int i10, Runnable runnable) {
        this.f17745a = i10;
        this.f17746b = runnable;
    }

    @Override
    public final void run() {
        switch (this.f17745a) {
            case 0:
                FileLog.a(this.f17746b);
                return;
            case 1:
                MessagesController.lambda$unblockPeer$109(this.f17746b);
                return;
            case 2:
                MessagesController.lambda$deleteMessagesRange$468(this.f17746b);
                return;
            default:
                SendMessagesHelper.D1(this.f17746b);
                return;
        }
    }
}

package org.telegram.messenger;
public final class h3 implements Runnable {
    public final int f18496a;
    public final Runnable f18497b;

    public h3(int i10, Runnable runnable) {
        this.f18496a = i10;
        this.f18497b = runnable;
    }

    @Override
    public final void run() {
        switch (this.f18496a) {
            case 0:
                FileLog.a(this.f18497b);
                return;
            case 1:
                MessagesController.lambda$unblockPeer$109(this.f18497b);
                return;
            case 2:
                this.f18497b.run();
                return;
            default:
                AndroidUtilities.runOnUIThread(this.f18497b);
                return;
        }
    }
}

package org.telegram.messenger;
public final class h3 implements Runnable {
    public final int f18493a;
    public final Runnable f18494b;

    public h3(int i10, Runnable runnable) {
        this.f18493a = i10;
        this.f18494b = runnable;
    }

    @Override
    public final void run() {
        switch (this.f18493a) {
            case 0:
                FileLog.a(this.f18494b);
                return;
            case 1:
                MessagesController.lambda$unblockPeer$109(this.f18494b);
                return;
            case 2:
                this.f18494b.run();
                return;
            default:
                AndroidUtilities.runOnUIThread(this.f18494b);
                return;
        }
    }
}

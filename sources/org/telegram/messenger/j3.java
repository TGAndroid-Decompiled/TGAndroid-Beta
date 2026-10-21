package org.telegram.messenger;
public final class j3 implements Runnable {
    public final int f18660a;
    public final Runnable f18661b;

    public j3(int i10, Runnable runnable) {
        this.f18660a = i10;
        this.f18661b = runnable;
    }

    @Override
    public final void run() {
        switch (this.f18660a) {
            case 0:
                FileLog.a(this.f18661b);
                return;
            case 1:
                MessagesController.lambda$unblockPeer$109(this.f18661b);
                return;
            case 2:
                this.f18661b.run();
                return;
            default:
                AndroidUtilities.runOnUIThread(this.f18661b);
                return;
        }
    }
}

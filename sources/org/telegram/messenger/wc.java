package org.telegram.messenger;
public final class wc implements Runnable {
    public final int f19991a;
    public final boolean[] f19992b;
    public final Runnable[] f19993c;

    public wc(boolean[] zArr, Runnable[] runnableArr, int i10) {
        this.f19991a = i10;
        this.f19992b = zArr;
        this.f19993c = runnableArr;
    }

    @Override
    public final void run() {
        switch (this.f19991a) {
            case 0:
                MessagesController.lambda$ensureMessagesLoaded$464(this.f19992b, this.f19993c);
                return;
            default:
                PasskeysController.lambda$login$12(this.f19992b, this.f19993c);
                return;
        }
    }
}

package org.telegram.messenger;
public final class wc implements Runnable {
    public final int f19985a;
    public final boolean[] f19986b;
    public final Runnable[] f19987c;

    public wc(boolean[] zArr, Runnable[] runnableArr, int i10) {
        this.f19985a = i10;
        this.f19986b = zArr;
        this.f19987c = runnableArr;
    }

    @Override
    public final void run() {
        switch (this.f19985a) {
            case 0:
                MessagesController.lambda$ensureMessagesLoaded$464(this.f19986b, this.f19987c);
                return;
            default:
                PasskeysController.lambda$login$12(this.f19986b, this.f19987c);
                return;
        }
    }
}

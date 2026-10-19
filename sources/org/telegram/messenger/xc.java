package org.telegram.messenger;
public final class xc implements Runnable {
    public final int f20079a;
    public final boolean[] f20080b;
    public final Runnable[] f20081c;

    public xc(boolean[] zArr, Runnable[] runnableArr, int i10) {
        this.f20079a = i10;
        this.f20080b = zArr;
        this.f20081c = runnableArr;
    }

    @Override
    public final void run() {
        switch (this.f20079a) {
            case 0:
                MessagesController.lambda$ensureMessagesLoaded$464(this.f20080b, this.f20081c);
                return;
            default:
                PasskeysController.lambda$login$12(this.f20080b, this.f20081c);
                return;
        }
    }
}

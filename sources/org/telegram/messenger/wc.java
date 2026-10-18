package org.telegram.messenger;
public final class wc implements Runnable {
    public final int f19997a;
    public final boolean[] f19998b;
    public final Runnable[] f19999c;

    public wc(boolean[] zArr, Runnable[] runnableArr, int i10) {
        this.f19997a = i10;
        this.f19998b = zArr;
        this.f19999c = runnableArr;
    }

    @Override
    public final void run() {
        switch (this.f19997a) {
            case 0:
                MessagesController.lambda$ensureMessagesLoaded$464(this.f19998b, this.f19999c);
                return;
            default:
                PasskeysController.lambda$login$12(this.f19998b, this.f19999c);
                return;
        }
    }
}

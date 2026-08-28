package org.telegram.messenger;
public final class lc implements Runnable {
    public final int f20871a;
    public final boolean[] f20872b;
    public final Runnable[] f20873c;

    public lc(boolean[] zArr, Runnable[] runnableArr, int i9) {
        this.f20871a = i9;
        this.f20872b = zArr;
        this.f20873c = runnableArr;
    }

    @Override
    public final void run() {
        switch (this.f20871a) {
            case 0:
                MessagesController.lambda$ensureMessagesLoaded$461(this.f20872b, this.f20873c);
                return;
            default:
                PasskeysController.lambda$login$12(this.f20872b, this.f20873c);
                return;
        }
    }
}

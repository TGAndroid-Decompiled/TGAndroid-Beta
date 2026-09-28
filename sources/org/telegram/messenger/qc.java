package org.telegram.messenger;
public final class qc implements Runnable {
    public final int f17378a;
    public final boolean[] f17379b;
    public final Runnable[] f17380c;

    public qc(boolean[] zArr, Runnable[] runnableArr, int i10) {
        this.f17378a = i10;
        this.f17379b = zArr;
        this.f17380c = runnableArr;
    }

    @Override
    public final void run() {
        switch (this.f17378a) {
            case 0:
                MessagesController.lambda$ensureMessagesLoaded$461(this.f17379b, this.f17380c);
                return;
            default:
                PasskeysController.lambda$login$12(this.f17379b, this.f17380c);
                return;
        }
    }
}

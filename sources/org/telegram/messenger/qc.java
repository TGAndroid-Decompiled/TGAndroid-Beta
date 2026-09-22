package org.telegram.messenger;
public final class qc implements Runnable {
    public final int f17371a;
    public final boolean[] f17372b;
    public final Runnable[] f17373c;

    public qc(boolean[] zArr, Runnable[] runnableArr, int i10) {
        this.f17371a = i10;
        this.f17372b = zArr;
        this.f17373c = runnableArr;
    }

    @Override
    public final void run() {
        switch (this.f17371a) {
            case 0:
                MessagesController.lambda$ensureMessagesLoaded$461(this.f17372b, this.f17373c);
                return;
            default:
                PasskeysController.lambda$login$12(this.f17372b, this.f17373c);
                return;
        }
    }
}

package org.telegram.messenger;
public final class qc implements Runnable {
    public final int f17130a;
    public final boolean[] f17131b;
    public final Runnable[] f17132c;

    public qc(boolean[] zArr, Runnable[] runnableArr, int i10) {
        this.f17130a = i10;
        this.f17131b = zArr;
        this.f17132c = runnableArr;
    }

    @Override
    public final void run() {
        switch (this.f17130a) {
            case 0:
                MessagesController.lambda$ensureMessagesLoaded$461(this.f17131b, this.f17132c);
                return;
            default:
                PasskeysController.lambda$login$12(this.f17131b, this.f17132c);
                return;
        }
    }
}

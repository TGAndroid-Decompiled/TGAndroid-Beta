package org.telegram.messenger;
public final class qc implements Runnable {
    public final int f17143a;
    public final boolean[] f17144b;
    public final Runnable[] f17145c;

    public qc(boolean[] zArr, Runnable[] runnableArr, int i10) {
        this.f17143a = i10;
        this.f17144b = zArr;
        this.f17145c = runnableArr;
    }

    @Override
    public final void run() {
        switch (this.f17143a) {
            case 0:
                MessagesController.lambda$ensureMessagesLoaded$461(this.f17144b, this.f17145c);
                return;
            default:
                PasskeysController.lambda$login$12(this.f17144b, this.f17145c);
                return;
        }
    }
}

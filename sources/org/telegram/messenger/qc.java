package org.telegram.messenger;
public final class qc implements Runnable {
    public final int f17356a;
    public final boolean[] f17357b;
    public final Runnable[] f17358c;

    public qc(boolean[] zArr, Runnable[] runnableArr, int i10) {
        this.f17356a = i10;
        this.f17357b = zArr;
        this.f17358c = runnableArr;
    }

    @Override
    public final void run() {
        switch (this.f17356a) {
            case 0:
                MessagesController.lambda$ensureMessagesLoaded$461(this.f17357b, this.f17358c);
                return;
            default:
                PasskeysController.lambda$login$12(this.f17357b, this.f17358c);
                return;
        }
    }
}

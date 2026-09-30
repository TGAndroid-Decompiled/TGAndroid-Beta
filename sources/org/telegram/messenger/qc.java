package org.telegram.messenger;
public final class qc implements Runnable {
    public final int f17394a;
    public final boolean[] f17395b;
    public final Runnable[] f17396c;

    public qc(boolean[] zArr, Runnable[] runnableArr, int i10) {
        this.f17394a = i10;
        this.f17395b = zArr;
        this.f17396c = runnableArr;
    }

    @Override
    public final void run() {
        switch (this.f17394a) {
            case 0:
                MessagesController.lambda$ensureMessagesLoaded$461(this.f17395b, this.f17396c);
                return;
            default:
                PasskeysController.lambda$login$12(this.f17395b, this.f17396c);
                return;
        }
    }
}

package org.telegram.messenger;
public final class qc implements Runnable {
    public final int f17134a;
    public final boolean[] f17135b;
    public final Runnable[] f17136c;

    public qc(boolean[] zArr, Runnable[] runnableArr, int i10) {
        this.f17134a = i10;
        this.f17135b = zArr;
        this.f17136c = runnableArr;
    }

    @Override
    public final void run() {
        switch (this.f17134a) {
            case 0:
                MessagesController.lambda$ensureMessagesLoaded$461(this.f17135b, this.f17136c);
                return;
            default:
                PasskeysController.lambda$login$12(this.f17135b, this.f17136c);
                return;
        }
    }
}

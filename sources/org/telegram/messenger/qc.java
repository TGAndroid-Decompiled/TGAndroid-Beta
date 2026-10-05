package org.telegram.messenger;
public final class qc implements Runnable {
    public final int f18977a;
    public final boolean[] f18978b;
    public final Runnable[] f18979c;

    public qc(boolean[] zArr, Runnable[] runnableArr, int i10) {
        this.f18977a = i10;
        this.f18978b = zArr;
        this.f18979c = runnableArr;
    }

    @Override
    public final void run() {
        switch (this.f18977a) {
            case 0:
                MessagesController.lambda$ensureMessagesLoaded$461(this.f18978b, this.f18979c);
                return;
            default:
                PasskeysController.lambda$login$12(this.f18978b, this.f18979c);
                return;
        }
    }
}

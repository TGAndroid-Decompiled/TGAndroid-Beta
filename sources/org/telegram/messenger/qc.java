package org.telegram.messenger;
public final class qc implements Runnable {
    public final int f18783a;
    public final boolean[] f18784b;
    public final Runnable[] f18785c;

    public qc(boolean[] zArr, Runnable[] runnableArr, int i10) {
        this.f18783a = i10;
        this.f18784b = zArr;
        this.f18785c = runnableArr;
    }

    @Override
    public final void run() {
        switch (this.f18783a) {
            case 0:
                MessagesController.lambda$ensureMessagesLoaded$461(this.f18784b, this.f18785c);
                return;
            default:
                PasskeysController.lambda$login$12(this.f18784b, this.f18785c);
                return;
        }
    }
}

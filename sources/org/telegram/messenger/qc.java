package org.telegram.messenger;
public final class qc implements Runnable {
    public final int f18810a;
    public final boolean[] f18811b;
    public final Runnable[] f18812c;

    public qc(boolean[] zArr, Runnable[] runnableArr, int i10) {
        this.f18810a = i10;
        this.f18811b = zArr;
        this.f18812c = runnableArr;
    }

    @Override
    public final void run() {
        switch (this.f18810a) {
            case 0:
                MessagesController.lambda$ensureMessagesLoaded$461(this.f18811b, this.f18812c);
                return;
            default:
                PasskeysController.lambda$login$12(this.f18811b, this.f18812c);
                return;
        }
    }
}

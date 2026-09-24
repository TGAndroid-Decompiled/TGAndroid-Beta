package org.telegram.messenger;
public final class qc implements Runnable {
    public final int f17364a;
    public final boolean[] f17365b;
    public final Runnable[] f17366c;

    public qc(boolean[] zArr, Runnable[] runnableArr, int i10) {
        this.f17364a = i10;
        this.f17365b = zArr;
        this.f17366c = runnableArr;
    }

    @Override
    public final void run() {
        switch (this.f17364a) {
            case 0:
                MessagesController.lambda$ensureMessagesLoaded$461(this.f17365b, this.f17366c);
                return;
            default:
                PasskeysController.lambda$login$12(this.f17365b, this.f17366c);
                return;
        }
    }
}

package org.telegram.messenger;
public final class qc implements Runnable {
    public final int f17377a;
    public final boolean[] f17378b;
    public final Runnable[] f17379c;

    public qc(boolean[] zArr, Runnable[] runnableArr, int i10) {
        this.f17377a = i10;
        this.f17378b = zArr;
        this.f17379c = runnableArr;
    }

    @Override
    public final void run() {
        switch (this.f17377a) {
            case 0:
                MessagesController.lambda$ensureMessagesLoaded$461(this.f17378b, this.f17379c);
                return;
            default:
                PasskeysController.lambda$login$12(this.f17378b, this.f17379c);
                return;
        }
    }
}

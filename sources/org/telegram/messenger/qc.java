package org.telegram.messenger;
public final class qc implements Runnable {
    public final int f17375a;
    public final boolean[] f17376b;
    public final Runnable[] f17377c;

    public qc(boolean[] zArr, Runnable[] runnableArr, int i10) {
        this.f17375a = i10;
        this.f17376b = zArr;
        this.f17377c = runnableArr;
    }

    @Override
    public final void run() {
        switch (this.f17375a) {
            case 0:
                MessagesController.lambda$ensureMessagesLoaded$461(this.f17376b, this.f17377c);
                return;
            default:
                PasskeysController.lambda$login$12(this.f17376b, this.f17377c);
                return;
        }
    }
}

package org.telegram.messenger;
public final class qc implements Runnable {
    public final int f18972a;
    public final boolean[] f18973b;
    public final Runnable[] f18974c;

    public qc(boolean[] zArr, Runnable[] runnableArr, int i10) {
        this.f18972a = i10;
        this.f18973b = zArr;
        this.f18974c = runnableArr;
    }

    @Override
    public final void run() {
        switch (this.f18972a) {
            case 0:
                MessagesController.lambda$ensureMessagesLoaded$461(this.f18973b, this.f18974c);
                return;
            default:
                PasskeysController.lambda$login$12(this.f18973b, this.f18974c);
                return;
        }
    }
}

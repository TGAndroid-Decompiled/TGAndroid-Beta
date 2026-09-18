package org.telegram.messenger;
public final class qc implements Runnable {
    public final int f17311a;
    public final boolean[] f17312b;
    public final Runnable[] f17313c;

    public qc(boolean[] zArr, Runnable[] runnableArr, int i10) {
        this.f17311a = i10;
        this.f17312b = zArr;
        this.f17313c = runnableArr;
    }

    @Override
    public final void run() {
        switch (this.f17311a) {
            case 0:
                MessagesController.lambda$ensureMessagesLoaded$461(this.f17312b, this.f17313c);
                return;
            default:
                PasskeysController.lambda$login$12(this.f17312b, this.f17313c);
                return;
        }
    }
}

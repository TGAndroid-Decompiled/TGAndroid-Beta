package org.telegram.messenger;
public final class xc implements Runnable {
    public final int f20076a;
    public final boolean[] f20077b;
    public final Runnable[] f20078c;

    public xc(boolean[] zArr, Runnable[] runnableArr, int i10) {
        this.f20076a = i10;
        this.f20077b = zArr;
        this.f20078c = runnableArr;
    }

    @Override
    public final void run() {
        switch (this.f20076a) {
            case 0:
                MessagesController.lambda$ensureMessagesLoaded$464(this.f20077b, this.f20078c);
                return;
            default:
                PasskeysController.lambda$login$12(this.f20077b, this.f20078c);
                return;
        }
    }
}

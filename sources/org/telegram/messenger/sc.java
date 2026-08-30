package org.telegram.messenger;
public final class sc implements Runnable {
    public final int f18386a;
    public final boolean[] f18387b;
    public final Runnable[] f18388c;

    public sc(boolean[] zArr, Runnable[] runnableArr, int i10) {
        this.f18386a = i10;
        this.f18387b = zArr;
        this.f18388c = runnableArr;
    }

    @Override
    public final void run() {
        switch (this.f18386a) {
            case 0:
                MessagesController.lambda$ensureMessagesLoaded$461(this.f18387b, this.f18388c);
                return;
            default:
                PasskeysController.lambda$login$12(this.f18387b, this.f18388c);
                return;
        }
    }
}

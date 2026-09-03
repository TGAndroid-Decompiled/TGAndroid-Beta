package org.telegram.messenger;
public final class sc implements Runnable {
    public final int f18366a;
    public final boolean[] f18367b;
    public final Runnable[] f18368c;

    public sc(boolean[] zArr, Runnable[] runnableArr, int i10) {
        this.f18366a = i10;
        this.f18367b = zArr;
        this.f18368c = runnableArr;
    }

    @Override
    public final void run() {
        switch (this.f18366a) {
            case 0:
                MessagesController.lambda$ensureMessagesLoaded$461(this.f18367b, this.f18368c);
                return;
            default:
                PasskeysController.lambda$login$12(this.f18367b, this.f18368c);
                return;
        }
    }
}

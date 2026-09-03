package org.telegram.messenger;
public final class sc implements Runnable {
    public final int f19974a;
    public final boolean[] f19975b;
    public final Runnable[] f19976c;

    public sc(boolean[] zArr, Runnable[] runnableArr, int i10) {
        this.f19974a = i10;
        this.f19975b = zArr;
        this.f19976c = runnableArr;
    }

    @Override
    public final void run() {
        switch (this.f19974a) {
            case 0:
                MessagesController.lambda$ensureMessagesLoaded$461(this.f19975b, this.f19976c);
                return;
            default:
                PasskeysController.lambda$login$12(this.f19975b, this.f19976c);
                return;
        }
    }
}

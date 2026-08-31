package org.telegram.messenger;
public final class sc implements Runnable {
    public final int f19972a;
    public final boolean[] f19973b;
    public final Runnable[] f19974c;

    public sc(boolean[] zArr, Runnable[] runnableArr, int i10) {
        this.f19972a = i10;
        this.f19973b = zArr;
        this.f19974c = runnableArr;
    }

    @Override
    public final void run() {
        switch (this.f19972a) {
            case 0:
                MessagesController.lambda$ensureMessagesLoaded$461(this.f19973b, this.f19974c);
                return;
            default:
                PasskeysController.lambda$login$12(this.f19973b, this.f19974c);
                return;
        }
    }
}

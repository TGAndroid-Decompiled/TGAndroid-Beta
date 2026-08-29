package org.telegram.messenger;
public final class rc implements Runnable {
    public final int f21432a;
    public final boolean[] f21433b;
    public final Runnable[] f21434c;

    public rc(boolean[] zArr, Runnable[] runnableArr, int i10) {
        this.f21432a = i10;
        this.f21433b = zArr;
        this.f21434c = runnableArr;
    }

    @Override
    public final void run() {
        switch (this.f21432a) {
            case 0:
                MessagesController.lambda$ensureMessagesLoaded$461(this.f21433b, this.f21434c);
                return;
            default:
                PasskeysController.lambda$login$12(this.f21433b, this.f21434c);
                return;
        }
    }
}

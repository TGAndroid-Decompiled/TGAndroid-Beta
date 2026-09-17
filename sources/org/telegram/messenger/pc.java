package org.telegram.messenger;
public final class pc implements Runnable {
    public final int f18703a;
    public final boolean[] f18704b;
    public final Runnable[] f18705c;

    public pc(boolean[] zArr, Runnable[] runnableArr, int i10) {
        this.f18703a = i10;
        this.f18704b = zArr;
        this.f18705c = runnableArr;
    }

    @Override
    public final void run() {
        switch (this.f18703a) {
            case 0:
                MessagesController.lambda$ensureMessagesLoaded$461(this.f18704b, this.f18705c);
                return;
            default:
                PasskeysController.lambda$login$12(this.f18704b, this.f18705c);
                return;
        }
    }
}

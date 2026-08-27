package org.telegram.messenger;

public final class pc implements Runnable {

    public final int f21250a;

    public final boolean[] f21251b;

    public final Runnable[] f21252c;

    public pc(boolean[] zArr, Runnable[] runnableArr, int i10) {
        this.f21250a = i10;
        this.f21251b = zArr;
        this.f21252c = runnableArr;
    }

    @Override
    public final void run() {
        switch (this.f21250a) {
            case 0:
                MessagesController.lambda$ensureMessagesLoaded$461(this.f21251b, this.f21252c);
                break;
            default:
                PasskeysController.lambda$login$12(this.f21251b, this.f21252c);
                break;
        }
    }
}

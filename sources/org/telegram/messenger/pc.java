package org.telegram.messenger;
public final class pc implements Runnable {
    public final int f18730a;
    public final boolean[] f18731b;
    public final Runnable[] f18732c;

    public pc(boolean[] zArr, Runnable[] runnableArr, int i10) {
        this.f18730a = i10;
        this.f18731b = zArr;
        this.f18732c = runnableArr;
    }

    @Override
    public final void run() {
        switch (this.f18730a) {
            case 0:
                MessagesController.lambda$ensureMessagesLoaded$461(this.f18731b, this.f18732c);
                return;
            default:
                PasskeysController.lambda$login$12(this.f18731b, this.f18732c);
                return;
        }
    }
}

package org.telegram.messenger;
public final class qc implements Runnable {
    public final int f17126a;
    public final boolean[] f17127b;
    public final Runnable[] f17128c;

    public qc(boolean[] zArr, Runnable[] runnableArr, int i10) {
        this.f17126a = i10;
        this.f17127b = zArr;
        this.f17128c = runnableArr;
    }

    @Override
    public final void run() {
        switch (this.f17126a) {
            case 0:
                MessagesController.lambda$ensureMessagesLoaded$461(this.f17127b, this.f17128c);
                return;
            default:
                PasskeysController.lambda$login$12(this.f17127b, this.f17128c);
                return;
        }
    }
}

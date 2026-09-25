package org.telegram.messenger;
public final class qc implements Runnable {
    public final int f17379a;
    public final boolean[] f17380b;
    public final Runnable[] f17381c;

    public qc(boolean[] zArr, Runnable[] runnableArr, int i10) {
        this.f17379a = i10;
        this.f17380b = zArr;
        this.f17381c = runnableArr;
    }

    @Override
    public final void run() {
        switch (this.f17379a) {
            case 0:
                MessagesController.lambda$ensureMessagesLoaded$461(this.f17380b, this.f17381c);
                return;
            default:
                PasskeysController.lambda$login$12(this.f17380b, this.f17381c);
                return;
        }
    }
}

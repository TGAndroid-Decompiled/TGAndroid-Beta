package org.telegram.messenger;
public final class qc implements Runnable {
    public final int f18973a;
    public final boolean[] f18974b;
    public final Runnable[] f18975c;

    public qc(boolean[] zArr, Runnable[] runnableArr, int i10) {
        this.f18973a = i10;
        this.f18974b = zArr;
        this.f18975c = runnableArr;
    }

    @Override
    public final void run() {
        switch (this.f18973a) {
            case 0:
                MessagesController.lambda$ensureMessagesLoaded$461(this.f18974b, this.f18975c);
                return;
            default:
                PasskeysController.lambda$login$12(this.f18974b, this.f18975c);
                return;
        }
    }
}

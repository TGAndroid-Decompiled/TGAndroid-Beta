package org.telegram.messenger;
public final class ad implements Runnable {
    public final int f17877a;
    public final boolean[] f17878b;
    public final Runnable[] f17879c;

    public ad(boolean[] zArr, Runnable[] runnableArr, int i10) {
        this.f17877a = i10;
        this.f17878b = zArr;
        this.f17879c = runnableArr;
    }

    @Override
    public final void run() {
        switch (this.f17877a) {
            case 0:
                MessagesController.P7(this.f17878b, this.f17879c);
                return;
            default:
                PasskeysController.j(this.f17878b, this.f17879c);
                return;
        }
    }
}

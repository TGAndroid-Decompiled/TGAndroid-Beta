package org.telegram.messenger;
public final class ad implements Runnable {
    public final int f17940a;
    public final boolean[] f17941b;
    public final Runnable[] f17942c;

    public ad(boolean[] zArr, Runnable[] runnableArr, int i10) {
        this.f17940a = i10;
        this.f17941b = zArr;
        this.f17942c = runnableArr;
    }

    @Override
    public final void run() {
        switch (this.f17940a) {
            case 0:
                MessagesController.P7(this.f17941b, this.f17942c);
                return;
            default:
                PasskeysController.j(this.f17941b, this.f17942c);
                return;
        }
    }
}

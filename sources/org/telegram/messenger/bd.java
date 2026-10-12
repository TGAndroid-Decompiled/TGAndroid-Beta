package org.telegram.messenger;
public final class bd implements Runnable {
    public final int f17174a;
    public final boolean[] f17175b;
    public final Runnable[] f17176c;

    public bd(boolean[] zArr, Runnable[] runnableArr, int i10) {
        this.f17174a = i10;
        this.f17175b = zArr;
        this.f17176c = runnableArr;
    }

    @Override
    public final void run() {
        switch (this.f17174a) {
            case 0:
                MessagesController.P7(this.f17175b, this.f17176c);
                return;
            default:
                PasskeysController.j(this.f17175b, this.f17176c);
                return;
        }
    }
}

package org.telegram.messenger;
public final class bd implements Runnable {
    public final int f17949a;
    public final boolean[] f17950b;
    public final Runnable[] f17951c;

    public bd(boolean[] zArr, Runnable[] runnableArr, int i10) {
        this.f17949a = i10;
        this.f17950b = zArr;
        this.f17951c = runnableArr;
    }

    @Override
    public final void run() {
        switch (this.f17949a) {
            case 0:
                MessagesController.P7(this.f17950b, this.f17951c);
                return;
            default:
                PasskeysController.j(this.f17950b, this.f17951c);
                return;
        }
    }
}

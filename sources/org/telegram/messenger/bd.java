package org.telegram.messenger;
public final class bd implements Runnable {
    public final int f16571a;
    public final boolean[] f16572b;
    public final Runnable[] f16573c;

    public bd(boolean[] zArr, Runnable[] runnableArr, int i10) {
        this.f16571a = i10;
        this.f16572b = zArr;
        this.f16573c = runnableArr;
    }

    @Override
    public final void run() {
        switch (this.f16571a) {
            case 0:
                MessagesController.P7(this.f16572b, this.f16573c);
                return;
            default:
                PasskeysController.j(this.f16572b, this.f16573c);
                return;
        }
    }
}

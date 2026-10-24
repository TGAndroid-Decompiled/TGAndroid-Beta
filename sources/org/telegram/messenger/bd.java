package org.telegram.messenger;
public final class bd implements Runnable {
    public final int f18012a;
    public final boolean[] f18013b;
    public final Runnable[] f18014c;

    public bd(boolean[] zArr, Runnable[] runnableArr, int i10) {
        this.f18012a = i10;
        this.f18013b = zArr;
        this.f18014c = runnableArr;
    }

    @Override
    public final void run() {
        switch (this.f18012a) {
            case 0:
                MessagesController.P7(this.f18013b, this.f18014c);
                return;
            default:
                PasskeysController.j(this.f18013b, this.f18014c);
                return;
        }
    }
}

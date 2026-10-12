package org.telegram.messenger;
public final class bd implements Runnable {
    public final int f16871a;
    public final boolean[] f16872b;
    public final Runnable[] f16873c;

    public bd(boolean[] zArr, Runnable[] runnableArr, int i10) {
        this.f16871a = i10;
        this.f16872b = zArr;
        this.f16873c = runnableArr;
    }

    @Override
    public final void run() {
        switch (this.f16871a) {
            case 0:
                MessagesController.P7(this.f16872b, this.f16873c);
                return;
            default:
                PasskeysController.j(this.f16872b, this.f16873c);
                return;
        }
    }
}

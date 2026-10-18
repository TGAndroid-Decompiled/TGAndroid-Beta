package org.telegram.messenger;
public final class xk implements Runnable {
    public final int f20109a;
    public final TranslateController f20110b;
    public final long f20111c;

    public xk(TranslateController translateController, long j10, int i10) {
        this.f20109a = i10;
        this.f20110b = translateController;
        this.f20111c = j10;
    }

    @Override
    public final void run() {
        switch (this.f20109a) {
            case 0:
                TranslateController.G(this.f20110b, this.f20111c);
                return;
            default:
                TranslateController.p(this.f20110b, this.f20111c);
                return;
        }
    }
}

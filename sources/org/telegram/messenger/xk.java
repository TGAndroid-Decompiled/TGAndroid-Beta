package org.telegram.messenger;
public final class xk implements Runnable {
    public final int f20098a;
    public final TranslateController f20099b;
    public final long f20100c;

    public xk(TranslateController translateController, long j10, int i10) {
        this.f20098a = i10;
        this.f20099b = translateController;
        this.f20100c = j10;
    }

    @Override
    public final void run() {
        switch (this.f20098a) {
            case 0:
                TranslateController.G(this.f20099b, this.f20100c);
                return;
            default:
                TranslateController.p(this.f20099b, this.f20100c);
                return;
        }
    }
}

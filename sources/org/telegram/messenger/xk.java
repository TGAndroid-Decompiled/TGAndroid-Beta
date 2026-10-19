package org.telegram.messenger;
public final class xk implements Runnable {
    public final int f20103a;
    public final TranslateController f20104b;
    public final long f20105c;

    public xk(TranslateController translateController, long j10, int i10) {
        this.f20103a = i10;
        this.f20104b = translateController;
        this.f20105c = j10;
    }

    @Override
    public final void run() {
        switch (this.f20103a) {
            case 0:
                TranslateController.G(this.f20104b, this.f20105c);
                return;
            default:
                TranslateController.p(this.f20104b, this.f20105c);
                return;
        }
    }
}

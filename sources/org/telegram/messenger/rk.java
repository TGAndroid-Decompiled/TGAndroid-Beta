package org.telegram.messenger;
public final class rk implements Runnable {
    public final int f21425a;
    public final TranslateController f21426b;
    public final long f21427c;

    public rk(TranslateController translateController, long j10, int i9) {
        this.f21425a = i9;
        this.f21426b = translateController;
        this.f21427c = j10;
    }

    @Override
    public final void run() {
        switch (this.f21425a) {
            case 0:
                TranslateController.G(this.f21426b, this.f21427c);
                return;
            default:
                TranslateController.p(this.f21426b, this.f21427c);
                return;
        }
    }
}

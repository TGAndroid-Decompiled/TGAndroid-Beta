package org.telegram.messenger;
public final class el implements Runnable {
    public final int f17196a;
    public final TranslateController f17197b;
    public final long f17198c;

    public el(TranslateController translateController, long j10, int i10) {
        this.f17196a = i10;
        this.f17197b = translateController;
        this.f17198c = j10;
    }

    @Override
    public final void run() {
        switch (this.f17196a) {
            case 0:
                TranslateController.G(this.f17197b, this.f17198c);
                return;
            default:
                TranslateController.p(this.f17197b, this.f17198c);
                return;
        }
    }
}

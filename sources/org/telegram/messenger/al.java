package org.telegram.messenger;
public final class al implements Runnable {
    public final int f17955a;
    public final TranslateController f17956b;
    public final long f17957c;

    public al(TranslateController translateController, long j10, int i10) {
        this.f17955a = i10;
        this.f17956b = translateController;
        this.f17957c = j10;
    }

    @Override
    public final void run() {
        switch (this.f17955a) {
            case 0:
                TranslateController.G(this.f17956b, this.f17957c);
                return;
            default:
                TranslateController.p(this.f17956b, this.f17957c);
                return;
        }
    }
}

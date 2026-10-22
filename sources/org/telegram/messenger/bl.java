package org.telegram.messenger;
public final class bl implements Runnable {
    public final int f17983a;
    public final TranslateController f17984b;
    public final long f17985c;

    public bl(TranslateController translateController, long j10, int i10) {
        this.f17983a = i10;
        this.f17984b = translateController;
        this.f17985c = j10;
    }

    @Override
    public final void run() {
        switch (this.f17983a) {
            case 0:
                TranslateController.G(this.f17984b, this.f17985c);
                return;
            default:
                TranslateController.p(this.f17984b, this.f17985c);
                return;
        }
    }
}

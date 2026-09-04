package org.telegram.messenger;
public final class bl implements Runnable {
    public final int f17284a;
    public final TranslateController f17285b;
    public final long f17286c;

    public bl(TranslateController translateController, long j3, int i10) {
        this.f17284a = i10;
        this.f17285b = translateController;
        this.f17286c = j3;
    }

    @Override
    public final void run() {
        switch (this.f17284a) {
            case 0:
                TranslateController.G(this.f17285b, this.f17286c);
                return;
            default:
                TranslateController.p(this.f17285b, this.f17286c);
                return;
        }
    }
}

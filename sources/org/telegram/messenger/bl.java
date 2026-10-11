package org.telegram.messenger;
public final class bl implements Runnable {
    public final int f17462a;
    public final TranslateController f17463b;
    public final long f17464c;

    public bl(TranslateController translateController, long j3, int i10) {
        this.f17462a = i10;
        this.f17463b = translateController;
        this.f17464c = j3;
    }

    @Override
    public final void run() {
        switch (this.f17462a) {
            case 0:
                TranslateController.G(this.f17463b, this.f17464c);
                return;
            default:
                TranslateController.p(this.f17463b, this.f17464c);
                return;
        }
    }
}

package org.telegram.messenger;
public final class bl implements Runnable {
    public final int f17463a;
    public final TranslateController f17464b;
    public final long f17465c;

    public bl(TranslateController translateController, long j3, int i10) {
        this.f17463a = i10;
        this.f17464b = translateController;
        this.f17465c = j3;
    }

    @Override
    public final void run() {
        switch (this.f17463a) {
            case 0:
                TranslateController.G(this.f17464b, this.f17465c);
                return;
            default:
                TranslateController.p(this.f17464b, this.f17465c);
                return;
        }
    }
}

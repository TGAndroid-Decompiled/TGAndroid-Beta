package org.telegram.messenger;
public final class bl implements Runnable {
    public final int f17311a;
    public final TranslateController f17312b;
    public final long f17313c;

    public bl(TranslateController translateController, long j3, int i10) {
        this.f17311a = i10;
        this.f17312b = translateController;
        this.f17313c = j3;
    }

    @Override
    public final void run() {
        switch (this.f17311a) {
            case 0:
                TranslateController.G(this.f17312b, this.f17313c);
                return;
            default:
                TranslateController.p(this.f17312b, this.f17313c);
                return;
        }
    }
}

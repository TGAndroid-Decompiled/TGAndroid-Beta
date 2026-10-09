package org.telegram.messenger;
public final class bl implements Runnable {
    public final int f17459a;
    public final TranslateController f17460b;
    public final long f17461c;

    public bl(TranslateController translateController, long j3, int i10) {
        this.f17459a = i10;
        this.f17460b = translateController;
        this.f17461c = j3;
    }

    @Override
    public final void run() {
        switch (this.f17459a) {
            case 0:
                TranslateController.G(this.f17460b, this.f17461c);
                return;
            default:
                TranslateController.p(this.f17460b, this.f17461c);
                return;
        }
    }
}

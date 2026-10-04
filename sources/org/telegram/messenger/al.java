package org.telegram.messenger;
public final class al implements Runnable {
    public final int f17372a;
    public final TranslateController f17373b;
    public final long f17374c;

    public al(TranslateController translateController, long j3, int i10) {
        this.f17372a = i10;
        this.f17373b = translateController;
        this.f17374c = j3;
    }

    @Override
    public final void run() {
        switch (this.f17372a) {
            case 0:
                TranslateController.G(this.f17373b, this.f17374c);
                return;
            default:
                TranslateController.p(this.f17373b, this.f17374c);
                return;
        }
    }
}

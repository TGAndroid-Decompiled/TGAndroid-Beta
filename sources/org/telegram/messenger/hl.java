package org.telegram.messenger;
public final class hl implements Runnable {
    public final int f17829a;
    public final TranslateController f17830b;
    public final long f17831c;

    public hl(TranslateController translateController, long j3, int i10) {
        this.f17829a = i10;
        this.f17830b = translateController;
        this.f17831c = j3;
    }

    @Override
    public final void run() {
        switch (this.f17829a) {
            case 0:
                TranslateController.G(this.f17830b, this.f17831c);
                return;
            default:
                TranslateController.p(this.f17830b, this.f17831c);
                return;
        }
    }
}

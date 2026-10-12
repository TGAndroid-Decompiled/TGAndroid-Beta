package org.telegram.messenger;
public final class hl implements Runnable {
    public final int f17830a;
    public final TranslateController f17831b;
    public final long f17832c;

    public hl(TranslateController translateController, long j3, int i10) {
        this.f17830a = i10;
        this.f17831b = translateController;
        this.f17832c = j3;
    }

    @Override
    public final void run() {
        switch (this.f17830a) {
            case 0:
                TranslateController.G(this.f17831b, this.f17832c);
                return;
            default:
                TranslateController.p(this.f17831b, this.f17832c);
                return;
        }
    }
}

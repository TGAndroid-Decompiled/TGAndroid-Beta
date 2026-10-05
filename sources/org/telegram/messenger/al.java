package org.telegram.messenger;
public final class al implements Runnable {
    public final int f17377a;
    public final TranslateController f17378b;
    public final long f17379c;

    public al(TranslateController translateController, long j3, int i10) {
        this.f17377a = i10;
        this.f17378b = translateController;
        this.f17379c = j3;
    }

    @Override
    public final void run() {
        switch (this.f17377a) {
            case 0:
                TranslateController.G(this.f17378b, this.f17379c);
                return;
            default:
                TranslateController.p(this.f17378b, this.f17379c);
                return;
        }
    }
}

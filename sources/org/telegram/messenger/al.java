package org.telegram.messenger;
public final class al implements Runnable {
    public final int f17367a;
    public final TranslateController f17368b;
    public final long f17369c;

    public al(TranslateController translateController, long j3, int i10) {
        this.f17367a = i10;
        this.f17368b = translateController;
        this.f17369c = j3;
    }

    @Override
    public final void run() {
        switch (this.f17367a) {
            case 0:
                TranslateController.G(this.f17368b, this.f17369c);
                return;
            default:
                TranslateController.p(this.f17368b, this.f17369c);
                return;
        }
    }
}

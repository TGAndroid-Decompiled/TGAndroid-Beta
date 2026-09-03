package org.telegram.messenger;
public final class dl implements Runnable {
    public final int f17071a;
    public final TranslateController f17072b;
    public final long f17073c;

    public dl(TranslateController translateController, long j10, int i10) {
        this.f17071a = i10;
        this.f17072b = translateController;
        this.f17073c = j10;
    }

    @Override
    public final void run() {
        switch (this.f17071a) {
            case 0:
                TranslateController.G(this.f17072b, this.f17073c);
                return;
            default:
                TranslateController.p(this.f17072b, this.f17073c);
                return;
        }
    }
}

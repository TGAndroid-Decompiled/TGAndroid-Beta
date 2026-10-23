package org.telegram.messenger;
public final class al implements Runnable {
    public final int f17911a;
    public final TranslateController f17912b;
    public final long f17913c;

    public al(TranslateController translateController, long j10, int i10) {
        this.f17911a = i10;
        this.f17912b = translateController;
        this.f17913c = j10;
    }

    @Override
    public final void run() {
        switch (this.f17911a) {
            case 0:
                TranslateController.G(this.f17912b, this.f17913c);
                return;
            default:
                TranslateController.p(this.f17912b, this.f17913c);
                return;
        }
    }
}

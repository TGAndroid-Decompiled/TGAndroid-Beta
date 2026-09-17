package org.telegram.messenger;
public final class bl implements Runnable {
    public final int f15796a;
    public final TranslateController f15797b;
    public final long f15798c;

    public bl(TranslateController translateController, long j3, int i10) {
        this.f15796a = i10;
        this.f15797b = translateController;
        this.f15798c = j3;
    }

    @Override
    public final void run() {
        switch (this.f15796a) {
            case 0:
                TranslateController.G(this.f15797b, this.f15798c);
                return;
            default:
                TranslateController.p(this.f15797b, this.f15798c);
                return;
        }
    }
}

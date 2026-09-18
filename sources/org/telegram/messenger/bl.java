package org.telegram.messenger;
public final class bl implements Runnable {
    public final int f15976a;
    public final TranslateController f15977b;
    public final long f15978c;

    public bl(TranslateController translateController, long j3, int i10) {
        this.f15976a = i10;
        this.f15977b = translateController;
        this.f15978c = j3;
    }

    @Override
    public final void run() {
        switch (this.f15976a) {
            case 0:
                TranslateController.G(this.f15977b, this.f15978c);
                return;
            default:
                TranslateController.p(this.f15977b, this.f15978c);
                return;
        }
    }
}

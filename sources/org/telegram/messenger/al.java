package org.telegram.messenger;
public final class al implements Runnable {
    public final int f15934a;
    public final TranslateController f15935b;
    public final long f15936c;

    public al(TranslateController translateController, long j3, int i10) {
        this.f15934a = i10;
        this.f15935b = translateController;
        this.f15936c = j3;
    }

    @Override
    public final void run() {
        switch (this.f15934a) {
            case 0:
                TranslateController.G(this.f15935b, this.f15936c);
                return;
            default:
                TranslateController.p(this.f15935b, this.f15936c);
                return;
        }
    }
}

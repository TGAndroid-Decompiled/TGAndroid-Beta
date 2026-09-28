package org.telegram.messenger;
public final class al implements Runnable {
    public final int f15935a;
    public final TranslateController f15936b;
    public final long f15937c;

    public al(TranslateController translateController, long j3, int i10) {
        this.f15935a = i10;
        this.f15936b = translateController;
        this.f15937c = j3;
    }

    @Override
    public final void run() {
        switch (this.f15935a) {
            case 0:
                TranslateController.G(this.f15936b, this.f15937c);
                return;
            default:
                TranslateController.p(this.f15936b, this.f15937c);
                return;
        }
    }
}

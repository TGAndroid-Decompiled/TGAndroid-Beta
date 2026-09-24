package org.telegram.messenger;
public final class al implements Runnable {
    public final int f15922a;
    public final TranslateController f15923b;
    public final long f15924c;

    public al(TranslateController translateController, long j3, int i10) {
        this.f15922a = i10;
        this.f15923b = translateController;
        this.f15924c = j3;
    }

    @Override
    public final void run() {
        switch (this.f15922a) {
            case 0:
                TranslateController.G(this.f15923b, this.f15924c);
                return;
            default:
                TranslateController.p(this.f15923b, this.f15924c);
                return;
        }
    }
}

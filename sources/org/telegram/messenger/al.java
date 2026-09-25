package org.telegram.messenger;
public final class al implements Runnable {
    public final int f15937a;
    public final TranslateController f15938b;
    public final long f15939c;

    public al(TranslateController translateController, long j3, int i10) {
        this.f15937a = i10;
        this.f15938b = translateController;
        this.f15939c = j3;
    }

    @Override
    public final void run() {
        switch (this.f15937a) {
            case 0:
                TranslateController.G(this.f15938b, this.f15939c);
                return;
            default:
                TranslateController.p(this.f15938b, this.f15939c);
                return;
        }
    }
}

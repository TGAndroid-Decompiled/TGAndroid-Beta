package org.telegram.messenger;
public final class bl implements Runnable {
    public final int f15785a;
    public final TranslateController f15786b;
    public final long f15787c;

    public bl(TranslateController translateController, long j3, int i10) {
        this.f15785a = i10;
        this.f15786b = translateController;
        this.f15787c = j3;
    }

    @Override
    public final void run() {
        switch (this.f15785a) {
            case 0:
                TranslateController.G(this.f15786b, this.f15787c);
                return;
            default:
                TranslateController.p(this.f15786b, this.f15787c);
                return;
        }
    }
}

package org.telegram.messenger;
public final class bl implements Runnable {
    public final int f15787a;
    public final TranslateController f15788b;
    public final long f15789c;

    public bl(TranslateController translateController, long j3, int i10) {
        this.f15787a = i10;
        this.f15788b = translateController;
        this.f15789c = j3;
    }

    @Override
    public final void run() {
        switch (this.f15787a) {
            case 0:
                TranslateController.G(this.f15788b, this.f15789c);
                return;
            default:
                TranslateController.p(this.f15788b, this.f15789c);
                return;
        }
    }
}

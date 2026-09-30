package org.telegram.messenger;
public final class al implements Runnable {
    public final int f15951a;
    public final TranslateController f15952b;
    public final long f15953c;

    public al(TranslateController translateController, long j3, int i10) {
        this.f15951a = i10;
        this.f15952b = translateController;
        this.f15953c = j3;
    }

    @Override
    public final void run() {
        switch (this.f15951a) {
            case 0:
                TranslateController.G(this.f15952b, this.f15953c);
                return;
            default:
                TranslateController.p(this.f15952b, this.f15953c);
                return;
        }
    }
}

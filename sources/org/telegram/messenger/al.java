package org.telegram.messenger;
public final class al implements Runnable {
    public final int f15682a;
    public final TranslateController f15683b;
    public final long f15684c;

    public al(TranslateController translateController, long j3, int i10) {
        this.f15682a = i10;
        this.f15683b = translateController;
        this.f15684c = j3;
    }

    @Override
    public final void run() {
        switch (this.f15682a) {
            case 0:
                TranslateController.G(this.f15683b, this.f15684c);
                return;
            default:
                TranslateController.p(this.f15683b, this.f15684c);
                return;
        }
    }
}

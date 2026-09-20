package org.telegram.messenger;
public final class bl implements Runnable {
    public final int f16010a;
    public final TranslateController f16011b;
    public final long f16012c;

    public bl(TranslateController translateController, long j3, int i10) {
        this.f16010a = i10;
        this.f16011b = translateController;
        this.f16012c = j3;
    }

    @Override
    public final void run() {
        switch (this.f16010a) {
            case 0:
                TranslateController.G(this.f16011b, this.f16012c);
                return;
            default:
                TranslateController.p(this.f16011b, this.f16012c);
                return;
        }
    }
}

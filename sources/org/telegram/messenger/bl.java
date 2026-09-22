package org.telegram.messenger;
public final class bl implements Runnable {
    public final int f16025a;
    public final TranslateController f16026b;
    public final long f16027c;

    public bl(TranslateController translateController, long j3, int i10) {
        this.f16025a = i10;
        this.f16026b = translateController;
        this.f16027c = j3;
    }

    @Override
    public final void run() {
        switch (this.f16025a) {
            case 0:
                TranslateController.G(this.f16026b, this.f16027c);
                return;
            default:
                TranslateController.p(this.f16026b, this.f16027c);
                return;
        }
    }
}

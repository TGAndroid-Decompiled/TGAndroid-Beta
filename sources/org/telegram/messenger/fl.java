package org.telegram.messenger;
public final class fl implements Runnable {
    public final int f16972a;
    public final TranslateController f16973b;
    public final long f16974c;

    public fl(TranslateController translateController, long j10, int i10) {
        this.f16972a = i10;
        this.f16973b = translateController;
        this.f16974c = j10;
    }

    @Override
    public final void run() {
        switch (this.f16972a) {
            case 0:
                TranslateController.G(this.f16973b, this.f16974c);
                return;
            default:
                TranslateController.p(this.f16973b, this.f16974c);
                return;
        }
    }
}

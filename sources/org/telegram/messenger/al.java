package org.telegram.messenger;
public final class al implements Runnable {
    public final int f17368a;
    public final TranslateController f17369b;
    public final long f17370c;

    public al(TranslateController translateController, long j3, int i10) {
        this.f17368a = i10;
        this.f17369b = translateController;
        this.f17370c = j3;
    }

    @Override
    public final void run() {
        switch (this.f17368a) {
            case 0:
                TranslateController.G(this.f17369b, this.f17370c);
                return;
            default:
                TranslateController.p(this.f17369b, this.f17370c);
                return;
        }
    }
}

package org.telegram.messenger;
public final class al implements Runnable {
    public final int f17207a;
    public final TranslateController f17208b;
    public final long f17209c;

    public al(TranslateController translateController, long j3, int i10) {
        this.f17207a = i10;
        this.f17208b = translateController;
        this.f17209c = j3;
    }

    @Override
    public final void run() {
        switch (this.f17207a) {
            case 0:
                TranslateController.G(this.f17208b, this.f17209c);
                return;
            default:
                TranslateController.p(this.f17208b, this.f17209c);
                return;
        }
    }
}

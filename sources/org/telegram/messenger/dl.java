package org.telegram.messenger;
public final class dl implements Runnable {
    public final int f19933a;
    public final TranslateController f19934b;
    public final long f19935c;

    public dl(TranslateController translateController, long j10, int i10) {
        this.f19933a = i10;
        this.f19934b = translateController;
        this.f19935c = j10;
    }

    @Override
    public final void run() {
        switch (this.f19933a) {
            case 0:
                TranslateController.G(this.f19934b, this.f19935c);
                return;
            default:
                TranslateController.p(this.f19934b, this.f19935c);
                return;
        }
    }
}

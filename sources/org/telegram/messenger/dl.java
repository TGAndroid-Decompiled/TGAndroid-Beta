package org.telegram.messenger;
public final class dl implements Runnable {
    public final int f18524a;
    public final TranslateController f18525b;
    public final long f18526c;

    public dl(TranslateController translateController, long j10, int i10) {
        this.f18524a = i10;
        this.f18525b = translateController;
        this.f18526c = j10;
    }

    @Override
    public final void run() {
        switch (this.f18524a) {
            case 0:
                TranslateController.G(this.f18525b, this.f18526c);
                return;
            default:
                TranslateController.p(this.f18525b, this.f18526c);
                return;
        }
    }
}

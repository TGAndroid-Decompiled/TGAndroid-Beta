package org.telegram.messenger;
public final class dl implements Runnable {
    public final int f17086a;
    public final TranslateController f17087b;
    public final long f17088c;

    public dl(TranslateController translateController, long j10, int i10) {
        this.f17086a = i10;
        this.f17087b = translateController;
        this.f17088c = j10;
    }

    @Override
    public final void run() {
        switch (this.f17086a) {
            case 0:
                TranslateController.G(this.f17087b, this.f17088c);
                return;
            default:
                TranslateController.p(this.f17087b, this.f17088c);
                return;
        }
    }
}

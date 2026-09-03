package org.telegram.messenger;
public final class dl implements Runnable {
    public final int f18526a;
    public final TranslateController f18527b;
    public final long f18528c;

    public dl(TranslateController translateController, long j10, int i10) {
        this.f18526a = i10;
        this.f18527b = translateController;
        this.f18528c = j10;
    }

    @Override
    public final void run() {
        switch (this.f18526a) {
            case 0:
                TranslateController.G(this.f18527b, this.f18528c);
                return;
            default:
                TranslateController.p(this.f18527b, this.f18528c);
                return;
        }
    }
}

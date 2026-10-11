package org.telegram.messenger;
public final class bl implements Runnable {
    public final int f17498a;
    public final TranslateController f17499b;
    public final long f17500c;

    public bl(TranslateController translateController, long j3, int i10) {
        this.f17498a = i10;
        this.f17499b = translateController;
        this.f17500c = j3;
    }

    @Override
    public final void run() {
        switch (this.f17498a) {
            case 0:
                TranslateController.G(this.f17499b, this.f17500c);
                return;
            default:
                TranslateController.p(this.f17499b, this.f17500c);
                return;
        }
    }
}

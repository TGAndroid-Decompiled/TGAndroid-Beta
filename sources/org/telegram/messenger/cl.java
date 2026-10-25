package org.telegram.messenger;
public final class cl implements Runnable {
    public final int f19849a;
    public final TranslateController f19850b;
    public final long f19851c;

    public cl(TranslateController translateController, long j10, int i10) {
        this.f19849a = i10;
        this.f19850b = translateController;
        this.f19851c = j10;
    }

    @Override
    public final void run() {
        switch (this.f19849a) {
            case 0:
                TranslateController.G(this.f19850b, this.f19851c);
                return;
            default:
                TranslateController.p(this.f19850b, this.f19851c);
                return;
        }
    }
}

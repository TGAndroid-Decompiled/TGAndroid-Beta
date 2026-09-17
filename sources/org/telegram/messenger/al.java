package org.telegram.messenger;
public final class al implements Runnable {
    public final int f17234a;
    public final TranslateController f17235b;
    public final long f17236c;

    public al(TranslateController translateController, long j3, int i10) {
        this.f17234a = i10;
        this.f17235b = translateController;
        this.f17236c = j3;
    }

    @Override
    public final void run() {
        switch (this.f17234a) {
            case 0:
                TranslateController.G(this.f17235b, this.f17236c);
                return;
            default:
                TranslateController.p(this.f17235b, this.f17236c);
                return;
        }
    }
}

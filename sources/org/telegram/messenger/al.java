package org.telegram.messenger;
public final class al implements Runnable {
    public final int f15931a;
    public final TranslateController f15932b;
    public final long f15933c;

    public al(TranslateController translateController, long j3, int i10) {
        this.f15931a = i10;
        this.f15932b = translateController;
        this.f15933c = j3;
    }

    @Override
    public final void run() {
        switch (this.f15931a) {
            case 0:
                TranslateController.G(this.f15932b, this.f15933c);
                return;
            default:
                TranslateController.p(this.f15932b, this.f15933c);
                return;
        }
    }
}

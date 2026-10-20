package org.telegram.messenger;
public final class b7 implements Runnable {
    public final int f17933a;
    public final MediaDataController f17934b;
    public final String f17935c;

    public b7(MediaDataController mediaDataController, String str, int i10) {
        this.f17933a = i10;
        this.f17934b = mediaDataController;
        this.f17935c = str;
    }

    @Override
    public final void run() {
        switch (this.f17933a) {
            case 0:
                MediaDataController.h3(this.f17934b, this.f17935c);
                return;
            case 1:
                MediaDataController.x1(this.f17934b, this.f17935c);
                return;
            case 2:
                MediaDataController.Y0(this.f17934b, this.f17935c);
                return;
            case 3:
                MediaDataController.e1(this.f17934b, this.f17935c);
                return;
            case 4:
                MediaDataController.E(this.f17934b, this.f17935c);
                return;
            case 5:
                MediaDataController.U0(this.f17934b, this.f17935c);
                return;
            default:
                MediaDataController.l(this.f17934b, this.f17935c);
                return;
        }
    }
}

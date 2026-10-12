package org.telegram.messenger;
public final class a7 implements Runnable {
    public final int f17048a;
    public final MediaDataController f17049b;
    public final String f17050c;

    public a7(MediaDataController mediaDataController, String str, int i10) {
        this.f17048a = i10;
        this.f17049b = mediaDataController;
        this.f17050c = str;
    }

    @Override
    public final void run() {
        switch (this.f17048a) {
            case 0:
                MediaDataController.h3(this.f17049b, this.f17050c);
                return;
            case 1:
                MediaDataController.x1(this.f17049b, this.f17050c);
                return;
            case 2:
                MediaDataController.Y0(this.f17049b, this.f17050c);
                return;
            case 3:
                MediaDataController.e1(this.f17049b, this.f17050c);
                return;
            case 4:
                MediaDataController.E(this.f17049b, this.f17050c);
                return;
            case 5:
                MediaDataController.U0(this.f17049b, this.f17050c);
                return;
            default:
                MediaDataController.l(this.f17049b, this.f17050c);
                return;
        }
    }
}

package org.telegram.messenger;
public final class a7 implements Runnable {
    public final int f17047a;
    public final MediaDataController f17048b;
    public final String f17049c;

    public a7(MediaDataController mediaDataController, String str, int i10) {
        this.f17047a = i10;
        this.f17048b = mediaDataController;
        this.f17049c = str;
    }

    @Override
    public final void run() {
        switch (this.f17047a) {
            case 0:
                MediaDataController.h3(this.f17048b, this.f17049c);
                return;
            case 1:
                MediaDataController.x1(this.f17048b, this.f17049c);
                return;
            case 2:
                MediaDataController.Y0(this.f17048b, this.f17049c);
                return;
            case 3:
                MediaDataController.e1(this.f17048b, this.f17049c);
                return;
            case 4:
                MediaDataController.E(this.f17048b, this.f17049c);
                return;
            case 5:
                MediaDataController.U0(this.f17048b, this.f17049c);
                return;
            default:
                MediaDataController.l(this.f17048b, this.f17049c);
                return;
        }
    }
}

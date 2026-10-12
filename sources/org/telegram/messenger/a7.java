package org.telegram.messenger;
public final class a7 implements Runnable {
    public final int f16751a;
    public final MediaDataController f16752b;
    public final String f16753c;

    public a7(MediaDataController mediaDataController, String str, int i10) {
        this.f16751a = i10;
        this.f16752b = mediaDataController;
        this.f16753c = str;
    }

    @Override
    public final void run() {
        switch (this.f16751a) {
            case 0:
                MediaDataController.h3(this.f16752b, this.f16753c);
                return;
            case 1:
                MediaDataController.x1(this.f16752b, this.f16753c);
                return;
            case 2:
                MediaDataController.Y0(this.f16752b, this.f16753c);
                return;
            case 3:
                MediaDataController.e1(this.f16752b, this.f16753c);
                return;
            case 4:
                MediaDataController.E(this.f16752b, this.f16753c);
                return;
            case 5:
                MediaDataController.U0(this.f16752b, this.f16753c);
                return;
            default:
                MediaDataController.l(this.f16752b, this.f16753c);
                return;
        }
    }
}

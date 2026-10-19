package org.telegram.messenger;
public final class a7 implements Runnable {
    public final int f17846a;
    public final MediaDataController f17847b;
    public final String f17848c;

    public a7(MediaDataController mediaDataController, String str, int i10) {
        this.f17846a = i10;
        this.f17847b = mediaDataController;
        this.f17848c = str;
    }

    @Override
    public final void run() {
        switch (this.f17846a) {
            case 0:
                MediaDataController.h3(this.f17847b, this.f17848c);
                return;
            case 1:
                MediaDataController.x1(this.f17847b, this.f17848c);
                return;
            case 2:
                MediaDataController.Y0(this.f17847b, this.f17848c);
                return;
            case 3:
                MediaDataController.e1(this.f17847b, this.f17848c);
                return;
            case 4:
                MediaDataController.E(this.f17847b, this.f17848c);
                return;
            case 5:
                MediaDataController.U0(this.f17847b, this.f17848c);
                return;
            default:
                MediaDataController.l(this.f17847b, this.f17848c);
                return;
        }
    }
}

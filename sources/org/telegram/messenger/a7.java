package org.telegram.messenger;
public final class a7 implements Runnable {
    public final int f16445a;
    public final MediaDataController f16446b;
    public final String f16447c;

    public a7(MediaDataController mediaDataController, String str, int i10) {
        this.f16445a = i10;
        this.f16446b = mediaDataController;
        this.f16447c = str;
    }

    @Override
    public final void run() {
        switch (this.f16445a) {
            case 0:
                MediaDataController.h3(this.f16446b, this.f16447c);
                return;
            case 1:
                MediaDataController.x1(this.f16446b, this.f16447c);
                return;
            case 2:
                MediaDataController.Y0(this.f16446b, this.f16447c);
                return;
            case 3:
                MediaDataController.e1(this.f16446b, this.f16447c);
                return;
            case 4:
                MediaDataController.E(this.f16446b, this.f16447c);
                return;
            case 5:
                MediaDataController.U0(this.f16446b, this.f16447c);
                return;
            default:
                MediaDataController.l(this.f16446b, this.f16447c);
                return;
        }
    }
}

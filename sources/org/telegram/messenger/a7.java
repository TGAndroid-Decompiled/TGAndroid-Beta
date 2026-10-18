package org.telegram.messenger;
public final class a7 implements Runnable {
    public final int f17843a;
    public final MediaDataController f17844b;
    public final String f17845c;

    public a7(MediaDataController mediaDataController, String str, int i10) {
        this.f17843a = i10;
        this.f17844b = mediaDataController;
        this.f17845c = str;
    }

    @Override
    public final void run() {
        switch (this.f17843a) {
            case 0:
                MediaDataController.h3(this.f17844b, this.f17845c);
                return;
            case 1:
                MediaDataController.x1(this.f17844b, this.f17845c);
                return;
            case 2:
                MediaDataController.Y0(this.f17844b, this.f17845c);
                return;
            case 3:
                MediaDataController.e1(this.f17844b, this.f17845c);
                return;
            case 4:
                MediaDataController.E(this.f17844b, this.f17845c);
                return;
            case 5:
                MediaDataController.U0(this.f17844b, this.f17845c);
                return;
            default:
                MediaDataController.l(this.f17844b, this.f17845c);
                return;
        }
    }
}

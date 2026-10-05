package org.telegram.messenger;
public final class a8 implements Runnable {
    public final int f17319a;
    public final MediaDataController f17320b;
    public final int f17321c;

    public a8(MediaDataController mediaDataController, int i10, int i11) {
        this.f17319a = i11;
        this.f17320b = mediaDataController;
        this.f17321c = i10;
    }

    @Override
    public final void run() {
        switch (this.f17319a) {
            case 0:
                MediaDataController.O1(this.f17320b, this.f17321c);
                return;
            default:
                MediaDataController.e(this.f17320b, this.f17321c);
                return;
        }
    }
}

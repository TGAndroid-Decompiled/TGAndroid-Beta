package org.telegram.messenger;
public final class a8 implements Runnable {
    public final int f17345a;
    public final MediaDataController f17346b;
    public final int f17347c;

    public a8(MediaDataController mediaDataController, int i10, int i11) {
        this.f17345a = i11;
        this.f17346b = mediaDataController;
        this.f17347c = i10;
    }

    @Override
    public final void run() {
        switch (this.f17345a) {
            case 0:
                MediaDataController.O1(this.f17346b, this.f17347c);
                return;
            default:
                MediaDataController.e(this.f17346b, this.f17347c);
                return;
        }
    }
}

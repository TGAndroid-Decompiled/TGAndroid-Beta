package org.telegram.messenger;
public final class a8 implements Runnable {
    public final int f17309a;
    public final MediaDataController f17310b;
    public final int f17311c;

    public a8(MediaDataController mediaDataController, int i10, int i11) {
        this.f17309a = i11;
        this.f17310b = mediaDataController;
        this.f17311c = i10;
    }

    @Override
    public final void run() {
        switch (this.f17309a) {
            case 0:
                MediaDataController.O1(this.f17310b, this.f17311c);
                return;
            default:
                MediaDataController.e(this.f17310b, this.f17311c);
                return;
        }
    }
}

package org.telegram.messenger;
public final class a8 implements Runnable {
    public final int f17310a;
    public final MediaDataController f17311b;
    public final int f17312c;

    public a8(MediaDataController mediaDataController, int i10, int i11) {
        this.f17310a = i11;
        this.f17311b = mediaDataController;
        this.f17312c = i10;
    }

    @Override
    public final void run() {
        switch (this.f17310a) {
            case 0:
                MediaDataController.O1(this.f17311b, this.f17312c);
                return;
            default:
                MediaDataController.e(this.f17311b, this.f17312c);
                return;
        }
    }
}

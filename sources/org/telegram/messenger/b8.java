package org.telegram.messenger;
public final class b8 implements Runnable {
    public final int f17924a;
    public final MediaDataController f17925b;
    public final int f17926c;

    public b8(MediaDataController mediaDataController, int i10, int i11) {
        this.f17924a = i11;
        this.f17925b = mediaDataController;
        this.f17926c = i10;
    }

    @Override
    public final void run() {
        switch (this.f17924a) {
            case 0:
                MediaDataController.O1(this.f17925b, this.f17926c);
                return;
            default:
                MediaDataController.e(this.f17925b, this.f17926c);
                return;
        }
    }
}

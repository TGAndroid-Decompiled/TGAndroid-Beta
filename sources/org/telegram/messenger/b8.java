package org.telegram.messenger;
public final class b8 implements Runnable {
    public final int f17937a;
    public final MediaDataController f17938b;
    public final int f17939c;

    public b8(MediaDataController mediaDataController, int i10, int i11) {
        this.f17937a = i11;
        this.f17938b = mediaDataController;
        this.f17939c = i10;
    }

    @Override
    public final void run() {
        switch (this.f17937a) {
            case 0:
                MediaDataController.O1(this.f17938b, this.f17939c);
                return;
            default:
                MediaDataController.e(this.f17938b, this.f17939c);
                return;
        }
    }
}

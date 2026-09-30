package org.telegram.messenger;
public final class a8 implements Runnable {
    public final int f15900a;
    public final MediaDataController f15901b;
    public final int f15902c;

    public a8(MediaDataController mediaDataController, int i10, int i11) {
        this.f15900a = i11;
        this.f15901b = mediaDataController;
        this.f15902c = i10;
    }

    @Override
    public final void run() {
        switch (this.f15900a) {
            case 0:
                MediaDataController.O1(this.f15901b, this.f15902c);
                return;
            default:
                MediaDataController.e(this.f15901b, this.f15902c);
                return;
        }
    }
}

package org.telegram.messenger;
public final class a8 implements Runnable {
    public final int f15884a;
    public final MediaDataController f15885b;
    public final int f15886c;

    public a8(MediaDataController mediaDataController, int i10, int i11) {
        this.f15884a = i11;
        this.f15885b = mediaDataController;
        this.f15886c = i10;
    }

    @Override
    public final void run() {
        switch (this.f15884a) {
            case 0:
                MediaDataController.O1(this.f15885b, this.f15886c);
                return;
            default:
                MediaDataController.e(this.f15885b, this.f15886c);
                return;
        }
    }
}

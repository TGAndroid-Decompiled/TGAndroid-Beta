package org.telegram.messenger;
public final class a8 implements Runnable {
    public final int f15883a;
    public final MediaDataController f15884b;
    public final int f15885c;

    public a8(MediaDataController mediaDataController, int i10, int i11) {
        this.f15883a = i11;
        this.f15884b = mediaDataController;
        this.f15885c = i10;
    }

    @Override
    public final void run() {
        switch (this.f15883a) {
            case 0:
                MediaDataController.O1(this.f15884b, this.f15885c);
                return;
            default:
                MediaDataController.e(this.f15884b, this.f15885c);
                return;
        }
    }
}

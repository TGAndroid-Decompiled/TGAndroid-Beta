package org.telegram.messenger;
public final class b8 implements Runnable {
    public final int f17940a;
    public final MediaDataController f17941b;
    public final int f17942c;

    public b8(MediaDataController mediaDataController, int i10, int i11) {
        this.f17940a = i11;
        this.f17941b = mediaDataController;
        this.f17942c = i10;
    }

    @Override
    public final void run() {
        switch (this.f17940a) {
            case 0:
                MediaDataController.O1(this.f17941b, this.f17942c);
                return;
            default:
                MediaDataController.e(this.f17941b, this.f17942c);
                return;
        }
    }
}

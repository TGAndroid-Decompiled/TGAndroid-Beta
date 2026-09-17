package org.telegram.messenger;
public final class a8 implements Runnable {
    public final int f17169a;
    public final MediaDataController f17170b;
    public final String f17171c;

    public a8(MediaDataController mediaDataController, String str, int i10) {
        this.f17169a = i10;
        this.f17170b = mediaDataController;
        this.f17171c = str;
    }

    @Override
    public final void run() {
        switch (this.f17169a) {
            case 0:
                MediaDataController.F2(this.f17170b, this.f17171c);
                return;
            case 1:
                MediaDataController.u3(this.f17170b, this.f17171c);
                return;
            case 2:
                MediaDataController.k3(this.f17170b, this.f17171c);
                return;
            case 3:
                MediaDataController.S1(this.f17170b, this.f17171c);
                return;
            case 4:
                MediaDataController.o(this.f17170b, this.f17171c);
                return;
            case 5:
                MediaDataController.m1(this.f17170b, this.f17171c);
                return;
            default:
                MediaDataController.q1(this.f17170b, this.f17171c);
                return;
        }
    }
}

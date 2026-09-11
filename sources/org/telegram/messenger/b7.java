package org.telegram.messenger;
public final class b7 implements Runnable {
    public final int f17230a;
    public final MediaDataController f17231b;
    public final long f17232c;

    public b7(MediaDataController mediaDataController, long j3, int i10) {
        this.f17230a = i10;
        this.f17231b = mediaDataController;
        this.f17232c = j3;
    }

    @Override
    public final void run() {
        switch (this.f17230a) {
            case 0:
                MediaDataController.Q0(this.f17231b, this.f17232c);
                return;
            case 1:
                MediaDataController.P2(this.f17231b, this.f17232c);
                return;
            default:
                MediaDataController.E2(this.f17231b, this.f17232c);
                return;
        }
    }
}

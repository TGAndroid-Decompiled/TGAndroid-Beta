package org.telegram.messenger;
public final class b7 implements Runnable {
    public final int f17257a;
    public final MediaDataController f17258b;
    public final long f17259c;

    public b7(MediaDataController mediaDataController, long j3, int i10) {
        this.f17257a = i10;
        this.f17258b = mediaDataController;
        this.f17259c = j3;
    }

    @Override
    public final void run() {
        switch (this.f17257a) {
            case 0:
                MediaDataController.Q0(this.f17258b, this.f17259c);
                return;
            case 1:
                MediaDataController.P2(this.f17258b, this.f17259c);
                return;
            default:
                MediaDataController.E2(this.f17258b, this.f17259c);
                return;
        }
    }
}

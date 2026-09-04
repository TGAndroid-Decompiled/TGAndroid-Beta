package org.telegram.messenger;
public final class c7 implements Runnable {
    public final int f17312a;
    public final MediaDataController f17313b;
    public final long f17314c;

    public c7(MediaDataController mediaDataController, long j3, int i10) {
        this.f17312a = i10;
        this.f17313b = mediaDataController;
        this.f17314c = j3;
    }

    @Override
    public final void run() {
        switch (this.f17312a) {
            case 0:
                MediaDataController.Q0(this.f17313b, this.f17314c);
                return;
            case 1:
                MediaDataController.P2(this.f17313b, this.f17314c);
                return;
            default:
                MediaDataController.E2(this.f17313b, this.f17314c);
                return;
        }
    }
}

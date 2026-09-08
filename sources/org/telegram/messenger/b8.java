package org.telegram.messenger;
public final class b8 implements Runnable {
    public final int f17246a;
    public final MediaDataController f17247b;
    public final String f17248c;

    public b8(MediaDataController mediaDataController, String str, int i10) {
        this.f17246a = i10;
        this.f17247b = mediaDataController;
        this.f17248c = str;
    }

    @Override
    public final void run() {
        switch (this.f17246a) {
            case 0:
                MediaDataController.F2(this.f17247b, this.f17248c);
                return;
            case 1:
                MediaDataController.u3(this.f17247b, this.f17248c);
                return;
            case 2:
                MediaDataController.k3(this.f17247b, this.f17248c);
                return;
            case 3:
                MediaDataController.S1(this.f17247b, this.f17248c);
                return;
            case 4:
                MediaDataController.o(this.f17247b, this.f17248c);
                return;
            case 5:
                MediaDataController.m1(this.f17247b, this.f17248c);
                return;
            default:
                MediaDataController.q1(this.f17247b, this.f17248c);
                return;
        }
    }
}

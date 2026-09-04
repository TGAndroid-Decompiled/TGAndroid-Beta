package org.telegram.messenger;
public final class b8 implements Runnable {
    public final int f17219a;
    public final MediaDataController f17220b;
    public final String f17221c;

    public b8(MediaDataController mediaDataController, String str, int i10) {
        this.f17219a = i10;
        this.f17220b = mediaDataController;
        this.f17221c = str;
    }

    @Override
    public final void run() {
        switch (this.f17219a) {
            case 0:
                MediaDataController.F2(this.f17220b, this.f17221c);
                return;
            case 1:
                MediaDataController.u3(this.f17220b, this.f17221c);
                return;
            case 2:
                MediaDataController.k3(this.f17220b, this.f17221c);
                return;
            case 3:
                MediaDataController.S1(this.f17220b, this.f17221c);
                return;
            case 4:
                MediaDataController.o(this.f17220b, this.f17221c);
                return;
            case 5:
                MediaDataController.m1(this.f17220b, this.f17221c);
                return;
            default:
                MediaDataController.q1(this.f17220b, this.f17221c);
                return;
        }
    }
}

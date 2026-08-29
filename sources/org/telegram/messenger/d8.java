package org.telegram.messenger;
public final class d8 implements Runnable {
    public final int f20009a;
    public final MediaDataController f20010b;
    public final String f20011c;

    public d8(MediaDataController mediaDataController, String str, int i10) {
        this.f20009a = i10;
        this.f20010b = mediaDataController;
        this.f20011c = str;
    }

    @Override
    public final void run() {
        switch (this.f20009a) {
            case 0:
                MediaDataController.F2(this.f20010b, this.f20011c);
                return;
            case 1:
                MediaDataController.u3(this.f20010b, this.f20011c);
                return;
            case 2:
                MediaDataController.k3(this.f20010b, this.f20011c);
                return;
            case 3:
                MediaDataController.S1(this.f20010b, this.f20011c);
                return;
            case 4:
                MediaDataController.o(this.f20010b, this.f20011c);
                return;
            case 5:
                MediaDataController.m1(this.f20010b, this.f20011c);
                return;
            default:
                MediaDataController.q1(this.f20010b, this.f20011c);
                return;
        }
    }
}

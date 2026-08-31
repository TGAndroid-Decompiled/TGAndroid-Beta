package org.telegram.messenger;
public final class e8 implements Runnable {
    public final int f18551a;
    public final MediaDataController f18552b;
    public final String f18553c;

    public e8(MediaDataController mediaDataController, String str, int i10) {
        this.f18551a = i10;
        this.f18552b = mediaDataController;
        this.f18553c = str;
    }

    @Override
    public final void run() {
        switch (this.f18551a) {
            case 0:
                MediaDataController.F2(this.f18552b, this.f18553c);
                return;
            case 1:
                MediaDataController.u3(this.f18552b, this.f18553c);
                return;
            case 2:
                MediaDataController.k3(this.f18552b, this.f18553c);
                return;
            case 3:
                MediaDataController.S1(this.f18552b, this.f18553c);
                return;
            case 4:
                MediaDataController.o(this.f18552b, this.f18553c);
                return;
            case 5:
                MediaDataController.m1(this.f18552b, this.f18553c);
                return;
            default:
                MediaDataController.q1(this.f18552b, this.f18553c);
                return;
        }
    }
}

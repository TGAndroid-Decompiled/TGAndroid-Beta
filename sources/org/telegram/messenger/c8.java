package org.telegram.messenger;
public final class c8 implements Runnable {
    public final int f18023a;
    public final MediaDataController f18024b;
    public final int f18025c;

    public c8(MediaDataController mediaDataController, int i10, int i11) {
        this.f18023a = i11;
        this.f18024b = mediaDataController;
        this.f18025c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18023a) {
            case 0:
                MediaDataController.O1(this.f18024b, this.f18025c);
                return;
            default:
                MediaDataController.e(this.f18024b, this.f18025c);
                return;
        }
    }
}

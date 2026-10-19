package org.telegram.messenger;
public final class c8 implements Runnable {
    public final int f18026a;
    public final MediaDataController f18027b;
    public final int f18028c;

    public c8(MediaDataController mediaDataController, int i10, int i11) {
        this.f18026a = i11;
        this.f18027b = mediaDataController;
        this.f18028c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18026a) {
            case 0:
                MediaDataController.O1(this.f18027b, this.f18028c);
                return;
            default:
                MediaDataController.e(this.f18027b, this.f18028c);
                return;
        }
    }
}

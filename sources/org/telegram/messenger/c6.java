package org.telegram.messenger;
public final class c6 implements Runnable {
    public final int f18033a;
    public final MediaController f18034b;
    public final int f18035c;

    public c6(MediaController mediaController, int i10, int i11) {
        this.f18033a = i11;
        this.f18034b = mediaController;
        this.f18035c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18033a) {
            case 0:
                MediaController.s(this.f18034b, this.f18035c);
                return;
            default:
                MediaController.f0(this.f18034b, this.f18035c);
                return;
        }
    }
}
